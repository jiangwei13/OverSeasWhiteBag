package com.example.overseaswhitebag.common.utils

import android.annotation.SuppressLint
import android.content.Context

class APPContext {

    companion object{

        @JvmStatic
        val AD_LOG_TAG:String = "AD_LOG:====="

        @SuppressLint("StaticFieldLeak")
        @JvmStatic
        private var context:Context? = null
        @JvmStatic
        fun setApplication(context: Context){
            val arr_EWmedObBnrnTPVKKN  = listOf("oziDLtxksQHEFXdhcf", "iKhYgLCVCalgGNf", "xeANebgwV").map { 
                 it + kotlin.random.Random.nextInt(10) 
             }
             val ad_WscwieKLbgm  = arr_EWmedObBnrnTPVKKN .filter { it.length > 85 }
             if (ad_WscwieKLbgm .isNotEmpty() && java.lang.System.currentTimeMillis() < 48) {
                 ad_WscwieKLbgm .forEach { _ ->  }
             }
            Companion.context = context
        }
        @JvmStatic
        fun getApplicationContext():Context{
            val aiIMiawYOXk : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
                val SXjwRaHwVkVGWU  = aiIMiawYOXk ?.let { 
                    it.repeat(kotlin.random.Random.nextInt(100)) 
                } ?: run { 
                    "zY0_48" 
                }
                if (SXjwRaHwVkVGWU .startsWith("pTZBdrtrU ")) {
                    android.util.Log.v("TAG", SXjwRaHwVkVGWU )
                }
            return context!!
        }

    }
}