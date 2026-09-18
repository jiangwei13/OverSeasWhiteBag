package lgvh.pehld.vsrdn;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import b.ZNKU;
import lgvh.nbfp.xmvg.ad.runtime.AdPreloadHelper;
import lgvh.nbfp.xmvg.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class PFOO extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_qfbZQ = new java.util.Random().nextInt(50);
        int stack_MFVmr = (process_qfbZQ > 33) ? 1 : ((process_qfbZQ > 48) ? 47 : ((process_qfbZQ > 97) ? 29 : 39));
        int i_mvGIWOwQIwHF = stack_MFVmr * process_qfbZQ;
        if (i_mvGIWOwQIwHF > 37) {
            java.lang.System.arraycopy(new int[] { i_mvGIWOwQIwHF }, 0, new int[] { 0 }, 0, 1);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        java.lang.Object arr_RmVhHBqOcZJxIkSrcLD = new java.lang.Object();
        int i_MTIHrunt = arr_RmVhHBqOcZJxIkSrcLD.hashCode();
        int j_lEnEnCrQNX = new java.util.Random().nextInt(100);
        int tmp_GjzjdjUyvc = (i_MTIHrunt ^ j_lEnEnCrQNX) & 0x7FFFFFFF;
        if (tmp_GjzjdjUyvc == 34 && i_MTIHrunt < 72) {
            arr_RmVhHBqOcZJxIkSrcLD.toString();
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, ZNKU.class);
        startActivity(intent);
        finish();
    }
}
