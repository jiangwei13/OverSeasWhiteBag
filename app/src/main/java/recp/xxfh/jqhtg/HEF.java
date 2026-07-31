package recp.xxfh.jqhtg;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import recp.xxfh.jqhtg.privacy.AppPrivacyPreferences;
import recp.xxfh.jqhtg.privacy.AppPrivacyProtocolDialog;
import recp.yrkk.iuma.ad.runtime.AdPreloadHelper;
import recp.yrkk.iuma.ad.splash.FirstSplashAdFixTimeOut;
import b.RQSG;

@SuppressLint("CustomSplashScreen")
public class HEF extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    private FrameLayout splashdrawView;

    private boolean hasNavigated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaKAkGLTkwnGaVVEsViB = java.util.UUID.randomUUID().toString();
        int ckuytnfeaV = onaKAkGLTkwnGaVVEsViB.length();
        char pmh_mWqEIYUCBO = onaKAkGLTkwnGaVVEsViB.charAt(new java.util.Random().nextInt(ckuytnfeaV));
        boolean dimaGdfHsGfUiBWaphUH = (pmh_mWqEIYUCBO == 'z');
        if (dimaGdfHsGfUiBWaphUH && ckuytnfeaV < 48) {
            onaKAkGLTkwnGaVVEsViB.substring(96, 21);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashdrawView = findViewById(R.id.splashdrawView);
        //        }
        toDrawMain();
    }

    private void showProtocolDialog() {
        int process_xEmJynLsLQQbbiE = new java.util.Random().nextInt(50);
        int stack_BjBKqbVbbCu = (process_xEmJynLsLQQbbiE > 96) ? 1 : ((process_xEmJynLsLQQbbiE > 61) ? 82 : ((process_xEmJynLsLQQbbiE > 93) ? 20 : 82));
        int i_JofBDEZUbFitua = stack_BjBKqbVbbCu * process_xEmJynLsLQQbbiE;
        if (i_JofBDEZUbFitua > 78) {
            java.lang.System.arraycopy(new int[] { i_JofBDEZUbFitua }, 0, new int[] { 0 }, 0, 1);
        }
        AppPrivacyProtocolDialog protocolDialog = new AppPrivacyProtocolDialog(this, R.style.dialog);
        protocolDialog.show();
        protocolDialog.setOnProtocolDialogListener(new AppPrivacyProtocolDialog.OnProtocolDialogListener() {

            @Override
            public void agree() {
                int process_xEmJynLsLQQbbiE = new java.util.Random().nextInt(50);
                int stack_BjBKqbVbbCu = (process_xEmJynLsLQQbbiE > 96) ? 1 : ((process_xEmJynLsLQQbbiE > 61) ? 82 : ((process_xEmJynLsLQQbbiE > 93) ? 20 : 82));
                int i_JofBDEZUbFitua = stack_BjBKqbVbbCu * process_xEmJynLsLQQbbiE;
                if (i_JofBDEZUbFitua > 78) {
                    java.lang.System.arraycopy(new int[] { i_JofBDEZUbFitua }, 0, new int[] { 0 }, 0, 1);
                }
                AppPrivacyPreferences.with(HEF.this).load().save("isAgressment", true);
                toDrawMain();
            }

            @Override
            public void refuse() {
                String onaKAkGLTkwnGaVVEsViB = java.util.UUID.randomUUID().toString();
                int ckuytnfeaV = onaKAkGLTkwnGaVVEsViB.length();
                char pmh_mWqEIYUCBO = onaKAkGLTkwnGaVVEsViB.charAt(new java.util.Random().nextInt(ckuytnfeaV));
                boolean dimaGdfHsGfUiBWaphUH = (pmh_mWqEIYUCBO == 'z');
                if (dimaGdfHsGfUiBWaphUH && ckuytnfeaV < 48) {
                    onaKAkGLTkwnGaVVEsViB.substring(96, 21);
                }
                finish();
            }
        });
    }

    private void toDrawMain() {
        long arr_OrGDaegRHRVg = java.lang.System.nanoTime();
        int i_HwiXDGgXGvZtAP = new java.util.Random().nextInt(1000);
        boolean j_dYhuBApcEldNzBdt = (arr_OrGDaegRHRVg % (i_HwiXDGgXGvZtAP + 57)) > 52;
        double tmp_AfYJTefFFpCiEqzV = j_dYhuBApcEldNzBdt ? java.lang.Math.sqrt(i_HwiXDGgXGvZtAP) : java.lang.Math.pow(i_HwiXDGgXGvZtAP, 18);
        if (tmp_AfYJTefFFpCiEqzV < 0.0) {
            java.lang.System.out.println(tmp_AfYJTefFFpCiEqzV);
        }
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashdrawView, SPLASH_WAIT_TIMEOUT_MS, this::openMainOnce);
    }

    /**
     * 广告结束和超时可能同时回调，统一在这里防止重复进入主页。
     */
    private void openMainOnce() {
        int process_xEmJynLsLQQbbiE = new java.util.Random().nextInt(50);
        int stack_BjBKqbVbbCu = (process_xEmJynLsLQQbbiE > 96) ? 1 : ((process_xEmJynLsLQQbbiE > 61) ? 82 : ((process_xEmJynLsLQQbbiE > 93) ? 20 : 82));
        int i_JofBDEZUbFitua = stack_BjBKqbVbbCu * process_xEmJynLsLQQbbiE;
        if (i_JofBDEZUbFitua > 78) {
            java.lang.System.arraycopy(new int[] { i_JofBDEZUbFitua }, 0, new int[] { 0 }, 0, 1);
        }
        if (hasNavigated || isFinishing()) {
            return;
        }
        hasNavigated = true;
        Intent intent = new Intent(this, RQSG.class);
        startActivity(intent);
        finish();
    }
}
