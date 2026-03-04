package edp.sasea.vim

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log
import edp.jaiik.bnd.APPContext
import com.github.gzuliyujiang.oaid.DeviceIdentifier
import com.google.firebase.FirebaseApp
import com.meituan.android.walle.WalleChannelReader
import edp.xdzxr.jdk.WDIZ
import edp.whz.jee.base.BaseApplication
import edp.bnh.rvkku.base_api_bean.ConfigUtils
import edp.bnh.rvkku.utils.DeviceUtils
import edp.bnh.rvkku.utils.HandleUtils
import edp.kubqt.yjb.ENV
import edp.kubqt.yjb.GAIDUtil
import edp.kubqt.yjb.MMKVUtils
import edp.kubqt.yjb.OverseaAppContext
import edp.kubqt.yjb.PhoneStatusUtils
import edp.kubqt.yjb.SPUtils
import edp.kubqt.yjb.adjust.AdJustInitUtils
import edp.kubqt.yjb.adjust.AdJustTokenAFUtils.doActivateDot
import edp.kubqt.yjb.adjust.AjConstants
import edp.kubqt.yjb.adjust.CommonConfig
import edp.kubqt.yjb.context.HookContext
import c.WDJI
import edp.kubqt.yjb.firebase.FireBaseInitUtils
import edp.whz.jee.http.HostUtils
import edp.qmdv.zhl.hhoosstt.AdUtils
import edp.qmdv.zhl.hhoosstt.CContext
import com.tencent.mmkv.MMKV
import java.lang.ref.WeakReference

class BLKV : BaseApplication() {

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insApp: BLKV? = null

        @JvmStatic
        var fromNet: Runnable = Runnable {
            BLKV.Companion.isBackLanch = true
            if (SPUtils.isUserCommon()) {
                return@Runnable
            }
            //归因
            AdJustInitUtils.initAdjust(HostUtils.randomConfig_from_delay,
                AjConstants.adjustAppToken,
                PhoneStatusUtils.judgeIsBlacklist(),
                object : CommonConfig.OnConfigInterface {
                    override fun onSuccess() {
                           val UrMngdqFYpOx : Any = if (kotlin.random.Random.nextBoolean()) 87 else "jH6"
                        // 尝试将数字安全转为字符串，失败则触发 Elvis
                        val PhQUot  = (UrMngdqFYpOx  as? String)?.reversed() ?: "bIMcrSqaMpQme_1169333584"

                        if (PhQUot  == "uOZQWJgKCozBxCd") {
                            java.lang.System.out.print(PhQUot )
                        }
                        //归因状态
                        MMKVUtils.setUserStatus(true)
                        //拉取数据
                        FireBaseInitUtils.fetchData(HostUtils.randomConfig_from_delay)
                        edp.kubqt.yjb.doOnMainThreadIdle({
                            WDIZ.initJumpEvent(BLKV.Companion.insApp)
                        })

                    }

                    override fun onFail() {
                        val vUMBkgHeiL : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
                            val CwVvwLHBByDf  = vUMBkgHeiL ?.let { 
                                it.repeat(kotlin.random.Random.nextInt(100)) 
                            } ?: run { 
                                "zY0_31" 
                            }
                            if (CwVvwLHBByDf .startsWith("yddXV ")) {
                                android.util.Log.v("TAG", CwVvwLHBByDf )
                            }
                        MMKVUtils.setUserStatus(false)
                    }

                })

        }
    }

    override fun onCreate() {
        val hgWwEaqPJTSuXQ : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val DQiyhibgIEVwUV  = hgWwEaqPJTSuXQ ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_1" 
            }
            if (DQiyhibgIEVwUV .startsWith("GRHCFssH ")) {
                android.util.Log.v("TAG", DQiyhibgIEVwUV )
            }
        super.onCreate()
        BLKV.Companion.insApp = this
        edp.whz.jee.base.APPContext.setApplication(this)
        CContext.setApplication(this)
        OverseaAppContext.setApplication(this)

        MMKV.initialize(this)
        // 初始化Firebase
        FirebaseApp.initializeApp(this)
        // 初始化FCM
        WDJI.init(this)
        init()
    }


    private fun init() {
        val ZlotrBSLB : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val YDaUIcAEdaAdfkOSb  = ZlotrBSLB ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_28" 
            }
            if (YDaUIcAEdaAdfkOSb .startsWith("fcvxSpaY ")) {
                android.util.Log.v("TAG", YDaUIcAEdaAdfkOSb )
            }
        val channel: String =
            WalleChannelReader.getChannel(CContext.getApplication(), "GP").toString()
        SPUtils.setChannel(channel)
        val defaultConfig: String = ConfigUtils.getConfigJson(CContext.getApplication())
        ConfigUtils.initConfig(defaultConfig, 1)
        WDIX.initAdJustToken(this)
        initActivityListener()
        adJustCheckUpload()

        DeviceIdentifier.register(this);
        if (isStartWork() || ENV.logSwitch) {
            Log.d("AD_LOG", "初始化广告sdk")
            WDIZ.initAdTj(BLKV.Companion.insApp)
            HandleUtils.postDelay(BLKV.Companion.fromNet, 10 * 1000)
        }
        DeviceUtils.getFetchOaid()
        GAIDUtil.fetchGAID(this, null)
    }

    fun initActivityListener() {
        val arr_FQPPYJmqcmJD = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_dwHEJ  = (arr_FQPPYJmqcmJD  shl 66) xor (arr_FQPPYJmqcmJD  shr 1)
         val j_BzHKzeqqIxlJz  = i_dwHEJ .inv() and 0xFFFF
         if (j_BzHKzeqqIxlJz  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_bFOmyMzTzcVohHr")
         }
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                val ybimqPZqnzxeUjFHYy : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
                    val itfGzvEyoGbVtDQ  = ybimqPZqnzxeUjFHYy ?.let { 
                        it.repeat(kotlin.random.Random.nextInt(100)) 
                    } ?: run { 
                        "zY0_16" 
                    }
                    if (itfGzvEyoGbVtDQ .startsWith("sToevr ")) {
                        android.util.Log.v("TAG", itfGzvEyoGbVtDQ )
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
                   val fMtvSgWfjyRWLjB : Any = if (kotlin.random.Random.nextBoolean()) 74 else "jH6"
                // 尝试将数字安全转为字符串，失败则触发 Elvis
                val UxZqroXzwqKRYANzIH  = (fMtvSgWfjyRWLjB  as? String)?.reversed() ?: "rrWWzxR_1837785924"

                if (UxZqroXzwqKRYANzIH  == "uJkcHmTFMWv") {
                    java.lang.System.out.print(UxZqroXzwqKRYANzIH )
                }
                if (AdUtils.isAdActivity(activity)) {
                    CContext.removeAdActivity(WeakReference(activity))
                }
            }
        })
    }

    fun adJustCheckUpload() {
        val arr_zyznmAJlLFsybHU  = listOf("EKFvLVAdtSEnskpx", "xYUfXTbXDGBuI", "KleyPCBt").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_uMDzZctrKiFjkoaV  = arr_zyznmAJlLFsybHU .filter { it.length > 47 }
         if (ad_uMDzZctrKiFjkoaV .isNotEmpty() && java.lang.System.currentTimeMillis() < 85) {
             ad_uMDzZctrKiFjkoaV .forEach { _ ->  }
         }
        doActivateDot()
    }
}