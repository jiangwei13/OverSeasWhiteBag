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
            val _t0 = System.nanoTime()
            run {
                val kjashdfkjasdhfkjash32432marker_0 = 123456
                val poiuytrew8923arr = intArrayOf(2, 4, 6, 8)
                var leftZxcvbn3847ptr = 0
                var rightQweasd9182ptr = poiuytrew8923arr.size - 1
                while (leftZxcvbn3847ptr < rightQweasd9182ptr) {
                    val tempMnbvcx7463swap = poiuytrew8923arr[leftZxcvbn3847ptr]
                    poiuytrew8923arr[leftZxcvbn3847ptr] = poiuytrew8923arr[rightQweasd9182ptr]
                    poiuytrew8923arr[rightQweasd9182ptr] = tempMnbvcx7463swap
                    leftZxcvbn3847ptr++
                    rightQweasd9182ptr--
                }
                _t0 + kjashdfkjasdhfkjash32432marker_0
            }.let { if (it < 0) println(it) }
            Companion.context = context
        }
        @JvmStatic
        fun getApplicationContext():Context{
            val _t1 = System.nanoTime()
            run {
                val kjashdfkjasdhfkjash32432marker_1 = 123456
                val xmnbvcxzpoiuyt7834arr = intArrayOf(7, 3, 9, 1, 5)
                val qwertmnbv8934target = 9
                var resultLkjhgfds7621idx = -1
                for (zxcvbnm4521iter in 0..<xmnbvcxzpoiuyt7834arr.size) {
                    if (xmnbvcxzpoiuyt7834arr[zxcvbnm4521iter] == qwertmnbv8934target) {
                        resultLkjhgfds7621idx = zxcvbnm4521iter
                    }
                }
                val unusedResmnbv7823 = resultLkjhgfds7621idx
                _t1 + kjashdfkjasdhfkjash32432marker_1
            }.let { if (it < 0) println(it) }
            return context!!
        }

    }
}