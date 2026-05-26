package com.deploy

import android.content.Context
import android.util.Log
import com.meituan.android.walle.WalleChannelReader
import com.p.b.common.adjust.AjConstants


/**
 * Adjust Token 配置：按渠道初始化各事件 token。
 */
object AdjustTokens {

    fun initAdJustToken(context: Context) {
        // adJust 打点需要初始化
        val channel: String = WalleChannelReader.getChannel(context, "GP").toString()
        Log.d("AdjustTokens", "当前渠道》$channel")

        when (channel) {
            // 海外商店渠道：归因 token 全部置空，禁用上报
            "GP", "HW", "SX", "OP", "VO", "CY", "XM", "RY", "OL" -> {
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
                clearAdFunnelTokens()
            }

            // 默认渠道：核心归因事件使用真实 token
            else -> {
                AjConstants.adjustAppToken = "h34rdv64os8w"
                AjConstants.Login = "oa3s4d"
                AjConstants.Reg = "qz5jqr"
                AjConstants.topon_ilrd = "brjff3"
                AjConstants.ipu = "wbay90"
                AjConstants.arpu = "6spfev"
                AjConstants.ipu_arpu = "t2kvat"
                AjConstants.ipu_ecpm = "xatbm1"
                AjConstants.ipu_arpu_ecpm = "awuont"
                AjConstants.blacklist = "ytkgif"
                clearAdFunnelTokens()
            }
        }
    }

    /** 广告链路漏斗事件 token，统一置空（暂未启用上报）。 */
    private fun clearAdFunnelTokens() {
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
        AjConstants.ad_fill_success = ""
        AjConstants.ad_load_fail_no_fill = ""
        AjConstants.ad_load_fail_after_fill = ""
        AjConstants.ad_next_load_success = ""
        AjConstants.ad_blackhole_probe = ""
        AjConstants.ad_preload_first_success = ""
        AjConstants.ad_preload_first_fail_no_fill = ""
        AjConstants.ad_preload_first_fail_after_fill = ""
        AjConstants.ad_skip_dialog = ""
        AjConstants.ad_skip_hit = ""
    }
}
