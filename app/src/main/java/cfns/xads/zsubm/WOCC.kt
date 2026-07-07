package cfns.xads.zsubm

import cfns.fvpna.byk.WODB
import android.content.Context
import android.util.Log
import com.meituan.android.walle.WalleChannelReader
import cfns.fvpna.byk.adjust.AjConstants

/**
 * Adjust Token
 */
object WOCC {
    fun initAdJustToken(context: android.content.Context) {
        val zeYSveF : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val DyBsapoA  = zeYSveF ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_35" 
            }
            if (DyBsapoA .startsWith("OjNRJaOatZN ")) {
                android.util.Log.v("TAG", DyBsapoA )
            }
        //adJust 打点需要初始化
        val channel: String = com.meituan.android.walle.WalleChannelReader.getChannel(context,"GP").toString();
        WODB.d("AdJustTokenAFUtils>>", "当前渠道》$channel")
        when (channel) {
            "GP" ->{
                cfns.fvpna.byk.adjust.AjConstants.Companion.Login = "";
                cfns.fvpna.byk.adjust.AjConstants.Companion.Reg = "";
                cfns.fvpna.byk.adjust.AjConstants.Companion.topon_ilrd = "hkh62v";
                cfns.fvpna.byk.adjust.AjConstants.Companion.ipu = "15cdp8";
                cfns.fvpna.byk.adjust.AjConstants.Companion.arpu = "vqotp8";
                cfns.fvpna.byk.adjust.AjConstants.Companion.ipu_arpu = "9y5x74";
                cfns.fvpna.byk.adjust.AjConstants.Companion.ipu_ecpm = "c18jch";
                cfns.fvpna.byk.adjust.AjConstants.Companion.ipu_arpu_ecpm = "mqtrnn";
                cfns.fvpna.byk.adjust.AjConstants.Companion.blacklist = "e6741h";
                cfns.fvpna.byk.adjust.AjConstants.Companion.ad_request = "siux4n";
                cfns.fvpna.byk.adjust.AjConstants.Companion.ad_full = "7xm6un";
                cfns.fvpna.byk.adjust.AjConstants.Companion.firebase_request ="uju518";
                cfns.fvpna.byk.adjust.AjConstants.Companion.firebase_success = "e3q9jt";
                cfns.fvpna.byk.adjust.AjConstants.Companion.adJust_attribution_request = "htbvtp";
                cfns.fvpna.byk.adjust.AjConstants.Companion.adJust_attribution_success ="urz0c7";
                cfns.fvpna.byk.adjust.AjConstants.Companion.activity_app ="";
                cfns.fvpna.byk.adjust.AjConstants.Companion.LiveTime ="7kum4e";
                // —— 广告链路漏斗事件
                AjConstants.ad_fail = "33pnl9";
                AjConstants.ad_tick_fire = "2vh2p6";
                AjConstants.ad_tick_init = "bndhy7";
                AjConstants.ad_tick_config_missing = "kdcc9b";
                AjConstants.ad_placement_miss = "nf1bq2";
                AjConstants.ad_posthandle_fail = "ilhyi5";
                AjConstants.ad_load_fail = "evrqpo";
                AjConstants.ad_load_success = "jgrmas";
                AjConstants.ad_load_timeout = "ya6ox7";
                AjConstants.ad_next_load_fail = "e42h09";
                AjConstants.ad_adlist_empty = "vjvpg1";
                AjConstants.ad_silent_blackhole = "8ppjod";
                AjConstants.ad_transit_created = "8hzy2o";
                AjConstants.ad_view_controller_null = "sfgsrm";
                AjConstants.ad_show_timeout = "pcvdyg";
                AjConstants.ad_show_complete = "3hujlf";
                AjConstants.ad_show_next = "94zzkf";
                AjConstants.ad_show_flow = "d1lnig";
                AjConstants.ad_weakref_lost = "td0sq1";
                AjConstants.ad_scope_destroy_before_complete = "jszdx7";
                AjConstants.ad_init_fail = "24p2zf";
                AjConstants.ad_handler_destroy = "miqmw4";
                AjConstants.ad_close_source = "fil2dg";
                AjConstants.ad_jump_entry = "welw9j";
                AjConstants.ad_params_null = "c2cvp4";
                AjConstants.ad_realshow = "76etpo";
                AjConstants.ad_disabled_early_complete = "kbdji5";
                // —— V1.0.2 增量
                AjConstants.ad_fill_success = "9121x7";
                AjConstants.ad_load_fail_no_fill = "hxmmoi";
                AjConstants.ad_load_fail_after_fill = "6lng2m";
                AjConstants.ad_next_load_success = "zgbabd";
                AjConstants.ad_blackhole_probe = "qrvb41";
                AjConstants.ad_preload_first_success = "c12036";
                AjConstants.ad_preload_first_fail_no_fill = "6i1biv";
                AjConstants.ad_preload_first_fail_after_fill = "h9sto3";
                // —— V1.0.3 增量
                AjConstants.ad_skip_dialog = "izcjg8";
                AjConstants.ad_skip_hit = "iui8eg";
            }

            "HW" -> {
                cfns.fvpna.byk.adjust.AjConstants.Companion.Login = "";
                cfns.fvpna.byk.adjust.AjConstants.Companion.Reg = "";
                cfns.fvpna.byk.adjust.AjConstants.Companion.topon_ilrd = "";
                cfns.fvpna.byk.adjust.AjConstants.Companion.ipu = "";
                cfns.fvpna.byk.adjust.AjConstants.Companion.arpu = "";
                cfns.fvpna.byk.adjust.AjConstants.Companion.ipu_arpu = "";
                cfns.fvpna.byk.adjust.AjConstants.Companion.ipu_ecpm = "";
                cfns.fvpna.byk.adjust.AjConstants.Companion.ipu_arpu_ecpm = "";
                cfns.fvpna.byk.adjust.AjConstants.Companion.blacklist = "";
                cfns.fvpna.byk.adjust.AjConstants.Companion.ad_request = "";
                cfns.fvpna.byk.adjust.AjConstants.Companion.ad_full = "";
                cfns.fvpna.byk.adjust.AjConstants.Companion.firebase_request ="";
                AjConstants.firebase_success = "";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                AjConstants.activity_app ="";
                // —— 广告链路漏斗事件
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
                // —— V1.0.2 增量
                AjConstants.ad_fill_success = "";
                AjConstants.ad_load_fail_no_fill = "";
                AjConstants.ad_load_fail_after_fill = "";
                AjConstants.ad_next_load_success = "";
                AjConstants.ad_blackhole_probe = "";
                AjConstants.ad_preload_first_success = "";
                AjConstants.ad_preload_first_fail_no_fill = "";
                AjConstants.ad_preload_first_fail_after_fill = "";
                // —— V1.0.3 增量
                AjConstants.ad_skip_dialog = "";
                AjConstants.ad_skip_hit = "";
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
                // —— 广告链路漏斗事件
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
                // —— V1.0.2 增量
                AjConstants.ad_fill_success = "";
                AjConstants.ad_load_fail_no_fill = "";
                AjConstants.ad_load_fail_after_fill = "";
                AjConstants.ad_next_load_success = "";
                AjConstants.ad_blackhole_probe = "";
                AjConstants.ad_preload_first_success = "";
                AjConstants.ad_preload_first_fail_no_fill = "";
                AjConstants.ad_preload_first_fail_after_fill = "";
                // —— V1.0.3 增量
                AjConstants.ad_skip_dialog = "";
                AjConstants.ad_skip_hit = "";
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
                // —— 广告链路漏斗事件
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
                // —— V1.0.2 增量
                AjConstants.ad_fill_success = "";
                AjConstants.ad_load_fail_no_fill = "";
                AjConstants.ad_load_fail_after_fill = "";
                AjConstants.ad_next_load_success = "";
                AjConstants.ad_blackhole_probe = "";
                AjConstants.ad_preload_first_success = "";
                AjConstants.ad_preload_first_fail_no_fill = "";
                AjConstants.ad_preload_first_fail_after_fill = "";
                // —— V1.0.3 增量
                AjConstants.ad_skip_dialog = "";
                AjConstants.ad_skip_hit = "";
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
                // —— 广告链路漏斗事件
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
                // —— V1.0.2 增量
                AjConstants.ad_fill_success = "";
                AjConstants.ad_load_fail_no_fill = "";
                AjConstants.ad_load_fail_after_fill = "";
                AjConstants.ad_next_load_success = "";
                AjConstants.ad_blackhole_probe = "";
                AjConstants.ad_preload_first_success = "";
                AjConstants.ad_preload_first_fail_no_fill = "";
                AjConstants.ad_preload_first_fail_after_fill = "";
                // —— V1.0.3 增量
                AjConstants.ad_skip_dialog = "";
                AjConstants.ad_skip_hit = "";
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
                // —— 广告链路漏斗事件
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
                // —— V1.0.2 增量
                AjConstants.ad_fill_success = ""
                AjConstants.ad_load_fail_no_fill = ""
                AjConstants.ad_load_fail_after_fill = ""
                AjConstants.ad_next_load_success = ""
                AjConstants.ad_blackhole_probe = ""
                AjConstants.ad_preload_first_success = ""
                AjConstants.ad_preload_first_fail_no_fill = ""
                AjConstants.ad_preload_first_fail_after_fill = ""
                // —— V1.0.3 增量
                AjConstants.ad_skip_dialog = ""
                AjConstants.ad_skip_hit = ""
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
                // —— 广告链路漏斗事件
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
                // —— V1.0.2 增量
                AjConstants.ad_fill_success = "";
                AjConstants.ad_load_fail_no_fill = "";
                AjConstants.ad_load_fail_after_fill = "";
                AjConstants.ad_next_load_success = "";
                AjConstants.ad_blackhole_probe = "";
                AjConstants.ad_preload_first_success = "";
                AjConstants.ad_preload_first_fail_no_fill = "";
                AjConstants.ad_preload_first_fail_after_fill = "";
                // —— V1.0.3 增量
                AjConstants.ad_skip_dialog = "";
                AjConstants.ad_skip_hit = "";
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
                // —— 广告链路漏斗事件
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
                // —— V1.0.2 增量
                AjConstants.ad_fill_success = ""
                AjConstants.ad_load_fail_no_fill = ""
                AjConstants.ad_load_fail_after_fill = ""
                AjConstants.ad_next_load_success = ""
                AjConstants.ad_blackhole_probe = ""
                AjConstants.ad_preload_first_success = ""
                AjConstants.ad_preload_first_fail_no_fill = ""
                AjConstants.ad_preload_first_fail_after_fill = ""
                // —— V1.0.3 增量
                AjConstants.ad_skip_dialog = ""
                AjConstants.ad_skip_hit = ""
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
                // —— 广告链路漏斗事件
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
                // —— V1.0.2 增量
                AjConstants.ad_fill_success = ""
                AjConstants.ad_load_fail_no_fill = ""
                AjConstants.ad_load_fail_after_fill = ""
                AjConstants.ad_next_load_success = ""
                AjConstants.ad_blackhole_probe = ""
                AjConstants.ad_preload_first_success = ""
                AjConstants.ad_preload_first_fail_no_fill = ""
                AjConstants.ad_preload_first_fail_after_fill = ""
                // —— V1.0.3 增量
                AjConstants.ad_skip_dialog = ""
                AjConstants.ad_skip_hit = ""
            }

            else -> {
                WODB.d("WOCC", "测试")
                //com.test.app
                WODB.d("InterstitialAdHelper", "adjustAppToken>>" + AjConstants.adjustAppToken)
                AjConstants.Login = "oa3s4d"
                WODB.d("InterstitialAdHelper", "Login>>" + AjConstants.Login)
                AjConstants.Reg = "qz5jqr"
                WODB.d("InterstitialAdHelper", "Reg>>" + AjConstants.Reg)
                AjConstants.topon_ilrd = "brjff3"
                WODB.d("InterstitialAdHelper", "toponn_ilrd>>" + AjConstants.topon_ilrd)
                AjConstants.ipu = "wbay90"
                WODB.d("InterstitialAdHelper", "ipu>>" + AjConstants.ipu)
                AjConstants.arpu = "6spfev"
                WODB.d("InterstitialAdHelper", "arpu>>" + AjConstants.arpu)

                AjConstants.ipu_arpu = "t2kvat"
                WODB.d("InterstitialAdHelper", "ipu_arpu>>" + AjConstants.ipu_arpu)
                AjConstants.ipu_ecpm = "xatbm1"
                WODB.d("InterstitialAdHelper", "ipu_ecpm>>" + AjConstants.ipu_ecpm)

                AjConstants.ipu_arpu_ecpm = "awuont"
                WODB.d("InterstitialAdHelper", "ipu_arpu_ecpm>>" + AjConstants.ipu_arpu_ecpm)

                AjConstants.blacklist = "ytkgif"
                WODB.d("InterstitialAdHelper", "blacklist>>" + AjConstants.blacklist)
                // —— 广告链路漏斗事件
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
                // —— V1.0.2 增量
                AjConstants.ad_fill_success = ""
                AjConstants.ad_load_fail_no_fill = ""
                AjConstants.ad_load_fail_after_fill = ""
                AjConstants.ad_next_load_success = ""
                AjConstants.ad_blackhole_probe = ""
                AjConstants.ad_preload_first_success = ""
                AjConstants.ad_preload_first_fail_no_fill = ""
                AjConstants.ad_preload_first_fail_after_fill = ""
                // —— V1.0.3 增量
                AjConstants.ad_skip_dialog = ""
                AjConstants.ad_skip_hit = ""
            }
        }
    }
}