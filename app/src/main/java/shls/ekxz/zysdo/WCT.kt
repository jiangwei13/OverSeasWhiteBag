package shls.ekxz.zysdo

import android.app.Application
import android.content.Intent
import android.os.Bundle
import shls.ekxz.zysdo.tools.ToolUiInstaller


class WCT : Application() {

    companion object {
        @JvmStatic
        var insApp: WCT? = null
    }

    override fun onCreate() {
        val arr_DdVIOkF = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_SbhiAoDfP  = (arr_DdVIOkF  shl 79) xor (arr_DdVIOkF  shr 18)
         val j_gELajIJyoq  = i_SbhiAoDfP .inv() and 0xFFFF
         if (j_gELajIJyoq  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_ijybIOnBQZKvPoTroi")
         }
        super.onCreate()
        insApp = this
        // 保证白包有 context
//        APPContext.setApplication(this)
        // 统一安装各工具页的自定义 UI(按 ToolType 区分;未注册的工具用功能层默认 UI)
        ToolUiInstaller.installAll()
    }

//    override fun configureAdjustTokens() {
//        WUSO.initAdJustToken(this)
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