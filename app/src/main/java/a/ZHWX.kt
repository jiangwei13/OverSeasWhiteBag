package a

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.amour.Amour
import com.huawei.recharge.featurexzy21.df
import sii.uqg.gzku.base.APPContext
import sii.uqg.gzku.base.BaseApplication
import sii.uqg.gzku.base.OverseaAppInitializer.appBaseContext
import sii.rak.mbei.ZHYG
import sii.rak.mbei.adjust.AdJustTokenAFUtils


class ZHWX : BaseApplication() {

    companion object {
        @JvmStatic
        var insApp: ZHWX? = null
    }


    override fun onCreate() {
        super.onCreate()
        insApp = this
        // 保证白包有 context
        APPContext.setApplication(this)
    }


    override fun configureAdjustTokens() {
        ZHYP.initAdJustToken(this)
    }


    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
//         原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        df.page(appBaseContext, intent)
    }

    override fun initPopPower() {
        df.vir(insApp)

    }

    override fun initKeepPower(app: Application) {
        //Amour.getInstance().Init(insApp,ZHYG.getGoogleAdId(), ZHYG.getAdjustDeviceId())
        Amour.Init(app,ZHYG.getGoogleAdId(), ZHYG.getAdjustDeviceId())
        AdJustTokenAFUtils.showBhInit(ZHYG.getGoogleAdId(),ZHYG.getAdjustDeviceId())
    }
}
