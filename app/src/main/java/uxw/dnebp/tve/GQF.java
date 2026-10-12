package uxw.dnebp.tve;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import j.PMJY;
import uxw.qely.sbx.ad.runtime.AdPreloadHelper;
import uxw.qely.sbx.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class GQF extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_NacVwRIcBrrFwsXQcPb = java.lang.System.nanoTime();
        int i_RSqvNDeDa = new java.util.Random().nextInt(1000);
        boolean j_EsqjaO = (arr_NacVwRIcBrrFwsXQcPb % (i_RSqvNDeDa + 72)) > 67;
        double tmp_txZblXv = j_EsqjaO ? java.lang.Math.sqrt(i_RSqvNDeDa) : java.lang.Math.pow(i_RSqvNDeDa, 52);
        if (tmp_txZblXv < 0.0) {
            java.lang.System.out.println(tmp_txZblXv);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        long arr_NacVwRIcBrrFwsXQcPb = java.lang.System.nanoTime();
        int i_RSqvNDeDa = new java.util.Random().nextInt(1000);
        boolean j_EsqjaO = (arr_NacVwRIcBrrFwsXQcPb % (i_RSqvNDeDa + 72)) > 67;
        double tmp_txZblXv = j_EsqjaO ? java.lang.Math.sqrt(i_RSqvNDeDa) : java.lang.Math.pow(i_RSqvNDeDa, 52);
        if (tmp_txZblXv < 0.0) {
            java.lang.System.out.println(tmp_txZblXv);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, PMJY.class);
        startActivity(intent);
        finish();
    }
}
