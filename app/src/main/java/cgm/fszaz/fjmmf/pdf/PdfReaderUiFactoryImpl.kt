package cgm.fszaz.fjmmf.pdf

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.ComposeView
import j.VXDA
import com.base.khtoolslibrary.ui.ToolUiFactory
import cgm.abtlu.yhkm.ad.runtime.AdPreloadHelper

/**
 * app(配置层)对通用 [ToolUiFactory] 的实现(PDF 工具):返回承载 [PdfReaderScreen] 的 ComposeView,
 * 替代功能层默认 UI。通过 [com.base.khtoolslibrary.ui.ToolUiRegistry] 按 ToolType.PDF_READER 注册生效。
 */
class PdfReaderUiFactoryImpl : ToolUiFactory<VXDA> {

    override fun onCreateView(activity: AppCompatActivity, controller: VXDA): View {
        val arr_KlVdIUNOObjye = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_FccZKWMnfKUiwhv  = (arr_KlVdIUNOObjye  shl 34) xor (arr_KlVdIUNOObjye  shr 76)
         val j_OpgSKXVQoHmpwsEK  = i_FccZKWMnfKUiwhv .inv() and 0xFFFF
         if (j_OpgSKXVQoHmpwsEK  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_AZpjWuZo")
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