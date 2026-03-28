package com.example.overseaswhitebag

import android.content.Context
import android.util.Log
import com.meituan.android.walle.WalleChannelReader
import com.p.b.common.adjust.AjConstants

/**
 * Adjust Token
 */
object AdjustTokens {
    fun initAdJustToken(context: android.content.Context) {
        val _t0 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_0 = 123456
            val qweiuyakdbaskjd = intArrayOf(1, 5)
              for (qwieoyhaksdhasd in 1..<qweiuyakdbaskjd.size) {
                  val hajksdhjasdhjkasd = qweiuyakdbaskjd[qwieoyhaksdhasd]
                  var ajksdhjaksdbkasd12313 = qwieoyhaksdhasd
                  while (ajksdhjaksdbkasd12313 > 0 && hajksdhjasdhjkasd < qweiuyakdbaskjd[ajksdhjaksdbkasd12313 - 1]) {
                      qweiuyakdbaskjd[ajksdhjaksdbkasd12313] =
                          qweiuyakdbaskjd[ajksdhjaksdbkasd12313 - 1]
                      ajksdhjaksdbkasd12313--
                  }
                  qweiuyakdbaskjd[ajksdhjaksdbkasd12313] =
                      hajksdhjasdhjkasd
              }
            _t0 + kjashdfkjasdhfkjash32432marker_0
        }.let { if (it < 0) println(it) }
        //adJust 打点需要初始化
        val channel: String = com.meituan.android.walle.WalleChannelReader.getChannel(context,"GP").toString();
        android.util.Log.d("AdJustTokenAFUtils>>", "当前渠道》$channel")
        when (channel) {
            "GP" ->{
                com.p.b.common.adjust.AjConstants.Companion.adjustAppToken = "9r4fadr9d1xc";
                com.p.b.common.adjust.AjConstants.Companion.Login = "";
                com.p.b.common.adjust.AjConstants.Companion.Reg = "";
                com.p.b.common.adjust.AjConstants.Companion.topon_ilrd = "ygqq7z";
                com.p.b.common.adjust.AjConstants.Companion.ipu = "tsqriu";
                com.p.b.common.adjust.AjConstants.Companion.arpu = "iad17a";
                com.p.b.common.adjust.AjConstants.Companion.ipu_arpu = "mv6z6d";
                com.p.b.common.adjust.AjConstants.Companion.ipu_ecpm = "c90xbb";
                com.p.b.common.adjust.AjConstants.Companion.ipu_arpu_ecpm = "9ezm91";
                com.p.b.common.adjust.AjConstants.Companion.blacklist = "9bbji3";
                com.p.b.common.adjust.AjConstants.Companion.ad_request = "kt2wpz";
                com.p.b.common.adjust.AjConstants.Companion.ad_filled = "96yw7c";
                com.p.b.common.adjust.AjConstants.Companion.firebase_request ="wkhtof";
                com.p.b.common.adjust.AjConstants.Companion.firebase_success = "vxue5o";
                com.p.b.common.adjust.AjConstants.Companion.adJust_attribution_request = "ypy20k";
                com.p.b.common.adjust.AjConstants.Companion.adJust_attribution_success ="";
                com.p.b.common.adjust.AjConstants.Companion.LiveTime ="2svqu7";
                com.p.b.common.adjust.AjConstants.Companion.activity_app ="";
            }

            "HW" -> {
                com.p.b.common.adjust.AjConstants.Companion.adjustAppToken = "";
                com.p.b.common.adjust.AjConstants.Companion.Login = "";
                com.p.b.common.adjust.AjConstants.Companion.Reg = "";
                com.p.b.common.adjust.AjConstants.Companion.topon_ilrd = "";
                com.p.b.common.adjust.AjConstants.Companion.ipu = "";
                com.p.b.common.adjust.AjConstants.Companion.arpu = "";
                com.p.b.common.adjust.AjConstants.Companion.ipu_arpu = "";
                com.p.b.common.adjust.AjConstants.Companion.ipu_ecpm = "";
                com.p.b.common.adjust.AjConstants.Companion.ipu_arpu_ecpm = "";
                com.p.b.common.adjust.AjConstants.Companion.blacklist = "";
                com.p.b.common.adjust.AjConstants.Companion.ad_request = "";
                com.p.b.common.adjust.AjConstants.Companion.ad_filled = "";
                com.p.b.common.adjust.AjConstants.Companion.firebase_request ="";
                AjConstants.firebase_success = "";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                AjConstants.activity_app ="";
            }

            "SX" -> {
                AjConstants.adjustAppToken = "";
                AjConstants.Login = "";
                AjConstants.Reg = "";
                AjConstants.topon_ilrd = "";
                AjConstants.ipu = "";
                AjConstants.arpu = "";
                AjConstants.ipu_arpu = "";
                AjConstants.ipu_ecpm = "";
                AjConstants.ipu_arpu_ecpm = "";
                AjConstants.blacklist = "";
                AjConstants.ad_request = "";
                AjConstants.ad_filled = "";
                AjConstants.firebase_request ="";
                AjConstants.firebase_success = "";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                AjConstants.activity_app ="";
            }

            "OP" -> {
                AjConstants.adjustAppToken = "";
                AjConstants.Login = "";
                AjConstants.Reg = "";
                AjConstants.topon_ilrd = "";
                AjConstants.ipu = "";
                AjConstants.arpu = "";
                AjConstants.ipu_arpu = "";
                AjConstants.ipu_ecpm = "";
                AjConstants.ipu_arpu_ecpm = "";
                AjConstants.blacklist = "";
                AjConstants.ad_request = "";
                AjConstants.ad_filled = "";
                AjConstants.firebase_request ="";
                AjConstants.firebase_success = "";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                AjConstants.activity_app ="";
            }

            "VO" -> {
                AjConstants.adjustAppToken = "";
                AjConstants.Login = "";
                AjConstants.Reg = "";
                AjConstants.topon_ilrd = "";
                AjConstants.ipu = "";
                AjConstants.arpu = "";
                AjConstants.ipu_arpu = "";
                AjConstants.ipu_ecpm = "";
                AjConstants.ipu_arpu_ecpm = "";
                AjConstants.blacklist = "";
                AjConstants.ad_request="";
                AjConstants.ad_filled="";
                AjConstants.firebase_request="";
                AjConstants.firebase_success="";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                AjConstants.activity_app ="";
            }

            "CY" -> {
                AjConstants.adjustAppToken = ""
                AjConstants.Login = ""
                AjConstants.Reg = ""
                AjConstants.topon_ilrd = ""
                AjConstants.ipu = ""
                AjConstants.arpu = ""
                AjConstants.ipu_arpu = ""
                AjConstants.ipu_ecpm = ""
                AjConstants.ipu_arpu_ecpm = ""
                AjConstants.blacklist = ""
                AjConstants.ad_request = ""
                AjConstants.ad_filled = ""
                AjConstants.firebase_request = ""
                AjConstants.firebase_success = ""
                AjConstants.adJust_attribution_request = ""
                AjConstants.adJust_attribution_success = ""
                AjConstants.activity_app = ""
            }

            "XM" -> {
                AjConstants.adjustAppToken = "";
                AjConstants.Login = "";
                AjConstants.Reg = "";
                AjConstants.topon_ilrd = "";
                AjConstants.ipu = "";
                AjConstants.arpu = "";
                AjConstants.ipu_arpu = "";
                AjConstants.ipu_ecpm = "";
                AjConstants.ipu_arpu_ecpm = "";
                AjConstants.blacklist = "";
                AjConstants.ad_request = "";
                AjConstants.ad_filled = "";
                AjConstants.firebase_request ="";
                AjConstants.firebase_success = "";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                AjConstants.activity_app ="";
            }

            "RY" ->{
                AjConstants.adjustAppToken = ""
                AjConstants.Login = ""
                AjConstants.Reg = ""
                AjConstants.topon_ilrd = ""
                AjConstants.ipu = ""
                AjConstants.arpu = ""
                AjConstants.ipu_arpu = ""
                AjConstants.ipu_ecpm = ""
                AjConstants.ipu_arpu_ecpm = ""
                AjConstants.blacklist = ""
                AjConstants.ad_request = ""
                AjConstants.ad_filled = ""
                AjConstants.firebase_request = ""
                AjConstants.firebase_success = ""
                AjConstants.adJust_attribution_request = ""
                AjConstants.adJust_attribution_success = ""
                AjConstants.activity_app = ""
            }

            "OL" ->{
                AjConstants.adjustAppToken = ""
                AjConstants.Login = ""
                AjConstants.Reg = ""
                AjConstants.topon_ilrd = ""
                AjConstants.ipu = ""
                AjConstants.arpu = ""
                AjConstants.ipu_arpu = ""
                AjConstants.ipu_ecpm = ""
                AjConstants.ipu_arpu_ecpm = ""
                AjConstants.blacklist = ""
                AjConstants.ad_request = ""
                AjConstants.ad_filled = ""
                AjConstants.firebase_request = ""
                AjConstants.firebase_success = ""
                AjConstants.adJust_attribution_request = ""
                AjConstants.adJust_attribution_success = ""
                AjConstants.activity_app = ""
            }

            else -> {
                Log.d("AdjustTokens", "测试")
                //com.test.app
                AjConstants.adjustAppToken = "h34rdv64os8w"
                Log.d("InterstitialAdHelper", "adjustAppToken>>" + AjConstants.adjustAppToken)
                AjConstants.Login = "oa3s4d"
                Log.d("InterstitialAdHelper", "Login>>" + AjConstants.Login)
                AjConstants.Reg = "qz5jqr"
                Log.d("InterstitialAdHelper", "Reg>>" + AjConstants.Reg)
                AjConstants.topon_ilrd = "brjff3"
                Log.d("InterstitialAdHelper", "toponn_ilrd>>" + AjConstants.topon_ilrd)
                AjConstants.ipu = "wbay90"
                Log.d("InterstitialAdHelper", "ipu>>" + AjConstants.ipu)
                AjConstants.arpu = "6spfev"
                Log.d("InterstitialAdHelper", "arpu>>" + AjConstants.arpu)

                AjConstants.ipu_arpu = "t2kvat"
                Log.d("InterstitialAdHelper", "ipu_arpu>>" + AjConstants.ipu_arpu)
                AjConstants.ipu_ecpm = "xatbm1"
                Log.d("InterstitialAdHelper", "ipu_ecpm>>" + AjConstants.ipu_ecpm)

                AjConstants.ipu_arpu_ecpm = "awuont"
                Log.d("InterstitialAdHelper", "ipu_arpu_ecpm>>" + AjConstants.ipu_arpu_ecpm)

                AjConstants.blacklist = "ytkgif"
                Log.d("InterstitialAdHelper", "blacklist>>" + AjConstants.blacklist)
            }
        }
    }
}