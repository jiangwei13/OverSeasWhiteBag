package a

import android.app.Activity
import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.amour.Amour
import com.example.overseaswhitebag.common.utils.APPContext
import com.example.overseaswhitebag.common.utils.AdjustTokens
import com.github.gzuliyujiang.oaid.DeviceIdentifier
import com.google.firebase.FirebaseApp
import com.meituan.android.walle.WalleChannelReader
import com.tencent.mmkv.MMKV
import nuj.dofd.iiel.SYNN
import nuj.dofd.iiel.SYNP
import nuj.dofd.iiel.SYNY
import nuj.dofd.iiel.SYOC
import nuj.dofd.iiel.SYOD
import nuj.dofd.iiel.adjust.AdJustInitUtils
import nuj.dofd.iiel.adjust.AdJustTokenAFUtils.doActivateDot
import nuj.dofd.iiel.adjust.AjConstants
import nuj.dofd.iiel.adjust.CommonConfig
import nuj.dofd.iiel.context.HookContext
import nuj.dofd.iiel.firebase.FireBaseInitUtils
import nuj.fdukf.dva.base_api_bean.ConfigUtils
import nuj.fdukf.dva.utils.HandleUtils
import nuj.njljh.cqjb.hhoosstt.AdUtils
import nuj.njljh.cqjb.hhoosstt.CContext
import nuj.pqr.pocrw.SYOH
import nuj.pqr.pocrw.base.BaseApplication
import nuj.pqr.pocrw.http.HostUtils
import java.lang.ref.WeakReference

class SYMR : BaseApplication() {

    companion object {
        var isBackgroundLaunch: Boolean = false

        @JvmStatic
        var appInstance: SYMR? = null
        @JvmStatic
        var delayedNetworkTask:Runnable = Runnable {
            if(SYOD.isUserCommon()){
                return@Runnable
            }

            //Adjust归因
            AdJustInitUtils.initAdjust(
                HostUtils.randomConfig_from_delay,
                AjConstants.adjustAppToken,
                false,
                object : CommonConfig.OnConfigInterface{
                    override fun onSuccess() {
                        val defaultConfiguration: String = ConfigUtils.getConfigJson(CContext.getApplication())
                        ConfigUtils.initConfig(defaultConfiguration, 1)

                        if (isStartWork()) {
                            Amour.getInstance().Init(appInstance);
                        }
                        //初始化tan chu
                        df.vir(insApp);
                        //归因状态
                        SYNP.setUserStatus(true)
                        //拉取数据
                        FireBaseInitUtils.fetchData(HostUtils.randomConfig_from_delay)
                        nuj.dofd.iiel.doOnMainThreadIdle({
                            SYOH.initJumpEvent(SYMR.Companion.appInstance)
                        })
                        jumpIntent()
                    }

                    override fun onFail() {
                        SYNP.setUserStatus(false)
                    }

                }
            )
        }

    }

    override fun onCreate() {
        super.onCreate()
        appInstance = this
        APPContext.setApplication(this)
        CContext.setApplication(this)
        SYOC.setApplication(this)
        MMKV.initialize(this)
        // 初始化Firebase
        FirebaseApp.initializeApp(this)
        init()
    }



    private fun init() {
        val distributionChannel: String =
            WalleChannelReader.getChannel(CContext.getApplication(), "GP").toString()
        SYOD.setChannel(distributionChannel)

        AdjustTokens.initAdJustToken(this)
        setupActivityMonitor()
        checkAdjustUpload()

        DeviceIdentifier.register(this);
        Log.d("AD_LOG", "初始化广告sdk")
        SYOH.initAdTj(appInstance)
        HandleUtils.postDelay(delayedNetworkTask, 10 * 1000)
    }

    fun setupActivityMonitor() {
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
    fun checkAdjustUpload() {
        doActivateDot()
    }


}