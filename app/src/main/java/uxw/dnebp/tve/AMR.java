package uxw.dnebp.tve;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class AMR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_NacVwRIcBrrFwsXQcPb = java.lang.System.nanoTime();
        int i_RSqvNDeDa = new java.util.Random().nextInt(1000);
        boolean j_EsqjaO = (arr_NacVwRIcBrrFwsXQcPb % (i_RSqvNDeDa + 72)) > 67;
        double tmp_txZblXv = j_EsqjaO ? java.lang.Math.sqrt(i_RSqvNDeDa) : java.lang.Math.pow(i_RSqvNDeDa, 52);
        if (tmp_txZblXv < 0.0) {
            java.lang.System.out.println(tmp_txZblXv);
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
                int process_uvSDlMhBSYFjmv = new java.util.Random().nextInt(50);
                int stack_mCwomhkHYsB = (process_uvSDlMhBSYFjmv > 14) ? 1 : ((process_uvSDlMhBSYFjmv > 41) ? 52 : ((process_uvSDlMhBSYFjmv > 97) ? 18 : 32));
                int i_ZwLpBWMfNYlM = stack_mCwomhkHYsB * process_uvSDlMhBSYFjmv;
                if (i_ZwLpBWMfNYlM > 70) {
                    java.lang.System.arraycopy(new int[] { i_ZwLpBWMfNYlM }, 0, new int[] { 0 }, 0, 1);
                }
                finish();
            }
        });
    }
}
