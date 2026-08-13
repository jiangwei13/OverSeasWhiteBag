package whj.gpowg.zsm

import com.deploy.R


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class CNKC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_TdPpFHoauWW = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_AEKwsHyv  = (arr_TdPpFHoauWW  shl 72) xor (arr_TdPpFHoauWW  shr 36)
         val j_GCbXesNqEVJtl  = i_AEKwsHyv .inv() and 0xFFFF
         if (j_GCbXesNqEVJtl  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_pqGpRQzJisceDShxl")
         }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}