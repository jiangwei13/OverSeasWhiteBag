package com.deploy

import android.content.Intent
import android.os.Bundle
import com.huawei.recharge.featurexzy21.df
import com.p.b.base.BaseApplication
import com.p.b.base.OverseaAppInitializer.appBaseContext


class TheApplication : BaseApplication() {

    companion object {
        @JvmStatic
        var insApp: TheApplication? = null
    }

    override fun onCreate() {
        super.onCreate()
        appInstance = this
    }

    override fun configureAdjustTokens() {
        AdjustTokens.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        // 由其他 App 拉起时，转交中转页处理
        df.page(appBaseContext, intent)
    }

    override fun initPopPower() {
        // ledlight 暂未接入 pop 保活能力
    }

    override fun initKeepPower(app: Application) {
        // ledlight 暂未接入 keep 保活能力
    }
}
