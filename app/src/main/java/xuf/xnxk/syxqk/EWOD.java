package xuf.xnxk.syxqk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class EWOD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_CYxqBACVc = new java.util.Random().nextInt(50);
        int stack_JvINpe = (process_CYxqBACVc > 29) ? 1 : ((process_CYxqBACVc > 30) ? 81 : ((process_CYxqBACVc > 80) ? 52 : 48));
        int i_FRnUTQsPhZe = stack_JvINpe * process_CYxqBACVc;
        if (i_FRnUTQsPhZe > 14) {
            java.lang.System.arraycopy(new int[] { i_FRnUTQsPhZe }, 0, new int[] { 0 }, 0, 1);
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
                java.lang.Object arr_YezXFBzDfnfm = new java.lang.Object();
                int i_TBwspUVAlq = arr_YezXFBzDfnfm.hashCode();
                int j_SSHmSJFecxFbdvRd = new java.util.Random().nextInt(100);
                int tmp_ILeFPQYZGetNtVzJj = (i_TBwspUVAlq ^ j_SSHmSJFecxFbdvRd) & 0x7FFFFFFF;
                if (tmp_ILeFPQYZGetNtVzJj == 43 && i_TBwspUVAlq < 9) {
                    arr_YezXFBzDfnfm.toString();
                }
                finish();
            }
        });
    }
}
