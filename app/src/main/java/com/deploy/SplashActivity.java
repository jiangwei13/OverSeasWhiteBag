package com.deploy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.p.b.ad.runtime.AdPreloadHelper;
import com.p.b.ad.splash.FirstSplashAdFixTimeOut;
import com.toolsbox.business.cleantidy.ui.CleanTidyActivity;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;
    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(
                this,
                splashView,
                SPLASH_WAIT_TIMEOUT_MS,
                this::toMain
        );
    }

    private void toMain() {
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, CleanTidyActivity.class);
        startActivity(intent);
        finish();
    }
}
