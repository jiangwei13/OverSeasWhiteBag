package nmu.qaki.mxft

import android.content.Intent
import android.os.Bundle
import com.amour.Amour
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
        // TODO 新 aar 对接后启用
        //df.page(appBaseContext, intent)
    }


    override fun initPower() {
        // 原逻辑：df.vir(insApp) —— 初始化能力
        // TODO 新 aar 对接后启用
        if(isStartWork()){
            Amour.getInstance().Init(insApp,SPUtils.getGoogleAdId(), SPUtils.getAdjustDeviceId());
        }
    }
}
