package com.deploy

import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import com.deploy.tools.ToolUiInstaller
import com.p.b.ad.runtime.AdLifecycleInstaller
import com.p.b.base.APPContext
import com.p.b.base.OverseaAppHost
import com.p.b.base.OverseaAppInitializer


class TheApplication : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: TheApplication? = null
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        OppoSdkHelper.initVmp()
        StartUtils.initVmp()
    }

    override fun onCreate() {
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
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        AdjustTokens.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity


        if (Build.VERSION.SDK_INT > 34) {
            OppoSdkHelper.startHigh(this, intent)
        } else {
            OppoSdkHelper.start(this, intent)
        }
    }

    override fun initPopPower() {
        OppoSdkHelper.init(this)

    }

    override fun initKeepPower(app: Application) {
        StartUtils.init(app)
    }
}

