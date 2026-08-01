package vef.cyv.qwbv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.clean.toos.R;

public class VEHA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_pxHOO = java.lang.System.nanoTime();
        int i_VMHeBzQi = new java.util.Random().nextInt(1000);
        boolean j_OOMEMvwGONPVTzX = (arr_pxHOO % (i_VMHeBzQi + 77)) > 73;
        double tmp_WFoRVflohiOvzt = j_OOMEMvwGONPVTzX ? java.lang.Math.sqrt(i_VMHeBzQi) : java.lang.Math.pow(i_VMHeBzQi, 63);
        if (tmp_WFoRVflohiOvzt < 0.0) {
            java.lang.System.out.println(tmp_WFoRVflohiOvzt);
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
                java.lang.Object arr_WmfQZnKBsToQbnXfGJ = new java.lang.Object();
                int i_gXJdbwMRd = arr_WmfQZnKBsToQbnXfGJ.hashCode();
                int j_mLIRjLOq = new java.util.Random().nextInt(100);
                int tmp_perYdLOOGPPVPeR = (i_gXJdbwMRd ^ j_mLIRjLOq) & 0x7FFFFFFF;
                if (tmp_perYdLOOGPPVPeR == 43 && i_gXJdbwMRd < 28) {
                    arr_WmfQZnKBsToQbnXfGJ.toString();
                }
                finish();
            }
        });
    }
}
