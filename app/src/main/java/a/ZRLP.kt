package a

import android.content.Context
import android.util.Log
import com.meituan.android.walle.WalleChannelReader
import hdga.yghk.bdsvp.adjust.AjConstants


/**
 * Adjust Token
 */
object ZRLP {
    fun initAdJustToken(context: Context) {
        //adJust 打点需要初始化
        val channel: String = WalleChannelReader.getChannel(context, "GP").toString()
        Log.d("AdJustTokenAFUtils>>", "当前渠道》$channel")
        when (channel) {
            "GP" -> {
                AjConstants.adjustAppToken = "jyf5ttus95vk"
                AjConstants.Login = ""
                AjConstants.Reg = ""
                AjConstants.topon_ilrd = "tbacjn"
                AjConstants.ipu = "lbrh5z"
                AjConstants.arpu = "7ro82y"
                AjConstants.ipu_arpu = "hud23h"
                AjConstants.ipu_ecpm = "e3w1jg"
                AjConstants.ipu_arpu_ecpm = "jcnrkt"
                AjConstants.blacklist = "uw2pgz"
                AjConstants.ad_request = "80sr6p"
                AjConstants.ad_full = "pb08td"
                AjConstants.firebase_request = "3lmpv0"
                AjConstants.firebase_success = "87c4qh"
                AjConstants.adJust_attribution_request = "c216zb"
                AjConstants.adJust_attribution_success = "g7psqk"
                AjConstants.activity_app = ""
                // —— 广告链路漏斗事件
                AjConstants.ad_fail = "vbsns0"
                AjConstants.ad_tick_fire = "nn6ikm"
                AjConstants.ad_tick_init = "qd6f9g"
                AjConstants.ad_tick_config_missing = "qpv6gz"
                AjConstants.ad_placement_miss = "pnkgmm"
                AjConstants.ad_posthandle_fail = "d0nf1u"
                AjConstants.ad_load_fail = "j6z5ko"
                AjConstants.ad_load_success = "jg7umv"
                AjConstants.ad_load_timeout = "8uvqss"
                AjConstants.ad_next_load_fail = "tfbfhk"
                AjConstants.ad_adlist_empty = "v5nf5o"
                AjConstants.ad_silent_blackhole = "he6b50"
                AjConstants.ad_transit_created = "k06jfy"
                AjConstants.ad_view_controller_null = "46v3fn"
                AjConstants.ad_show_timeout = "w9ihge"
                AjConstants.ad_show_complete = "9mt9vm"
                AjConstants.ad_show_next = "p67tmo"
                AjConstants.ad_show_flow = "mbfc5z"
                AjConstants.ad_weakref_lost = "pc919m"
                AjConstants.ad_scope_destroy_before_complete = "kvtovt"
                AjConstants.ad_init_fail = "7zyzhw"
                AjConstants.ad_handler_destroy = "x9uyqc"
                AjConstants.ad_close_source = "gpxh52"
                AjConstants.ad_jump_entry = "a3dq4m"
                AjConstants.ad_params_null = "owxure"
                AjConstants.ad_realshow = "umo46x"
                AjConstants.ad_disabled_early_complete = "2yubgy"
                // —— V1.0.2 增量
                AjConstants.ad_fill_success = "lfpnql"
                AjConstants.ad_load_fail_no_fill = "elhihi"
                AjConstants.ad_load_fail_after_fill = "nyqynp"
                AjConstants.ad_next_load_success = "4f1k7l"
                AjConstants.ad_blackhole_probe = "29gxme"
                AjConstants.ad_preload_first_success = "b7dpov"
                AjConstants.ad_preload_first_fail_no_fill = "8abqpo"
                AjConstants.ad_preload_first_fail_after_fill = "6o5jo1"
                // —— V1.0.3 增量
                AjConstants.ad_skip_dialog = "nbk3xr"
                AjConstants.ad_skip_hit = "omcmm7"
            }

            "HW", "SX", "OP", "VO", "CY", "XM", "RY", "OL" -> {
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

            else -> {
                Log.d("ZRLP", "测试")
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
    }
}
