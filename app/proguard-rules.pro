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

###### DataBinding ######
-keep class * implements androidx.databinding.DataBinderMapper { *; }
-keep class **DataBinderMapperImpl { *; }
-keep class androidx.databinding.** { *; }
-keepclassmembers class * extends androidx.databinding.ViewDataBinding {
    public static * inflate(...);
    public static * bind(...);
}

###### iTextPDF, XML Stream, Log4j 等第三方库 ######
-dontwarn aQute.bnd.annotation.spi.ServiceProvider
-dontwarn com.itextpdf.bouncycastle.BouncyCastleFactory
-dontwarn com.itextpdf.bouncycastlefips.BouncyCastleFipsFactory
-dontwarn com.itextpdf.eutrustedlistsresources.EuropeanTrustedListConfiguration$PemCertificateWithHash
-dontwarn com.itextpdf.eutrustedlistsresources.EuropeanTrustedListConfiguration
-dontwarn edu.umd.cs.findbugs.annotations.SuppressFBWarnings
-dontwarn javax.lang.model.element.Modifier
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