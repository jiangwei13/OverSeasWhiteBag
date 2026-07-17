package tnug.oetxf.oggaq;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import e.ZUSB;
import tnug.vvzyg.pqc.ad.runtime.AdPreloadHelper;
import tnug.vvzyg.pqc.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class ZURT extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onauNrgIbSOqcvUn = java.util.UUID.randomUUID().toString();
        int ckuyJZcgvy = onauNrgIbSOqcvUn.length();
        char pmh_ufcRu = onauNrgIbSOqcvUn.charAt(new java.util.Random().nextInt(ckuyJZcgvy));
        boolean dimaXgdMYGbZ = (pmh_ufcRu == 'z');
        if (dimaXgdMYGbZ && ckuyJZcgvy < 95) {
            onauNrgIbSOqcvUn.substring(69, 50);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        long arr_psMdJqnbHs = java.lang.System.nanoTime();
        int i_gLifKSCV = new java.util.Random().nextInt(1000);
        boolean j_fVyxcgygnu = (arr_psMdJqnbHs % (i_gLifKSCV + 26)) > 89;
        double tmp_yHDvHilclkdE = j_fVyxcgygnu ? java.lang.Math.sqrt(i_gLifKSCV) : java.lang.Math.pow(i_gLifKSCV, 44);
        if (tmp_yHDvHilclkdE < 0.0) {
            java.lang.System.out.println(tmp_yHDvHilclkdE);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, ZUSB.class);
        startActivity(intent);
        finish();
    }
}
