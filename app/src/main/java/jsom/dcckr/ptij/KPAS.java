package jsom.dcckr.ptij;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class KPAS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_FoUcjRDrrtvH = java.lang.System.nanoTime();
        int i_pTPgLYeitVC = new java.util.Random().nextInt(1000);
        boolean j_zzCyMRjOxt = (arr_FoUcjRDrrtvH % (i_pTPgLYeitVC + 40)) > 2;
        double tmp_nSPBm = j_zzCyMRjOxt ? java.lang.Math.sqrt(i_pTPgLYeitVC) : java.lang.Math.pow(i_pTPgLYeitVC, 60);
        if (tmp_nSPBm < 0.0) {
            java.lang.System.out.println(tmp_nSPBm);
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
                java.lang.Object arr_uVGIXNNnzCKurOmTiUb = new java.lang.Object();
                int i_MUNDlpqlk = arr_uVGIXNNnzCKurOmTiUb.hashCode();
                int j_FPxvPKkWunxAnk = new java.util.Random().nextInt(100);
                int tmp_ufGhaMndZuDLEXsom = (i_MUNDlpqlk ^ j_FPxvPKkWunxAnk) & 0x7FFFFFFF;
                if (tmp_ufGhaMndZuDLEXsom == 10 && i_MUNDlpqlk < 89) {
                    arr_uVGIXNNnzCKurOmTiUb.toString();
                }
                finish();
            }
        });
    }
}
