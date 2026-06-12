package com.deploy

import android.content.Intent
import android.os.Bundle
import com.huawei.recharge.featurexzy21.df
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
    }

    override fun configureAdjustTokens() {
        AdjustTokens.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        // 由其他 App 拉起时，转交中转页处理
        df.page(appBaseContext, intent)
    }

    override fun initPopPower() {
        // 预留：初始化 pop 能力入口
    }

    override fun initKeepPower() {
        // 预留：初始化保活能力入口
    }
}
