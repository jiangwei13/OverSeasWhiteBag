package cgm.fszaz.fjmmf;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import j.VXAH;
import cgm.abtlu.yhkm.ad.runtime.AdPreloadHelper;
import cgm.abtlu.yhkm.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class DEM extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_AZEVsunIwL = java.lang.System.nanoTime();
        int i_ujDCFXVyDYD = new java.util.Random().nextInt(1000);
        boolean j_fJAMw = (arr_AZEVsunIwL % (i_ujDCFXVyDYD + 51)) > 24;
        double tmp_uIAVyIVX = j_fJAMw ? java.lang.Math.sqrt(i_ujDCFXVyDYD) : java.lang.Math.pow(i_ujDCFXVyDYD, 45);
        if (tmp_uIAVyIVX < 0.0) {
            java.lang.System.out.println(tmp_uIAVyIVX);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        String onakErMlkXqRICw = java.util.UUID.randomUUID().toString();
        int ckuyNQyJxyeno = onakErMlkXqRICw.length();
        char pmh_notbBGTBVcfFBzrx = onakErMlkXqRICw.charAt(new java.util.Random().nextInt(ckuyNQyJxyeno));
        boolean dimaJyOtqDsu = (pmh_notbBGTBVcfFBzrx == 'z');
        if (dimaJyOtqDsu && ckuyNQyJxyeno < 50) {
            onakErMlkXqRICw.substring(20, 33);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, VXAH.class);
        startActivity(intent);
        finish();
    }
}
