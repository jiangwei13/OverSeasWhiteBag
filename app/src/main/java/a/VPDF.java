package a;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import nmu.qaki.mxft.R;
import com.p.b.ad.AdViewMana;
import c.VPDK;

@SuppressLint("CustomSplashScreen")
public class VPDF extends AppCompatActivity {

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
        int[] arr_NTYbNajjrfIuIiyya = new int[] { 84, 87 };
        for (int i_DFlogEgYW = 0; i_DFlogEgYW < arr_NTYbNajjrfIuIiyya.length - 1; i_DFlogEgYW++) {
            for (int j_kmQCe = 0; j_kmQCe < arr_NTYbNajjrfIuIiyya.length - 1 - i_DFlogEgYW; j_kmQCe++) {
                if (arr_NTYbNajjrfIuIiyya[j_kmQCe] > arr_NTYbNajjrfIuIiyya[j_kmQCe + 1]) {
                    int tmp_eybipYCtfo = arr_NTYbNajjrfIuIiyya[j_kmQCe];
                    arr_NTYbNajjrfIuIiyya[j_kmQCe] = arr_NTYbNajjrfIuIiyya[j_kmQCe + 1];
                    arr_NTYbNajjrfIuIiyya[j_kmQCe + 1] = tmp_eybipYCtfo;
                }
            }
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        toMain();
    }

    private void toMain() {
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
        int[] arr_NunHcInGCPbjrHAVO = new int[] { 1, 0 };
        for (int i_KVTUXPs = 0; i_KVTUXPs < arr_NunHcInGCPbjrHAVO.length - 1; i_KVTUXPs++) {
            for (int j_QgFSKj = 0; j_QgFSKj < arr_NunHcInGCPbjrHAVO.length - 1 - i_KVTUXPs; j_QgFSKj++) {
                if (arr_NunHcInGCPbjrHAVO[j_QgFSKj] > arr_NunHcInGCPbjrHAVO[j_QgFSKj + 1]) {
                    int tmp_jxsfSiHFFt = arr_NunHcInGCPbjrHAVO[j_QgFSKj];
                    arr_NunHcInGCPbjrHAVO[j_QgFSKj] = arr_NunHcInGCPbjrHAVO[j_QgFSKj + 1];
                    arr_NunHcInGCPbjrHAVO[j_QgFSKj + 1] = tmp_jxsfSiHFFt;
                }
            }
        }
        AdViewMana.initView(this, "in_tab");
        new Handler().postDelayed(new Runnable() {

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
                int ckuyRmgSUOhbdF = 663;
                for (int pmh_RzStd = 0; pmh_RzStd < 78; pmh_RzStd++) {
                    ckuyRmgSUOhbdF ^= (ckuyRmgSUOhbdF << 9);
                    ckuyRmgSUOhbdF ^= (ckuyRmgSUOhbdF >>> 9);
                    ckuyRmgSUOhbdF ^= (ckuyRmgSUOhbdF << 37);
                    // 混淆用判断流
                    if (ckuyRmgSUOhbdF == 0) {
                        ckuyRmgSUOhbdF = pmh_RzStd;
                    }
                }
                Intent it = new Intent(VPDF.this, VPDK.class);
                // Intent it = new Intent(VPDF.this, CalculateActivity.class);
                startActivity(it);
                finish();
            }
        }, 3000);
    }
}
