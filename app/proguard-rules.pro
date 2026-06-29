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

###### errorprone 编译期注解引用 JDK 的 javax.lang.model.*（Android 无此 API），仅编译期用，运行时无害
-dontwarn javax.lang.model.**
-dontwarn com.google.errorprone.annotations.**

######方法名等混淆指定配置
-obfuscationdictionary proguard-chinese.txt
#####类名混淆指定配置
-classobfuscationdictionary proguard-chinese.txt
#####包名混淆指定配置
-packageobfuscationdictionary proguard-chinese.txt
#####保护 stringfog 加解密实现类不被 R8 重命名
-keep class com.stringfog.impl.** {*;}


#保留aar里面的类和方法不被混淆
-keep class com.amour.** { *; }
-keep class com.Txn.** { *; }
-keep class com.tanout.** { *; }
-keepclasseswithmembernames class * {
    native <methods>;
}
-keepclasseswithmembers class * {
    native <methods>;
}

# 保留 native 方法，避免 R8 移除导致 JNI 注册失败
#-keepclasseswithmembers class com.huawei.recharge.featurexzy21.df {
#    native <methods>;
#}
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