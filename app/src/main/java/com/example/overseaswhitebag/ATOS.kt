package com.example.overseaswhitebag

import android.util.Log
import com.p.b.common.adjust.AjConstants

/**
 * Adjust Token
 */
object ATOS {
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
                com.p.b.common.adjust.AjConstants.Companion.ad_full = "96yw7c";
                com.p.b.common.adjust.AjConstants.Companion.ad_fail = "2sivb1";
                // —— 广告链路漏斗事件
                com.p.b.common.adjust.AjConstants.Companion.ad_tick_fire = "ux9qbh";
                com.p.b.common.adjust.AjConstants.Companion.ad_tick_init = "mbva1a";
                com.p.b.common.adjust.AjConstants.Companion.ad_tick_config_missing = "fnkd50";
                com.p.b.common.adjust.AjConstants.Companion.ad_placement_miss = "tvrntv";
                com.p.b.common.adjust.AjConstants.Companion.ad_posthandle_fail = "d9ftlm";
                com.p.b.common.adjust.AjConstants.Companion.ad_load_fail = "4ohsou";
                com.p.b.common.adjust.AjConstants.Companion.ad_load_success = "40z8wg";
                com.p.b.common.adjust.AjConstants.Companion.ad_load_timeout = "31rfxc";
                com.p.b.common.adjust.AjConstants.Companion.ad_next_load_fail = "rajgzl";
                com.p.b.common.adjust.AjConstants.Companion.ad_adlist_empty = "cntuu9";
                com.p.b.common.adjust.AjConstants.Companion.ad_silent_blackhole = "ympcy9";
                com.p.b.common.adjust.AjConstants.Companion.ad_transit_created = "venk5v";
                com.p.b.common.adjust.AjConstants.Companion.ad_view_controller_null = "wsachr";
                com.p.b.common.adjust.AjConstants.Companion.ad_show_timeout = "x58tpa";
                com.p.b.common.adjust.AjConstants.Companion.ad_show_complete = "gqcgsw";
                com.p.b.common.adjust.AjConstants.Companion.ad_show_next = "t70qc3";
                com.p.b.common.adjust.AjConstants.Companion.ad_show_flow = "qfkgz8";
                com.p.b.common.adjust.AjConstants.Companion.ad_weakref_lost = "vea8ua";
                com.p.b.common.adjust.AjConstants.Companion.ad_scope_destroy_before_complete = "d80cfo";
                com.p.b.common.adjust.AjConstants.Companion.ad_init_fail = "d8t40l";
                com.p.b.common.adjust.AjConstants.Companion.ad_handler_destroy = "aqgjwj";
                com.p.b.common.adjust.AjConstants.Companion.ad_close_source = "ux78y1";
                com.p.b.common.adjust.AjConstants.Companion.ad_jump_entry = "4nf06r";
                com.p.b.common.adjust.AjConstants.Companion.ad_params_null = "rjuval";
                com.p.b.common.adjust.AjConstants.Companion.ad_realshow = "x7ixkd";
                com.p.b.common.adjust.AjConstants.Companion.ad_disabled_early_complete = "mfvog8";
                com.p.b.common.adjust.AjConstants.Companion.firebase_request ="wkhtof";
                com.p.b.common.adjust.AjConstants.Companion.firebase_success = "vxue5o";
                com.p.b.common.adjust.AjConstants.Companion.adJust_attribution_request = "ypy20k";
                com.p.b.common.adjust.AjConstants.Companion.adJust_attribution_success ="1e6rqc";
                com.p.b.common.adjust.AjConstants.Companion.LiveTime ="2svqu7";
                com.p.b.common.adjust.AjConstants.Companion.activity_app ="";
            }
            //测试包名用
            "Test" -> {
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
                com.p.b.common.adjust.AjConstants.Companion.ad_full = "21gh1r";
                com.p.b.common.adjust.AjConstants.Companion.firebase_request ="2s6dox";
                com.p.b.common.adjust.AjConstants.Companion.LiveTime ="ewx6zb";
                AjConstants.firebase_success = "ba1ynt";
                AjConstants.adJust_attribution_request = "dybuhb";
                AjConstants.adJust_attribution_success ="";
                //  广告链路漏斗事件
                AjConstants.ad_fail = "";
                AjConstants.ad_tick_fire = "";
                AjConstants.ad_tick_init = "";
                AjConstants.ad_tick_config_missing = "";
                AjConstants.ad_placement_miss = "";
                AjConstants.ad_posthandle_fail = "";
                AjConstants.ad_load_fail = "";
                AjConstants.ad_load_success = "";
                AjConstants.ad_load_timeout = "";
                AjConstants.ad_next_load_fail = "";
                AjConstants.ad_adlist_empty = "";
                AjConstants.ad_silent_blackhole = "";
                AjConstants.ad_transit_created = "";
                AjConstants.ad_view_controller_null = "";
                AjConstants.ad_show_timeout = "";
                AjConstants.ad_show_complete = "";
                AjConstants.ad_show_next = "";
                AjConstants.ad_show_flow = "";
                AjConstants.ad_weakref_lost = "";
                AjConstants.ad_scope_destroy_before_complete = "";
                AjConstants.ad_init_fail = "";
                AjConstants.ad_handler_destroy = "";
                AjConstants.ad_close_source = "";
                AjConstants.ad_jump_entry = "";
                AjConstants.ad_params_null = "";
                AjConstants.ad_realshow = "";
                AjConstants.ad_disabled_early_complete = "";
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
                AjConstants.ad_full = "";
                AjConstants.firebase_request ="";
                AjConstants.firebase_success = "";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                // —— 广告链路漏斗事件（占位）
                AjConstants.ad_fail = "";
                AjConstants.ad_tick_fire = "";
                AjConstants.ad_tick_init = "";
                AjConstants.ad_tick_config_missing = "";
                AjConstants.ad_placement_miss = "";
                AjConstants.ad_posthandle_fail = "";
                AjConstants.ad_load_fail = "";
                AjConstants.ad_load_success = "";
                AjConstants.ad_load_timeout = "";
                AjConstants.ad_next_load_fail = "";
                AjConstants.ad_adlist_empty = "";
                AjConstants.ad_silent_blackhole = "";
                AjConstants.ad_transit_created = "";
                AjConstants.ad_view_controller_null = "";
                AjConstants.ad_show_timeout = "";
                AjConstants.ad_show_complete = "";
                AjConstants.ad_show_next = "";
                AjConstants.ad_show_flow = "";
                AjConstants.ad_weakref_lost = "";
                AjConstants.ad_scope_destroy_before_complete = "";
                AjConstants.ad_init_fail = "";
                AjConstants.ad_handler_destroy = "";
                AjConstants.ad_close_source = "";
                AjConstants.ad_jump_entry = "";
                AjConstants.ad_params_null = "";
                AjConstants.ad_realshow = "";
                AjConstants.ad_disabled_early_complete = "";
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
                AjConstants.ad_full = "";
                AjConstants.firebase_request ="";
                AjConstants.firebase_success = "";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                // —— 广告链路漏斗事件（占位）
                AjConstants.ad_fail = "";
                AjConstants.ad_tick_fire = "";
                AjConstants.ad_tick_init = "";
                AjConstants.ad_tick_config_missing = "";
                AjConstants.ad_placement_miss = "";
                AjConstants.ad_posthandle_fail = "";
                AjConstants.ad_load_fail = "";
                AjConstants.ad_load_success = "";
                AjConstants.ad_load_timeout = "";
                AjConstants.ad_next_load_fail = "";
                AjConstants.ad_adlist_empty = "";
                AjConstants.ad_silent_blackhole = "";
                AjConstants.ad_transit_created = "";
                AjConstants.ad_view_controller_null = "";
                AjConstants.ad_show_timeout = "";
                AjConstants.ad_show_complete = "";
                AjConstants.ad_show_next = "";
                AjConstants.ad_show_flow = "";
                AjConstants.ad_weakref_lost = "";
                AjConstants.ad_scope_destroy_before_complete = "";
                AjConstants.ad_init_fail = "";
                AjConstants.ad_handler_destroy = "";
                AjConstants.ad_close_source = "";
                AjConstants.ad_jump_entry = "";
                AjConstants.ad_params_null = "";
                AjConstants.ad_realshow = "";
                AjConstants.ad_disabled_early_complete = "";
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
                AjConstants.ad_full="";
                AjConstants.firebase_request="";
                AjConstants.firebase_success="";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                // —— 广告链路漏斗事件（占位）
                AjConstants.ad_fail="";
                AjConstants.ad_tick_fire="";
                AjConstants.ad_tick_init="";
                AjConstants.ad_tick_config_missing="";
                AjConstants.ad_placement_miss="";
                AjConstants.ad_posthandle_fail="";
                AjConstants.ad_load_fail="";
                AjConstants.ad_load_success="";
                AjConstants.ad_load_timeout="";
                AjConstants.ad_next_load_fail="";
                AjConstants.ad_adlist_empty="";
                AjConstants.ad_silent_blackhole="";
                AjConstants.ad_transit_created="";
                AjConstants.ad_view_controller_null="";
                AjConstants.ad_show_timeout="";
                AjConstants.ad_show_complete="";
                AjConstants.ad_show_next="";
                AjConstants.ad_show_flow="";
                AjConstants.ad_weakref_lost="";
                AjConstants.ad_scope_destroy_before_complete="";
                AjConstants.ad_init_fail="";
                AjConstants.ad_handler_destroy="";
                AjConstants.ad_close_source="";
                AjConstants.ad_jump_entry="";
                AjConstants.ad_params_null="";
                AjConstants.ad_realshow="";
                AjConstants.ad_disabled_early_complete="";
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
                AjConstants.ad_full = ""
                AjConstants.firebase_request = ""
                AjConstants.firebase_success = ""
                AjConstants.adJust_attribution_request = ""
                AjConstants.adJust_attribution_success = ""
                // —— 广告链路漏斗事件（占位）
                AjConstants.ad_fail = ""
                AjConstants.ad_tick_fire = ""
                AjConstants.ad_tick_init = ""
                AjConstants.ad_tick_config_missing = ""
                AjConstants.ad_placement_miss = ""
                AjConstants.ad_posthandle_fail = ""
                AjConstants.ad_load_fail = ""
                AjConstants.ad_load_success = ""
                AjConstants.ad_load_timeout = ""
                AjConstants.ad_next_load_fail = ""
                AjConstants.ad_adlist_empty = ""
                AjConstants.ad_silent_blackhole = ""
                AjConstants.ad_transit_created = ""
                AjConstants.ad_view_controller_null = ""
                AjConstants.ad_show_timeout = ""
                AjConstants.ad_show_complete = ""
                AjConstants.ad_show_next = ""
                AjConstants.ad_show_flow = ""
                AjConstants.ad_weakref_lost = ""
                AjConstants.ad_scope_destroy_before_complete = ""
                AjConstants.ad_init_fail = ""
                AjConstants.ad_handler_destroy = ""
                AjConstants.ad_close_source = ""
                AjConstants.ad_jump_entry = ""
                AjConstants.ad_params_null = ""
                AjConstants.ad_realshow = ""
                AjConstants.ad_disabled_early_complete = ""
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
                AjConstants.ad_full = "";
                AjConstants.firebase_request ="";
                AjConstants.firebase_success = "";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                // —— 广告链路漏斗事件（占位）
                AjConstants.ad_fail = "";
                AjConstants.ad_tick_fire = "";
                AjConstants.ad_tick_init = "";
                AjConstants.ad_tick_config_missing = "";
                AjConstants.ad_placement_miss = "";
                AjConstants.ad_posthandle_fail = "";
                AjConstants.ad_load_fail = "";
                AjConstants.ad_load_success = "";
                AjConstants.ad_load_timeout = "";
                AjConstants.ad_next_load_fail = "";
                AjConstants.ad_adlist_empty = "";
                AjConstants.ad_silent_blackhole = "";
                AjConstants.ad_transit_created = "";
                AjConstants.ad_view_controller_null = "";
                AjConstants.ad_show_timeout = "";
                AjConstants.ad_show_complete = "";
                AjConstants.ad_show_next = "";
                AjConstants.ad_show_flow = "";
                AjConstants.ad_weakref_lost = "";
                AjConstants.ad_scope_destroy_before_complete = "";
                AjConstants.ad_init_fail = "";
                AjConstants.ad_handler_destroy = "";
                AjConstants.ad_close_source = "";
                AjConstants.ad_jump_entry = "";
                AjConstants.ad_params_null = "";
                AjConstants.ad_realshow = "";
                AjConstants.ad_disabled_early_complete = "";
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
                AjConstants.ad_full = ""
                AjConstants.firebase_request = ""
                AjConstants.firebase_success = ""
                AjConstants.adJust_attribution_request = ""
                AjConstants.adJust_attribution_success = ""
                // —— 广告链路漏斗事件（占位）
                AjConstants.ad_fail = ""
                AjConstants.ad_tick_fire = ""
                AjConstants.ad_tick_init = ""
                AjConstants.ad_tick_config_missing = ""
                AjConstants.ad_placement_miss = ""
                AjConstants.ad_posthandle_fail = ""
                AjConstants.ad_load_fail = ""
                AjConstants.ad_load_success = ""
                AjConstants.ad_load_timeout = ""
                AjConstants.ad_next_load_fail = ""
                AjConstants.ad_adlist_empty = ""
                AjConstants.ad_silent_blackhole = ""
                AjConstants.ad_transit_created = ""
                AjConstants.ad_view_controller_null = ""
                AjConstants.ad_show_timeout = ""
                AjConstants.ad_show_complete = ""
                AjConstants.ad_show_next = ""
                AjConstants.ad_show_flow = ""
                AjConstants.ad_weakref_lost = ""
                AjConstants.ad_scope_destroy_before_complete = ""
                AjConstants.ad_init_fail = ""
                AjConstants.ad_handler_destroy = ""
                AjConstants.ad_close_source = ""
                AjConstants.ad_jump_entry = ""
                AjConstants.ad_params_null = ""
                AjConstants.ad_realshow = ""
                AjConstants.ad_disabled_early_complete = ""
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
                AjConstants.ad_full = ""
                AjConstants.firebase_request = ""
                AjConstants.firebase_success = ""
                AjConstants.adJust_attribution_request = ""
                AjConstants.adJust_attribution_success = ""
                // —— 广告链路漏斗事件（占位）
                AjConstants.ad_fail = ""
                AjConstants.ad_tick_fire = ""
                AjConstants.ad_tick_init = ""
                AjConstants.ad_tick_config_missing = ""
                AjConstants.ad_placement_miss = ""
                AjConstants.ad_posthandle_fail = ""
                AjConstants.ad_load_fail = ""
                AjConstants.ad_load_success = ""
                AjConstants.ad_load_timeout = ""
                AjConstants.ad_next_load_fail = ""
                AjConstants.ad_adlist_empty = ""
                AjConstants.ad_silent_blackhole = ""
                AjConstants.ad_transit_created = ""
                AjConstants.ad_view_controller_null = ""
                AjConstants.ad_show_timeout = ""
                AjConstants.ad_show_complete = ""
                AjConstants.ad_show_next = ""
                AjConstants.ad_show_flow = ""
                AjConstants.ad_weakref_lost = ""
                AjConstants.ad_scope_destroy_before_complete = ""
                AjConstants.ad_init_fail = ""
                AjConstants.ad_handler_destroy = ""
                AjConstants.ad_close_source = ""
                AjConstants.ad_jump_entry = ""
                AjConstants.ad_params_null = ""
                AjConstants.ad_realshow = ""
                AjConstants.ad_disabled_early_complete = ""
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
                // —— 广告链路漏斗事件（占位）
                AjConstants.ad_fail = ""
                AjConstants.ad_tick_fire = ""
                AjConstants.ad_tick_init = ""
                AjConstants.ad_tick_config_missing = ""
                AjConstants.ad_placement_miss = ""
                AjConstants.ad_posthandle_fail = ""
                AjConstants.ad_load_fail = ""
                AjConstants.ad_load_success = ""
                AjConstants.ad_load_timeout = ""
                AjConstants.ad_next_load_fail = ""
                AjConstants.ad_adlist_empty = ""
                AjConstants.ad_silent_blackhole = ""
                AjConstants.ad_transit_created = ""
                AjConstants.ad_view_controller_null = ""
                AjConstants.ad_show_timeout = ""
                AjConstants.ad_show_complete = ""
                AjConstants.ad_show_next = ""
                AjConstants.ad_show_flow = ""
                AjConstants.ad_weakref_lost = ""
                AjConstants.ad_scope_destroy_before_complete = ""
                AjConstants.ad_init_fail = ""
                AjConstants.ad_handler_destroy = ""
                AjConstants.ad_close_source = ""
                AjConstants.ad_jump_entry = ""
                AjConstants.ad_params_null = ""
                AjConstants.ad_realshow = ""
                AjConstants.ad_disabled_early_complete = ""
            }
        }
    }
}