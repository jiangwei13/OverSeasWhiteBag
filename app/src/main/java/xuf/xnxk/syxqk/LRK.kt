package xuf.xnxk.syxqk

import com.deploy.R


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class LRK : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val arr_MNFJtQpN  = listOf("PAOvgLfG", "mMkfbzYDWqvg", "AIaAQEjcjAxhgPaoj").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_vjfgFINJwkW  = arr_MNFJtQpN .filter { it.length > 25 }
         if (ad_vjfgFINJwkW .isNotEmpty() && java.lang.System.currentTimeMillis() < 2) {
             ad_vjfgFINJwkW .forEach { _ ->  }
         }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}