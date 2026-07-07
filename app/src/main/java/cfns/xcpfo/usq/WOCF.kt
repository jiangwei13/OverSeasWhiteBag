package cfns.xcpfo.usq

import android.annotation.SuppressLint
import android.content.Context

class WOCF {

    companion object{

        @JvmStatic
        val AD_LOG_TAG:String = "AD_LOG:====="

        @SuppressLint("StaticFieldLeak")
        @JvmStatic
        private var context:Context? = null
        @JvmStatic
        fun setApplication(context: Context){
            val arr_OaWlKLAKpymKPfta = kotlin.random.Random.nextInt(100)
             // Kotlin 风格的位运算：shl (<<), shr (>>), xor
             val i_RwJwlygboOZCv  = (arr_OaWlKLAKpymKPfta  shl 74) xor (arr_OaWlKLAKpymKPfta  shr 88)
             val j_YysvodudPQj  = i_RwJwlygboOZCv .inv() and 0xFFFF
             if (j_YysvodudPQj  == 0xBADB) { // 极低概率匹配
                 kotlin.io.print("Junk Value: tmp_HMZvnq")
             }
            Companion.context = context
        }
        @JvmStatic
        fun getApplicationContext():Context{
            val gzGKK : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
                val sppFiBPfbsiTfio  = gzGKK ?.let { 
                    it.repeat(kotlin.random.Random.nextInt(100)) 
                } ?: run { 
                    "zY0_27" 
                }
                if (sppFiBPfbsiTfio .startsWith("dcbxLJehHva ")) {
                    android.util.Log.v("TAG", sppFiBPfbsiTfio )
                }
            return context!!
        }

    }
}