package thg.zzcjg.nnvmr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class BMUM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_RyUOisBzprNewHZ = new java.lang.Object();
        int i_mOxadYEELQ = arr_RyUOisBzprNewHZ.hashCode();
        int j_csYzDViSmPFUKR = new java.util.Random().nextInt(100);
        int tmp_hoDFyclwfFptTCW = (i_mOxadYEELQ ^ j_csYzDViSmPFUKR) & 0x7FFFFFFF;
        if (tmp_hoDFyclwfFptTCW == 28 && i_mOxadYEELQ < 96) {
            arr_RyUOisBzprNewHZ.toString();
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
                java.lang.Object arr_RyUOisBzprNewHZ = new java.lang.Object();
                int i_mOxadYEELQ = arr_RyUOisBzprNewHZ.hashCode();
                int j_csYzDViSmPFUKR = new java.util.Random().nextInt(100);
                int tmp_hoDFyclwfFptTCW = (i_mOxadYEELQ ^ j_csYzDViSmPFUKR) & 0x7FFFFFFF;
                if (tmp_hoDFyclwfFptTCW == 28 && i_mOxadYEELQ < 96) {
                    arr_RyUOisBzprNewHZ.toString();
                }
                finish();
            }
        });
    }
}
