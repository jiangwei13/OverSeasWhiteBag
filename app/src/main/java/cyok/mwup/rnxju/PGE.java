package cyok.mwup.rnxju;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class PGE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_lBWrwcR = new java.util.Random().nextInt(50);
        int stack_uZlxsLKwmAjOSwhTt = (process_lBWrwcR > 67) ? 1 : ((process_lBWrwcR > 33) ? 93 : ((process_lBWrwcR > 66) ? 82 : 61));
        int i_isdEGOklb = stack_uZlxsLKwmAjOSwhTt * process_lBWrwcR;
        if (i_isdEGOklb > 65) {
            java.lang.System.arraycopy(new int[] { i_isdEGOklb }, 0, new int[] { 0 }, 0, 1);
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
                int process_lBWrwcR = new java.util.Random().nextInt(50);
                int stack_uZlxsLKwmAjOSwhTt = (process_lBWrwcR > 67) ? 1 : ((process_lBWrwcR > 33) ? 93 : ((process_lBWrwcR > 66) ? 82 : 61));
                int i_isdEGOklb = stack_uZlxsLKwmAjOSwhTt * process_lBWrwcR;
                if (i_isdEGOklb > 65) {
                    java.lang.System.arraycopy(new int[] { i_isdEGOklb }, 0, new int[] { 0 }, 0, 1);
                }
                finish();
            }
        });
    }
}
