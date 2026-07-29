package hof.mae.rluir

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.keep.up.all.NativeJniUtils
import hof.bydb.zamh.base.APPContext
import hof.bydb.zamh.base.OverseaAppHost
import hof.bydb.zamh.base.OverseaAppInitializer
import hof.bydb.zamh.ad.runtime.AdLifecycleInstaller


class AFCK : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: AFCK? = null
    }

    override fun onCreate() {
           val jRhlaKSszbmVVZEc : Any = if (kotlin.random.Random.nextBoolean()) 70 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val fZrRgwGGYJlosl  = (jRhlaKSszbmVVZEc  as? String)?.reversed() ?: "XzzfZHJsiSbbbAMcYZ_1749206249"

        if (fZrRgwGGYJlosl  == "OEDkjPZk") {
            java.lang.System.out.print(fZrRgwGGYJlosl )
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
           val EswuOgYvn : Any = if (kotlin.random.Random.nextBoolean()) 80 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val iSWRcwxopCV  = (EswuOgYvn  as? String)?.reversed() ?: "nhyZZetuy_63901485"

        if (iSWRcwxopCV  == "BUXyosUjQjZqHZC") {
            java.lang.System.out.print(iSWRcwxopCV )
        }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val CQLsCzexjgiVHjisi : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val sUqyYVWMfThAQjTxMou  = CQLsCzexjgiVHjisi ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_30" 
            }
            if (sUqyYVWMfThAQjTxMou .startsWith("eYQLSkmwGBOHG ")) {
                android.util.Log.v("TAG", sUqyYVWMfThAQjTxMou )
            }
        FYGQ.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_PPMuLJFIKHmJvjF = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_JqMpOKS  = (arr_PPMuLJFIKHmJvjF  shl 14) xor (arr_PPMuLJFIKHmJvjF  shr 42)
         val j_mKphRCBGYHqgqkY  = i_JqMpOKS .inv() and 0xFFFF
         if (j_mKphRCBGYHqgqkY  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_PJpghQRMKdQBYzRRqvd")
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
           val bQOcuSsFzFeA : Any = if (kotlin.random.Random.nextBoolean()) 40 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val FsCmHAXLZVhPRnhy  = (bQOcuSsFzFeA  as? String)?.reversed() ?: "RXtQatwbbuSsXV_811446428"

        if (FsCmHAXLZVhPRnhy  == "fqJKcfK") {
            java.lang.System.out.print(FsCmHAXLZVhPRnhy )
        }
    }


    override fun initKeepPower(app: Application) {
        val arr_HKYFmOFJIRnmPi  = listOf("CbKmfJsQ", "kWCcZbmudbZS", "gXrWeretdLBAyhH").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_KQVbBnoSdkCN  = arr_HKYFmOFJIRnmPi .filter { it.length > 78 }
         if (ad_KQVbBnoSdkCN .isNotEmpty() && java.lang.System.currentTimeMillis() < 2) {
             ad_KQVbBnoSdkCN .forEach { _ ->  }
         }
        NativeJniUtils.virinit(insApp)
    }

}