package cdi.yzc.peo

import android.app.Application
import android.content.Intent
import android.os.Bundle
import cdi.yzc.peo.tools.ToolUiInstaller


class SHMK : Application() {

    companion object {
        @JvmStatic
        var insApp: SHMK? = null
    }

    override fun onCreate() {
        val arr_vYvPGguixdY = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_PcISH  = (arr_vYvPGguixdY  shl 82) xor (arr_vYvPGguixdY  shr 44)
         val j_OHFXtPORxw  = i_PcISH .inv() and 0xFFFF
         if (j_OHFXtPORxw  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_FgRuUswFbkqYtDs")
         }
        super.onCreate()
        insApp = this
        // 保证白包有 context
//        APPContext.setApplication(this)
        // 统一安装各工具页的自定义 UI(按 ToolType 区分;未注册的工具用功能层默认 UI)
        ToolUiInstaller.installAll()
    }

//    override fun configureAdjustTokens() {
//        SHMR.initAdJustToken(this)
//    }
//
//    override fun initPopPower() {
//        TODO("Not yet implemented")
//    }
//
//    override fun initKeepPower() {
//        TODO("Not yet implemented")
//    }
//
//    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
//        // 由其他 App 拉起时，转交中转页处理
//    }

}