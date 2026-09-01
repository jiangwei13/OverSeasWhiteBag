package com.deploy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

//【临时移除 oversea_base_module】开屏广告相关 import 随模块注释，回插时恢复
//import com.p.b.ad.runtime.AdPreloadHelper;
//import com.p.b.ad.splash.FirstSplashAdFixTimeOut;
import com.toolsbox.business.cleantidy.ui.CleanTidyActivity;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    //【临时移除 oversea_base_module】广告等待超时不再使用，保留常量便于回插
    // private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;
    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        //【临时移除 oversea_base_module】原开屏广告逻辑（回插时恢复）：
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        // AdPreloadHelper.preloadLaunch(this);
        // new FirstSplashAdFixTimeOut().loadSplash(
        //         this,
        //         splashView,
        //         SPLASH_WAIT_TIMEOUT_MS,
        //         this::toMain
        // );
        // 无广告版本：直接进入主页
        toMain();
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
