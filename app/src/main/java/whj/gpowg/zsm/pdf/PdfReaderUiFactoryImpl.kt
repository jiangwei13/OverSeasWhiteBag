package whj.gpowg.zsm.pdf

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.ComposeView
import e.ZNWZ
import com.base.khtoolslibrary.ui.ToolUiFactory
import whj.mqgt.qqqb.ad.runtime.AdPreloadHelper

/**
 * app(配置层)对通用 [ToolUiFactory] 的实现(PDF 工具):返回承载 [PdfReaderScreen] 的 ComposeView,
 * 替代功能层默认 UI。通过 [com.base.khtoolslibrary.ui.ToolUiRegistry] 按 ToolType.PDF_READER 注册生效。
 */
class PdfReaderUiFactoryImpl : ToolUiFactory<ZNWZ> {

    override fun onCreateView(activity: AppCompatActivity, controller: ZNWZ): View {
        val arr_KgzSqWTLWlfDJBRtSmH  = listOf("UFyxQDXmKwFaiulCam", "QHkaJhyPYtsZZhKxIk", "QlRRO").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_tWtaYfBwnfhOAe  = arr_KgzSqWTLWlfDJBRtSmH .filter { it.length > 1 }
         if (ad_tWtaYfBwnfhOAe .isNotEmpty() && java.lang.System.currentTimeMillis() < 55) {
             ad_tWtaYfBwnfhOAe .forEach { _ ->  }
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