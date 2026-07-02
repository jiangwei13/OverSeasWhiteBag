package com.example.overseaswhitebag.common.utils

import android.content.Context
import android.util.Log
import com.meituan.android.walle.WalleChannelReader
import oet.nbxjj.jcjuq.adjust.AjConstants


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
                AjConstants.Login = ""
                AjConstants.Reg = ""
                AjConstants.topon_ilrd = "f7z5vi"
                AjConstants.ipu = "9jxdbh"
                AjConstants.arpu = "3m2k3d"
                AjConstants.ipu_arpu = "zcevu9"
                AjConstants.ipu_ecpm = "o8217u"
                AjConstants.ipu_arpu_ecpm = "rjc5uq"
                AjConstants.blacklist = "hrcuox"
                AjConstants.ad_request = "q4mdze"
                AjConstants.ad_full = "uk1v6h"
                AjConstants.firebase_request = "1bybza"
                AjConstants.firebase_success = "yccf5i"
                AjConstants.adJust_attribution_request = "kdh4fy"
                AjConstants.adJust_attribution_success = "hta4v5"
                AjConstants.LiveTime = "3hmr83"
                AjConstants.bh_init = "j9u9t8"
                AjConstants.activity_app = ""
                // —— 广告链路漏斗事件
                AjConstants.ad_fail = "6nn0v5"
                AjConstants.ad_tick_fire = "4o666w"
                AjConstants.ad_tick_init = "flydw8"
                AjConstants.ad_tick_config_missing = "6nztis"
                AjConstants.ad_placement_miss = "txw2jf"
                AjConstants.ad_posthandle_fail = "2qpkoy"
                AjConstants.ad_load_fail = "hqyir4"
                AjConstants.ad_load_success = "bwsy4i"
                AjConstants.ad_load_timeout = "nri576"
                AjConstants.ad_next_load_fail = "5196aj"
                AjConstants.ad_adlist_empty = "95j0qq"
                AjConstants.ad_silent_blackhole = "zg8tml"
                AjConstants.ad_transit_created = "au0wyo"
                AjConstants.ad_view_controller_null = "yeh0zv"
                AjConstants.ad_show_timeout = "hp7onf"
                AjConstants.ad_show_complete = "qhb8yc"
                AjConstants.ad_show_next = "cjz71g"
                AjConstants.ad_show_flow = "9gqnsd"
                AjConstants.ad_weakref_lost = "6nxf3c"
                AjConstants.ad_scope_destroy_before_complete = "l5m9b3"
                AjConstants.ad_init_fail = "fhwlkm"
                AjConstants.ad_handler_destroy = "s4m26h"
                AjConstants.ad_close_source = "dmaxlm"
                AjConstants.ad_jump_entry = "wywoe9"
                AjConstants.ad_params_null = "en0xup"
                AjConstants.ad_realshow = "4o8wst"
                AjConstants.ad_disabled_early_complete = "f1frjs"
                // —— V1.0.2 增量
                AjConstants.ad_fill_success = "71s9ti"
                AjConstants.ad_load_fail_no_fill = "8v4ktg"
                AjConstants.ad_load_fail_after_fill = "arclvq"
                AjConstants.ad_next_load_success = "g3v3yt"
                AjConstants.ad_blackhole_probe = "mf57c1"
                AjConstants.ad_preload_first_success = "xb41vq"
                AjConstants.ad_preload_first_fail_no_fill = "rni0qh"
                AjConstants.ad_preload_first_fail_after_fill = "m2r2po"
                // —— V1.0.3 增量
                AjConstants.ad_skip_dialog = "qc05xa"
                AjConstants.ad_skip_hit = "4ixxqz"
            }

            "HW" -> {
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
                AjConstants.ad_full = "";
                AjConstants.firebase_request ="";
                AjConstants.firebase_success = "";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                AjConstants.activity_app ="";
            }

            "SX" -> {
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
                AjConstants.ad_full = "";
                AjConstants.firebase_request ="";
                AjConstants.firebase_success = "";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                AjConstants.activity_app ="";
            }

            "OP" -> {
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
                AjConstants.ad_full = "";
                AjConstants.firebase_request ="";
                AjConstants.firebase_success = "";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                AjConstants.activity_app ="";
            }

            "VO" -> {
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
                AjConstants.ad_full="";
                AjConstants.firebase_request="";
                AjConstants.firebase_success="";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                AjConstants.activity_app ="";
            }

            "CY" -> {
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
                AjConstants.ad_full = ""
                AjConstants.firebase_request = ""
                AjConstants.firebase_success = ""
                AjConstants.adJust_attribution_request = ""
                AjConstants.adJust_attribution_success = ""
                AjConstants.activity_app = ""
            }

            "XM" -> {
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
                AjConstants.ad_full = "";
                AjConstants.firebase_request ="";
                AjConstants.firebase_success = "";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                AjConstants.activity_app ="";
            }

            "RY" ->{
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
                AjConstants.ad_full = ""
                AjConstants.firebase_request = ""
                AjConstants.firebase_success = ""
                AjConstants.adJust_attribution_request = ""
                AjConstants.adJust_attribution_success = ""
                AjConstants.activity_app = ""
            }

            "OL" ->{
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
                AjConstants.ad_full = ""
                AjConstants.firebase_request = ""
                AjConstants.firebase_success = ""
                AjConstants.adJust_attribution_request = ""
                AjConstants.adJust_attribution_success = ""
                AjConstants.activity_app = ""
            }

            else -> {
                Log.d("AdjustTokens", "测试")
                //com.test.app
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
