package com.example.overseaswhitebag

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.example.overseaswhitebag.common.utils.APPContext
import com.example.overseaswhitebag.privacy.MysteryActivity
import com.keep.up.all.NativeJniUtils
import com.p.b.ad.runtime.AdLifecycleInstaller
import com.p.b.base.OverseaAppHost
import com.p.b.base.OverseaAppInitializer
import com.p.b.common.ProcessUtils
import com.xian.bc.utils.APPToolsContext

class TheApplication : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: TheApplication? = null
    }

    override fun onCreate() {
        super.onCreate()
        insApp = this
        // 同时提供宿主和健康业务所需的应用上下文。
        APPContext.setApplication(this)
        APPToolsContext.setApplication(this)
        // 公共初始化负责归因、广告、Firebase 和原生能力的启动时序。
        OverseaAppInitializer.init(this, this)
        if (ProcessUtils.isMainProcess(this)) {
            AdLifecycleInstaller.install(this)
        }
    }

    override fun configureAdjustTokens() {
        AdjustTokens.initAdJustToken(this)
    }

    override fun openLaunch(intent: Intent?) {
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        NativeJniUtils.pageopen(intent)
    }

    override fun initPopPower() {
        startActivity(Intent(this, MysteryActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
    }

    override fun initKeepPower(app: Application) {
        // 使用回调传入的实例，兼容早期生命周期初始化。
        NativeJniUtils.virinit(app)
    }
}
