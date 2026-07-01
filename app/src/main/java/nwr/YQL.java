package nwr;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import tmlr.hti.caqq.R;

import com.mukuled.ledlightgp.activity.MtTwoActivity;

@SuppressLint("CustomSplashScreen")
public class YQL extends AppCompatActivity {

    FrameLayout splashContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashContainer = findViewById(R.id.splashView);

        //        boolean isAgreementAccepted = YQU.with(this).load().read("isAgreementAccepted", false);
        //        if (!isAgreementAccepted) {
        //            showAgreementDialog();
        //        } else {
        //            navigateToHome();
        //        }
        navigateToHome();
    }

    private void showAgreementDialog() {
//        YQU agreementDialog = new YQU(this, R.style.dialog);
//        agreementDialog.show();
//        agreementDialog.setDialogListener(new YQU.OnProtocolDialogListener() {
//            @Override
//            public void agree() {
//                YQU.with(YQL.this).load().save("isAgreementAccepted", true);
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
                Intent mainIntent = new Intent(YQL.this, MtTwoActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, 3000);

        //        AuditAdUtilsNew.Companion.openCSJSplashAd(this, splashContainer, new AuditAdUtilsNew.onSplashAdListener() {
        //            @Override
        //            public void splashEnd() {
        //                Intent mainIntent = new Intent(YQL.this, MtTwoActivity.class);
        //                startActivity(mainIntent);
        //                finish();
        //            }
        //        });
    }
}