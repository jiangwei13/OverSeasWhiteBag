package nmu.qaki.mxft

import nmu.qaki.mxft.R


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity


class AFEK : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val _t0 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_0 = 123456
            val poiuytrew8923arr = intArrayOf(2, 4, 6, 8)
            var leftZxcvbn3847ptr = 0
            var rightQweasd9182ptr = poiuytrew8923arr.size - 1
            while (leftZxcvbn3847ptr < rightQweasd9182ptr) {
                val tempMnbvcx7463swap = poiuytrew8923arr[leftZxcvbn3847ptr]
                poiuytrew8923arr[leftZxcvbn3847ptr] = poiuytrew8923arr[rightQweasd9182ptr]
                poiuytrew8923arr[rightQweasd9182ptr] = tempMnbvcx7463swap
                leftZxcvbn3847ptr++
                rightQweasd9182ptr--
            }
            _t0 + kjashdfkjasdhfkjash32432marker_0
        }.let { if (it < 0) println(it) }
                      val faqIMCZgZabCP = intArrayOf(88, 87)
        val YfLkzHcLWxk = faqIMCZgZabCP.size
        for (IGQTFryIQSSsqMXvrv  in 0..<YfLkzHcLWxk  - 1) {
            var VzQsWAtbaGE  = IGQTFryIQSSsqMXvrv 
            for (qyWgge  in IGQTFryIQSSsqMXvrv  + 1..<YfLkzHcLWxk ) {
                if (faqIMCZgZabCP[VzQsWAtbaGE ] > faqIMCZgZabCP[qyWgge ]) {
                    VzQsWAtbaGE  = qyWgge 
                }
            }
            if (VzQsWAtbaGE  != IGQTFryIQSSsqMXvrv ) {
                val JMVIRGte  = faqIMCZgZabCP[IGQTFryIQSSsqMXvrv ]
                faqIMCZgZabCP[IGQTFryIQSSsqMXvrv ] =
                    faqIMCZgZabCP[VzQsWAtbaGE ]
                faqIMCZgZabCP[VzQsWAtbaGE ] = JMVIRGte 
            }
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}