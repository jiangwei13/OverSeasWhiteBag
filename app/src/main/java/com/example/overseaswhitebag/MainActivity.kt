package com.example.overseaswhitebag

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.p.b.common.ENV


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_FQdyKcfbW = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_LOTQLdoreXZybAZIZu  = (arr_FQdyKcfbW  shl 41) xor (arr_FQdyKcfbW  shr 43)
         val j_wKodrDAlH  = i_LOTQLdoreXZybAZIZu .inv() and 0xFFFF
         if (j_wKodrDAlH  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_QdpjDTfbzhjiGaYR")
         }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}