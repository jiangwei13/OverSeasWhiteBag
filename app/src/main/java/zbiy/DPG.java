package zbiy;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.clean.toos.R;
import rxyv.ktc.pvhk.DPX;
import com.xian.bc.utils.ContrlBtnShow;

@SuppressLint("CustomSplashScreen")
public class DPG extends AppCompatActivity {

    FrameLayout splashContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] values = new int[] { 2, 3 };
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashContainer = findViewById(R.id.splashView);
        // }
        navigateToMain();
    }

    private void displayProtocolDialog() {
    }

    private void navigateToMain() {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] values = new int[] { 2, 3 };
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                int passwordfdare32432qresafdsagda32 = 123456;
                int[] items = new int[] { 9, 4 };
                int length = items.length;
                for (int i = 0; i < length - 1; i++) {
                    int minIndex = i;
                    for (int j = i + 1; j < length; j++) {
                        if (items[minIndex] > items[j]) {
                            minIndex = j;
                        }
                    }
                    if (minIndex != i) {
                        int temp = items[i];
                        items[i] = items[minIndex];
                        items[minIndex] = temp;
                    }
                }
                Intent intent = new Intent(DPG.this, DPX.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
