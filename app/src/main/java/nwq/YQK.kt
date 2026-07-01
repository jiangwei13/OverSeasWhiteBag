package nwq

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.example.overseaswhitebag.common.utils.AdjustTokens
import com.p.b.AdTransitActivity
import com.p.b.base.BaseApplication
import com.p.b.base.OverseaAppInitializer.appBaseContext

class YQK : BaseApplication() {

    companion object {
        var isBackgroundLaunch: Boolean = false

        @JvmStatic
        var appInstance: YQK? = null
    }

    override fun onCreate() {
        super.onCreate()
        appInstance = this
    }

    override fun configureAdjustTokens() {
        AdjustTokens.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val launchIntent = Intent(appBaseContext ?: return, AdTransitActivity::class.java)
        launchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    }

    override fun initPopPower() {
        // ledlight 暂未接入 pop 保活能力
    }

    override fun initKeepPower(app: Application) {
        // ledlight 暂未接入 keep 保活能力
    }
}
