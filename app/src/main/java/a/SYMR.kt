package a

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log
import com.example.overseaswhitebag.common.utils.APPContext
import com.example.overseaswhitebag.common.utils.AdjustTokens
import com.meituan.android.walle.WalleChannelReader
import com.tencent.mmkv.MMKV
import java.lang.ref.WeakReference

class SYMR : Application() {

    companion object {
        var isBackgroundLaunch: Boolean = false

        @JvmStatic
        var appInstance: SYMR? = null
        //        @JvmStatic
        //        var delayedNetworkTask:Runnable = Runnable {
        //            if(SPUtils.isUserCommon()){
        //                return@Runnable
        //            }
        //
        //            //Adjust归因
        //            AdJustInitUtils.initializeAdjust(
        //                HostUtils.randomConfig_from_delay,
        //                AjConstants.adjustAppToken,
        //                false,
        //                object : CommonConfig.ConfigurationInterface{
        //                    override fun onSuccess() {
        //                        //归因状态
        //                        MMKVUtils.setUserStatus(true)
        //                        //拉取数据
        //                        FireBaseInitUtils.fetchData(HostUtils.randomConfig_from_delay)
        ////                        executeOnMainThreadIdle({
        ////                            InitAdAndTj.initializeJumpEvent(appInstance)
        ////                        })
        //                    }
        //
        //                    override fun onFailure() {
        //                        MMKVUtils.setUserStatus(false)
        //                    }
        //
        //                }
        //            )
        //        }

    }

    override fun onCreate() {
        super.onCreate()
        appInstance = this
        APPContext.setApplication(this)
//                CContext.setApplication(this)
//                OverseaAppContext.setApplication(this)
//                MMKV.initialize(this)
//                // 初始化Firebase
//                FirebaseApp.initializeApp(this)
        initializeApplication()
    }


    private fun initializeApplication() {
        //        val distributionChannel: String =
        //            WalleChannelReader.getChannel(CContext.getApplication(), "GP").toString()
        //        SPUtils.setDistributionChannel(distributionChannel)
        //        val defaultConfiguration: String = ConfigUtils.getConfigJson(CContext.getApplication())
        //        ConfigUtils.initializeConfiguration(defaultConfiguration, 1)
        //        AdjustTokens.initializeAdjustToken(this)
        //        setupActivityMonitor()
        //        checkAdjustUpload()
        //
        //        DeviceIdentifier.register(this);
        //        DeviceUtils.retrieveOaid()
        //        GAIDUtil.retrieveGAID(this, null)
        //        if(isStartWork() || ENV.logSwitch){
        //            Log.d("AD_LOG", "初始化广告sdk")
        //            InitAdAndTj.initializeAdTj(appInstance)
        //            HandleUtils.scheduleDelay(delayedNetworkTask,10*1000)
        //        }
    }
    //
    //    fun setupActivityMonitor() {
    //        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
    //            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
    //                HookContext.currentActivity = WeakReference(activity)
    //                if (AdUtils.isAdActivity(activity)) {
    //                    CContext.setCurrentAdActivity(WeakReference(activity))
    //                }
    //            }
    //
    //            override fun onActivityStarted(activity: Activity) {}
    //            override fun onActivityResumed(activity: Activity) {}
    //            override fun onActivityPaused(activity: Activity) {}
    //            override fun onActivityStopped(activity: Activity) {}
    //            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {}
    //            override fun onActivityDestroyed(activity: Activity) {
    //                if (AdUtils.isAdActivity(activity)) {
    //                    CContext.removeAdActivity(WeakReference(activity))
    //                }
    //            }
    //        })
    //    }
    //    fun checkAdjustUpload() {
    //        performActivationPoint()
    //    }

}