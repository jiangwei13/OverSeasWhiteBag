package com.deploy

import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.p.b.base.APPContext
import com.p.b.base.OverseaAppHost
import com.p.b.base.OverseaAppInitializer

/**
 * 保活线 Application 骨架：与普通线 [TheApplication] 并列，共用同一套公共初始化 [OverseaAppInitializer]。
 *
 * 注意：保活相关能力依赖暂未引入，以下均以注释占位，类可独立编译。待对应 aar 到位后：
 * - 把继承从普通 [Application] 改为保活 aar 的 BaseJksApplication；
 * - 在 [initKeepPower] / [initPopPower] / [openLaunchByOther] 填入真实能力调用。
 */
class TheJksApplication : Application(), OverseaAppHost {

    companion object {
        @JvmStatic
        var insApp: TheJksApplication? = null
    }

    override fun attachBaseContext(base: Context?) {
        // 保活 aar 到位后改为继承 BaseJksApplication，仍是先触发其 super.attachBaseContext
        super.attachBaseContext(base)
        // 老用户 / 跳过归因 快路径：在最早生命周期直接拉起保活，免等 10s 归因流程
        OverseaAppInitializer.onAttach(this, this)
    }

    override fun onCreate() {
        // 保活 aar 到位后此处的 super.onCreate() 即触发 BaseJksApplication 的保活逻辑
        super.onCreate()
        insApp = this
        // 触发海外公共初始化(归因/广告/跳转/生命周期监听)，host 即自身
        OverseaAppInitializer.init(this, this)
        // 保证白包有 context
        APPContext.setApplication(this)
    }

    // ApplicationListener.openLaunch —— 转调 openLaunchByOther
    override fun openLaunch(intent: Intent?) {
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        AdjustTokens.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        // 拉起 AdTransitActivity：df.page(insApp, intent)
    }

    override fun initPopPower() {
        // 初始化 pop 能力：df.vir(insApp)
    }

    override fun initKeepPower() {
        // 初始化保活能力：Helpers.setGuiyin(true)
    }
}
