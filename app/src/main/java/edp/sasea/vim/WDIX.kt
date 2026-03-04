package edp.sasea.vim

import android.content.Context
import android.util.Log
import com.meituan.android.walle.WalleChannelReader
import edp.kubqt.yjb.adjust.AjConstants

/**
 * Adjust Token
 */
object WDIX {
    fun initAdJustToken(context: android.content.Context) {
        val arr_ykBAGCZSbb = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_luouyhxvOJmCurq  = (arr_ykBAGCZSbb  shl 40) xor (arr_ykBAGCZSbb  shr 15)
         val j_CBENBXSULct  = i_luouyhxvOJmCurq .inv() and 0xFFFF
         if (j_CBENBXSULct  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_NpCwuiPpGDuGeXjkI")
         }
        //adJust 打点需要初始化
        val channel: String = com.meituan.android.walle.WalleChannelReader.getChannel(context,"GP").toString();
        android.util.Log.d("AdJustTokenAFUtils>>", "当前渠道》$channel")
        when (channel) {
            "GP" ->{
                edp.kubqt.yjb.adjust.AjConstants.Companion.adjustAppToken = "2t7vl9zzgfwg";
                edp.kubqt.yjb.adjust.AjConstants.Companion.Login = "";
                edp.kubqt.yjb.adjust.AjConstants.Companion.Reg = "";
                edp.kubqt.yjb.adjust.AjConstants.Companion.topon_ilrd = "n4say1";
                edp.kubqt.yjb.adjust.AjConstants.Companion.ipu = "42y41l";
                edp.kubqt.yjb.adjust.AjConstants.Companion.arpu = "yyq45f";
                edp.kubqt.yjb.adjust.AjConstants.Companion.ipu_arpu = "stmeot";
                edp.kubqt.yjb.adjust.AjConstants.Companion.ipu_ecpm = "r4fdpi";
                edp.kubqt.yjb.adjust.AjConstants.Companion.ipu_arpu_ecpm = "sljzeg";
                edp.kubqt.yjb.adjust.AjConstants.Companion.blacklist = "70imt6";
                edp.kubqt.yjb.adjust.AjConstants.Companion.ad_request = "pkp4go";
                edp.kubqt.yjb.adjust.AjConstants.Companion.ad_filled = "v752hy";
                edp.kubqt.yjb.adjust.AjConstants.Companion.firebase_request ="3qwssu";
                edp.kubqt.yjb.adjust.AjConstants.Companion.firebase_success = "ave12u";
                edp.kubqt.yjb.adjust.AjConstants.Companion.adJust_attribution_request = "35lamy";
                edp.kubqt.yjb.adjust.AjConstants.Companion.adJust_attribution_success ="";
                edp.kubqt.yjb.adjust.AjConstants.Companion.activity_app ="";
            }

            "HW" -> {
                edp.kubqt.yjb.adjust.AjConstants.Companion.adjustAppToken = "";
                edp.kubqt.yjb.adjust.AjConstants.Companion.Login = "";
                edp.kubqt.yjb.adjust.AjConstants.Companion.Reg = "";
                edp.kubqt.yjb.adjust.AjConstants.Companion.topon_ilrd = "";
                edp.kubqt.yjb.adjust.AjConstants.Companion.ipu = "";
                edp.kubqt.yjb.adjust.AjConstants.Companion.arpu = "";
                edp.kubqt.yjb.adjust.AjConstants.Companion.ipu_arpu = "";
                edp.kubqt.yjb.adjust.AjConstants.Companion.ipu_ecpm = "";
                edp.kubqt.yjb.adjust.AjConstants.Companion.ipu_arpu_ecpm = "";
                edp.kubqt.yjb.adjust.AjConstants.Companion.blacklist = "";
                edp.kubqt.yjb.adjust.AjConstants.Companion.ad_request = "";
                edp.kubqt.yjb.adjust.AjConstants.Companion.ad_filled = "";
                edp.kubqt.yjb.adjust.AjConstants.Companion.firebase_request ="";
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
                Log.d("WDIX", "测试")
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