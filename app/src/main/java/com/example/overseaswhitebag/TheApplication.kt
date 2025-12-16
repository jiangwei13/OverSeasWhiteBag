package com.example.overseaswhitebag

import android.app.Activity
import android.app.Application
import android.os.Bundle
import com.example.overseaswhitebag.common.utils.APPContext
import com.tencent.mmkv.MMKV
import com.xian.bc.utils.APPToolsContext

class TheApplication : Application() {

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insApp: TheApplication? = null
    }

    override fun onCreate() {
        super.onCreate()
        insApp = this
        APPContext.setApplication(this)
        APPToolsContext.setApplication(this)

        MMKV.initialize(this)
        initActivityListener()
    }

    private fun initActivityListener() {
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {}
            override fun onActivityStarted(activity: Activity) {}
            override fun onActivityResumed(activity: Activity) {}
            override fun onActivityPaused(activity: Activity) {}
            override fun onActivityStopped(activity: Activity) {}
            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {}
            override fun onActivityDestroyed(activity: Activity) {}
        })
    }
}
