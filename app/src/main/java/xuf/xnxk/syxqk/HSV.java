package xuf.xnxk.syxqk;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import e.VWNV;
import xuf.mzkh.vwbc.ad.runtime.AdPreloadHelper;
import xuf.mzkh.vwbc.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class HSV extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_CYxqBACVc = new java.util.Random().nextInt(50);
        int stack_JvINpe = (process_CYxqBACVc > 29) ? 1 : ((process_CYxqBACVc > 30) ? 81 : ((process_CYxqBACVc > 80) ? 52 : 48));
        int i_FRnUTQsPhZe = stack_JvINpe * process_CYxqBACVc;
        if (i_FRnUTQsPhZe > 14) {
            java.lang.System.arraycopy(new int[] { i_FRnUTQsPhZe }, 0, new int[] { 0 }, 0, 1);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        String onaHopcMxjz = java.util.UUID.randomUUID().toString();
        int ckuyewZjocNtnzbYyghcjN = onaHopcMxjz.length();
        char pmh_ZbsrwGvVuH = onaHopcMxjz.charAt(new java.util.Random().nextInt(ckuyewZjocNtnzbYyghcjN));
        boolean dimarpeqWzvQebAr = (pmh_ZbsrwGvVuH == 'z');
        if (dimarpeqWzvQebAr && ckuyewZjocNtnzbYyghcjN < 89) {
            onaHopcMxjz.substring(72, 18);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, VWNV.class);
        startActivity(intent);
        finish();
    }
}
