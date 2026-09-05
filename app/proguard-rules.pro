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
