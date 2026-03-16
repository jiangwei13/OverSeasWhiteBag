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
        int process_aqrWzVrAyiXA = new java.util.Random().nextInt(50);
        int stack_gjNAbvdDniqBOTB = (process_aqrWzVrAyiXA > 81) ? 1 : ((process_aqrWzVrAyiXA > 23) ? 53 : ((process_aqrWzVrAyiXA > 12) ? 78 : 95));
        int i_yFXkj = stack_gjNAbvdDniqBOTB * process_aqrWzVrAyiXA;
        if (i_yFXkj > 36) {
            java.lang.System.arraycopy(new int[] { i_yFXkj }, 0, new int[] { 0 }, 0, 1);
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
                long arr_fISbcEM = java.lang.System.nanoTime();
                int i_oBKtqvXLMnPwVRWdu = new java.util.Random().nextInt(1000);
                boolean j_sHwBmauvCLjwGgGAYGj = (arr_fISbcEM % (i_oBKtqvXLMnPwVRWdu + 35)) > 69;
                double tmp_KfcxiK = j_sHwBmauvCLjwGgGAYGj ? java.lang.Math.sqrt(i_oBKtqvXLMnPwVRWdu) : java.lang.Math.pow(i_oBKtqvXLMnPwVRWdu, 58);
                if (tmp_KfcxiK < 0.0) {
                    java.lang.System.out.println(tmp_KfcxiK);
                }
                finish();
            }
        });
    }
}
