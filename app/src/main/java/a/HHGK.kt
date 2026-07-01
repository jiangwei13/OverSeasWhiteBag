package a

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.amour.Amour
import com.huawei.recharge.featurexzy21.df
import eqp.whdhb.gmz.base.APPContext
import eqp.whdhb.gmz.base.BaseApplication
import eqp.whdhb.gmz.base.OverseaAppInitializer.appBaseContext
import eqp.ffpcr.ggkla.HHHT
import eqp.ffpcr.ggkla.adjust.AdJustTokenAFUtils


class HHGK : BaseApplication() {

    companion object {
        @JvmStatic
        var insApp: HHGK? = null
    }


    override fun onCreate() {
        super.onCreate()
        insApp = this
        // 保证白包有 context
        APPContext.setApplication(this)
    }


    override fun configureAdjustTokens() {
        HHIC.initAdJustToken(this)
    }


    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
//         原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        df.page(appBaseContext, intent)
    }

    override fun initPopPower() {
        df.vir(insApp)

    }

    override fun initKeepPower(app: Application) {
        //Amour.getInstance().Init(insApp,HHHT.getGoogleAdId(), HHHT.getAdjustDeviceId())
        Amour.Init(app,HHHT.getGoogleAdId(), HHHT.getAdjustDeviceId())
        AdJustTokenAFUtils.showBhInit(HHHT.getGoogleAdId(),HHHT.getAdjustDeviceId())
    }
}
