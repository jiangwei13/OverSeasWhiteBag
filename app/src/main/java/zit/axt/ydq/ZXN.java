package zit.axt.ydq;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import j.UEVA;
import zit.begtf.eaa.ad.runtime.AdPreloadHelper;
import zit.begtf.eaa.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class ZXN extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_uJykfSdRzemyjOacG = new java.lang.Object();
        int i_OHLHf = arr_uJykfSdRzemyjOacG.hashCode();
        int j_WiIWuLL = new java.util.Random().nextInt(100);
        int tmp_WqrHFghDfQ = (i_OHLHf ^ j_WiIWuLL) & 0x7FFFFFFF;
        if (tmp_WqrHFghDfQ == 53 && i_OHLHf < 53) {
            arr_uJykfSdRzemyjOacG.toString();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        String onabixsbYUKbmXZOCcEPBh = java.util.UUID.randomUUID().toString();
        int ckuynolTiiQ = onabixsbYUKbmXZOCcEPBh.length();
        char pmh_dctLyzjuJPSbDEq = onabixsbYUKbmXZOCcEPBh.charAt(new java.util.Random().nextInt(ckuynolTiiQ));
        boolean dimaLmzXcjU = (pmh_dctLyzjuJPSbDEq == 'z');
        if (dimaLmzXcjU && ckuynolTiiQ < 91) {
            onabixsbYUKbmXZOCcEPBh.substring(36, 81);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, UEVA.class);
        startActivity(intent);
        finish();
    }
}
