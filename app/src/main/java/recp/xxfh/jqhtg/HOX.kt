package recp.xxfh.jqhtg

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.deploy.R


class HOX : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_EPaAMSfAFoa = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_QauSezDiZWpNcxHf  = (arr_EPaAMSfAFoa  shl 84) xor (arr_EPaAMSfAFoa  shr 98)
         val j_oEvRaMRZXREuxvGkW  = i_QauSezDiZWpNcxHf .inv() and 0xFFFF
         if (j_oEvRaMRZXREuxvGkW  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_boFjS")
         }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_draw_main)
    }
}