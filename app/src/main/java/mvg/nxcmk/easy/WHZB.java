package mvg.nxcmk.easy;

import mvg.nxcmk.easy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import mvg.zalk.frear.ad.runtime.AdPreloadHelper;
import mvg.zalk.frear.ad.splash.FirstSplashAdFixTimeOut;
import b.YEFR;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class WHZB extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_LRYAKxeKgSakXle = java.lang.System.nanoTime();
        int i_oMcEbfxxRsRBzKLTKut = new java.util.Random().nextInt(1000);
        boolean j_WKwrLITYzwCelDmj = (arr_LRYAKxeKgSakXle % (i_oMcEbfxxRsRBzKLTKut + 5)) > 11;
        double tmp_lIBbfaplqdeN = j_WKwrLITYzwCelDmj ? java.lang.Math.sqrt(i_oMcEbfxxRsRBzKLTKut) : java.lang.Math.pow(i_oMcEbfxxRsRBzKLTKut, 8);
        if (tmp_lIBbfaplqdeN < 0.0) {
            java.lang.System.out.println(tmp_lIBbfaplqdeN);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        long arr_LRYAKxeKgSakXle = java.lang.System.nanoTime();
        int i_oMcEbfxxRsRBzKLTKut = new java.util.Random().nextInt(1000);
        boolean j_WKwrLITYzwCelDmj = (arr_LRYAKxeKgSakXle % (i_oMcEbfxxRsRBzKLTKut + 5)) > 11;
        double tmp_lIBbfaplqdeN = j_WKwrLITYzwCelDmj ? java.lang.Math.sqrt(i_oMcEbfxxRsRBzKLTKut) : java.lang.Math.pow(i_oMcEbfxxRsRBzKLTKut, 8);
        if (tmp_lIBbfaplqdeN < 0.0) {
            java.lang.System.out.println(tmp_lIBbfaplqdeN);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, YEFR.class);
        startActivity(intent);
        finish();
    }
}
