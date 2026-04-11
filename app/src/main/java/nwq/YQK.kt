package nwq

import android.app.Activity
import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.example.overseaswhitebag.common.utils.APPContext
import com.examp.oversea_base_power.BaseApplication
import com.example.overseaswhitebag.common.utils.AdjustTokens
import com.github.gzuliyujiang.oaid.DeviceIdentifier
import com.google.firebase.FirebaseApp
import com.meituan.android.walle.WalleChannelReader
import com.p.b.AdTransitActivity
import com.p.b.InitAdAndTj
import com.p.b.base_api_net.base_api_bean.ConfigUtils
import com.p.b.base_api_net.utils.DeviceUtils
import com.p.b.base_api_net.utils.HandleUtils
import com.p.b.comm.ENV
import com.p.b.comm.context.CContext
import com.p.b.comm.context.HookContext
import com.p.b.common.GAIDUtil
import com.p.b.common.MMKVUtils
import com.p.b.common.OverseaAppContext
import com.p.b.common.SPUtils
import com.p.b.common.adjust.AdJustInitUtils
import com.p.b.common.adjust.AdJustTokenAFUtils.doActivateDot
import com.p.b.common.adjust.AjConstants
import com.p.b.common.adjust.CommonConfig
import com.p.b.common.firebase.FireBaseInitUtils
import com.p.b.http.HostUtils
import com.p.b.pl223.hhoosstt.AdUtils
import com.tencent.mmkv.MMKV
import java.lang.ref.WeakReference

class YQK : BaseApplication() {

    companion object {
        var isBackgroundLaunch: Boolean = false

        @JvmStatic
        var appInstance: YQK? = null
                @JvmStatic
                var delayedNetworkTask:Runnable = Runnable {
                    if(SPUtils.isUserCommon()){
                        return@Runnable
                    }

                    //Adjust归因
                    AdJustInitUtils.initAdjust(
                        HostUtils.randomConfig_from_delay,
                        AjConstants.adjustAppToken,
                        false,
                        object : CommonConfig.OnConfigInterface{
                            override fun onSuccess() {
                                //归因状态
                                MMKVUtils.setUserStatus(true)
                                //拉取数据
                                FireBaseInitUtils.fetchData(HostUtils.randomConfig_from_delay)
                                com.p.b.common.doOnMainThreadIdle({
                                    InitAdAndTj.initJumpEvent(YQK.Companion.appInstance)
                                })
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
        appInstance = this
        APPContext.setApplication(this)
        CContext.setApplication(this)
        OverseaAppContext.setApplication(this)
        MMKV.initialize(this)
        // 初始化Firebase
        FirebaseApp.initializeApp(this)
        init()
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
              val intent = Intent(appBaseContext, AdTransitActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                //df.page(intent)
    }


    private fun init() {
        val distributionChannel: String =
            WalleChannelReader.getChannel(CContext.getApplication(), "GP").toString()
        SPUtils.setChannel(distributionChannel)
        val defaultConfiguration: String = ConfigUtils.getConfigJson(CContext.getApplication())
        ConfigUtils.initConfig(defaultConfiguration, 1)
        AdjustTokens.initAdJustToken(this)
        setupActivityMonitor()
        checkAdjustUpload()

        DeviceIdentifier.register(this);
        if (isStartWork() || ENV.logSwitch) {
            Log.d("AD_LOG", "初始化广告sdk")
            InitAdAndTj.initAdTj(appInstance)
            HandleUtils.postDelay(delayedNetworkTask, 10 * 1000)
        }
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