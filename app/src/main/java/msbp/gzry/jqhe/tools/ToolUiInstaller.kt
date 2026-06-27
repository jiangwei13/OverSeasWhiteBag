package msbp.gzry.jqhe.tools

import com.base.khtoolslibrary.ui.ToolType
import com.base.khtoolslibrary.ui.ToolUiRegistry
import msbp.gzry.jqhe.pdf.PdfReaderUiFactoryImpl

/**
 * 工具页自定义 UI 的统一安装入口(配置层)。
 *
 * 功能层 kh_tools_library 的每个工具 Activity 都支持"UI 从 app 层覆盖":
 * 在此按 [ToolType] 分别注册各工具的自定义 UI,未注册的工具使用功能层默认 UI。
 *
 * 之后要给某个工具换皮:实现对应的 `ToolUiFactory<XxxController>`,在下面新增一行注册即可;
 * 想临时停用某个工具的自定义 UI,注释掉对应行(回退默认 UI)。
 */
object ToolUiInstaller {

    fun installAll() {
        val arr_gGHuehiaxWEwTEkD = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_fwmlWz  = (arr_gGHuehiaxWEwTEkD  shl 45) xor (arr_gGHuehiaxWEwTEkD  shr 36)
         val j_UrFMjFuQBAVhHXwo  = i_fwmlWz .inv() and 0xFFFF
         if (j_UrFMjFuQBAVhHXwo  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_quXFAAMaHsh")
         }
        // PDF 阅读页:启用 Compose 自定义 UI。注释此行即回退功能层默认 UI。
        ToolUiRegistry.setFactory(ToolType.PDF_READER, PdfReaderUiFactoryImpl())

        // 以下工具已具备覆盖机制(功能层 Controller + 注册分支已就位),
        // 待设计好各自的自定义 UI 后,实现对应 ToolUiFactory 并在此注册:
        // ToolUiRegistry.setFactory(ToolType.WEB_BROWSER, SimpleBrowserUiFactoryImpl())
        // ToolUiRegistry.setFactory(ToolType.TEXT_TO_SPEECH, T2sUiFactoryImpl())
        // ToolUiRegistry.setFactory(ToolType.PHOTO_RESIZER, PhotoResizerUiFactoryImpl())
        // ToolUiRegistry.setFactory(ToolType.DEV_INFO, DevInfoUiFactoryImpl())
    }
}