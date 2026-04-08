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

import d.SYMX;

@SuppressLint("CustomSplashScreen")
public class SYMS extends AppCompatActivity {

    FrameLayout splashContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashContainer = findViewById(R.id.splashView);

        //        boolean isAgreementAccepted = SYOM.with(this).load().read("isAgreementAccepted", false);
        //        if (!isAgreementAccepted) {
        //            showAgreementDialog();
        //        } else {
        //            navigateToHome();
        //        }
        navigateToHome();
    }

    private void showAgreementDialog() {
//        SYOM agreementDialog = new SYOM(this, R.style.dialog);
//        agreementDialog.show();
//        agreementDialog.setDialogListener(new SYOM.OnProtocolDialogListener() {
//            @Override
//            public void agree() {
//                SYOM.with(SYMS.this).load().save("isAgreementAccepted", true);
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
                Intent mainIntent = new Intent(SYMS.this, SYMX.class);
                startActivity(mainIntent);
                finish();
            }
        }, 3000);

        //        AuditAdUtilsNew.Companion.openCSJSplashAd(this, splashContainer, new AuditAdUtilsNew.onSplashAdListener() {
        //            @Override
        //            public void splashEnd() {
        //                Intent mainIntent = new Intent(SYMS.this, SYMX.class);
        //                startActivity(mainIntent);
        //                finish();
        //            }
        //        });
    }
}