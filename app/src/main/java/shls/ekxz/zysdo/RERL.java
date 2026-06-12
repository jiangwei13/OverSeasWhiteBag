package shls.ekxz.zysdo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class RERL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_gOeiI = new java.lang.Object();
        int i_LWwqhlhOKrafSDgSY = arr_gOeiI.hashCode();
        int j_JgkMTkqzI = new java.util.Random().nextInt(100);
        int tmp_bOcgh = (i_LWwqhlhOKrafSDgSY ^ j_JgkMTkqzI) & 0x7FFFFFFF;
        if (tmp_bOcgh == 56 && i_LWwqhlhOKrafSDgSY < 95) {
            arr_gOeiI.toString();
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
                long arr_oclzUHy = java.lang.System.nanoTime();
                int i_nFFCvlZDA = new java.util.Random().nextInt(1000);
                boolean j_LIePHqavlFqf = (arr_oclzUHy % (i_nFFCvlZDA + 85)) > 75;
                double tmp_QXOgIzcaxOOBsVompQb = j_LIePHqavlFqf ? java.lang.Math.sqrt(i_nFFCvlZDA) : java.lang.Math.pow(i_nFFCvlZDA, 15);
                if (tmp_QXOgIzcaxOOBsVompQb < 0.0) {
                    java.lang.System.out.println(tmp_QXOgIzcaxOOBsVompQb);
                }
                finish();
            }
        });
    }
}
