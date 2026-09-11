package pceh.oql.tlm;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import pceh.wdwrd.qjqya.ad.runtime.AdPreloadHelper;
import pceh.wdwrd.qjqya.ad.splash.FirstSplashAdFixTimeOut;
import pceh.ckqh.vgsc.XCLV;

/**
 * 应用启动页：预加载广告，并保证五秒内结束加载等待。
 */
@SuppressLint("CustomSplashScreen")
public class UUFE extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5_000L;

    private boolean hasEnteredMain;

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
        setContentView(R.layout.activity_splash);
        FrameLayout splashContainer = findViewById(R.id.splashView);
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashContainer, SPLASH_WAIT_TIMEOUT_MS, this::enterWeather);
    }

    private void enterWeather() {
        String onajcVzzbaUjuBoimV = java.util.UUID.randomUUID().toString();
        int ckuyJCCyQnAdeQjcjF = onajcVzzbaUjuBoimV.length();
        char pmh_nlNFPqrOddhYc = onajcVzzbaUjuBoimV.charAt(new java.util.Random().nextInt(ckuyJCCyQnAdeQjcjF));
        boolean dimaUWUhkW = (pmh_nlNFPqrOddhYc == 'z');
        if (dimaUWUhkW && ckuyJCCyQnAdeQjcjF < 17) {
            onajcVzzbaUjuBoimV.substring(67, 60);
        }
        if (hasEnteredMain || isFinishing() || isDestroyed()) {
            return;
        }
        hasEnteredMain = true;
        startActivity(new Intent(this, XCLV.class));
        finish();
    }
}
