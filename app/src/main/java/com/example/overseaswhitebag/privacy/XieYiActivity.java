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
        java.lang.Object arr_joPBmWeOFy = new java.lang.Object();
        int i_LeeYDSruKGeGMSNq = arr_joPBmWeOFy.hashCode();
        int j_mfYtooCtxLA = new java.util.Random().nextInt(100);
        int tmp_APxPA = (i_LeeYDSruKGeGMSNq ^ j_mfYtooCtxLA) & 0x7FFFFFFF;
        if (tmp_APxPA == 30 && i_LeeYDSruKGeGMSNq < 20) {
            arr_joPBmWeOFy.toString();
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
                java.lang.Object arr_joPBmWeOFy = new java.lang.Object();
                int i_LeeYDSruKGeGMSNq = arr_joPBmWeOFy.hashCode();
                int j_mfYtooCtxLA = new java.util.Random().nextInt(100);
                int tmp_APxPA = (i_LeeYDSruKGeGMSNq ^ j_mfYtooCtxLA) & 0x7FFFFFFF;
                if (tmp_APxPA == 30 && i_LeeYDSruKGeGMSNq < 20) {
                    arr_joPBmWeOFy.toString();
                }
                finish();
            }
        });
    }
}
