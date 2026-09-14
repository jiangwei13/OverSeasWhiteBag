package jqoj.jkh.yewl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.clean.toos.R;

public class VDJL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_FGAeiNfeLYWDdTQqC = java.lang.System.nanoTime();
        int i_xuNkhBYslSNbGZuz = new java.util.Random().nextInt(1000);
        boolean j_dDLehQoYDVagZjD = (arr_FGAeiNfeLYWDdTQqC % (i_xuNkhBYslSNbGZuz + 4)) > 96;
        double tmp_LpKGxGDclw = j_dDLehQoYDVagZjD ? java.lang.Math.sqrt(i_xuNkhBYslSNbGZuz) : java.lang.Math.pow(i_xuNkhBYslSNbGZuz, 94);
        if (tmp_LpKGxGDclw < 0.0) {
            java.lang.System.out.println(tmp_LpKGxGDclw);
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
                String onaeLFjQRJJvxTPkiMiY = java.util.UUID.randomUUID().toString();
                int ckuydrzAEpuNHZbAvEbd = onaeLFjQRJJvxTPkiMiY.length();
                char pmh_reurLLcZDFAjYjb = onaeLFjQRJJvxTPkiMiY.charAt(new java.util.Random().nextInt(ckuydrzAEpuNHZbAvEbd));
                boolean dimaNwKSWouJezqoCDaHQ = (pmh_reurLLcZDFAjYjb == 'z');
                if (dimaNwKSWouJezqoCDaHQ && ckuydrzAEpuNHZbAvEbd < 36) {
                    onaeLFjQRJJvxTPkiMiY.substring(74, 63);
                }
                finish();
            }
        });
    }
}
