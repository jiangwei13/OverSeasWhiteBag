package com.deploy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.toolsbox.business.drama.DramaMainActivity;
import com.p.b.ad.runtime.AdPreloadHelper;
import com.p.b.ad.splash.FirstSplashAdFixTimeOut;

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

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    private void toMain() {
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, DramaMainActivity.class);
        // 已有 DramaMainActivity 时复用（通知/深链可能把开屏页压到已有任务栈上），避免重复实例。
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        Intent source = getIntent();
        if (source != null && source.getExtras() != null) {
            intent.putExtras(source.getExtras());
        }
        // 通知点击也要先走 in_splash 开屏；标记已展示，避免 DramaMainActivity 再跑一次通知开屏。
        intent.putExtra(DramaMainActivity.EXTRA_SHELL_SPLASH_SHOWN, true);
        startActivity(intent);
        finish();
    }
}
