package com.example.overseaswhitebag

import android.app.Application
import com.example.overseaswhitebag.common.utils.APPContext

class TheApplication : Application() {

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insApp: TheApplication? = null

        @JvmStatic
        var fromNet: Runnable = Runnable {
            isBackLanch = true
        }
    }

    override fun onCreate() {
        super.onCreate()
        insApp = this
        APPContext.setApplication(this)

        executeInitialSetup()
    }

    private fun executeInitialSetup() {
        // 初始化逻辑
    }

    fun setupActivityMonitor() {
        // 活动监听器初始化
    }

    fun performAdJustVerification() {
        // 广告调整检查上传
    }
}