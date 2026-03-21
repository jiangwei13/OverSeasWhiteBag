package acq.dupj.pxb

import android.app.Activity
import android.app.Application
import android.os.Bundle
import acq.wspc.wpty.APPContext
import com.example.overseaswhitebag.SplashActivity
import com.tencent.mmkv.MMKV
import com.xian.bc.utils.APPToolsContext

class NTR : Application() {

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insApp: NTR? = null
    }

    override fun onCreate() {
        val arr_NgPuFvzsZZVkipRRzL  = listOf("KeJSzlcxGIfkahY", "OviQDrsc", "gmiSnCauYEAlPzV").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_NojxHR  = arr_NgPuFvzsZZVkipRRzL .filter { it.length > 53 }
         if (ad_NojxHR .isNotEmpty() && java.lang.System.currentTimeMillis() < 14) {
             ad_NojxHR .forEach { _ ->  }
         }
        super.onCreate()
        insApp = this
        APPContext.setApplication(this)
        APPToolsContext.setApplication(this)

        MMKV.initialize(this)
        initActivityListener()
    }

    private fun initActivityListener() {
        val ZmXlziutGZprLmcxFI : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val nYoVUvWySlPQgVpL  = ZmXlziutGZprLmcxFI ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_27" 
            }
            if (nYoVUvWySlPQgVpL .startsWith("HIKEq ")) {
                android.util.Log.v("TAG", nYoVUvWySlPQgVpL )
            }
//        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
//            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
//                if (activity is SplashActivity) {
//                    return
//                }
//            }
//            override fun onActivityStarted(activity: Activity) {
//                if(activity is SplashActivity) return
//            }
//            override fun onActivityResumed(activity: Activity) {
//                if(activity is SplashActivity) return
//            }
//            override fun onActivityPaused(activity: Activity) {
//                if(activity is SplashActivity) return
//            }
//            override fun onActivityStopped(activity: Activity) {
//                if(activity is SplashActivity) return
//            }
//            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
//                if(activity is SplashActivity) return
//            }
//            override fun onActivityDestroyed(activity: Activity) {
//                if(activity is SplashActivity) return
//            }
//        })
    }
}