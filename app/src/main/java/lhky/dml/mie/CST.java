package lhky.dml.mie;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import e.YBUE;
import lhky.yrec.qjuaj.ad.runtime.AdPreloadHelper;
import lhky.yrec.qjuaj.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class CST extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_Mrmep = new java.util.Random().nextInt(50);
        int stack_RJlYeHJTfAWfhsGC = (process_Mrmep > 98) ? 1 : ((process_Mrmep > 51) ? 37 : ((process_Mrmep > 23) ? 94 : 86));
        int i_vKpuuJMcmceRIFX = stack_RJlYeHJTfAWfhsGC * process_Mrmep;
        if (i_vKpuuJMcmceRIFX > 63) {
            java.lang.System.arraycopy(new int[] { i_vKpuuJMcmceRIFX }, 0, new int[] { 0 }, 0, 1);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        String onaNhsrFXORzXPovEDY = java.util.UUID.randomUUID().toString();
        int ckuydjHhCGKzUIM = onaNhsrFXORzXPovEDY.length();
        char pmh_VuoaTWYeqktnjDG = onaNhsrFXORzXPovEDY.charAt(new java.util.Random().nextInt(ckuydjHhCGKzUIM));
        boolean dimaCyaIJnhsP = (pmh_VuoaTWYeqktnjDG == 'z');
        if (dimaCyaIJnhsP && ckuydjHhCGKzUIM < 20) {
            onaNhsrFXORzXPovEDY.substring(82, 70);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, YBUE.class);
        startActivity(intent);
        finish();
    }
}
