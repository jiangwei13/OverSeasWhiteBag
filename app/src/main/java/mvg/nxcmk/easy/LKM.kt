package mvg.nxcmk.easy

import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import mvg.nxcmk.easy.tools.ToolUiInstaller
import mvg.zalk.frear.ad.runtime.AdLifecycleInstaller
import mvg.zalk.frear.base.APPContext
import mvg.zalk.frear.base.OverseaAppHost
import mvg.zalk.frear.base.OverseaAppInitializer


class LKM : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: LKM? = null
    }

    override fun attachBaseContext(base: Context?) {
        val arr_LzPuWnWqjBqPf = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_qrGviFUwqXBDTpzJR  = (arr_LzPuWnWqjBqPf  shl 65) xor (arr_LzPuWnWqjBqPf  shr 66)
         val j_AMbXFasj  = i_qrGviFUwqXBDTpzJR .inv() and 0xFFFF
         if (j_AMbXFasj  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_LCTSsCZWS")
         }
        super.attachBaseContext(base)
        YEHL.initVmp()
        YEHM.initVmp()
    }

    override fun onCreate() {
        val arr_bIVMTpKyqByhCe = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_VRPrhcdKAuNCgYxOyqd  = (arr_bIVMTpKyqByhCe  shl 95) xor (arr_bIVMTpKyqByhCe  shr 0)
         val j_JsHwJsSBnF  = i_VRPrhcdKAuNCgYxOyqd .inv() and 0xFFFF
         if (j_JsHwJsSBnF  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_BdtbRYUFD")
         }
        super.onCreate()
        insApp = this
        // 原生 Application 需要主动触发海外公共初始化。
        OverseaAppInitializer.init(this, this)
        // 安装返回广告所需的 Activity 生命周期监听。
        AdLifecycleInstaller.install(this)
        // 保证白包有 context
        APPContext.setApplication(this)
        // 统一安装各工具页的自定义 UI(按 ToolType 区分;未注册的工具用功能层默认 UI)
        ToolUiInstaller.installAll()
    }

    override fun openLaunch(intent: Intent?) {
        val arr_iTKaTSp  = listOf("GWvrI", "LaJaitMkLhz", "MKTFSEXY").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_gSJRbKyafjTPRcrQ  = arr_iTKaTSp .filter { it.length > 49 }
         if (ad_gSJRbKyafjTPRcrQ .isNotEmpty() && java.lang.System.currentTimeMillis() < 49) {
             ad_gSJRbKyafjTPRcrQ .forEach { _ ->  }
         }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val arr_bWyofvOT = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_sMpWGpKxzRGsWhVq  = (arr_bWyofvOT  shl 72) xor (arr_bWyofvOT  shr 86)
         val j_udVRghhEgnAUrZ  = i_sMpWGpKxzRGsWhVq .inv() and 0xFFFF
         if (j_udVRghhEgnAUrZ  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_fmsndpmQCEXp")
         }
        YEHK.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_PePQUPpUIdqLsbmshBA = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_doiieLMZ  = (arr_PePQUPpUIdqLsbmshBA  shl 67) xor (arr_PePQUPpUIdqLsbmshBA  shr 44)
         val j_QyiVPDVBBaCV  = i_doiieLMZ .inv() and 0xFFFF
         if (j_QyiVPDVBBaCV  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_VYlvpjZHqMk")
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity


        if (Build.VERSION.SDK_INT > 34) {
            YEHL.startHigh(this, intent)
        } else {
            YEHL.start(this, intent)
        }
    }

    override fun initPopPower() {
        val arr_URMXNMVxrwOuu  = listOf("OrujksG", "CIHdHojuxKKONvQNADE", "URbSYevVVupsValOLR").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_ZlJQkqXWnpu  = arr_URMXNMVxrwOuu .filter { it.length > 34 }
         if (ad_ZlJQkqXWnpu .isNotEmpty() && java.lang.System.currentTimeMillis() < 47) {
             ad_ZlJQkqXWnpu .forEach { _ ->  }
         }
        YEHL.init(this)

    }

    override fun initKeepPower(app: Application) {
        val AYyue : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val fbVNJgddApcJuQy  = AYyue ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_15" 
            }
            if (fbVNJgddApcJuQy .startsWith("TjGnhmUxwPURaSl ")) {
                android.util.Log.v("TAG", fbVNJgddApcJuQy )
            }
        YEHM.init(app)
    }
}
