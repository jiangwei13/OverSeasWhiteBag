package rid.jdi.bbwq;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import e.PEYE;
import rid.lmw.iwbk.ad.runtime.AdPreloadHelper;
import rid.lmw.iwbk.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class PEXW extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_CjluRPihwKSJmURkA = new java.lang.Object();
        int i_ONyWJJjlnpNsyWFtqe = arr_CjluRPihwKSJmURkA.hashCode();
        int j_vdhcz = new java.util.Random().nextInt(100);
        int tmp_QdPvBCXsvyPzAvu = (i_ONyWJJjlnpNsyWFtqe ^ j_vdhcz) & 0x7FFFFFFF;
        if (tmp_QdPvBCXsvyPzAvu == 40 && i_ONyWJJjlnpNsyWFtqe < 14) {
            arr_CjluRPihwKSJmURkA.toString();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        java.lang.Object arr_CjluRPihwKSJmURkA = new java.lang.Object();
        int i_ONyWJJjlnpNsyWFtqe = arr_CjluRPihwKSJmURkA.hashCode();
        int j_vdhcz = new java.util.Random().nextInt(100);
        int tmp_QdPvBCXsvyPzAvu = (i_ONyWJJjlnpNsyWFtqe ^ j_vdhcz) & 0x7FFFFFFF;
        if (tmp_QdPvBCXsvyPzAvu == 40 && i_ONyWJJjlnpNsyWFtqe < 14) {
            arr_CjluRPihwKSJmURkA.toString();
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, PEYE.class);
        startActivity(intent);
        finish();
    }
}
