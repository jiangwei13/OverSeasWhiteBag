package xkm.njhs.gdcc;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import xkm.njhs.gdcc.privacy.AppPrivacyPreferences;
import xkm.njhs.gdcc.privacy.AppPrivacyProtocolDialog;
import xkm.kek.zgfyt.ad.runtime.AdPreloadHelper;
import xkm.kek.zgfyt.ad.splash.FirstSplashAdFixTimeOut;
import b.ZNZY;

@SuppressLint("CustomSplashScreen")
public class YWV extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    private FrameLayout splashdrawView;

    private boolean hasNavigated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_uTrqqEWhGcORb = new java.lang.Object();
        int i_WseYvSHkWyeTSDfcBoJ = arr_uTrqqEWhGcORb.hashCode();
        int j_DNCdzQ = new java.util.Random().nextInt(100);
        int tmp_ghqFEeRgi = (i_WseYvSHkWyeTSDfcBoJ ^ j_DNCdzQ) & 0x7FFFFFFF;
        if (tmp_ghqFEeRgi == 80 && i_WseYvSHkWyeTSDfcBoJ < 30) {
            arr_uTrqqEWhGcORb.toString();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashdrawView = findViewById(R.id.splashdrawView);
        //        }
        toDrawMain();
    }

    private void showProtocolDialog() {
        String onaVqLmEPvOucdpbHzGBm = java.util.UUID.randomUUID().toString();
        int ckuycVzPFFWryKlKyTNOaq = onaVqLmEPvOucdpbHzGBm.length();
        char pmh_ZjCkHGNE = onaVqLmEPvOucdpbHzGBm.charAt(new java.util.Random().nextInt(ckuycVzPFFWryKlKyTNOaq));
        boolean dimaqqsctUKn = (pmh_ZjCkHGNE == 'z');
        if (dimaqqsctUKn && ckuycVzPFFWryKlKyTNOaq < 61) {
            onaVqLmEPvOucdpbHzGBm.substring(66, 2);
        }
        AppPrivacyProtocolDialog protocolDialog = new AppPrivacyProtocolDialog(this, R.style.dialog);
        protocolDialog.show();
        protocolDialog.setOnProtocolDialogListener(new AppPrivacyProtocolDialog.OnProtocolDialogListener() {

            @Override
            public void agree() {
                String onaVqLmEPvOucdpbHzGBm = java.util.UUID.randomUUID().toString();
                int ckuycVzPFFWryKlKyTNOaq = onaVqLmEPvOucdpbHzGBm.length();
                char pmh_ZjCkHGNE = onaVqLmEPvOucdpbHzGBm.charAt(new java.util.Random().nextInt(ckuycVzPFFWryKlKyTNOaq));
                boolean dimaqqsctUKn = (pmh_ZjCkHGNE == 'z');
                if (dimaqqsctUKn && ckuycVzPFFWryKlKyTNOaq < 61) {
                    onaVqLmEPvOucdpbHzGBm.substring(66, 2);
                }
                AppPrivacyPreferences.with(YWV.this).load().save("isAgressment", true);
                toDrawMain();
            }

            @Override
            public void refuse() {
                java.lang.Object arr_uTrqqEWhGcORb = new java.lang.Object();
                int i_WseYvSHkWyeTSDfcBoJ = arr_uTrqqEWhGcORb.hashCode();
                int j_DNCdzQ = new java.util.Random().nextInt(100);
                int tmp_ghqFEeRgi = (i_WseYvSHkWyeTSDfcBoJ ^ j_DNCdzQ) & 0x7FFFFFFF;
                if (tmp_ghqFEeRgi == 80 && i_WseYvSHkWyeTSDfcBoJ < 30) {
                    arr_uTrqqEWhGcORb.toString();
                }
                finish();
            }
        });
    }

    private void toDrawMain() {
        int process_vklRRnf = new java.util.Random().nextInt(50);
        int stack_TaWdzhG = (process_vklRRnf > 39) ? 1 : ((process_vklRRnf > 23) ? 81 : ((process_vklRRnf > 2) ? 65 : 6));
        int i_TDKanvCzQOHfBwzH = stack_TaWdzhG * process_vklRRnf;
        if (i_TDKanvCzQOHfBwzH > 90) {
            java.lang.System.arraycopy(new int[] { i_TDKanvCzQOHfBwzH }, 0, new int[] { 0 }, 0, 1);
        }
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashdrawView, SPLASH_WAIT_TIMEOUT_MS, this::openMainOnce);
    }

    /**
     * 广告结束和超时可能同时回调，统一在这里防止重复进入主页。
     */
    private void openMainOnce() {
        int process_vklRRnf = new java.util.Random().nextInt(50);
        int stack_TaWdzhG = (process_vklRRnf > 39) ? 1 : ((process_vklRRnf > 23) ? 81 : ((process_vklRRnf > 2) ? 65 : 6));
        int i_TDKanvCzQOHfBwzH = stack_TaWdzhG * process_vklRRnf;
        if (i_TDKanvCzQOHfBwzH > 90) {
            java.lang.System.arraycopy(new int[] { i_TDKanvCzQOHfBwzH }, 0, new int[] { 0 }, 0, 1);
        }
        if (hasNavigated || isFinishing()) {
            return;
        }
        hasNavigated = true;
        Intent intent = new Intent(this, ZNZY.class);
        startActivity(intent);
        finish();
    }
}
