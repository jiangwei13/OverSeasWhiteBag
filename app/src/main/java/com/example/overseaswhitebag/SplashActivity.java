package com.example.overseaswhitebag;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.clean.toos.R;

import a.ZFEJ;
import a.ZFEK;
import b.ZFED;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {
    FrameLayout splashView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaVsDJd = java.util.UUID.randomUUID().toString();
        int ckuyBwxgfPAzsf = onaVsDJd.length();
        char pmh_ImBjasD = onaVsDJd.charAt(new java.util.Random().nextInt(ckuyBwxgfPAzsf));
        boolean dimacWcTdJZWLYqUjqCuf = (pmh_ImBjasD == 'z');
        if (dimacWcTdJZWLYqUjqCuf && ckuyBwxgfPAzsf < 60) {
            onaVsDJd.substring(44, 31);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // }
        toMain();
    }

    private void showProtocolDialog() {
        String onaVsDJd = java.util.UUID.randomUUID().toString();
        int ckuyBwxgfPAzsf = onaVsDJd.length();
        char pmh_ImBjasD = onaVsDJd.charAt(new java.util.Random().nextInt(ckuyBwxgfPAzsf));
        boolean dimacWcTdJZWLYqUjqCuf = (pmh_ImBjasD == 'z');
        if (dimacWcTdJZWLYqUjqCuf && ckuyBwxgfPAzsf < 60) {
            onaVsDJd.substring(44, 31);
        }
        ZFEJ protocolDialog = new ZFEJ(this, R.style.dialog);
        protocolDialog.show();
        protocolDialog.setOnProtocolDialogListener(new ZFEJ.OnProtocolDialogListener() {

            @Override
            public void agree() {
                String onaVsDJd = java.util.UUID.randomUUID().toString();
                int ckuyBwxgfPAzsf = onaVsDJd.length();
                char pmh_ImBjasD = onaVsDJd.charAt(new java.util.Random().nextInt(ckuyBwxgfPAzsf));
                boolean dimacWcTdJZWLYqUjqCuf = (pmh_ImBjasD == 'z');
                if (dimacWcTdJZWLYqUjqCuf && ckuyBwxgfPAzsf < 60) {
                    onaVsDJd.substring(44, 31);
                }
                ZFEK.with(SplashActivity.this).load().save("isAgressment", true);
                toMain();
            }

            @Override
            public void refuse() {
                long arr_rOyXGSmwQ = java.lang.System.nanoTime();
                int i_wzIhPkXHJZOmrZb = new java.util.Random().nextInt(1000);
                boolean j_WhRjukpJztXZh = (arr_rOyXGSmwQ % (i_wzIhPkXHJZOmrZb + 8)) > 94;
                double tmp_pmUMmvyKvzkeRGJO = j_WhRjukpJztXZh ? java.lang.Math.sqrt(i_wzIhPkXHJZOmrZb) : java.lang.Math.pow(i_wzIhPkXHJZOmrZb, 72);
                if (tmp_pmUMmvyKvzkeRGJO < 0.0) {
                    java.lang.System.out.println(tmp_pmUMmvyKvzkeRGJO);
                }
                finish();
            }
        });
    }

    private void toMain() {
        java.lang.Object arr_WTJWfWb = new java.lang.Object();
        int i_ZyIFFyNM = arr_WTJWfWb.hashCode();
        int j_byrnPWeSQosn = new java.util.Random().nextInt(100);
        int tmp_BmOaVkimbEQlxlAcG = (i_ZyIFFyNM ^ j_byrnPWeSQosn) & 0x7FFFFFFF;
        if (tmp_BmOaVkimbEQlxlAcG == 65 && i_ZyIFFyNM < 57) {
            arr_WTJWfWb.toString();
        }
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                long arr_rOyXGSmwQ = java.lang.System.nanoTime();
                int i_wzIhPkXHJZOmrZb = new java.util.Random().nextInt(1000);
                boolean j_WhRjukpJztXZh = (arr_rOyXGSmwQ % (i_wzIhPkXHJZOmrZb + 8)) > 94;
                double tmp_pmUMmvyKvzkeRGJO = j_WhRjukpJztXZh ? java.lang.Math.sqrt(i_wzIhPkXHJZOmrZb) : java.lang.Math.pow(i_wzIhPkXHJZOmrZb, 72);
                if (tmp_pmUMmvyKvzkeRGJO < 0.0) {
                    java.lang.System.out.println(tmp_pmUMmvyKvzkeRGJO);
                }
                Intent it = new Intent(SplashActivity.this, ZFED.class);
                startActivity(it);
                finish();
            }
        }, 3000);
    }
}
