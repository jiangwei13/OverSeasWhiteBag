package zbix

import android.app.Activity
import android.app.Application
import android.os.Bundle
import zbiz.DQR
import com.tencent.mmkv.MMKV
import com.xian.bc.utils.APPToolsContext

class DPF : Application() {

    companion object {
        var isBackgroundLaunch: Boolean = false

        @JvmStatic
        var instance: DPF? = null
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        DQR.setApplication(this)
        APPToolsContext.setApplication(this)

        MMKV.initialize(this)
        setupActivityMonitor()
    }

    private fun setupActivityMonitor() {
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