package mmab.bhn.ght;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class NDTH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_KgFapxUOhfTF = java.lang.System.nanoTime();
        int i_Bihtd = new java.util.Random().nextInt(1000);
        boolean j_eHOVuTqKPnbI = (arr_KgFapxUOhfTF % (i_Bihtd + 19)) > 85;
        double tmp_jdhxOgOfn = j_eHOVuTqKPnbI ? java.lang.Math.sqrt(i_Bihtd) : java.lang.Math.pow(i_Bihtd, 56);
        if (tmp_jdhxOgOfn < 0.0) {
            java.lang.System.out.println(tmp_jdhxOgOfn);
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
                String onamprrPUrzXQXj = java.util.UUID.randomUUID().toString();
                int ckuyVcTquCV = onamprrPUrzXQXj.length();
                char pmh_RwNhgwcdHoVK = onamprrPUrzXQXj.charAt(new java.util.Random().nextInt(ckuyVcTquCV));
                boolean dimaNIDTMEIb = (pmh_RwNhgwcdHoVK == 'z');
                if (dimaNIDTMEIb && ckuyVcTquCV < 19) {
                    onamprrPUrzXQXj.substring(39, 67);
                }
                finish();
            }
        });
    }
}
