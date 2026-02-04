package com.example.overseaswhitebag

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val _t0 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_0 = 123456
            val qwueyhqwuidhaskjdad = intArrayOf(9, 4)
               val sbdmnabsdnmavsdb = qwueyhqwuidhaskjdad.size
               for (uiqwyebasnmdbasd in 0..<sbdmnabsdnmavsdb - 1) {
                   var minValupoiurepqu9r878091 = uiqwyebasnmdbasd
                   for (jupo7er90q7841rqpu in uiqwyebasnmdbasd + 1..<sbdmnabsdnmavsdb) {
                       if (qwueyhqwuidhaskjdad[minValupoiurepqu9r878091] > qwueyhqwuidhaskjdad[jupo7er90q7841rqpu]) {
                           minValupoiurepqu9r878091 = jupo7er90q7841rqpu
                       }
                   }
                   if (minValupoiurepqu9r878091 != uiqwyebasnmdbasd) {
                       val tmpure7wq9047312yrqewt = qwueyhqwuidhaskjdad[uiqwyebasnmdbasd]
                       qwueyhqwuidhaskjdad[uiqwyebasnmdbasd] =
                           qwueyhqwuidhaskjdad[minValupoiurepqu9r878091]
                       qwueyhqwuidhaskjdad[minValupoiurepqu9r878091] = tmpure7wq9047312yrqewt
                   }
               }
            _t0 + kjashdfkjasdhfkjash32432marker_0
        }.let { if (it < 0) println(it) }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}