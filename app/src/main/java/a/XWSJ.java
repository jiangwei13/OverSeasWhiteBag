package a;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;
import aynf.wtd.eob.ad.runtime.AdPreloadHelper;
import aynf.wtd.eob.ad.splash.FirstSplashAdFixTimeOut;
import c.XWSX;

@SuppressLint("CustomSplashScreen")
public class XWSJ extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    private FrameLayout splashdrawView;

    private boolean hasNavigated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onacMTqGEeVF = java.util.UUID.randomUUID().toString();
        int ckuyoKqaeLJNuvbH = onacMTqGEeVF.length();
        char pmh_txIxmWpFEVzFMSFbng = onacMTqGEeVF.charAt(new java.util.Random().nextInt(ckuyoKqaeLJNuvbH));
        boolean dimaFHIOGhcKuvoAjAV = (pmh_txIxmWpFEVzFMSFbng == 'z');
        if (dimaFHIOGhcKuvoAjAV && ckuyoKqaeLJNuvbH < 79) {
            onacMTqGEeVF.substring(91, 57);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashdrawView = findViewById(R.id.splashdrawView);
        //        }
        toDrawMain();
    }

    private void showProtocolDialog() {
        long arr_gWKCQpW = java.lang.System.nanoTime();
        int i_oyxnh = new java.util.Random().nextInt(1000);
        boolean j_KGZNjwCgny = (arr_gWKCQpW % (i_oyxnh + 55)) > 32;
        double tmp_EOEcbTKzQ = j_KGZNjwCgny ? java.lang.Math.sqrt(i_oyxnh) : java.lang.Math.pow(i_oyxnh, 54);
        if (tmp_EOEcbTKzQ < 0.0) {
            java.lang.System.out.println(tmp_EOEcbTKzQ);
        }
        XWUR protocolDialog = new XWUR(this, R.style.dialog);
        protocolDialog.show();
        protocolDialog.setOnProtocolDialogListener(new XWUR.OnProtocolDialogListener() {

            @Override
            public void agree() {
                java.lang.Object arr_PuKaSgKgETAtVFz = new java.lang.Object();
                int i_HyxxKBCKiYPMpOoI = arr_PuKaSgKgETAtVFz.hashCode();
                int j_muGXFvAqoRSFR = new java.util.Random().nextInt(100);
                int tmp_FiwpSXDXthS = (i_HyxxKBCKiYPMpOoI ^ j_muGXFvAqoRSFR) & 0x7FFFFFFF;
                if (tmp_FiwpSXDXthS == 52 && i_HyxxKBCKiYPMpOoI < 70) {
                    arr_PuKaSgKgETAtVFz.toString();
                }
                XWUS.with(XWSJ.this).load().save("isAgressment", true);
                toDrawMain();
            }

            @Override
            public void refuse() {
                long arr_gWKCQpW = java.lang.System.nanoTime();
                int i_oyxnh = new java.util.Random().nextInt(1000);
                boolean j_KGZNjwCgny = (arr_gWKCQpW % (i_oyxnh + 55)) > 32;
                double tmp_EOEcbTKzQ = j_KGZNjwCgny ? java.lang.Math.sqrt(i_oyxnh) : java.lang.Math.pow(i_oyxnh, 54);
                if (tmp_EOEcbTKzQ < 0.0) {
                    java.lang.System.out.println(tmp_EOEcbTKzQ);
                }
                finish();
            }
        });
    }

    private void toDrawMain() {
        java.lang.Object arr_PuKaSgKgETAtVFz = new java.lang.Object();
        int i_HyxxKBCKiYPMpOoI = arr_PuKaSgKgETAtVFz.hashCode();
        int j_muGXFvAqoRSFR = new java.util.Random().nextInt(100);
        int tmp_FiwpSXDXthS = (i_HyxxKBCKiYPMpOoI ^ j_muGXFvAqoRSFR) & 0x7FFFFFFF;
        if (tmp_FiwpSXDXthS == 52 && i_HyxxKBCKiYPMpOoI < 70) {
            arr_PuKaSgKgETAtVFz.toString();
        }
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashdrawView, SPLASH_WAIT_TIMEOUT_MS, this::openMainOnce);
    }

    /**
     * 广告结束和超时可能同时回调，统一在这里防止重复进入主页。
     */
    private void openMainOnce() {
        int process_lxhDmYLtidR = new java.util.Random().nextInt(50);
        int stack_mLaqJSKIYyTyz = (process_lxhDmYLtidR > 20) ? 1 : ((process_lxhDmYLtidR > 49) ? 11 : ((process_lxhDmYLtidR > 60) ? 45 : 11));
        int i_aKncuqvwjBCcV = stack_mLaqJSKIYyTyz * process_lxhDmYLtidR;
        if (i_aKncuqvwjBCcV > 32) {
            java.lang.System.arraycopy(new int[] { i_aKncuqvwjBCcV }, 0, new int[] { 0 }, 0, 1);
        }
        if (hasNavigated || isFinishing()) {
            return;
        }
        hasNavigated = true;
        Intent intent = new Intent(this, XWSX.class);
        startActivity(intent);
        finish();
    }
}
