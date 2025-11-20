package com.example.overseaswhitebag.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;

import com.example.overseaswhitebag.common.utils.APPContext;
import com.p.b.pl223.hhoosstt.CContext;
import com.tencent.mmkv.MMKV;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;


public class LaunchStateUtils {

    public static String getPhoneState(String phoneState) {
// TODO
//        返回1: 合格可以正常用；返回：102 无sim卡； 103 sd卡的截屏文件太多； 104 安装了华为内部IM
        //int statusCheck = Objects.requireNonNull(TheApplication.getAppContext()).getCheckStatus();
        //int statusCheck = Check_Util.check(CContext.getContext());
//        if (!BuildConfig.LOGSWITCH) {
//            switch (statusCheck) {
//                case 102:
//                    phoneState = "client_audit_nosim";
//                    break;
//                case 103:
//                    phoneState = "client_audit_sdcard";
//                    break;
//                case 104:
//                    phoneState = "client_audit_hw_im";
//                    break;
//            }

            //判断手机是否root 和 开始开发者模式
            if (isDebug()) {
                phoneState = "client_audit_isdebug";
            } else if (isDeviceRooted()) {
                phoneState = "client_audit_isroot";
            }
//            else if (isRunningOnEmulator()){
//                phoneState = "client_audit_simulator";
//            } else if(isHasVPN()){
//                phoneState = "client_audit_hasvpn";
//            }
//        }
        return phoneState;
    }




    private static boolean isRunningOnEmulator() {
        // 检查是否有某些模拟器特有的系统属性
        if (Build.FINGERPRINT.startsWith("generic")
                || Build.FINGERPRINT.startsWith("unknown")
                || Build.HARDWARE.contains("goldfish")
                || Build.HARDWARE.contains("ranchu")
                || Build.MODEL.contains("(sdk")
                || Build.MODEL.contains("Emulator")
                || Build.MANUFACTURER.contains("Genymotion")
                || Build.MODEL.contains("Android SDK built for x86")) {
            return true;
        }

        // 如果以上都不满足，则不是模拟器
        return false;
    }


