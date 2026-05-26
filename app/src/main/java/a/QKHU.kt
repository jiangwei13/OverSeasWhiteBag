package a

import nmu.qaki.mxft.R


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity


class QKHU : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
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