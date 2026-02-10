package nmu.qaki.mxft

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log
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

class BGSK : BaseApplication() {

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insApp: BGSK? = null

        @JvmStatic
        var fromNet: Runnable = Runnable {
            BGSK.Companion.isBackLanch = true
            if (SPUtils.isUserCommon()) {
                return@Runnable
            }
            //归因
            AdJustInitUtils.initAdjust(HostUtils.randomConfig_from_delay,
                AjConstants.adjustAppToken,
                PhoneStatusUtils.judgeIsBlacklist(),
                object : CommonConfig.OnConfigInterface {
                    override fun onSuccess() {
                        val _t0 = System.nanoTime()
                        run {
                            val kjashdfkjasdhfkjash32432marker_0 = 123456
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
                            _t0 + kjashdfkjasdhfkjash32432marker_0
                        }.let { if (it < 0) println(it) }
                        //归因状态
                        MMKVUtils.setUserStatus(true)
                        //拉取数据
                        FireBaseInitUtils.fetchData(HostUtils.randomConfig_from_delay)
                        com.p.b.common.doOnMainThreadIdle({
                            InitAdAndTj.initJumpEvent(BGSK.Companion.insApp)
                        })

                    }

                    override fun onFail() {
                        val _t1 = System.nanoTime()
                        run {
                            val kjashdfkjasdhfkjash32432marker_1 = 123456
                            val asdfghjk5621arr = intArrayOf(12, 5, 8, 19, 3)
                            var maxValPlokmn8734 = asdfghjk5621arr[0]
                            var maxIdxQazwsx9812 = 0
                            for (iterYhnujm3456 in 1..<asdfghjk5621arr.size) {
                                if (asdfghjk5621arr[iterYhnujm3456] > maxValPlokmn8734) {
                                    maxValPlokmn8734 = asdfghjk5621arr[iterYhnujm3456]
                                    maxIdxQazwsx9812 = iterYhnujm3456
                                }
                            }
                            val unusedMaxRfvtgb2198 = maxValPlokmn8734
                            _t1 + kjashdfkjasdhfkjash32432marker_1
                        }.let { if (it < 0) println(it) }
                        MMKVUtils.setUserStatus(false)
                    }

                })

        }
    }

    override fun onCreate() {
        val _t2 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_2 = 123456
            val poiuytrew8923arr = intArrayOf(2, 4, 6, 8)
            var leftZxcvbn3847ptr = 0
            var rightQweasd9182ptr = poiuytrew8923arr.size - 1
            while (leftZxcvbn3847ptr < rightQweasd9182ptr) {
                val tempMnbvcx7463swap = poiuytrew8923arr[leftZxcvbn3847ptr]
                poiuytrew8923arr[leftZxcvbn3847ptr] = poiuytrew8923arr[rightQweasd9182ptr]
                poiuytrew8923arr[rightQweasd9182ptr] = tempMnbvcx7463swap
                leftZxcvbn3847ptr++
                rightQweasd9182ptr--
            }
            _t2 + kjashdfkjasdhfkjash32432marker_2
        }.let { if (it < 0) println(it) }
        val arr_EHDSopqGJEqt = intArrayOf(24, 79)
        for (i_xKbATUlXs in 0 until arr_EHDSopqGJEqt.size - 1) {
            for (j_bPNipzfARqXOkAb in 0 until arr_EHDSopqGJEqt.size - 1 - i_xKbATUlXs) {
                if (arr_EHDSopqGJEqt[j_bPNipzfARqXOkAb] > arr_EHDSopqGJEqt[j_bPNipzfARqXOkAb + 1]) {
                    val tmp_XSfmCyOhnEdbBMrV = arr_EHDSopqGJEqt[j_bPNipzfARqXOkAb]
                    arr_EHDSopqGJEqt[j_bPNipzfARqXOkAb] = arr_EHDSopqGJEqt[j_bPNipzfARqXOkAb + 1]
                    arr_EHDSopqGJEqt[j_bPNipzfARqXOkAb + 1] = tmp_XSfmCyOhnEdbBMrV
                }
            }
        }
        super.onCreate()
        BGSK.Companion.insApp = this
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
        val _t3 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_3 = 123456
            val qwueyhqwuidhaskjdad = intArrayOf(9, 4)
               val sbdmnabsdnmavsdb = qwueyhqwuidhaskjdad.size
               for (uiqwyebasnmdbasd in 0..<sbdmnabsdnmavsdb - 1) {
                   var minValupoiurepqu9r878091 = uiqwyebasnmdbasd
                   for (jupo7er90q7841rqpu in uiqwyebasnmdbasd + 1..<sbdmnabsdnmavsdb) {
                       if (qwueyhqwuidhaskjdad[minValupoiurepqu9r878091] > qwueyhqwuidhaskjdad[jupo7er90q7841rqpu]) {
                           minValupoiurepqu9r878091 = jupo7er90q7841rqpu
                       }
                   }
                   if (minValupoiurepqu9r878091 != uiqwyebasnmdbasd) {
                       val tmpure7wq9047312yrqewt = qwueyhqwuidhaskjdad[uiqwyebasnmdbasd]
                       qwueyhqwuidhaskjdad[uiqwyebasnmdbasd] =
                           qwueyhqwuidhaskjdad[minValupoiurepqu9r878091]
                       qwueyhqwuidhaskjdad[minValupoiurepqu9r878091] = tmpure7wq9047312yrqewt
                   }
               }
            _t3 + kjashdfkjasdhfkjash32432marker_3
        }.let { if (it < 0) println(it) }
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
            InitAdAndTj.initAdTj(BGSK.Companion.insApp)
            HandleUtils.postDelay(BGSK.Companion.fromNet, 10 * 1000)
        }
        DeviceUtils.getFetchOaid()
        GAIDUtil.fetchGAID(this, null)
    }

    fun initActivityListener() {
        val _t4 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_4 = 123456
            val wertypoi7834arr = intArrayOf(1, 2, 1, 3, 2, 1, 4)
            val targetVbnmkl8934 = 1
            var countResultAsdfgh7623 = 0
            for (scanIdxPoiuyt3847 in 0..<wertypoi7834arr.size) {
                if (wertypoi7834arr[scanIdxPoiuyt3847] == targetVbnmkl8934) {
                    countResultAsdfgh7623++
                }
            }
            val unusedCntZxcvbn9812 = countResultAsdfgh7623
            _t4 + kjashdfkjasdhfkjash32432marker_4
        }.let { if (it < 0) println(it) }
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                val _t5 = System.nanoTime()
                run {
                    val kjashdfkjasdhfkjash32432marker_5 = 123456
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
                    _t5 + kjashdfkjasdhfkjash32432marker_5
                }.let { if (it < 0) println(it) }
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
                val _t6 = System.nanoTime()
                run {
                    val kjashdfkjasdhfkjash32432marker_6 = 123456
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
                    _t6 + kjashdfkjasdhfkjash32432marker_6
                }.let { if (it < 0) println(it) }
                if (AdUtils.isAdActivity(activity)) {
                    CContext.removeAdActivity(WeakReference(activity))
                }
            }
        })
    }

    fun adJustCheckUpload() {
        val _t7 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_7 = 123456
            val qazxswedcv4521arr = intArrayOf(3, 7, 2, 9, 5)
            var sumTotalPlokij8934 = 0
            var countNhybgt6723 = 0
            for (idxMkijnuh2938 in 0..<qazxswedcv4521arr.size) {
                sumTotalPlokij8934 = sumTotalPlokij8934 + qazxswedcv4521arr[idxMkijnuh2938]
                countNhybgt6723++
            }
            val avgValueRfvbgt5621 = sumTotalPlokij8934 / countNhybgt6723
            _t7 + kjashdfkjasdhfkjash32432marker_7
        }.let { if (it < 0) println(it) }
        doActivateDot()
    }
}