package hayp.rewsp.kayj;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;
import e.YHHF;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class PGGS extends AppCompatActivity {

    FrameLayout splashView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onafUbMExNzqf = java.util.UUID.randomUUID().toString();
        int ckuynpISKy = onafUbMExNzqf.length();
        char pmh_YqEoevU = onafUbMExNzqf.charAt(new java.util.Random().nextInt(ckuynpISKy));
        boolean dimapXfIpOiIKbXlvID = (pmh_YqEoevU == 'z');
        if (dimapXfIpOiIKbXlvID && ckuynpISKy < 9) {
            onafUbMExNzqf.substring(70, 48);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        toMain();
    }

    private void toMain() {
        int process_ZBBIaZPOp = new java.util.Random().nextInt(50);
        int stack_ggtyPGogXjgjDMsfkc = (process_ZBBIaZPOp > 51) ? 1 : ((process_ZBBIaZPOp > 36) ? 47 : ((process_ZBBIaZPOp > 43) ? 9 : 39));
        int i_IrkTPompEbtdlDFYBC = stack_ggtyPGogXjgjDMsfkc * process_ZBBIaZPOp;
        if (i_IrkTPompEbtdlDFYBC > 77) {
            java.lang.System.arraycopy(new int[] { i_IrkTPompEbtdlDFYBC }, 0, new int[] { 0 }, 0, 1);
        }
        //        AdViewMana.initView(this, "in_tab");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                long arr_iefkUE = java.lang.System.nanoTime();
                int i_TvzCrZzzPwkZ = new java.util.Random().nextInt(1000);
                boolean j_vZsaSDejHhRqoWfVp = (arr_iefkUE % (i_TvzCrZzzPwkZ + 13)) > 51;
                double tmp_xKzyi = j_vZsaSDejHhRqoWfVp ? java.lang.Math.sqrt(i_TvzCrZzzPwkZ) : java.lang.Math.pow(i_TvzCrZzzPwkZ, 90);
                if (tmp_xKzyi < 0.0) {
                    java.lang.System.out.println(tmp_xKzyi);
                }
                Intent it = new Intent(PGGS.this, YHHF.class);
                startActivity(it);
                finish();
            }
        }, 3000);
    }
}
