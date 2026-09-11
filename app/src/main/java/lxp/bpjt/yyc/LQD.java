package lxp.bpjt.yyc;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import e.WOPE;
import lxp.jmun.kxfub.ad.runtime.AdPreloadHelper;
import lxp.jmun.kxfub.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class LQD extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_PteDwWuDfXXV = new java.lang.Object();
        int i_pxisysZGcUFzTUxO = arr_PteDwWuDfXXV.hashCode();
        int j_KxTxzzQGn = new java.util.Random().nextInt(100);
        int tmp_eMatzQt = (i_pxisysZGcUFzTUxO ^ j_KxTxzzQGn) & 0x7FFFFFFF;
        if (tmp_eMatzQt == 74 && i_pxisysZGcUFzTUxO < 54) {
            arr_PteDwWuDfXXV.toString();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        String onaZPrMTzUMvZcsSQqa = java.util.UUID.randomUUID().toString();
        int ckuynbTEOAiZotQK = onaZPrMTzUMvZcsSQqa.length();
        char pmh_FwuvZ = onaZPrMTzUMvZcsSQqa.charAt(new java.util.Random().nextInt(ckuynbTEOAiZotQK));
        boolean dimaykphHqGHVRgEprYsr = (pmh_FwuvZ == 'z');
        if (dimaykphHqGHVRgEprYsr && ckuynbTEOAiZotQK < 43) {
            onaZPrMTzUMvZcsSQqa.substring(61, 26);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, WOPE.class);
        startActivity(intent);
        finish();
    }
}
