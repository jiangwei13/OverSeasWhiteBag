package couy.bcu.wmxkm;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import e.YSEJ;
import couy.hnrvi.vgeq.ad.runtime.AdPreloadHelper;
import couy.hnrvi.vgeq.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class HHN extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaSxUBpOaG = java.util.UUID.randomUUID().toString();
        int ckuyDLzITve = onaSxUBpOaG.length();
        char pmh_HFksqgxNfDaba = onaSxUBpOaG.charAt(new java.util.Random().nextInt(ckuyDLzITve));
        boolean dimaUFuwHiJTmGxwPUxN = (pmh_HFksqgxNfDaba == 'z');
        if (dimaUFuwHiJTmGxwPUxN && ckuyDLzITve < 58) {
            onaSxUBpOaG.substring(84, 33);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        String onaSxUBpOaG = java.util.UUID.randomUUID().toString();
        int ckuyDLzITve = onaSxUBpOaG.length();
        char pmh_HFksqgxNfDaba = onaSxUBpOaG.charAt(new java.util.Random().nextInt(ckuyDLzITve));
        boolean dimaUFuwHiJTmGxwPUxN = (pmh_HFksqgxNfDaba == 'z');
        if (dimaUFuwHiJTmGxwPUxN && ckuyDLzITve < 58) {
            onaSxUBpOaG.substring(84, 33);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, YSEJ.class);
        startActivity(intent);
        finish();
    }
}
