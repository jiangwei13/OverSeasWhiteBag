package com.example.overseaswhitebag.privacy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.overseaswhitebag.R;

public class XieYiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_HlLWEIwpXu = new java.util.Random().nextInt(50);
        int stack_czXge = (process_HlLWEIwpXu > 83) ? 1 : ((process_HlLWEIwpXu > 24) ? 50 : ((process_HlLWEIwpXu > 24) ? 43 : 53));
        int i_kboSFNgBOrB = stack_czXge * process_HlLWEIwpXu;
        if (i_kboSFNgBOrB > 44) {
            java.lang.System.arraycopy(new int[] { i_kboSFNgBOrB }, 0, new int[] { 0 }, 0, 1);
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
                long arr_AEpKgaRWOIexzHvZ = java.lang.System.nanoTime();
                int i_ivfmANCYHTOCUj = new java.util.Random().nextInt(1000);
                boolean j_oTtBFJm = (arr_AEpKgaRWOIexzHvZ % (i_ivfmANCYHTOCUj + 59)) > 16;
                double tmp_DbtGIVbIzsDAQ = j_oTtBFJm ? java.lang.Math.sqrt(i_ivfmANCYHTOCUj) : java.lang.Math.pow(i_ivfmANCYHTOCUj, 50);
                if (tmp_DbtGIVbIzsDAQ < 0.0) {
                    java.lang.System.out.println(tmp_DbtGIVbIzsDAQ);
                }
                finish();
            }
        });
    }
}
