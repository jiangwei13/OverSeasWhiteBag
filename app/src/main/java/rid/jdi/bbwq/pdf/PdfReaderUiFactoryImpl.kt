package rid.jdi.bbwq.pdf

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.ComposeView
import e.PEZU
import com.base.khtoolslibrary.ui.ToolUiFactory
import rid.lmw.iwbk.ad.runtime.AdPreloadHelper

/**
 * app(配置层)对通用 [ToolUiFactory] 的实现(PDF 工具):返回承载 [PdfReaderScreen] 的 ComposeView,
 * 替代功能层默认 UI。通过 [com.base.khtoolslibrary.ui.ToolUiRegistry] 按 ToolType.PDF_READER 注册生效。
 */
class PdfReaderUiFactoryImpl : ToolUiFactory<PEZU> {

    override fun onCreateView(activity: AppCompatActivity, controller: PEZU): View {
           val DwFOgmxUeRBJeACyO : Any = if (kotlin.random.Random.nextBoolean()) 75 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val HhIIg  = (DwFOgmxUeRBJeACyO  as? String)?.reversed() ?: "iqCQF_-1631670807"

        if (HhIIg  == "tJCWrvSFEUadMPHQ") {
            java.lang.System.out.print(HhIIg )
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