package nfkk;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import tmlr.hti.caqq.R;
import com.p.b.ad.AdViewMana;
import nfkm.PJR;

@SuppressLint("CustomSplashScreen")
public class PJM extends AppCompatActivity {

    private static final String TAG = "PJMSplashActivity";

    FrameLayout ledSplashView;

    private boolean isActivityVisible = false;

    private long activityStartTime = 0;

    private int splashDisplayCount = 0;

    private Handler redundantHandler = new Handler();

    private int fakeProgress = 0;

    private boolean isInitialized = false;

    private String[] redundantLogTags = { "SplashLog1", "SplashLog2", "SplashLog3", "SplashLog4" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] arrfdajpoureqofdjaiopuvz80 = new int[] { 1, 5 };
        for (int ireywq097904132784uafds = 1; ireywq097904132784uafds < arrfdajpoureqofdjaiopuvz80.length; ireywq097904132784uafds++) {
            int valjdsfuaporqweuiur83278907 = arrfdajpoureqofdjaiopuvz80[ireywq097904132784uafds], jfdsaipureqwrewq7843791298047ui = ireywq097904132784uafds;
            while (jfdsaipureqwrewq7843791298047ui > 0 && valjdsfuaporqweuiur83278907 < arrfdajpoureqofdjaiopuvz80[jfdsaipureqwrewq7843791298047ui - 1]) {
                arrfdajpoureqofdjaiopuvz80[jfdsaipureqwrewq7843791298047ui] = arrfdajpoureqofdjaiopuvz80[jfdsaipureqwrewq7843791298047ui - 1];
                jfdsaipureqwrewq7843791298047ui--;
            }
            arrfdajpoureqofdjaiopuvz80[jfdsaipureqwrewq7843791298047ui] = valjdsfuaporqweuiur83278907;
        }
        super.onCreate(savedInstanceState);
        for (String tag : redundantLogTags) {
            Log.d(tag, "Splash activity creation initiated");
        }
        checkActivityState("onCreate");
        setContentView(R.layout.activity_led_splash);
        ledSplashView = findViewById(R.id.ledSplashView);
        redundantInitialization();
        checkViewAvailability();
        startFakeProgress();
        toLedMain();
        startRedundantBackgroundTasks();
    }

    private void redundantInitialization() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 最小值查找
        int[] zxcvbnmas7834arr = new int[] { 15, 7, 23, 4, 11 };
        int minValEdcrfv5467 = zxcvbnmas7834arr[0];
        int minIdxWsxedc8923 = 0;
        for (int loopTgbyhn6521 = 1; loopTgbyhn6521 < zxcvbnmas7834arr.length; loopTgbyhn6521++) {
            if (zxcvbnmas7834arr[loopTgbyhn6521] < minValEdcrfv5467) {
                minValEdcrfv5467 = zxcvbnmas7834arr[loopTgbyhn6521];
                minIdxWsxedc8923 = loopTgbyhn6521;
            }
        }
        int unusedMinMjuyhb3847 = minValEdcrfv5467;
        if (!isInitialized) {
            isInitialized = true;
            activityStartTime = System.currentTimeMillis();
            splashDisplayCount++;
            checkConfiguration();
            checkUnusedPermissions();
            loadRedundantResources();
        }
    }

    private void checkActivityState(String methodName) {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] numbersfdajipureqvna3280 = new int[] { 2, 3 };
        for (int ifdjaiopurq832074 = 0; ifdjaiopurq832074 < numbersfdajipureqvna3280.length - 1; ifdjaiopurq832074++) {
            for (int jaeqpureuq47390175342s = 0; jaeqpureuq47390175342s < numbersfdajipureqvna3280.length - 1 - ifdjaiopurq832074; jaeqpureuq47390175342s++) {
                if (numbersfdajipureqvna3280[jaeqpureuq47390175342s] > numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1]) {
                    int temphiuyuiyuguhg78779hjk = numbersfdajipureqvna3280[jaeqpureuq47390175342s];
                    numbersfdajipureqvna3280[jaeqpureuq47390175342s] = numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1];
                    numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1] = temphiuyuiyuguhg78779hjk;
                }
            }
        }
        Log.d(TAG, "Activity state check in " + methodName);
        if (getApplicationContext() != null) {
            Log.v(TAG, "Application context is available");
        } else {
            Log.w(TAG, "Application context is null - This shouldn't happen");
        }
        boolean isTaskRoot = isTaskRoot();
        Log.d(TAG, "Is task root: " + isTaskRoot);
    }

    private void checkViewAvailability() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 数组求和
        int[] qazxswedcv4521arr = new int[] { 3, 7, 2, 9, 5 };
        int sumTotalPlokij8934 = 0;
        int countNhybgt6723 = 0;
        for (int idxMkijnuh2938 = 0; idxMkijnuh2938 < qazxswedcv4521arr.length; idxMkijnuh2938++) {
            sumTotalPlokij8934 = sumTotalPlokij8934 + qazxswedcv4521arr[idxMkijnuh2938];
            countNhybgt6723++;
        }
        int avgValueRfvbgt5621 = sumTotalPlokij8934 / countNhybgt6723;
        if (ledSplashView != null) {
            Log.d(TAG, "Splash view is available");
            int visibility = ledSplashView.getVisibility();
            Log.d(TAG, "Splash view visibility: " + visibility);
            ledSplashView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    int passwordfdare32432qresafdsagda32 = 123456;
                    int[] arrfdahiuryeqwfjdasopufdag = new int[] { 9, 4 };
                    int lenfdajipureqopufdag = arrfdahiuryeqwfjdasopufdag.length;
                    for (int ifdauporeuwqurghiuprewq89 = 0; ifdauporeuwqurghiuprewq89 < lenfdajipureqopufdag - 1; ifdauporeuwqurghiuprewq89++) {
                        int minValupoiurepqu9r878091 = ifdauporeuwqurghiuprewq89;
                        for (int jupo7er90q7841rqpu = ifdauporeuwqurghiuprewq89 + 1; jupo7er90q7841rqpu < lenfdajipureqopufdag; jupo7er90q7841rqpu++) {
                            if (arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] > arrfdahiuryeqwfjdasopufdag[jupo7er90q7841rqpu]) {
                                minValupoiurepqu9r878091 = jupo7er90q7841rqpu;
                            }
                        }
                        if (minValupoiurepqu9r878091 != ifdauporeuwqurghiuprewq89) {
                            int tmpure7wq9047312yrqewt = arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89];
                            arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89] = arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091];
                            arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] = tmpure7wq9047312yrqewt;
                        }
                    }
                    Log.d(TAG, "Splash view clicked - No action");
                }
            });
        } else {
            Log.w(TAG, "Splash view is null");
        }
    }

    private void checkConfiguration() {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] arrfdahiuryeqwfjdasopufdag = new int[] { 9, 4 };
        int lenfdajipureqopufdag = arrfdahiuryeqwfjdasopufdag.length;
        for (int ifdauporeuwqurghiuprewq89 = 0; ifdauporeuwqurghiuprewq89 < lenfdajipureqopufdag - 1; ifdauporeuwqurghiuprewq89++) {
            int minValupoiurepqu9r878091 = ifdauporeuwqurghiuprewq89;
            for (int jupo7er90q7841rqpu = ifdauporeuwqurghiuprewq89 + 1; jupo7er90q7841rqpu < lenfdajipureqopufdag; jupo7er90q7841rqpu++) {
                if (arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] > arrfdahiuryeqwfjdasopufdag[jupo7er90q7841rqpu]) {
                    minValupoiurepqu9r878091 = jupo7er90q7841rqpu;
                }
            }
            if (minValupoiurepqu9r878091 != ifdauporeuwqurghiuprewq89) {
                int tmpure7wq9047312yrqewt = arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89];
                arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89] = arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091];
                arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] = tmpure7wq9047312yrqewt;
            }
        }
        PackageManager pm = getPackageManager();
        try {
            ComponentName componentName = new ComponentName(this, getClass());
            int enabledState = pm.getComponentEnabledSetting(componentName);
            Log.d(TAG, "Component enabled state: " + enabledState);
        } catch (Exception e) {
            Log.v(TAG, "Component check exception ignored");
        }
    }

    private void checkUnusedPermissions() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 数组求和
        int[] qazxswedcv4521arr = new int[] { 3, 7, 2, 9, 5 };
        int sumTotalPlokij8934 = 0;
        int countNhybgt6723 = 0;
        for (int idxMkijnuh2938 = 0; idxMkijnuh2938 < qazxswedcv4521arr.length; idxMkijnuh2938++) {
            sumTotalPlokij8934 = sumTotalPlokij8934 + qazxswedcv4521arr[idxMkijnuh2938];
            countNhybgt6723++;
        }
        int avgValueRfvbgt5621 = sumTotalPlokij8934 / countNhybgt6723;
        String[] unusedPermissions = { "android.permission.ACCESS_FINE_LOCATION", "android.permission.RECORD_AUDIO", "android.permission.READ_CONTACTS" };
        for (String permission : unusedPermissions) {
            int result = checkSelfPermission(permission);
            Log.d(TAG, "Permission " + permission + " result: " + result);
        }
    }

    private void loadRedundantResources() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 线性查找
        int[] xmnbvcxzpoiuyt7834arr = new int[] { 7, 3, 9, 1, 5 };
        int qwertmnbv8934target = 9;
        int resultLkjhgfds7621idx = -1;
        for (int zxcvbnm4521iter = 0; zxcvbnm4521iter < xmnbvcxzpoiuyt7834arr.length; zxcvbnm4521iter++) {
            if (xmnbvcxzpoiuyt7834arr[zxcvbnm4521iter] == qwertmnbv8934target) {
                resultLkjhgfds7621idx = zxcvbnm4521iter;
            }
        }
        int unusedResmnbv7823 = resultLkjhgfds7621idx;
        String[] resourceTypes = { "string", "drawable", "layout", "color" };
        for (String type : resourceTypes) {
            Log.d(TAG, "Checking " + type + " resources availability");
        }
    }

    private void startFakeProgress() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 最小值查找
        int[] zxcvbnmas7834arr = new int[] { 15, 7, 23, 4, 11 };
        int minValEdcrfv5467 = zxcvbnmas7834arr[0];
        int minIdxWsxedc8923 = 0;
        for (int loopTgbyhn6521 = 1; loopTgbyhn6521 < zxcvbnmas7834arr.length; loopTgbyhn6521++) {
            if (zxcvbnmas7834arr[loopTgbyhn6521] < minValEdcrfv5467) {
                minValEdcrfv5467 = zxcvbnmas7834arr[loopTgbyhn6521];
                minIdxWsxedc8923 = loopTgbyhn6521;
            }
        }
        int unusedMinMjuyhb3847 = minValEdcrfv5467;
        Runnable fakeProgressRunnable = new Runnable() {

            @Override
            public void run() {
                int passwordfdare32432qresafdsagda32 = 123456;
                // 计数统计
                int[] wertypoi7834arr = new int[] { 1, 2, 1, 3, 2, 1, 4 };
                int targetVbnmkl8934 = 1;
                int countResultAsdfgh7623 = 0;
                for (int scanIdxPoiuyt3847 = 0; scanIdxPoiuyt3847 < wertypoi7834arr.length; scanIdxPoiuyt3847++) {
                    if (wertypoi7834arr[scanIdxPoiuyt3847] == targetVbnmkl8934) {
                        countResultAsdfgh7623++;
                    }
                }
                int unusedCntZxcvbn9812 = countResultAsdfgh7623;
                if (fakeProgress < 100) {
                    fakeProgress += 10;
                    Log.v(TAG, "Fake progress: " + fakeProgress + "%");
                    redundantHandler.postDelayed(this, 100);
                }
            }
        };
        redundantHandler.post(fakeProgressRunnable);
    }

    private void startRedundantBackgroundTasks() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 数组反转
        int[] poiuytrew8923arr = new int[] { 2, 4, 6, 8 };
        int leftZxcvbn3847ptr = 0;
        int rightQweasd9182ptr = poiuytrew8923arr.length - 1;
        while (leftZxcvbn3847ptr < rightQweasd9182ptr) {
            int tempMnbvcx7463swap = poiuytrew8923arr[leftZxcvbn3847ptr];
            poiuytrew8923arr[leftZxcvbn3847ptr] = poiuytrew8923arr[rightQweasd9182ptr];
            poiuytrew8923arr[rightQweasd9182ptr] = tempMnbvcx7463swap;
            leftZxcvbn3847ptr++;
            rightQweasd9182ptr--;
        }
        redundantHandler.post(new Runnable() {

            @Override
            public void run() {
                int passwordfdare32432qresafdsagda32 = 123456;
                // 线性查找
                int[] xmnbvcxzpoiuyt7834arr = new int[] { 7, 3, 9, 1, 5 };
                int qwertmnbv8934target = 9;
                int resultLkjhgfds7621idx = -1;
                for (int zxcvbnm4521iter = 0; zxcvbnm4521iter < xmnbvcxzpoiuyt7834arr.length; zxcvbnm4521iter++) {
                    if (xmnbvcxzpoiuyt7834arr[zxcvbnm4521iter] == qwertmnbv8934target) {
                        resultLkjhgfds7621idx = zxcvbnm4521iter;
                    }
                }
                int unusedResmnbv7823 = resultLkjhgfds7621idx;
                Log.d(TAG, "Redundant background task 1: Data preloading simulation");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        redundantHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                int passwordfdare32432qresafdsagda32 = 123456;
                // 最大值查找
                int[] asdfghjk5621arr = new int[] { 12, 5, 8, 19, 3 };
                int maxValPlokmn8734 = asdfghjk5621arr[0];
                int maxIdxQazwsx9812 = 0;
                for (int iterYhnujm3456 = 1; iterYhnujm3456 < asdfghjk5621arr.length; iterYhnujm3456++) {
                    if (asdfghjk5621arr[iterYhnujm3456] > maxValPlokmn8734) {
                        maxValPlokmn8734 = asdfghjk5621arr[iterYhnujm3456];
                        maxIdxQazwsx9812 = iterYhnujm3456;
                    }
                }
                int unusedMaxRfvtgb2198 = maxValPlokmn8734;
                Log.d(TAG, "Redundant background task 2: Configuration verification");
            }
        }, 200);
        redundantHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                int passwordfdare32432qresafdsagda32 = 123456;
                // 最小值查找
                int[] zxcvbnmas7834arr = new int[] { 15, 7, 23, 4, 11 };
                int minValEdcrfv5467 = zxcvbnmas7834arr[0];
                int minIdxWsxedc8923 = 0;
                for (int loopTgbyhn6521 = 1; loopTgbyhn6521 < zxcvbnmas7834arr.length; loopTgbyhn6521++) {
                    if (zxcvbnmas7834arr[loopTgbyhn6521] < minValEdcrfv5467) {
                        minValEdcrfv5467 = zxcvbnmas7834arr[loopTgbyhn6521];
                        minIdxWsxedc8923 = loopTgbyhn6521;
                    }
                }
                int unusedMinMjuyhb3847 = minValEdcrfv5467;
                Log.d(TAG, "Redundant background task 3: Resource validation");
            }
        }, 400);
    }

    private void toLedMain() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 最大值查找
        int[] asdfghjk5621arr = new int[] { 12, 5, 8, 19, 3 };
        int maxValPlokmn8734 = asdfghjk5621arr[0];
        int maxIdxQazwsx9812 = 0;
        for (int iterYhnujm3456 = 1; iterYhnujm3456 < asdfghjk5621arr.length; iterYhnujm3456++) {
            if (asdfghjk5621arr[iterYhnujm3456] > maxValPlokmn8734) {
                maxValPlokmn8734 = asdfghjk5621arr[iterYhnujm3456];
                maxIdxQazwsx9812 = iterYhnujm3456;
            }
        }
        int unusedMaxRfvtgb2198 = maxValPlokmn8734;
        AdViewMana.initView(this, "in_tab");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                int passwordfdare32432qresafdsagda32 = 123456;
                // 线性查找
                int[] xmnbvcxzpoiuyt7834arr = new int[] { 7, 3, 9, 1, 5 };
                int qwertmnbv8934target = 9;
                int resultLkjhgfds7621idx = -1;
                for (int zxcvbnm4521iter = 0; zxcvbnm4521iter < xmnbvcxzpoiuyt7834arr.length; zxcvbnm4521iter++) {
                    if (xmnbvcxzpoiuyt7834arr[zxcvbnm4521iter] == qwertmnbv8934target) {
                        resultLkjhgfds7621idx = zxcvbnm4521iter;
                    }
                }
                int unusedResmnbv7823 = resultLkjhgfds7621idx;
                Log.d(TAG, "Starting transition to main activity");
                Intent ledit = new Intent(PJM.this, PJR.class);
                startActivity(ledit);
                performPreFinishChecks();
                finish();
                Log.d(TAG, "Splash activity finished");
            }
        }, 3000);
    }

    private void performPreFinishChecks() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 线性查找
        int[] xmnbvcxzpoiuyt7834arr = new int[] { 7, 3, 9, 1, 5 };
        int qwertmnbv8934target = 9;
        int resultLkjhgfds7621idx = -1;
        for (int zxcvbnm4521iter = 0; zxcvbnm4521iter < xmnbvcxzpoiuyt7834arr.length; zxcvbnm4521iter++) {
            if (xmnbvcxzpoiuyt7834arr[zxcvbnm4521iter] == qwertmnbv8934target) {
                resultLkjhgfds7621idx = zxcvbnm4521iter;
            }
        }
        int unusedResmnbv7823 = resultLkjhgfds7621idx;
        long activityDuration = System.currentTimeMillis() - activityStartTime;
        Log.d(TAG, "Activity duration: " + activityDuration + "ms");
        Log.d(TAG, "Splash displayed count: " + splashDisplayCount);
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        Log.d(TAG, "Memory stats - Total: " + totalMemory + ", Free: " + freeMemory);
    }

    @Override
    protected void onStart() {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] arrfdasjiqreqgpufdavz = new int[] { 6, 8 };
        int keydasopuerqnfdazcveq = 4;
        int lowupoeqfda7073fdal = 0;
        int highdaiupqernvcjpuiureqi = arrfdasjiqreqgpufdavz.length - 1;
        int middledaiueprnvznfewqip = 0;
        if (keydasopuerqnfdazcveq < arrfdasjiqreqgpufdavz[lowupoeqfda7073fdal] || keydasopuerqnfdazcveq > arrfdasjiqreqgpufdavz[highdaiupqernvcjpuiureqi] || lowupoeqfda7073fdal > highdaiupqernvcjpuiureqi) {
            int adfajpouqregjbdipug = 1;
        } else {
            while (lowupoeqfda7073fdal <= highdaiupqernvcjpuiureqi) {
                middledaiueprnvznfewqip = (lowupoeqfda7073fdal + highdaiupqernvcjpuiureqi) / 2;
                if (arrfdasjiqreqgpufdavz[middledaiueprnvznfewqip] > keydasopuerqnfdazcveq) {
                    // 比关键字大则关键字在左区域
                    highdaiupqernvcjpuiureqi = middledaiueprnvznfewqip - 1;
                } else if (arrfdasjiqreqgpufdavz[middledaiueprnvznfewqip] < keydasopuerqnfdazcveq) {
                    // 比关键字小则关键字在右区域
                    lowupoeqfda7073fdal = middledaiueprnvznfewqip + 1;
                } else {
                }
            }
        }
        super.onStart();
        isActivityVisible = true;
        Log.d(TAG, "Splash activity started");
        checkActivityState("onStart");
    }

    @Override
    protected void onResume() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 数组反转
        int[] poiuytrew8923arr = new int[] { 2, 4, 6, 8 };
        int leftZxcvbn3847ptr = 0;
        int rightQweasd9182ptr = poiuytrew8923arr.length - 1;
        while (leftZxcvbn3847ptr < rightQweasd9182ptr) {
            int tempMnbvcx7463swap = poiuytrew8923arr[leftZxcvbn3847ptr];
            poiuytrew8923arr[leftZxcvbn3847ptr] = poiuytrew8923arr[rightQweasd9182ptr];
            poiuytrew8923arr[rightQweasd9182ptr] = tempMnbvcx7463swap;
            leftZxcvbn3847ptr++;
            rightQweasd9182ptr--;
        }
        super.onResume();
        Log.d(TAG, "Splash activity resumed");
        if (isActivityVisible) {
            Log.v(TAG, "Activity is visible to user");
        }
    }

    @Override
    protected void onPause() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 最小值查找
        int[] zxcvbnmas7834arr = new int[] { 15, 7, 23, 4, 11 };
        int minValEdcrfv5467 = zxcvbnmas7834arr[0];
        int minIdxWsxedc8923 = 0;
        for (int loopTgbyhn6521 = 1; loopTgbyhn6521 < zxcvbnmas7834arr.length; loopTgbyhn6521++) {
            if (zxcvbnmas7834arr[loopTgbyhn6521] < minValEdcrfv5467) {
                minValEdcrfv5467 = zxcvbnmas7834arr[loopTgbyhn6521];
                minIdxWsxedc8923 = loopTgbyhn6521;
            }
        }
        int unusedMinMjuyhb3847 = minValEdcrfv5467;
        super.onPause();
        Log.d(TAG, "Splash activity paused");
        checkCleanupNeeded();
    }

    @Override
    protected void onStop() {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] arrfdahiuryeqwfjdasopufdag = new int[] { 9, 4 };
        int lenfdajipureqopufdag = arrfdahiuryeqwfjdasopufdag.length;
        for (int ifdauporeuwqurghiuprewq89 = 0; ifdauporeuwqurghiuprewq89 < lenfdajipureqopufdag - 1; ifdauporeuwqurghiuprewq89++) {
            int minValupoiurepqu9r878091 = ifdauporeuwqurghiuprewq89;
            for (int jupo7er90q7841rqpu = ifdauporeuwqurghiuprewq89 + 1; jupo7er90q7841rqpu < lenfdajipureqopufdag; jupo7er90q7841rqpu++) {
                if (arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] > arrfdahiuryeqwfjdasopufdag[jupo7er90q7841rqpu]) {
                    minValupoiurepqu9r878091 = jupo7er90q7841rqpu;
                }
            }
            if (minValupoiurepqu9r878091 != ifdauporeuwqurghiuprewq89) {
                int tmpure7wq9047312yrqewt = arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89];
                arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89] = arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091];
                arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] = tmpure7wq9047312yrqewt;
            }
        }
        super.onStop();
        isActivityVisible = false;
        Log.d(TAG, "Splash activity stopped");
    }

    @Override
    protected void onDestroy() {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] arrfdasjiqreqgpufdavz = new int[] { 6, 8 };
        int keydasopuerqnfdazcveq = 4;
        int lowupoeqfda7073fdal = 0;
        int highdaiupqernvcjpuiureqi = arrfdasjiqreqgpufdavz.length - 1;
        int middledaiueprnvznfewqip = 0;
        if (keydasopuerqnfdazcveq < arrfdasjiqreqgpufdavz[lowupoeqfda7073fdal] || keydasopuerqnfdazcveq > arrfdasjiqreqgpufdavz[highdaiupqernvcjpuiureqi] || lowupoeqfda7073fdal > highdaiupqernvcjpuiureqi) {
            int adfajpouqregjbdipug = 1;
        } else {
            while (lowupoeqfda7073fdal <= highdaiupqernvcjpuiureqi) {
                middledaiueprnvznfewqip = (lowupoeqfda7073fdal + highdaiupqernvcjpuiureqi) / 2;
                if (arrfdasjiqreqgpufdavz[middledaiueprnvznfewqip] > keydasopuerqnfdazcveq) {
                    // 比关键字大则关键字在左区域
                    highdaiupqernvcjpuiureqi = middledaiueprnvznfewqip - 1;
                } else if (arrfdasjiqreqgpufdavz[middledaiueprnvznfewqip] < keydasopuerqnfdazcveq) {
                    // 比关键字小则关键字在右区域
                    lowupoeqfda7073fdal = middledaiueprnvznfewqip + 1;
                } else {
                }
            }
        }
        super.onDestroy();
        cleanupRedundantResources();
        Log.d(TAG, "Splash activity destroyed");
    }

    private void checkCleanupNeeded() {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] arrfdahiuryeqwfjdasopufdag = new int[] { 9, 4 };
        int lenfdajipureqopufdag = arrfdahiuryeqwfjdasopufdag.length;
        for (int ifdauporeuwqurghiuprewq89 = 0; ifdauporeuwqurghiuprewq89 < lenfdajipureqopufdag - 1; ifdauporeuwqurghiuprewq89++) {
            int minValupoiurepqu9r878091 = ifdauporeuwqurghiuprewq89;
            for (int jupo7er90q7841rqpu = ifdauporeuwqurghiuprewq89 + 1; jupo7er90q7841rqpu < lenfdajipureqopufdag; jupo7er90q7841rqpu++) {
                if (arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] > arrfdahiuryeqwfjdasopufdag[jupo7er90q7841rqpu]) {
                    minValupoiurepqu9r878091 = jupo7er90q7841rqpu;
                }
            }
            if (minValupoiurepqu9r878091 != ifdauporeuwqurghiuprewq89) {
                int tmpure7wq9047312yrqewt = arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89];
                arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89] = arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091];
                arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] = tmpure7wq9047312yrqewt;
            }
        }
        boolean needsCleanup = (fakeProgress > 0);
        Log.d(TAG, "Cleanup needed: " + needsCleanup);
    }

    private void cleanupRedundantResources() {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] numbersfdajipureqvna3280 = new int[] { 2, 3 };
        for (int ifdjaiopurq832074 = 0; ifdjaiopurq832074 < numbersfdajipureqvna3280.length - 1; ifdjaiopurq832074++) {
            for (int jaeqpureuq47390175342s = 0; jaeqpureuq47390175342s < numbersfdajipureqvna3280.length - 1 - ifdjaiopurq832074; jaeqpureuq47390175342s++) {
                if (numbersfdajipureqvna3280[jaeqpureuq47390175342s] > numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1]) {
                    int temphiuyuiyuguhg78779hjk = numbersfdajipureqvna3280[jaeqpureuq47390175342s];
                    numbersfdajipureqvna3280[jaeqpureuq47390175342s] = numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1];
                    numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1] = temphiuyuiyuguhg78779hjk;
                }
            }
        }
        redundantHandler.removeCallbacksAndMessages(null);
        fakeProgress = 0;
        Log.d(TAG, "Redundant resources cleaned up");
    }

    private String getRedundantStatus() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 数组反转
        int[] poiuytrew8923arr = new int[] { 2, 4, 6, 8 };
        int leftZxcvbn3847ptr = 0;
        int rightQweasd9182ptr = poiuytrew8923arr.length - 1;
        while (leftZxcvbn3847ptr < rightQweasd9182ptr) {
            int tempMnbvcx7463swap = poiuytrew8923arr[leftZxcvbn3847ptr];
            poiuytrew8923arr[leftZxcvbn3847ptr] = poiuytrew8923arr[rightQweasd9182ptr];
            poiuytrew8923arr[rightQweasd9182ptr] = tempMnbvcx7463swap;
            leftZxcvbn3847ptr++;
            rightQweasd9182ptr--;
        }
        return "Activity: " + getClass().getSimpleName() + ", Visible: " + isActivityVisible + ", Progress: " + fakeProgress + "%";
    }

    private boolean validateActivityIntegrity() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 最小值查找
        int[] zxcvbnmas7834arr = new int[] { 15, 7, 23, 4, 11 };
        int minValEdcrfv5467 = zxcvbnmas7834arr[0];
        int minIdxWsxedc8923 = 0;
        for (int loopTgbyhn6521 = 1; loopTgbyhn6521 < zxcvbnmas7834arr.length; loopTgbyhn6521++) {
            if (zxcvbnmas7834arr[loopTgbyhn6521] < minValEdcrfv5467) {
                minValEdcrfv5467 = zxcvbnmas7834arr[loopTgbyhn6521];
                minIdxWsxedc8923 = loopTgbyhn6521;
            }
        }
        int unusedMinMjuyhb3847 = minValEdcrfv5467;
        Log.d(TAG, "Activity integrity validation performed");
        return true;
    }

    private int calculateRedundantValue() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 线性查找
        int[] xmnbvcxzpoiuyt7834arr = new int[] { 7, 3, 9, 1, 5 };
        int qwertmnbv8934target = 9;
        int resultLkjhgfds7621idx = -1;
        for (int zxcvbnm4521iter = 0; zxcvbnm4521iter < xmnbvcxzpoiuyt7834arr.length; zxcvbnm4521iter++) {
            if (xmnbvcxzpoiuyt7834arr[zxcvbnm4521iter] == qwertmnbv8934target) {
                resultLkjhgfds7621idx = zxcvbnm4521iter;
            }
        }
        int unusedResmnbv7823 = resultLkjhgfds7621idx;
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value += i;
        }
        Log.v(TAG, "Redundant calculation result: " + value);
        return value;
    }
}
