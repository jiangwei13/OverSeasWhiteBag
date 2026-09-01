package com.deploy

import android.app.Application
//【临时移除 oversea_base_module】以下 import 随模块一并注释，回插时恢复
//import android.content.Intent
//import android.os.Bundle
import com.deploy.tools.ToolUiInstaller
//import com.keep.up.all.NativeJniUtils
//import com.p.b.ad.runtime.AdLifecycleInstaller
//import com.p.b.base.APPContext
//import com.p.b.base.OverseaAppHost
//import com.p.b.base.OverseaAppInitializer


/**
 *【临时移除 oversea_base_module】当前为纯净工具 App 版本：
 * - 不再实现 OverseaAppHost（归因/广告/保活/图标隐藏宿主回调随模块一并移除）；
 * - 保活（NativeJniUtils.virinit）与图标隐藏（initPopPower→MysteryActivity）按决策彻底移除；
 * - 原实现整体保留在下方注释中，回插模块时取消注释即可。
 */
class TheApplication : Application() {

    companion object {
        @JvmStatic
        var insApp: TheApplication? = null
    }

    override fun onCreate() {
        super.onCreate()
        insApp = this
        //【临时移除 oversea_base_module】随模块移除的初始化（回插时恢复）：
        // - OverseaAppInitializer.init(this, this)  海外公共初始化（归因/广告/跳转/生命周期监听）
        // - AdLifecycleInstaller.install(this)       返回广告所需的生命周期监听
        // - APPContext.setApplication(this)          白包 context 容器
        // 统一安装各工具页的自定义 UI(按 ToolType 区分;未注册的工具用功能层默认 UI)
        ToolUiInstaller.installAll()
    }
}

/*【临时移除 oversea_base_module】原实现备份，回插时用下面内容替换上方类定义：
class TheApplication : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: TheApplication? = null
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
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        // 启动图标隐藏：禁用 SplashActivity 主入口，启用透明 MysteryAliasActivity
        startActivity(Intent(this, MysteryActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
    }


    override fun initKeepPower(app: Application) {
        // attachBaseContext 阶段 insApp 尚未赋值，必须使用回调传入的 Application。
        NativeJniUtils.virinit(app)
    }

}
*/
