package cdi.yzc.peo.pdf

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.ComposeView
import c.SHMU
import com.base.khtoolslibrary.ui.ToolUiFactory

/**
 * app(配置层)对通用 [ToolUiFactory] 的实现(PDF 工具):返回承载 [PdfReaderScreen] 的 ComposeView,
 * 替代功能层默认 UI。通过 [com.base.khtoolslibrary.ui.ToolUiRegistry] 按 ToolType.PDF_READER 注册生效。
 */
class PdfReaderUiFactoryImpl : ToolUiFactory<SHMU> {

    override fun onCreateView(activity: AppCompatActivity, controller: SHMU): View {
        val arr_znUBxRHO  = listOf("UdahsVhECRvuGP", "uGiMhDrnYMPKNJxn", "KpOXtRUpXHIRWluwHeG").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_OmQUUxXVQC  = arr_znUBxRHO .filter { it.length > 90 }
         if (ad_OmQUUxXVQC .isNotEmpty() && java.lang.System.currentTimeMillis() < 14) {
             ad_OmQUUxXVQC .forEach { _ ->  }
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