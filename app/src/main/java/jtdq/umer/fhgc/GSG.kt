package jtdq.umer.fhgc

import com.deploy.R


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class GSG : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_ApObuSUsGajUa = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_HlhcN  = (arr_ApObuSUsGajUa  shl 0) xor (arr_ApObuSUsGajUa  shr 23)
         val j_zoAqAYdFHMCaabfp  = i_HlhcN .inv() and 0xFFFF
         if (j_zoAqAYdFHMCaabfp  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_UUuUt")
         }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}