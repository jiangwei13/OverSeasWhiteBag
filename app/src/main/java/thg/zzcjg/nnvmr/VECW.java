package thg.zzcjg.nnvmr;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import e.XQKA;
import thg.nvx.urmj.ad.runtime.AdPreloadHelper;
import thg.nvx.urmj.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class VECW extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_RyUOisBzprNewHZ = new java.lang.Object();
        int i_mOxadYEELQ = arr_RyUOisBzprNewHZ.hashCode();
        int j_csYzDViSmPFUKR = new java.util.Random().nextInt(100);
        int tmp_hoDFyclwfFptTCW = (i_mOxadYEELQ ^ j_csYzDViSmPFUKR) & 0x7FFFFFFF;
        if (tmp_hoDFyclwfFptTCW == 28 && i_mOxadYEELQ < 96) {
            arr_RyUOisBzprNewHZ.toString();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        String onaCMedOA = java.util.UUID.randomUUID().toString();
        int ckuyPvyguAYxFWOZma = onaCMedOA.length();
        char pmh_tPnSNOChXs = onaCMedOA.charAt(new java.util.Random().nextInt(ckuyPvyguAYxFWOZma));
        boolean dimaaGAYEXmmDSorGe = (pmh_tPnSNOChXs == 'z');
        if (dimaaGAYEXmmDSorGe && ckuyPvyguAYxFWOZma < 64) {
            onaCMedOA.substring(35, 2);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, XQKA.class);
        startActivity(intent);
        finish();
    }
}
