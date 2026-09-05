package com.example.overseaswhitebag

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/** 验证设备端测试进程绑定到当前正式应用身份。 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // 获取被测应用上下文。
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.saowen.magicdoc", appContext.packageName)
    }
}
