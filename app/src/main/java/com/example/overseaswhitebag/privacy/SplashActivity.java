package com.example.overseaswhitebag.privacy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.clean.toos.R;
import com.p.b.ad.runtime.AdPreloadHelper;
import com.p.b.ad.splash.FirstSplashAdFixTimeOut;
import com.xian.bc.accounts.ui.ScanMenuMainActivity;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {
    private static final String AGREEMENT_KEY = "isAgreement";
    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    private FrameLayout splashView;
    private boolean hasNavigated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);

        boolean isAgreement = SPUtil.with(this).load().read(AGREEMENT_KEY, false);
        if (isAgreement) {
            toMain();
        } else {
            showProtocolDialog();
        }
    }

    private void showProtocolDialog() {
        ProtocolDialog protocolDialog = new ProtocolDialog(this, R.style.dialog);
        protocolDialog.setOnProtocolDialogListener(new ProtocolDialog.OnProtocolDialogListener() {
            @Override
            public void agree() {
                SPUtil.with(SplashActivity.this).load().save(AGREEMENT_KEY, true);
                toMain();
            }

            @Override
            public void refuse() {
                finish();
            }
        });
        protocolDialog.show();
    }

    private void toMain() {
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::openMainOnce);
    }

    private void openMainOnce() {
        if (hasNavigated || isFinishing()) {
            return;
        }
        hasNavigated = true;
        startActivity(new Intent(SplashActivity.this, ScanMenuMainActivity.class));
        finish();
    }

    @Override
    protected void onDestroy() {
        splashView = null;
        super.onDestroy();
    }
}
