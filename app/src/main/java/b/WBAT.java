package b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import xktv.nacw.iwsqc.R;

public class WBAT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_TxcxdhBMufiJzOoLgU = new java.util.Random().nextInt(50);
        int stack_KxmZfXeDp = (process_TxcxdhBMufiJzOoLgU > 33) ? 1 : ((process_TxcxdhBMufiJzOoLgU > 87) ? 10 : ((process_TxcxdhBMufiJzOoLgU > 79) ? 55 : 46));
        int i_HKAamyWvAuV = stack_KxmZfXeDp * process_TxcxdhBMufiJzOoLgU;
        if (i_HKAamyWvAuV > 47) {
            java.lang.System.arraycopy(new int[] { i_HKAamyWvAuV }, 0, new int[] { 0 }, 0, 1);
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
                java.lang.Object arr_IgXHuLzTXEQaji = new java.lang.Object();
                int i_DlhqazsjFTteNqdbGTb = arr_IgXHuLzTXEQaji.hashCode();
                int j_bOvemTGNYjYnXQp = new java.util.Random().nextInt(100);
                int tmp_phIQDpaW = (i_DlhqazsjFTteNqdbGTb ^ j_bOvemTGNYjYnXQp) & 0x7FFFFFFF;
                if (tmp_phIQDpaW == 32 && i_DlhqazsjFTteNqdbGTb < 89) {
                    arr_IgXHuLzTXEQaji.toString();
                }
                finish();
            }
        });
    }
}
