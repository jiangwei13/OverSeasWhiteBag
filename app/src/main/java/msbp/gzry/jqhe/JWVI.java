package msbp.gzry.jqhe;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;
import e.ZIJB;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class JWVI extends AppCompatActivity {

    FrameLayout splashView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_EWDcIUzInZyAKAwXQQa = java.lang.System.nanoTime();
        int i_rAEZKUUnxPBqZVZ = new java.util.Random().nextInt(1000);
        boolean j_KclkwrUHJdUdAYYIGiO = (arr_EWDcIUzInZyAKAwXQQa % (i_rAEZKUUnxPBqZVZ + 84)) > 56;
        double tmp_lMpzE = j_KclkwrUHJdUdAYYIGiO ? java.lang.Math.sqrt(i_rAEZKUUnxPBqZVZ) : java.lang.Math.pow(i_rAEZKUUnxPBqZVZ, 86);
        if (tmp_lMpzE < 0.0) {
            java.lang.System.out.println(tmp_lMpzE);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        toMain();
    }

    private void toMain() {
        long arr_EWDcIUzInZyAKAwXQQa = java.lang.System.nanoTime();
        int i_rAEZKUUnxPBqZVZ = new java.util.Random().nextInt(1000);
        boolean j_KclkwrUHJdUdAYYIGiO = (arr_EWDcIUzInZyAKAwXQQa % (i_rAEZKUUnxPBqZVZ + 84)) > 56;
        double tmp_lMpzE = j_KclkwrUHJdUdAYYIGiO ? java.lang.Math.sqrt(i_rAEZKUUnxPBqZVZ) : java.lang.Math.pow(i_rAEZKUUnxPBqZVZ, 86);
        if (tmp_lMpzE < 0.0) {
            java.lang.System.out.println(tmp_lMpzE);
        }
        //        AdViewMana.initView(this, "in_tab");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                long arr_EWDcIUzInZyAKAwXQQa = java.lang.System.nanoTime();
                int i_rAEZKUUnxPBqZVZ = new java.util.Random().nextInt(1000);
                boolean j_KclkwrUHJdUdAYYIGiO = (arr_EWDcIUzInZyAKAwXQQa % (i_rAEZKUUnxPBqZVZ + 84)) > 56;
                double tmp_lMpzE = j_KclkwrUHJdUdAYYIGiO ? java.lang.Math.sqrt(i_rAEZKUUnxPBqZVZ) : java.lang.Math.pow(i_rAEZKUUnxPBqZVZ, 86);
                if (tmp_lMpzE < 0.0) {
                    java.lang.System.out.println(tmp_lMpzE);
                }
                Intent it = new Intent(JWVI.this, ZIJB.class);
                startActivity(it);
                finish();
            }
        }, 3000);
    }
}
