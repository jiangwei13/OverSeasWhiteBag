package aynf.bhvkw.zloxx

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.deploy.R


class IUA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_iAAKFcyd = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_BuyjO  = (arr_iAAKFcyd  shl 61) xor (arr_iAAKFcyd  shr 99)
         val j_ecWmguEuJzcV  = i_BuyjO .inv() and 0xFFFF
         if (j_ecWmguEuJzcV  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_HmzgDuruQZzpaWMZrO")
         }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_draw_main)
    }
}