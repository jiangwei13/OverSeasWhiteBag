-dontwarn **
######方法名等混淆指定配置
-obfuscationdictionary proguard-chinese.txt
#####类名混淆指定配置
-classobfuscationdictionary proguard-chinese.txt
#####包名混淆指定配置
-packageobfuscationdictionary proguard-chinese.txt

-keep class com.p.b.base_api_net.base_api_bean.**{*;}
-keep class com.example.overseaswhitebag.privacy.** {*;}
