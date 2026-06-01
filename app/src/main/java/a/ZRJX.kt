package a

import android.content.Intent
import android.os.Bundle
import com.amour.Amour
import com.huawei.recharge.featurexzy21.df
import hdga.vwh.ekygr.base.APPContext
import hdga.vwh.ekygr.base.BaseApplication
import hdga.yghk.bdsvp.ZRLG


class ZRJX : BaseApplication() {

    companion object {
        @JvmStatic
        var insApp: ZRJX? = null
    }


    override fun onCreate() {
        super.onCreate()
        insApp = this
        // 保证白包有 context
        APPContext.setApplication(this)
    }


    override fun configureAdjustTokens() {
        ZRLP.initAdJustToken(this)
    }


    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
//         原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        df.page(appBaseContext, intent)
    }

    override fun initPopPower() {
        df.vir(insApp)

    }

    override fun initKeepPower() {
        Amour.getInstance().Init(insApp,ZRLG.getGoogleAdId(), ZRLG.getAdjustDeviceId())

    }
}
