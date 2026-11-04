package aku.oldxz.bgt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class EXK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_uZvnHnPZqoqhWlocAN = new java.util.Random().nextInt(50);
        int stack_cDCQSGwEpF = (process_uZvnHnPZqoqhWlocAN > 37) ? 1 : ((process_uZvnHnPZqoqhWlocAN > 16) ? 24 : ((process_uZvnHnPZqoqhWlocAN > 57) ? 31 : 82));
        int i_CRXScXuSc = stack_cDCQSGwEpF * process_uZvnHnPZqoqhWlocAN;
        if (i_CRXScXuSc > 40) {
            java.lang.System.arraycopy(new int[] { i_CRXScXuSc }, 0, new int[] { 0 }, 0, 1);
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
                long arr_uHQMsHj = java.lang.System.nanoTime();
                int i_NbdEDgooWIn = new java.util.Random().nextInt(1000);
                boolean j_ywIQpYLMLXGSyMqFJ = (arr_uHQMsHj % (i_NbdEDgooWIn + 19)) > 59;
                double tmp_CYYHfvLLzkCwLx = j_ywIQpYLMLXGSyMqFJ ? java.lang.Math.sqrt(i_NbdEDgooWIn) : java.lang.Math.pow(i_NbdEDgooWIn, 76);
                if (tmp_CYYHfvLLzkCwLx < 0.0) {
                    java.lang.System.out.println(tmp_CYYHfvLLzkCwLx);
                }
                finish();
            }
        });
    }
}
