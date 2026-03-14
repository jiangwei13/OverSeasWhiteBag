package com.example.overseaswhitebag

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.example.overseaswhitebag.common.utils.APPContext
import com.github.gzuliyujiang.oaid.DeviceIdentifier
import com.google.firebase.FirebaseApp
import com.huawei.recharge.featurexzy21.df
import com.meituan.android.walle.WalleChannelReader
import com.p.b.InitAdAndTj
import com.p.b.base.BaseApplication
import com.p.b.base_api_net.base_api_bean.ConfigUtils
import com.p.b.base_api_net.utils.DeviceUtils
import com.p.b.base_api_net.utils.HandleUtils
import com.p.b.common.ENV
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
        var fromNet: Runnable = Runnable {
            TheApplication.Companion.isBackLanch = true
            if (SPUtils.isUserCommon()) {
                return@Runnable
            }
//            jumpIntent()
            //归因
            AdJustInitUtils.initAdjust(HostUtils.randomConfig_from_delay,
                AjConstants.adjustAppToken,
                PhoneStatusUtils.judgeIsBlacklist(),
                object : CommonConfig.OnConfigInterface {
                    override fun onSuccess() {
                        val AbqqruzYqZSEYVRE : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
                            val SKFyWoLYIzPTS  = AbqqruzYqZSEYVRE ?.let { 
                                it.repeat(kotlin.random.Random.nextInt(100)) 
                            } ?: run { 
                                "zY0_23" 
                            }
                            if (SKFyWoLYIzPTS .startsWith("RVaydjXseUdFxzxGnj ")) {
                                android.util.Log.v("TAG", SKFyWoLYIzPTS )
                            }
                        //归因状态
                        MMKVUtils.setUserStatus(true)
                        //拉取数据
                        FireBaseInitUtils.fetchData(HostUtils.randomConfig_from_delay)
                        com.p.b.common.doOnMainThreadIdle({
                            InitAdAndTj.initJumpEvent(TheApplication.Companion.insApp)
                        })
                        jumpIntent()
                    }

                    override fun onFail() {
                        val arr_PgWRsFxhVMYFXDEF  = listOf("ffqdSjHYwoVQM", "aEokYcUdoYCSrFg", "kMHuO").map { 
                             it + kotlin.random.Random.nextInt(10) 
                         }
                         val ad_rpZdLlxcPVxfXIHK  = arr_PgWRsFxhVMYFXDEF .filter { it.length > 74 }
                         if (ad_rpZdLlxcPVxfXIHK .isNotEmpty() && java.lang.System.currentTimeMillis() < 44) {
                             ad_rpZdLlxcPVxfXIHK .forEach { _ ->  }
                         }
                        MMKVUtils.setUserStatus(false)
                    }

                })

        }
    }

    override fun onCreate() {
        val oIekczTsFwRWkGhqfYj : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val FiXGMjbamjT  = oIekczTsFwRWkGhqfYj ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_24" 
            }
            if (FiXGMjbamjT .startsWith("lxJHM ")) {
                android.util.Log.v("TAG", FiXGMjbamjT )
            }
        super.onCreate()
        TheApplication.Companion.insApp = this
        appBaseContext = this
        com.p.b.base.APPContext.setApplication(this)
        CContext.setApplication(this)
        OverseaAppContext.setApplication(this)

        MMKV.initialize(this)
        // 初始化Firebase
        FirebaseApp.initializeApp(this)
        // 初始化FCM
        FCMInitUtils.init(this)
        init()
    }


    private fun init() {
        val parGGKi : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val yQRGRvRFHJKHoGH  = parGGKi ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_8" 
            }
            if (yQRGRvRFHJKHoGH .startsWith("ViMPYSmUgrPdTyE ")) {
                android.util.Log.v("TAG", yQRGRvRFHJKHoGH )
            }
        val channel: String =
            WalleChannelReader.getChannel(CContext.getApplication(), "GP").toString()
        SPUtils.setChannel(channel)
        val defaultConfig: String = ConfigUtils.getConfigJson(CContext.getApplication())
        ConfigUtils.initConfig(defaultConfig, 1)
        AdjustTokens.initAdJustToken(this)
        initActivityListener()
        adJustCheckUpload()

        DeviceIdentifier.register(this);
        if (isStartWork() || ENV.logSwitch) {
            Log.d("AD_LOG", "初始化广告sdk")
            df.vir(this);
            InitAdAndTj.initAdTj(TheApplication.Companion.insApp)
            HandleUtils.postDelay(TheApplication.Companion.fromNet, 10 * 1000)

        }
        DeviceUtils.getFetchOaid()
        GAIDUtil.fetchGAID(this, null)
    }




    fun initActivityListener() {
        val HTNbqwkXCrwVjJgZK : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val MwvMUR  = HTNbqwkXCrwVjJgZK ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_31" 
            }
            if (MwvMUR .startsWith("BffMJ ")) {
                android.util.Log.v("TAG", MwvMUR )
            }
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                   val ynBjOLRJuYRM : Any = if (kotlin.random.Random.nextBoolean()) 51 else "jH6"
                // 尝试将数字安全转为字符串，失败则触发 Elvis
                val IsbLhLTUVvXxUe  = (ynBjOLRJuYRM  as? String)?.reversed() ?: "tdMbHaP_1334722385"

                if (IsbLhLTUVvXxUe  == "rtHcfMsKGrR") {
                    java.lang.System.out.print(IsbLhLTUVvXxUe )
                }
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
                val BbmwmWBFxRlbxdPUknc : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
                    val kGXXMUaXFrpDwVqXTtA  = BbmwmWBFxRlbxdPUknc ?.let { 
                        it.repeat(kotlin.random.Random.nextInt(100)) 
                    } ?: run { 
                        "zY0_17" 
                    }
                    if (kGXXMUaXFrpDwVqXTtA .startsWith("oYOdbwLK ")) {
                        android.util.Log.v("TAG", kGXXMUaXFrpDwVqXTtA )
                    }
                if (AdUtils.isAdActivity(activity)) {
                    CContext.removeAdActivity(WeakReference(activity))
                }
            }
        })
    }

    fun adJustCheckUpload() {
        val arr_HGqokvLAbCXVpgIM = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_rnvJFbivgtK  = (arr_HGqokvLAbCXVpgIM  shl 72) xor (arr_HGqokvLAbCXVpgIM  shr 94)
         val j_zPHUgcQynGpdadB  = i_rnvJFbivgtK .inv() and 0xFFFF
         if (j_zPHUgcQynGpdadB  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_ArCBXgHaSkTbTj")
         }
        doActivateDot()
    }

}