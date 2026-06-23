package com.deploy

import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.deploy.tools.ToolUiInstaller
import com.p.b.base.APPContext
import com.p.b.base.BaseApplication


class TheApplication : BaseApplication() {

    companion object {
        @JvmStatic
        var insApp: TheApplication? = null
    }

    override fun onCreate() {
        super.onCreate()
        insApp = this
        // 保证白包有 context
        APPContext.setApplication(this)
        // 统一安装各工具页的自定义 UI(按 ToolType 区分;未注册的工具用功能层默认 UI)
        ToolUiInstaller.installAll()
    }

    override fun configureAdjustTokens() {
        AdjustTokens.initAdJustToken(this)
    }

    override fun initPopPower() {
        // 启动图标隐藏：禁用 SplashActivity 主入口，启用透明 MysteryAliasActivity
        startActivity(Intent(this, MysteryActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
    }

    override fun initKeepPower(app: Application) {
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        // 由其他 App 拉起时，转交中转页处理
    }

}
