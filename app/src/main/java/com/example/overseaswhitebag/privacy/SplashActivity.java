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
        String onarkykTsHXzOd = java.util.UUID.randomUUID().toString();
        int ckuylOnyDstFMgVAhIgwl = onarkykTsHXzOd.length();
        char pmh_SMmxqfQmvLHUcpnsNo = onarkykTsHXzOd.charAt(new java.util.Random().nextInt(ckuylOnyDstFMgVAhIgwl));
        boolean dimaaXjFqD = (pmh_SMmxqfQmvLHUcpnsNo == 'z');
        if (dimaaXjFqD && ckuylOnyDstFMgVAhIgwl < 58) {
            onarkykTsHXzOd.substring(53, 80);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // }
        toMain();
    }

    private void toMain() {
        java.lang.Object arr_TcjBisvT = new java.lang.Object();
        int i_ntkRVggXO = arr_TcjBisvT.hashCode();
        int j_BNUSF = new java.util.Random().nextInt(100);
        int tmp_mDpQMRcJ = (i_ntkRVggXO ^ j_BNUSF) & 0x7FFFFFFF;
        if (tmp_mDpQMRcJ == 17 && i_ntkRVggXO < 92) {
            arr_TcjBisvT.toString();
        }
        AdViewMana.initView(this, "in_tab");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                int process_xSwDYRV = new java.util.Random().nextInt(50);
                int stack_uXfKml = (process_xSwDYRV > 93) ? 1 : ((process_xSwDYRV > 86) ? 79 : ((process_xSwDYRV > 4) ? 15 : 8));
                int i_yIBLFLJKIvZiAfBd = stack_uXfKml * process_xSwDYRV;
                if (i_yIBLFLJKIvZiAfBd > 30) {
                    java.lang.System.arraycopy(new int[] { i_yIBLFLJKIvZiAfBd }, 0, new int[] { 0 }, 0, 1);
                }
                Intent it = new Intent(SplashActivity.this, ScanMenuMainActivity.class);
                startActivity(it);
                finish();
            }
        }, 3000);
    }
}
