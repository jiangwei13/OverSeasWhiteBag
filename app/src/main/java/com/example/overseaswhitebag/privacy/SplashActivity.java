package com.example.overseaswhitebag.privacy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.toolsbox.business.health.Activity.Other_Activity.ToolsMainActivity;
import com.clean.toos.R;
import com.p.b.ad.runtime.AdPreloadHelper;
import com.p.b.ad.splash.FirstSplashAdFixTimeOut;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;
    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        FrameLayout splashView = findViewById(R.id.splashView);
        // 广告类型和开关由公共配置中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(
                this,
                splashView,
                SPLASH_WAIT_TIMEOUT_MS,
                this::toMain
        );
    }

    private void toMain() {
        // 超时、关闭和失败可能先后回调，每次启动只进入首页一次。
        if (hasEnteredMain || isFinishing() || isDestroyed()) {
            return;
        }
        hasEnteredMain = true;
        startActivity(new Intent(this, ToolsMainActivity.class));
        finish();
    }
}
