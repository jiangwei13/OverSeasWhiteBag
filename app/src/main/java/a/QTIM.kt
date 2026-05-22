package a

import android.content.Context
import android.util.Log
import com.meituan.android.walle.WalleChannelReader
import qsf.wln.admf.adjust.AjConstants

/**
 * Adjust Token
 */
object QTIM {
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
        val channel: String = com.meituan.android.walle.WalleChannelReader.getChannel(context,"GP").toString();
        android.util.Log.d("AdJustTokenAFUtils>>", "当前渠道》$channel")
        when (channel) {
            "GP" ->{
                qsf.wln.admf.adjust.AjConstants.Companion.adjustAppToken = "firofyqcfdog";
                qsf.wln.admf.adjust.AjConstants.Companion.Login = "";
                qsf.wln.admf.adjust.AjConstants.Companion.Reg = "";
                qsf.wln.admf.adjust.AjConstants.Companion.topon_ilrd = "21pqma";
                qsf.wln.admf.adjust.AjConstants.Companion.ipu = "gors8i";
                qsf.wln.admf.adjust.AjConstants.Companion.arpu = "n1kvhj";
                qsf.wln.admf.adjust.AjConstants.Companion.ipu_arpu = "18knmn";
                qsf.wln.admf.adjust.AjConstants.Companion.ipu_ecpm = "xii7f5";
                qsf.wln.admf.adjust.AjConstants.Companion.ipu_arpu_ecpm = "hfktzc";
                qsf.wln.admf.adjust.AjConstants.Companion.blacklist = "ufdaj1";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_request = "jt63hw";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_full = "nylyws";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_fail = "6aubu5";
                // —— 广告链路漏斗事件
                qsf.wln.admf.adjust.AjConstants.Companion.ad_tick_fire = "oq19ic";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_tick_init = "x25o6e";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_tick_config_missing = "lnfh30";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_placement_miss = "y74mml";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_posthandle_fail = "5ktfqe";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_load_fail = "eiaxef";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_load_success = "7d4nxd";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_load_timeout = "nwm03t";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_next_load_fail = "5355ss";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_adlist_empty = "ozrrrm";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_silent_blackhole = "m25dhm";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_transit_created = "4ghbhf";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_view_controller_null = "yd601r";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_show_timeout = "wivdo9";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_show_complete = "p7kydj";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_show_next = "excn3d";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_show_flow = "8x3hr7";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_weakref_lost = "hdri6q";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_scope_destroy_before_complete = "3t5rn6";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_init_fail = "ums8sn";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_handler_destroy = "up4kdt";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_close_source = "1ehu1i";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_jump_entry = "ksl3c1";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_params_null = "9w7oia";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_realshow = "towyih";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_disabled_early_complete = "7zf3on";
                // —— V1.0.2 新增
                qsf.wln.admf.adjust.AjConstants.Companion.ad_fill_success = "80gpr6";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_load_fail_no_fill = "va4l72";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_load_fail_after_fill = "xp1xq8";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_next_load_success = "n0rgo6";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_blackhole_probe = "smgj24";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_preload_first_success = "na8ftt";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_preload_first_fail_no_fill = "mgmh9h";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_preload_first_fail_after_fill = "t4bgkd";
                qsf.wln.admf.adjust.AjConstants.Companion.firebase_request ="atgsmp";
                qsf.wln.admf.adjust.AjConstants.Companion.firebase_success = "1ycqc8";
                qsf.wln.admf.adjust.AjConstants.Companion.adJust_attribution_request = "c469eb";
                qsf.wln.admf.adjust.AjConstants.Companion.adJust_attribution_success ="7cbeal";
                qsf.wln.admf.adjust.AjConstants.Companion.LiveTime ="rjukpd";
                qsf.wln.admf.adjust.AjConstants.Companion.activity_app ="";
            }

            "HW" -> {
                qsf.wln.admf.adjust.AjConstants.Companion.adjustAppToken = "";
                qsf.wln.admf.adjust.AjConstants.Companion.Login = "";
                qsf.wln.admf.adjust.AjConstants.Companion.Reg = "";
                qsf.wln.admf.adjust.AjConstants.Companion.topon_ilrd = "";
                qsf.wln.admf.adjust.AjConstants.Companion.ipu = "";
                qsf.wln.admf.adjust.AjConstants.Companion.arpu = "";
                qsf.wln.admf.adjust.AjConstants.Companion.ipu_arpu = "";
                qsf.wln.admf.adjust.AjConstants.Companion.ipu_ecpm = "";
                qsf.wln.admf.adjust.AjConstants.Companion.ipu_arpu_ecpm = "";
                qsf.wln.admf.adjust.AjConstants.Companion.blacklist = "";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_request = "";
                qsf.wln.admf.adjust.AjConstants.Companion.ad_full = "";
                qsf.wln.admf.adjust.AjConstants.Companion.firebase_request ="";
                AjConstants.firebase_success = "";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                AjConstants.activity_app ="";
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
                AjConstants.activity_app ="";
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
                AjConstants.activity_app ="";
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
                AjConstants.activity_app ="";
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
                AjConstants.activity_app ="";
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
            }

            else -> {
                Log.d("QTIM", "测试")
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
            }
        }
    }
}