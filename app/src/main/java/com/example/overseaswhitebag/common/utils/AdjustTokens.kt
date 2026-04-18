package com.example.overseaswhitebag.common.utils

import android.content.Context
import android.util.Log
import com.meituan.android.walle.WalleChannelReader
import nuj.dofd.iiel.adjust.AjConstants

/**
 * Adjust Token
 */
object AdjustTokens {
    fun initAdJustToken(context: Context) {
        //adJust 打点需要初始化
        val channel: String = WalleChannelReader.getChannel(context,"GP").toString();
        Log.d("AdJustTokenAFUtils>>", "当前渠道》$channel")
        when (channel) {
            "GP" ->{
                AjConstants.adjustAppToken = "zje2w1p4p3wg";
                AjConstants.Login = "";
                AjConstants.Reg = "";
                AjConstants.topon_ilrd = "f7z5vi";
                AjConstants.ipu = "9jxdbh";
                AjConstants.arpu = "3m2k3d";
                AjConstants.ipu_arpu = "zcevu9";
                AjConstants.ipu_ecpm = "o8217u";
                AjConstants.ipu_arpu_ecpm = "rjc5uq";
                AjConstants.blacklist = "hrcuox";
                AjConstants.ad_request = "q4mdze";
                AjConstants.ad_full = "uk1v6h";
                AjConstants.ad_fail = "6nn0v5";
                AjConstants.firebase_request ="1bybza";
                AjConstants.firebase_success = "yccf5i";
                AjConstants.adJust_attribution_request = "kdh4fy";
                AjConstants.adJust_attribution_success ="hta4v5";
                AjConstants.LiveTime ="3hmr83";
                AjConstants.activity_app ="";
            }

            "HW" -> {
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