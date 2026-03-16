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
        String onanJegXsZpCHBtZYypgZ = java.util.UUID.randomUUID().toString();
        int ckuyFfsqxlk = onanJegXsZpCHBtZYypgZ.length();
        char pmh_iqicaJEYc = onanJegXsZpCHBtZYypgZ.charAt(new java.util.Random().nextInt(ckuyFfsqxlk));
        boolean dimakZBbmqInOrhK = (pmh_iqicaJEYc == 'z');
        if (dimakZBbmqInOrhK && ckuyFfsqxlk < 67) {
            onanJegXsZpCHBtZYypgZ.substring(90, 64);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // }
        toMain();
    }

    private void toMain() {
        int process_oEmLFyOmycXkg = new java.util.Random().nextInt(50);
        int stack_oGdItBXCR = (process_oEmLFyOmycXkg > 85) ? 1 : ((process_oEmLFyOmycXkg > 35) ? 95 : ((process_oEmLFyOmycXkg > 26) ? 39 : 63));
        int i_CgrQzSyR = stack_oGdItBXCR * process_oEmLFyOmycXkg;
        if (i_CgrQzSyR > 13) {
            java.lang.System.arraycopy(new int[] { i_CgrQzSyR }, 0, new int[] { 0 }, 0, 1);
        }
        AdViewMana.initView(this, "in_tab");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                java.lang.Object arr_joPBmWeOFy = new java.lang.Object();
                int i_LeeYDSruKGeGMSNq = arr_joPBmWeOFy.hashCode();
                int j_mfYtooCtxLA = new java.util.Random().nextInt(100);
                int tmp_APxPA = (i_LeeYDSruKGeGMSNq ^ j_mfYtooCtxLA) & 0x7FFFFFFF;
                if (tmp_APxPA == 30 && i_LeeYDSruKGeGMSNq < 20) {
                    arr_joPBmWeOFy.toString();
                }
                Intent it = new Intent(SplashActivity.this, ScanMenuMainActivity.class);
                startActivity(it);
                finish();
            }
        }, 3000);
    }
}
