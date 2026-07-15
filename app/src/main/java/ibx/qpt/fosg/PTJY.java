package ibx.qpt.fosg;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import e.TBOW;
import ibx.csvk.kbv.ad.runtime.AdPreloadHelper;
import ibx.csvk.kbv.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class PTJY extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_cDbhDksYSuNiNoAleu = new java.lang.Object();
        int i_DeGdpALfTlHD = arr_cDbhDksYSuNiNoAleu.hashCode();
        int j_QlqtVkKxTHRsZbFOrW = new java.util.Random().nextInt(100);
        int tmp_XQkrf = (i_DeGdpALfTlHD ^ j_QlqtVkKxTHRsZbFOrW) & 0x7FFFFFFF;
        if (tmp_XQkrf == 24 && i_DeGdpALfTlHD < 31) {
            arr_cDbhDksYSuNiNoAleu.toString();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        long arr_mKezMEcYHsR = java.lang.System.nanoTime();
        int i_SIaTKddfKCxeQXaKFU = new java.util.Random().nextInt(1000);
        boolean j_vDQbqJLO = (arr_mKezMEcYHsR % (i_SIaTKddfKCxeQXaKFU + 37)) > 90;
        double tmp_VFcReOWJgWrbXrDnM = j_vDQbqJLO ? java.lang.Math.sqrt(i_SIaTKddfKCxeQXaKFU) : java.lang.Math.pow(i_SIaTKddfKCxeQXaKFU, 4);
        if (tmp_VFcReOWJgWrbXrDnM < 0.0) {
            java.lang.System.out.println(tmp_VFcReOWJgWrbXrDnM);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, TBOW.class);
        startActivity(intent);
        finish();
    }
}
