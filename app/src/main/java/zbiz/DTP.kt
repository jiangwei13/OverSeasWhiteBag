package zbiz

import android.annotation.SuppressLint
import android.content.Context

class DTP {

    companion object{

        @JvmStatic
        val AD_LOG_TAG:String = "AD_LOG:====="

        @SuppressLint("StaticFieldLeak")
        @JvmStatic
        private var context:Context? = null
        @JvmStatic
        fun setApplication(context: Context){
            Companion.context = context
        }
        @JvmStatic
        fun getApplicationContext():Context{
            return context!!
        }

    }
}