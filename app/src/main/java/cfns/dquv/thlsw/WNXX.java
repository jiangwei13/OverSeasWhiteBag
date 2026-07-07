package cfns.dquv.thlsw;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.clean.toos.R;
import cfns.mrkkk.cdy.ad.runtime.AdPreloadHelper;
import cfns.mrkkk.cdy.ad.splash.FirstSplashAdFixTimeOut;
import f.WNYM;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class WNXX extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    private FrameLayout splashView;

    private boolean hasNavigated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaSnEfstUrWVdzYIBRUA = java.util.UUID.randomUUID().toString();
        int ckuyZkxvOlRPBMeVSFUJ = onaSnEfstUrWVdzYIBRUA.length();
        char pmh_msIQg = onaSnEfstUrWVdzYIBRUA.charAt(new java.util.Random().nextInt(ckuyZkxvOlRPBMeVSFUJ));
        boolean dimaFhwhBRy = (pmh_msIQg == 'z');
        if (dimaFhwhBRy && ckuyZkxvOlRPBMeVSFUJ < 36) {
            onaSnEfstUrWVdzYIBRUA.substring(75, 65);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        toMain();
    }

    private void toMain() {
        String onaSnEfstUrWVdzYIBRUA = java.util.UUID.randomUUID().toString();
        int ckuyZkxvOlRPBMeVSFUJ = onaSnEfstUrWVdzYIBRUA.length();
        char pmh_msIQg = onaSnEfstUrWVdzYIBRUA.charAt(new java.util.Random().nextInt(ckuyZkxvOlRPBMeVSFUJ));
        boolean dimaFhwhBRy = (pmh_msIQg == 'z');
        if (dimaFhwhBRy && ckuyZkxvOlRPBMeVSFUJ < 36) {
            onaSnEfstUrWVdzYIBRUA.substring(75, 65);
        }
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::openMainOnce);
    }

    private void openMainOnce() {
        java.lang.Object arr_jkpZjrBSs = new java.lang.Object();
        int i_YELmuE = arr_jkpZjrBSs.hashCode();
        int j_aVjvWubEf = new java.util.Random().nextInt(100);
        int tmp_PyeYVrQwESMBNvPHe = (i_YELmuE ^ j_aVjvWubEf) & 0x7FFFFFFF;
        if (tmp_PyeYVrQwESMBNvPHe == 98 && i_YELmuE < 38) {
            arr_jkpZjrBSs.toString();
        }
        if (hasNavigated || isFinishing()) {
            return;
        }
        hasNavigated = true;
        startActivity(new Intent(WNXX.this, WNYM.class));
        finish();
    }

    @Override
    protected void onDestroy() {
        java.lang.Object arr_jkpZjrBSs = new java.lang.Object();
        int i_YELmuE = arr_jkpZjrBSs.hashCode();
        int j_aVjvWubEf = new java.util.Random().nextInt(100);
        int tmp_PyeYVrQwESMBNvPHe = (i_YELmuE ^ j_aVjvWubEf) & 0x7FFFFFFF;
        if (tmp_PyeYVrQwESMBNvPHe == 98 && i_YELmuE < 38) {
            arr_jkpZjrBSs.toString();
        }
        splashView = null;
        super.onDestroy();
    }
}