    private static boolean isHasVPN(){
        // Android Java 示例
        ConnectivityManager connectivityManager = (ConnectivityManager) APPContext.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        Network activeNetwork = connectivityManager.getActiveNetwork();
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null){
            return false;
        }
        return networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_VPN);
    }


    private static boolean isDebug(){
        Settings.Global.getInt(APPContext.getApplicationContext().getContentResolver(), Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0);
        boolean isDeveloperMode = Settings.Secure.getInt(APPContext.getApplicationContext().getContentResolver(), Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0) != 0;
        return isDeveloperMode;
    }

    public static boolean isDeviceRooted() {
        return checkSuFile() || checkSuCommand() || checkSuperuserApk() || isRooted() || isRoot();
    }



    private static boolean checkSuFile() {
        File file = new File("/system/bin/su");
        return file.exists();
    }

    private static boolean checkSuCommand() {
        try {
            Process process = Runtime.getRuntime().exec("su");
            int exitValue = process.waitFor();
            return exitValue == 0;
        } catch (IOException e) {
            // 异常处理
        } catch (InterruptedException e) {
            // 异常处理
        }
        return false;
    }

    private static boolean checkSuperuserApk() {
        String secureProperty = "ro.secure";
        String propertyValue =  getSystemProperty(secureProperty);
        if ("0".equals(propertyValue)) {
            return true;
        }
        return false;
    }



    private static String getSystemProperty(String propertyName) {
        String propertyValue = "";
        try {
            Process process = Runtime.getRuntime().exec("getprop " + propertyName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            propertyValue = reader.readLine();
            reader.close();
            process.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return propertyValue;
    }

    public static boolean isRooted() {
        String[] cmd = {"su", "-c", "id"}; // 运行 su -c id 命令查看当前用户的 UID
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            int exitValue = process.waitFor();
            return (exitValue == 0) ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    private static boolean isRoot() {
        String[] paths = {"/system/bin/su", "/system/xbin/su", "/sbin/su"}; // 常见的 su 命令路径
        for (String path : paths) {
            if (new File(path).exists())
                return true;
        }
        return false;
    }


    private static String sPhoneImei;

    public static String getPhoneImei(Context context) {
        try {
            String imei = MMKV.defaultMMKV().decodeString("device:imei");
            if (!TextUtils.isEmpty(imei)) {
                return imei;
            }
            TelephonyManager mTelephonyMgr = (TelephonyManager) context.getApplicationContext().getSystemService(Context.TELEPHONY_SERVICE);
            sPhoneImei = mTelephonyMgr.getDeviceId();
            if (!TextUtils.isEmpty(sPhoneImei)) {
                MMKV.defaultMMKV().encode("device:imei",sPhoneImei);
            }
            return sPhoneImei;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }





    public static String getAndroidId(Context context) {
        try {
            String id = Settings.System.getString(context.getContentResolver(),
                    Settings.Secure.ANDROID_ID);
            Log.d(APPContext.Companion.getAD_LOG_TAG(), "getAndroidId: id:" + id );
            return id;
        } catch (Throwable throwable) {
            return "";
        }
    }



    private static String sPhoneImsi;

    public static String getPhoneImsi(Context context) {
        if (sPhoneImsi != null) {
            return sPhoneImsi;
        }
        try {
            TelephonyManager mTelephonyMgr = (TelephonyManager) context.getApplicationContext().getSystemService(Context.TELEPHONY_SERVICE);
            sPhoneImsi = mTelephonyMgr.getSubscriberId();
            return sPhoneImsi = TextUtils.isEmpty(sPhoneImsi) ? "" : sPhoneImsi;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    /**
     * 判断是否为国内SIM卡
     */
    public static boolean isChineseSIM(Context context) {
        TelephonyManager telephonyManager =
                (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);

        if (telephonyManager == null) {
            return false;
        }

        // 方法1：通过SIM卡国家代码判断（最可靠）
        String simCountry = telephonyManager.getSimCountryIso();
        if (simCountry != null && !simCountry.isEmpty()) {
            return "cn".equalsIgnoreCase(simCountry);
        }

        // 方法2：通过网络国家代码判断
        String networkCountry = telephonyManager.getNetworkCountryIso();
        if (networkCountry != null && !networkCountry.isEmpty()) {
            return "cn".equalsIgnoreCase(networkCountry);
        }

        return false;
    }

    /**
     * 判断是否从Google Play商店安装
     */
    public static boolean isInstalledFromGooglePlay(Context context) {
        String installerPackageName = getInstallerPackageName(context);
        return isGooglePlayStore(installerPackageName);
    }

    /**
     * 获取安装来源包名
     */
    public static String getInstallerPackageName(Context context) {
        try {
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getInstallerPackageName(packageName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 判断包名是否是Google Play商店 google/null
     */
    public static boolean isGooglePlayStore(String installerPackageName) {
        if (installerPackageName == null) {
            return false;
        }

        // Google Play商店的包名
        return "com.android.vending".equals(installerPackageName) ||
                "com.google.android.feedback".equals(installerPackageName);
    }

    /**
     * 获取详细的安装来源信息
     */
    public static String getInstallSourceInfo(Context context) {
        String installerPackageName = getInstallerPackageName(context);

        if (installerPackageName == null) {
            return "unknown"; // 或者 "null" - 通常表示手动安装、ADB安装或系统应用
        }

        switch (installerPackageName) {
            case "com.android.vending":
            case "com.google.android.feedback":
                return "google_play";
            case "com.huawei.appmarket":
                return "huawei_appgallery";
            case "com.tencent.android.qqdownloader":
                return "tencent_app_center";
            case "com.xiaomi.market":
                return "xiaomi_app_store";
            case "com.oppo.market":
                return "oppo_app_market";
            case "com.vivo.appstore":
                return "vivo_app_store";
            case "com.samsung.android.appstore":
                return "samsung_galaxy_store";
            case "com.amazon.venezia":
                return "amazon_appstore";
            default:
                return "other_" + installerPackageName;
        }
    }
}
