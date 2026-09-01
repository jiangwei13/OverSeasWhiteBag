package com.deploy.pdf

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.ComposeView
import com.base.khtoolslibrary.pdf.PdfReaderController
import com.base.khtoolslibrary.ui.ToolUiFactory
//【临时移除 oversea_base_module】广告预加载 import 随模块注释，回插时恢复
//import com.p.b.ad.runtime.AdPreloadHelper

/**
 * app(配置层)对通用 [ToolUiFactory] 的实现(PDF 工具):返回承载 [PdfReaderScreen] 的 ComposeView,
 * 替代功能层默认 UI。通过 [com.base.khtoolslibrary.ui.ToolUiRegistry] 按 ToolType.PDF_READER 注册生效。
 */
class PdfReaderUiFactoryImpl : ToolUiFactory<PdfReaderController> {

    override fun onCreateView(activity: AppCompatActivity, controller: PdfReaderController): View {
        //【临时移除 oversea_base_module】原广告预加载随模块注释，回插时恢复：
        // 主页创建后延迟预加载功能、返回、页面原生等广告场景
        // AdPreloadHelper.preloadDelayed(activity)
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
