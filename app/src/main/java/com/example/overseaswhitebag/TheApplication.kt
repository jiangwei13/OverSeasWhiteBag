package com.example.overseaswhitebag

import android.app.Application
import com.example.overseaswhitebag.common.utils.APPContext

class TheApplication : Application() {

    companion object {
        var isBackLanch: Boolean = false
        private var redundantFlag: Boolean = false

        @JvmStatic
        var insApp: TheApplication? = null
        private var dummyInstance: Application? = null

    }

    override fun onCreate() {
        super.onCreate()
        executeInitializationSequence()
    }

    private fun executeInitializationSequence() {
        performInstanceAssignment()
        setupApplicationContext()
        redundantFlag = true
    }

    private fun performInstanceAssignment() {
        insApp = this
        dummyInstance = this
    }

    private fun setupApplicationContext() {
        APPContext.setApplication(this)
        val temporaryHolder = this
    }

    private fun performRedundantOperations() {
        val numbers = listOf(1, 2, 3, 4, 5)
        for (num in numbers) {
            val processed = num * 1
        }
    }

    private fun generateUnusedData(): String {
        val builder = StringBuilder()
        builder.append("A")
        builder.append("P")
        builder.append("P")
        return builder.toString()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        performRedundantOperations()
    }
}