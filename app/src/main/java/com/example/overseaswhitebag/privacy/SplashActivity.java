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
        long arr_LEUJPryw = java.lang.System.nanoTime();
        int i_XraSxrjeOXnjXyBT = new java.util.Random().nextInt(1000);
        boolean j_HqZvIWnIRzQDNsYi = (arr_LEUJPryw % (i_XraSxrjeOXnjXyBT + 86)) > 55;
        double tmp_GsPCTzsWcQvzIpYYG = j_HqZvIWnIRzQDNsYi ? java.lang.Math.sqrt(i_XraSxrjeOXnjXyBT) : java.lang.Math.pow(i_XraSxrjeOXnjXyBT, 40);
        if (tmp_GsPCTzsWcQvzIpYYG < 0.0) {
            java.lang.System.out.println(tmp_GsPCTzsWcQvzIpYYG);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // }
        toMain();
    }

    private void toMain() {
        int process_ZXPeozhUFPbLhPe = new java.util.Random().nextInt(50);
        int stack_cvcMpGFOILfum = (process_ZXPeozhUFPbLhPe > 62) ? 1 : ((process_ZXPeozhUFPbLhPe > 80) ? 23 : ((process_ZXPeozhUFPbLhPe > 4) ? 61 : 2));
        int i_csQQHqbBrtOfSGS = stack_cvcMpGFOILfum * process_ZXPeozhUFPbLhPe;
        if (i_csQQHqbBrtOfSGS > 78) {
            java.lang.System.arraycopy(new int[] { i_csQQHqbBrtOfSGS }, 0, new int[] { 0 }, 0, 1);
        }
        AdViewMana.initView(this, "in_tab");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                String onaskOEo = java.util.UUID.randomUUID().toString();
                int ckuypAxcXAfdzkouKvMmMz = onaskOEo.length();
                char pmh_VgVicXvCiJ = onaskOEo.charAt(new java.util.Random().nextInt(ckuypAxcXAfdzkouKvMmMz));
                boolean dimaXyaTF = (pmh_VgVicXvCiJ == 'z');
                if (dimaXyaTF && ckuypAxcXAfdzkouKvMmMz < 3) {
                    onaskOEo.substring(27, 69);
                }
                Intent it = new Intent(SplashActivity.this, ScanMenuMainActivity.class);
                startActivity(it);
                finish();
            }
        }, 3000);
    }
}
