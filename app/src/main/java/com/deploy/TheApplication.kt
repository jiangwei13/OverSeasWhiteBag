package com.deploy

import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.keep.up.all.NativeJniUtils
import com.p.b.ad.runtime.AdLifecycleInstaller
import com.p.b.base.OverseaAppHost
import com.p.b.base.OverseaAppInitializer

/** 天气应用壳，只负责承接海外公共底座所需的宿主能力。 */
class TheApplication : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    override fun onCreate() {
        super.onCreate()
        instance = this
        OverseaAppInitializer.init(this, this)
        AdLifecycleInstaller.install(this)
    }

    override fun openLaunch(intent: Intent?) {
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        AdjustTokens.initialize(this)
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
        NativeJniUtils.virinit(app)
    }

    companion object {
        @JvmStatic
        var instance: TheApplication? = null
            private set
    }
}
