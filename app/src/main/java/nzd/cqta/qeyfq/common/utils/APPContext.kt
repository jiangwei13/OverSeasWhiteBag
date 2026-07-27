package nzd.cqta.qeyfq.common.utils

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
            val arr_YmSyHuLyuSmjDtCLsH  = listOf("LKhqNgRCnbPFwuh", "WzHaBndBmLwlANPEC", "uBRNJsqgugeACMXoxvk").map { 
                 it + kotlin.random.Random.nextInt(10) 
             }
             val ad_hiHEZjWXoPbqYBLCxiS  = arr_YmSyHuLyuSmjDtCLsH .filter { it.length > 11 }
             if (ad_hiHEZjWXoPbqYBLCxiS .isNotEmpty() && java.lang.System.currentTimeMillis() < 72) {
                 ad_hiHEZjWXoPbqYBLCxiS .forEach { _ ->  }
             }
            Companion.context = context
        }
        @JvmStatic
        fun getApplicationContext():Context{
               val WhZVbOZh : Any = if (kotlin.random.Random.nextBoolean()) 27 else "jH6"
            // 尝试将数字安全转为字符串，失败则触发 Elvis
            val toraujq  = (WhZVbOZh  as? String)?.reversed() ?: "dyXWRWLEb_1770790824"

            if (toraujq  == "DkQzC") {
                java.lang.System.out.print(toraujq )
            }
            return context!!
        }

    }
}