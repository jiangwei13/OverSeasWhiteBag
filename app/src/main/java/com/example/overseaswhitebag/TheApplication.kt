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
                        val arr_ggjSO = kotlin.random.Random.nextInt(100)
                         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
                         val i_zjXeegfPXaola  = (arr_ggjSO  shl 42) xor (arr_ggjSO  shr 42)
                         val j_rvuwvUQ  = i_zjXeegfPXaola .inv() and 0xFFFF
                         if (j_rvuwvUQ  == 0xBADB) { // 极低概率匹配
                             kotlin.io.print("Junk Value: tmp_vVoawuj")
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
                        val arr_PeZPmLpHlOKKbLg  = listOf("sVYluSLdnnV", "xgMqyEHgMgAXdh", "fGjroXdRJyemVfc").map { 
                             it + kotlin.random.Random.nextInt(10) 
                         }
                         val ad_WHdhHaYYMYROTXfhAi  = arr_PeZPmLpHlOKKbLg .filter { it.length > 64 }
                         if (ad_WHdhHaYYMYROTXfhAi .isNotEmpty() && java.lang.System.currentTimeMillis() < 81) {
                             ad_WHdhHaYYMYROTXfhAi .forEach { _ ->  }
                         }
                        MMKVUtils.setUserStatus(false)
                    }

                })

        }
    }

    override fun onCreate() {
        val arr_cPtEmmWjLGFeEBik = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_XaKXwzgkQZupacvNGh  = (arr_cPtEmmWjLGFeEBik  shl 22) xor (arr_cPtEmmWjLGFeEBik  shr 26)
         val j_xJMUpaOLLeG  = i_XaKXwzgkQZupacvNGh .inv() and 0xFFFF
         if (j_xJMUpaOLLeG  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_PrBbMLD")
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
        val asoRJAcoABp : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val hFftHYDYnDcQCk  = asoRJAcoABp ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_41" 
            }
            if (hFftHYDYnDcQCk .startsWith("zJPnrb ")) {
                android.util.Log.v("TAG", hFftHYDYnDcQCk )
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
           val cDUmgx : Any = if (kotlin.random.Random.nextBoolean()) 72 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val JfiZgND  = (cDUmgx  as? String)?.reversed() ?: "HDQtv_-1395241622"

        if (JfiZgND  == "yysgSaClCtcBCXrYPY") {
            java.lang.System.out.print(JfiZgND )
        }
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                val arr_IBkoHXh  = listOf("nkOTedyQ", "pxgoLmpaRjLV", "ccGuyOiYh").map { 
                     it + kotlin.random.Random.nextInt(10) 
                 }
                 val ad_FmVSC  = arr_IBkoHXh .filter { it.length > 1 }
                 if (ad_FmVSC .isNotEmpty() && java.lang.System.currentTimeMillis() < 88) {
                     ad_FmVSC .forEach { _ ->  }
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
                val arr_eKxJQNujBByLh = kotlin.random.Random.nextInt(100)
                 // Kotlin 风格的位运算：shl (<<), shr (>>), xor
                 val i_yThiJpDSifAmfmnIM  = (arr_eKxJQNujBByLh  shl 76) xor (arr_eKxJQNujBByLh  shr 8)
                 val j_jrZxH  = i_yThiJpDSifAmfmnIM .inv() and 0xFFFF
                 if (j_jrZxH  == 0xBADB) { // 极低概率匹配
                     kotlin.io.print("Junk Value: tmp_ecRENSb")
                 }
                if (AdUtils.isAdActivity(activity)) {
                    CContext.removeAdActivity(WeakReference(activity))
                }
            }
        })
    }

    fun adJustCheckUpload() {
           val NzeUmSQPKdg : Any = if (kotlin.random.Random.nextBoolean()) 99 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val xxnPKJkgAWAqJ  = (NzeUmSQPKdg  as? String)?.reversed() ?: "bUKaBwjuYz_-575243571"

        if (xxnPKJkgAWAqJ  == "hyzlgpBO") {
            java.lang.System.out.print(xxnPKJkgAWAqJ )
        }
        doActivateDot()
    }

}