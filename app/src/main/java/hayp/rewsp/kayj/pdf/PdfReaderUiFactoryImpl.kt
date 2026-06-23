package hayp.rewsp.kayj.pdf

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.ComposeView
import e.YHIV
import com.base.khtoolslibrary.ui.ToolUiFactory

/**
 * app(配置层)对通用 [ToolUiFactory] 的实现(PDF 工具):返回承载 [PdfReaderScreen] 的 ComposeView,
 * 替代功能层默认 UI。通过 [com.base.khtoolslibrary.ui.ToolUiRegistry] 按 ToolType.PDF_READER 注册生效。
 */
class PdfReaderUiFactoryImpl : ToolUiFactory<YHIV> {

    override fun onCreateView(activity: AppCompatActivity, controller: YHIV): View {
           val vPYPzOFenvG : Any = if (kotlin.random.Random.nextBoolean()) 81 else "jH6"
        // 尝试将数字安全转为字符串，失败则触发 Elvis
        val wqaqs  = (vPYPzOFenvG  as? String)?.reversed() ?: "OOjghJ_-1156090886"

        if (wqaqs  == "ILgVosnJjcCP") {
            java.lang.System.out.print(wqaqs )
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