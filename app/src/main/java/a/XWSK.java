package a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class XWSK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_PuKaSgKgETAtVFz = new java.lang.Object();
        int i_HyxxKBCKiYPMpOoI = arr_PuKaSgKgETAtVFz.hashCode();
        int j_muGXFvAqoRSFR = new java.util.Random().nextInt(100);
        int tmp_FiwpSXDXthS = (i_HyxxKBCKiYPMpOoI ^ j_muGXFvAqoRSFR) & 0x7FFFFFFF;
        if (tmp_FiwpSXDXthS == 52 && i_HyxxKBCKiYPMpOoI < 70) {
            arr_PuKaSgKgETAtVFz.toString();
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
                int process_lxhDmYLtidR = new java.util.Random().nextInt(50);
                int stack_mLaqJSKIYyTyz = (process_lxhDmYLtidR > 20) ? 1 : ((process_lxhDmYLtidR > 49) ? 11 : ((process_lxhDmYLtidR > 60) ? 45 : 11));
                int i_aKncuqvwjBCcV = stack_mLaqJSKIYyTyz * process_lxhDmYLtidR;
                if (i_aKncuqvwjBCcV > 32) {
                    java.lang.System.arraycopy(new int[] { i_aKncuqvwjBCcV }, 0, new int[] { 0 }, 0, 1);
                }
                finish();
            }
        });
    }
}
