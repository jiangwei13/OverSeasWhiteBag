package com.example.overseaswhitebag

import android.app.Application
import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.blankj.utilcode.util.NativeHelper

import com.example.overseaswhitebag.common.utils.APPContext
import com.google.firebase.FirebaseApp
import com.p.b.base.BaseApplication
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

class TheApplication:BaseApplication() {

    companion object{
        @JvmStatic
        var insApp:TheApplication?=null
    }

    override fun onCreate() {
        super.onCreate()
        insApp = this
        APPContext.setApplication(this)
        //initFireBase
        FirebaseApp.initializeApp(this)
        //归隐后执行
        NativeHelper.init(this, null, null)

//        //测试代码
//        Handler(Looper.getMainLooper()).postDelayed(object : Runnable {
//            override fun run() {
//                startRepeatingTask()
//            }
//
//        }, 2000)
    }

    fun startRepeatingTask() {
        GlobalScope.launch(context = Dispatchers.Main) {
            while (isActive) {
                Log.d("NativeHelper", "执行任务时间:${System.currentTimeMillis()}")
                val intent = Intent(insApp, MainActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
//打开activity执行这个
                NativeHelper.b(insApp,intent)
                Log.d("NativeHelper", "开始跳转")
                delay(10_000)
            }
        }

    }
}