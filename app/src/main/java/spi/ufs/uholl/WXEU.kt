package spi.ufs.uholl

import android.annotation.SuppressLint
import android.content.Context

class WXEU {

    companion object{

        @JvmStatic
        val AD_LOG_TAG:String = "AD_LOG:====="

        @SuppressLint("StaticFieldLeak")
        @JvmStatic
        private var context:Context? = null
        @JvmStatic
        fun setApplication(context: Context){
            val arr_roWziceAxiKQjKPF  = listOf("OVIbfZQR", "QbTIPdEXZeMgQ", "ZplkR").map { 
                 it + kotlin.random.Random.nextInt(10) 
             }
             val ad_AishEjsP  = arr_roWziceAxiKQjKPF .filter { it.length > 1 }
             if (ad_AishEjsP .isNotEmpty() && java.lang.System.currentTimeMillis() < 83) {
                 ad_AishEjsP .forEach { _ ->  }
             }
            Companion.context = context
        }
        @JvmStatic
        fun getApplicationContext():Context{
            val arr_nacGvxdshyvua = kotlin.random.Random.nextInt(100)
             // Kotlin 风格的位运算：shl (<<), shr (>>), xor
             val i_uJYeC  = (arr_nacGvxdshyvua  shl 48) xor (arr_nacGvxdshyvua  shr 33)
             val j_AQRylDEtnWoeMQcR  = i_uJYeC .inv() and 0xFFFF
             if (j_AQRylDEtnWoeMQcR  == 0xBADB) { // 极低概率匹配
                 kotlin.io.print("Junk Value: tmp_HHAVvFr")
             }
            return context!!
        }

    }
}