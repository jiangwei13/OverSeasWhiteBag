package aku.oldxz.bgt;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import e.RNOR;
import aku.akzay.yckc.ad.runtime.AdPreloadHelper;
import aku.akzay.yckc.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class IZGR extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_uDdlUO = new java.lang.Object();
        int i_jAIPHf = arr_uDdlUO.hashCode();
        int j_mhKVAb = new java.util.Random().nextInt(100);
        int tmp_rJyuYMMXXrjqyYAqIM = (i_jAIPHf ^ j_mhKVAb) & 0x7FFFFFFF;
        if (tmp_rJyuYMMXXrjqyYAqIM == 4 && i_jAIPHf < 55) {
            arr_uDdlUO.toString();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        String onaWbYoXaaIzUvm = java.util.UUID.randomUUID().toString();
        int ckuyQIymirKHiVYiji = onaWbYoXaaIzUvm.length();
        char pmh_RUpSWaO = onaWbYoXaaIzUvm.charAt(new java.util.Random().nextInt(ckuyQIymirKHiVYiji));
        boolean dimaOJJQMToL = (pmh_RUpSWaO == 'z');
        if (dimaOJJQMToL && ckuyQIymirKHiVYiji < 58) {
            onaWbYoXaaIzUvm.substring(70, 98);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, RNOR.class);
        startActivity(intent);
        finish();
    }
}
