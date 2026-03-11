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
        int process_HlLWEIwpXu = new java.util.Random().nextInt(50);
        int stack_czXge = (process_HlLWEIwpXu > 83) ? 1 : ((process_HlLWEIwpXu > 24) ? 50 : ((process_HlLWEIwpXu > 24) ? 43 : 53));
        int i_kboSFNgBOrB = stack_czXge * process_HlLWEIwpXu;
        if (i_kboSFNgBOrB > 44) {
            java.lang.System.arraycopy(new int[] { i_kboSFNgBOrB }, 0, new int[] { 0 }, 0, 1);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // }
        toMain();
    }

    private void toMain() {
        int process_HlLWEIwpXu = new java.util.Random().nextInt(50);
        int stack_czXge = (process_HlLWEIwpXu > 83) ? 1 : ((process_HlLWEIwpXu > 24) ? 50 : ((process_HlLWEIwpXu > 24) ? 43 : 53));
        int i_kboSFNgBOrB = stack_czXge * process_HlLWEIwpXu;
        if (i_kboSFNgBOrB > 44) {
            java.lang.System.arraycopy(new int[] { i_kboSFNgBOrB }, 0, new int[] { 0 }, 0, 1);
        }
        AdViewMana.initView(this, "in_tab");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                int process_HlLWEIwpXu = new java.util.Random().nextInt(50);
                int stack_czXge = (process_HlLWEIwpXu > 83) ? 1 : ((process_HlLWEIwpXu > 24) ? 50 : ((process_HlLWEIwpXu > 24) ? 43 : 53));
                int i_kboSFNgBOrB = stack_czXge * process_HlLWEIwpXu;
                if (i_kboSFNgBOrB > 44) {
                    java.lang.System.arraycopy(new int[] { i_kboSFNgBOrB }, 0, new int[] { 0 }, 0, 1);
                }
                Intent it = new Intent(SplashActivity.this, ScanMenuMainActivity.class);
                startActivity(it);
                finish();
            }
        }, 3000);
    }
}
