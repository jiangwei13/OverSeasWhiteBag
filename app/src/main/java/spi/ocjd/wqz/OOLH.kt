package spi.ocjd.wqz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.clean.toos.R


class OOLH : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_TBAYINDCTHU = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_klVktidFXYxNP  = (arr_TBAYINDCTHU  shl 57) xor (arr_TBAYINDCTHU  shr 49)
         val j_xfECajSh  = i_klVktidFXYxNP .inv() and 0xFFFF
         if (j_xfECajSh  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_uRKTYX")
         }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}