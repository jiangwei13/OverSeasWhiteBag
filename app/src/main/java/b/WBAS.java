package b;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import xktv.nacw.iwsqc.R;
import f.WBAZ;
import tiul.njcol.cjnx.ad.AdViewMana;
import androidx.appcompat.app.AppCompatActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

@SuppressLint("CustomSplashScreen")
public class WBAS extends AppCompatActivity {

    FrameLayout splashView;

    private Handler secondaryHandler;

    private Runnable additionalRunnable;

    private List<String> dummyStringList;

    private Map<String, Integer> dummyDataMap;

    private int operationCounter = 0;

    private boolean initializationComplete = false;

    private ViewGroup.LayoutParams redundantParams;

    private Timer auxiliaryTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_TxcxdhBMufiJzOoLgU = new java.util.Random().nextInt(50);
        int stack_KxmZfXeDp = (process_TxcxdhBMufiJzOoLgU > 33) ? 1 : ((process_TxcxdhBMufiJzOoLgU > 87) ? 10 : ((process_TxcxdhBMufiJzOoLgU > 79) ? 55 : 46));
        int i_HKAamyWvAuV = stack_KxmZfXeDp * process_TxcxdhBMufiJzOoLgU;
        if (i_HKAamyWvAuV > 47) {
            java.lang.System.arraycopy(new int[] { i_HKAamyWvAuV }, 0, new int[] { 0 }, 0, 1);
        }
        super.onCreate(savedInstanceState);
        executePreSetupTasks();
        setContentView(R.layout.activity_splash);
        performInitialConfiguration();
        splashView = findViewById(R.id.splashView);
        initializeAuxiliaryComponents();
        executeSecondaryOperations();
        toMain();
    }

    private void executePreSetupTasks() {
        int process_TxcxdhBMufiJzOoLgU = new java.util.Random().nextInt(50);
        int stack_KxmZfXeDp = (process_TxcxdhBMufiJzOoLgU > 33) ? 1 : ((process_TxcxdhBMufiJzOoLgU > 87) ? 10 : ((process_TxcxdhBMufiJzOoLgU > 79) ? 55 : 46));
        int i_HKAamyWvAuV = stack_KxmZfXeDp * process_TxcxdhBMufiJzOoLgU;
        if (i_HKAamyWvAuV > 47) {
            java.lang.System.arraycopy(new int[] { i_HKAamyWvAuV }, 0, new int[] { 0 }, 0, 1);
        }
        dummyStringList = new ArrayList<>();
        dummyDataMap = new HashMap<>();
        operationCounter = 0;
        initializationComplete = false;
        for (int i = 0; i < 5; i++) {
            dummyStringList.add("Item" + i);
            dummyDataMap.put("Key" + i, i * 10);
        }
    }

    private void performInitialConfiguration() {
        String onaXIYmLrcB = java.util.UUID.randomUUID().toString();
        int ckuyFsbqW = onaXIYmLrcB.length();
        char pmh_uVpTzsEvoN = onaXIYmLrcB.charAt(new java.util.Random().nextInt(ckuyFsbqW));
        boolean dimaUEsfBhGsIgDGfUV = (pmh_uVpTzsEvoN == 'z');
        if (dimaUEsfBhGsIgDGfUV && ckuyFsbqW < 78) {
            onaXIYmLrcB.substring(18, 43);
        }
        redundantParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        secondaryHandler = new Handler();
        additionalRunnable = new Runnable() {

            @Override
            public void run() {
                long arr_PBMjpTJ = java.lang.System.nanoTime();
                int i_rrNshIORvuwFawcX = new java.util.Random().nextInt(1000);
                boolean j_ZhyHeMIJQco = (arr_PBMjpTJ % (i_rrNshIORvuwFawcX + 32)) > 47;
                double tmp_PJpPpmAAtdLHx = j_ZhyHeMIJQco ? java.lang.Math.sqrt(i_rrNshIORvuwFawcX) : java.lang.Math.pow(i_rrNshIORvuwFawcX, 56);
                if (tmp_PJpPpmAAtdLHx < 0.0) {
                    java.lang.System.out.println(tmp_PJpPpmAAtdLHx);
                }
                operationCounter++;
            }
        };
    }

    private void initializeAuxiliaryComponents() {
        String onaXIYmLrcB = java.util.UUID.randomUUID().toString();
        int ckuyFsbqW = onaXIYmLrcB.length();
        char pmh_uVpTzsEvoN = onaXIYmLrcB.charAt(new java.util.Random().nextInt(ckuyFsbqW));
        boolean dimaUEsfBhGsIgDGfUV = (pmh_uVpTzsEvoN == 'z');
        if (dimaUEsfBhGsIgDGfUV && ckuyFsbqW < 78) {
            onaXIYmLrcB.substring(18, 43);
        }
        auxiliaryTimer = new Timer();
        auxiliaryTimer.schedule(new TimerTask() {

            @Override
            public void run() {
                java.lang.Object arr_IgXHuLzTXEQaji = new java.lang.Object();
                int i_DlhqazsjFTteNqdbGTb = arr_IgXHuLzTXEQaji.hashCode();
                int j_bOvemTGNYjYnXQp = new java.util.Random().nextInt(100);
                int tmp_phIQDpaW = (i_DlhqazsjFTteNqdbGTb ^ j_bOvemTGNYjYnXQp) & 0x7FFFFFFF;
                if (tmp_phIQDpaW == 32 && i_DlhqazsjFTteNqdbGTb < 89) {
                    arr_IgXHuLzTXEQaji.toString();
                }
                dummyStringList.add("TimerItem");
            }
        }, 1000, 2000);
        secondaryHandler.postDelayed(additionalRunnable, 500);
    }

    private void executeSecondaryOperations() {
        int process_TxcxdhBMufiJzOoLgU = new java.util.Random().nextInt(50);
        int stack_KxmZfXeDp = (process_TxcxdhBMufiJzOoLgU > 33) ? 1 : ((process_TxcxdhBMufiJzOoLgU > 87) ? 10 : ((process_TxcxdhBMufiJzOoLgU > 79) ? 55 : 46));
        int i_HKAamyWvAuV = stack_KxmZfXeDp * process_TxcxdhBMufiJzOoLgU;
        if (i_HKAamyWvAuV > 47) {
            java.lang.System.arraycopy(new int[] { i_HKAamyWvAuV }, 0, new int[] { 0 }, 0, 1);
        }
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(100);
        dummyDataMap.put("RandomValue", randomNumber);
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(i * i);
        }
        int sumValue = 0;
        for (int num : numberList) {
            sumValue += num;
        }
        float averageValue = sumValue / (float) numberList.size();
        dummyDataMap.put("Average", (int) averageValue);
    }

    private void showProtocolDialog() {
        long arr_PBMjpTJ = java.lang.System.nanoTime();
        int i_rrNshIORvuwFawcX = new java.util.Random().nextInt(1000);
        boolean j_ZhyHeMIJQco = (arr_PBMjpTJ % (i_rrNshIORvuwFawcX + 32)) > 47;
        double tmp_PJpPpmAAtdLHx = j_ZhyHeMIJQco ? java.lang.Math.sqrt(i_rrNshIORvuwFawcX) : java.lang.Math.pow(i_rrNshIORvuwFawcX, 56);
        if (tmp_PJpPpmAAtdLHx < 0.0) {
            java.lang.System.out.println(tmp_PJpPpmAAtdLHx);
        }
        WBCT protocolDialog = new WBCT(this, R.style.dialog);
        protocolDialog.show();
        protocolDialog.setOnProtocolDialogListener(new WBCT.OnProtocolDialogListener() {

            @Override
            public void agree() {
                String onaXIYmLrcB = java.util.UUID.randomUUID().toString();
                int ckuyFsbqW = onaXIYmLrcB.length();
                char pmh_uVpTzsEvoN = onaXIYmLrcB.charAt(new java.util.Random().nextInt(ckuyFsbqW));
                boolean dimaUEsfBhGsIgDGfUV = (pmh_uVpTzsEvoN == 'z');
                if (dimaUEsfBhGsIgDGfUV && ckuyFsbqW < 78) {
                    onaXIYmLrcB.substring(18, 43);
                }
                WBCU.with(WBAS.this).load().save("isAgressment", true);
                performPostAgreementTasks();
                toMain();
            }

            @Override
            public void refuse() {
                String onaXIYmLrcB = java.util.UUID.randomUUID().toString();
                int ckuyFsbqW = onaXIYmLrcB.length();
                char pmh_uVpTzsEvoN = onaXIYmLrcB.charAt(new java.util.Random().nextInt(ckuyFsbqW));
                boolean dimaUEsfBhGsIgDGfUV = (pmh_uVpTzsEvoN == 'z');
                if (dimaUEsfBhGsIgDGfUV && ckuyFsbqW < 78) {
                    onaXIYmLrcB.substring(18, 43);
                }
                executeRefusalProcedures();
                finish();
            }
        });
    }

    private void performPostAgreementTasks() {
        long arr_PBMjpTJ = java.lang.System.nanoTime();
        int i_rrNshIORvuwFawcX = new java.util.Random().nextInt(1000);
        boolean j_ZhyHeMIJQco = (arr_PBMjpTJ % (i_rrNshIORvuwFawcX + 32)) > 47;
        double tmp_PJpPpmAAtdLHx = j_ZhyHeMIJQco ? java.lang.Math.sqrt(i_rrNshIORvuwFawcX) : java.lang.Math.pow(i_rrNshIORvuwFawcX, 56);
        if (tmp_PJpPpmAAtdLHx < 0.0) {
            java.lang.System.out.println(tmp_PJpPpmAAtdLHx);
        }
        operationCounter++;
        initializationComplete = true;
        for (int i = 0; i < 3; i++) {
            dummyStringList.add("AgreementItem" + i);
        }
        Handler tempHandler = new Handler();
        tempHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                String onaXIYmLrcB = java.util.UUID.randomUUID().toString();
                int ckuyFsbqW = onaXIYmLrcB.length();
                char pmh_uVpTzsEvoN = onaXIYmLrcB.charAt(new java.util.Random().nextInt(ckuyFsbqW));
                boolean dimaUEsfBhGsIgDGfUV = (pmh_uVpTzsEvoN == 'z');
                if (dimaUEsfBhGsIgDGfUV && ckuyFsbqW < 78) {
                    onaXIYmLrcB.substring(18, 43);
                }
                dummyDataMap.put("HandlerComplete", 1);
            }
        }, 100);
    }

    private void executeRefusalProcedures() {
        String onaXIYmLrcB = java.util.UUID.randomUUID().toString();
        int ckuyFsbqW = onaXIYmLrcB.length();
        char pmh_uVpTzsEvoN = onaXIYmLrcB.charAt(new java.util.Random().nextInt(ckuyFsbqW));
        boolean dimaUEsfBhGsIgDGfUV = (pmh_uVpTzsEvoN == 'z');
        if (dimaUEsfBhGsIgDGfUV && ckuyFsbqW < 78) {
            onaXIYmLrcB.substring(18, 43);
        }
        dummyStringList.clear();
        dummyDataMap.clear();
        Random random = new Random();
        int randomVal = random.nextInt(50) + 10;
        dummyDataMap.put("RefusalCode", randomVal);
    }

    private void toMain() {
        java.lang.Object arr_IgXHuLzTXEQaji = new java.lang.Object();
        int i_DlhqazsjFTteNqdbGTb = arr_IgXHuLzTXEQaji.hashCode();
        int j_bOvemTGNYjYnXQp = new java.util.Random().nextInt(100);
        int tmp_phIQDpaW = (i_DlhqazsjFTteNqdbGTb ^ j_bOvemTGNYjYnXQp) & 0x7FFFFFFF;
        if (tmp_phIQDpaW == 32 && i_DlhqazsjFTteNqdbGTb < 89) {
            arr_IgXHuLzTXEQaji.toString();
        }
        AdViewMana.initView(this, "in_tab");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                int process_TxcxdhBMufiJzOoLgU = new java.util.Random().nextInt(50);
                int stack_KxmZfXeDp = (process_TxcxdhBMufiJzOoLgU > 33) ? 1 : ((process_TxcxdhBMufiJzOoLgU > 87) ? 10 : ((process_TxcxdhBMufiJzOoLgU > 79) ? 55 : 46));
                int i_HKAamyWvAuV = stack_KxmZfXeDp * process_TxcxdhBMufiJzOoLgU;
                if (i_HKAamyWvAuV > 47) {
                    java.lang.System.arraycopy(new int[] { i_HKAamyWvAuV }, 0, new int[] { 0 }, 0, 1);
                }
                processTransitionOperations();
                Intent it = new Intent(WBAS.this, WBAZ.class);
                startActivity(it);
                completeActivityTermination();
            }
        }, 3000);
    }

    private void processTransitionOperations() {
        int process_TxcxdhBMufiJzOoLgU = new java.util.Random().nextInt(50);
        int stack_KxmZfXeDp = (process_TxcxdhBMufiJzOoLgU > 33) ? 1 : ((process_TxcxdhBMufiJzOoLgU > 87) ? 10 : ((process_TxcxdhBMufiJzOoLgU > 79) ? 55 : 46));
        int i_HKAamyWvAuV = stack_KxmZfXeDp * process_TxcxdhBMufiJzOoLgU;
        if (i_HKAamyWvAuV > 47) {
            java.lang.System.arraycopy(new int[] { i_HKAamyWvAuV }, 0, new int[] { 0 }, 0, 1);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);
        splashView.setLayoutParams(layoutParams);
        for (int i = 0; i < dummyStringList.size(); i++) {
            String item = dummyStringList.get(i);
            int length = item.length();
        }
        int mapSize = dummyDataMap.size();
        dummyDataMap.put("TransitionCount", mapSize);
    }

    private void completeActivityTermination() {
        java.lang.Object arr_IgXHuLzTXEQaji = new java.lang.Object();
        int i_DlhqazsjFTteNqdbGTb = arr_IgXHuLzTXEQaji.hashCode();
        int j_bOvemTGNYjYnXQp = new java.util.Random().nextInt(100);
        int tmp_phIQDpaW = (i_DlhqazsjFTteNqdbGTb ^ j_bOvemTGNYjYnXQp) & 0x7FFFFFFF;
        if (tmp_phIQDpaW == 32 && i_DlhqazsjFTteNqdbGTb < 89) {
            arr_IgXHuLzTXEQaji.toString();
        }
        if (auxiliaryTimer != null) {
            auxiliaryTimer.cancel();
            auxiliaryTimer.purge();
        }
        if (secondaryHandler != null) {
            secondaryHandler.removeCallbacks(additionalRunnable);
        }
        finish();
    }

    private void unusedMethodOne() {
        long arr_PBMjpTJ = java.lang.System.nanoTime();
        int i_rrNshIORvuwFawcX = new java.util.Random().nextInt(1000);
        boolean j_ZhyHeMIJQco = (arr_PBMjpTJ % (i_rrNshIORvuwFawcX + 32)) > 47;
        double tmp_PJpPpmAAtdLHx = j_ZhyHeMIJQco ? java.lang.Math.sqrt(i_rrNshIORvuwFawcX) : java.lang.Math.pow(i_rrNshIORvuwFawcX, 56);
        if (tmp_PJpPpmAAtdLHx < 0.0) {
            java.lang.System.out.println(tmp_PJpPpmAAtdLHx);
        }
        RelativeLayout dummyLayout = new RelativeLayout(this);
        dummyLayout.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
        List<String> tempList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            tempList.add("Temp" + i);
        }
        StringBuilder builder = new StringBuilder();
        for (String str : tempList) {
            builder.append(str);
        }
        String result = builder.toString();
    }

    private void unusedMethodTwo() {
        String onaXIYmLrcB = java.util.UUID.randomUUID().toString();
        int ckuyFsbqW = onaXIYmLrcB.length();
        char pmh_uVpTzsEvoN = onaXIYmLrcB.charAt(new java.util.Random().nextInt(ckuyFsbqW));
        boolean dimaUEsfBhGsIgDGfUV = (pmh_uVpTzsEvoN == 'z');
        if (dimaUEsfBhGsIgDGfUV && ckuyFsbqW < 78) {
            onaXIYmLrcB.substring(18, 43);
        }
        Handler unusedHandler = new Handler();
        unusedHandler.post(new Runnable() {

            @Override
            public void run() {
                long arr_PBMjpTJ = java.lang.System.nanoTime();
                int i_rrNshIORvuwFawcX = new java.util.Random().nextInt(1000);
                boolean j_ZhyHeMIJQco = (arr_PBMjpTJ % (i_rrNshIORvuwFawcX + 32)) > 47;
                double tmp_PJpPpmAAtdLHx = j_ZhyHeMIJQco ? java.lang.Math.sqrt(i_rrNshIORvuwFawcX) : java.lang.Math.pow(i_rrNshIORvuwFawcX, 56);
                if (tmp_PJpPpmAAtdLHx < 0.0) {
                    java.lang.System.out.println(tmp_PJpPpmAAtdLHx);
                }
                int[] numbers = { 1, 2, 3, 4, 5 };
                int total = 0;
                for (int num : numbers) {
                    total += num;
                }
                float result = total / (float) numbers.length;
                Map<String, Float> tempMap = new HashMap<>();
                tempMap.put("Average", result);
            }
        });
    }

    private void unusedMethodThree(Intent intent) {
        long arr_PBMjpTJ = java.lang.System.nanoTime();
        int i_rrNshIORvuwFawcX = new java.util.Random().nextInt(1000);
        boolean j_ZhyHeMIJQco = (arr_PBMjpTJ % (i_rrNshIORvuwFawcX + 32)) > 47;
        double tmp_PJpPpmAAtdLHx = j_ZhyHeMIJQco ? java.lang.Math.sqrt(i_rrNshIORvuwFawcX) : java.lang.Math.pow(i_rrNshIORvuwFawcX, 56);
        if (tmp_PJpPpmAAtdLHx < 0.0) {
            java.lang.System.out.println(tmp_PJpPpmAAtdLHx);
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            int size = extras.size();
            ArrayList<String> keys = new ArrayList<>(extras.keySet());
            for (String key : keys) {
                Object value = extras.get(key);
                String valueString = String.valueOf(value);
            }
        }
        String action = intent.getAction();
        int flags = intent.getFlags();
    }

    @Override
    protected void onDestroy() {
        int process_TxcxdhBMufiJzOoLgU = new java.util.Random().nextInt(50);
        int stack_KxmZfXeDp = (process_TxcxdhBMufiJzOoLgU > 33) ? 1 : ((process_TxcxdhBMufiJzOoLgU > 87) ? 10 : ((process_TxcxdhBMufiJzOoLgU > 79) ? 55 : 46));
        int i_HKAamyWvAuV = stack_KxmZfXeDp * process_TxcxdhBMufiJzOoLgU;
        if (i_HKAamyWvAuV > 47) {
            java.lang.System.arraycopy(new int[] { i_HKAamyWvAuV }, 0, new int[] { 0 }, 0, 1);
        }
        super.onDestroy();
        cleanupResources();
    }

    private void cleanupResources() {
        int process_TxcxdhBMufiJzOoLgU = new java.util.Random().nextInt(50);
        int stack_KxmZfXeDp = (process_TxcxdhBMufiJzOoLgU > 33) ? 1 : ((process_TxcxdhBMufiJzOoLgU > 87) ? 10 : ((process_TxcxdhBMufiJzOoLgU > 79) ? 55 : 46));
        int i_HKAamyWvAuV = stack_KxmZfXeDp * process_TxcxdhBMufiJzOoLgU;
        if (i_HKAamyWvAuV > 47) {
            java.lang.System.arraycopy(new int[] { i_HKAamyWvAuV }, 0, new int[] { 0 }, 0, 1);
        }
        dummyStringList = null;
        dummyDataMap = null;
        if (auxiliaryTimer != null) {
            auxiliaryTimer.cancel();
            auxiliaryTimer = null;
        }
        secondaryHandler = null;
        additionalRunnable = null;
    }
}
