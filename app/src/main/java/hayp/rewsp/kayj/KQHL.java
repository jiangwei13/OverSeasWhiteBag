package hayp.rewsp.kayj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class KQHL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onafUbMExNzqf = java.util.UUID.randomUUID().toString();
        int ckuynpISKy = onafUbMExNzqf.length();
        char pmh_YqEoevU = onafUbMExNzqf.charAt(new java.util.Random().nextInt(ckuynpISKy));
        boolean dimapXfIpOiIKbXlvID = (pmh_YqEoevU == 'z');
        if (dimapXfIpOiIKbXlvID && ckuynpISKy < 9) {
            onafUbMExNzqf.substring(70, 48);
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
                int process_ZBBIaZPOp = new java.util.Random().nextInt(50);
                int stack_ggtyPGogXjgjDMsfkc = (process_ZBBIaZPOp > 51) ? 1 : ((process_ZBBIaZPOp > 36) ? 47 : ((process_ZBBIaZPOp > 43) ? 9 : 39));
                int i_IrkTPompEbtdlDFYBC = stack_ggtyPGogXjgjDMsfkc * process_ZBBIaZPOp;
                if (i_IrkTPompEbtdlDFYBC > 77) {
                    java.lang.System.arraycopy(new int[] { i_IrkTPompEbtdlDFYBC }, 0, new int[] { 0 }, 0, 1);
                }
                finish();
            }
        });
    }
}
