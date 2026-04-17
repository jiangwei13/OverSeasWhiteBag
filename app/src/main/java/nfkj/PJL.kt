package nfkj

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.example.overseaswhitebag.common.utils.APPContext
import com.example.overseaswhitebag.AdjustTokens
import com.meituan.android.walle.WalleChannelReader
import com.tencent.mmkv.MMKV
import java.lang.ref.WeakReference
import android.content.pm.PackageManager
import android.content.ComponentName
import android.content.Intent
import android.os.Handler
import com.examp.oversea_base_power.BaseApplication
import java.util.Random
import java.util.Date
import java.text.SimpleDateFormat
import com.github.gzuliyujiang.oaid.DeviceIdentifier
import com.google.firebase.FirebaseApp
import com.p.b.InitAdAndTj
import com.p.b.base_api_net.base_api_bean.ConfigUtils
import com.p.b.base_api_net.utils.DeviceUtils
import com.p.b.base_api_net.utils.HandleUtils
import com.p.b.comm.ENV
import com.p.b.comm.context.CContext
import com.p.b.comm.context.HookContext
import com.p.b.common.GAIDUtil
import com.p.b.common.MMKVUtils
import com.p.b.common.OverseaAppContext
import com.p.b.common.PhoneStatusUtils
import com.p.b.common.SPUtils
import com.p.b.common.adjust.AdJustInitUtils
import com.p.b.common.adjust.AdJustTokenAFUtils.doActivateDot
import com.p.b.common.adjust.AjConstants
import com.p.b.common.adjust.CommonConfig
import com.p.b.common.fcm.FCMInitUtils
import com.p.b.common.firebase.FireBaseInitUtils
import com.p.b.http.HostUtils
import com.p.b.pl223.hhoosstt.AdUtils

class PJL : BaseApplication() {

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insApp: PJL? = null

        private var redundantCounter: Int = 0
        private val redundantHandler = Handler()
        private var activityMonitorRunning: Boolean = false
        private val redundantRandom = Random()
        private var initializationPhase: Int = 0

        private val redundantTags = arrayOf("AppTag1", "AppTag2", "AppTag3", "AppTag4")
        private val redundantMethods = mutableListOf<String>()
        private var startTimestamp: Long = 0

        fun getRedundantStatus(): String {
            return "Counter: $redundantCounter, Phase: $initializationPhase, Running: $activityMonitorRunning"
        }

