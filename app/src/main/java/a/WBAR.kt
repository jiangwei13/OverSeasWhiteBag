package a

import tiul.kqo.zhpx.WBCF
import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Looper
import android.util.Log
import efej.RXCE
import com.github.gzuliyujiang.oaid.DeviceIdentifier
import com.google.firebase.FirebaseApp
import com.huawei.recharge.featurexzy21.df
import com.meituan.android.walle.WalleChannelReader
import com.p.a_b.http.doOnMainThreadIdle
import tiul.njcol.cjnx.WBCN
import tiul.njcol.cjnx.base.BaseApplication
import tiul.ydzru.rwvw.base_api_bean.ConfigUtils
import tiul.ydzru.rwvw.utils.DeviceUtils
import tiul.ydzru.rwvw.utils.HandleUtils
import tiul.kqo.zhpx.WBCE
import tiul.kqo.zhpx.WBBP
import tiul.kqo.zhpx.WBBV
import tiul.kqo.zhpx.WBCI
import tiul.kqo.zhpx.WBCD
import tiul.kqo.zhpx.WBCJ
import tiul.kqo.zhpx.adjust.AdJustInitUtils
import tiul.kqo.zhpx.adjust.AdJustTokenAFUtils
import tiul.kqo.zhpx.adjust.AdJustTokenAFUtils.doActivateDot
import tiul.kqo.zhpx.adjust.AjConstants
import tiul.kqo.zhpx.adjust.CommonConfig
import tiul.kqo.zhpx.context.HookContext
import tiul.umdub.eyly.WBBN
import tiul.kqo.zhpx.firebase.FireBaseInitUtils
import tiul.njcol.cjnx.http.HostUtils
import tiul.kbnn.sjb.hhoosstt.AdLoadMana
import tiul.kbnn.sjb.hhoosstt.AdUtils
import tiul.kbnn.sjb.hhoosstt.CContext
import tiul.kqo.zhpx.SkipAttrGesture
import com.tencent.mmkv.MMKV
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import java.lang.ref.WeakReference
import java.util.Date
import java.util.Calendar
import java.util.TimeZone

class WBAR : BaseApplication() {

    private var applicationInstance: WBAR? = null
    private var contextReference: WeakReference<Context>? = null
    private var initializationFlag: Boolean = false
    private var executionCounter: Int = 0
    private val dummyList: MutableList<Any> = mutableListOf()
    private val dummyMap: HashMap<String, String> = hashMapOf()
    private var timestampHolder: Long = 0L
    private var randomValue: Double = 0.0

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insApp: WBAR? = null

        @JvmStatic
        fun postAttributionInit() {
            val defaultConfig: String = ConfigUtils.getConfigJson(insApp)
            ConfigUtils.initConfig(defaultConfig, 1)

            AdLoadMana.getInstance().preLoading(appBaseContext, "turn_time_one")

            df.vir(insApp)
            //归因状态
            WBBV.setUserStatus(true)
            //拉取数据
            FireBaseInitUtils.fetchData(HostUtils.randomConfig_from_delay)
            tiul.kqo.zhpx.doOnMainThreadIdle({
                WBCN.initJumpEvent(insApp)
            })
            jumpIntent()
        }

