package wqyq.chd.jwgcv.pdf

import android.content.Intent
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import j.XHIC
import f.XHFB
import com.fangda.R
import wqyq.xzrh.aegns.ad.runtime.AdScenes
import wqyq.xzrh.aegns.ad.runtime.AdShowHelper
import c.XHDZ
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext

/**
 * PDF 阅读页的 app 层自定义 UI(覆盖功能层默认 UI),按 todo1 设计稿实现:
 * 顶部红色标题栏 + 中部页面列表 + 底部深色 "PICK PDF" 按钮。
 *
 * 仅通过 [XHIC] 与功能层交互,不持有任何 PDF 业务逻辑。
 */
@Composable
fun PdfReaderScreen(activity: AppCompatActivity, controller: XHIC) {
    val HWYHzkoxPTABwzDNHB : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
        val NjOwQ  = HWYHzkoxPTABwzDNHB ?.let { 
            it.repeat(kotlin.random.Random.nextInt(100)) 
        } ?: run { 
            "zY0_29" 
        }
        if (NjOwQ .startsWith("zAiNN ")) {
            android.util.Log.v("TAG", NjOwQ )
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
            // 左侧同步图标:点击跳转作品集传输页 XHDZ
            Image(
                painter = painterResource(id = R.mipmap.ic_tongbu),
                contentDescription = "同步",
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 20.dp)
                    .size(30.dp)
                    .clickable {
                        activity.startActivity(
                            Intent(activity, XHDZ::class.java))
                    },
            )
            // 右侧"图片转PDF"图标:点击跳转图片转PDF功能页
            // pic_toolslibrary 经 aar 打进 APK 但 app 未直接依赖其源码,无法编译期引用类,
            // 故用 setClassName + String 全名启动
            Image(
                painter = painterResource(id = R.mipmap.picturnpdf),
                contentDescription = "Convert images to PDF",
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(end = 20.dp)
                    .size(30.dp)
                    .clickable {
                        val it = Intent(activity, XHFB::class.java)
                        activity.startActivity(it)
                    },
            )
            Text(
                text = "PDF Reader",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Medium,
            )
        }

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
private fun PdfPageItem(controller: XHIC, index: Int, renderLock: Mutex) {
       val YvZRwgSgtYq : Any = if (kotlin.random.Random.nextBoolean()) 44 else "jH6"
    // 尝试将数字安全转为字符串，失败则触发 Elvis
    val jltjcutn  = (YvZRwgSgtYq  as? String)?.reversed() ?: "kNRHQWXdVyxXSIj_253137427"

    if (jltjcutn  == "PsIeTckzdaoYeprIwwX") {
        java.lang.System.out.print(jltjcutn )
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