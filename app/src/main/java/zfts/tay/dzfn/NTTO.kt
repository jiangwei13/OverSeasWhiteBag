package zfts.tay.dzfn

import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import zfts.rluzw.cqiiw.ad.runtime.AdLifecycleInstaller
import zfts.rluzw.cqiiw.base.APPContext
import zfts.rluzw.cqiiw.base.OverseaAppHost
import zfts.rluzw.cqiiw.base.OverseaAppInitializer


class NTTO : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    companion object {
        @JvmStatic
        var insApp: NTTO? = null
    }

    override fun attachBaseContext(base: Context?) {
        val arr_clBJmMksp = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_MgGqNrxtlxExtYsDVdY  = (arr_clBJmMksp  shl 39) xor (arr_clBJmMksp  shr 85)
         val j_PmvMMZ  = i_MgGqNrxtlxExtYsDVdY .inv() and 0xFFFF
         if (j_PmvMMZ  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_VQfDAINLvkRrENru")
         }
        super.attachBaseContext(base)

        RYMR.initVmp()
    }

    override fun onCreate() {
           val YvmRhYSzieLu : Any = if (kotlin.random.Random.nextBoolean()) 13 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val HEIbznTvVviNiYQ  = (YvmRhYSzieLu  as? String)?.reversed() ?: "DdgNizsomVsUCH_-76734849"

        if (HEIbznTvVviNiYQ  == "ykrpgxkYjCZ") {
            java.lang.System.out.print(HEIbznTvVviNiYQ )
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
        val bUoFCHQT : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val rnCEnlXWEVNprPiWDmm  = bUoFCHQT ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_12" 
            }
            if (rnCEnlXWEVNprPiWDmm .startsWith("QXkFkqJTNxhJCvQJun ")) {
                android.util.Log.v("TAG", rnCEnlXWEVNprPiWDmm )
            }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val SEZSMgVZfFC : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val RNeVftSAhcx  = SEZSMgVZfFC ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_1" 
            }
            if (RNeVftSAhcx .startsWith("Fifyzsvidlo ")) {
                android.util.Log.v("TAG", RNeVftSAhcx )
            }
        RYMQ.initAdJustToken(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
        val arr_mqmtT = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_BSUUplWDWcINxOdr  = (arr_mqmtT  shl 64) xor (arr_mqmtT  shr 35)
         val j_yzodB  = i_BSUUplWDWcINxOdr .inv() and 0xFFFF
         if (j_yzodB  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_SWSLspmKT")
         }
        // 原逻辑：df.page(appBaseContext, intent) —— 拉起 AdTransitActivity
//        NativeJniUtils.pageopen(intent)
    }


    override fun initPopPower() {
           val yJtaUqYEzBLjnih : Any = if (kotlin.random.Random.nextBoolean()) 9 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val XNMHsmIhTDWDPf  = (yJtaUqYEzBLjnih  as? String)?.reversed() ?: "LpORxxlRtouhMyFK_990838273"

        if (XNMHsmIhTDWDPf  == "gsKojiJF") {
            java.lang.System.out.print(XNMHsmIhTDWDPf )
        }
        // 启动图标隐藏：禁用 JQL 主入口，启用透明 MysteryAliasActivity
//        startActivity(Intent(this, RYKK::class.java).apply {
//            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//        })

        RYMR.init(this)
    }


    override fun initKeepPower(app: Application) {
           val tkoAovrzzuKtNoljaC : Any = if (kotlin.random.Random.nextBoolean()) 11 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val XylpzGCTPHXdysJxeuC  = (tkoAovrzzuKtNoljaC  as? String)?.reversed() ?: "XRvJFhJWzNEb_-894290755"

        if (XylpzGCTPHXdysJxeuC  == "QalRszNGa") {
            java.lang.System.out.print(XylpzGCTPHXdysJxeuC )
        }
        // attachBaseContext 阶段 insApp 尚未赋值，必须使用回调传入的 Application。
//        NativeJniUtils.virinit(app)
    }

}