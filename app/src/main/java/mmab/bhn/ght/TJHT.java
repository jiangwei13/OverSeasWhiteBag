package mmab.bhn.ght;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;
import e.XHNI;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class TJHT extends AppCompatActivity {

    FrameLayout splashView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_KgFapxUOhfTF = java.lang.System.nanoTime();
        int i_Bihtd = new java.util.Random().nextInt(1000);
        boolean j_eHOVuTqKPnbI = (arr_KgFapxUOhfTF % (i_Bihtd + 19)) > 85;
        double tmp_jdhxOgOfn = j_eHOVuTqKPnbI ? java.lang.Math.sqrt(i_Bihtd) : java.lang.Math.pow(i_Bihtd, 56);
        if (tmp_jdhxOgOfn < 0.0) {
            java.lang.System.out.println(tmp_jdhxOgOfn);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        toMain();
    }

    private void toMain() {
        int process_UAOiZXDzD = new java.util.Random().nextInt(50);
        int stack_XADKOMPvxrnzNXImk = (process_UAOiZXDzD > 44) ? 1 : ((process_UAOiZXDzD > 98) ? 79 : ((process_UAOiZXDzD > 4) ? 32 : 77));
        int i_bvEXgaZjhsFyMq = stack_XADKOMPvxrnzNXImk * process_UAOiZXDzD;
        if (i_bvEXgaZjhsFyMq > 89) {
            java.lang.System.arraycopy(new int[] { i_bvEXgaZjhsFyMq }, 0, new int[] { 0 }, 0, 1);
        }
        //        AdViewMana.initView(this, "in_tab");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                java.lang.Object arr_wkzNcCevMz = new java.lang.Object();
                int i_GgDFcWXVgrTAWoL = arr_wkzNcCevMz.hashCode();
                int j_wvNBP = new java.util.Random().nextInt(100);
                int tmp_jOubf = (i_GgDFcWXVgrTAWoL ^ j_wvNBP) & 0x7FFFFFFF;
                if (tmp_jOubf == 10 && i_GgDFcWXVgrTAWoL < 52) {
                    arr_wkzNcCevMz.toString();
                }
                Intent it = new Intent(TJHT.this, XHNI.class);
                startActivity(it);
                finish();
            }
        }, 3000);
    }
}
