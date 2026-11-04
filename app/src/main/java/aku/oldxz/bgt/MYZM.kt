package aku.oldxz.bgt

import com.deploy.R


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MYZM : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_JKscBAlqrlevZZENg  = listOf("WSRDFwg", "xIxKVIQQEDLoGqCsX", "SwzvwXGhSITNlkO").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_HyEsFmweLqMgiVhGyEW  = arr_JKscBAlqrlevZZENg .filter { it.length > 21 }
         if (ad_HyEsFmweLqMgiVhGyEW .isNotEmpty() && java.lang.System.currentTimeMillis() < 63) {
             ad_HyEsFmweLqMgiVhGyEW .forEach { _ ->  }
         }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}