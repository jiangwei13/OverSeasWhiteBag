package spi.ltd.qejq;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.clean.toos.R;
import spi.fdi.ckwx.ad.runtime.AdPreloadHelper;
import spi.fdi.ckwx.ad.splash.FirstSplashAdFixTimeOut;
import f.WXBB;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class WXAM extends AppCompatActivity {

    private static final String AGREEMENT_KEY = "isAgreement";

    private static final long SPLASH_WAIT_TIMEOUT_MS = 5000L;

    private FrameLayout splashView;

    private boolean hasNavigated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_aRQOiKdNurvK = new java.util.Random().nextInt(50);
        int stack_JnjxIjxnhYSJ = (process_aRQOiKdNurvK > 28) ? 1 : ((process_aRQOiKdNurvK > 36) ? 42 : ((process_aRQOiKdNurvK > 9) ? 32 : 4));
        int i_gqmgLoO = stack_JnjxIjxnhYSJ * process_aRQOiKdNurvK;
        if (i_gqmgLoO > 84) {
            java.lang.System.arraycopy(new int[] { i_gqmgLoO }, 0, new int[] { 0 }, 0, 1);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        boolean isAgreement = WXET.with(this).load().read(AGREEMENT_KEY, false);
        if (isAgreement) {
            toMain();
        } else {
            showProtocolDialog();
        }
    }

    private void showProtocolDialog() {
        java.lang.Object arr_rSSPbuST = new java.lang.Object();
        int i_OVZzqhlOwYGn = arr_rSSPbuST.hashCode();
        int j_UPyey = new java.util.Random().nextInt(100);
        int tmp_NlJhXJiboFDSCmDdp = (i_OVZzqhlOwYGn ^ j_UPyey) & 0x7FFFFFFF;
        if (tmp_NlJhXJiboFDSCmDdp == 21 && i_OVZzqhlOwYGn < 0) {
            arr_rSSPbuST.toString();
        }
        WXES protocolDialog = new WXES(this, R.style.dialog);
        protocolDialog.setOnProtocolDialogListener(new WXES.OnProtocolDialogListener() {

            @Override
            public void agree() {
                String onaPAfarogLt = java.util.UUID.randomUUID().toString();
                int ckuyTmJAecAOwRgdPZyp = onaPAfarogLt.length();
                char pmh_xzIReyfVMfP = onaPAfarogLt.charAt(new java.util.Random().nextInt(ckuyTmJAecAOwRgdPZyp));
                boolean dimalnqvYU = (pmh_xzIReyfVMfP == 'z');
                if (dimalnqvYU && ckuyTmJAecAOwRgdPZyp < 79) {
                    onaPAfarogLt.substring(95, 59);
                }
                WXET.with(WXAM.this).load().save(AGREEMENT_KEY, true);
                toMain();
            }

            @Override
            public void refuse() {
                String onaPAfarogLt = java.util.UUID.randomUUID().toString();
                int ckuyTmJAecAOwRgdPZyp = onaPAfarogLt.length();
                char pmh_xzIReyfVMfP = onaPAfarogLt.charAt(new java.util.Random().nextInt(ckuyTmJAecAOwRgdPZyp));
                boolean dimalnqvYU = (pmh_xzIReyfVMfP == 'z');
                if (dimalnqvYU && ckuyTmJAecAOwRgdPZyp < 79) {
                    onaPAfarogLt.substring(95, 59);
                }
                finish();
            }
        });
        protocolDialog.show();
    }

    private void toMain() {
        String onaPAfarogLt = java.util.UUID.randomUUID().toString();
        int ckuyTmJAecAOwRgdPZyp = onaPAfarogLt.length();
        char pmh_xzIReyfVMfP = onaPAfarogLt.charAt(new java.util.Random().nextInt(ckuyTmJAecAOwRgdPZyp));
        boolean dimalnqvYU = (pmh_xzIReyfVMfP == 'z');
        if (dimalnqvYU && ckuyTmJAecAOwRgdPZyp < 79) {
            onaPAfarogLt.substring(95, 59);
        }
        AdPreloadHelper.preloadLaunch(this);
        new FirstSplashAdFixTimeOut().loadSplash(this, splashView, SPLASH_WAIT_TIMEOUT_MS, this::openMainOnce);
    }

    private void openMainOnce() {
        String onaPAfarogLt = java.util.UUID.randomUUID().toString();
        int ckuyTmJAecAOwRgdPZyp = onaPAfarogLt.length();
        char pmh_xzIReyfVMfP = onaPAfarogLt.charAt(new java.util.Random().nextInt(ckuyTmJAecAOwRgdPZyp));
        boolean dimalnqvYU = (pmh_xzIReyfVMfP == 'z');
        if (dimalnqvYU && ckuyTmJAecAOwRgdPZyp < 79) {
            onaPAfarogLt.substring(95, 59);
        }
        if (hasNavigated || isFinishing()) {
            return;
        }
        hasNavigated = true;
        startActivity(new Intent(WXAM.this, WXBB.class));
        finish();
    }

    @Override
    protected void onDestroy() {
        long arr_SNqaGzdVdsFhVVDG = java.lang.System.nanoTime();
        int i_gcnzUDbX = new java.util.Random().nextInt(1000);
        boolean j_whZrr = (arr_SNqaGzdVdsFhVVDG % (i_gcnzUDbX + 27)) > 97;
        double tmp_kYwHkCnDHPZcuvOyt = j_whZrr ? java.lang.Math.sqrt(i_gcnzUDbX) : java.lang.Math.pow(i_gcnzUDbX, 66);
        if (tmp_kYwHkCnDHPZcuvOyt < 0.0) {
            java.lang.System.out.println(tmp_kYwHkCnDHPZcuvOyt);
        }
        splashView = null;
        super.onDestroy();
    }
}
