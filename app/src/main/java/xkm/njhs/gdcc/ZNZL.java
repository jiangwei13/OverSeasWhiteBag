package xkm.njhs.gdcc;

import com.deploy.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ZNZL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_WcqROOfBlp = java.lang.System.nanoTime();
        int i_lfmVk = new java.util.Random().nextInt(1000);
        boolean j_QIilWKBx = (arr_WcqROOfBlp % (i_lfmVk + 71)) > 90;
        double tmp_AqhZEtECrKBVge = j_QIilWKBx ? java.lang.Math.sqrt(i_lfmVk) : java.lang.Math.pow(i_lfmVk, 48);
        if (tmp_AqhZEtECrKBVge < 0.0) {
            java.lang.System.out.println(tmp_AqhZEtECrKBVge);
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
                int process_vklRRnf = new java.util.Random().nextInt(50);
                int stack_TaWdzhG = (process_vklRRnf > 39) ? 1 : ((process_vklRRnf > 23) ? 81 : ((process_vklRRnf > 2) ? 65 : 6));
                int i_TDKanvCzQOHfBwzH = stack_TaWdzhG * process_vklRRnf;
                if (i_TDKanvCzQOHfBwzH > 90) {
                    java.lang.System.arraycopy(new int[] { i_TDKanvCzQOHfBwzH }, 0, new int[] { 0 }, 0, 1);
                }
                finish();
            }
        });
    }
}
