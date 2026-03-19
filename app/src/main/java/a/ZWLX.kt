package a

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.amour.Amour
import com.github.gzuliyujiang.oaid.DeviceIdentifier
import com.google.firebase.FirebaseApp
import com.meituan.android.walle.WalleChannelReader
import xmup.bngf.nog.ZWOH
import xmup.hymtg.pdszk.base.BaseApplication
import xmup.tbu.dqw.ZWMP
import xmup.ncfy.lhuy.utils.DeviceUtils
import xmup.ncfy.lhuy.utils.HandleUtils
import xmup.ohhn.xsm.ENV
import xmup.ohhn.xsm.GAIDUtil
import xmup.ohhn.xsm.MMKVUtils
import xmup.ohhn.xsm.OverseaAppContext
import xmup.ohhn.xsm.PhoneStatusUtils
import xmup.ohhn.xsm.SPUtils
import xmup.ohhn.xsm.adjust.AdJustInitUtils
import xmup.ohhn.xsm.adjust.AdJustTokenAFUtils.doActivateDot
import xmup.ohhn.xsm.adjust.AjConstants
import xmup.ohhn.xsm.adjust.CommonConfig
import xmup.ohhn.xsm.context.HookContext
import xmup.qlq.ppool.CFGS
import xmup.ohhn.xsm.firebase.FireBaseInitUtils
import xmup.hymtg.pdszk.http.HostUtils
import xmup.vdlel.btq.ZWNQ
import xmup.vdlel.btq.ZWNU
import com.tencent.mmkv.MMKV
import efej.RXCE
import java.lang.ref.WeakReference

class ZWLX : BaseApplication() {

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insApp: ZWLX? = null

