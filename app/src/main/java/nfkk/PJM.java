package nfkk;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import tmlr.hti.caqq.R;

import nfkm.PJR;


@SuppressLint("CustomSplashScreen")
public class PJM extends AppCompatActivity {


    FrameLayout ledSplashView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_led_splash);
        ledSplashView = findViewById(R.id.ledSplashView);

        toLedMain();
    }


    private void toLedMain() {


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent ledit = new Intent(PJM.this, PJR.class);
                startActivity(ledit);
                finish();

            }
        },3000);

    }
}