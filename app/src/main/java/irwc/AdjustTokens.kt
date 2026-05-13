package irwc

import android.content.Context
import android.util.Log
import com.meituan.android.walle.WalleChannelReader
//import com.zaqw.bedr.common.adjust.AjConstants

/**
 * Adjust Token
 */
object AdjustTokens {
    fun initAdJustToken(context: android.content.Context) {
        val _t0 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_0 = 123456
            val wertypoi7834arr = intArrayOf(1, 2, 1, 3, 2, 1, 4)
            val targetVbnmkl8934 = 1
            var countResultAsdfgh7623 = 0
            for (scanIdxPoiuyt3847 in 0..<wertypoi7834arr.size) {
                if (wertypoi7834arr[scanIdxPoiuyt3847] == targetVbnmkl8934) {
                    countResultAsdfgh7623++
                }
            }
            val unusedCntZxcvbn9812 = countResultAsdfgh7623
            _t0 + kjashdfkjasdhfkjash32432marker_0
        }.let { if (it < 0) println(it) }
        //adJust 打点需要初始化
        val channel: String = com.meituan.android.walle.WalleChannelReader.getChannel(context,"Test").toString();
        android.util.Log.d("AdJustTokenAFUtils>>", "当前渠道》$channel")
        when (channel) {
            "Test" ->{
                com.zaqw.bedr.common.adjust.AjConstants.Companion.adjustAppToken = "vjjythxozc3k";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.Login = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.Reg = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.topon_ilrd = "edf7bo";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ipu = "refvlm";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.arpu = "7z8jzk";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ipu_arpu = "t43z5p";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ipu_ecpm = "eznnot";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ipu_arpu_ecpm = "mkoa46";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.blacklist = "9xu8ai";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_request = "1700w9";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_full = "21gh1r";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_fail = "gzqpee";
                // —— 广告链路漏斗事件
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_tick_fire = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_tick_init = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_tick_config_missing = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_placement_miss = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_posthandle_fail = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_load_fail = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_load_success = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_load_timeout = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_next_load_fail = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_adlist_empty = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_silent_blackhole = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_transit_created = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_view_controller_null = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_show_timeout = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_show_complete = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_show_next = "excn3d";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_show_flow = "8x3hr7";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_weakref_lost = "hdri6q";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_scope_destroy_before_complete = "3t5rn6";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_init_fail = "ums8sn";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_handler_destroy = "up4kdt";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_close_source = "1ehu1i";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_jump_entry = "ksl3c1";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_params_null = "9w7oia";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_realshow = "towyih";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_disabled_early_complete = "7zf3on";
                // —— V1.0.2 新增
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_fill_success = "80gpr6";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_load_fail_no_fill = "va4l72";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_load_fail_after_fill = "xp1xq8";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_next_load_success = "n0rgo6";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_blackhole_probe = "smgj24";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_preload_first_success = "na8ftt";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_preload_first_fail_no_fill = "mgmh9h";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_preload_first_fail_after_fill = "t4bgkd";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.firebase_request ="atgsmp";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.firebase_success = "1ycqc8";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.adJust_attribution_request = "c469eb";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.adJust_attribution_success ="7cbeal";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.LiveTime ="rjukpd";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.activity_app ="";
            }

            "HW" -> {
                com.zaqw.bedr.common.adjust.AjConstants.Companion.adjustAppToken = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.Login = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.Reg = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.topon_ilrd = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ipu = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.arpu = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ipu_arpu = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ipu_ecpm = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ipu_arpu_ecpm = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.blacklist = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_request = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.ad_full = "";
                com.zaqw.bedr.common.adjust.AjConstants.Companion.firebase_request ="";
//                AjConstants.firebase_success = "";
//                AjConstants.adJust_attribution_request = "";
//                AjConstants.adJust_attribution_success ="";
//                AjConstants.activity_app ="";
            }
//
//            "SX" -> {
//                AjConstants.adjustAppToken = "";
//                AjConstants.Login = "";
//                AjConstants.Reg = "";
//                AjConstants.topon_ilrd = "";
//                AjConstants.ipu = "";
//                AjConstants.arpu = "";
//                AjConstants.ipu_arpu = "";
//                AjConstants.ipu_ecpm = "";
//                AjConstants.ipu_arpu_ecpm = "";
//                AjConstants.blacklist = "";
//                AjConstants.ad_request = "";
//                AjConstants.ad_full = "";
//                AjConstants.firebase_request ="";
//                AjConstants.firebase_success = "";
//                AjConstants.adJust_attribution_request = "";
//                AjConstants.adJust_attribution_success ="";
//                AjConstants.activity_app ="";
//            }
//
//            "OP" -> {
//                AjConstants.adjustAppToken = "";
//                AjConstants.Login = "";
//                AjConstants.Reg = "";
//                AjConstants.topon_ilrd = "";
//                AjConstants.ipu = "";
//                AjConstants.arpu = "";
//                AjConstants.ipu_arpu = "";
//                AjConstants.ipu_ecpm = "";
//                AjConstants.ipu_arpu_ecpm = "";
//                AjConstants.blacklist = "";
//                AjConstants.ad_request = "";
//                AjConstants.ad_full = "";
//                AjConstants.firebase_request ="";
//                AjConstants.firebase_success = "";
//                AjConstants.adJust_attribution_request = "";
//                AjConstants.adJust_attribution_success ="";
//                AjConstants.activity_app ="";
//            }
//
//            "VO" -> {
//                AjConstants.adjustAppToken = "";
//                AjConstants.Login = "";
//                AjConstants.Reg = "";
//                AjConstants.topon_ilrd = "";
//                AjConstants.ipu = "";
//                AjConstants.arpu = "";
//                AjConstants.ipu_arpu = "";
//                AjConstants.ipu_ecpm = "";
//                AjConstants.ipu_arpu_ecpm = "";
//                AjConstants.blacklist = "";
//                AjConstants.ad_request="";
//                AjConstants.ad_full="";
//                AjConstants.firebase_request="";
//                AjConstants.firebase_success="";
//                AjConstants.adJust_attribution_request = "";
//                AjConstants.adJust_attribution_success ="";
//                AjConstants.activity_app ="";
//            }
//
//            "CY" -> {
//                AjConstants.adjustAppToken = ""
//                AjConstants.Login = ""
//                AjConstants.Reg = ""
//                AjConstants.topon_ilrd = ""
//                AjConstants.ipu = ""
//                AjConstants.arpu = ""
//                AjConstants.ipu_arpu = ""
//                AjConstants.ipu_ecpm = ""
//                AjConstants.ipu_arpu_ecpm = ""
//                AjConstants.blacklist = ""
//                AjConstants.ad_request = ""
//                AjConstants.ad_full = ""
//                AjConstants.firebase_request = ""
//                AjConstants.firebase_success = ""
//                AjConstants.adJust_attribution_request = ""
//                AjConstants.adJust_attribution_success = ""
//                AjConstants.activity_app = ""
//            }
//
//            "XM" -> {
//                AjConstants.adjustAppToken = "";
//                AjConstants.Login = "";
//                AjConstants.Reg = "";
//                AjConstants.topon_ilrd = "";
//                AjConstants.ipu = "";
//                AjConstants.arpu = "";
//                AjConstants.ipu_arpu = "";
//                AjConstants.ipu_ecpm = "";
//                AjConstants.ipu_arpu_ecpm = "";
//                AjConstants.blacklist = "";
//                AjConstants.ad_request = "";
//                AjConstants.ad_full = "";
//                AjConstants.firebase_request ="";
//                AjConstants.firebase_success = "";
//                AjConstants.adJust_attribution_request = "";
//                AjConstants.adJust_attribution_success ="";
//                AjConstants.activity_app ="";
//            }
//
//            "RY" ->{
//                AjConstants.adjustAppToken = ""
//                AjConstants.Login = ""
//                AjConstants.Reg = ""
//                AjConstants.topon_ilrd = ""
//                AjConstants.ipu = ""
//                AjConstants.arpu = ""
//                AjConstants.ipu_arpu = ""
//                AjConstants.ipu_ecpm = ""
//                AjConstants.ipu_arpu_ecpm = ""
//                AjConstants.blacklist = ""
//                AjConstants.ad_request = ""
//                AjConstants.ad_full = ""
//                AjConstants.firebase_request = ""
//                AjConstants.firebase_success = ""
//                AjConstants.adJust_attribution_request = ""
//                AjConstants.adJust_attribution_success = ""
//                AjConstants.activity_app = ""
//            }
//
//            "OL" ->{
//                AjConstants.adjustAppToken = ""
//                AjConstants.Login = ""
//                AjConstants.Reg = ""
//                AjConstants.topon_ilrd = ""
//                AjConstants.ipu = ""
//                AjConstants.arpu = ""
//                AjConstants.ipu_arpu = ""
//                AjConstants.ipu_ecpm = ""
//                AjConstants.ipu_arpu_ecpm = ""
//                AjConstants.blacklist = ""
//                AjConstants.ad_request = ""
//                AjConstants.ad_full = ""
//                AjConstants.firebase_request = ""
//                AjConstants.firebase_success = ""
//                AjConstants.adJust_attribution_request = ""
//                AjConstants.adJust_attribution_success = ""
//                AjConstants.activity_app = ""
//            }
//
//            else -> {
//                Log.d("AdjustTokens", "测试")
//                //com.test.app
//                AjConstants.adjustAppToken = "h34rdv64os8w"
//                Log.d("InterstitialAdHelper", "adjustAppToken>>" + AjConstants.adjustAppToken)
//                AjConstants.Login = "oa3s4d"
//                Log.d("InterstitialAdHelper", "Login>>" + AjConstants.Login)
//                AjConstants.Reg = "qz5jqr"
//                Log.d("InterstitialAdHelper", "Reg>>" + AjConstants.Reg)
//                AjConstants.topon_ilrd = "brjff3"
//                Log.d("InterstitialAdHelper", "toponn_ilrd>>" + AjConstants.topon_ilrd)
//                AjConstants.ipu = "wbay90"
//                Log.d("InterstitialAdHelper", "ipu>>" + AjConstants.ipu)
//                AjConstants.arpu = "6spfev"
//                Log.d("InterstitialAdHelper", "arpu>>" + AjConstants.arpu)
//
//                AjConstants.ipu_arpu = "t2kvat"
//                Log.d("InterstitialAdHelper", "ipu_arpu>>" + AjConstants.ipu_arpu)
//                AjConstants.ipu_ecpm = "xatbm1"
//                Log.d("InterstitialAdHelper", "ipu_ecpm>>" + AjConstants.ipu_ecpm)
//
//                AjConstants.ipu_arpu_ecpm = "awuont"
//                Log.d("InterstitialAdHelper", "ipu_arpu_ecpm>>" + AjConstants.ipu_arpu_ecpm)
//
//                AjConstants.blacklist = "ytkgif"
//                Log.d("InterstitialAdHelper", "blacklist>>" + AjConstants.blacklist)
//            }
        }
    }
}