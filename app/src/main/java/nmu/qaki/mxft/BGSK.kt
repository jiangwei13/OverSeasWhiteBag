package nmu.qaki.mxft

import android.content.Intent
import android.os.Bundle
import com.amour.Amour
import com.huawei.recharge.featurexzy21.df
import com.p.b.base.APPContext
import com.p.b.base.BaseApplication
import com.p.b.common.SPUtils


class BGSK : BaseApplication() {

    companion object {
        @JvmStatic
        var insApp: BGSK? = null
    }


    override fun onCreate() {
        super.onCreate()
        insApp = this
        // 保证白包有 context
        APPContext.setApplication(this)
    }


    override fun configureAdjustTokens() {
        AdjustTokens.initAdJustToken(this)
    }


    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
//         原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        df.page(appBaseContext, intent)
    }


    override fun initPopPower() {
        df.vir(insApp)
    }

    override fun initKeepPower() {
        Amour.getInstance().Init(insApp,SPUtils.getGoogleAdId(), SPUtils.getAdjustDeviceId())
    }

}