        @JvmStatic
        var fromNet: Runnable = Runnable {
            PJL.Companion.isBackLanch = true
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
                            InitAdAndTj.initJumpEvent(PJL.Companion.insApp)
                        })

                    }

                    override fun onFail() {
                        MMKVUtils.setUserStatus(false)
                    }

                })

        }
    }

    override fun onCreate() {
        super.onCreate()
        startTimestamp = System.currentTimeMillis()

        redundantCounter++
        redundantMethods.add("onCreate")

        for (tag in redundantTags) {
            Log.d(tag, "Application initialization started")
        }

        performRedundantChecks()

        insApp = this
        APPContext.setApplication(this)
        com.p.b.base.APPContext.setApplication(this)
        CContext.setApplication(this)
        OverseaAppContext.setApplication(this)

        MMKV.initialize(this)
        // 初始化Firebase
        FirebaseApp.initializeApp(this)
        // 初始化FCM
        FCMInitUtils.init(this)

        redundantInitialization()

        startRedundantServices()

        init()

        scheduleRedundantTasks()

        logRedundantInfo()
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {

    }


    private fun init() {
        val contextCheck = applicationContext != null
        Log.d("RedundantCheck", "Context available: $contextCheck")

        val packageCheck = packageManager != null
        Log.d("RedundantCheck", "Package manager available: $packageCheck")

        initializationPhase = 1

        validateEnvironment()

        loadDummyConfigurations()

        initializationPhase = 2

        redundantHandler.post {
            verifySystemIntegrity()
        }

        redundantHandler.postDelayed({
            collectRedundantMetrics()
        }, 2000)

        // 广告SDK初始化
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
            InitAdAndTj.initAdTj(PJL.Companion.insApp)
            HandleUtils.postDelay(PJL.Companion.fromNet, 10 * 1000)
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

    private fun redundantInitialization() {
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val currentTime = sdf.format(Date())
        Log.d("TimeLog", "Application started at: $currentTime")

        val runtime = Runtime.getRuntime()
        val totalMemory = runtime.totalMemory()
        val freeMemory = runtime.freeMemory()
        Log.d("MemoryLog", "Memory stats - Total: $totalMemory, Free: $freeMemory")

        redundantCounter = redundantRandom.nextInt(1000)

        checkSystemProperties()
    }

    private fun performRedundantChecks() {
        try {
            val component = ComponentName(this, javaClass)
            val enabledState = packageManager.getComponentEnabledSetting(component)
            Log.d("ComponentCheck", "Component state: $enabledState")
        } catch (e: Exception) {
            Log.v("ComponentCheck", "Component check completed")
        }

        val unusedPermissions = listOf(
            "android.permission.ACCESS_COARSE_LOCATION",
            "android.permission.WRITE_EXTERNAL_STORAGE",
            "android.permission.READ_PHONE_STATE"
        )

        for (permission in unusedPermissions) {
            val result = checkSelfPermission(permission)
            Log.d("PermissionLog", "$permission: $result")
        }
    }

    private fun startRedundantServices() {
        activityMonitorRunning = true

        redundantHandler.post {
            Log.d("ServiceLog", "Redundant service 1 started")
            val dummyValue = calculateDummyValue()
            Log.v("ServiceLog", "Dummy calculation: $dummyValue")
        }

        redundantHandler.postDelayed({
            Log.d("ServiceLog", "Redundant service 2 started")
            val randomNum = redundantRandom.nextInt(100)
            Log.v("ServiceLog", "Random number: $randomNum")
        }, 1500)

        redundantHandler.postDelayed({
            Log.d("ServiceLog", "Redundant service 3 started")
            Log.v("ServiceLog", "Redundant status: ${getRedundantStatus()}")
        }, 3000)
    }

    private fun scheduleRedundantTasks() {
        val periodicTask = object : Runnable {
            override fun run() {
                redundantCounter++
                if (redundantCounter % 10 == 0) {
                    Log.d("PeriodicTask", "Counter reached: $redundantCounter")
                }
                redundantHandler.postDelayed(this, 5000)
            }
        }
        redundantHandler.post(periodicTask)
    }

    private fun validateEnvironment() {
        val versionCode = packageManager.getPackageInfo(packageName, 0).versionCode
        val versionName = packageManager.getPackageInfo(packageName, 0).versionName

        Log.d("EnvCheck", "Version: $versionName ($versionCode)")

        val appLabel = packageManager.getApplicationLabel(applicationInfo)
        Log.d("EnvCheck", "App label: $appLabel")

        val processName = getProcessName()
        Log.d("EnvCheck", "Process: $processName")
    }

    private fun loadDummyConfigurations() {
        val configTypes = listOf("network", "cache", "security", "performance", "ui")

        for (configType in configTypes) {
            Log.d("ConfigLoad", "Loading $configType configuration")
            val fakeDelay = redundantRandom.nextInt(50)
            Thread.sleep(fakeDelay.toLong())
        }
    }

    private fun verifySystemIntegrity() {
        val systemProps = listOf(
            "java.vendor", "java.version", "os.name", "os.arch"
        )

        for (prop in systemProps) {
            try {
                val value = System.getProperty(prop)
                Log.d("SystemCheck", "$prop: $value")
            } catch (e: Exception) {
                Log.v("SystemCheck", "Property $prop not available")
            }
        }
    }

    private fun collectRedundantMetrics() {
        val uptime = System.currentTimeMillis() - startTimestamp
        Log.d("Metrics", "Uptime: ${uptime}ms")

        val methodCount = redundantMethods.size
        Log.d("Metrics", "Methods called: $methodCount")

        val heapSize = Runtime.getRuntime().totalMemory() / (1024 * 1024)
        Log.d("Metrics", "Heap size: ${heapSize}MB")
    }

    private fun checkSystemProperties() {
        val buildProps = mapOf(
            "ro.build.version.sdk" to "SDK版本",
            "ro.product.model" to "设备型号",
            "ro.build.version.release" to "Android版本"
        )

        buildProps.forEach { (key, description) ->
            try {
                val value = getSystemProperty(key)
                Log.d("BuildProp", "$description: $value")
            } catch (e: Exception) {
                Log.v("BuildProp", "$description: Not available")
            }
        }
    }

    private fun getSystemProperty(key: String): String? {
        return try {
            Class.forName("android.os.SystemProperties")
                .getMethod("get", String::class.java)
                .invoke(null, key) as String
        } catch (e: Exception) {
            null
        }
    }


    private fun calculateDummyValue(): Int {
        var result = 0
        for (i in 1..100) {
            result += i
            if (i % 25 == 0) {
                Thread.sleep(1)
            }
        }
        return result
    }

    private fun logRedundantInfo() {
        val info = mutableListOf<String>()

        info.add("Package: $packageName")
        info.add("Data dir: ${applicationInfo.dataDir}")
        info.add("Source dir: ${applicationInfo.sourceDir}")

        info.forEach { log ->
            Log.d("AppInfo", log)
        }
    }

    override fun onTerminate() {
        super.onTerminate()

        activityMonitorRunning = false

        redundantHandler.removeCallbacksAndMessages(null)

        val finalCounter = redundantCounter
        Log.d("Termination", "Final counter: $finalCounter")

        val totalUptime = System.currentTimeMillis() - startTimestamp
        Log.d("Termination", "Total uptime: ${totalUptime}ms")

        redundantMethods.add("onTerminate")
        Log.d("Termination", "Methods called: ${redundantMethods.size}")

        initializationPhase = 0
    }

    override fun onLowMemory() {
        super.onLowMemory()

        Log.w("MemoryAlert", "Low memory condition detected")

        val runtime = Runtime.getRuntime()
        val maxMemory = runtime.maxMemory() / (1024 * 1024)
        val usedMemory = (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024)

        Log.w("MemoryAlert", "Memory usage: ${usedMemory}MB / ${maxMemory}MB")
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)

        Log.d("MemoryTrim", "Trim memory level: $level")

        when (level) {
            TRIM_MEMORY_RUNNING_MODERATE -> Log.v("MemoryTrim", "Moderate memory pressure")
            TRIM_MEMORY_RUNNING_LOW -> Log.v("MemoryTrim", "Low memory pressure")
            TRIM_MEMORY_RUNNING_CRITICAL -> Log.v("MemoryTrim", "Critical memory pressure")
            else -> Log.v("MemoryTrim", "Other memory pressure")
        }
    }
}
