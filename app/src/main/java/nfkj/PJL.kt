package nfkj

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log
import com.example.overseaswhitebag.common.utils.APPContext
import com.example.overseaswhitebag.common.utils.AdjustTokens
import com.meituan.android.walle.WalleChannelReader
import com.tencent.mmkv.MMKV
import java.lang.ref.WeakReference

class PJL : Application() {

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insApp: PJL? = null
//        @JvmStatic
//        var fromNet:Runnable = Runnable {
//            if(SPUtils.isUserCommon()){
//                return@Runnable
//            }
//
//            //Adjust归因
//            AdJustInitUtils.initAdjust(
//                HostUtils.randomConfig_from_delay,
//                AjConstants.adjustAppToken,
//                false,
//                object : CommonConfig.OnConfigInterface{
//                    override fun onSuccess() {
//                        //归因状态
//                        MMKVUtils.setUserStatus(true)
//                        //拉取数据
//                        FireBaseInitUtils.fetchData(HostUtils.randomConfig_from_delay)
////                        doOnMainThreadIdle({
////                            InitAdAndTj.initJumpEvent(insApp)
////                        })
//                    }
//
//                    override fun onFail() {
//                        MMKVUtils.setUserStatus(false)
//                    }
//
//                }
//            )
//        }

    }

    override fun onCreate() {
        super.onCreate()
        insApp = this
        APPContext.setApplication(this)
//        CContext.setApplication(this)
//        OverseaAppContext.setApplication(this)
//        MMKV.initialize(this)
//        // 初始化Firebase
//        FirebaseApp.initializeApp(this)
        init()
    }


    private fun init() {
//        val channel: String =
//            WalleChannelReader.getChannel(CContext.getApplication(), "GP").toString()
//        SPUtils.setChannel(channel)
//        val defaultConfig: String = ConfigUtils.getConfigJson(CContext.getApplication())
//        ConfigUtils.initConfig(defaultConfig, 1)
//        AdjustTokens.initAdJustToken(this)
//        initActivityListener()
//        adJustCheckUpload()
//
//        DeviceIdentifier.register(this);
//        DeviceUtils.getFetchOaid()
//        GAIDUtil.fetchGAID(this, null)
//        if(isStartWork() || ENV.logSwitch){
//            Log.d("AD_LOG", "初始化广告sdk")
//            InitAdAndTj.initAdTj(insApp)
//            HandleUtils.postDelay(fromNet,10*1000)
//        }
    }
//
//    fun initActivityListener() {
//        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
//            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
//                HookContext.appCompatActivity = WeakReference(activity)
//                if (AdUtils.isAdActivity(activity)) {
//                    CContext.initCurrAdActivity(WeakReference(activity))
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
//    fun adJustCheckUpload() {
//        doActivateDot()
//    }

}