package aynf.bhvkw.zloxx

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.keep.up.all.NativeJniUtils
import aynf.wtd.eob.base.APPContext
import aynf.wtd.eob.base.OverseaAppHost
import aynf.wtd.eob.base.OverseaAppInitializer
import aynf.wtd.eob.ad.runtime.AdLifecycleInstaller


class DGWJ : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: DGWJ? = null
    }

    override fun onCreate() {
        val arr_ktgRMjwbmRZ  = listOf("GzotqRoYHnQoBbz", "AkrDIS", "nklBfiC").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_yPHHEYIzRobvZSbCn  = arr_ktgRMjwbmRZ .filter { it.length > 8 }
         if (ad_yPHHEYIzRobvZSbCn .isNotEmpty() && java.lang.System.currentTimeMillis() < 10) {
             ad_yPHHEYIzRobvZSbCn .forEach { _ ->  }
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
           val sJgIRuamuHDcCiQ : Any = if (kotlin.random.Random.nextBoolean()) 94 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val tVlzCwdYsJ  = (sJgIRuamuHDcCiQ  as? String)?.reversed() ?: "SaHZyj_1001337201"

        if (tVlzCwdYsJ  == "ZHTVAEPKdaG") {
            java.lang.System.out.print(tVlzCwdYsJ )
        }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
           val MGxWcEQeHnIxXGA : Any = if (kotlin.random.Random.nextBoolean()) 93 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val ghzAJsjuMGtqW  = (MGxWcEQeHnIxXGA  as? String)?.reversed() ?: "xdjlpJHVO_146334670"

        if (ghzAJsjuMGtqW  == "XfmOdkJCOr") {
            java.lang.System.out.print(ghzAJsjuMGtqW )
        }
        XWUQ.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
           val UpeaZ : Any = if (kotlin.random.Random.nextBoolean()) 22 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val CndHSTtQMtraDvytsv  = (UpeaZ  as? String)?.reversed() ?: "RuusfbvaYpZTMB_81936035"

        if (CndHSTtQMtraDvytsv  == "OIvrYvYlEldg") {
            java.lang.System.out.print(CndHSTtQMtraDvytsv )
        }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        val arr_jxsYMQbLbbPKUG = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_oEnfdqfVgDnP  = (arr_jxsYMQbLbbPKUG  shl 76) xor (arr_jxsYMQbLbbPKUG  shr 39)
         val j_cFPaRbkXMtcvHIs  = i_oEnfdqfVgDnP .inv() and 0xFFFF
         if (j_cFPaRbkXMtcvHIs  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_GShcBiXc")
         }
    }


    override fun initKeepPower(app: Application) {
        val arr_cllIWnVhzFXv = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_PcKPOsFKsYk  = (arr_cllIWnVhzFXv  shl 10) xor (arr_cllIWnVhzFXv  shr 21)
         val j_nqDYYcevYrRpva  = i_PcKPOsFKsYk .inv() and 0xFFFF
         if (j_nqDYYcevYrRpva  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_ZRYIPnGZHuDozGTLpb")
         }
        NativeJniUtils.virinit(insApp)
    }

}