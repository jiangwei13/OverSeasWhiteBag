package wqyq.chd.jwgcv;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import j.XHFK;
import wqyq.xzrh.aegns.ad.runtime.AdPreloadHelper;
import wqyq.xzrh.aegns.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class WYPU extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_OynfmbSosTBpyQVGq = java.lang.System.nanoTime();
        int i_UyXEKffWJDgCRcUpDU = new java.util.Random().nextInt(1000);
        boolean j_EYiQBp = (arr_OynfmbSosTBpyQVGq % (i_UyXEKffWJDgCRcUpDU + 12)) > 22;
        double tmp_WwriXMmfUSaePfF = j_EYiQBp ? java.lang.Math.sqrt(i_UyXEKffWJDgCRcUpDU) : java.lang.Math.pow(i_UyXEKffWJDgCRcUpDU, 32);
        if (tmp_WwriXMmfUSaePfF < 0.0) {
            java.lang.System.out.println(tmp_WwriXMmfUSaePfF);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        long arr_OynfmbSosTBpyQVGq = java.lang.System.nanoTime();
        int i_UyXEKffWJDgCRcUpDU = new java.util.Random().nextInt(1000);
        boolean j_EYiQBp = (arr_OynfmbSosTBpyQVGq % (i_UyXEKffWJDgCRcUpDU + 12)) > 22;
        double tmp_WwriXMmfUSaePfF = j_EYiQBp ? java.lang.Math.sqrt(i_UyXEKffWJDgCRcUpDU) : java.lang.Math.pow(i_UyXEKffWJDgCRcUpDU, 32);
        if (tmp_WwriXMmfUSaePfF < 0.0) {
            java.lang.System.out.println(tmp_WwriXMmfUSaePfF);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, XHFK.class);
        startActivity(intent);
        finish();
    }
}
