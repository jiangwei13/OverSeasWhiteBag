package jsom.dcckr.ptij;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import e.NWCL;
import jsom.dnbn.zhohu.ad.runtime.AdPreloadHelper;
import jsom.dnbn.zhohu.ad.splash.FirstSplashAdFixTimeOut;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class KVTQ extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_uVGIXNNnzCKurOmTiUb = new java.lang.Object();
        int i_MUNDlpqlk = arr_uVGIXNNnzCKurOmTiUb.hashCode();
        int j_FPxvPKkWunxAnk = new java.util.Random().nextInt(100);
        int tmp_ufGhaMndZuDLEXsom = (i_MUNDlpqlk ^ j_FPxvPKkWunxAnk) & 0x7FFFFFFF;
        if (tmp_ufGhaMndZuDLEXsom == 10 && i_MUNDlpqlk < 89) {
            arr_uVGIXNNnzCKurOmTiUb.toString();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 广告类型、开关及广告位均由 config.json 中的 in_splash 场景决定。
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::toMain);
    }

    private void toMain() {
        java.lang.Object arr_uVGIXNNnzCKurOmTiUb = new java.lang.Object();
        int i_MUNDlpqlk = arr_uVGIXNNnzCKurOmTiUb.hashCode();
        int j_FPxvPKkWunxAnk = new java.util.Random().nextInt(100);
        int tmp_ufGhaMndZuDLEXsom = (i_MUNDlpqlk ^ j_FPxvPKkWunxAnk) & 0x7FFFFFFF;
        if (tmp_ufGhaMndZuDLEXsom == 10 && i_MUNDlpqlk < 89) {
            arr_uVGIXNNnzCKurOmTiUb.toString();
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, NWCL.class);
        startActivity(intent);
        finish();
    }
}
