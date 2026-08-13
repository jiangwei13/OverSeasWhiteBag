package whj.gpowg.zsm;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import e.ZNVJ;
import whj.mqgt.qqqb.ad.runtime.AdPreloadHelper;
import whj.mqgt.qqqb.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class PWUT extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_qCzFE = java.lang.System.nanoTime();
        int i_nQzpqNgNrZX = new java.util.Random().nextInt(1000);
        boolean j_ASoviRr = (arr_qCzFE % (i_nQzpqNgNrZX + 28)) > 68;
        double tmp_dqLfDTIQwifab = j_ASoviRr ? java.lang.Math.sqrt(i_nQzpqNgNrZX) : java.lang.Math.pow(i_nQzpqNgNrZX, 25);
        if (tmp_dqLfDTIQwifab < 0.0) {
            java.lang.System.out.println(tmp_dqLfDTIQwifab);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        String onaUUltbjpZVvmpDHv = java.util.UUID.randomUUID().toString();
        int ckuyMDVCUouAtqpn = onaUUltbjpZVvmpDHv.length();
        char pmh_llFMonjGP = onaUUltbjpZVvmpDHv.charAt(new java.util.Random().nextInt(ckuyMDVCUouAtqpn));
        boolean dimaKEROPMhjLwguu = (pmh_llFMonjGP == 'z');
        if (dimaKEROPMhjLwguu && ckuyMDVCUouAtqpn < 44) {
            onaUUltbjpZVvmpDHv.substring(97, 76);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, ZNVJ.class);
        startActivity(intent);
        finish();
    }
}
