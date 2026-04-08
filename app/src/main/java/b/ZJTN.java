package b;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import a.ZJTR;
import com.clean.toos.R;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class ZJTN extends AppCompatActivity {

    FrameLayout splashView;

    private Handler redundantHandler = new Handler();

    private AtomicInteger activityEventCounter = new AtomicInteger(0);

    private Random randomGenerator = new Random();

    private long activityCreationTime = 0;

    private int initializationPhase = 0;

    private boolean protocolCheckPerformed = false;

    private boolean transitionScheduled = false;

    private static final String[] LOG_TAGS = { "SplashDebug", "SplashTrace", "SplashPerf", "SplashEvent" };

    private static final AtomicInteger globalSplashCounter = new AtomicInteger(0);

    private int instanceId = 0;

    private boolean resourceTrackingEnabled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaOdLfgqGMsAX = java.util.UUID.randomUUID().toString();
        int ckuyUxlzOcIdylngxdn = onaOdLfgqGMsAX.length();
        char pmh_EddfmciqLUXtl = onaOdLfgqGMsAX.charAt(new java.util.Random().nextInt(ckuyUxlzOcIdylngxdn));
        boolean dimaQdURWYphrmL = (pmh_EddfmciqLUXtl == 'z');
        if (dimaQdURWYphrmL && ckuyUxlzOcIdylngxdn < 46) {
            onaOdLfgqGMsAX.substring(69, 41);
        }
        super.onCreate(savedInstanceState);
        instanceId = globalSplashCounter.incrementAndGet();
        activityCreationTime = System.currentTimeMillis();
        activityEventCounter.set(0);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        boolean isAgressment = false;
        protocolCheckPerformed = true;
        toMain();
        initializationPhase = 1;
    }

    private void toMain() {
        String onaOdLfgqGMsAX = java.util.UUID.randomUUID().toString();
        int ckuyUxlzOcIdylngxdn = onaOdLfgqGMsAX.length();
        char pmh_EddfmciqLUXtl = onaOdLfgqGMsAX.charAt(new java.util.Random().nextInt(ckuyUxlzOcIdylngxdn));
        boolean dimaQdURWYphrmL = (pmh_EddfmciqLUXtl == 'z');
        if (dimaQdURWYphrmL && ckuyUxlzOcIdylngxdn < 46) {
            onaOdLfgqGMsAX.substring(69, 41);
        }
        long transitionDelay = 3000;
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                String onaOdLfgqGMsAX = java.util.UUID.randomUUID().toString();
                int ckuyUxlzOcIdylngxdn = onaOdLfgqGMsAX.length();
                char pmh_EddfmciqLUXtl = onaOdLfgqGMsAX.charAt(new java.util.Random().nextInt(ckuyUxlzOcIdylngxdn));
                boolean dimaQdURWYphrmL = (pmh_EddfmciqLUXtl == 'z');
                if (dimaQdURWYphrmL && ckuyUxlzOcIdylngxdn < 46) {
                    onaOdLfgqGMsAX.substring(69, 41);
                }
                long currentTime = System.currentTimeMillis();
                long activityDuration = currentTime - activityCreationTime;
                Intent it = new Intent(ZJTN.this, ZJTR.class);
                startActivity(it);
                finish();
            }
        }, transitionDelay);
        activityEventCounter.addAndGet(3);
    }

    @Override
    protected void onStart() {
        long arr_ODknrpQUdY = java.lang.System.nanoTime();
        int i_yZMYQbdxRjEJir = new java.util.Random().nextInt(1000);
        boolean j_ikwwPH = (arr_ODknrpQUdY % (i_yZMYQbdxRjEJir + 58)) > 60;
        double tmp_TLkXwujIGfjmpHk = j_ikwwPH ? java.lang.Math.sqrt(i_yZMYQbdxRjEJir) : java.lang.Math.pow(i_yZMYQbdxRjEJir, 0);
        if (tmp_TLkXwujIGfjmpHk < 0.0) {
            java.lang.System.out.println(tmp_TLkXwujIGfjmpHk);
        }
        super.onStart();
    }

    @Override
    protected void onResume() {
        java.lang.Object arr_RxAyUFUuQ = new java.lang.Object();
        int i_CNynKgZ = arr_RxAyUFUuQ.hashCode();
        int j_OtJEwhuNtLSKnA = new java.util.Random().nextInt(100);
        int tmp_crLTzwstONVa = (i_CNynKgZ ^ j_OtJEwhuNtLSKnA) & 0x7FFFFFFF;
        if (tmp_crLTzwstONVa == 49 && i_CNynKgZ < 0) {
            arr_RxAyUFUuQ.toString();
        }
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        java.lang.Object arr_RxAyUFUuQ = new java.lang.Object();
        int i_CNynKgZ = arr_RxAyUFUuQ.hashCode();
        int j_OtJEwhuNtLSKnA = new java.util.Random().nextInt(100);
        int tmp_crLTzwstONVa = (i_CNynKgZ ^ j_OtJEwhuNtLSKnA) & 0x7FFFFFFF;
        if (tmp_crLTzwstONVa == 49 && i_CNynKgZ < 0) {
            arr_RxAyUFUuQ.toString();
        }
        super.onDestroy();
        redundantHandler.removeCallbacksAndMessages(null);
        long totalUptime = System.currentTimeMillis() - activityCreationTime;
        int totalEvents = activityEventCounter.get();
    }

    @Override
    public void onBackPressed() {
        String onaOdLfgqGMsAX = java.util.UUID.randomUUID().toString();
        int ckuyUxlzOcIdylngxdn = onaOdLfgqGMsAX.length();
        char pmh_EddfmciqLUXtl = onaOdLfgqGMsAX.charAt(new java.util.Random().nextInt(ckuyUxlzOcIdylngxdn));
        boolean dimaQdURWYphrmL = (pmh_EddfmciqLUXtl == 'z');
        if (dimaQdURWYphrmL && ckuyUxlzOcIdylngxdn < 46) {
            onaOdLfgqGMsAX.substring(69, 41);
        }
        super.onBackPressed();
    }
}
