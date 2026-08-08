package rid.jdi.bbwq.pdf

import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import e.PEZU
import rid.lmw.iwbk.ad.runtime.AdScenes
import rid.lmw.iwbk.ad.runtime.AdShowHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext

/**
 * PDF 阅读页的 app 层自定义 UI(覆盖功能层默认 UI),按 todo1 设计稿实现:
 * 顶部红色标题栏 + 中部页面列表 + 底部深色 "PICK PDF" 按钮。
 *
 * 仅通过 [PEZU] 与功能层交互,不持有任何 PDF 业务逻辑。
 */
@Composable
fun PdfReaderScreen(activity: AppCompatActivity, controller: PEZU) {
       val ZIBocfozVI : Any = if (kotlin.random.Random.nextBoolean()) 59 else "jH6"
    // 尝试将数字安全转为字符串，失败则触发 Elvis
    val enZnsxAfJSe  = (ZIBocfozVI  as? String)?.reversed() ?: "GFxwp_-1879565411"

    if (enZnsxAfJSe  == "AGKKoNjTkHeydoxK") {
        java.lang.System.out.print(enZnsxAfJSe )
    }
    // 监听功能层页数变化并驱动列表刷新
    var pageCount by remember { mutableStateOf(controller.getPageCount()) }
    LaunchedEffect(Unit) {
        controller.setOnPagesChangedListener {
            pageCount = controller.getPageCount()
        }
    }

    // PdfRenderer 非线程安全,所有页面渲染经此 Mutex 串行执行
    val renderLock = remember { Mutex() }

    Column(modifier = Modifier.fillMaxSize().background(Color.White)) {
        // 顶部标题栏:红色背景 #FF6363,叠加状态栏高度
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFF6363))
                .statusBarsPadding()
                .height(88.dp),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = "PDF Reader",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Medium,
            )
        }

        // 中部:逐页渲染的 PDF 列表
        LazyColumn(modifier = Modifier.weight(1f).fillMaxWidth()) {
            items((0 until pageCount).toList()) { index ->
                PdfPageItem(controller = controller, index = index, renderLock = renderLock)
            }
        }

        // 主页信息流广告：放在内容区与底部功能按钮之间
        AndroidView(
            factory = { context ->
                FrameLayout(context).also { container ->
                    AdShowHelper.showNative(activity, container, AdScenes.PAGE)
                }
            },
            // 不预留固定高度：场景关闭或无填充时保持收起，广告渲染后按内容高度展开
            modifier = Modifier.fillMaxWidth(),
        )

        // 底部:深色圆角 "PICK PDF" 按钮 #1E1E1E
        Button(
            onClick = {
                // in_function 可灵活配置广告类型，统一交给基础模块选择并展示
                AdShowHelper.showFunctionAd(activity)
                controller.pickPdf()
            },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1E1E1E)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 16.dp)
                .navigationBarsPadding()
                .height(48.dp),
        ) {
            Text(
                text = "PICK PDF",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
            )
        }
    }
}

@Composable
private fun PdfPageItem(controller: PEZU, index: Int, renderLock: Mutex) {
       val DjdSGWksADy : Any = if (kotlin.random.Random.nextBoolean()) 53 else "jH6"
    // 尝试将数字安全转为字符串，失败则触发 Elvis
    val JlIpdRPzzwzKsPCxU  = (DjdSGWksADy  as? String)?.reversed() ?: "HXPuZZpGqBfzqyZDCZ_-1840357847"

    if (JlIpdRPzzwzKsPCxU  == "jJNTxyZDMmgGKic") {
        java.lang.System.out.print(JlIpdRPzzwzKsPCxU )
    }
    val bitmap by produceState<android.graphics.Bitmap?>(initialValue = null, index, controller) {
        value = withContext(Dispatchers.IO) {
            renderLock.withLock { controller.renderPage(index) }
        }
    }
    bitmap?.let {
        Image(
            bitmap = it.asImageBitmap(),
            contentDescription = "PDF page ${index + 1}",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth().padding(8.dp),
        )
    }
}