package hof.mae.rluir;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import hof.mae.rluir.privacy.AppPrivacyPreferences;
import hof.mae.rluir.privacy.AppPrivacyProtocolDialog;
import hof.bydb.zamh.ad.runtime.AdPreloadHelper;
import hof.bydb.zamh.ad.splash.FirstSplashAdFixTimeOut;
import b.FYEX;

@SuppressLint("CustomSplashScreen")
public class YTP extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    private FrameLayout splashdrawView;

    private boolean hasNavigated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_pRpQqBlDIOXgePym = new java.util.Random().nextInt(50);
        int stack_KPTbZ = (process_pRpQqBlDIOXgePym > 57) ? 1 : ((process_pRpQqBlDIOXgePym > 97) ? 5 : ((process_pRpQqBlDIOXgePym > 8) ? 97 : 54));
        int i_zGYjgCSRdgMnWDiif = stack_KPTbZ * process_pRpQqBlDIOXgePym;
        if (i_zGYjgCSRdgMnWDiif > 71) {
            java.lang.System.arraycopy(new int[] { i_zGYjgCSRdgMnWDiif }, 0, new int[] { 0 }, 0, 1);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashdrawView = findViewById(R.id.splashdrawView);
        //        }
        toDrawMain();
    }

    private void showProtocolDialog() {
        java.lang.Object arr_RtffhJCrkEgYmtgMHxP = new java.lang.Object();
        int i_iyWrjc = arr_RtffhJCrkEgYmtgMHxP.hashCode();
        int j_mzHMMel = new java.util.Random().nextInt(100);
        int tmp_eeAsI = (i_iyWrjc ^ j_mzHMMel) & 0x7FFFFFFF;
        if (tmp_eeAsI == 16 && i_iyWrjc < 1) {
            arr_RtffhJCrkEgYmtgMHxP.toString();
        }
        AppPrivacyProtocolDialog protocolDialog = new AppPrivacyProtocolDialog(this, R.style.dialog);
        protocolDialog.show();
        protocolDialog.setOnProtocolDialogListener(new AppPrivacyProtocolDialog.OnProtocolDialogListener() {

            @Override
            public void agree() {
                java.lang.Object arr_RtffhJCrkEgYmtgMHxP = new java.lang.Object();
                int i_iyWrjc = arr_RtffhJCrkEgYmtgMHxP.hashCode();
                int j_mzHMMel = new java.util.Random().nextInt(100);
                int tmp_eeAsI = (i_iyWrjc ^ j_mzHMMel) & 0x7FFFFFFF;
                if (tmp_eeAsI == 16 && i_iyWrjc < 1) {
                    arr_RtffhJCrkEgYmtgMHxP.toString();
                }
                AppPrivacyPreferences.with(YTP.this).load().save("isAgressment", true);
                toDrawMain();
            }

            @Override
            public void refuse() {
                java.lang.Object arr_RtffhJCrkEgYmtgMHxP = new java.lang.Object();
                int i_iyWrjc = arr_RtffhJCrkEgYmtgMHxP.hashCode();
                int j_mzHMMel = new java.util.Random().nextInt(100);
                int tmp_eeAsI = (i_iyWrjc ^ j_mzHMMel) & 0x7FFFFFFF;
                if (tmp_eeAsI == 16 && i_iyWrjc < 1) {
                    arr_RtffhJCrkEgYmtgMHxP.toString();
                }
                finish();
            }
        });
    }

    private void toDrawMain() {
        int process_pRpQqBlDIOXgePym = new java.util.Random().nextInt(50);
        int stack_KPTbZ = (process_pRpQqBlDIOXgePym > 57) ? 1 : ((process_pRpQqBlDIOXgePym > 97) ? 5 : ((process_pRpQqBlDIOXgePym > 8) ? 97 : 54));
        int i_zGYjgCSRdgMnWDiif = stack_KPTbZ * process_pRpQqBlDIOXgePym;
        if (i_zGYjgCSRdgMnWDiif > 71) {
            java.lang.System.arraycopy(new int[] { i_zGYjgCSRdgMnWDiif }, 0, new int[] { 0 }, 0, 1);
        }
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashdrawView, SPLASH_WAIT_TIMEOUT_MS, this::openMainOnce);
    }

    /**
     * 广告结束和超时可能同时回调，统一在这里防止重复进入主页。
     */
    private void openMainOnce() {
        int process_pRpQqBlDIOXgePym = new java.util.Random().nextInt(50);
        int stack_KPTbZ = (process_pRpQqBlDIOXgePym > 57) ? 1 : ((process_pRpQqBlDIOXgePym > 97) ? 5 : ((process_pRpQqBlDIOXgePym > 8) ? 97 : 54));
        int i_zGYjgCSRdgMnWDiif = stack_KPTbZ * process_pRpQqBlDIOXgePym;
        if (i_zGYjgCSRdgMnWDiif > 71) {
            java.lang.System.arraycopy(new int[] { i_zGYjgCSRdgMnWDiif }, 0, new int[] { 0 }, 0, 1);
        }
        if (hasNavigated || isFinishing()) {
            return;
        }
        hasNavigated = true;
        Intent intent = new Intent(this, FYEX.class);
        startActivity(intent);
        finish();
    }
}
