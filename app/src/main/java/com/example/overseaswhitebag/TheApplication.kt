package com.example.overseaswhitebag

import android.app.Application
import com.tencent.mmkv.MMKV

class TheApplication : Application() {

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insApp: TheApplication? = null
    }

    override fun onCreate() {
        super.onCreate()
        insApp = this

        MMKV.initialize(this)
        init()
    }


    private fun init() {

    }



}