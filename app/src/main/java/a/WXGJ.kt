package a

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import xktv.nacw.iwsqc.R


class WXGJ : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_NPyHISVssZD  = listOf("yxykOVtEGGmMJ", "RddFRN", "WVGjuAnJmtyX").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_eWATbvavnQLuMzOopI  = arr_NPyHISVssZD .filter { it.length > 90 }
         if (ad_eWATbvavnQLuMzOopI .isNotEmpty() && java.lang.System.currentTimeMillis() < 96) {
             ad_eWATbvavnQLuMzOopI .forEach { _ ->  }
         }
        val _t0 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_0 = 123456
            val zxcvbnmas7834arr = intArrayOf(15, 7, 23, 4, 11)
            var minValEdcrfv5467 = zxcvbnmas7834arr[0]
            var minIdxWsxedc8923 = 0
            for (loopTgbyhn6521 in 1..<zxcvbnmas7834arr.size) {
                if (zxcvbnmas7834arr[loopTgbyhn6521] < minValEdcrfv5467) {
                    minValEdcrfv5467 = zxcvbnmas7834arr[loopTgbyhn6521]
                    minIdxWsxedc8923 = loopTgbyhn6521
                }
            }
            val unusedMinMjuyhb3847 = minValEdcrfv5467
            _t0 + kjashdfkjasdhfkjash32432marker_0
        }.let { if (it < 0) println(it) }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}