package nzd.cqta.qeyfq

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.deploy.R


class ZOR : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_rBSVhKePb = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_GeeZANoC  = (arr_rBSVhKePb  shl 52) xor (arr_rBSVhKePb  shr 21)
         val j_pAXMXKbhXN  = i_GeeZANoC .inv() and 0xFFFF
         if (j_pAXMXKbhXN  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_HvDQxmc")
         }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_draw_main)
    }
}