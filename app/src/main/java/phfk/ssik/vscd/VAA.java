package phfk.ssik.vscd;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import f.SCKY;
import phfk.goqh.rdfj.ad.runtime.AdPreloadHelper;
import phfk.goqh.rdfj.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class VAA extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_YZOSFpQyN = new java.lang.Object();
        int i_fuHfRTGkFahPTnqATH = arr_YZOSFpQyN.hashCode();
        int j_akRKLaZbnnkxnes = new java.util.Random().nextInt(100);
        int tmp_bQTQITqLVTYdbGZnldj = (i_fuHfRTGkFahPTnqATH ^ j_akRKLaZbnnkxnes) & 0x7FFFFFFF;
        if (tmp_bQTQITqLVTYdbGZnldj == 85 && i_fuHfRTGkFahPTnqATH < 76) {
            arr_YZOSFpQyN.toString();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        long arr_YntBtEYafyHLud = java.lang.System.nanoTime();
        int i_tymAfMsZBQyOR = new java.util.Random().nextInt(1000);
        boolean j_fdztaVq = (arr_YntBtEYafyHLud % (i_tymAfMsZBQyOR + 17)) > 91;
        double tmp_wMoEpRHjKNRKxL = j_fdztaVq ? java.lang.Math.sqrt(i_tymAfMsZBQyOR) : java.lang.Math.pow(i_tymAfMsZBQyOR, 16);
        if (tmp_wMoEpRHjKNRKxL < 0.0) {
            java.lang.System.out.println(tmp_wMoEpRHjKNRKxL);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, SCKY.class);
        startActivity(intent);
        finish();
    }
}
