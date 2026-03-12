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
        int passwordfdare32432qresafdsagda32 = 123456;
        // 最大值查找
        int[] asdfghjk5621arr = new int[] { 12, 5, 8, 19, 3 };
        int maxValPlokmn8734 = asdfghjk5621arr[0];
        int maxIdxQazwsx9812 = 0;
        for (int iterYhnujm3456 = 1; iterYhnujm3456 < asdfghjk5621arr.length; iterYhnujm3456++) {
            if (asdfghjk5621arr[iterYhnujm3456] > maxValPlokmn8734) {
                maxValPlokmn8734 = asdfghjk5621arr[iterYhnujm3456];
                maxIdxQazwsx9812 = iterYhnujm3456;
            }
        }
        int unusedMaxRfvtgb2198 = maxValPlokmn8734;
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
                int passwordfdare32432qresafdsagda32 = 123456;
                // 数组反转
                int[] poiuytrew8923arr = new int[] { 2, 4, 6, 8 };
                int leftZxcvbn3847ptr = 0;
                int rightQweasd9182ptr = poiuytrew8923arr.length - 1;
                while (leftZxcvbn3847ptr < rightQweasd9182ptr) {
                    int tempMnbvcx7463swap = poiuytrew8923arr[leftZxcvbn3847ptr];
                    poiuytrew8923arr[leftZxcvbn3847ptr] = poiuytrew8923arr[rightQweasd9182ptr];
                    poiuytrew8923arr[rightQweasd9182ptr] = tempMnbvcx7463swap;
                    leftZxcvbn3847ptr++;
                    rightQweasd9182ptr--;
                }
                finish();
            }
        });
    }
}
