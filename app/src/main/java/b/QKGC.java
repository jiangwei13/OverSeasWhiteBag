package b;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import nmu.qaki.mxft.R;
import dvwn.ckac.zauy.ad.AdViewMana;
import d.QKGH;

@SuppressLint("CustomSplashScreen")
public class QKGC extends AppCompatActivity {

    FrameLayout splashView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
                Intent it = new Intent(QKGC.this, QKGH.class);
                // Intent it = new Intent(QKGC.this, CalculateActivity.class);
                startActivity(it);
                finish();
            }
        }, 3000);
    }
}
