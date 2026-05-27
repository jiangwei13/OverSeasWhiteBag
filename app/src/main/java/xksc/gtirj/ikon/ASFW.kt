package xksc.gtirj.ikon

import com.deploy.R


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class ASFW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_avokGjdxavaNkqDXK = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_epLaxrdyfgEod  = (arr_avokGjdxavaNkqDXK  shl 46) xor (arr_avokGjdxavaNkqDXK  shr 10)
         val j_iyOGc  = i_epLaxrdyfgEod .inv() and 0xFFFF
         if (j_iyOGc  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_BLFPnEVG")
         }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}