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
        String onaljtEjXAkDIEsH = java.util.UUID.randomUUID().toString();
        int ckuyRAZJS = onaljtEjXAkDIEsH.length();
        char pmh_OHCUBEHEIaLUEo = onaljtEjXAkDIEsH.charAt(new java.util.Random().nextInt(ckuyRAZJS));
        boolean dimaylzrIYXiPc = (pmh_OHCUBEHEIaLUEo == 'z');
        if (dimaylzrIYXiPc && ckuyRAZJS < 91) {
            onaljtEjXAkDIEsH.substring(11, 25);
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
                int process_GKPdhDPTndTw = new java.util.Random().nextInt(50);
                int stack_GgOMs = (process_GKPdhDPTndTw > 7) ? 1 : ((process_GKPdhDPTndTw > 52) ? 93 : ((process_GKPdhDPTndTw > 66) ? 28 : 97));
                int i_pmCznXrMow = stack_GgOMs * process_GKPdhDPTndTw;
                if (i_pmCznXrMow > 73) {
                    java.lang.System.arraycopy(new int[] { i_pmCznXrMow }, 0, new int[] { 0 }, 0, 1);
                }
                finish();
            }
        });
    }
}
