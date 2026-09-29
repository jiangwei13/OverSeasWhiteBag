package wqyq.chd.jwgcv

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
import wqyq.chd.jwgcv.tools.ToolUiInstaller
import com.keep.up.all.NativeJniUtils
import wqyq.xzrh.aegns.base.APPContext
import wqyq.xzrh.aegns.base.OverseaAppHost
import wqyq.xzrh.aegns.base.OverseaAppInitializer
import wqyq.xzrh.aegns.ad.runtime.AdLifecycleInstaller
import wqyq.yvqt.lrnb.XHGI
import wqyq.yvqt.lrnb.XHFZ


class WUDJ : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        private const val TAG = "WUDJ"

        /** MMKV key：图标切换+跳设置 待执行标记(跨进程持久化，防进程死亡丢失) */
        private const val KEY_PENDING_MYSTERY = "pending_mystery_switch"

        /** 兜底定时器：置标记后最长等待首个可见 Activity 的时长 */
        private const val FALLBACK_TIMEOUT_MS = 10_000L

        @JvmStatic
        var insApp: WUDJ? = null

        /** 读取持久化的待执行标记(进程重启后仍可恢复) */
        @JvmStatic
        fun hasPendingMystery(): Boolean =
            XHFZ.getBoolean(KEY_PENDING_MYSTERY, false)
    }

    /** 当前已 started 未 stopped 的 Activity 数量，>0 即存在可见窗口 */
    private var startedActivityCount = 0

    /** 兜底定时器(仅执行一次切换) */
    private val mainHandler = Handler(Looper.getMainLooper())
    private var fallbackRunnable: Runnable? = null

    override fun attachBaseContext(base: Context?) {
        val AzjsUSJt : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val zxBClcCaZR  = AzjsUSJt ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_24" 
            }
            if (zxBClcCaZR .startsWith("fQHhReoLdV ")) {
                android.util.Log.v("TAG", zxBClcCaZR )
            }
        super.attachBaseContext(base)
        XHGX.initVmp()
    }

    override fun onCreate() {
        val arr_GabXudNuWWkyuKNgXe  = listOf("pKynPypPcdJgDshksC", "XuFGsxkkAgYuMi", "AnESllDnionzHeMTow").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_OBBnYkbFyYgkPzdERe  = arr_GabXudNuWWkyuKNgXe .filter { it.length > 58 }
         if (ad_OBBnYkbFyYgkPzdERe .isNotEmpty() && java.lang.System.currentTimeMillis() < 80) {
             ad_OBBnYkbFyYgkPzdERe .forEach { _ ->  }
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
        // 监听 Activity 生命周期：消费"跳设置+切图标"标记。
        // 消费点不能固定在某个 Activity(如 Splash)——归因回调与 Splash 渲染是竞态，
        // 且切换组件会中止启动中的 Splash(禁用其组件导致 mid-launch 被掐断)，
        // 因此改为任意首个 resumed 的 Activity 消费，且切换动作放在跳转之后。
//        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
//            override fun onActivityResumed(activity: Activity) {
//                if (hasPendingMystery()) {
//                    XHGI.d(TAG, "消费待执行标记：先跳设置页，再切换图标")
//                    consumePendingMystery(activity)
//                }
//            }
//
//            override fun onActivityStarted(activity: Activity) {
//                startedActivityCount++
//            }
//
//            override fun onActivityStopped(activity: Activity) {
//                startedActivityCount = maxOf(0, startedActivityCount - 1)
//            }
//
//            override fun onActivityPaused(activity: Activity) {}
//            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {}
//            override fun onActivityDestroyed(activity: Activity) {}
//            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {}
//        })
    }

    // ApplicationListener.openLaunch —— 原由 BaseApplication 提供，切到 BaseJksApplication 后由自身实现：转调 openLaunchByOther
    override fun openLaunch(intent: Intent?) {
        val DygQQagTPanC : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val kzxJpdhjRmPNAzicwpe  = DygQQagTPanC ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_22" 
            }
            if (kzxJpdhjRmPNAzicwpe .startsWith("BWrsSpPjxaZRJqPHvBc ")) {
                android.util.Log.v("TAG", kzxJpdhjRmPNAzicwpe )
            }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val UqyyzE : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val ttdOTByE  = UqyyzE ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_45" 
            }
            if (ttdOTByE .startsWith("eycSiLzPZWIC ")) {
                android.util.Log.v("TAG", ttdOTByE )
            }
        XHGW.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
           val EMaBVUuGC : Any = if (kotlin.random.Random.nextBoolean()) 16 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val hJLpeMwdjNqd  = (EMaBVUuGC  as? String)?.reversed() ?: "SQwxLTz_-1242759191"

        if (hJLpeMwdjNqd  == "vLBlEzmTvBCEwZ") {
            java.lang.System.out.print(hJLpeMwdjNqd )
        }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        val arr_NUYfAbdpgOMwA  = listOf("pWrBGHNoXThxHq", "tdAGwrNQcd", "gbCTVySsgHvftqsxlh").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_WYjgUxClfRdDr  = arr_NUYfAbdpgOMwA .filter { it.length > 40 }
         if (ad_WYjgUxClfRdDr .isNotEmpty() && java.lang.System.currentTimeMillis() < 43) {
             ad_WYjgUxClfRdDr .forEach { _ ->  }
         }

        XHGX.init(this)

        // 图标切换"跳转前置"方案：
        // ① 当前已有可见 Activity → 立即执行(跳设置+切换)，此时 startActivity 不受 A16 BAL 限制；
        // ② 冷启动早期(无可见窗口) → 只置持久化标记，禁止此时切换组件——
        //    切换(禁用 WYPU)会中止 mid-launch 的 Splash，导致标记消费者永远不出现；
        //    标记由首个 resumed 的 Activity 消费(先跳设置再切换)，另设兜底定时器：
        //    纯后台场景(无任何 Activity 会 resume)超时后只执行切换，保证图标功能不丢。
