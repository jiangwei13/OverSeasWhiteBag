package efei;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;
import xktv.nacw.iwsqc.R;
import efen.RXBU;
import androidx.appcompat.app.AppCompatActivity;
import com.p.b.ad.AdViewMana;

@SuppressLint("CustomSplashScreen")
public class RXBM extends AppCompatActivity {

    FrameLayout splashView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        // 方法名称修改：initializeApp -> 原注释代码
        initializeApp();
    }

    private void showUserAgreement() {
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
        RXCC protocolDialog = new RXCC(this, R.style.dialog);
        protocolDialog.show();
        protocolDialog.setOnProtocolDialogListener(new RXCC.OnProtocolDialogListener() {

            @Override
            public void agree() {
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
                RXCD.with(RXBM.this).load().save("isAgressment", true);
                navigateToMainScreen();
            }

            @Override
            public void refuse() {
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
                finish();
            }
        });
    }

    private void initializeApp() {
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
        // }
        navigateToMainScreen();
    }

    private void navigateToMainScreen() {
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
        AdViewMana.initView(this, "in_tab");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
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
                Intent it = new Intent(RXBM.this, RXBU.class);
                startActivity(it);
                finish();
            }
        }, 3000);
    }
    // 方法名称修改：displayAdvertisement -> 原注释代码逻辑
    /*
    private void displayAdvertisement() {
        AuditAdUtilsNew.Companion.openCSJSplashAd(this, splashView, new AuditAdUtilsNew.onSplashAdListener() {
            @Override
            public void splashEnd() {
                Intent it = new Intent(RXBM.this, ScanMenuActivity.class);
                startActivity(it);
                finish();
            }
        });
    }
    */
}
