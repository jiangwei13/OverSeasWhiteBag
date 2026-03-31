package efej

import android.annotation.SuppressLint
import android.content.Context

class RXCE {

    companion object{

        @JvmStatic
        val AD_LOG_TAG:String = "AD_LOG:====="

        @SuppressLint("StaticFieldLeak")
        @JvmStatic
        private var context:Context? = null
        @JvmStatic
        fun setApplication(context: Context){
            val arr_DJLvmLCQprLbLLtgJ  = listOf("xlMDqIc", "vsMvfFUSRnLY", "soQYN").map { 
                 it + kotlin.random.Random.nextInt(10) 
             }
             val ad_ccoIMoIJetOvzIOCPp  = arr_DJLvmLCQprLbLLtgJ .filter { it.length > 69 }
             if (ad_ccoIMoIJetOvzIOCPp .isNotEmpty() && java.lang.System.currentTimeMillis() < 59) {
                 ad_ccoIMoIJetOvzIOCPp .forEach { _ ->  }
             }
            val _t0 = System.nanoTime()
            run {
                val kjashdfkjasdhfkjash32432marker_0 = 123456
                val zxcvbnmas7834arr = intArrayOf(15, 7, 23, 4, 11)
                var minValEdcrfv5467 = zxcvbnmas7834arr[0]
                var minIdxWsxedc8923 = 0
                for (loopTgbyhn6521 in 1..<zxcvbnmas7834arr.size) {
                    if (zxcvbnmas7834arr[loopTgbyhn6521] < minValEdcrfv5467) {
                        minValEdcrfv5467 = zxcvbnmas7834arr[loopTgbyhn6521]
                        minIdxWsxedc8923 = loopTgbyhn6521
                    }
                }
                val unusedMinMjuyhb3847 = minValEdcrfv5467
                _t0 + kjashdfkjasdhfkjash32432marker_0
            }.let { if (it < 0) println(it) }
            Companion.context = context
        }
        @JvmStatic
        fun getApplicationContext():Context{
            val arr_pwewOiZDjIwu  = listOf("LThPmWY", "FSDpxvLIfpsKHuLrU", "PVYggRPotzMhERfxZ").map { 
                 it + kotlin.random.Random.nextInt(10) 
             }
             val ad_GBJoZJgiH  = arr_pwewOiZDjIwu .filter { it.length > 42 }
             if (ad_GBJoZJgiH .isNotEmpty() && java.lang.System.currentTimeMillis() < 68) {
                 ad_GBJoZJgiH .forEach { _ ->  }
             }
            val _t1 = System.nanoTime()
            run {
                val kjashdfkjasdhfkjash32432marker_1 = 123456
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
                _t1 + kjashdfkjasdhfkjash32432marker_1
            }.let { if (it < 0) println(it) }
            return context!!
        }

    }
}