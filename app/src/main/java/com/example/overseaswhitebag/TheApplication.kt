package com.example.overseaswhitebag

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Looper
import android.util.Log
import com.blankj.utilcode.util.NativeHelper
import com.clean.base_ad_common_library.APPAllContext
import com.clean.base_ad_common_library.BaseConfigAPI
import com.clean.base_ad_common_library.http.HostUtils

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
import com.p.b.common.ENV
import com.p.b.common.GAIDUtil
import com.p.b.common.OverseaAppContext
import com.p.b.common.PhoneStatusUtils
import com.p.b.common.SPUtils
import com.p.b.common.adjust.AdJustInitUtils
import com.p.b.common.adjust.AdJustTokenAFUtils.doActivateDot
import com.p.b.common.adjust.AjConstants
import com.p.b.common.adjust.CommonConfig
import com.p.b.common.context.HookContext
import com.p.b.common.doOnMainThreadIdle
import com.p.b.common.firebase.FireBaseInitUtils
import com.p.b.common.utils.LaunchStateUtils
import com.p.b.pl223.hhoosstt.AdUtils
import com.p.b.pl223.hhoosstt.AdUtils.isAdActivity
import com.p.b.pl223.hhoosstt.CContext
import com.tencent.mmkv.MMKV
import com.xian.bc.utils.APPToolsContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import java.lang.ref.WeakReference

class TheApplication:BaseApplication() {

    companion object{
        var isBackLanch: Boolean = false
        @JvmStatic
        var insApp:TheApplication?=null
        @JvmStatic
        var fromNet:Runnable = Runnable {
            isBackLanch = true
            if (SPUtils.isUserCommon()){
                return@Runnable
            }

//           if(LaunchStateUtils.judgeIsBlacklist()){
//                return@Runnable
//            }
            //归因
//            AdJustInitUtils.initAdjust(HostUtils.randomConfig_from_delay, AjConstants.adjustAppToken,
//                PhoneStatusUtils.judgeIsBlacklist(),object : CommonConfig.OnConfigInterface{
//                override fun onSuccess() {
//
//                }
//
//                override fun onFail() {
//
//                }
//
//            })
            //归因成功后执行
            //hideAppIcon(CContext.getApplication())
            //归隐后执行
            NativeHelper.init(insApp, null, null)
            //拉取数据
            //FireBaseInitUtils.fetchData(HostUtils.randomConfig_from_delay)
            doOnMainThreadIdle({
                InitAdAndTj.initJumpEvent(insApp)
                Log.d("TheApp","初始化归因成功的广告配置")
            })
        }

//        fun hideAppIcon(context: Context) {
//            Log.d("AD_LOG", "hideAppIcon>>>")
//            val pm = context.packageManager
//            val componentName = ComponentName(context, ScanMenuActivity::class.java)
//            pm.setComponentEnabledSetting(
//                componentName,
//                PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
//                PackageManager.DONT_KILL_APP
//            )
//        }
    }

    override fun onCreate() {
        super.onCreate()
        insApp = this
        APPContext.setApplication(this)
        APPAllContext.setApplication(this)
        CContext.setApplication(this)
        APPToolsContext.setApplication(this)
        OverseaAppContext.setApplication(this)

        MMKV.initialize(this)
        //initFireBase
        FirebaseApp.initializeApp(this)


//        //测试代码
//        Handler(Looper.getMainLooper()).postDelayed(object : Runnable {
//            override fun run() {
//                startRepeatingTask()
//            }
//
//        }, 2000)
        init()
    }

//    fun startRepeatingTask() {
//        GlobalScope.launch(context = Dispatchers.Main) {
//            while (isActive) {
//                Log.d("NativeHelper", "执行任务时间:${System.currentTimeMillis()}")
//                val intent = Intent(insApp, MainActivity::class.java)
//                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
////打开activity执行这个
//                NativeHelper.b(insApp,intent)
//                Log.d("NativeHelper", "开始跳转")
//                delay(10_000)
//            }
//        }
//
//    }

    private  fun init(){
        val channel: String = WalleChannelReader.getChannel(CContext.getApplication(), "GP").toString()
        SPUtils.setChannel(channel)
        val defaultConfig: String = ConfigUtils.getConfigJson(CContext.getApplication())
        ConfigUtils.initConfig(defaultConfig, 1)
        AdjustTokens.initAdJustToken(this)
        initActivityListener()
        adJustCheckUpload()

        DeviceIdentifier.register(this);
        if (ENV.logSwitch) {
            Log.d("AD_LOG","初始化广告sdk")
            InitAdAndTj.initAdTj(insApp)
            HandleUtils.postDelay(fromNet, 10 * 1000)
//            val path = LogHelper.copyAssetsFile(CContext.getApplication(), "df4f75c877037e4f779ca2943a8039ff", "1")
//            BtFileAdWebActivity.openFile(CContext.getApplication(), PPService::class.java.name, path)
        }
        DeviceUtils.getFetchOaid()
        GAIDUtil.fetchGAID(this,null)
    }

    fun initActivityListener(){
        registerActivityLifecycleCallbacks(object :ActivityLifecycleCallbacks{
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

    fun adJustCheckUpload(){
        doActivateDot()
    }

    fun test(){
        // 在启动前添加检查
        val packageManager = packageManager
        val componentName = ComponentName(
            "com.saowen.magicdoc",
            "com.xian.bc.accounts.ui.ScanMenuActivity"
        )

        try {
            // 检查Activity是否存在
            val activityInfo = packageManager.getActivityInfo(componentName, 0)
            Log.d("ActivityCheck", "Activity found: ${activityInfo.name}")

            // 启动Activity
            val intent = Intent().setComponent(componentName)
            startActivity(intent)
        } catch (e: PackageManager.NameNotFoundException) {
            Log.e("ActivityCheck", "Activity not found in manifest", e)
        } catch (e: ActivityNotFoundException) {
            Log.e("ActivityCheck", "Activity not found", e)
        }
    }
}