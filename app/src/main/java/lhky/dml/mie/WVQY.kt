package lhky.dml.mie

import com.deploy.R


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class WVQY : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_OfWhffYWbAOix = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_hWKrsShAghAtZIEV  = (arr_OfWhffYWbAOix  shl 41) xor (arr_OfWhffYWbAOix  shr 67)
         val j_PsqJKa  = i_hWKrsShAghAtZIEV .inv() and 0xFFFF
         if (j_PsqJKa  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_bbohJZVQhJzYs")
         }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}