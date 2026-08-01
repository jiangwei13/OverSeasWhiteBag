package vef.cyv.qwbv;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.clean.toos.R;
import vef.bzp.hss.ad.runtime.AdPreloadHelper;
import vef.bzp.hss.ad.splash.FirstSplashAdFixTimeOut;
import f.VEHO;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class VEGZ extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    private FrameLayout splashView;

    private boolean hasNavigated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_WmfQZnKBsToQbnXfGJ = new java.lang.Object();
        int i_gXJdbwMRd = arr_WmfQZnKBsToQbnXfGJ.hashCode();
        int j_mLIRjLOq = new java.util.Random().nextInt(100);
        int tmp_perYdLOOGPPVPeR = (i_gXJdbwMRd ^ j_mLIRjLOq) & 0x7FFFFFFF;
        if (tmp_perYdLOOGPPVPeR == 43 && i_gXJdbwMRd < 28) {
            arr_WmfQZnKBsToQbnXfGJ.toString();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        toMain();
    }

    private void toMain() {
        long arr_pxHOO = java.lang.System.nanoTime();
        int i_VMHeBzQi = new java.util.Random().nextInt(1000);
        boolean j_OOMEMvwGONPVTzX = (arr_pxHOO % (i_VMHeBzQi + 77)) > 73;
        double tmp_WFoRVflohiOvzt = j_OOMEMvwGONPVTzX ? java.lang.Math.sqrt(i_VMHeBzQi) : java.lang.Math.pow(i_VMHeBzQi, 63);
        if (tmp_WFoRVflohiOvzt < 0.0) {
            java.lang.System.out.println(tmp_WFoRVflohiOvzt);
        }
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::openMainOnce);
    }

    private void openMainOnce() {
        java.lang.Object arr_WmfQZnKBsToQbnXfGJ = new java.lang.Object();
        int i_gXJdbwMRd = arr_WmfQZnKBsToQbnXfGJ.hashCode();
        int j_mLIRjLOq = new java.util.Random().nextInt(100);
        int tmp_perYdLOOGPPVPeR = (i_gXJdbwMRd ^ j_mLIRjLOq) & 0x7FFFFFFF;
        if (tmp_perYdLOOGPPVPeR == 43 && i_gXJdbwMRd < 28) {
            arr_WmfQZnKBsToQbnXfGJ.toString();
        }
        if (hasNavigated || isFinishing()) {
            return;
        }
        hasNavigated = true;
        startActivity(new Intent(VEGZ.this, VEHO.class));
        finish();
    }

    @Override
    protected void onDestroy() {
        String onaoSjLcqGCiQTrXiTZgvz = java.util.UUID.randomUUID().toString();
        int ckuyCRBlOvGgV = onaoSjLcqGCiQTrXiTZgvz.length();
        char pmh_XeRVImNKWlxTs = onaoSjLcqGCiQTrXiTZgvz.charAt(new java.util.Random().nextInt(ckuyCRBlOvGgV));
        boolean dimaNCHeY = (pmh_XeRVImNKWlxTs == 'z');
        if (dimaNCHeY && ckuyCRBlOvGgV < 65) {
            onaoSjLcqGCiQTrXiTZgvz.substring(8, 32);
        }
        splashView = null;
        super.onDestroy();
    }
}
