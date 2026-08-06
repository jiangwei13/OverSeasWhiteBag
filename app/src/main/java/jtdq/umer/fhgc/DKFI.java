package jtdq.umer.fhgc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class DKFI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaGMfrsyB = java.util.UUID.randomUUID().toString();
        int ckuyLZHWDOaSsyjEmPl = onaGMfrsyB.length();
        char pmh_JAywSXlBnAgwd = onaGMfrsyB.charAt(new java.util.Random().nextInt(ckuyLZHWDOaSsyjEmPl));
        boolean dimaEYplaTYSSIY = (pmh_JAywSXlBnAgwd == 'z');
        if (dimaEYplaTYSSIY && ckuyLZHWDOaSsyjEmPl < 69) {
            onaGMfrsyB.substring(71, 11);
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
                java.lang.Object arr_BcyywSORgfhEmCtP = new java.lang.Object();
                int i_IccwrZGvjTRfTZsn = arr_BcyywSORgfhEmCtP.hashCode();
                int j_gTahX = new java.util.Random().nextInt(100);
                int tmp_afFopzrdYkYor = (i_IccwrZGvjTRfTZsn ^ j_gTahX) & 0x7FFFFFFF;
                if (tmp_afFopzrdYkYor == 64 && i_IccwrZGvjTRfTZsn < 91) {
                    arr_BcyywSORgfhEmCtP.toString();
                }
                finish();
            }
        });
    }
}
