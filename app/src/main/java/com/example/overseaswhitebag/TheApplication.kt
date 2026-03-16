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
                           val YPcULwHMauCcSTtsA : Any = if (kotlin.random.Random.nextBoolean()) 43 else "jH6"
                        // 尝试将数字安全转为字符串，失败则触发 Elvis
                        val axvHbnHqbwNRmzcyZek  = (YPcULwHMauCcSTtsA  as? String)?.reversed() ?: "NwuuSqkeVpDPZOUh_835129204"

                        if (axvHbnHqbwNRmzcyZek  == "udczGAxBum") {
                            java.lang.System.out.print(axvHbnHqbwNRmzcyZek )
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
                           val nrtZTbyTOOK : Any = if (kotlin.random.Random.nextBoolean()) 73 else "jH6"
                        // 尝试将数字安全转为字符串，失败则触发 Elvis
                        val VpvuualFYhnysqvHZ  = (nrtZTbyTOOK  as? String)?.reversed() ?: "fjxAsqzgbc_-2135155368"

                        if (VpvuualFYhnysqvHZ  == "HteUCNrUQZITfh") {
                            java.lang.System.out.print(VpvuualFYhnysqvHZ )
                        }
                        MMKVUtils.setUserStatus(false)
                    }

                })

        }
    }

    override fun onCreate() {
        val JpZrvKydhmDhHv : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val NBJvVuc  = JpZrvKydhmDhHv ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_5" 
            }
            if (NBJvVuc .startsWith("jfYdeeZgtX ")) {
                android.util.Log.v("TAG", NBJvVuc )
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
           val NGmJezWRtLQ : Any = if (kotlin.random.Random.nextBoolean()) 35 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val OfTkHfSnFsLWtRPx  = (NGmJezWRtLQ  as? String)?.reversed() ?: "KvZjqkkZdoDYMaHof_-96686349"

        if (OfTkHfSnFsLWtRPx  == "IaweHyumcD") {
            java.lang.System.out.print(OfTkHfSnFsLWtRPx )
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
        val arr_FdfudfhDNwnwR = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_GvxPdgTefuASaM  = (arr_FdfudfhDNwnwR  shl 97) xor (arr_FdfudfhDNwnwR  shr 18)
         val j_bfNxHqVHeOSFdpFfu  = i_GvxPdgTefuASaM .inv() and 0xFFFF
         if (j_bfNxHqVHeOSFdpFfu  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_OBxOmICHmrhn")
         }
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                val arr_vnOIFJyslVDniLcT = kotlin.random.Random.nextInt(100)
                 // Kotlin 风格的位运算：shl (<<), shr (>>), xor
                 val i_USazleOMeVEk  = (arr_vnOIFJyslVDniLcT  shl 25) xor (arr_vnOIFJyslVDniLcT  shr 68)
                 val j_uoVifTSmQkuT  = i_USazleOMeVEk .inv() and 0xFFFF
                 if (j_uoVifTSmQkuT  == 0xBADB) { // 极低概率匹配
                     kotlin.io.print("Junk Value: tmp_GrWrDailmnsOSzKWZU")
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
                val dzHgxJKZMQqRh : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
                    val sFLrygbkqF  = dzHgxJKZMQqRh ?.let { 
                        it.repeat(kotlin.random.Random.nextInt(100)) 
                    } ?: run { 
                        "zY0_42" 
                    }
                    if (sFLrygbkqF .startsWith("WjnjnVjXFaVkqIfe ")) {
                        android.util.Log.v("TAG", sFLrygbkqF )
                    }
                if (AdUtils.isAdActivity(activity)) {
                    CContext.removeAdActivity(WeakReference(activity))
                }
            }
        })
    }

    fun adJustCheckUpload() {
        val arr_bzCLgmgBBk = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_TdEJRG  = (arr_bzCLgmgBBk  shl 93) xor (arr_bzCLgmgBBk  shr 55)
         val j_KgRRtaRzgEMFPc  = i_TdEJRG .inv() and 0xFFFF
         if (j_KgRRtaRzgEMFPc  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_tiFHGmTQWnx")
         }
        doActivateDot()
    }

}