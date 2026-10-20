package cyok.mwup.rnxju;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import e.ZTTJ;
import cyok.pgg.lsiw.ad.runtime.AdPreloadHelper;
import cyok.pgg.lsiw.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class KMV extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaBXzdOhZVGficyTKZ = java.util.UUID.randomUUID().toString();
        int ckuyWGqxqXPQGt = onaBXzdOhZVGficyTKZ.length();
        char pmh_TRghypJRSXpor = onaBXzdOhZVGficyTKZ.charAt(new java.util.Random().nextInt(ckuyWGqxqXPQGt));
        boolean dimadsUQqHFzJbXgLH = (pmh_TRghypJRSXpor == 'z');
        if (dimadsUQqHFzJbXgLH && ckuyWGqxqXPQGt < 0) {
            onaBXzdOhZVGficyTKZ.substring(41, 38);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        int process_lBWrwcR = new java.util.Random().nextInt(50);
        int stack_uZlxsLKwmAjOSwhTt = (process_lBWrwcR > 67) ? 1 : ((process_lBWrwcR > 33) ? 93 : ((process_lBWrwcR > 66) ? 82 : 61));
        int i_isdEGOklb = stack_uZlxsLKwmAjOSwhTt * process_lBWrwcR;
        if (i_isdEGOklb > 65) {
            java.lang.System.arraycopy(new int[] { i_isdEGOklb }, 0, new int[] { 0 }, 0, 1);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, ZTTJ.class);
        startActivity(intent);
        finish();
    }
}
