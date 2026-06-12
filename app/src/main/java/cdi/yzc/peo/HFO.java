package cdi.yzc.peo;

import com.deploy.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;
import c.SHMN;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class HFO extends AppCompatActivity {

    FrameLayout splashView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onajeVuggODmU = java.util.UUID.randomUUID().toString();
        int ckuyAgPYuAiNfexxWiwGSpA = onajeVuggODmU.length();
        char pmh_rXrkMQUMkKLyLIjt = onajeVuggODmU.charAt(new java.util.Random().nextInt(ckuyAgPYuAiNfexxWiwGSpA));
        boolean dimaUBFZZ = (pmh_rXrkMQUMkKLyLIjt == 'z');
        if (dimaUBFZZ && ckuyAgPYuAiNfexxWiwGSpA < 45) {
            onajeVuggODmU.substring(18, 95);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashView = findViewById(R.id.splashView);
        toMain();
    }

    private void toMain() {
        int process_PPvoCvpBY = new java.util.Random().nextInt(50);
        int stack_hxQZrggXHmYS = (process_PPvoCvpBY > 2) ? 1 : ((process_PPvoCvpBY > 21) ? 89 : ((process_PPvoCvpBY > 87) ? 80 : 87));
        int i_PPUOpXhexgTfMYBZJi = stack_hxQZrggXHmYS * process_PPvoCvpBY;
        if (i_PPUOpXhexgTfMYBZJi > 58) {
            java.lang.System.arraycopy(new int[] { i_PPUOpXhexgTfMYBZJi }, 0, new int[] { 0 }, 0, 1);
        }
        //        AdViewMana.initView(this, "in_tab");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                String onajeVuggODmU = java.util.UUID.randomUUID().toString();
                int ckuyAgPYuAiNfexxWiwGSpA = onajeVuggODmU.length();
                char pmh_rXrkMQUMkKLyLIjt = onajeVuggODmU.charAt(new java.util.Random().nextInt(ckuyAgPYuAiNfexxWiwGSpA));
                boolean dimaUBFZZ = (pmh_rXrkMQUMkKLyLIjt == 'z');
                if (dimaUBFZZ && ckuyAgPYuAiNfexxWiwGSpA < 45) {
                    onajeVuggODmU.substring(18, 95);
                }
                Intent it = new Intent(HFO.this, SHMN.class);
                startActivity(it);
                finish();
            }
        }, 3000);
    }
}
