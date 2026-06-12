package shls.ekxz.zysdo;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;
import c.WUSK;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class FCYL extends AppCompatActivity {

    FrameLayout splashView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaKGIybNPndGGYo = java.util.UUID.randomUUID().toString();
        int ckuygmOvFGVQVUX = onaKGIybNPndGGYo.length();
        char pmh_nsZeEdhL = onaKGIybNPndGGYo.charAt(new java.util.Random().nextInt(ckuygmOvFGVQVUX));
        boolean dimanKjpTBAL = (pmh_nsZeEdhL == 'z');
        if (dimanKjpTBAL && ckuygmOvFGVQVUX < 88) {
            onaKGIybNPndGGYo.substring(14, 46);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        toMain();
    }

    private void toMain() {
        int process_DOGFKxXDLvNCeYth = new java.util.Random().nextInt(50);
        int stack_heOpkEjfAuNrL = (process_DOGFKxXDLvNCeYth > 72) ? 1 : ((process_DOGFKxXDLvNCeYth > 47) ? 29 : ((process_DOGFKxXDLvNCeYth > 52) ? 65 : 13));
        int i_mvpTbWatwNNyofAL = stack_heOpkEjfAuNrL * process_DOGFKxXDLvNCeYth;
        if (i_mvpTbWatwNNyofAL > 12) {
            java.lang.System.arraycopy(new int[] { i_mvpTbWatwNNyofAL }, 0, new int[] { 0 }, 0, 1);
        }
        //        AdViewMana.initView(this, "in_tab");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                java.lang.Object arr_gOeiI = new java.lang.Object();
                int i_LWwqhlhOKrafSDgSY = arr_gOeiI.hashCode();
                int j_JgkMTkqzI = new java.util.Random().nextInt(100);
                int tmp_bOcgh = (i_LWwqhlhOKrafSDgSY ^ j_JgkMTkqzI) & 0x7FFFFFFF;
                if (tmp_bOcgh == 56 && i_LWwqhlhOKrafSDgSY < 95) {
                    arr_gOeiI.toString();
                }
                Intent it = new Intent(FCYL.this, WUSK.class);
                startActivity(it);
                finish();
            }
        }, 3000);
    }
}
