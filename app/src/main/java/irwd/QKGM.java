package irwd;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.clean.toos.R;

import irwf.QKGZ;


@SuppressLint("CustomSplashScreen")
public class QKGM extends AppCompatActivity {


    FrameLayout splashdrawView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashdrawView = findViewById(R.id.splashdrawView);


//        boolean isAgressment = QKHR.with(this).load().read("isAgressment", false);
//        if (!isAgressment) {
//            showProtocolDialog();
//        } else {
//            toMain();
//        }
        toDrawMain();
    }

    private void showProtocolDialog() {
        QKHQ protocolDialog = new QKHQ(this, R.style.dialog);
        protocolDialog.show();
        protocolDialog.setOnProtocolDialogListener(new QKHQ.OnProtocolDialogListener() {
            @Override
            public void agree() {
                QKHR.with(QKGM.this).load().save("isAgressment", true);
                toDrawMain();
            }

            @Override
            public void refuse() {
                finish();
            }
        });
    }

    private void toDrawMain() {


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent it = new Intent(QKGM.this, QKGZ.class);
                startActivity(it);
                finish();

            }
        },3000);


//        AuditAdUtilsNew.Companion.openCSJSplashAd(this, splashView, new AuditAdUtilsNew.onSplashAdListener() {
//            @Override
//            public void splashEnd() {
//                Intent it = new Intent(QKGM.this, QKGZ.class);
//                startActivity(it);
//                finish();
//            }
//        });



    }
}