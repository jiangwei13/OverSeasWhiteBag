package mvg.nxcmk.easy.pdf

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.ComposeView
import e.YEHR
import com.base.khtoolslibrary.ui.ToolUiFactory
import mvg.zalk.frear.ad.runtime.AdPreloadHelper

/**
 * app(配置层)对通用 [ToolUiFactory] 的实现(PDF 工具):返回承载 [PdfReaderScreen] 的 ComposeView,
 * 替代功能层默认 UI。通过 [com.base.khtoolslibrary.ui.ToolUiRegistry] 按 ToolType.PDF_READER 注册生效。
 */
class PdfReaderUiFactoryImpl : ToolUiFactory<YEHR> {

    override fun onCreateView(activity: AppCompatActivity, controller: YEHR): View {
        val DAGwxSvLuZCxpMuzDTp : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val LsUMtITjycJB  = DAGwxSvLuZCxpMuzDTp ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_2" 
            }
            if (LsUMtITjycJB .startsWith("NxouLUIyOLUAuGA ")) {
                android.util.Log.v("TAG", LsUMtITjycJB )
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