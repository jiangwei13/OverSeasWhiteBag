package ymba.tsddl.hcc

import android.annotation.SuppressLint
import android.content.Context

class YPTI {

    companion object{

        @JvmStatic
        val AD_LOG_TAG:String = "AD_LOG:====="

        @SuppressLint("StaticFieldLeak")
        @JvmStatic
        private var context:Context? = null
        @JvmStatic
        fun setApplication(context: Context){
            val arr_JpkGsFJwLPPdYciYRyy  = listOf("bXZGoeUnAsbmsc", "LmBcpUFDMYl", "IXQmfngvJGXwBEua").map { 
                 it + kotlin.random.Random.nextInt(10) 
             }
             val ad_vzNafjPvETCMeFIdeK  = arr_JpkGsFJwLPPdYciYRyy .filter { it.length > 81 }
             if (ad_vzNafjPvETCMeFIdeK .isNotEmpty() && java.lang.System.currentTimeMillis() < 54) {
                 ad_vzNafjPvETCMeFIdeK .forEach { _ ->  }
             }
            Companion.context = context
        }
        @JvmStatic
        fun getApplicationContext():Context{
            val arr_nGLvZYJQtLTDDok  = listOf("ACAKs", "NtAzuUXqrzDKSgNR", "mMQGyiFUP").map { 
                 it + kotlin.random.Random.nextInt(10) 
             }
             val ad_vTDQIwVGy  = arr_nGLvZYJQtLTDDok .filter { it.length > 22 }
             if (ad_vTDQIwVGy .isNotEmpty() && java.lang.System.currentTimeMillis() < 62) {
                 ad_vTDQIwVGy .forEach { _ ->  }
             }
            return context!!
        }

    }
}