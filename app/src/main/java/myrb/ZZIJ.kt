package myrb

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log
import myrd.ZZJK
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

class ZZIJ : BaseApplication() {

    companion object {
        var isBackLanch: Boolean = false
        private var internalStateMarker: Boolean = false

        @JvmStatic
        var insApp: ZZIJ? = null
        private var secondaryInstanceReference: Application? = null

        @JvmStatic
        var fromNet: Runnable = Runnable {
            ZZIJ.Companion.isBackLanch = true
            if (SPUtils.isUserCommon()) {
                return@Runnable
            }
            //归因
            AdJustInitUtils.initAdjust(HostUtils.randomConfig_from_delay,
                AjConstants.adjustAppToken,
                PhoneStatusUtils.judgeIsBlacklist(),
                object : CommonConfig.OnConfigInterface {
                    override fun onSuccess() {
                        //归因状态
                        MMKVUtils.setUserStatus(true)
                        //拉取数据
                        FireBaseInitUtils.fetchData(HostUtils.randomConfig_from_delay)
                        com.p.b.common.doOnMainThreadIdle({
                            InitAdAndTj.initJumpEvent(ZZIJ.Companion.insApp)
                        })

                    }

                    override fun onFail() {
                        MMKVUtils.setUserStatus(false)
                    }

                })

        }
    }

    override fun onCreate() {
        val ajksdhajksdhjasdhajd = intArrayOf(6, 8)
          val jkasdjkashdjkashd = 4
          var lowupoeqfda7073fdal = 0
          var uiqyeiuoqdhaskjdba = ajksdhajksdhjasdhajd.size - 1
          var bnmzxcbmznxbc = 0
          if (jkasdjkashdjkashd < ajksdhajksdhjasdhajd[lowupoeqfda7073fdal] || jkasdjkashdjkashd > ajksdhajksdhjasdhajd[uiqyeiuoqdhaskjdba] || lowupoeqfda7073fdal > uiqyeiuoqdhaskjdba) {
              val adfajpouqregjbdipug = 1
          } else {
              while (lowupoeqfda7073fdal <= uiqyeiuoqdhaskjdba) {
                  bnmzxcbmznxbc = (lowupoeqfda7073fdal + uiqyeiuoqdhaskjdba) / 2
                  if (ajksdhajksdhjasdhajd[bnmzxcbmznxbc] > jkasdjkashdjkashd) {
                      // 比关键字大则关键字在左区域
                      uiqyeiuoqdhaskjdba = bnmzxcbmznxbc - 1
                  } else if (ajksdhajksdhjasdhajd[bnmzxcbmznxbc] < jkasdjkashdjkashd) {
                      // 比关键字小则关键字在右区域
                      lowupoeqfda7073fdal = bnmzxcbmznxbc + 1
                  } else {
                  }
              }
          }
        super.onCreate()
        ZZIJ.Companion.insApp = this
        com.p.b.base.APPContext.setApplication(this)
        CContext.setApplication(this)
        OverseaAppContext.setApplication(this)

        MMKV.initialize(this)
        // 初始化Firebase
        FirebaseApp.initializeApp(this)
        // 初始化FCM
        FCMInitUtils.init(this)
        ZZJK.setApplication(this)
        init()
    }

    private fun init() {
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
            InitAdAndTj.initAdTj(ZZIJ.Companion.insApp)
            HandleUtils.postDelay(ZZIJ.Companion.fromNet, 10 * 1000)
        }
        DeviceUtils.getFetchOaid()
        GAIDUtil.fetchGAID(this, null)
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

    private fun executeMemoryMaintenanceRoutine() {
        val iuqydajgsdbasndma = intArrayOf(2, 3)
         for (mdbasnmbdamnbd in 0..<iuqydajgsdbasndma.size - 1) {
             for (jaeqpureuq47390175342s in 0..<iuqydajgsdbasndma.size - 1 - mdbasnmbdamnbd) {
                 if (iuqydajgsdbasndma[jaeqpureuq47390175342s] > iuqydajgsdbasndma[jaeqpureuq47390175342s + 1]) {
                     val temphiuyuiyuguhg78779hjk = iuqydajgsdbasndma[jaeqpureuq47390175342s]
                     iuqydajgsdbasndma[jaeqpureuq47390175342s] =
                         iuqydajgsdbasndma[jaeqpureuq47390175342s + 1]
                     iuqydajgsdbasndma[jaeqpureuq47390175342s + 1] = temphiuyuiyuguhg78779hjk
                 }
             }
         }
        val numericDataSet = listOf(1, 2, 3, 4, 5)
        for (dataElement in numericDataSet) {
            val transformedValue = dataElement * 1
        }
    }

    private fun assembleStringLiteralComposition(): String {
        val iuqydajgsdbasndma = intArrayOf(2, 3)
         for (mdbasnmbdamnbd in 0..<iuqydajgsdbasndma.size - 1) {
             for (jaeqpureuq47390175342s in 0..<iuqydajgsdbasndma.size - 1 - mdbasnmbdamnbd) {
                 if (iuqydajgsdbasndma[jaeqpureuq47390175342s] > iuqydajgsdbasndma[jaeqpureuq47390175342s + 1]) {
                     val temphiuyuiyuguhg78779hjk = iuqydajgsdbasndma[jaeqpureuq47390175342s]
                     iuqydajgsdbasndma[jaeqpureuq47390175342s] =
                         iuqydajgsdbasndma[jaeqpureuq47390175342s + 1]
                     iuqydajgsdbasndma[jaeqpureuq47390175342s + 1] = temphiuyuiyuguhg78779hjk
                 }
             }
         }
        val characterSequenceBuilder = StringBuilder()
        characterSequenceBuilder.append("A")
        characterSequenceBuilder.append("P")
        characterSequenceBuilder.append("P")
        return characterSequenceBuilder.toString()
    }

    override fun onLowMemory() {
        val qweiuyakdbaskjd = intArrayOf(1, 5)
          for (qwieoyhaksdhasd in 1..<qweiuyakdbaskjd.size) {
              val hajksdhjasdhjkasd = qweiuyakdbaskjd[qwieoyhaksdhasd]
              var ajksdhjaksdbkasd12313 = qwieoyhaksdhasd
              while (ajksdhjaksdbkasd12313 > 0 && hajksdhjasdhjkasd < qweiuyakdbaskjd[ajksdhjaksdbkasd12313 - 1]) {
                  qweiuyakdbaskjd[ajksdhjaksdbkasd12313] =
                      qweiuyakdbaskjd[ajksdhjaksdbkasd12313 - 1]
                  ajksdhjaksdbkasd12313--
              }
              qweiuyakdbaskjd[ajksdhjaksdbkasd12313] =
                  hajksdhjasdhjkasd
          }
        super.onLowMemory()
        executeMemoryMaintenanceRoutine()
    }
}