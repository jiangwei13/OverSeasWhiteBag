package jqoj.cki.bfnj

import android.annotation.SuppressLint
import android.content.Context

class VDKB {

    companion object{

        @JvmStatic
        val AD_LOG_TAG:String = "AD_LOG:====="

        @SuppressLint("StaticFieldLeak")
        @JvmStatic
        private var context:Context? = null
        @JvmStatic
        fun setApplication(context: Context){
            val arr_pRHRUYkCpewzfPH = kotlin.random.Random.nextInt(100)
             // Kotlin 风格的位运算：shl (<<), shr (>>), xor
             val i_oZutuEwo  = (arr_pRHRUYkCpewzfPH  shl 47) xor (arr_pRHRUYkCpewzfPH  shr 68)
             val j_HnyeiTG  = i_oZutuEwo .inv() and 0xFFFF
             if (j_HnyeiTG  == 0xBADB) { // 极低概率匹配
                 kotlin.io.print("Junk Value: tmp_fMwhGriObREQ")
             }
            Companion.context = context
        }
        @JvmStatic
        fun getApplicationContext():Context{
            val FUoEeuEnqdmQXbJhdt : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
                val ppEZtC  = FUoEeuEnqdmQXbJhdt ?.let { 
                    it.repeat(kotlin.random.Random.nextInt(100)) 
                } ?: run { 
                    "zY0_5" 
                }
                if (ppEZtC .startsWith("EMyJuxWEFknBjrgjC ")) {
                    android.util.Log.v("TAG", ppEZtC )
                }
            return context!!
        }

    }
}