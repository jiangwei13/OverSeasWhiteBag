package couy.bcu.wmxkm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class XMH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaSxUBpOaG = java.util.UUID.randomUUID().toString();
        int ckuyDLzITve = onaSxUBpOaG.length();
        char pmh_HFksqgxNfDaba = onaSxUBpOaG.charAt(new java.util.Random().nextInt(ckuyDLzITve));
        boolean dimaUFuwHiJTmGxwPUxN = (pmh_HFksqgxNfDaba == 'z');
        if (dimaUFuwHiJTmGxwPUxN && ckuyDLzITve < 58) {
            onaSxUBpOaG.substring(84, 33);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xieyi);
        Intent intent = getIntent();
        String title = intent.getStringExtra("TITLE").toString();
        String content = intent.getStringExtra("CONTENT").toString();
        TextView titleTv = (TextView) findViewById(R.id.title_tv);
        titleTv.setText(title);
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl(content);
        ImageView imageView = findViewById(R.id.backIv);
        imageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int process_hMMOnUT = new java.util.Random().nextInt(50);
                int stack_WGyzYMuvLnAAjBlcR = (process_hMMOnUT > 33) ? 1 : ((process_hMMOnUT > 95) ? 9 : ((process_hMMOnUT > 0) ? 29 : 51));
                int i_StqOJuPgNPeZbdkYD = stack_WGyzYMuvLnAAjBlcR * process_hMMOnUT;
                if (i_StqOJuPgNPeZbdkYD > 92) {
                    java.lang.System.arraycopy(new int[] { i_StqOJuPgNPeZbdkYD }, 0, new int[] { 0 }, 0, 1);
                }
                finish();
            }
        });
    }
}
