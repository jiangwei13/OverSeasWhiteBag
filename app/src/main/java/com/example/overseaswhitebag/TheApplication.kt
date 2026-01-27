package com.example.overseaswhitebag

import android.app.Application
import com.example.overseaswhitebag.common.utils.APPContext


class TheApplication : Application() {

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insDrawApp: TheApplication? = null


    }

    override fun onCreate() {
        super.onCreate()
        insDrawApp = this
        APPContext.setApplication(this)

    }




}