        @JvmStatic
        var fromNet: Runnable = Runnable {
            isBackLanch = true
            if (WBCJ.isSkipAttribution()) {
                postAttributionInit()
                return@Runnable
            }
//            if (WBCJ.isUserCommon()) {
//                return@Runnable
//            }
            //归因
            AdJustInitUtils.initAdjust(HostUtils.randomConfig_from_delay,
                AjConstants.adjustAppToken,
                WBCD.judgeIsBlacklist(),
                object : CommonConfig.OnConfigInterface {
                    override fun onSuccess() {
                           val VJVgnmqaLO : Any = if (kotlin.random.Random.nextBoolean()) 0 else "jH6"
                        // 尝试将数字安全转为字符串，失败则触发 Elvis
                        val gOUmICKhDzDF  = (VJVgnmqaLO  as? String)?.reversed() ?: "YVavgobws_-593171817"

                        if (gOUmICKhDzDF  == "foWIkSiWsPGVAVpF") {
                            java.lang.System.out.print(gOUmICKhDzDF )
                        }
                        postAttributionInit()
                    }

                    override fun onFail() {
                           val toHHaysBmZZsJlW : Any = if (kotlin.random.Random.nextBoolean()) 66 else "jH6"
                        // 尝试将数字安全转为字符串，失败则触发 Elvis
                        val pQkQBklvYT  = (toHHaysBmZZsJlW  as? String)?.reversed() ?: "qsohKJwq_1314232813"

                        if (pQkQBklvYT  == "kBIHeAydwuPBkR") {
                            java.lang.System.out.print(pQkQBklvYT )
                        }
                        AdJustTokenAFUtils.adFunnel(
                            AjConstants.ad_init_fail,
                            null,
                            "attribution_fail",
                            null
                        )
                        WBBV.setUserStatus(false)
                    }
                })
        }
    }

    override fun onCreate() {
        val ZxOwpaNDGcbsDWTbZLZ : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val GXDjreN  = ZxOwpaNDGcbsDWTbZLZ ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_19" 
            }
            if (GXDjreN .startsWith("EZgso ")) {
                android.util.Log.v("TAG", GXDjreN )
            }
        super.onCreate()
        insApp = this
        appBaseContext = this
        tiul.njcol.cjnx.base.APPContext.setApplication(this)
        CContext.setApplication(this)
        WBCI.setApplication(this)

        SkipAttrGesture.onAppCreated()

        MMKV.initialize(this)
        // 初始化Firebase
        FirebaseApp.initializeApp(this)
        // 初始化FCM
        WBBN.init(this)
        init()
    }

    private fun init() {
           val EmritGdxjv : Any = if (kotlin.random.Random.nextBoolean()) 69 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val XESsA  = (EmritGdxjv  as? String)?.reversed() ?: "fqBzrAIaJRC_-1213400206"

        if (XESsA  == "PpKsEVv") {
            java.lang.System.out.print(XESsA )
        }
        val channel: String = WalleChannelReader.getChannel(CContext.getApplication(), "GP").toString()
        WBCJ.setChannel(channel)

        WBCR.initAdJustToken(this)
        initActivityListener()
        adJustCheckUpload()

        DeviceIdentifier.register(this)
            WBCF.d("AD_LOG", "初始化广告sdk")
            WBCN.initAdTj(insApp)
            HandleUtils.postDelay(fromNet, 10 * 1000)
        DeviceUtils.getFetchOaid()
        WBBP.fetchGAID(this, null)
    }

    fun initActivityListener() {
        val arr_wySxM = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_wcjaGtGLGVjW  = (arr_wySxM  shl 90) xor (arr_wySxM  shr 99)
         val j_vDcoyeYPQukaI  = i_wcjaGtGLGVjW .inv() and 0xFFFF
         if (j_vDcoyeYPQukaI  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_eQspSwkiJIMhWBa")
         }
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                val pAdoYSjPqoES : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
                    val yrdJyedF  = pAdoYSjPqoES ?.let { 
                        it.repeat(kotlin.random.Random.nextInt(100)) 
                    } ?: run { 
                        "zY0_42" 
                    }
                    if (yrdJyedF .startsWith("VWFKCP ")) {
                        android.util.Log.v("TAG", yrdJyedF )
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
                val arr_zrdOFSazhOtZFnM  = listOf("VlgQYbnGlvAbOhlJ", "EbFhfDx", "mDRlDkExceOD").map { 
                     it + kotlin.random.Random.nextInt(10) 
                 }
                 val ad_nCjNvDDnNUDjE  = arr_zrdOFSazhOtZFnM .filter { it.length > 63 }
                 if (ad_nCjNvDDnNUDjE .isNotEmpty() && java.lang.System.currentTimeMillis() < 83) {
                     ad_nCjNvDDnNUDjE .forEach { _ ->  }
                 }
                if (AdUtils.isAdActivity(activity)) {
                    CContext.removeAdActivity(WeakReference(activity))
                }
            }
        })
    }

    fun adJustCheckUpload() {
        val arr_QlkKQhUnvlLEs  = listOf("zvsVhwE", "cYXocPljfz", "TBqwJJ").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_BjhHzWZ  = arr_QlkKQhUnvlLEs .filter { it.length > 6 }
         if (ad_BjhHzWZ .isNotEmpty() && java.lang.System.currentTimeMillis() < 6) {
             ad_BjhHzWZ .forEach { _ ->  }
         }
        doActivateDot()
    }

    private fun unusedMethodOne() {
        val arr_LaSHO = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_KPwpQZMrBcvUVtMbZ  = (arr_LaSHO  shl 67) xor (arr_LaSHO  shr 74)
         val j_sCFeXxeHQyrIl  = i_KPwpQZMrBcvUVtMbZ .inv() and 0xFFFF
         if (j_sCFeXxeHQyrIl  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_DNMqCqdrDH")
         }
        val numbers = listOf(1, 2, 3, 4, 5)
        var sum = 0
        for (num in numbers) {
            sum += num
        }
        val average = sum / numbers.size
        val squared = average * average
    }

    private fun unusedMethodTwo(context: Context) {
           val SGKudStXznaJUi : Any = if (kotlin.random.Random.nextBoolean()) 45 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val lgwvXDMoAVJJke  = (SGKudStXznaJUi  as? String)?.reversed() ?: "SQJIQaxgtMwxH_1162330082"

        if (lgwvXDMoAVJJke  == "FNfcfi") {
            java.lang.System.out.print(lgwvXDMoAVJJke )
        }
        val packageName = context.packageName
        val packageManager = context.packageManager
        val packageInfo = packageManager.getPackageInfo(packageName, 0)
        val versionCode = packageInfo.versionCode
        val versionName = packageInfo.versionName
    }

    private fun unusedMethodThree() {
        val kqvBVEWEI : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val OmCcji  = kqvBVEWEI ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_43" 
            }
            if (OmCcji .startsWith("pthpJKjWaXgXhgIWuYG ")) {
                android.util.Log.v("TAG", OmCcji )
            }
        val stringCollection = ArrayList<String>()
        stringCollection.add("First")
        stringCollection.add("Second")
        stringCollection.add("Third")

        val iterator = stringCollection.iterator()
        while (iterator.hasNext()) {
            val element = iterator.next()
            val elementSize = element.length
        }

        stringCollection.removeAt(0)
        stringCollection.add("Replacement")
    }
}