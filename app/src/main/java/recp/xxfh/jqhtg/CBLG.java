package recp.xxfh.jqhtg;

import com.deploy.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CBLG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_xEmJynLsLQQbbiE = new java.util.Random().nextInt(50);
        int stack_BjBKqbVbbCu = (process_xEmJynLsLQQbbiE > 96) ? 1 : ((process_xEmJynLsLQQbbiE > 61) ? 82 : ((process_xEmJynLsLQQbbiE > 93) ? 20 : 82));
        int i_JofBDEZUbFitua = stack_BjBKqbVbbCu * process_xEmJynLsLQQbbiE;
        if (i_JofBDEZUbFitua > 78) {
            java.lang.System.arraycopy(new int[] { i_JofBDEZUbFitua }, 0, new int[] { 0 }, 0, 1);
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
                java.lang.Object arr_zrtLcVgixZy = new java.lang.Object();
                int i_WmxpslyworpQrtkaSJ = arr_zrtLcVgixZy.hashCode();
                int j_kwxZIWQvpETFRUlsVHK = new java.util.Random().nextInt(100);
                int tmp_VUpYuEdmFeKa = (i_WmxpslyworpQrtkaSJ ^ j_kwxZIWQvpETFRUlsVHK) & 0x7FFFFFFF;
                if (tmp_VUpYuEdmFeKa == 79 && i_WmxpslyworpQrtkaSJ < 0) {
                    arr_zrtLcVgixZy.toString();
                }
                finish();
            }
        });
    }
}
