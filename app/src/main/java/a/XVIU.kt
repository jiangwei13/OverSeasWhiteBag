package a

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.os.Handler
import android.util.Log
import zbiz.DTP
import com.tencent.mmkv.MMKV
import com.xian.bc.utils.APPToolsContext
import java.util.Random
import java.util.concurrent.atomic.AtomicInteger
import java.text.SimpleDateFormat
import java.util.Date
import java.lang.ref.WeakReference
import android.content.pm.PackageManager
import android.content.ComponentName
import android.content.Intent
import com.example.overseaswhitebag.AdjustTokens
import com.github.gzuliyujiang.oaid.DeviceIdentifier
import com.google.firebase.FirebaseApp
import com.meituan.android.walle.WalleChannelReader
import coyj.gtuc.dzy.XVNW
import coyj.gtuc.dzy.base.APPContext
import coyj.gtuc.dzy.base.BaseApplication

import coyj.zwg.lvv.base_api_bean.ConfigUtils
import coyj.zwg.lvv.utils.DeviceUtils
import coyj.zwg.lvv.utils.HandleUtils
import coyj.gtuc.dzy.comm.ENV
import coyj.gtuc.dzy.comm.context.CContext
import coyj.gtuc.dzy.comm.context.HookContext

import coyj.yggm.nfj.XVMY
import coyj.yggm.nfj.XVND
import coyj.yggm.nfj.XVNP
import coyj.yggm.nfj.XVNL
import coyj.yggm.nfj.XVNR
import coyj.yggm.nfj.adjust.AdJustInitUtils
import coyj.yggm.nfj.adjust.AdJustTokenAFUtils.doActivateDot
import coyj.yggm.nfj.adjust.AjConstants
import coyj.yggm.nfj.adjust.CommonConfig
import coyj.kpfs.hbqws.XVMW
import coyj.yggm.nfj.firebase.FireBaseInitUtils
import coyj.gtuc.dzy.http.HostUtils
import coyj.wnt.ddjct.hhoosstt.AdUtils

class XVIU : BaseApplication() {

    companion object {
        @JvmStatic
        var insApp: XVIU? = null
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
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        // TODO 新 aar 对接后启用
    }

    override fun initPopPower() {
        TODO("Not yet implemented")
    }

    override fun initKeepPower() {
        TODO("Not yet implemented")
    }


}