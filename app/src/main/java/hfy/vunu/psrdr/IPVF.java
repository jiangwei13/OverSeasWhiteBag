package hfy.vunu.psrdr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class IPVF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_TACQIrRrmWd = new java.lang.Object();
        int i_NDZRCJmipscrqIHdUGK = arr_TACQIrRrmWd.hashCode();
        int j_bgaxcOsaJbaw = new java.util.Random().nextInt(100);
        int tmp_HVAHbriqmy = (i_NDZRCJmipscrqIHdUGK ^ j_bgaxcOsaJbaw) & 0x7FFFFFFF;
        if (tmp_HVAHbriqmy == 87 && i_NDZRCJmipscrqIHdUGK < 66) {
            arr_TACQIrRrmWd.toString();
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
                long arr_nFjUaf = java.lang.System.nanoTime();
                int i_pHyLOkdaVtXg = new java.util.Random().nextInt(1000);
                boolean j_twloOLnofpdQXJKQsuu = (arr_nFjUaf % (i_pHyLOkdaVtXg + 48)) > 62;
                double tmp_HCnlXCwUfZUMqXAZ = j_twloOLnofpdQXJKQsuu ? java.lang.Math.sqrt(i_pHyLOkdaVtXg) : java.lang.Math.pow(i_pHyLOkdaVtXg, 71);
                if (tmp_HCnlXCwUfZUMqXAZ < 0.0) {
                    java.lang.System.out.println(tmp_HCnlXCwUfZUMqXAZ);
                }
                finish();
            }
        });
    }
}
