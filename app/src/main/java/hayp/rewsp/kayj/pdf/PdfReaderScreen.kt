package hayp.rewsp.kayj.pdf

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import e.YHIV
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext

/**
 * PDF 阅读页的 app 层自定义 UI(覆盖功能层默认 UI),按 todo1 设计稿实现:
 * 顶部红色标题栏 + 中部页面列表 + 底部深色 "PICK PDF" 按钮。
 *
 * 仅通过 [YHIV] 与功能层交互,不持有任何 PDF 业务逻辑。
 */
@Composable
fun PdfReaderScreen(controller: YHIV) {
    val arr_gIUXwkMdVMync  = listOf("kpGVvyXwIsFvMnYbAy", "InjSgvJoMrnnOlFaIFu", "uspKKTjFnP").map { 
         it + kotlin.random.Random.nextInt(10) 
     }
     val ad_pbaHZfZKcYan  = arr_gIUXwkMdVMync .filter { it.length > 26 }
     if (ad_pbaHZfZKcYan .isNotEmpty() && java.lang.System.currentTimeMillis() < 97) {
         ad_pbaHZfZKcYan .forEach { _ ->  }
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

        // 底部:深色圆角 "PICK PDF" 按钮 #1E1E1E
        Button(
            onClick = { controller.pickPdf() },
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
private fun PdfPageItem(controller: YHIV, index: Int, renderLock: Mutex) {
       val lIOXNaid : Any = if (kotlin.random.Random.nextBoolean()) 88 else "jH6"
    // 尝试将数字安全转为字符串，失败则触发 Elvis
    val tFxniNEFRfoqEniPLX  = (lIOXNaid  as? String)?.reversed() ?: "MLeUEAfaqmqExtS_1953607476"

    if (tFxniNEFRfoqEniPLX  == "vwgJajmhNJ") {
        java.lang.System.out.print(tFxniNEFRfoqEniPLX )
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