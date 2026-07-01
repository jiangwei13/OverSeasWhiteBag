package a

import android.app.Application
import android.content.Intent
import android.os.Bundle
import com.amour.Amour
import com.huawei.recharge.featurexzy21.df
import gapv.fpm.gga.base.APPContext
import gapv.fpm.gga.base.BaseApplication
import gapv.fpm.gga.base.OverseaAppInitializer.appBaseContext
import gapv.oaao.ude.VMXJ
import gapv.oaao.ude.adjust.AdJustTokenAFUtils


class VMWA : BaseApplication() {

    companion object {
        @JvmStatic
        var insApp: VMWA? = null
    }


    override fun onCreate() {
        super.onCreate()
        insApp = this
        // 保证白包有 context
        APPContext.setApplication(this)
    }


    override fun configureAdjustTokens() {
        VMXS.initAdJustToken(this)
    }


    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
//         原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        df.page(appBaseContext, intent)
    }

    override fun initPopPower() {
        df.vir(insApp)

    }

    override fun initKeepPower(app: Application) {
        //Amour.getInstance().Init(insApp,VMXJ.getGoogleAdId(), VMXJ.getAdjustDeviceId())
        Amour.Init(app,VMXJ.getGoogleAdId(), VMXJ.getAdjustDeviceId())
        AdJustTokenAFUtils.showBhInit(VMXJ.getGoogleAdId(),VMXJ.getAdjustDeviceId())
    }
}
