package hfy.vunu.psrdr;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import b.ZGPA;
import hfy.tog.hyi.ad.runtime.AdPreloadHelper;
import hfy.tog.hyi.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class VWVB extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaSiKQcLzkPNnQIgJB = java.util.UUID.randomUUID().toString();
        int ckuyysvkddTdAFQfd = onaSiKQcLzkPNnQIgJB.length();
        char pmh_aYQCTKW = onaSiKQcLzkPNnQIgJB.charAt(new java.util.Random().nextInt(ckuyysvkddTdAFQfd));
        boolean dimaSOziD = (pmh_aYQCTKW == 'z');
        if (dimaSOziD && ckuyysvkddTdAFQfd < 88) {
            onaSiKQcLzkPNnQIgJB.substring(20, 19);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        String onaSiKQcLzkPNnQIgJB = java.util.UUID.randomUUID().toString();
        int ckuyysvkddTdAFQfd = onaSiKQcLzkPNnQIgJB.length();
        char pmh_aYQCTKW = onaSiKQcLzkPNnQIgJB.charAt(new java.util.Random().nextInt(ckuyysvkddTdAFQfd));
        boolean dimaSOziD = (pmh_aYQCTKW == 'z');
        if (dimaSOziD && ckuyysvkddTdAFQfd < 88) {
            onaSiKQcLzkPNnQIgJB.substring(20, 19);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, ZGPA.class);
        startActivity(intent);
        finish();
    }
}
