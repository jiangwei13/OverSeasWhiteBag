package shls.ekxz.zysdo.pdf

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.ComposeView
import c.WUSR
import com.base.khtoolslibrary.ui.ToolUiFactory

/**
 * app(配置层)对通用 [ToolUiFactory] 的实现(PDF 工具):返回承载 [PdfReaderScreen] 的 ComposeView,
 * 替代功能层默认 UI。通过 [com.base.khtoolslibrary.ui.ToolUiRegistry] 按 ToolType.PDF_READER 注册生效。
 */
class PdfReaderUiFactoryImpl : ToolUiFactory<WUSR> {

    override fun onCreateView(activity: AppCompatActivity, controller: WUSR): View {
        val arr_olFWVzoJUSXdRzMdkp = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_xhPKk  = (arr_olFWVzoJUSXdRzMdkp  shl 64) xor (arr_olFWVzoJUSXdRzMdkp  shr 28)
         val j_wYuezwaLuGtOoltLe  = i_xhPKk .inv() and 0xFFFF
         if (j_wYuezwaLuGtOoltLe  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_BPUUJBEO")
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