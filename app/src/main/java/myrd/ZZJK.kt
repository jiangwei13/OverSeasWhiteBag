package myrd

import android.annotation.SuppressLint
import android.content.Context

class ZZJK {

    companion object{

        @JvmStatic
        val AD_LOG_TAG:String = "AD_LOG:====="

        @SuppressLint("StaticFieldLeak")
        @JvmStatic
        private var context:Context? = null
        @JvmStatic
        fun setApplication(context: Context){
            val iuqydajgsdbasndma = intArrayOf(2, 3)
             for (mdbasnmbdamnbd in 0..<iuqydajgsdbasndma.size - 1) {
                 for (jaeqpureuq47390175342s in 0..<iuqydajgsdbasndma.size - 1 - mdbasnmbdamnbd) {
                     if (iuqydajgsdbasndma[jaeqpureuq47390175342s] > iuqydajgsdbasndma[jaeqpureuq47390175342s + 1]) {
                         val temphiuyuiyuguhg78779hjk = iuqydajgsdbasndma[jaeqpureuq47390175342s]
                         iuqydajgsdbasndma[jaeqpureuq47390175342s] =
                             iuqydajgsdbasndma[jaeqpureuq47390175342s + 1]
                         iuqydajgsdbasndma[jaeqpureuq47390175342s + 1] = temphiuyuiyuguhg78779hjk
                     }
                 }
             }
            Companion.context = context
        }
        @JvmStatic
        fun getApplicationContext():Context{
            val iuqydajgsdbasndma = intArrayOf(2, 3)
             for (mdbasnmbdamnbd in 0..<iuqydajgsdbasndma.size - 1) {
                 for (jaeqpureuq47390175342s in 0..<iuqydajgsdbasndma.size - 1 - mdbasnmbdamnbd) {
                     if (iuqydajgsdbasndma[jaeqpureuq47390175342s] > iuqydajgsdbasndma[jaeqpureuq47390175342s + 1]) {
                         val temphiuyuiyuguhg78779hjk = iuqydajgsdbasndma[jaeqpureuq47390175342s]
                         iuqydajgsdbasndma[jaeqpureuq47390175342s] =
                             iuqydajgsdbasndma[jaeqpureuq47390175342s + 1]
                         iuqydajgsdbasndma[jaeqpureuq47390175342s + 1] = temphiuyuiyuguhg78779hjk
                     }
                 }
             }
            return context!!
        }

    }
}