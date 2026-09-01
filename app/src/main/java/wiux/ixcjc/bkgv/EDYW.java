package wiux.ixcjc.bkgv;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
//【临时移除 oversea_base_module】开屏广告相关 import 随模块注释，回插时恢复
//import wiux.jarj.tprmu.ad.runtime.AdPreloadHelper;
//import wiux.jarj.tprmu.ad.splash.FirstSplashAdFixTimeOut;
import b.YQTQ;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class EDYW extends AppCompatActivity {

    //【临时移除 oversea_base_module】广告等待超时不再使用，保留常量便于回插
    // private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;
    FrameLayout splashView;

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_ldzOctPZcaYztknKX = new java.lang.Object();
        int i_MYtEEJuaSRWKqrOAB = arr_ldzOctPZcaYztknKX.hashCode();
        int j_ZZOAoAbwSTXyngO = new java.util.Random().nextInt(100);
        int tmp_obAjMbsMvkNDg = (i_MYtEEJuaSRWKqrOAB ^ j_ZZOAoAbwSTXyngO) & 0x7FFFFFFF;
        if (tmp_obAjMbsMvkNDg == 18 && i_MYtEEJuaSRWKqrOAB < 72) {
            arr_ldzOctPZcaYztknKX.toString();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 无广告版本：直接进入主页
        toMain();
    }

    private void toMain() {
        int process_mFLwnXrxqntYe = new java.util.Random().nextInt(50);
        int stack_kBvpFOL = (process_mFLwnXrxqntYe > 43) ? 1 : ((process_mFLwnXrxqntYe > 88) ? 96 : ((process_mFLwnXrxqntYe > 5) ? 99 : 10));
        int i_iiJjKnYFMp = stack_kBvpFOL * process_mFLwnXrxqntYe;
        if (i_iiJjKnYFMp > 80) {
            java.lang.System.arraycopy(new int[] { i_iiJjKnYFMp }, 0, new int[] { 0 }, 0, 1);
        }
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, YQTQ.class);
        startActivity(intent);
        finish();
    }
}
