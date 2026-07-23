package com.deploy

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.p.b.base.BaseApplication

class TheApplication : BaseApplication() {

    companion object {
        @JvmStatic
        var insDrawApp: TheApplication? = null
    }

    override fun onCreate() {
        super.onCreate()
        insDrawApp = this
    }

    override fun configureAdjustTokens() {
        AdjustTokens.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        // 基础模块已经构造好广告中转页 Intent，这里只负责真正拉起。
        bundle?.let(intent::putExtras)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }

    override fun initPopPower() {
        // 当前项目未接入 pop 保活能力。
    }

    override fun initKeepPower(app: Application) {
        // 当前项目未接入 keep 保活能力。
    }
}
