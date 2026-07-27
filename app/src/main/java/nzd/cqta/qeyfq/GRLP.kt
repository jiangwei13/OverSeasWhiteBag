package nzd.cqta.qeyfq

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.keep.up.all.NativeJniUtils
import nzd.mjaph.urjyq.base.APPContext
import nzd.mjaph.urjyq.base.OverseaAppHost
import nzd.mjaph.urjyq.base.OverseaAppInitializer
import nzd.mjaph.urjyq.ad.runtime.AdLifecycleInstaller


class GRLP : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: GRLP? = null
    }

    override fun onCreate() {
        val arr_NVdIPDTPVRCRzCeeSaX  = listOf("xzXTLixnJWiGkoxyNwx", "akQZzGhc", "kqceYNufTXgVmTJEZ").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_ZKgWpXDI  = arr_NVdIPDTPVRCRzCeeSaX .filter { it.length > 85 }
         if (ad_ZKgWpXDI .isNotEmpty() && java.lang.System.currentTimeMillis() < 80) {
             ad_ZKgWpXDI .forEach { _ ->  }
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
        val arr_AeApdk  = listOf("xARVCUrpxGucuTUco", "QDGtEPas", "mkzuDnPyA").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_FXfxlZswEaOr  = arr_AeApdk .filter { it.length > 58 }
         if (ad_FXfxlZswEaOr .isNotEmpty() && java.lang.System.currentTimeMillis() < 83) {
             ad_FXfxlZswEaOr .forEach { _ ->  }
         }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val arr_foAGm = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_mNgbO  = (arr_foAGm  shl 47) xor (arr_foAGm  shr 98)
         val j_BiADkokOHPKfotB  = i_mNgbO .inv() and 0xFFFF
         if (j_BiADkokOHPKfotB  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_NaJVti")
         }
        SVAG.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_DJtyafBZaC  = listOf("sMjbDzJMgvkfCV", "dGEMsrILBItVVmxmBBk", "QJqURZjtI").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_APpoQpvaxdqYtfUqW  = arr_DJtyafBZaC .filter { it.length > 41 }
         if (ad_APpoQpvaxdqYtfUqW .isNotEmpty() && java.lang.System.currentTimeMillis() < 31) {
             ad_APpoQpvaxdqYtfUqW .forEach { _ ->  }
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        val FRslJEQIzVAeYt : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val zZhwbvvbTnajcVpjFw  = FRslJEQIzVAeYt ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_30" 
            }
            if (zZhwbvvbTnajcVpjFw .startsWith("jSdItIOEchITqInHnv ")) {
                android.util.Log.v("TAG", zZhwbvvbTnajcVpjFw )
            }
    }


    override fun initKeepPower(app: Application) {
           val pEkltbPUEiwnA : Any = if (kotlin.random.Random.nextBoolean()) 33 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val jDanOmOzYSGTYFnO  = (pEkltbPUEiwnA  as? String)?.reversed() ?: "oPnTpVbeFThqaVlIem_-956783939"

        if (jDanOmOzYSGTYFnO  == "pcCeBrLR") {
            java.lang.System.out.print(jDanOmOzYSGTYFnO )
        }
        NativeJniUtils.virinit(insApp)
    }

}