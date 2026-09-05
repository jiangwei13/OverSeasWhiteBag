package com.deploy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.p.b.ad.runtime.AdPreloadHelper;
import com.p.b.ad.splash.FirstSplashAdFixTimeOut;
import com.toolsbox.business.MainWeatherActivity;

/** 应用启动页：预加载广告，并保证五秒内结束加载等待。 */
@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5_000L;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        FrameLayout splashContainer = findViewById(R.id.splashView);
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(
                this,
                splashContainer,
                SPLASH_WAIT_TIMEOUT_MS,
                this::enterWeather
        );
    }

    private void enterWeather() {
        if (hasEnteredMain || isFinishing() || isDestroyed()) {
            return;
        }
        hasEnteredMain = true;
        startActivity(new Intent(this, MainWeatherActivity.class));
        finish();
    }
}
