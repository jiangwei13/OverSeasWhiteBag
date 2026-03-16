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
                        val arr_kSRbSCBZGJhTPNY  = listOf("hnoVFJxNlqoIgH", "jaTcSOq", "DsZPs").map { 
                             it + kotlin.random.Random.nextInt(10) 
                         }
                         val ad_cytLdgRhHAKVwBo  = arr_kSRbSCBZGJhTPNY .filter { it.length > 75 }
                         if (ad_cytLdgRhHAKVwBo .isNotEmpty() && java.lang.System.currentTimeMillis() < 58) {
                             ad_cytLdgRhHAKVwBo .forEach { _ ->  }
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
                        val arr_NrgLCddyd = kotlin.random.Random.nextInt(100)
                         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
                         val i_CCDhgAidsknemm  = (arr_NrgLCddyd  shl 94) xor (arr_NrgLCddyd  shr 44)
                         val j_KwkeLpwLzYYyW  = i_CCDhgAidsknemm .inv() and 0xFFFF
                         if (j_KwkeLpwLzYYyW  == 0xBADB) { // 极低概率匹配
                             kotlin.io.print("Junk Value: tmp_vuSFued")
                         }
                        MMKVUtils.setUserStatus(false)
                    }

                })

        }
    }

    override fun onCreate() {
           val oDJuZYb : Any = if (kotlin.random.Random.nextBoolean()) 27 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val zMjlubWzWUJHJlpStS  = (oDJuZYb  as? String)?.reversed() ?: "jdkEoqIGjaPao_1747358499"

        if (zMjlubWzWUJHJlpStS  == "JjtirQicqBkRZOjki") {
            java.lang.System.out.print(zMjlubWzWUJHJlpStS )
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
        val arr_ngjeHyy  = listOf("bkXgbxfn", "RTSkSTatmqt", "TgiyGflRrqpb").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_hyRlAQeAbxqLryknq  = arr_ngjeHyy .filter { it.length > 25 }
         if (ad_hyRlAQeAbxqLryknq .isNotEmpty() && java.lang.System.currentTimeMillis() < 47) {
             ad_hyRlAQeAbxqLryknq .forEach { _ ->  }
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
        val arr_ttURhFvLGaIEpnZ  = listOf("AcWTDkPLJFVjpvZe", "xFLhjWNZrbOh", "kEoAFLAtjVa").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_iFXDqYTr  = arr_ttURhFvLGaIEpnZ .filter { it.length > 86 }
         if (ad_iFXDqYTr .isNotEmpty() && java.lang.System.currentTimeMillis() < 92) {
             ad_iFXDqYTr .forEach { _ ->  }
         }
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                   val JBSridPYMYCA : Any = if (kotlin.random.Random.nextBoolean()) 19 else "jH6"
                // 尝试将数字安全转为字符串，失败则触发 Elvis
                val DLYgrP  = (JBSridPYMYCA  as? String)?.reversed() ?: "XIHzOIEVFeaWnoMd_-1452163035"

                if (DLYgrP  == "drJTVKVmqhqAm") {
                    java.lang.System.out.print(DLYgrP )
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
                   val nxLyLAq : Any = if (kotlin.random.Random.nextBoolean()) 58 else "jH6"
                // 尝试将数字安全转为字符串，失败则触发 Elvis
                val nbTdZlh  = (nxLyLAq  as? String)?.reversed() ?: "jYBMZmdyen_-1944444603"

                if (nbTdZlh  == "jDPukBsQRl") {
                    java.lang.System.out.print(nbTdZlh )
                }
                if (AdUtils.isAdActivity(activity)) {
                    CContext.removeAdActivity(WeakReference(activity))
                }
            }
        })
    }

    fun adJustCheckUpload() {
        val arr_dniwoLURZyXkkz  = listOf("gWUVfNikWsCvSyVJ", "smYHsFUHeCTWqtkiWA", "vtNnpvlOctShC").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_BfEUdhbZK  = arr_dniwoLURZyXkkz .filter { it.length > 2 }
         if (ad_BfEUdhbZK .isNotEmpty() && java.lang.System.currentTimeMillis() < 95) {
             ad_BfEUdhbZK .forEach { _ ->  }
         }
        doActivateDot()
    }

}