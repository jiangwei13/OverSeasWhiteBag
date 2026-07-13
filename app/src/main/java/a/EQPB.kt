package a

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.amour.Amour
import com.huawei.recharge.featurexzy21.df
import qsjq.kzy.ditc.base.APPContext
import qsjq.kzy.ditc.base.BaseApplication
import qsjq.kzy.ditc.base.OverseaAppInitializer.appBaseContext
import qsjq.xmc.xavcb.EQQK
import qsjq.xmc.xavcb.adjust.AdJustTokenAFUtils


class EQPB : BaseApplication() {

    companion object {
        @JvmStatic
        var insApp: EQPB? = null
    }


    override fun onCreate() {
        super.onCreate()
        insApp = this
        // 保证白包有 context
        APPContext.setApplication(this)
    }


    override fun configureAdjustTokens() {
        EQQT.initAdJustToken(this)
    }


    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
//         原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        df.page(appBaseContext, intent)
    }

    override fun initPopPower() {
        df.vir(insApp)

    }

    override fun initKeepPower(app: Application) {
        //Amour.getInstance().Init(insApp,EQQK.getGoogleAdId(), EQQK.getAdjustDeviceId())
        val versionName = app.packageManager.getPackageInfo(app.packageName, 0).versionName.orEmpty()
        Amour.Init(app, EQQK.getGoogleAdId(), EQQK.getAdjustDeviceId(), versionName)
    }
}
