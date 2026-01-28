package efei;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;

import xktv.nacw.iwsqc.R;
import efen.RXBU;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class RXBM extends AppCompatActivity {

    FrameLayout splashView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);

        // 方法名称修改：initializeApp -> 原注释代码
        initializeApp();
    }

    private void showUserAgreement() {
        RXCC protocolDialog = new RXCC(this, R.style.dialog);
        protocolDialog.show();
        protocolDialog.setOnProtocolDialogListener(new RXCC.OnProtocolDialogListener() {
            @Override
            public void agree() {
                RXCD.with(RXBM.this).load().save("isAgressment", true);
                navigateToMainScreen();
            }

            @Override
            public void refuse() {
                finish();
            }
        });
    }

    private void initializeApp() {
        // 方法名称修改：initializeApp -> 原注释代码逻辑
        // boolean isAgressment = RXCD.with(this).load().read("isAgressment", false);
        // if (!isAgressment) {
        //     showUserAgreement();
        // } else {
        //     navigateToMainScreen();
        // }
        navigateToMainScreen();
    }

    private void navigateToMainScreen() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent it = new Intent(RXBM.this, RXBU.class);
                startActivity(it);
                finish();
            }
        }, 3000);

        // 方法名称修改：displayAdvertisement -> 原注释代码逻辑
        // displayAdvertisement();
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