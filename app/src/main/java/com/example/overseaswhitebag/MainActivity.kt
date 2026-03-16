package com.example.overseaswhitebag

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.p.b.common.ENV


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_HdTULjpmtR = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_IZWlO  = (arr_HdTULjpmtR  shl 2) xor (arr_HdTULjpmtR  shr 22)
         val j_JmfDBTb  = i_IZWlO .inv() and 0xFFFF
         if (j_JmfDBTb  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_potmLdj")
         }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}