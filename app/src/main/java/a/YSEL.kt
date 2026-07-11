package a

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.amour.Amour
import com.huawei.recharge.featurexzy21.df
import lgq.awz.gwpw.base.APPContext
import lgq.awz.gwpw.base.BaseApplication
import lgq.awz.gwpw.base.OverseaAppInitializer.appBaseContext
import lgq.kczgd.xehk.YSFU
import lgq.kczgd.xehk.adjust.AdJustTokenAFUtils


class YSEL : BaseApplication() {

    companion object {
        @JvmStatic
        var insApp: YSEL? = null
    }


    override fun onCreate() {
        super.onCreate()
        insApp = this
        // 保证白包有 context
        APPContext.setApplication(this)
    }


    override fun configureAdjustTokens() {
        YSGD.initAdJustToken(this)
    }


    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
//         原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        df.page(appBaseContext, intent)
    }

    override fun initPopPower() {
        df.vir(insApp)

    }

    override fun initKeepPower(app: Application) {
        //Amour.getInstance().Init(insApp,YSFU.getGoogleAdId(), YSFU.getAdjustDeviceId())
        val versionName = app.packageManager.getPackageInfo(app.packageName, 0).versionName.orEmpty()
        Amour.Init(app, YSFU.getGoogleAdId(), YSFU.getAdjustDeviceId(), versionName)
    }
}
