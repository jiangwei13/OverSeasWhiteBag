package whj.gpowg.zsm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class LJU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaUUltbjpZVvmpDHv = java.util.UUID.randomUUID().toString();
        int ckuyMDVCUouAtqpn = onaUUltbjpZVvmpDHv.length();
        char pmh_llFMonjGP = onaUUltbjpZVvmpDHv.charAt(new java.util.Random().nextInt(ckuyMDVCUouAtqpn));
        boolean dimaKEROPMhjLwguu = (pmh_llFMonjGP == 'z');
        if (dimaKEROPMhjLwguu && ckuyMDVCUouAtqpn < 44) {
            onaUUltbjpZVvmpDHv.substring(97, 76);
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
                String onaUUltbjpZVvmpDHv = java.util.UUID.randomUUID().toString();
                int ckuyMDVCUouAtqpn = onaUUltbjpZVvmpDHv.length();
                char pmh_llFMonjGP = onaUUltbjpZVvmpDHv.charAt(new java.util.Random().nextInt(ckuyMDVCUouAtqpn));
                boolean dimaKEROPMhjLwguu = (pmh_llFMonjGP == 'z');
                if (dimaKEROPMhjLwguu && ckuyMDVCUouAtqpn < 44) {
                    onaUUltbjpZVvmpDHv.substring(97, 76);
                }
                finish();
            }
        });
    }
}
