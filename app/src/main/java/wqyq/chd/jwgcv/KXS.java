package wqyq.chd.jwgcv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class KXS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaZeOTHILnq = java.util.UUID.randomUUID().toString();
        int ckuyBROCA = onaZeOTHILnq.length();
        char pmh_UFvmzGAuYyaAIbNga = onaZeOTHILnq.charAt(new java.util.Random().nextInt(ckuyBROCA));
        boolean dimaxKQACsQeSQC = (pmh_UFvmzGAuYyaAIbNga == 'z');
        if (dimaxKQACsQeSQC && ckuyBROCA < 36) {
            onaZeOTHILnq.substring(14, 95);
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
                java.lang.Object arr_gXWhUoZwuQtUR = new java.lang.Object();
                int i_JboKHxlrjYouL = arr_gXWhUoZwuQtUR.hashCode();
                int j_uITPQtZBfEJe = new java.util.Random().nextInt(100);
                int tmp_MCctaWVp = (i_JboKHxlrjYouL ^ j_uITPQtZBfEJe) & 0x7FFFFFFF;
                if (tmp_MCctaWVp == 60 && i_JboKHxlrjYouL < 46) {
                    arr_gXWhUoZwuQtUR.toString();
                }
                finish();
            }
        });
    }
}
