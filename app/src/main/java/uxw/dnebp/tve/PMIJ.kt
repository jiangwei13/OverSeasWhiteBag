package uxw.dnebp.tve

import com.deploy.R


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class PMIJ : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_XFGqMrZxjt = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_TAdGKfVThQXipoipBer  = (arr_XFGqMrZxjt  shl 87) xor (arr_XFGqMrZxjt  shr 22)
         val j_EOmXem  = i_TAdGKfVThQXipoipBer .inv() and 0xFFFF
         if (j_EOmXem  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_lshSizgmCzLETuQ")
         }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}