package com.example.overseaswhitebag.privacy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.clean.toos.R;
import com.p.b.ad.AdViewMana;
import com.xian.bc.accounts.ui.ScanMenuMainActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {
    private static final String AGREEMENT_KEY = "isAgreement";
    private static final long SPLASH_DELAY_MS = 3000L;

    private final Handler handler = new Handler();
    private FrameLayout splashView;

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
        AdViewMana.initView(this, "in_tab");
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, ScanMenuMainActivity.class));
                finish();
            }
        }, SPLASH_DELAY_MS);
    }

    @Override
    protected void onDestroy() {
        handler.removeCallbacksAndMessages(null);
        splashView = null;
        super.onDestroy();
    }
}
