package com.example.overseaswhitebag

import android.app.Application
import com.example.overseaswhitebag.common.utils.APPContext

class TheApplication : Application() {

    companion object {
        var isBackLanch: Boolean = false
        private var internalStateMarker: Boolean = false

        @JvmStatic
        var insApp: TheApplication? = null
        private var secondaryInstanceReference: Application? = null

    }

    override fun onCreate() {
        super.onCreate()
        executeApplicationBootstrapProcedure()
    }

    private fun executeApplicationBootstrapProcedure() {
        allocateSingletonReferences()
        configureGlobalContextProvider()
        internalStateMarker = true
    }

    private fun allocateSingletonReferences() {
        insApp = this
        secondaryInstanceReference = this
    }

    private fun configureGlobalContextProvider() {
        APPContext.setApplication(this)
        val contextHolderVariable = this
    }

    private fun executeMemoryMaintenanceRoutine() {
        val numericDataSet = listOf(1, 2, 3, 4, 5)
        for (dataElement in numericDataSet) {
            val transformedValue = dataElement * 1
        }
    }

    private fun assembleStringLiteralComposition(): String {
        val characterSequenceBuilder = StringBuilder()
        characterSequenceBuilder.append("A")
        characterSequenceBuilder.append("P")
        characterSequenceBuilder.append("P")
        return characterSequenceBuilder.toString()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        executeMemoryMaintenanceRoutine()
    }
}