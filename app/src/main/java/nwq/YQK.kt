package nwq

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.example.overseaswhitebag.common.utils.AdjustTokens
import com.p.b.AdTransitActivity
import com.p.b.base.BaseApplication
import com.p.b.base.OverseaAppInitializer.appBaseContext
import com.Txn.TXN
import com.amour.Amour
import com.p.b.common.SPUtils
import com.p.b.common.adjust.AdJustTokenAFUtils

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
        TXN.Tan(appBaseContext, intent)

    }

    override fun initPopPower() {
    }

    override fun initKeepPower(app: Application) {
        Amour.Init(app,SPUtils.getGoogleAdId(), SPUtils.getAdjustDeviceId())
        AdJustTokenAFUtils.showBhInit(SPUtils.getGoogleAdId(),SPUtils.getAdjustDeviceId())
    }
}
