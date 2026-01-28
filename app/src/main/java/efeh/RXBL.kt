package efeh

import android.app.Application
import efej.RXCE

class RXBL : Application() {

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insApp: RXBL? = null

        @JvmStatic
        var fromNet: Runnable = Runnable {
            isBackLanch = true
        }
    }

    override fun onCreate() {
        super.onCreate()
        insApp = this
        RXCE.setApplication(this)

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