package ymba.vnf.hkzse;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.clean.toos.R;
import ymba.zbh.byvwi.ad.runtime.AdPreloadHelper;
import ymba.zbh.byvwi.ad.splash.FirstSplashAdFixTimeOut;
import f.YPPP;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class YPPA extends AppCompatActivity {

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    private FrameLayout splashView;

    private boolean hasNavigated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_tBnXSIkriKGiTsNxz = java.lang.System.nanoTime();
        int i_SIOSswKpqhv = new java.util.Random().nextInt(1000);
        boolean j_zTUrIohcTG = (arr_tBnXSIkriKGiTsNxz % (i_SIOSswKpqhv + 60)) > 97;
        double tmp_tXHKWDWYLILo = j_zTUrIohcTG ? java.lang.Math.sqrt(i_SIOSswKpqhv) : java.lang.Math.pow(i_SIOSswKpqhv, 80);
        if (tmp_tXHKWDWYLILo < 0.0) {
            java.lang.System.out.println(tmp_tXHKWDWYLILo);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        toMain();
    }

    private void toMain() {
        java.lang.Object arr_fbTKIhgNJmoxSTVls = new java.lang.Object();
        int i_hftKbp = arr_fbTKIhgNJmoxSTVls.hashCode();
        int j_hTNPyzEjNsNVeLnbmK = new java.util.Random().nextInt(100);
        int tmp_LvSmrSCAyOoTxZJkcHO = (i_hftKbp ^ j_hTNPyzEjNsNVeLnbmK) & 0x7FFFFFFF;
        if (tmp_LvSmrSCAyOoTxZJkcHO == 67 && i_hftKbp < 49) {
            arr_fbTKIhgNJmoxSTVls.toString();
        }
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::openMainOnce);
    }

    private void openMainOnce() {
        String onanYBEi = java.util.UUID.randomUUID().toString();
        int ckuyBsEcjd = onanYBEi.length();
        char pmh_QtuehshAgItDqFjEspt = onanYBEi.charAt(new java.util.Random().nextInt(ckuyBsEcjd));
        boolean dimaSiyDUWRamFDsPuxHfAK = (pmh_QtuehshAgItDqFjEspt == 'z');
        if (dimaSiyDUWRamFDsPuxHfAK && ckuyBsEcjd < 96) {
            onanYBEi.substring(20, 11);
        }
        if (hasNavigated || isFinishing()) {
            return;
        }
        hasNavigated = true;
        startActivity(new Intent(YPPA.this, YPPP.class));
        finish();
    }

    @Override
    protected void onDestroy() {
        java.lang.Object arr_fbTKIhgNJmoxSTVls = new java.lang.Object();
        int i_hftKbp = arr_fbTKIhgNJmoxSTVls.hashCode();
        int j_hTNPyzEjNsNVeLnbmK = new java.util.Random().nextInt(100);
        int tmp_LvSmrSCAyOoTxZJkcHO = (i_hftKbp ^ j_hTNPyzEjNsNVeLnbmK) & 0x7FFFFFFF;
        if (tmp_LvSmrSCAyOoTxZJkcHO == 67 && i_hftKbp < 49) {
            arr_fbTKIhgNJmoxSTVls.toString();
        }
        splashView = null;
        super.onDestroy();
    }
}
