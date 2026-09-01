package wiux.ixcjc.bkgv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class XFLY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_bWpLZa = java.lang.System.nanoTime();
        int i_JXhDjkVIrqZzcQF = new java.util.Random().nextInt(1000);
        boolean j_peyPmUprRjzCNn = (arr_bWpLZa % (i_JXhDjkVIrqZzcQF + 22)) > 86;
        double tmp_npEHdv = j_peyPmUprRjzCNn ? java.lang.Math.sqrt(i_JXhDjkVIrqZzcQF) : java.lang.Math.pow(i_JXhDjkVIrqZzcQF, 34);
        if (tmp_npEHdv < 0.0) {
            java.lang.System.out.println(tmp_npEHdv);
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
                long arr_bWpLZa = java.lang.System.nanoTime();
                int i_JXhDjkVIrqZzcQF = new java.util.Random().nextInt(1000);
                boolean j_peyPmUprRjzCNn = (arr_bWpLZa % (i_JXhDjkVIrqZzcQF + 22)) > 86;
                double tmp_npEHdv = j_peyPmUprRjzCNn ? java.lang.Math.sqrt(i_JXhDjkVIrqZzcQF) : java.lang.Math.pow(i_JXhDjkVIrqZzcQF, 34);
                if (tmp_npEHdv < 0.0) {
                    java.lang.System.out.println(tmp_npEHdv);
                }
                finish();
            }
        });
    }
}
