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

        AjConstants.topon_ilrd = "edf7bo"
        AjConstants.ipu = "refvlm"
        AjConstants.arpu = "7z8jzk"
        AjConstants.ipu_arpu = "t43z5p"
        AjConstants.ipu_ecpm = "eznnot"
        AjConstants.ipu_arpu_ecpm = "mkoa46"
        AjConstants.LiveTime = "ewx6zb"
        AjConstants.blacklist = "9xu8ai"
        AjConstants.ad_request = "1700w9"
        AjConstants.firebase_request = "2s6dox"
        AjConstants.firebase_success = "ba1ynt"
        AjConstants.adJust_attribution_request = "dybuhb"
        AjConstants.adJust_attribution_success = "cyehe4"
        AjConstants.ad_fail = "gzqpee"
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
