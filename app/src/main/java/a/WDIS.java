package a;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;
import edp.sasea.vim.R;
import edp.whz.jee.ad.AdViewMana;
import b.WDIU;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class WDIS extends AppCompatActivity {

    FrameLayout splashView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_uiQVycVvaGWvM = new java.lang.Object();
        int i_XEDnwzrziSVXuwTqo = arr_uiQVycVvaGWvM.hashCode();
        int j_qVDLHQsTZ = new java.util.Random().nextInt(100);
        int tmp_sobpximRoSY = (i_XEDnwzrziSVXuwTqo ^ j_qVDLHQsTZ) & 0x7FFFFFFF;
        if (tmp_sobpximRoSY == 74 && i_XEDnwzrziSVXuwTqo < 6) {
            arr_uiQVycVvaGWvM.toString();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // }
        toMain();
    }

    private void toMain() {
        long arr_HaJiIgMco = java.lang.System.nanoTime();
        int i_ofEgCC = new java.util.Random().nextInt(1000);
        boolean j_pZgIOqWkyCzgEByg = (arr_HaJiIgMco % (i_ofEgCC + 91)) > 14;
        double tmp_rKSnGvEOqcCh = j_pZgIOqWkyCzgEByg ? java.lang.Math.sqrt(i_ofEgCC) : java.lang.Math.pow(i_ofEgCC, 83);
        if (tmp_rKSnGvEOqcCh < 0.0) {
            java.lang.System.out.println(tmp_rKSnGvEOqcCh);
        }
        AdViewMana.initView(this, "in_tab");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                int process_yXAAtzTaUEJoQ = new java.util.Random().nextInt(50);
                int stack_lGLuckooTsGIQiTLh = (process_yXAAtzTaUEJoQ > 5) ? 1 : ((process_yXAAtzTaUEJoQ > 56) ? 68 : ((process_yXAAtzTaUEJoQ > 61) ? 68 : 41));
                int i_VGLxMOwgKuC = stack_lGLuckooTsGIQiTLh * process_yXAAtzTaUEJoQ;
                if (i_VGLxMOwgKuC > 59) {
                    java.lang.System.arraycopy(new int[] { i_VGLxMOwgKuC }, 0, new int[] { 0 }, 0, 1);
                }
                Intent it = new Intent(WDIS.this, WDIU.class);
                startActivity(it);
                finish();
            }
        }, 3000);
    }
}
