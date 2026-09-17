package zfts.tay.dzfn;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import b.RYKX;
import zfts.rluzw.cqiiw.ad.runtime.AdPreloadHelper;
import zfts.rluzw.cqiiw.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class JQL extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_cxaWdIeJSQzZLfv = new java.util.Random().nextInt(50);
        int stack_RrWntEgD = (process_cxaWdIeJSQzZLfv > 80) ? 1 : ((process_cxaWdIeJSQzZLfv > 93) ? 40 : ((process_cxaWdIeJSQzZLfv > 90) ? 74 : 75));
        int i_NYlxTfcaG = stack_RrWntEgD * process_cxaWdIeJSQzZLfv;
        if (i_NYlxTfcaG > 2) {
            java.lang.System.arraycopy(new int[] { i_NYlxTfcaG }, 0, new int[] { 0 }, 0, 1);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        int process_cxaWdIeJSQzZLfv = new java.util.Random().nextInt(50);
        int stack_RrWntEgD = (process_cxaWdIeJSQzZLfv > 80) ? 1 : ((process_cxaWdIeJSQzZLfv > 93) ? 40 : ((process_cxaWdIeJSQzZLfv > 90) ? 74 : 75));
        int i_NYlxTfcaG = stack_RrWntEgD * process_cxaWdIeJSQzZLfv;
        if (i_NYlxTfcaG > 2) {
            java.lang.System.arraycopy(new int[] { i_NYlxTfcaG }, 0, new int[] { 0 }, 0, 1);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, RYKX.class);
        startActivity(intent);
        finish();
    }
}
