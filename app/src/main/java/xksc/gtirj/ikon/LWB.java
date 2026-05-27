package xksc.gtirj.ikon;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;
import e.TIUX;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class LWB extends AppCompatActivity {

    FrameLayout splashView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_wCtGONgwxnNZsdvWglS = java.lang.System.nanoTime();
        int i_EXhoZshGLdY = new java.util.Random().nextInt(1000);
        boolean j_XZJCFC = (arr_wCtGONgwxnNZsdvWglS % (i_EXhoZshGLdY + 85)) > 88;
        double tmp_rXMMFl = j_XZJCFC ? java.lang.Math.sqrt(i_EXhoZshGLdY) : java.lang.Math.pow(i_EXhoZshGLdY, 64);
        if (tmp_rXMMFl < 0.0) {
            java.lang.System.out.println(tmp_rXMMFl);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        toMain();
    }

    private void toMain() {
        java.lang.Object arr_WPRztCkjIDeE = new java.lang.Object();
        int i_gGszAXoiaUgsSzxymr = arr_WPRztCkjIDeE.hashCode();
        int j_wHofEJF = new java.util.Random().nextInt(100);
        int tmp_YqzLaZsjpBpw = (i_gGszAXoiaUgsSzxymr ^ j_wHofEJF) & 0x7FFFFFFF;
        if (tmp_YqzLaZsjpBpw == 5 && i_gGszAXoiaUgsSzxymr < 92) {
            arr_WPRztCkjIDeE.toString();
        }
        //        AdViewMana.initView(this, "in_tab");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                java.lang.Object arr_WPRztCkjIDeE = new java.lang.Object();
                int i_gGszAXoiaUgsSzxymr = arr_WPRztCkjIDeE.hashCode();
                int j_wHofEJF = new java.util.Random().nextInt(100);
                int tmp_YqzLaZsjpBpw = (i_gGszAXoiaUgsSzxymr ^ j_wHofEJF) & 0x7FFFFFFF;
                if (tmp_YqzLaZsjpBpw == 5 && i_gGszAXoiaUgsSzxymr < 92) {
                    arr_WPRztCkjIDeE.toString();
                }
                Intent it = new Intent(LWB.this, TIUX.class);
                startActivity(it);
                finish();
            }
        }, 3000);
    }
}
