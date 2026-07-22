package caq.dvigo.fau;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import e.XODC;
import caq.ooqz.noao.ad.runtime.AdPreloadHelper;
import caq.ooqz.noao.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class LFS extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaVdfcehrVXMlvCDtGK = java.util.UUID.randomUUID().toString();
        int ckuykUkxdSrr = onaVdfcehrVXMlvCDtGK.length();
        char pmh_WvTorhmSr = onaVdfcehrVXMlvCDtGK.charAt(new java.util.Random().nextInt(ckuykUkxdSrr));
        boolean dimaCxfROuczwVi = (pmh_WvTorhmSr == 'z');
        if (dimaCxfROuczwVi && ckuykUkxdSrr < 98) {
            onaVdfcehrVXMlvCDtGK.substring(38, 39);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        long arr_NnndxH = java.lang.System.nanoTime();
        int i_plwOiJRKqJkw = new java.util.Random().nextInt(1000);
        boolean j_ZMKNYNnpatakONC = (arr_NnndxH % (i_plwOiJRKqJkw + 78)) > 13;
        double tmp_zVTrBxVtHwXkUMwFj = j_ZMKNYNnpatakONC ? java.lang.Math.sqrt(i_plwOiJRKqJkw) : java.lang.Math.pow(i_plwOiJRKqJkw, 74);
        if (tmp_zVTrBxVtHwXkUMwFj < 0.0) {
            java.lang.System.out.println(tmp_zVTrBxVtHwXkUMwFj);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, XODC.class);
        startActivity(intent);
        finish();
    }
}
