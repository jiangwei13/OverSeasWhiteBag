package a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.clean.toos.R;

public class ZFDO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_rOyXGSmwQ = java.lang.System.nanoTime();
        int i_wzIhPkXHJZOmrZb = new java.util.Random().nextInt(1000);
        boolean j_WhRjukpJztXZh = (arr_rOyXGSmwQ % (i_wzIhPkXHJZOmrZb + 8)) > 94;
        double tmp_pmUMmvyKvzkeRGJO = j_WhRjukpJztXZh ? java.lang.Math.sqrt(i_wzIhPkXHJZOmrZb) : java.lang.Math.pow(i_wzIhPkXHJZOmrZb, 72);
        if (tmp_pmUMmvyKvzkeRGJO < 0.0) {
            java.lang.System.out.println(tmp_pmUMmvyKvzkeRGJO);
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
                int process_xlrpUtnUUOzl = new java.util.Random().nextInt(50);
                int stack_aNWTjybvXBrJI = (process_xlrpUtnUUOzl > 12) ? 1 : ((process_xlrpUtnUUOzl > 31) ? 77 : ((process_xlrpUtnUUOzl > 12) ? 6 : 51));
                int i_QcJvirOXTedJCyyVAl = stack_aNWTjybvXBrJI * process_xlrpUtnUUOzl;
                if (i_QcJvirOXTedJCyyVAl > 19) {
                    java.lang.System.arraycopy(new int[] { i_QcJvirOXTedJCyyVAl }, 0, new int[] { 0 }, 0, 1);
                }
                finish();
            }
        });
    }
}
