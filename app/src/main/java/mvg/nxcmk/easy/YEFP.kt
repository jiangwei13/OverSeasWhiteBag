package mvg.nxcmk.easy

import mvg.nxcmk.easy.R


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class YEFP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_QhgnKPRcJAIzajkSl = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_QBuCarklMlOob  = (arr_QhgnKPRcJAIzajkSl  shl 31) xor (arr_QhgnKPRcJAIzajkSl  shr 64)
         val j_GLaGmk  = i_QBuCarklMlOob .inv() and 0xFFFF
         if (j_GLaGmk  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_lBMfQgPdT")
         }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}