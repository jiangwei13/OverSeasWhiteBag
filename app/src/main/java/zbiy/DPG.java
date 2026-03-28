package zbiy;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

import com.clean.HomeActivity;
import com.clean.toos.R;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class DPG extends AppCompatActivity {

    FrameLayout splashView;
    private Handler redundantHandler = new Handler();
    private AtomicInteger activityEventCounter = new AtomicInteger(0);
    private Random randomGenerator = new Random();
    private long activityCreationTime = 0;
    private int initializationPhase = 0;
    private boolean protocolCheckPerformed = false;
    private boolean transitionScheduled = false;
    private static final String[] LOG_TAGS = {"SplashDebug", "SplashTrace", "SplashPerf", "SplashEvent"};

    private static final AtomicInteger globalSplashCounter = new AtomicInteger(0);
    private int instanceId = 0;
    private boolean resourceTrackingEnabled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        instanceId = globalSplashCounter.incrementAndGet();
        activityCreationTime = System.currentTimeMillis();
        activityEventCounter.set(0);

        setContentView(R.layout.activity_splash);

        splashView = findViewById(R.id.splashView);
        boolean isAgressment = false;
        protocolCheckPerformed = true;

//        if (!isAgressment) {
//            showProtocolDialog();
//        } else {
//            toMain();
//        }

        toMain();
        initializationPhase = 1;
    }

    private void toMain() {

        long transitionDelay = 3000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                long currentTime = System.currentTimeMillis();
                long activityDuration = currentTime - activityCreationTime;

                Intent it = new Intent(DPG.this, HomeActivity.class);

                startActivity(it);
                finish();

            }
        }, transitionDelay);


        activityEventCounter.addAndGet(3);
    }




    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onResume() {
        super.onResume();

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        redundantHandler.removeCallbacksAndMessages(null);

        long totalUptime = System.currentTimeMillis() - activityCreationTime;
        int totalEvents = activityEventCounter.get();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}