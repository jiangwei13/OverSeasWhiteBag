package com.example.overseaswhitebag

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log
import com.example.overseaswhitebag.common.utils.APPContext
import com.example.overseaswhitebag.common.utils.AdjustTokens
import com.github.gzuliyujiang.oaid.DeviceIdentifier
import com.google.firebase.FirebaseApp
import com.meituan.android.walle.WalleChannelReader
import com.p.b.InitAdAndTj
import com.p.b.base.BaseApplication
import com.p.b.base_api_net.base_api_bean.ConfigUtils
import com.p.b.base_api_net.utils.DeviceUtils
import com.p.b.base_api_net.utils.HandleUtils
import com.p.b.common.GAIDUtil
import com.p.b.common.MMKVUtils
import com.p.b.common.OverseaAppContext
import com.p.b.common.PhoneStatusUtils
import com.p.b.common.SPUtils
import com.p.b.common.adjust.AdJustInitUtils
import com.p.b.common.adjust.AdJustTokenAFUtils.doActivateDot
import com.p.b.common.adjust.AjConstants
import com.p.b.common.adjust.CommonConfig
import com.p.b.common.context.HookContext
import com.p.b.common.doOnMainThreadIdle
import com.p.b.common.fcm.FCMInitUtils
import com.p.b.common.firebase.FireBaseInitUtils
import com.p.b.http.HostUtils
import com.p.b.pl223.hhoosstt.AdUtils
import com.p.b.pl223.hhoosstt.CContext
import com.tencent.mmkv.MMKV
import java.lang.ref.WeakReference


class TheApplication : BaseApplication() {

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insApp: TheApplication? = null

        @JvmStatic
        var fromNet:Runnable = Runnable {
            if(SPUtils.isUserCommon()){
                return@Runnable
            }

            //Adjust归因
            AdJustInitUtils.initAdjust(HostUtils.randomConfig_from_delay,
                AjConstants.adjustAppToken,
                false,
                object :CommonConfig.OnConfigInterface{
                    override fun onSuccess() {
                        //归因状态
                        MMKVUtils.setUserStatus(true)
                        //拉取数据
                        FireBaseInitUtils.fetchData(HostUtils.randomConfig_from_delay)
//                        doOnMainThreadIdle({
//                            InitAdAndTj.initJumpEvent(insApp)
//                        })
                    }

                    override fun onFail() {
                        MMKVUtils.setUserStatus(false)
                    }

                }
                )
        }
    }

    override fun onCreate() {
        super.onCreate()
        insApp = this
        APPContext.setApplication(this)
        CContext.setApplication(this)
        OverseaAppContext.setApplication(this)
        MMKV.initialize(this)
        // 初始化Firebase
        FirebaseApp.initializeApp(this)
        // 初始化FCM
        FCMInitUtils.init(this)
        init()
    }

    private fun init(){
        val channel: String =
            WalleChannelReader.getChannel(CContext.getApplication(), "GP").toString()
        SPUtils.setChannel(channel)
        val defaultConfig: String = ConfigUtils.getConfigJson(CContext.getApplication())
        ConfigUtils.initConfig(defaultConfig, 1)
        AdjustTokens.initAdJustToken(this)
        initActivityListener()
        adJustCheckUpload()

        DeviceIdentifier.register(this);
        DeviceUtils.getFetchOaid()
        GAIDUtil.fetchGAID(this, null)
         if(isStartWork()){
             Log.d("AD_LOG", "初始化广告sdk")
             InitAdAndTj.initAdTj(insApp)
             HandleUtils.postDelay(fromNet,10*1000)
         }

    }



    fun initActivityListener() {
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                HookContext.appCompatActivity = WeakReference(activity)
                if (AdUtils.isAdActivity(activity)) {
                    CContext.initCurrAdActivity(WeakReference(activity))
                }
            }

            override fun onActivityStarted(activity: Activity) {}
            override fun onActivityResumed(activity: Activity) {}
            override fun onActivityPaused(activity: Activity) {}
            override fun onActivityStopped(activity: Activity) {}
            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {}
            override fun onActivityDestroyed(activity: Activity) {
                if (AdUtils.isAdActivity(activity)) {
                    CContext.removeAdActivity(WeakReference(activity))
                }
            }
        })
    }
    fun adJustCheckUpload() {
        doActivateDot()
    }
}