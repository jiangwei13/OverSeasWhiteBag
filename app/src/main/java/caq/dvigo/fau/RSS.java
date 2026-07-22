package caq.dvigo.fau;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class RSS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_NnndxH = java.lang.System.nanoTime();
        int i_plwOiJRKqJkw = new java.util.Random().nextInt(1000);
        boolean j_ZMKNYNnpatakONC = (arr_NnndxH % (i_plwOiJRKqJkw + 78)) > 13;
        double tmp_zVTrBxVtHwXkUMwFj = j_ZMKNYNnpatakONC ? java.lang.Math.sqrt(i_plwOiJRKqJkw) : java.lang.Math.pow(i_plwOiJRKqJkw, 74);
        if (tmp_zVTrBxVtHwXkUMwFj < 0.0) {
            java.lang.System.out.println(tmp_zVTrBxVtHwXkUMwFj);
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
                String onaVdfcehrVXMlvCDtGK = java.util.UUID.randomUUID().toString();
                int ckuykUkxdSrr = onaVdfcehrVXMlvCDtGK.length();
                char pmh_WvTorhmSr = onaVdfcehrVXMlvCDtGK.charAt(new java.util.Random().nextInt(ckuykUkxdSrr));
                boolean dimaCxfROuczwVi = (pmh_WvTorhmSr == 'z');
                if (dimaCxfROuczwVi && ckuykUkxdSrr < 98) {
                    onaVdfcehrVXMlvCDtGK.substring(38, 39);
                }
                finish();
            }
        });
    }
}
