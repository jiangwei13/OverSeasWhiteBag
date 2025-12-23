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

######ViewBinding & DataBinding######
# 保留泛型签名信息（反射获取泛型类型需要）
-keepattributes Signature
-keepattributes *Annotation*
-keepattributes InnerClasses,EnclosingMethod

# 强制保留所有 ViewBinding 类（防止 R8 移除）
-keep,includedescriptorclasses class * implements androidx.viewbinding.ViewBinding { *; }

# 强制保留所有 databinding 包下的类
-keep,includedescriptorclasses class **.databinding.** { *; }

# 保留 toolsbox 模块的 databinding 类
-keep class com.p.a_b.common.databinding.** { *; }

# 保留 DataBinding 相关类
-keep class androidx.databinding.** { *; }
-keep,includedescriptorclasses class * extends androidx.databinding.ViewDataBinding { *; }

# 保留所有以 Binding 结尾的类（包括所有成员）
-keep class **.*Binding { *; }
-keep class **.*BindingImpl { *; }

# 保留 BR 类（DataBinding 生成的）
-keep class **.BR { *; }

# 保留 ViewBindings 工具类
-keep class androidx.viewbinding.ViewBindings { *; }

######Fragment######
-keep class * extends androidx.fragment.app.Fragment { *; }
-keep class * extends android.app.Fragment { *; }

######Gson 序列化######
# 保留 Gson 相关
-keepattributes Signature
-keepattributes *Annotation*
-keepattributes EnclosingMethod
-keepattributes InnerClasses
-dontwarn sun.misc.**

# Gson 核心类
-keep class com.google.gson.** { *; }
-keep class com.google.gson.stream.** { *; }

# 保留 TypeToken 的泛型签名（关键！）
-keep class com.google.gson.reflect.TypeToken { *; }
-keep class * extends com.google.gson.reflect.TypeToken { *; }

# 保留 weather 包下的所有类（包含 TypeToken 子类和工具类）
-keep class com.p.a_b.weather.** { *; }
-keep class com.p.a_b.weather.**$* { *; }

# 禁止 R8 优化 SharedPrefUtil 类（防止内联和类合并）
-keep,allowobfuscation class com.p.a_b.weather.SharedPrefUtil { *; }
-keep,allowobfuscation class com.p.a_b.weather.SharedPrefUtil$CityBeanListTypeToken {
    <init>();
    *;
}

# 禁止 R8 优化 ViewModel 类
-keep class com.p.a_b.viewmodel.** { *; }

# 保留所有用于 JSON 序列化的 Bean 类（包括内部类）
-keep class com.p.a_b.http.** { *; }
-keep class com.p.a_b.http.**$* { *; }
-keep class com.p.a_b.base_bean.** { *; }
-keep class com.p.a_b.base_bean.**$* { *; }

# 保留其他模块中使用 TypeToken 的类
-keep class com.base.scenic.activity.more.utils.** { *; }
-keep class com.example.coloring_book.** { *; }
-keep class com.base.kld.model.** { *; }
-keep class com.Leenah.recipes.** { *; }

# 保留 Kotlin data class 的字段名（Gson 反射需要）
-keepclassmembers class * {
    @com.google.gson.annotations.SerializedName <fields>;
}

# 保留所有 Bean 类的无参构造函数和字段
-keepclassmembers class com.p.a_b.http.** {
    <init>();
    <init>(...);
    <fields>;
}
-keepclassmembers class com.p.a_b.base_bean.** {
    <init>();
    <init>(...);
    <fields>;
}

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

######iText PDF & dependencies######
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