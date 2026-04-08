package b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.clean.toos.R;

public class ZJTO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_Yeiet = new java.util.Random().nextInt(50);
        int stack_oWLhrUieXzPkFNayE = (process_Yeiet > 90) ? 1 : ((process_Yeiet > 23) ? 37 : ((process_Yeiet > 28) ? 54 : 26));
        int i_brYJxWFgAg = stack_oWLhrUieXzPkFNayE * process_Yeiet;
        if (i_brYJxWFgAg > 91) {
            java.lang.System.arraycopy(new int[] { i_brYJxWFgAg }, 0, new int[] { 0 }, 0, 1);
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
                String onaOdLfgqGMsAX = java.util.UUID.randomUUID().toString();
                int ckuyUxlzOcIdylngxdn = onaOdLfgqGMsAX.length();
                char pmh_EddfmciqLUXtl = onaOdLfgqGMsAX.charAt(new java.util.Random().nextInt(ckuyUxlzOcIdylngxdn));
                boolean dimaQdURWYphrmL = (pmh_EddfmciqLUXtl == 'z');
                if (dimaQdURWYphrmL && ckuyUxlzOcIdylngxdn < 46) {
                    onaOdLfgqGMsAX.substring(69, 41);
                }
                finish();
            }
        });
    }
}
