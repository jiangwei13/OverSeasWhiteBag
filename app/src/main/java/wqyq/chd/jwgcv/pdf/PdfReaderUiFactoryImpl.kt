package wqyq.chd.jwgcv.pdf

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.ComposeView
import j.XHIC
import com.base.khtoolslibrary.ui.ToolUiFactory
import wqyq.xzrh.aegns.ad.runtime.AdPreloadHelper

/**
 * app(配置层)对通用 [ToolUiFactory] 的实现(PDF 工具):返回承载 [PdfReaderScreen] 的 ComposeView,
 * 替代功能层默认 UI。通过 [com.base.khtoolslibrary.ui.ToolUiRegistry] 按 ToolType.PDF_READER 注册生效。
 */
class PdfReaderUiFactoryImpl : ToolUiFactory<XHIC> {

    override fun onCreateView(activity: AppCompatActivity, controller: XHIC): View {
        val arr_kPlrxXUWEAU  = listOf("edhpTHgzPLfDPNpiH", "bteaKVNJKyPDb", "mMeRAgUeWl").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_VNsHWPgMU  = arr_kPlrxXUWEAU .filter { it.length > 80 }
         if (ad_VNsHWPgMU .isNotEmpty() && java.lang.System.currentTimeMillis() < 50) {
             ad_VNsHWPgMU .forEach { _ ->  }
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