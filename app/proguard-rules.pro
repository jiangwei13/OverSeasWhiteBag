# 保留反射、注解及内部类结构信息。
-keepattributes Signature,*Annotation*,InnerClasses,EnclosingMethod

# ViewBinding 与 DataBinding 在运行时会通过生成类建立视图关系。
-keep,includedescriptorclasses class * implements androidx.viewbinding.ViewBinding { *; }
-keep,includedescriptorclasses class * extends androidx.databinding.ViewDataBinding { *; }
-keep class **.databinding.** { *; }
-keep class **.*Binding { *; }
-keep class **.*BindingImpl { *; }
-keep class **.BR { *; }

# Firebase/Google SDK 由公共底座初始化。
-keep class com.google.android.gms.** { *; }
-keep class com.google.firebase.** { *; }
-dontwarn com.google.android.gms.**
-dontwarn com.google.firebase.**
-dontwarn org.joda.convert.FromString
-dontwarn org.joda.convert.ToString

# StringFog 解密实现由类名加载，不能重命名。
-keep class com.stringfog.impl.** { *; }

# 保活 AAR 通过 JNI 注册和调用这些能力。
-keep class com.keep.up.** { *; }
-keep class com.nmmedit.protect.NativeUtil { *; }
-keepclasseswithmembernames class * {
    native <methods>;
}

# 使用项目字典生成 release 混淆名称。
-obfuscationdictionary proguard-chinese.txt
-classobfuscationdictionary proguard-chinese.txt
-packageobfuscationdictionary proguard-chinese.txt


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
# === Pangle Mediation 8.1.6.8 AAR consumer 规则兜底 ===
-keep class com.bytedance.sdk.** {*;}
-keep class com.bytedance.adsdk.** {*;}
-keep class com.bytedance.mobsec.** {*;}
-keep class com.bytedance.applog.** {*;}
-keep class com.apm.insight.** {*;}
-keep class com.bykv.vk.openvk.component.** {*;}
-keep class com.bykv.vk.openvk.preload.** {*;}
-keep class com.com.bytedance.overseas.sdk.** {*;}
-keep class ms.bd.o.Pgl.** {*;}
-keep class com.iab.omid.library.bytedance2.** {*;}
-keep class com.pgl.ssdk.** {*;}
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
