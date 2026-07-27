package com.deploy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.deploy.privacy.AppPrivacyPreferences;
import com.deploy.privacy.AppPrivacyProtocolDialog;
import com.p.b.ad.runtime.AdPreloadHelper;
import com.p.b.ad.splash.FirstSplashAdFixTimeOut;

import cn.hzw.doodledemo.ScanMenuActivity;


@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    private FrameLayout splashdrawView;
    private boolean hasNavigated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashdrawView = findViewById(R.id.splashdrawView);


//        boolean isAgressment = AppPrivacyPreferences.with(this).load().read("isAgressment", false);
//        if (!isAgressment) {
//            showProtocolDialog();
//        } else {
//            toMain();
//        }
        toDrawMain();
    }

    private void showProtocolDialog() {
        AppPrivacyProtocolDialog protocolDialog = new AppPrivacyProtocolDialog(this, R.style.dialog);
        protocolDialog.show();
        protocolDialog.setOnProtocolDialogListener(new AppPrivacyProtocolDialog.OnProtocolDialogListener() {
            @Override
            public void agree() {
                AppPrivacyPreferences.with(SplashActivity.this).load().save("isAgressment", true);
                toDrawMain();
            }

            @Override
            public void refuse() {
                finish();
            }
        });
    }

    private void toDrawMain() {
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(
                this,
                splashdrawView,
                SPLASH_WAIT_TIMEOUT_MS,
                this::openMainOnce
        );
    }

    /**
     * 广告结束和超时可能同时回调，统一在这里防止重复进入主页。
     */
    private void openMainOnce() {
        if (hasNavigated || isFinishing()) {
            return;
        }
        hasNavigated = true;
        Intent intent = new Intent(this, ScanMenuActivity.class);
        startActivity(intent);
        finish();
    }
}
