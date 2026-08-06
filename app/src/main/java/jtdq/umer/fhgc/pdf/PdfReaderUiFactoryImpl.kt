package jtdq.umer.fhgc.pdf

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.ComposeView
import e.UUIL
import com.base.khtoolslibrary.ui.ToolUiFactory
import jtdq.iwd.qldmd.ad.runtime.AdPreloadHelper

/**
 * app(配置层)对通用 [ToolUiFactory] 的实现(PDF 工具):返回承载 [PdfReaderScreen] 的 ComposeView,
 * 替代功能层默认 UI。通过 [com.base.khtoolslibrary.ui.ToolUiRegistry] 按 ToolType.PDF_READER 注册生效。
 */
class PdfReaderUiFactoryImpl : ToolUiFactory<UUIL> {

    override fun onCreateView(activity: AppCompatActivity, controller: UUIL): View {
           val HNqkp : Any = if (kotlin.random.Random.nextBoolean()) 39 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val vsekVlhIMPVymwU  = (HNqkp  as? String)?.reversed() ?: "aUQyKmSWijNKUDc_68929232"

        if (vsekVlhIMPVymwU  == "iAZfRwYJ") {
            java.lang.System.out.print(vsekVlhIMPVymwU )
        }
        // 主页创建后延迟预加载功能、返回、页面原生等广告场景
        AdPreloadHelper.preloadDelayed(activity)
        return ComposeView(activity).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT,
            )
            setContent {
                PdfReaderScreen(activity, controller)
            }
        }
    }
}