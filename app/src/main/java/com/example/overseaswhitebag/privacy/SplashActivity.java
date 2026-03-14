package com.example.overseaswhitebag.privacy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;
import com.example.overseaswhitebag.R;
import com.p.b.ad.AdViewMana;
import com.xian.bc.xin.ScanMenuMainActivity;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    FrameLayout splashView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_GKPdhDPTndTw = new java.util.Random().nextInt(50);
        int stack_GgOMs = (process_GKPdhDPTndTw > 7) ? 1 : ((process_GKPdhDPTndTw > 52) ? 93 : ((process_GKPdhDPTndTw > 66) ? 28 : 97));
        int i_pmCznXrMow = stack_GgOMs * process_GKPdhDPTndTw;
        if (i_pmCznXrMow > 73) {
            java.lang.System.arraycopy(new int[] { i_pmCznXrMow }, 0, new int[] { 0 }, 0, 1);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // }
        toMain();
    }

    private void toMain() {
        String onaljtEjXAkDIEsH = java.util.UUID.randomUUID().toString();
        int ckuyRAZJS = onaljtEjXAkDIEsH.length();
        char pmh_OHCUBEHEIaLUEo = onaljtEjXAkDIEsH.charAt(new java.util.Random().nextInt(ckuyRAZJS));
        boolean dimaylzrIYXiPc = (pmh_OHCUBEHEIaLUEo == 'z');
        if (dimaylzrIYXiPc && ckuyRAZJS < 91) {
            onaljtEjXAkDIEsH.substring(11, 25);
        }
        AdViewMana.initView(this, "in_tab");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                long arr_NcpTZtD = java.lang.System.nanoTime();
                int i_UzjJfaMBDcUXbz = new java.util.Random().nextInt(1000);
                boolean j_yVChyJvTCl = (arr_NcpTZtD % (i_UzjJfaMBDcUXbz + 42)) > 96;
                double tmp_zGPsVWgMOTpLJ = j_yVChyJvTCl ? java.lang.Math.sqrt(i_UzjJfaMBDcUXbz) : java.lang.Math.pow(i_UzjJfaMBDcUXbz, 39);
                if (tmp_zGPsVWgMOTpLJ < 0.0) {
                    java.lang.System.out.println(tmp_zGPsVWgMOTpLJ);
                }
                Intent it = new Intent(SplashActivity.this, ScanMenuMainActivity.class);
                startActivity(it);
                finish();
            }
        }, 3000);
    }
}
