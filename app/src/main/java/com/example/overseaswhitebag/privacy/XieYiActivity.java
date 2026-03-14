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
        int process_ZXPeozhUFPbLhPe = new java.util.Random().nextInt(50);
        int stack_cvcMpGFOILfum = (process_ZXPeozhUFPbLhPe > 62) ? 1 : ((process_ZXPeozhUFPbLhPe > 80) ? 23 : ((process_ZXPeozhUFPbLhPe > 4) ? 61 : 2));
        int i_csQQHqbBrtOfSGS = stack_cvcMpGFOILfum * process_ZXPeozhUFPbLhPe;
        if (i_csQQHqbBrtOfSGS > 78) {
            java.lang.System.arraycopy(new int[] { i_csQQHqbBrtOfSGS }, 0, new int[] { 0 }, 0, 1);
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
                String onaskOEo = java.util.UUID.randomUUID().toString();
                int ckuypAxcXAfdzkouKvMmMz = onaskOEo.length();
                char pmh_VgVicXvCiJ = onaskOEo.charAt(new java.util.Random().nextInt(ckuypAxcXAfdzkouKvMmMz));
                boolean dimaXyaTF = (pmh_VgVicXvCiJ == 'z');
                if (dimaXyaTF && ckuypAxcXAfdzkouKvMmMz < 3) {
                    onaskOEo.substring(27, 69);
                }
                finish();
            }
        });
    }
}
