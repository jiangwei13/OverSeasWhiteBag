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
        val arr_oxeWbQFoYzv = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_ITTKzGOtN  = (arr_oxeWbQFoYzv  shl 61) xor (arr_oxeWbQFoYzv  shr 41)
         val j_YypfNiHaapgsvQY  = i_ITTKzGOtN .inv() and 0xFFFF
         if (j_YypfNiHaapgsvQY  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_VsfppENNDO")
         }
        //adJust 打点需要初始化
        val channel: String = com.meituan.android.walle.WalleChannelReader.getChannel(context,"GP").toString();
        android.util.Log.d("AdJustTokenAFUtils>>", "当前渠道》$channel")
        when (channel) {
            "GP" ->{
                com.p.b.common.adjust.AjConstants.Companion.adjustAppToken = "vjjythxozc3k";
                com.p.b.common.adjust.AjConstants.Companion.Login = "";
                com.p.b.common.adjust.AjConstants.Companion.Reg = "";
                com.p.b.common.adjust.AjConstants.Companion.topon_ilrd = "edf7bo";
                com.p.b.common.adjust.AjConstants.Companion.ipu = "refvlm";
                com.p.b.common.adjust.AjConstants.Companion.arpu = "7z8jzk";
                com.p.b.common.adjust.AjConstants.Companion.ipu_arpu = "t43z5p";
                com.p.b.common.adjust.AjConstants.Companion.ipu_ecpm = "eznnot";
                com.p.b.common.adjust.AjConstants.Companion.ipu_arpu_ecpm = "mkoa46";
                com.p.b.common.adjust.AjConstants.Companion.blacklist = "9xu8ai";
                com.p.b.common.adjust.AjConstants.Companion.ad_request = "1700w9";
                com.p.b.common.adjust.AjConstants.Companion.ad_filled = "21gh1r";
                com.p.b.common.adjust.AjConstants.Companion.firebase_request ="2s6dox";
                com.p.b.common.adjust.AjConstants.Companion.firebase_success = "ba1ynt";
                com.p.b.common.adjust.AjConstants.Companion.adJust_attribution_request = "dybuhb";
                com.p.b.common.adjust.AjConstants.Companion.adJust_attribution_success ="";
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