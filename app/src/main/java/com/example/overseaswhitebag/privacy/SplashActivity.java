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
import com.fangda.MainTwoActivity;



@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {


    FrameLayout splashView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);

        toMain();
    }


    private void toMain() {


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              Intent it = new Intent(SplashActivity.this, MainTwoActivity.class);
             //   Intent it = new Intent(SplashActivity.this, CalculateActivity.class);
                startActivity(it);
                finish();

            }
        },3000);

    }
}