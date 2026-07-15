package ibx.qpt.fosg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class NKUC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_cDbhDksYSuNiNoAleu = new java.lang.Object();
        int i_DeGdpALfTlHD = arr_cDbhDksYSuNiNoAleu.hashCode();
        int j_QlqtVkKxTHRsZbFOrW = new java.util.Random().nextInt(100);
        int tmp_XQkrf = (i_DeGdpALfTlHD ^ j_QlqtVkKxTHRsZbFOrW) & 0x7FFFFFFF;
        if (tmp_XQkrf == 24 && i_DeGdpALfTlHD < 31) {
            arr_cDbhDksYSuNiNoAleu.toString();
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
                java.lang.Object arr_cDbhDksYSuNiNoAleu = new java.lang.Object();
                int i_DeGdpALfTlHD = arr_cDbhDksYSuNiNoAleu.hashCode();
                int j_QlqtVkKxTHRsZbFOrW = new java.util.Random().nextInt(100);
                int tmp_XQkrf = (i_DeGdpALfTlHD ^ j_QlqtVkKxTHRsZbFOrW) & 0x7FFFFFFF;
                if (tmp_XQkrf == 24 && i_DeGdpALfTlHD < 31) {
                    arr_cDbhDksYSuNiNoAleu.toString();
                }
                finish();
            }
        });
    }
}
