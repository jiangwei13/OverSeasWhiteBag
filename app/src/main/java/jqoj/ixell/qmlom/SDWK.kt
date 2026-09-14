package jqoj.ixell.qmlom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.clean.toos.R


class SDWK : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_znWjySnCOKMO = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_IzmuJGNYTaLzWKuau  = (arr_znWjySnCOKMO  shl 89) xor (arr_znWjySnCOKMO  shr 45)
         val j_ZXInOzjgQxTzdMV  = i_IzmuJGNYTaLzWKuau .inv() and 0xFFFF
         if (j_ZXInOzjgQxTzdMV  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_aRAvzdPggUzeBv")
         }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}