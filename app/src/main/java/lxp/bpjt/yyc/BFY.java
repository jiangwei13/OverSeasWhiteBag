package lxp.bpjt.yyc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class BFY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_atPlqjmEmBnlmjoY = java.lang.System.nanoTime();
        int i_ICPxQOgcfjFQ = new java.util.Random().nextInt(1000);
        boolean j_IQGbtFBQuFclUlEP = (arr_atPlqjmEmBnlmjoY % (i_ICPxQOgcfjFQ + 85)) > 48;
        double tmp_MxaJktHzEUzdX = j_IQGbtFBQuFclUlEP ? java.lang.Math.sqrt(i_ICPxQOgcfjFQ) : java.lang.Math.pow(i_ICPxQOgcfjFQ, 16);
        if (tmp_MxaJktHzEUzdX < 0.0) {
            java.lang.System.out.println(tmp_MxaJktHzEUzdX);
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
                int process_uPICXBqGiXfkr = new java.util.Random().nextInt(50);
                int stack_JLzQHk = (process_uPICXBqGiXfkr > 44) ? 1 : ((process_uPICXBqGiXfkr > 72) ? 22 : ((process_uPICXBqGiXfkr > 66) ? 18 : 23));
                int i_cxBepWsKxuawMXXlg = stack_JLzQHk * process_uPICXBqGiXfkr;
                if (i_cxBepWsKxuawMXXlg > 46) {
                    java.lang.System.arraycopy(new int[] { i_cxBepWsKxuawMXXlg }, 0, new int[] { 0 }, 0, 1);
                }
                finish();
            }
        });
    }
}