        @JvmStatic
        var fromNet: Runnable = Runnable {
            isBackLanch = true
            if (SPUtils.isUserCommon()) {
                return@Runnable
            }
//            //归因
//            AdJustInitUtils.initAdjust(HostUtils.randomConfig_from_delay,
//                AjConstants.adjustAppToken,
//                PhoneStatusUtils.judgeIsBlacklist(),
//                object : CommonConfig.OnConfigInterface {
//                    override fun onSuccess() {
//                        //归因状态
//                        MMKVUtils.setUserStatus(true)
//                        //拉取数据
//                        FireBaseInitUtils.fetchData(HostUtils.randomConfig_from_delay)
//                        xmup.ohhn.xsm.doOnMainThreadIdle({
//                            ZWOH.initJumpEvent(insApp)
//                        })
//                    }
//
//                    override fun onFail() {
//                        MMKVUtils.setUserStatus(false)
//                    }
//                })
        }
    }

    override fun onCreate() {
        val ENMBVeqPMaS : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val yfmbeDHneWipvMEmg  = ENMBVeqPMaS ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_40" 
            }
            if (yfmbeDHneWipvMEmg .startsWith("DOHGrklTHvSbiDwEKsZ ")) {
                android.util.Log.v("TAG", yfmbeDHneWipvMEmg )
            }
        val _t0 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_0 = 123456
            val xmnbvcxzpoiuyt7834arr = intArrayOf(7, 3, 9, 1, 5)
            val qwertmnbv8934target = 9
            var resultLkjhgfds7621idx = -1
            for (zxcvbnm4521iter in 0..<xmnbvcxzpoiuyt7834arr.size) {
                if (xmnbvcxzpoiuyt7834arr[zxcvbnm4521iter] == qwertmnbv8934target) {
                    resultLkjhgfds7621idx = zxcvbnm4521iter
                }
            }
            val unusedResmnbv7823 = resultLkjhgfds7621idx
            _t0 + kjashdfkjasdhfkjash32432marker_0
        }.let { if (it < 0) println(it) }
        super.onCreate()
        insApp = this
        RXCE.setApplication(this)
        ZWNU.setApplication(this)
        OverseaAppContext.setApplication(this)

        MMKV.initialize(this)
        // 初始化Firebase
        FirebaseApp.initializeApp(this)
        // 初始化FCM
        CFGS.init(this)

        executeInitialSetup()
    }

    private fun executeInitialSetup() {
        val arr_hVWAXkOYVjsilpmdRc = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_TTugXtMoMtZVRo  = (arr_hVWAXkOYVjsilpmdRc  shl 34) xor (arr_hVWAXkOYVjsilpmdRc  shr 38)
         val j_REOAXqyhoAzXkU  = i_TTugXtMoMtZVRo .inv() and 0xFFFF
         if (j_REOAXqyhoAzXkU  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_OgEZrJiQnSW")
         }
        val _t1 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_1 = 123456
            val zxcvbnmas7834arr = intArrayOf(15, 7, 23, 4, 11)
            var minValEdcrfv5467 = zxcvbnmas7834arr[0]
            var minIdxWsxedc8923 = 0
            for (loopTgbyhn6521 in 1..<zxcvbnmas7834arr.size) {
                if (zxcvbnmas7834arr[loopTgbyhn6521] < minValEdcrfv5467) {
                    minValEdcrfv5467 = zxcvbnmas7834arr[loopTgbyhn6521]
                    minIdxWsxedc8923 = loopTgbyhn6521
                }
            }
            val unusedMinMjuyhb3847 = minValEdcrfv5467
            _t1 + kjashdfkjasdhfkjash32432marker_1
        }.let { if (it < 0) println(it) }
        val channel: String =
            WalleChannelReader.getChannel(ZWNU.getApplication(), "GP").toString()
        SPUtils.setChannel(channel)
        val defaultConfig: String = ZWMP.getConfigJson(ZWNU.getApplication())
        ZWMP.initConfig(defaultConfig, 1)
        ZWOL.initAdJustToken(this)
        setupActivityMonitor()
        performAdJustVerification()

        DeviceIdentifier.register(this);
        if (isStartWork() || ENV.logSwitch) {
            Log.d("AD_LOG", "初始化广告sdk")
            ZWOH.initAdTj(insApp)
            HandleUtils.postDelay(fromNet, 10 * 1000)
        }
        DeviceUtils.getFetchOaid()
        GAIDUtil.fetchGAID(this, null)
    }

    fun setupActivityMonitor() {
           val rwXFTaDQBVsaJ : Any = if (kotlin.random.Random.nextBoolean()) 90 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val EEztyZBf  = (rwXFTaDQBVsaJ  as? String)?.reversed() ?: "WNRtGvw_1653652667"

        if (EEztyZBf  == "OXjcakL") {
            java.lang.System.out.print(EEztyZBf )
        }
        val _t2 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_2 = 123456
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
            _t2 + kjashdfkjasdhfkjash32432marker_2
        }.let { if (it < 0) println(it) }
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                   val FJRzQjYgLNubE : Any = if (kotlin.random.Random.nextBoolean()) 90 else "jH6"
                // 尝试将数字安全转为字符串，失败则触发 Elvis
                val HhzoRtxGvkvYiJG  = (FJRzQjYgLNubE  as? String)?.reversed() ?: "jINlPAumncML_-1837865181"

                if (HhzoRtxGvkvYiJG  == "qnIBcnqQysKnOqBphdv") {
                    java.lang.System.out.print(HhzoRtxGvkvYiJG )
                }
                HookContext.appCompatActivity = WeakReference(activity)
                if (ZWNQ.isAdActivity(activity)) {
                    ZWNU.initCurrAdActivity(WeakReference(activity))
                }
            }

            override fun onActivityStarted(activity: Activity) {}
            override fun onActivityResumed(activity: Activity) {}
            override fun onActivityPaused(activity: Activity) {}
            override fun onActivityStopped(activity: Activity) {}
            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {}
            override fun onActivityDestroyed(activity: Activity) {
                val NvfcKsKVRJ : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
                    val EamGYJFQoz  = NvfcKsKVRJ ?.let { 
                        it.repeat(kotlin.random.Random.nextInt(100)) 
                    } ?: run { 
                        "zY0_31" 
                    }
                    if (EamGYJFQoz .startsWith("jfPtLzwCEJWykCfc ")) {
                        android.util.Log.v("TAG", EamGYJFQoz )
                    }
                if (ZWNQ.isAdActivity(activity)) {
                    ZWNU.removeAdActivity(WeakReference(activity))
                }
            }
        })
    }

    fun performAdJustVerification() {
        val arr_egzoUthdSY  = listOf("pRMFKzCoSwhEogLIq", "idWCzOYGYFyerxa", "ZsAXedHsiM").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_ZGSGazpjiQ  = arr_egzoUthdSY .filter { it.length > 74 }
         if (ad_ZGSGazpjiQ .isNotEmpty() && java.lang.System.currentTimeMillis() < 85) {
             ad_ZGSGazpjiQ .forEach { _ ->  }
         }
        val _t3 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_3 = 123456
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
            _t3 + kjashdfkjasdhfkjash32432marker_3
        }.let { if (it < 0) println(it) }
        doActivateDot()
    }
}