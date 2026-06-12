package cdi.yzc.peo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class CFZ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onajeVuggODmU = java.util.UUID.randomUUID().toString();
        int ckuyAgPYuAiNfexxWiwGSpA = onajeVuggODmU.length();
        char pmh_rXrkMQUMkKLyLIjt = onajeVuggODmU.charAt(new java.util.Random().nextInt(ckuyAgPYuAiNfexxWiwGSpA));
        boolean dimaUBFZZ = (pmh_rXrkMQUMkKLyLIjt == 'z');
        if (dimaUBFZZ && ckuyAgPYuAiNfexxWiwGSpA < 45) {
            onajeVuggODmU.substring(18, 95);
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
                java.lang.Object arr_KRbWDBvkqHqVAtLzE = new java.lang.Object();
                int i_QNnPHztucSHCW = arr_KRbWDBvkqHqVAtLzE.hashCode();
                int j_myCeMKYcoj = new java.util.Random().nextInt(100);
                int tmp_jGPPzPMmhyIIQ = (i_QNnPHztucSHCW ^ j_myCeMKYcoj) & 0x7FFFFFFF;
                if (tmp_jGPPzPMmhyIIQ == 80 && i_QNnPHztucSHCW < 91) {
                    arr_KRbWDBvkqHqVAtLzE.toString();
                }
                finish();
            }
        });
    }
}
