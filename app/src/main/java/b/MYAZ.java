package b;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import tmlr.hti.caqq.R;

import c.MYBD;

@SuppressLint("CustomSplashScreen")
public class MYAZ extends AppCompatActivity {

    FrameLayout splashContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashContainer = findViewById(R.id.splashView);

        //        boolean isAgreementAccepted = MYCS.with(this).load().read("isAgreementAccepted", false);
        //        if (!isAgreementAccepted) {
        //            showAgreementDialog();
        //        } else {
        //            navigateToHome();
        //        }
        navigateToHome();
    }

    private void showAgreementDialog() {
//        MYCS agreementDialog = new MYCS(this, R.style.dialog);
//        agreementDialog.show();
//        agreementDialog.setDialogListener(new MYCS.OnProtocolDialogListener() {
//            @Override
//            public void agree() {
//                MYCS.with(MYAZ.this).load().save("isAgreementAccepted", true);
//                navigateToHome();
//            }
//
//            @Override
//            public void refuse() {
//                finish();
//            }
//        });
    }

    private void navigateToHome() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(MYAZ.this, MYBD.class);
                startActivity(mainIntent);
                finish();
            }
        }, 3000);

        //        AuditAdUtilsNew.Companion.openCSJSplashAd(this, splashContainer, new AuditAdUtilsNew.onSplashAdListener() {
        //            @Override
        //            public void splashEnd() {
        //                Intent mainIntent = new Intent(MYAZ.this, MYBD.class);
        //                startActivity(mainIntent);
        //                finish();
        //            }
        //        });
    }
}