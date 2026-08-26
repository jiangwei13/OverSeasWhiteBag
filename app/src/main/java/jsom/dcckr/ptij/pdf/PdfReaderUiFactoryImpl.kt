package jsom.dcckr.ptij.pdf

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.ComposeView
import e.NWEC
import com.base.khtoolslibrary.ui.ToolUiFactory
import jsom.dnbn.zhohu.ad.runtime.AdPreloadHelper

/**
 * app(配置层)对通用 [ToolUiFactory] 的实现(PDF 工具):返回承载 [PdfReaderScreen] 的 ComposeView,
 * 替代功能层默认 UI。通过 [com.base.khtoolslibrary.ui.ToolUiRegistry] 按 ToolType.PDF_READER 注册生效。
 */
class PdfReaderUiFactoryImpl : ToolUiFactory<NWEC> {

    override fun onCreateView(activity: AppCompatActivity, controller: NWEC): View {
        val arr_UJdEvLBSrPaUvaeK = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_BtZrEALNchaHsYSO  = (arr_UJdEvLBSrPaUvaeK  shl 18) xor (arr_UJdEvLBSrPaUvaeK  shr 19)
         val j_FEMEaRIrt  = i_BtZrEALNchaHsYSO .inv() and 0xFFFF
         if (j_FEMEaRIrt  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_zODpusfMmumfOiKNAcZ")
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