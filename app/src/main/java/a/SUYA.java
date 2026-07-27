package a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class SUYA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_yhqXkxJIHijCCutUeH = new java.lang.Object();
        int i_CxfIG = arr_yhqXkxJIHijCCutUeH.hashCode();
        int j_xkGcQj = new java.util.Random().nextInt(100);
        int tmp_xzJRguQBe = (i_CxfIG ^ j_xkGcQj) & 0x7FFFFFFF;
        if (tmp_xzJRguQBe == 81 && i_CxfIG < 21) {
            arr_yhqXkxJIHijCCutUeH.toString();
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
                long arr_BzlGVb = java.lang.System.nanoTime();
                int i_PkLXnfaWwm = new java.util.Random().nextInt(1000);
                boolean j_AWVMtrkeMusKVSAz = (arr_BzlGVb % (i_PkLXnfaWwm + 70)) > 40;
                double tmp_GzdUdWLPr = j_AWVMtrkeMusKVSAz ? java.lang.Math.sqrt(i_PkLXnfaWwm) : java.lang.Math.pow(i_PkLXnfaWwm, 47);
                if (tmp_GzdUdWLPr < 0.0) {
                    java.lang.System.out.println(tmp_GzdUdWLPr);
                }
                finish();
            }
        });
    }
}
