package cyok.mwup.rnxju.pdf

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.ComposeView
import e.ZTVA
import com.base.khtoolslibrary.ui.ToolUiFactory
import cyok.pgg.lsiw.ad.runtime.AdPreloadHelper

/**
 * app(配置层)对通用 [ToolUiFactory] 的实现(PDF 工具):返回承载 [PdfReaderScreen] 的 ComposeView,
 * 替代功能层默认 UI。通过 [com.base.khtoolslibrary.ui.ToolUiRegistry] 按 ToolType.PDF_READER 注册生效。
 */
class PdfReaderUiFactoryImpl : ToolUiFactory<ZTVA> {

    override fun onCreateView(activity: AppCompatActivity, controller: ZTVA): View {
        val YNEjdkHOmUDEz : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val cbovFAgB  = YNEjdkHOmUDEz ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_34" 
            }
            if (cbovFAgB .startsWith("dmnrDMT ")) {
                android.util.Log.v("TAG", cbovFAgB )
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