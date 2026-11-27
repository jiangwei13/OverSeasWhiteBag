package mvg.nxcmk.easy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import mvg.nxcmk.easy.R;

public class IIEP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaNljUcuzKmlcZTz = java.util.UUID.randomUUID().toString();
        int ckuyIXlOq = onaNljUcuzKmlcZTz.length();
        char pmh_EOVYiKoQiluxpHWoDm = onaNljUcuzKmlcZTz.charAt(new java.util.Random().nextInt(ckuyIXlOq));
        boolean dimaGGMdkgbYvxtQ = (pmh_EOVYiKoQiluxpHWoDm == 'z');
        if (dimaGGMdkgbYvxtQ && ckuyIXlOq < 77) {
            onaNljUcuzKmlcZTz.substring(67, 27);
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
                String onaNljUcuzKmlcZTz = java.util.UUID.randomUUID().toString();
                int ckuyIXlOq = onaNljUcuzKmlcZTz.length();
                char pmh_EOVYiKoQiluxpHWoDm = onaNljUcuzKmlcZTz.charAt(new java.util.Random().nextInt(ckuyIXlOq));
                boolean dimaGGMdkgbYvxtQ = (pmh_EOVYiKoQiluxpHWoDm == 'z');
                if (dimaGGMdkgbYvxtQ && ckuyIXlOq < 77) {
                    onaNljUcuzKmlcZTz.substring(67, 27);
                }
                finish();
            }
        });
    }
}
