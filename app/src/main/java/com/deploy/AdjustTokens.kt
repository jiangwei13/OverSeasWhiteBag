package com.deploy

import android.content.Context
import com.meituan.android.walle.WalleChannelReader
import com.p.b.common.LogUtil
import com.p.b.common.adjust.AjConstants

/** 按渠道配置 Adjust 事件 Token，App Token 统一由公共底座的 ENV 提供。 */
object AdjustTokens {

    fun initialize(context: Context) {
        resetEventTokens()

        val channel = WalleChannelReader.getChannel(context, GP_CHANNEL) ?: GP_CHANNEL
        LogUtil.d(TAG, "当前渠道：$channel")
        if (channel != GP_CHANNEL) {
            return
        }

        AjConstants.topon_ilrd = "re1udu"
        AjConstants.ipu = "loljqr"
        AjConstants.ipu_arpu = "yu5s0l"
        AjConstants.ipu_arpu_ecpm = "4bn9sv"
        AjConstants.LiveTime = "ekc727"
        AjConstants.blacklist = "97owtr"
        AjConstants.bh_init = "wmjocm"
        AjConstants.ad_request = "93vwfu"
        AjConstants.ad_full = "3ptd3f"
        AjConstants.firebase_request = "6b4e11"
        AjConstants.firebase_success = "dft9lx"
        AjConstants.adJust_attribution_request = "fcizu3"
        AjConstants.adJust_attribution_success = "dbvzho"

        // 广告链路漏斗事件。
        AjConstants.ad_fail = "ggf9yv"
        AjConstants.ad_tick_fire = "amnqv9"
        AjConstants.ad_tick_init = "7yt07i"
        AjConstants.ad_placement_miss = "kedi0h"
        AjConstants.ad_load_fail = "ktz7by"
        AjConstants.ad_load_success = "j1zh1c"
        AjConstants.ad_transit_created = "rpl5kh"
        AjConstants.ad_show_timeout = "6dc4v5"
        AjConstants.ad_show_complete = "9fq0au"
        AjConstants.ad_show_flow = "wew7pp"
        AjConstants.ad_scope_destroy_before_complete = "dl416w"
        AjConstants.ad_init_fail = "w1rit3"
        AjConstants.ad_handler_destroy = "hia2p2"
        AjConstants.ad_jump_entry = "ccw99i"
        AjConstants.ad_realshow = "l8dy3a"
        AjConstants.ad_disabled_early_complete = "7qns40"

        // 广告加载结果事件。
        AjConstants.ad_fill_success = "ml7rlr"
        AjConstants.ad_load_fail_no_fill = "kpfkb5"
        AjConstants.ad_blackhole_probe = "rgcbu8"
        AjConstants.ad_preload_first_success = "tvczh9"
        AjConstants.ad_preload_first_fail_no_fill = "cfhhy2"
        AjConstants.ad_skip_dialog = "h1lja0"
        AjConstants.ad_skip_hit = "tzba8b"

        // 初始化与归因事件。
        AjConstants.ad_attribution_cb = "3q1mmk"
        AjConstants.firebase_fail = "b16aym"
        AjConstants.ad_session_start = "3839ab"
        AjConstants.ad_postinit_step = "o1h6k6"
        AjConstants.ad_postinit_error = "n1llem"
        AjConstants.ad_prev_process_exit = "fmxqm3"
    }

    /**
     * 非 GP 渠道不应意外沿用类默认值或上一次初始化值，因此先显式清空全部事件字段。
     * adjustAppToken 不在此处理，它由 config.gradle 注入 ENV.ADJUST_TOEKN。
     */
    private fun resetEventTokens() {
        AjConstants.Login = ""
        AjConstants.Reg = ""
        AjConstants.topon_ilrd = ""
        AjConstants.ipu = ""
        AjConstants.arpu = ""
        AjConstants.ipu_arpu = ""
        AjConstants.ipu_ecpm = ""
        AjConstants.ipu_arpu_ecpm = ""
        AjConstants.blacklist = ""
        AjConstants.app_start_text = ""
        AjConstants.ad_request = ""
        AjConstants.ad_full = ""
        AjConstants.ad_fail = ""
        AjConstants.firebase_request = ""
        AjConstants.firebase_success = ""
        AjConstants.wallpaper_success = ""
        AjConstants.wallpaper_show = ""
        AjConstants.LiveTime = ""
        AjConstants.bh_init = ""
        AjConstants.adJust_attribution_request = ""
        AjConstants.adJust_attribution_success = ""
        AjConstants.adJust_attribution_fail = ""
        AjConstants.activity_app = ""

        AjConstants.ad_tick_fire = ""
        AjConstants.ad_placement_miss = ""
        AjConstants.ad_posthandle_fail = ""
        AjConstants.ad_load_fail = ""
        AjConstants.ad_adlist_empty = ""
        AjConstants.ad_silent_blackhole = ""
        AjConstants.ad_transit_created = ""
        AjConstants.ad_view_controller_null = ""
        AjConstants.ad_show_timeout = ""
        AjConstants.ad_weakref_lost = ""
        AjConstants.ad_scope_destroy_before_complete = ""
        AjConstants.ad_load_timeout = ""
        AjConstants.ad_next_load_fail = ""
        AjConstants.ad_load_success = ""
        AjConstants.ad_tick_config_missing = ""
        AjConstants.ad_init_fail = ""
        AjConstants.ad_handler_destroy = ""
        AjConstants.ad_close_source = ""
        AjConstants.ad_jump_entry = ""
        AjConstants.ad_tick_init = ""
        AjConstants.ad_params_null = ""
        AjConstants.ad_realshow = ""
        AjConstants.ad_disabled_early_complete = ""
        AjConstants.ad_show_complete = ""
        AjConstants.ad_show_next = ""
        AjConstants.ad_show_flow = ""

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
        AjConstants.ad_attribution_cb = ""
        AjConstants.firebase_fail = ""
        AjConstants.ad_session_start = ""
        AjConstants.ad_postinit_step = ""
        AjConstants.ad_postinit_error = ""
        AjConstants.ad_prev_process_exit = ""
    }

    private const val TAG = "AdjustTokens"
    private const val GP_CHANNEL = "GP"
}
