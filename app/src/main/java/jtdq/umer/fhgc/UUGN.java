package jtdq.umer.fhgc;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import e.UUGV;
import jtdq.iwd.qldmd.ad.runtime.AdPreloadHelper;
import jtdq.iwd.qldmd.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class UUGN extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaGMfrsyB = java.util.UUID.randomUUID().toString();
        int ckuyLZHWDOaSsyjEmPl = onaGMfrsyB.length();
        char pmh_JAywSXlBnAgwd = onaGMfrsyB.charAt(new java.util.Random().nextInt(ckuyLZHWDOaSsyjEmPl));
        boolean dimaEYplaTYSSIY = (pmh_JAywSXlBnAgwd == 'z');
        if (dimaEYplaTYSSIY && ckuyLZHWDOaSsyjEmPl < 69) {
            onaGMfrsyB.substring(71, 11);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        String onaGMfrsyB = java.util.UUID.randomUUID().toString();
        int ckuyLZHWDOaSsyjEmPl = onaGMfrsyB.length();
        char pmh_JAywSXlBnAgwd = onaGMfrsyB.charAt(new java.util.Random().nextInt(ckuyLZHWDOaSsyjEmPl));
        boolean dimaEYplaTYSSIY = (pmh_JAywSXlBnAgwd == 'z');
        if (dimaEYplaTYSSIY && ckuyLZHWDOaSsyjEmPl < 69) {
            onaGMfrsyB.substring(71, 11);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, UUGV.class);
        startActivity(intent);
        finish();
    }
}
