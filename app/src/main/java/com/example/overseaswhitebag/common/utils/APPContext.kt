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
                val qazxswedcv4521arr = intArrayOf(3, 7, 2, 9, 5)
                var sumTotalPlokij8934 = 0
                var countNhybgt6723 = 0
                for (idxMkijnuh2938 in 0..<qazxswedcv4521arr.size) {
                    sumTotalPlokij8934 = sumTotalPlokij8934 + qazxswedcv4521arr[idxMkijnuh2938]
                    countNhybgt6723++
                }
                val avgValueRfvbgt5621 = sumTotalPlokij8934 / countNhybgt6723
                _t1 + kjashdfkjasdhfkjash32432marker_1
            }.let { if (it < 0) println(it) }
            return context!!
        }

    }
}