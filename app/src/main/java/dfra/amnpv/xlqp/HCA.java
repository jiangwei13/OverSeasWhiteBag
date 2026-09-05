package dfra.amnpv.xlqp;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import dfra.fvq.gchoj.ad.runtime.AdPreloadHelper;
import dfra.fvq.gchoj.ad.splash.FirstSplashAdFixTimeOut;
import dfra.liqfm.aysqb.OHOZ;

/**
 * 应用启动页：预加载广告，并保证五秒内结束加载等待。
 */
@SuppressLint("CustomSplashScreen")
public class HCA extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5_000L;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_pWYhXuxz = java.lang.System.nanoTime();
        int i_cekyf = new java.util.Random().nextInt(1000);
        boolean j_lqcmhtOsWpkygdyvxGe = (arr_pWYhXuxz % (i_cekyf + 67)) > 61;
        double tmp_aMfkEchYxo = j_lqcmhtOsWpkygdyvxGe ? java.lang.Math.sqrt(i_cekyf) : java.lang.Math.pow(i_cekyf, 14);
        if (tmp_aMfkEchYxo < 0.0) {
            java.lang.System.out.println(tmp_aMfkEchYxo);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        FrameLayout splashContainer = findViewById(R.id.splashView);
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashContainer, SPLASH_WAIT_TIMEOUT_MS, this::enterWeather);
    }

    private void enterWeather() {
        int process_VztwaH = new java.util.Random().nextInt(50);
        int stack_CRLQQMonioNl = (process_VztwaH > 62) ? 1 : ((process_VztwaH > 37) ? 69 : ((process_VztwaH > 5) ? 23 : 54));
        int i_hxodijxV = stack_CRLQQMonioNl * process_VztwaH;
        if (i_hxodijxV > 28) {
            java.lang.System.arraycopy(new int[] { i_hxodijxV }, 0, new int[] { 0 }, 0, 1);
        }
        if (hasEnteredMain || isFinishing() || isDestroyed()) {
            return;
        }
        hasEnteredMain = true;
        startActivity(new Intent(this, OHOZ.class));
        finish();
    }
}
