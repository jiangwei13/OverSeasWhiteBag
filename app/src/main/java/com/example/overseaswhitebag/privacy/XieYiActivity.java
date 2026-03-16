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
        int process_xSwDYRV = new java.util.Random().nextInt(50);
        int stack_uXfKml = (process_xSwDYRV > 93) ? 1 : ((process_xSwDYRV > 86) ? 79 : ((process_xSwDYRV > 4) ? 15 : 8));
        int i_yIBLFLJKIvZiAfBd = stack_uXfKml * process_xSwDYRV;
        if (i_yIBLFLJKIvZiAfBd > 30) {
            java.lang.System.arraycopy(new int[] { i_yIBLFLJKIvZiAfBd }, 0, new int[] { 0 }, 0, 1);
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
                int process_xSwDYRV = new java.util.Random().nextInt(50);
                int stack_uXfKml = (process_xSwDYRV > 93) ? 1 : ((process_xSwDYRV > 86) ? 79 : ((process_xSwDYRV > 4) ? 15 : 8));
                int i_yIBLFLJKIvZiAfBd = stack_uXfKml * process_xSwDYRV;
                if (i_yIBLFLJKIvZiAfBd > 30) {
                    java.lang.System.arraycopy(new int[] { i_yIBLFLJKIvZiAfBd }, 0, new int[] { 0 }, 0, 1);
                }
                finish();
            }
        });
    }
}
