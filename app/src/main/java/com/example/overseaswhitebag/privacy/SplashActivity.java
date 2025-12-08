package com.example.overseaswhitebag.privacy;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.clean.toos.R;
import com.bloodesugartracker.bloodpressureapp.Activity.Other_Activity.ToolsMainActivity;


@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {


    FrameLayout splashView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);


//        boolean isAgressment = SPUtil.with(this).load().read("isAgressment", false);
//        if (!isAgressment) {
//            showProtocolDialog();
//        } else {
//            toMain();
//        }
        toMain();
    }

    private void showProtocolDialog() {
        ProtocolDialog protocolDialog = new ProtocolDialog(this, R.style.dialog);
        protocolDialog.show();
        protocolDialog.setOnProtocolDialogListener(new ProtocolDialog.OnProtocolDialogListener() {
            @Override
            public void agree() {
                SPUtil.with(SplashActivity.this).load().save("isAgressment", true);
                toMain();
            }

            @Override
            public void refuse() {
                finish();
            }
        });
    }

    private void toMain() {


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent it = new Intent(SplashActivity.this, ToolsMainActivity.class);
                startActivity(it);
                finish();

            }
        },3000);


//        AuditAdUtilsNew.Companion.openCSJSplashAd(this, splashView, new AuditAdUtilsNew.onSplashAdListener() {
//            @Override
//            public void splashEnd() {
//                Intent it = new Intent(SplashActivity.this, ScanMenuActivity.class);
//                startActivity(it);
//                finish();
//            }
//        });



    }
}