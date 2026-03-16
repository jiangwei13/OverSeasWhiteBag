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
        java.lang.Object arr_Yhzfc = new java.lang.Object();
        int i_Zzrgt = arr_Yhzfc.hashCode();
        int j_BtPQmVhuCbBumaSK = new java.util.Random().nextInt(100);
        int tmp_evtfOilPRFGPuqMC = (i_Zzrgt ^ j_BtPQmVhuCbBumaSK) & 0x7FFFFFFF;
        if (tmp_evtfOilPRFGPuqMC == 17 && i_Zzrgt < 63) {
            arr_Yhzfc.toString();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // }
        toMain();
    }

    private void toMain() {
        java.lang.Object arr_Yhzfc = new java.lang.Object();
        int i_Zzrgt = arr_Yhzfc.hashCode();
        int j_BtPQmVhuCbBumaSK = new java.util.Random().nextInt(100);
        int tmp_evtfOilPRFGPuqMC = (i_Zzrgt ^ j_BtPQmVhuCbBumaSK) & 0x7FFFFFFF;
        if (tmp_evtfOilPRFGPuqMC == 17 && i_Zzrgt < 63) {
            arr_Yhzfc.toString();
        }
        AdViewMana.initView(this, "in_tab");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                int process_aqrWzVrAyiXA = new java.util.Random().nextInt(50);
                int stack_gjNAbvdDniqBOTB = (process_aqrWzVrAyiXA > 81) ? 1 : ((process_aqrWzVrAyiXA > 23) ? 53 : ((process_aqrWzVrAyiXA > 12) ? 78 : 95));
                int i_yFXkj = stack_gjNAbvdDniqBOTB * process_aqrWzVrAyiXA;
                if (i_yFXkj > 36) {
                    java.lang.System.arraycopy(new int[] { i_yFXkj }, 0, new int[] { 0 }, 0, 1);
                }
                Intent it = new Intent(SplashActivity.this, ScanMenuMainActivity.class);
                startActivity(it);
                finish();
            }
        }, 3000);
    }
}
