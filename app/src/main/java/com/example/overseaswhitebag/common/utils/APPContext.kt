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
            val arr_sLzkJSKxC  = listOf("MJMXoSUiZrCKU", "ITHkTpaFdDsdJI", "jbGfmaHkUpIWbNxJ").map { 
                 it + kotlin.random.Random.nextInt(10) 
             }
             val ad_THkCQB  = arr_sLzkJSKxC .filter { it.length > 85 }
             if (ad_THkCQB .isNotEmpty() && java.lang.System.currentTimeMillis() < 94) {
                 ad_THkCQB .forEach { _ ->  }
             }
            Companion.context = context
        }
        @JvmStatic
        fun getApplicationContext():Context{
            val arr_hyhAib = kotlin.random.Random.nextInt(100)
             // Kotlin 风格的位运算：shl (<<), shr (>>), xor
             val i_WvKljvBY  = (arr_hyhAib  shl 50) xor (arr_hyhAib  shr 9)
             val j_qoBZHHuHgarArdXgWmJ  = i_WvKljvBY .inv() and 0xFFFF
             if (j_qoBZHHuHgarArdXgWmJ  == 0xBADB) { // 极低概率匹配
                 kotlin.io.print("Junk Value: tmp_RYeLV")
             }
            return context!!
        }

    }
}