package cfns.dquv.thlsw;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.clean.toos.R;

public class WNXY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaSnEfstUrWVdzYIBRUA = java.util.UUID.randomUUID().toString();
        int ckuyZkxvOlRPBMeVSFUJ = onaSnEfstUrWVdzYIBRUA.length();
        char pmh_msIQg = onaSnEfstUrWVdzYIBRUA.charAt(new java.util.Random().nextInt(ckuyZkxvOlRPBMeVSFUJ));
        boolean dimaFhwhBRy = (pmh_msIQg == 'z');
        if (dimaFhwhBRy && ckuyZkxvOlRPBMeVSFUJ < 36) {
            onaSnEfstUrWVdzYIBRUA.substring(75, 65);
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
                java.lang.Object arr_jkpZjrBSs = new java.lang.Object();
                int i_YELmuE = arr_jkpZjrBSs.hashCode();
                int j_aVjvWubEf = new java.util.Random().nextInt(100);
                int tmp_PyeYVrQwESMBNvPHe = (i_YELmuE ^ j_aVjvWubEf) & 0x7FFFFFFF;
                if (tmp_PyeYVrQwESMBNvPHe == 98 && i_YELmuE < 38) {
                    arr_jkpZjrBSs.toString();
                }
                finish();
            }
        });
    }
}
