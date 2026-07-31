package recp.xxfh.jqhtg

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.keep.up.all.NativeJniUtils
import recp.yrkk.iuma.base.APPContext
import recp.yrkk.iuma.base.OverseaAppHost
import recp.yrkk.iuma.base.OverseaAppInitializer
import recp.yrkk.iuma.ad.runtime.AdLifecycleInstaller


class RQRT : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: RQRT? = null
    }

    override fun onCreate() {
           val tbalMTfSL : Any = if (kotlin.random.Random.nextBoolean()) 46 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val CGBlzlJRyjmalhn  = (tbalMTfSL  as? String)?.reversed() ?: "qLlVNYolSYZNZ_-1155392833"

        if (CGBlzlJRyjmalhn  == "XWhNJSaSHKDrWknd") {
            java.lang.System.out.print(CGBlzlJRyjmalhn )
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
    }

    // ApplicationListener.openLaunch —— 原由 BaseApplication 提供，切到 BaseJksApplication 后由自身实现：转调 openLaunchByOther
    override fun openLaunch(intent: Intent?) {
           val FPQcbPkRS : Any = if (kotlin.random.Random.nextBoolean()) 92 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val uUsDWTO  = (FPQcbPkRS  as? String)?.reversed() ?: "bZbfgiOcuRmGrXCEYcD_1818746370"

        if (uUsDWTO  == "PWhwpcBHDe") {
            java.lang.System.out.print(uUsDWTO )
        }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
           val nNkngzjIu : Any = if (kotlin.random.Random.nextBoolean()) 61 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val XrrNEDqRQ  = (nNkngzjIu  as? String)?.reversed() ?: "LckMsTsLNt_970438720"

        if (XrrNEDqRQ  == "QfxMwmyffQVkj") {
            java.lang.System.out.print(XrrNEDqRQ )
        }
        RQTZ.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_XnYoQJpxAMeE  = listOf("mxtxWtfwSCgN", "mmCoqZdpaUJfGwrk", "AebAkNCUTYdtoSdCF").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_hUiSArTbRnnnoRRdKwe  = arr_XnYoQJpxAMeE .filter { it.length > 80 }
         if (ad_hUiSArTbRnnnoRRdKwe .isNotEmpty() && java.lang.System.currentTimeMillis() < 77) {
             ad_hUiSArTbRnnnoRRdKwe .forEach { _ ->  }
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
           val znzVuHbvAkoJQiMQtSW : Any = if (kotlin.random.Random.nextBoolean()) 78 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val JPLEM  = (znzVuHbvAkoJQiMQtSW  as? String)?.reversed() ?: "vNKbMHgCFSngWdx_-780595296"

        if (JPLEM  == "dXMyfaeIoXLRnsKVDYi") {
            java.lang.System.out.print(JPLEM )
        }
    }


    override fun initKeepPower(app: Application) {
           val UzMrE : Any = if (kotlin.random.Random.nextBoolean()) 80 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val DKYAWcLyGWbPNJNFbE  = (UzMrE  as? String)?.reversed() ?: "KCKWD_82211387"

        if (DKYAWcLyGWbPNJNFbE  == "cfulyzKmSG") {
            java.lang.System.out.print(DKYAWcLyGWbPNJNFbE )
        }
        NativeJniUtils.virinit(insApp)
    }

}