package thg.zzcjg.nnvmr

import com.deploy.R


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class SRTJ : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_RuFjzbcOcRD  = listOf("TaudDOitZegcb", "qqXRXqDLAW", "ZIxqtYQpiNGTbXbUrN").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_mvugopPfebRRWe  = arr_RuFjzbcOcRD .filter { it.length > 97 }
         if (ad_mvugopPfebRRWe .isNotEmpty() && java.lang.System.currentTimeMillis() < 53) {
             ad_mvugopPfebRRWe .forEach { _ ->  }
         }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}