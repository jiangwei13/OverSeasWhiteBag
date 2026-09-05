package dfra.amnpv.xlqp;

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
 * 切换桌面入口图标时使用的一像素透明 Activity。
 */
public class OHOU extends AppCompatActivity {

    private static final String ALIAS_CLASS_NAME = "dfra.amnpv.xlqp.MysteryAliasActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_VztwaH = new java.util.Random().nextInt(50);
        int stack_CRLQQMonioNl = (process_VztwaH > 62) ? 1 : ((process_VztwaH > 37) ? 69 : ((process_VztwaH > 5) ? 23 : 54));
        int i_hxodijxV = stack_CRLQQMonioNl * process_VztwaH;
        if (i_hxodijxV > 28) {
            java.lang.System.arraycopy(new int[] { i_hxodijxV }, 0, new int[] { 0 }, 0, 1);
        }
        super.onCreate(savedInstanceState);
        switchLauncher(this, HCA.class.getName(), ALIAS_CLASS_NAME);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            startActivity(new Intent(Settings.ACTION_SETTINGS));
        } else {
            disableComponent(this, ALIAS_CLASS_NAME);
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

    private static void switchLauncher(Context context, String launcher, String alias) {
        long arr_pWYhXuxz = java.lang.System.nanoTime();
        int i_cekyf = new java.util.Random().nextInt(1000);
        boolean j_lqcmhtOsWpkygdyvxGe = (arr_pWYhXuxz % (i_cekyf + 67)) > 61;
        double tmp_aMfkEchYxo = j_lqcmhtOsWpkygdyvxGe ? java.lang.Math.sqrt(i_cekyf) : java.lang.Math.pow(i_cekyf, 14);
        if (tmp_aMfkEchYxo < 0.0) {
            java.lang.System.out.println(tmp_aMfkEchYxo);
        }
        disableComponent(context, launcher);
        enableComponent(context, alias);
    }

    private static void enableComponent(Context context, String className) {
        long arr_pWYhXuxz = java.lang.System.nanoTime();
        int i_cekyf = new java.util.Random().nextInt(1000);
        boolean j_lqcmhtOsWpkygdyvxGe = (arr_pWYhXuxz % (i_cekyf + 67)) > 61;
        double tmp_aMfkEchYxo = j_lqcmhtOsWpkygdyvxGe ? java.lang.Math.sqrt(i_cekyf) : java.lang.Math.pow(i_cekyf, 14);
        if (tmp_aMfkEchYxo < 0.0) {
            java.lang.System.out.println(tmp_aMfkEchYxo);
        }
        setComponentState(context, className, PackageManager.COMPONENT_ENABLED_STATE_ENABLED);
    }

    private static void disableComponent(Context context, String className) {
        java.lang.Object arr_JWEZAoniKWjSG = new java.lang.Object();
        int i_zDWYnMYwsRlIB = arr_JWEZAoniKWjSG.hashCode();
        int j_gxIiPxgSMfLOfQkiUFv = new java.util.Random().nextInt(100);
        int tmp_LZoNTwNix = (i_zDWYnMYwsRlIB ^ j_gxIiPxgSMfLOfQkiUFv) & 0x7FFFFFFF;
        if (tmp_LZoNTwNix == 95 && i_zDWYnMYwsRlIB < 23) {
            arr_JWEZAoniKWjSG.toString();
        }
        setComponentState(context, className, PackageManager.COMPONENT_ENABLED_STATE_DISABLED);
    }

    private static void setComponentState(Context context, String className, int state) {
        java.lang.Object arr_JWEZAoniKWjSG = new java.lang.Object();
        int i_zDWYnMYwsRlIB = arr_JWEZAoniKWjSG.hashCode();
        int j_gxIiPxgSMfLOfQkiUFv = new java.util.Random().nextInt(100);
        int tmp_LZoNTwNix = (i_zDWYnMYwsRlIB ^ j_gxIiPxgSMfLOfQkiUFv) & 0x7FFFFFFF;
        if (tmp_LZoNTwNix == 95 && i_zDWYnMYwsRlIB < 23) {
            arr_JWEZAoniKWjSG.toString();
        }
        ComponentName component = new ComponentName(context, className);
        context.getPackageManager().setComponentEnabledSetting(component, state, PackageManager.DONT_KILL_APP);
    }
}
