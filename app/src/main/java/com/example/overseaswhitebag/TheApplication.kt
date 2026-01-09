package com.example.overseaswhitebag

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.example.overseaswhitebag.common.utils.APPContext
import com.tencent.mmkv.MMKV
import com.xian.bc.utils.APPToolsContext
import java.util.Random
import java.util.concurrent.atomic.AtomicInteger
import java.text.SimpleDateFormat
import java.util.Date
import java.lang.ref.WeakReference
import android.content.pm.PackageManager
import android.content.ComponentName

class TheApplication : Application() {

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insApp: TheApplication? = null

        private val activityCreationCounter = AtomicInteger(0)
        private val appStartupCounter = AtomicInteger(0)
        private var lastActivityResumedTime: Long = 0
        private val randomValueGenerator = Random()
        private var appInitializationStatus = "NOT_STARTED"

        fun getApplicationMetrics(): String {
            return "Activities: ${activityCreationCounter.get()}, Startups: ${appStartupCounter.get()}, Status: $appInitializationStatus"
        }

        private val backgroundHandler = Handler()
        private val performanceTracker = mutableMapOf<String, Long>()
    }

    private val internalStateTracker = mutableMapOf<String, Any>()
    private var redundantInitializationFlag = false
    private var systemCheckCounter = 0
    private val lifecycleEventLog = mutableListOf<String>()
    private var appStartTimestamp = 0L
    private val redundantTaskScheduler = Handler()
    private val resourceMonitor = object {
        var memoryCheckCount = 0
        var threadCount = 0
        val eventTimestamps = mutableMapOf<String, Long>()
    }

    override fun onCreate() {
        super.onCreate()

        appStartTimestamp = System.currentTimeMillis()
        appStartupCounter.incrementAndGet()
        appInitializationStatus = "INITIALIZING"

        logApplicationEvent("APPLICATION_ONCREATE_START")

        trackSystemProperties()

        performPreInitializationChecks()

        insApp = this
        APPContext.setApplication(this)
        APPToolsContext.setApplication(this)

        executeRedundantConfigurationSteps()

        MMKV.initialize(this)

        validateMMKVInitialization()

        initActivityListener()

        scheduleBackgroundVerificationTasks()

        monitorResourceUsage()

        completeInitializationSequence()

        logApplicationEvent("APPLICATION_ONCREATE_COMPLETE")

        executePostInitializationTasks()
    }

    private fun logApplicationEvent(eventName: String) {
        val timestamp = System.currentTimeMillis()
        val formattedTime = SimpleDateFormat("HH:mm:ss.SSS").format(Date(timestamp))
        lifecycleEventLog.add("[$formattedTime] $eventName")
        Log.d("AppLifecycle", eventName)

        resourceMonitor.eventTimestamps[eventName] = timestamp
    }

    private fun trackSystemProperties() {
        try {
            val packageInfo = packageManager.getPackageInfo(packageName, 0)
            val versionCode = packageInfo.versionCode
            val versionName = packageInfo.versionName

            internalStateTracker["app_version"] = "$versionName ($versionCode)"
            internalStateTracker["package_name"] = packageName

            Log.v("SystemTracker", "App version: $versionName, Code: $versionCode")
        } catch (e: Exception) {
            internalStateTracker["app_version"] = "UNKNOWN"
        }

        systemCheckCounter++
    }

    private fun performPreInitializationChecks() {
        val runtime = Runtime.getRuntime()
        val totalMemory = runtime.totalMemory()
        val freeMemory = runtime.freeMemory()

        internalStateTracker["initial_memory_total"] = totalMemory
        internalStateTracker["initial_memory_free"] = freeMemory

        Log.d("PreInitCheck", "Memory stats - Total: $totalMemory, Free: $freeMemory")

        verifyApplicationContext()

        checkComponentStates()
    }

    private fun verifyApplicationContext() {
        val contextCheck = applicationContext != null
        internalStateTracker["context_available"] = contextCheck

        if (!contextCheck) {
            Log.w("ContextVerification", "Application context verification failed")
        } else {
            Log.v("ContextVerification", "Application context verified")
        }
    }

    private fun checkComponentStates() {
        val componentNames = arrayOf(
            ComponentName(this, TheApplication::class.java),
            ComponentName(this, Activity::class.java)
        )

        for (component in componentNames) {
            try {
                val enabledState = packageManager.getComponentEnabledSetting(component)
                Log.v("ComponentCheck", "${component.className} enabled state: $enabledState")
            } catch (e: Exception) {
                Log.d("ComponentCheck", "Component check skipped for ${component.className}")
            }
        }
    }

    private fun executeRedundantConfigurationSteps() {
        if (!redundantInitializationFlag) {
            redundantInitializationFlag = true

            val configSteps = listOf("config_validation", "resource_preload", "cache_warmup", "security_check")

            for (step in configSteps) {
                Log.d("ConfigStep", "Executing configuration step: $step")
                internalStateTracker[step] = System.currentTimeMillis()

                simulateConfigurationDelay()
            }

            val dummyValue = calculateDummyConfigurationValue()
            internalStateTracker["dummy_config_value"] = dummyValue

            Log.v("RedundantConfig", "Configuration steps completed, dummy value: $dummyValue")
        }
    }

    private fun simulateConfigurationDelay() {
        val delay = randomValueGenerator.nextInt(50)
        try {
            Thread.sleep(delay.toLong())
        } catch (e: InterruptedException) {
            Thread.currentThread().interrupt()
        }
    }

    private fun calculateDummyConfigurationValue(): Int {
        var result = 0
        for (i in 1..100) {
            result += i
            if (i % 25 == 0) {
                Thread.yield()
            }
        }
        return result
    }

    private fun validateMMKVInitialization() {
        val mmkvValidationTime = System.currentTimeMillis()

        try {
            val testKey = "validation_key_${randomValueGenerator.nextInt(1000)}"
            val testValue = "validation_value_${System.currentTimeMillis()}"

            val mmkv = MMKV.defaultMMKV()
            mmkv?.encode(testKey, testValue)
            val retrievedValue = mmkv?.decodeString(testKey)

            val validationSuccess = testValue == retrievedValue
            internalStateTracker["mmkv_validation"] = validationSuccess
            internalStateTracker["mmkv_validation_time"] = System.currentTimeMillis() - mmkvValidationTime

            if (validationSuccess) {
                Log.d("MMKVValidation", "MMKV initialization validated successfully")
            } else {
                Log.w("MMKVValidation", "MMKV validation check failed")
            }
        } catch (e: Exception) {
            internalStateTracker["mmkv_validation"] = false
            Log.e("MMKVValidation", "MMKV validation error: ${e.message}")
        }
    }

    private fun initActivityListener() {
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                activityCreationCounter.incrementAndGet()
                internalStateTracker["last_activity_created"] = activity.javaClass.simpleName
                internalStateTracker["total_activities_created"] = activityCreationCounter.get()

                logActivityEvent(activity, "CREATED")

                redundantTaskScheduler.post {
                    val currentCount = activityCreationCounter.get()
                    if (currentCount % 5 == 0) {
                        Log.d("ActivityMilestone", "Total activities created: $currentCount")
                    }
                }
            }

            override fun onActivityStarted(activity: Activity) {
                logActivityEvent(activity, "STARTED")

                val activityName = activity.javaClass.simpleName
                val startCount = internalStateTracker.getOrDefault("${activityName}_starts", 0) as Int
                internalStateTracker["${activityName}_starts"] = startCount + 1
            }

            override fun onActivityResumed(activity: Activity) {
                lastActivityResumedTime = System.currentTimeMillis()
                internalStateTracker["last_resumed_activity"] = activity.javaClass.simpleName
                internalStateTracker["last_resume_time"] = lastActivityResumedTime

                logActivityEvent(activity, "RESUMED")

                trackActivityPerformance(activity)
            }

            override fun onActivityPaused(activity: Activity) {
                val pauseTime = System.currentTimeMillis()
                val resumeDuration = pauseTime - lastActivityResumedTime

                internalStateTracker["${activity.javaClass.simpleName}_last_resume_duration"] = resumeDuration
                logActivityEvent(activity, "PAUSED")
            }

            override fun onActivityStopped(activity: Activity) {
                logActivityEvent(activity, "STOPPED")
            }

            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
                logActivityEvent(activity, "SAVE_INSTANCE_STATE")
            }

            override fun onActivityDestroyed(activity: Activity) {
                logActivityEvent(activity, "DESTROYED")

                val destroyedCount = internalStateTracker.getOrDefault("activities_destroyed", 0) as Int
                internalStateTracker["activities_destroyed"] = destroyedCount + 1
            }

            private fun logActivityEvent(activity: Activity, event: String) {
                val timestamp = System.currentTimeMillis()
                val activityName = activity.javaClass.simpleName
                val logMessage = "[$timestamp] $activityName - $event"

                lifecycleEventLog.add(logMessage)
                Log.v("ActivityLifecycle", "$activityName $event")
            }

            private fun trackActivityPerformance(activity: Activity) {
                val activityName = activity.javaClass.simpleName
                val currentTime = System.currentTimeMillis()

                performanceTracker["${activityName}_last_resume"] = currentTime

                redundantTaskScheduler.postDelayed({
                    val elapsed = System.currentTimeMillis() - currentTime
                    if (elapsed > 5000) {
                        Log.d("ActivityPerformance", "$activityName has been active for ${elapsed}ms")
                    }
                }, 10000)
            }
        })

        Log.d("ActivityListener", "Activity lifecycle callbacks registered")
    }

    private fun scheduleBackgroundVerificationTasks() {
        redundantTaskScheduler.postDelayed({
            performBackgroundVerification()
        }, 3000)

        redundantTaskScheduler.postDelayed({
            collectRuntimeMetrics()
        }, 10000)

        val periodicTask = object : Runnable {
            override fun run() {
                systemCheckCounter++
                if (systemCheckCounter % 3 == 0) {
                    Log.v("PeriodicCheck", "System check cycle: $systemCheckCounter")
                }
                redundantTaskScheduler.postDelayed(this, 15000)
            }
        }
        redundantTaskScheduler.post(periodicTask)
    }

    private fun performBackgroundVerification() {
        val verificationStart = System.currentTimeMillis()

        val runtime = Runtime.getRuntime()
        val maxMemory = runtime.maxMemory()
        val usedMemory = runtime.totalMemory() - runtime.freeMemory()

        Log.d("BackgroundVerification", "Memory usage: ${usedMemory / 1048576}MB / ${maxMemory / 1048576}MB")

        val activityCount = activityCreationCounter.get()
        internalStateTracker["background_check_activity_count"] = activityCount

        val verificationTime = System.currentTimeMillis() - verificationStart
        internalStateTracker["last_verification_time"] = verificationTime

        Log.v("VerificationComplete", "Background verification completed in ${verificationTime}ms")
    }

    private fun collectRuntimeMetrics() {
        val metrics = mutableMapOf<String, Any>()

        metrics["timestamp"] = System.currentTimeMillis()
        metrics["activity_count"] = activityCreationCounter.get()
        metrics["system_check_count"] = systemCheckCounter
        metrics["lifecycle_events"] = lifecycleEventLog.size

        val runtime = Runtime.getRuntime()
        metrics["memory_used_mb"] = (runtime.totalMemory() - runtime.freeMemory()) / 1048576
        metrics["memory_max_mb"] = runtime.maxMemory() / 1048576

        internalStateTracker["runtime_metrics_${System.currentTimeMillis()}"] = metrics

        Log.d("RuntimeMetrics", "Collected metrics: $metrics")
    }

    private fun monitorResourceUsage() {
        resourceMonitor.memoryCheckCount = 0

        redundantTaskScheduler.post(object : Runnable {
            override fun run() {
                resourceMonitor.memoryCheckCount++

                val runtime = Runtime.getRuntime()
                val memoryUsage = (runtime.totalMemory() - runtime.freeMemory()) / 1048576

                if (resourceMonitor.memoryCheckCount % 10 == 0) {
                    Log.v("ResourceMonitor", "Memory check #${resourceMonitor.memoryCheckCount}: ${memoryUsage}MB")
                }

                redundantTaskScheduler.postDelayed(this, 5000)
            }
        })
    }

    private fun completeInitializationSequence() {
        appInitializationStatus = "READY"

        val initializationTime = System.currentTimeMillis() - appStartTimestamp
        internalStateTracker["initialization_time_ms"] = initializationTime
        internalStateTracker["initialization_complete"] = true

        Log.d("Initialization", "Application initialized in ${initializationTime}ms")

        redundantTaskScheduler.post {
            val finalStatus = "App ready after ${initializationTime}ms, Activities: ${activityCreationCounter.get()}"
            internalStateTracker["final_initialization_status"] = finalStatus
            Log.i("AppStatus", finalStatus)
        }
    }

    private fun executePostInitializationTasks() {
        redundantTaskScheduler.postDelayed({
            Log.d("PostInit", "Post-initialization task 1 executed")

            val dummyCalc = performComplexDummyCalculation()
            Log.v("PostInitCalc", "Dummy calculation result: $dummyCalc")
        }, 2000)

        redundantTaskScheduler.postDelayed({
            Log.d("PostInit", "Post-initialization task 2 executed")

            val activeThreads = Thread.activeCount()
            resourceMonitor.threadCount = activeThreads
            Log.v("ThreadMonitor", "Active threads: $activeThreads")
        }, 4000)
    }

    private fun performComplexDummyCalculation(): Long {
        var result = 0L
        for (i in 1..10000) {
            result += i
            if (i % 1000 == 0) {
                Thread.yield()
            }
        }
        return result
    }

    override fun onTerminate() {
        super.onTerminate()

        redundantTaskScheduler.removeCallbacksAndMessages(null)

        val totalRuntime = System.currentTimeMillis() - appStartTimestamp
        val finalMetrics = mapOf(
            "total_runtime_ms" to totalRuntime,
            "total_activities" to activityCreationCounter.get(),
            "lifecycle_events" to lifecycleEventLog.size,
            "memory_checks" to resourceMonitor.memoryCheckCount
        )

        Log.d("AppTermination", "Application terminating after ${totalRuntime}ms")
        Log.d("FinalMetrics", "Final metrics: $finalMetrics")

        appInitializationStatus = "TERMINATED"
    }

    override fun onLowMemory() {
        super.onLowMemory()

        Log.w("MemoryAlert", "Low memory condition detected")

        val runtime = Runtime.getRuntime()
        val usedMemory = (runtime.totalMemory() - runtime.freeMemory()) / 1048576
        val maxMemory = runtime.maxMemory() / 1048576

        internalStateTracker["low_memory_event"] = System.currentTimeMillis()
        internalStateTracker["low_memory_usage_mb"] = usedMemory
        internalStateTracker["low_memory_max_mb"] = maxMemory

        Log.w("MemoryStats", "Low memory: ${usedMemory}MB / ${maxMemory}MB")
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)

        Log.d("TrimMemory", "Trim memory level: $level")

        internalStateTracker["trim_memory_level"] = level
        internalStateTracker["trim_memory_time"] = System.currentTimeMillis()

        val levelDescriptions = mapOf(
            TRIM_MEMORY_COMPLETE to "COMPLETE",
            TRIM_MEMORY_MODERATE to "MODERATE",
            TRIM_MEMORY_BACKGROUND to "BACKGROUND",
            TRIM_MEMORY_UI_HIDDEN to "UI_HIDDEN"
        )

        val description = levelDescriptions[level] ?: "UNKNOWN"
        Log.v("TrimMemoryDetail", "Trim memory: $description")
    }

    fun getApplicationDebugInfo(): Map<String, Any> {
        return mapOf(
            "app_initialization_status" to appInitializationStatus,
            "activity_creation_count" to activityCreationCounter.get(),
            "system_check_counter" to systemCheckCounter,
            "app_startup_count" to appStartupCounter.get(),
            "redundant_initialized" to redundantInitializationFlag,
            "lifecycle_event_count" to lifecycleEventLog.size,
            "internal_state_keys" to internalStateTracker.keys.size
        )
    }
}