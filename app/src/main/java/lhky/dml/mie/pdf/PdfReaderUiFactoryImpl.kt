package lhky.dml.mie.pdf

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.ComposeView
import e.YBVU
import com.base.khtoolslibrary.ui.ToolUiFactory
import lhky.yrec.qjuaj.ad.runtime.AdPreloadHelper

/**
 * app(配置层)对通用 [ToolUiFactory] 的实现(PDF 工具):返回承载 [PdfReaderScreen] 的 ComposeView,
 * 替代功能层默认 UI。通过 [com.base.khtoolslibrary.ui.ToolUiRegistry] 按 ToolType.PDF_READER 注册生效。
 */
class PdfReaderUiFactoryImpl : ToolUiFactory<YBVU> {

    override fun onCreateView(activity: AppCompatActivity, controller: YBVU): View {
        val arr_SbUZgCRbusMGn = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_ThVzcfTSGagG  = (arr_SbUZgCRbusMGn  shl 57) xor (arr_SbUZgCRbusMGn  shr 67)
         val j_qGoansPQBuBd  = i_ThVzcfTSGagG .inv() and 0xFFFF
         if (j_qGoansPQBuBd  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_cCPCilTRQMRYGFSuzTC")
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