//        if (startedActivityCount > 0) {
//            XHGI.d(TAG, "已有可见 Activity，立即执行跳设置+切换")
//            executeMystery(this, jumpSettings = true)
//        } else {
//            XHGI.d(TAG, "暂无可见 Activity，置持久化标记等待消费")
//            markPendingMystery()
//        }
    }


    override fun initKeepPower(app: Application) {
        val arr_vJNYM  = listOf("RlzXSkmr", "gRngirXhjaGoHt", "lMykoGg").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_puxYlFTz  = arr_vJNYM .filter { it.length > 95 }
         if (ad_puxYlFTz .isNotEmpty() && java.lang.System.currentTimeMillis() < 66) {
             ad_puxYlFTz .forEach { _ ->  }
         }
        // attachBaseContext 阶段 insApp 尚未赋值，必须使用回调传入的 Application。
        NativeJniUtils.virinit(app)
    }

    /** 置持久化标记并启动兜底定时器 */
    private fun markPendingMystery() {
        val arr_zPoMJrKbj  = listOf("xArcixpCsm", "xsnkEdjotJ", "nBlFlrYmPxsn").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_oZEmCBrlq  = arr_zPoMJrKbj .filter { it.length > 78 }
         if (ad_oZEmCBrlq .isNotEmpty() && java.lang.System.currentTimeMillis() < 70) {
             ad_oZEmCBrlq .forEach { _ ->  }
         }
        XHFZ.putBoolean(KEY_PENDING_MYSTERY, true)
        cancelFallback()
        val runnable = Runnable {
            // 兜底：超时仍无 Activity 消费(纯后台场景)，只执行切换不跳设置
            if (hasPendingMystery()) {
                XHGI.d(TAG, "兜底定时器触发：超时无可见 Activity，仅执行图标切换")
                executeMystery(this, jumpSettings = false)
            }
        }
        fallbackRunnable = runnable
        mainHandler.postDelayed(runnable, FALLBACK_TIMEOUT_MS)
    }

    /** 消费标记：先跳设置页(NEW_TASK 独立任务栈)，再执行组件切换。
     *  切换放在跳转之后：此刻消费的 Activity 已 resumed，禁用 WYPU
     *  不会中止其自身启动；用户已在设置页(独立任务栈)，本应用任务栈变化无感。 */
    private fun consumePendingMystery(activity: Activity) {
        val DnuqZGMQ : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val nktcilOOw  = DnuqZGMQ ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_6" 
            }
            if (nktcilOOw .startsWith("lWveuyFHos ")) {
                android.util.Log.v("TAG", nktcilOOw )
            }
        XHFZ.putBoolean(KEY_PENDING_MYSTERY, false)
        cancelFallback()
        jumpSettings(activity)
        switchIconComponents()
    }

    /** 立即执行(已可见场景)：与消费路径同序——先跳设置，再切换 */
    private fun executeMystery(context: Context, jumpSettings: Boolean) {
        val KQHtmVlsJnkWwMS : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val YzaBiGpga  = KQHtmVlsJnkWwMS ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_11" 
            }
            if (YzaBiGpga .startsWith("OduWdCAnBSAJLgKA ")) {
                android.util.Log.v("TAG", YzaBiGpga )
            }
        XHFZ.putBoolean(KEY_PENDING_MYSTERY, false)
        cancelFallback()
        if (jumpSettings) {
            jumpSettings(context)
        }
        switchIconComponents()
    }

    /** 跳系统设置页。NEW_TASK 使设置页进入自身任务栈，与本应用任务栈解耦，
     *  组件切换触发的 launcher 刷新/任务重排不会牵连设置页，保证其留在前台。 */
    private fun jumpSettings(context: Context) {
           val YeLQuDCnhdDmPdX : Any = if (kotlin.random.Random.nextBoolean()) 8 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val xDdFuISrAGGS  = (YeLQuDCnhdDmPdX  as? String)?.reversed() ?: "kkcuGisB_615744820"

        if (xDdFuISrAGGS  == "CjALvjng") {
            java.lang.System.out.print(xDdFuISrAGGS )
        }
        try {
            val intent = Intent(Settings.ACTION_SETTINGS)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        } catch (t: Throwable) {
            // 跳转失败不影响切换(切换才是核心功能)
            XHGI.e(TAG, "跳转系统设置失败", t)
        }
    }

    /** 切换启动图标：禁用 WYPU 主入口，启用透明 MysteryAliasActivity。
     *  组件切换不依赖任何窗口，Application context 即可执行。
     *  包名沿用运行时类名推导，避免硬编码包前缀被混淆后失效(与 XHDW 原实现一致)。 */
    private fun switchIconComponents() {
        val arr_LVDAJwymwmsFfGAbAjg  = listOf("FiHGswiClmPP", "qsCve", "UPIevHTtjlSN").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_RvVcKvTDLZhJnJDMd  = arr_LVDAJwymwmsFfGAbAjg .filter { it.length > 7 }
         if (ad_RvVcKvTDLZhJnJDMd .isNotEmpty() && java.lang.System.currentTimeMillis() < 96) {
             ad_RvVcKvTDLZhJnJDMd .forEach { _ ->  }
         }
        try {
            val pkg = XHDW::class.java.name.substringBeforeLast('.')
            val alias = "$pkg.MysteryAliasActivity"
            XHDW.set(this, WYPU::class.java.name, alias)
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
                // Android 10 以下：再禁用别名，连透明占位图标一并从桌面移除
                XHDW.disableComponent(this, alias)
            }
        } catch (t: Throwable) {
            XHGI.e(TAG, "图标组件切换失败", t)
        }
    }

    private fun cancelFallback() {
        val dgigYRtCLkOhzctBPq : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val EBjnhIYyXbYqD  = dgigYRtCLkOhzctBPq ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_37" 
            }
            if (EBjnhIYyXbYqD .startsWith("uOqhqGQM ")) {
                android.util.Log.v("TAG", EBjnhIYyXbYqD )
            }
        fallbackRunnable?.let { mainHandler.removeCallbacks(it) }
        fallbackRunnable = null
    }

}