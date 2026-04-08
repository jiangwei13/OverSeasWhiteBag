package zbix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.clean.toos.R


class DTM : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_TRxFryBPUrCkiT = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_sPLjKuNe  = (arr_TRxFryBPUrCkiT  shl 83) xor (arr_TRxFryBPUrCkiT  shr 37)
         val j_BuJyzrWshxH  = i_sPLjKuNe .inv() and 0xFFFF
         if (j_BuJyzrWshxH  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_tIQNCGNTpjzPUozsWG")
         }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}