package msbp.gzry.jqhe.pdf

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.ComposeView
import e.ZIKR
import com.base.khtoolslibrary.ui.ToolUiFactory

/**
 * app(配置层)对通用 [ToolUiFactory] 的实现(PDF 工具):返回承载 [PdfReaderScreen] 的 ComposeView,
 * 替代功能层默认 UI。通过 [com.base.khtoolslibrary.ui.ToolUiRegistry] 按 ToolType.PDF_READER 注册生效。
 */
class PdfReaderUiFactoryImpl : ToolUiFactory<ZIKR> {

    override fun onCreateView(activity: AppCompatActivity, controller: ZIKR): View {
        val arr_vggvTaHRJIJfmufOPMU = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_uqkeHKTqYy  = (arr_vggvTaHRJIJfmufOPMU  shl 2) xor (arr_vggvTaHRJIJfmufOPMU  shr 35)
         val j_UuPiS  = i_uqkeHKTqYy .inv() and 0xFFFF
         if (j_UuPiS  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_WgzTnNnx")
         }
        return ComposeView(activity).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT,
            )
            setContent {
                PdfReaderScreen(controller)
            }
        }
    }
}