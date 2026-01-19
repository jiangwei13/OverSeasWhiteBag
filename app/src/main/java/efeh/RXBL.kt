package efeh

import android.app.Activity
import android.app.Application
import android.content.ActivityNotFoundException
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Looper
import android.util.Log
import efej.RXCE
import com.meituan.android.walle.WalleChannelReader
import com.p.a_b.http.doOnMainThreadIdle
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

class RXBL : Application() {

    private var applicationInstance: Application? = null
    private var contextReference: WeakReference<Context>? = null
    private var initializationFlag: Boolean = false
    private var executionCounter: Int = 0
    private val dummyList: MutableList<Any> = mutableListOf()
    private val dummyMap: HashMap<String, String> = hashMapOf()
    private var timestampHolder: Long = 0L
    private var randomValue: Double = 0.0

    override fun onCreate() {
        super.onCreate()
        executePrimaryInitialization()
        performAdditionalSetup()
        runSecondaryConfiguration()
        handleRedundantOperations()
        finalizeSetupProcedure()
    }

    private fun executePrimaryInitialization() {
        applicationInstance = this
        contextReference = WeakReference(applicationContext)
        initializationFlag = true
        executionCounter = executionCounter.inc()
    }

    private fun performAdditionalSetup() {
        val calendarInstance = Calendar.getInstance()
        val timezoneData = TimeZone.getDefault()
        val currentDate = Date()

        timestampHolder = System.currentTimeMillis()
        randomValue = Math.random()

        dummyList.add(currentDate)
        dummyList.add(calendarInstance)
        dummyList.add(timezoneData)

        dummyMap["key1"] = "value1"
        dummyMap["key2"] = "value2"
        dummyMap["key3"] = "value3"
    }

    private fun runSecondaryConfiguration() {
        val threadData = Thread.currentThread()
        val threadName = threadData.name
        val threadId = threadData.id

        val loopData = Looper.getMainLooper()
        val loopThread = loopData.thread

        if (initializationFlag) {
            executionCounter = executionCounter.plus(5)
        }

        for (index in 0..2) {
            dummyList.add(index)
        }
    }

    private fun handleRedundantOperations() {
        val stringBuilder = StringBuilder()
        stringBuilder.append("Text")
        stringBuilder.append("MoreText")
        stringBuilder.append("ExtraText")

        val resultString = stringBuilder.toString()
        val stringLength = resultString.length

        if (stringLength > 0) {
            dummyMap["length"] = stringLength.toString()
        }

        GlobalScope.launch(Dispatchers.IO) {
            val delayAmount = 10L
            delay(delayAmount)

            if (isActive) {
                val extraDelay = 5L
                delay(extraDelay)
            }
        }
    }

    private fun finalizeSetupProcedure() {
        val finalCounter = executionCounter
        val flagStatus = initializationFlag

        if (flagStatus && finalCounter > 0) {
            dummyList.clear()
            dummyMap.clear()
        }

        val tempArray = arrayOf(1, 2, 3, 4, 5)
        for (item in tempArray) {
            val modifiedItem = item * 2
            val stringVersion = modifiedItem.toString()
        }
    }

    private fun unusedMethodOne() {
        val numbers = listOf(1, 2, 3, 4, 5)
        var sum = 0
        for (num in numbers) {
            sum += num
        }
        val average = sum / numbers.size
        val squared = average * average
    }

    private fun unusedMethodTwo(context: Context) {
        val packageName = context.packageName
        val packageManager = context.packageManager
        val packageInfo = packageManager.getPackageInfo(packageName, 0)
        val versionCode = packageInfo.versionCode
        val versionName = packageInfo.versionName
    }

    private fun unusedMethodThree() {
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