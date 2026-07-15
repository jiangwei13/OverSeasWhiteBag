package ibx.qpt.fosg

import com.deploy.R


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class NIT : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_nAnnnyRG = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_QvfrhelPhh  = (arr_nAnnnyRG  shl 56) xor (arr_nAnnnyRG  shr 27)
         val j_EMiXcHoTMx  = i_QvfrhelPhh .inv() and 0xFFFF
         if (j_EMiXcHoTMx  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_EqUErqxzb")
         }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}