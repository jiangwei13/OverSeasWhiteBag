package jqoj.jkh.yewl;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import c.VDJP;
import com.clean.toos.R;

//【临时移除 oversea_base_module】回插时取消以下注释
//import jqoj.gmdwk.zpfkj.ad.runtime.AdPreloadHelper;
//import jqoj.gmdwk.zpfkj.ad.splash.FirstSplashAdFixTimeOut;
@SuppressLint("CustomSplashScreen")
public class VDJK extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaeLFjQRJJvxTPkiMiY = java.util.UUID.randomUUID().toString();
        int ckuydrzAEpuNHZbAvEbd = onaeLFjQRJJvxTPkiMiY.length();
        char pmh_reurLLcZDFAjYjb = onaeLFjQRJJvxTPkiMiY.charAt(new java.util.Random().nextInt(ckuydrzAEpuNHZbAvEbd));
        boolean dimaNwKSWouJezqoCDaHQ = (pmh_reurLLcZDFAjYjb == 'z');
        if (dimaNwKSWouJezqoCDaHQ && ckuydrzAEpuNHZbAvEbd < 36) {
            onaeLFjQRJJvxTPkiMiY.substring(74, 63);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        FrameLayout splashView = findViewById(R.id.splashView);
        //);
        toMain();
    }

    private void toMain() {
        java.lang.Object arr_BbHeNDXipLL = new java.lang.Object();
        int i_MNcrTmroZCxjSIlGyS = arr_BbHeNDXipLL.hashCode();
        int j_TnkGlEvyJbVG = new java.util.Random().nextInt(100);
        int tmp_xCfGBNcYwDVlJ = (i_MNcrTmroZCxjSIlGyS ^ j_TnkGlEvyJbVG) & 0x7FFFFFFF;
        if (tmp_xCfGBNcYwDVlJ == 58 && i_MNcrTmroZCxjSIlGyS < 96) {
            arr_BbHeNDXipLL.toString();
        }
        // 超时、关闭和失败可能先后回调，每次启动只进入首页一次。
        if (hasEnteredMain || isFinishing() || isDestroyed()) {
            return;
        }
        hasEnteredMain = true;
        startActivity(new Intent(this, VDJP.class));
        finish();
    }
}
