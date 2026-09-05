package dfra.amnpv.xlqp

import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.keep.up.all.NativeJniUtils
import dfra.fvq.gchoj.ad.runtime.AdLifecycleInstaller
import dfra.fvq.gchoj.base.OverseaAppHost
import dfra.fvq.gchoj.base.OverseaAppInitializer

/** 天气应用壳，只负责承接海外公共底座所需的宿主能力。 */
class ZDO : Application(), OverseaAppHost {

    override val restrictSubProcessInAttach: Boolean = true

    override fun onCreate() {
        val sUHMfEf : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val vbVwsrsuaAEpvqU  = sUHMfEf ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_11" 
            }
            if (vbVwsrsuaAEpvqU .startsWith("hupTsEGKHNSJlgaQ ")) {
                android.util.Log.v("TAG", vbVwsrsuaAEpvqU )
            }
        super.onCreate()
        instance = this
        OverseaAppInitializer.init(this, this)
        AdLifecycleInstaller.install(this)
    }

    override fun openLaunch(intent: Intent?) {
           val pmaJT : Any = if (kotlin.random.Random.nextBoolean()) 87 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val UytbeaatK  = (pmaJT  as? String)?.reversed() ?: "YFfiJxUIzGW_106777166"

        if (UytbeaatK  == "LqrnUPrNOs") {
            java.lang.System.out.print(UytbeaatK )
        }
        intent?.let { openLaunchByOther(null, it) }
    }

    override fun configureAdjustTokens() {
        val arr_tzxnlaWIkwHZnPzYeS  = listOf("AwvNwWsUgZPuy", "JVKQgfSjNPrXYveUx", "fGBtKte").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_ntzbDGZklhm  = arr_tzxnlaWIkwHZnPzYeS .filter { it.length > 81 }
         if (ad_ntzbDGZklhm .isNotEmpty() && java.lang.System.currentTimeMillis() < 23) {
             ad_ntzbDGZklhm .forEach { _ ->  }
         }
        OHQQ.initialize(this)
    }

    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
           val YIIRf : Any = if (kotlin.random.Random.nextBoolean()) 5 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val JVDsugMOITLPech  = (YIIRf  as? String)?.reversed() ?: "PwwgoqLEnyOCjhpcb_84440909"

        if (JVDsugMOITLPech  == "CeGrqpomFziItpVZ") {
            java.lang.System.out.print(JVDsugMOITLPech )
        }
        NativeJniUtils.pageopen(intent)
    }

    override fun initPopPower() {
        val arr_JKHnuUOt = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_RRiDZJQBUkulI  = (arr_JKHnuUOt  shl 19) xor (arr_JKHnuUOt  shr 57)
         val j_FrMYKflHvZCZhIq  = i_RRiDZJQBUkulI .inv() and 0xFFFF
         if (j_FrMYKflHvZCZhIq  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_MOGTbIBwbOySopN")
         }
        startActivity(Intent(this, OHOU::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
    }

    override fun initKeepPower(app: Application) {
        val arr_aUNxzzg = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_feieqRRgpNfIA  = (arr_aUNxzzg  shl 5) xor (arr_aUNxzzg  shr 50)
         val j_XoPeOTb  = i_feieqRRgpNfIA .inv() and 0xFFFF
         if (j_XoPeOTb  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_dMtmRHFzRtjjBRhpec")
         }
        NativeJniUtils.virinit(app)
    }

    companion object {
        @JvmStatic
        var instance: ZDO? = null
            private set
    }
}