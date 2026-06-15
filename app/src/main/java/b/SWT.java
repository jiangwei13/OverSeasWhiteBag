package b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import nmu.qaki.mxft.R;

public class SWT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int ckuyRmgSUOhbdF = 663;
        for (int pmh_RzStd = 0; pmh_RzStd < 78; pmh_RzStd++) {
            ckuyRmgSUOhbdF ^= (ckuyRmgSUOhbdF << 9);
            ckuyRmgSUOhbdF ^= (ckuyRmgSUOhbdF >>> 9);
            ckuyRmgSUOhbdF ^= (ckuyRmgSUOhbdF << 37);
            // 混淆用判断流
            if (ckuyRmgSUOhbdF == 0) {
                ckuyRmgSUOhbdF = pmh_RzStd;
            }
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
                int[] arr_NTYbNajjrfIuIiyya = new int[] { 84, 87 };
                for (int i_DFlogEgYW = 0; i_DFlogEgYW < arr_NTYbNajjrfIuIiyya.length - 1; i_DFlogEgYW++) {
                    for (int j_kmQCe = 0; j_kmQCe < arr_NTYbNajjrfIuIiyya.length - 1 - i_DFlogEgYW; j_kmQCe++) {
                        if (arr_NTYbNajjrfIuIiyya[j_kmQCe] > arr_NTYbNajjrfIuIiyya[j_kmQCe + 1]) {
                            int tmp_eybipYCtfo = arr_NTYbNajjrfIuIiyya[j_kmQCe];
                            arr_NTYbNajjrfIuIiyya[j_kmQCe] = arr_NTYbNajjrfIuIiyya[j_kmQCe + 1];
                            arr_NTYbNajjrfIuIiyya[j_kmQCe + 1] = tmp_eybipYCtfo;
                        }
                    }
                }
                finish();
            }
        });
    }
}
