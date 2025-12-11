package com.example.overseaswhitebag

import android.app.Activity
import android.app.Application




import com.example.overseaswhitebag.common.utils.APPContext


class TheApplication : Application() {

    companion object {


        @JvmStatic
        var insApp: TheApplication? = null

    }

    override fun onCreate() {
        super.onCreate()
        insApp = this
        APPContext.setApplication(this)

    }








}