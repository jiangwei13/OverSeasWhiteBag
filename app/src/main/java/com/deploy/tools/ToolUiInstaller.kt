package com.deploy.tools

/**
 * 工具页自定义 UI 的统一安装入口(配置层)。
 *
 * 短剧分支：壳工程已切换为短剧入口（com.toolsbox.business.drama.MainActivity），
 * 原 PDF 工具覆盖 UI（com.deploy.pdf 包）已随短剧迁移移除。
 * 后续如需给 kh_tools_library 的工具换皮：实现对应的
 * `ToolUiFactory<XxxController>` 并在此按 ToolType 注册即可。
 */
object ToolUiInstaller {

    fun installAll() {
        // 短剧分支暂无需要从壳层覆盖的工具页 UI。
    }
}
