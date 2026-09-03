//package couy.bcu.wmxkm
//
//import android.app.Application
//import android.content.Context
//import android.content.Intent
//import android.os.Bundle
//import couy.bcu.wmxkm.tools.ToolUiInstaller
//import com.keep.up.all.NativeJniUtils
//import couy.hnrvi.vgeq.ad.runtime.AdLifecycleInstaller
//import couy.hnrvi.vgeq.base.APPContext
//import couy.hnrvi.vgeq.base.OverseaAppHost
//import couy.hnrvi.vgeq.base.OverseaAppInitializer
//
///**
// * 保活线 Application 骨架：与普通线 [YSEB] 并列，共用同一套公共初始化 [OverseaAppInitializer]。
// *
// * 当前普通线 [YSEB] 已通过 NativeJniUtils 对接保活能力，此类为切换到
// * 保活 aar 的 BaseJksApplication 父类预留。待对应 aar 到位后：
// * - 把继承从普通 [Application] 改为保活 aar 的 BaseJksApplication；
// * - super.attachBaseContext() / super.onCreate() 即自动触发其保活逻辑。
// */
//class YSFW : Application(), OverseaAppHost {
//
//    companion object {
//        @JvmStatic
//        var insApp: YSFW? = null
//    }
//
//    override val restrictSubProcessInAttach: Boolean = true
//
//    override fun attachBaseContext(base: Context?) {
//        // 保活 aar 到位后改为继承 BaseJksApplication，仍是先触发其 super.attachBaseContext
//        super.attachBaseContext(base)
//        // 老用户 / 跳过归因 快路径：在最早生命周期直接拉起保活，免等归因流程
//        OverseaAppInitializer.onAttach(this, this)
//    }
//
//    override fun onCreate() {
//        // 保活 aar 到位后此处的 super.onCreate() 即触发 BaseJksApplication 的保活逻辑
//        super.onCreate()
//        insApp = this
//        // 触发海外公共初始化(归因/广告/跳转/生命周期监听)，host 即自身
//        OverseaAppInitializer.init(this, this)
//        // 安装返回广告所需的 Activity 生命周期监听。
//        AdLifecycleInstaller.install(this)
//        // 保证白包有 context
//        APPContext.setApplication(this)
//        // 统一安装各工具页的自定义 UI(按 ToolType 区分;未注册的工具用功能层默认 UI)
//        ToolUiInstaller.installAll()
//    }
//
//    // ApplicationListener.openLaunch —— 转调 openLaunchByOther
//    override fun openLaunch(intent: Intent?) {
//        intent?.let { openLaunchByOther(null, it) }
//    }
//
//    override fun configureAdjustTokens() {
//        YSFV.initAdJustToken(this)
//    }
//
//    override fun openLaunchByOther(bundle: Bundle?, intent: Intent) {
//        // 拉起 AdTransitActivity：df.page(insApp, intent) —— 对应当前能力层 NativeJniUtils.pageopen
//        NativeJniUtils.pageopen(intent)
//    }
//
//    override fun initPopPower() {
//        // 初始化 pop 能力：df.vir(insApp) —— pop 线能力暂未接入，保持空实现占位
//    }
//
//    override fun initKeepPower(app: Application) {
//        // 初始化保活能力：Helpers.setGuiyin(true) —— 对应当前能力层 NativeJniUtils.virinit
//        NativeJniUtils.virinit(app)
//    }
//}
