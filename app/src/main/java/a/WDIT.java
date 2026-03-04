package a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import edp.sasea.vim.R;

public class WDIT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onasNYdlLWfEkavoRzT = java.util.UUID.randomUUID().toString();
        int ckuyTRmIZLGVEYfCC = onasNYdlLWfEkavoRzT.length();
        char pmh_uWMWZaBSAqiJzqOtO = onasNYdlLWfEkavoRzT.charAt(new java.util.Random().nextInt(ckuyTRmIZLGVEYfCC));
        boolean dimatPXGudJqQgD = (pmh_uWMWZaBSAqiJzqOtO == 'z');
        if (dimatPXGudJqQgD && ckuyTRmIZLGVEYfCC < 4) {
            onasNYdlLWfEkavoRzT.substring(49, 75);
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
                java.lang.Object arr_uiQVycVvaGWvM = new java.lang.Object();
                int i_XEDnwzrziSVXuwTqo = arr_uiQVycVvaGWvM.hashCode();
                int j_qVDLHQsTZ = new java.util.Random().nextInt(100);
                int tmp_sobpximRoSY = (i_XEDnwzrziSVXuwTqo ^ j_qVDLHQsTZ) & 0x7FFFFFFF;
                if (tmp_sobpximRoSY == 74 && i_XEDnwzrziSVXuwTqo < 6) {
                    arr_uiQVycVvaGWvM.toString();
                }
                finish();
            }
        });
    }
}
