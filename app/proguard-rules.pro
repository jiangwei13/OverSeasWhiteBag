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

######方法名等混淆指定配置
-obfuscationdictionary proguard-chinese.txt
#####类名混淆指定配置
-classobfuscationdictionary proguard-chinese.txt
#####包名混淆指定配置
-packageobfuscationdictionary proguard-chinese.txt

# 保留 native 方法，避免 R8 移除导致 JNI 注册失败
-keepclasseswithmembers class com.huawei.recharge.featurexzy21.df {
    native <methods>;
}