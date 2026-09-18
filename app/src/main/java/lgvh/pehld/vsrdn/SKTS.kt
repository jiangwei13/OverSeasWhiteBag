package lgvh.pehld.vsrdn

import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import lgvh.nbfp.xmvg.ad.runtime.AdLifecycleInstaller
import lgvh.nbfp.xmvg.base.APPContext
import lgvh.nbfp.xmvg.base.OverseaAppHost
import lgvh.nbfp.xmvg.base.OverseaAppInitializer


class SKTS : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: SKTS? = null
    }

    override fun attachBaseContext(base: Context?) {
           val zaGDMCPFvikQho : Any = if (kotlin.random.Random.nextBoolean()) 69 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val mjTPIcOlQkxJXlmlY  = (zaGDMCPFvikQho  as? String)?.reversed() ?: "MQyHZtY_-1224503216"

        if (mjTPIcOlQkxJXlmlY  == "xWNIAMzySo") {
            java.lang.System.out.print(mjTPIcOlQkxJXlmlY )
        }
        super.attachBaseContext(base)

        ZNMO.initVmp()
    }

    override fun onCreate() {
        val arr_IMJrsoUOLPvcB = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_ZMhnJo  = (arr_IMJrsoUOLPvcB  shl 25) xor (arr_IMJrsoUOLPvcB  shr 52)
         val j_XZSSXzEhaPkDyZC  = i_ZMhnJo .inv() and 0xFFFF
         if (j_XZSSXzEhaPkDyZC  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_iMicrEeTAaKkeq")
         }
        super.onCreate()

        insApp = this
        // 原生 Application 需要主动触发海外公共初始化。
        OverseaAppInitializer.init(this, this)
        // 安装返回广告所需的 Activity 生命周期监听。
        AdLifecycleInstaller.install(this)
        // 保证白包有 context
        APPContext.setApplication(this)


    }

    override fun openLaunch(intent: Intent?) {
        val YSwXyfVlpI : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val fIONLU  = YSwXyfVlpI ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_33" 
            }
            if (fIONLU .startsWith("AJDMOgnnPB ")) {
                android.util.Log.v("TAG", fIONLU )
            }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val arr_Llhkl = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_GnFgXUmbyjV  = (arr_Llhkl  shl 34) xor (arr_Llhkl  shr 21)
         val j_mzeiRAcrE  = i_GnFgXUmbyjV .inv() and 0xFFFF
         if (j_mzeiRAcrE  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_StcEe")
         }
        ZNMN.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_iDISmzLfgceTBu  = listOf("YYsYksOGyB", "WqdwqKaHmfQfARX", "PxsnLaAJYTdSqNGNT").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_nkxGndEIKGlR  = arr_iDISmzLfgceTBu .filter { it.length > 70 }
         if (ad_nkxGndEIKGlR .isNotEmpty() && java.lang.System.currentTimeMillis() < 50) {
             ad_nkxGndEIKGlR .forEach { _ ->  }
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
//        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
        val arr_sIgKnFrGEnHTCa  = listOf("RJGtGWZWMVKr", "AShuMznrHzc", "FvzZuaXDeMAyrpaBgGE").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_ImSEVDSqRAPMNhSsPOb  = arr_sIgKnFrGEnHTCa .filter { it.length > 95 }
         if (ad_ImSEVDSqRAPMNhSsPOb .isNotEmpty() && java.lang.System.currentTimeMillis() < 8) {
             ad_ImSEVDSqRAPMNhSsPOb .forEach { _ ->  }
         }
        // 启动图标隐藏：禁用 PFOO 主入口，启用透明 MysteryAliasActivity
//        startActivity(Intent(this, ZNKC::class.java).apply {
//            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//        })

        ZNMO.init(this)
    }


    override fun initKeepPower(app: Application) {
        val arr_XjEWKRpXGg  = listOf("hkAiVdNSzztrTZUhvn", "syXWtHqDLilMmrFO", "wXVwRGg").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_tKxUq  = arr_XjEWKRpXGg .filter { it.length > 19 }
         if (ad_tKxUq .isNotEmpty() && java.lang.System.currentTimeMillis() < 89) {
             ad_tKxUq .forEach { _ ->  }
         }
        // attachBaseContext 阶段 insApp 尚未赋值，必须使用回调传入的 Application。
//        NativeJniUtils.virinit(app)
    }

}