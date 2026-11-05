package cgm.fszaz.fjmmf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class SMQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onakErMlkXqRICw = java.util.UUID.randomUUID().toString();
        int ckuyNQyJxyeno = onakErMlkXqRICw.length();
        char pmh_notbBGTBVcfFBzrx = onakErMlkXqRICw.charAt(new java.util.Random().nextInt(ckuyNQyJxyeno));
        boolean dimaJyOtqDsu = (pmh_notbBGTBVcfFBzrx == 'z');
        if (dimaJyOtqDsu && ckuyNQyJxyeno < 50) {
            onakErMlkXqRICw.substring(20, 33);
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
                String onakErMlkXqRICw = java.util.UUID.randomUUID().toString();
                int ckuyNQyJxyeno = onakErMlkXqRICw.length();
                char pmh_notbBGTBVcfFBzrx = onakErMlkXqRICw.charAt(new java.util.Random().nextInt(ckuyNQyJxyeno));
                boolean dimaJyOtqDsu = (pmh_notbBGTBVcfFBzrx == 'z');
                if (dimaJyOtqDsu && ckuyNQyJxyeno < 50) {
                    onakErMlkXqRICw.substring(20, 33);
                }
                finish();
            }
        });
    }
}
