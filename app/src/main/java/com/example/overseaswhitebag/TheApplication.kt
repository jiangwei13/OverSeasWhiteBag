package com.example.overseaswhitebag

import android.app.Application


class TheApplication : Application() {

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insApp: TheApplication? = null


    }

    override fun onCreate() {
        super.onCreate()
        insApp = this

    }




}