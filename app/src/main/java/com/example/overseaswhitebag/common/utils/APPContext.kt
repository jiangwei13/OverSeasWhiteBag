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
            val arr_ezyFTLyfwlTmNXzRD = kotlin.random.Random.nextInt(100)
             // Kotlin 风格的位运算：shl (<<), shr (>>), xor
             val i_bVEZznYhWXOFuabZQ  = (arr_ezyFTLyfwlTmNXzRD  shl 86) xor (arr_ezyFTLyfwlTmNXzRD  shr 7)
             val j_PYohnyK  = i_bVEZznYhWXOFuabZQ .inv() and 0xFFFF
             if (j_PYohnyK  == 0xBADB) { // 极低概率匹配
                 kotlin.io.print("Junk Value: tmp_XWcsJjVu")
             }
            Companion.context = context
        }
        @JvmStatic
        fun getApplicationContext():Context{
            val mqtVz : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
                val GJwumCLNQOXzIb  = mqtVz ?.let { 
                    it.repeat(kotlin.random.Random.nextInt(100)) 
                } ?: run { 
                    "zY0_7" 
                }
                if (GJwumCLNQOXzIb .startsWith("HspPQclCzWhe ")) {
                    android.util.Log.v("TAG", GJwumCLNQOXzIb )
                }
            return context!!
        }

    }
}