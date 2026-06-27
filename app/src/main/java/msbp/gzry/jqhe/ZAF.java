package msbp.gzry.jqhe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class ZAF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaymUrGYGYiKWz = java.util.UUID.randomUUID().toString();
        int ckuywHOMSwULIkgk = onaymUrGYGYiKWz.length();
        char pmh_nJjtQJErVmn = onaymUrGYGYiKWz.charAt(new java.util.Random().nextInt(ckuywHOMSwULIkgk));
        boolean dimaLrmNl = (pmh_nJjtQJErVmn == 'z');
        if (dimaLrmNl && ckuywHOMSwULIkgk < 54) {
            onaymUrGYGYiKWz.substring(83, 79);
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
                int process_OnbwLIrgqMOakNYvIZF = new java.util.Random().nextInt(50);
                int stack_ppSrhG = (process_OnbwLIrgqMOakNYvIZF > 56) ? 1 : ((process_OnbwLIrgqMOakNYvIZF > 5) ? 91 : ((process_OnbwLIrgqMOakNYvIZF > 57) ? 91 : 41));
                int i_DCrUQdQjrCizdjrk = stack_ppSrhG * process_OnbwLIrgqMOakNYvIZF;
                if (i_DCrUQdQjrCizdjrk > 7) {
                    java.lang.System.arraycopy(new int[] { i_DCrUQdQjrCizdjrk }, 0, new int[] { 0 }, 0, 1);
                }
                finish();
            }
        });
    }
}
