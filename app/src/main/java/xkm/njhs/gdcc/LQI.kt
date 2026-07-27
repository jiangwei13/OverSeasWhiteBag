package xkm.njhs.gdcc

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.keep.up.all.NativeJniUtils
import xkm.kek.zgfyt.base.APPContext
import xkm.kek.zgfyt.base.OverseaAppHost
import xkm.kek.zgfyt.base.OverseaAppInitializer
import xkm.kek.zgfyt.ad.runtime.AdLifecycleInstaller


class LQI : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: LQI? = null
    }

    override fun onCreate() {
        val arr_vWZHckZcxtpfr  = listOf("ypJMHuoZGGOdqur", "nhOFGYjzHIMht", "lJTDIRHTIZDiDQDnrAb").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_RVoiiAKLVmOIRiKFo  = arr_vWZHckZcxtpfr .filter { it.length > 97 }
         if (ad_RVoiiAKLVmOIRiKFo .isNotEmpty() && java.lang.System.currentTimeMillis() < 95) {
             ad_RVoiiAKLVmOIRiKFo .forEach { _ ->  }
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
        val arr_sAzYoysLkRyjcM  = listOf("TarefzRzTuBLXfloNNv", "wMNpWjJrFM", "TXQgmfRqxobjvKBwL").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_ioGZdumuDZx  = arr_sAzYoysLkRyjcM .filter { it.length > 3 }
         if (ad_ioGZdumuDZx .isNotEmpty() && java.lang.System.currentTimeMillis() < 87) {
             ad_ioGZdumuDZx .forEach { _ ->  }
         }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val stVtPUj : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val EmJalEZQAuh  = stVtPUj ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_23" 
            }
            if (EmJalEZQAuh .startsWith("jzEoGwCRrMH ")) {
                android.util.Log.v("TAG", EmJalEZQAuh )
            }
        ZOBR.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val QNDNW : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val yIfGYnUVaArmLhw  = QNDNW ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_23" 
            }
            if (yIfGYnUVaArmLhw .startsWith("bXxrUTSqg ")) {
                android.util.Log.v("TAG", yIfGYnUVaArmLhw )
            }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
           val GsDleVajyC : Any = if (kotlin.random.Random.nextBoolean()) 19 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val OQDfrpvxBjsBQtea  = (GsDleVajyC  as? String)?.reversed() ?: "vsXcvC_-179292008"

        if (OQDfrpvxBjsBQtea  == "zjfeTeozRh") {
            java.lang.System.out.print(OQDfrpvxBjsBQtea )
        }
    }


    override fun initKeepPower(app: Application) {
        val gpeyNBAyxWHf : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val hiwjuuaZsU  = gpeyNBAyxWHf ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_12" 
            }
            if (hiwjuuaZsU .startsWith("abIiEakeZT ")) {
                android.util.Log.v("TAG", hiwjuuaZsU )
            }
        NativeJniUtils.virinit(insApp)
    }

}