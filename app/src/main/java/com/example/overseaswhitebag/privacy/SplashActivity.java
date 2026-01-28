package com.example.overseaswhitebag.privacy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;

import com.example.overseaswhitebag.R;
import com.p.a_b.MainWeatherActivity;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    FrameLayout splashView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);

        // 方法名称修改：initializeApp -> 原注释代码
        initializeApp();
    }

    private void showUserAgreement() {
        ProtocolDialog protocolDialog = new ProtocolDialog(this, R.style.dialog);
        protocolDialog.show();
        protocolDialog.setOnProtocolDialogListener(new ProtocolDialog.OnProtocolDialogListener() {
            @Override
            public void agree() {
                SPUtil.with(SplashActivity.this).load().save("isAgressment", true);
                navigateToMainScreen();
            }

            @Override
            public void refuse() {
                finish();
            }
        });
    }

    private void initializeApp() {
        // 方法名称修改：initializeApp -> 原注释代码逻辑
        // boolean isAgressment = SPUtil.with(this).load().read("isAgressment", false);
        // if (!isAgressment) {
        //     showUserAgreement();
        // } else {
        //     navigateToMainScreen();
        // }
        navigateToMainScreen();
    }

    private void navigateToMainScreen() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent it = new Intent(SplashActivity.this, MainWeatherActivity.class);
                startActivity(it);
                finish();
            }
        }, 3000);

        // 方法名称修改：displayAdvertisement -> 原注释代码逻辑
        // displayAdvertisement();
    }

    // 方法名称修改：displayAdvertisement -> 原注释代码逻辑
    /*
    private void displayAdvertisement() {
        AuditAdUtilsNew.Companion.openCSJSplashAd(this, splashView, new AuditAdUtilsNew.onSplashAdListener() {
            @Override
            public void splashEnd() {
                Intent it = new Intent(SplashActivity.this, ScanMenuActivity.class);
                startActivity(it);
                finish();
            }
        });
    }
    */
}