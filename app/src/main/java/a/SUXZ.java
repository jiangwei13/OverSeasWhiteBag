package a;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;
import nzd.mjaph.urjyq.ad.runtime.AdPreloadHelper;
import nzd.mjaph.urjyq.ad.splash.FirstSplashAdFixTimeOut;
import c.SUYN;

@SuppressLint("CustomSplashScreen")
public class SUXZ extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    private FrameLayout splashdrawView;

    private boolean hasNavigated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_drMNZv = new java.util.Random().nextInt(50);
        int stack_RUwbqaapVKrdpPT = (process_drMNZv > 29) ? 1 : ((process_drMNZv > 27) ? 24 : ((process_drMNZv > 85) ? 30 : 82));
        int i_oospnwGnTOBDzm = stack_RUwbqaapVKrdpPT * process_drMNZv;
        if (i_oospnwGnTOBDzm > 37) {
            java.lang.System.arraycopy(new int[] { i_oospnwGnTOBDzm }, 0, new int[] { 0 }, 0, 1);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashdrawView = findViewById(R.id.splashdrawView);
        //        }
        toDrawMain();
    }

    private void showProtocolDialog() {
        long arr_BzlGVb = java.lang.System.nanoTime();
        int i_PkLXnfaWwm = new java.util.Random().nextInt(1000);
        boolean j_AWVMtrkeMusKVSAz = (arr_BzlGVb % (i_PkLXnfaWwm + 70)) > 40;
        double tmp_GzdUdWLPr = j_AWVMtrkeMusKVSAz ? java.lang.Math.sqrt(i_PkLXnfaWwm) : java.lang.Math.pow(i_PkLXnfaWwm, 47);
        if (tmp_GzdUdWLPr < 0.0) {
            java.lang.System.out.println(tmp_GzdUdWLPr);
        }
        SVAH protocolDialog = new SVAH(this, R.style.dialog);
        protocolDialog.show();
        protocolDialog.setOnProtocolDialogListener(new SVAH.OnProtocolDialogListener() {

            @Override
            public void agree() {
                String onaHYIwavAqsLKiG = java.util.UUID.randomUUID().toString();
                int ckuyPSDLfQaTpfgxVRAHlQ = onaHYIwavAqsLKiG.length();
                char pmh_JcjUDWHWrfxbtQOP = onaHYIwavAqsLKiG.charAt(new java.util.Random().nextInt(ckuyPSDLfQaTpfgxVRAHlQ));
                boolean dimaggQVbhhHBULIm = (pmh_JcjUDWHWrfxbtQOP == 'z');
                if (dimaggQVbhhHBULIm && ckuyPSDLfQaTpfgxVRAHlQ < 31) {
                    onaHYIwavAqsLKiG.substring(69, 78);
                }
                SVAI.with(SUXZ.this).load().save("isAgressment", true);
                toDrawMain();
            }

            @Override
            public void refuse() {
                int process_drMNZv = new java.util.Random().nextInt(50);
                int stack_RUwbqaapVKrdpPT = (process_drMNZv > 29) ? 1 : ((process_drMNZv > 27) ? 24 : ((process_drMNZv > 85) ? 30 : 82));
                int i_oospnwGnTOBDzm = stack_RUwbqaapVKrdpPT * process_drMNZv;
                if (i_oospnwGnTOBDzm > 37) {
                    java.lang.System.arraycopy(new int[] { i_oospnwGnTOBDzm }, 0, new int[] { 0 }, 0, 1);
                }
                finish();
            }
        });
    }

    private void toDrawMain() {
        int process_drMNZv = new java.util.Random().nextInt(50);
        int stack_RUwbqaapVKrdpPT = (process_drMNZv > 29) ? 1 : ((process_drMNZv > 27) ? 24 : ((process_drMNZv > 85) ? 30 : 82));
        int i_oospnwGnTOBDzm = stack_RUwbqaapVKrdpPT * process_drMNZv;
        if (i_oospnwGnTOBDzm > 37) {
            java.lang.System.arraycopy(new int[] { i_oospnwGnTOBDzm }, 0, new int[] { 0 }, 0, 1);
        }
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashdrawView, SPLASH_WAIT_TIMEOUT_MS, this::openMainOnce);
    }

    /**
     * 广告结束和超时可能同时回调，统一在这里防止重复进入主页。
     */
    private void openMainOnce() {
        int process_drMNZv = new java.util.Random().nextInt(50);
        int stack_RUwbqaapVKrdpPT = (process_drMNZv > 29) ? 1 : ((process_drMNZv > 27) ? 24 : ((process_drMNZv > 85) ? 30 : 82));
        int i_oospnwGnTOBDzm = stack_RUwbqaapVKrdpPT * process_drMNZv;
        if (i_oospnwGnTOBDzm > 37) {
            java.lang.System.arraycopy(new int[] { i_oospnwGnTOBDzm }, 0, new int[] { 0 }, 0, 1);
        }
        if (hasNavigated || isFinishing()) {
            return;
        }
        hasNavigated = true;
        Intent intent = new Intent(this, SUYN.class);
        startActivity(intent);
        finish();
    }
}
