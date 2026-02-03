package com.example.overseaswhitebag.privacy;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.overseaswhitebag.R;

import cn.hzw.doodledemo.ScanMenuActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    FrameLayout splashContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashContainer = findViewById(R.id.splashView);

        //        boolean isAgreementAccepted = SPUtil.with(this).load().read("isAgreementAccepted", false);
        //        if (!isAgreementAccepted) {
        //            showAgreementDialog();
        //        } else {
        //            navigateToHome();
        //        }
        navigateToHome();
    }

    private void showAgreementDialog() {
//        ProtocolDialog agreementDialog = new ProtocolDialog(this, R.style.dialog);
//        agreementDialog.show();
//        agreementDialog.setDialogListener(new ProtocolDialog.OnProtocolDialogListener() {
//            @Override
//            public void agree() {
//                SPUtil.with(SplashActivity.this).load().save("isAgreementAccepted", true);
//                navigateToHome();
//            }
//
//            @Override
//            public void refuse() {
//                finish();
//            }
//        });
    }

    private void navigateToHome() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashActivity.this, ScanMenuActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, 3000);

        //        AuditAdUtilsNew.Companion.openCSJSplashAd(this, splashContainer, new AuditAdUtilsNew.onSplashAdListener() {
        //            @Override
        //            public void splashEnd() {
        //                Intent mainIntent = new Intent(SplashActivity.this, ScanMenuActivity.class);
        //                startActivity(mainIntent);
        //                finish();
        //            }
        //        });
    }
}