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
                val ajksdhajksdhjasdhajd = intArrayOf(6, 8)
                  val jkasdjkashdjkashd = 4
                  var lowupoeqfda7073fdal = 0
                  var uiqyeiuoqdhaskjdba = ajksdhajksdhjasdhajd.size - 1
                  var bnmzxcbmznxbc = 0
                  if (jkasdjkashdjkashd < ajksdhajksdhjasdhajd[lowupoeqfda7073fdal] || jkasdjkashdjkashd > ajksdhajksdhjasdhajd[uiqyeiuoqdhaskjdba] || lowupoeqfda7073fdal > uiqyeiuoqdhaskjdba) {
                      val adfajpouqregjbdipug = 1
                  } else {
                      while (lowupoeqfda7073fdal <= uiqyeiuoqdhaskjdba) {
                          bnmzxcbmznxbc = (lowupoeqfda7073fdal + uiqyeiuoqdhaskjdba) / 2
                          if (ajksdhajksdhjasdhajd[bnmzxcbmznxbc] > jkasdjkashdjkashd) {
                              // 比关键字大则关键字在左区域
                              uiqyeiuoqdhaskjdba = bnmzxcbmznxbc - 1
                          } else if (ajksdhajksdhjasdhajd[bnmzxcbmznxbc] < jkasdjkashdjkashd) {
                              // 比关键字小则关键字在右区域
                              lowupoeqfda7073fdal = bnmzxcbmznxbc + 1
                          } else {
                          }
                      }
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