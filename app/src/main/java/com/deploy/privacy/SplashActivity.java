package com.deploy.privacy;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.deploy.R;
import com.p.b.ad.AdViewMana;

import cn.hzw.doodledemo.ScanMenuActivity;


@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {


    FrameLayout splashdrawView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashdrawView = findViewById(R.id.splashdrawView);


//        boolean isAgressment = SPUtil.with(this).load().read("isAgressment", false);
//        if (!isAgressment) {
//            showProtocolDialog();
//        } else {
//            toMain();
//        }
        toDrawMain();
    }

    private void showProtocolDialog() {
        ProtocolDialog protocolDialog = new ProtocolDialog(this, R.style.dialog);
        protocolDialog.show();
        protocolDialog.setOnProtocolDialogListener(new ProtocolDialog.OnProtocolDialogListener() {
            @Override
            public void agree() {
                SPUtil.with(SplashActivity.this).load().save("isAgressment", true);
                toDrawMain();
            }

            @Override
            public void refuse() {
                finish();
            }
        });
    }

    private void toDrawMain() {
        AdViewMana.initView(this, "in_tab");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent it = new Intent(SplashActivity.this, ScanMenuActivity.class);
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
