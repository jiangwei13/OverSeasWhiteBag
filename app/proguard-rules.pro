# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
-dontwarn org.joda.convert.FromString
-dontwarn org.joda.convert.ToString
######fireBase###########
###########google###########
-keep class com.google.android.gms.** { *; }
-keep class com.google.firebase.** { *; }
-dontwarn com.google.android.gms.**
-dontwarn com.google.firebase.**

-keepattributes *Annotation*
-keepattributes SourceFile,LineNumberTable
-keep public class * extends java.lang.Exception
-keep class com.google.firebase.crashlytics.** { *; }
-keep class com.google.firebase.analytics.** { *; }

######adjust

-dontwarn aQute.bnd.annotation.spi.ServiceProvider
-dontwarn com.itextpdf.bouncycastle.BouncyCastleFactory
-dontwarn com.itextpdf.bouncycastlefips.BouncyCastleFipsFactory
-dontwarn com.itextpdf.eutrustedlistsresources.EuropeanTrustedListConfiguration$PemCertificateWithHash
-dontwarn com.itextpdf.eutrustedlistsresources.EuropeanTrustedListConfiguration
-dontwarn javax.xml.stream.XMLEventFactory
-dontwarn javax.xml.stream.XMLInputFactory
-dontwarn javax.xml.stream.XMLOutputFactory
-dontwarn javax.xml.stream.XMLResolver
-dontwarn javax.xml.stream.XMLStreamException
-dontwarn javax.xml.stream.util.XMLEventAllocator
-dontwarn org.apache.logging.log4j.Level
-dontwarn org.apache.logging.log4j.LogManager
-dontwarn org.apache.logging.log4j.Marker
-dontwarn org.apache.logging.log4j.MarkerManager
-dontwarn org.apache.logging.log4j.spi.AbstractLoggerAdapter
-dontwarn org.apache.logging.log4j.spi.ExtendedLogger
-dontwarn org.apache.logging.log4j.spi.LoggerAdapter
-dontwarn org.apache.logging.log4j.spi.LoggerContext
-dontwarn org.apache.logging.log4j.spi.LoggerContextFactory
-dontwarn org.apache.logging.log4j.util.StackLocatorUtil
-dontwarn sharpen.config.MappingConfiguration
-dontwarn sharpen.config.MappingConfigurator
-dontwarn sharpen.config.MemberKind
-dontwarn sharpen.config.ModuleOption
-dontwarn sharpen.config.ModulesConfigurator
-dontwarn sharpen.config.OptionsConfigurator

######方法名等混淆指定配置
-obfuscationdictionary proguard-chinese.txt
#####类名混淆指定配置
-classobfuscationdictionary proguard-EN.txt
#####包名不使用R8字典重命名（由xmlClassGuard负责，保留包名让BlackObfuscator能匹配）
-keeppackagenames ymba.**
#####禁止R8代码优化（避免优化后的DEX结构导致dex2jar转换失败）
-dontoptimize
#####保护 stringfog 加解密实现类不被 R8 重命名
-keep class com.stringfog.impl.** {*;}
#####保护 stringfog 加解密实现类不被 R8 重命名
-keep class com.stringfog.impl.** {*;}

# 保留 native 方法及其所在类成员，避免 R8 移除导致 JNI 注册失败
# 兄弟项目如有自定义 JNI 类，请在此追加具体类名的 keep 规则，例如：
# -keepclasseswithmembers class your.jni.class {
#     native <methods>;
# }
-keepclasseswithmembernames class * {
    native <methods>;
}

##### 保护能力 aar  的 JNI 入口类，禁止混淆
-keep class com.huawei.recharge.featurexzy21.** { *; }
# 保留所有 native 方法名
-keepclasseswithmembernames class * {
    native <methods>;
}

# === Android/Google 系 ===
-keep class androidx.** {*;}
-keep class com.google.** {*;}
-keep class com.android.** {*;}
# === 广告聚合平台 ===
-keep class com.tradplusad.** {*;}
-keep class com.thinkup.** {*;}
-keep class com.smartdigimkttech.** {*;}
# === 广告网络 SDK ===
-keep class com.facebook.** {*;}
-keep class com.applovin.** {*;}
-keep class com.unity3d.** {*;}
-keep class com.ironsource.** {*;}
-keep class com.chartboost.** {*;}
-keep class com.mbridge.** {*;}
-keep class com.pangle.** {*;}
-keep class com.bigossp.** {*;}
-keep class com.vungle.** {*;}
-keep class com.inmobi.** {*;}
-keep class com.fyber.** {*;}
-keep class com.mi.** {*;}
-keep class io.github.kwainetwork.** {*;}
# === 归因/分析 ===
-keep class com.adjust.** {*;}
-keep class com.appsflyer.** {*;}
-keep class com.tencent.** {*;}
# === 华为/荣耀 ===
-keep class com.huawei.** {*;}
-keep class com.hihonor.** {*;}
-keep class com.miui.** {*;}
# === 基础网络/工具库 ===
-keep class com.squareup.** {*;}
-keep class com.jakewharton.** {*;}
-keep class com.github.** {*;}
-keep class org.greenrobot.** {*;}
-keep class io.reactivex.** {*;}
-keep class org.jetbrains.** {*;}
-keep class kotlin.** {*;}
-keep class com.meituan.** {*;}
