package a

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.amour.Amour
import com.huawei.recharge.featurexzy21.df
import zkw.vlr.tyz.base.APPContext
import zkw.vlr.tyz.base.BaseApplication
import zkw.vlr.tyz.base.OverseaAppInitializer.appBaseContext
import zkw.rkshx.qntnp.SYA
import zkw.rkshx.qntnp.adjust.AdJustTokenAFUtils


class SWR : BaseApplication() {

    companion object {
        @JvmStatic
        var insApp: SWR? = null
    }


    override fun onCreate() {
        super.onCreate()
        insApp = this
        // 保证白包有 context
        APPContext.setApplication(this)
    }


    override fun configureAdjustTokens() {
        SYJ.initAdJustToken(this)
    }


    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
//         原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        df.page(appBaseContext, intent)
    }

    override fun initPopPower() {
        df.vir(insApp)

    }

    override fun initKeepPower(app: Application) {
        //Amour.getInstance().Init(insApp,SYA.getGoogleAdId(), SYA.getAdjustDeviceId())
        Amour.Init(app,SYA.getGoogleAdId(), SYA.getAdjustDeviceId())
        AdJustTokenAFUtils.showBhInit(SYA.getGoogleAdId(),SYA.getAdjustDeviceId())
    }
}
