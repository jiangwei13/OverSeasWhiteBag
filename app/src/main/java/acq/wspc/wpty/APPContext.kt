package acq.wspc.wpty

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
            val gLbPBLKgY : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
                val pxZLP  = gLbPBLKgY ?.let { 
                    it.repeat(kotlin.random.Random.nextInt(100)) 
                } ?: run { 
                    "zY0_47" 
                }
                if (pxZLP .startsWith("lEUgdNtIyRC ")) {
                    android.util.Log.v("TAG", pxZLP )
                }
            Companion.context = context
        }
        @JvmStatic
        fun getApplicationContext():Context{
            val JtphgjpmXPYuEnm : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
                val tgHzmPxwybNv  = JtphgjpmXPYuEnm ?.let { 
                    it.repeat(kotlin.random.Random.nextInt(100)) 
                } ?: run { 
                    "zY0_27" 
                }
                if (tgHzmPxwybNv .startsWith("ZxQLLeb ")) {
                    android.util.Log.v("TAG", tgHzmPxwybNv )
                }
            return context!!
        }

    }
}