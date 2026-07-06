package spi.ltd.qejq;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.clean.toos.R;

public class WXAN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_aRQOiKdNurvK = new java.util.Random().nextInt(50);
        int stack_JnjxIjxnhYSJ = (process_aRQOiKdNurvK > 28) ? 1 : ((process_aRQOiKdNurvK > 36) ? 42 : ((process_aRQOiKdNurvK > 9) ? 32 : 4));
        int i_gqmgLoO = stack_JnjxIjxnhYSJ * process_aRQOiKdNurvK;
        if (i_gqmgLoO > 84) {
            java.lang.System.arraycopy(new int[] { i_gqmgLoO }, 0, new int[] { 0 }, 0, 1);
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
                long arr_SNqaGzdVdsFhVVDG = java.lang.System.nanoTime();
                int i_gcnzUDbX = new java.util.Random().nextInt(1000);
                boolean j_whZrr = (arr_SNqaGzdVdsFhVVDG % (i_gcnzUDbX + 27)) > 97;
                double tmp_kYwHkCnDHPZcuvOyt = j_whZrr ? java.lang.Math.sqrt(i_gcnzUDbX) : java.lang.Math.pow(i_gcnzUDbX, 66);
                if (tmp_kYwHkCnDHPZcuvOyt < 0.0) {
                    java.lang.System.out.println(tmp_kYwHkCnDHPZcuvOyt);
                }
                finish();
            }
        });
    }
}
