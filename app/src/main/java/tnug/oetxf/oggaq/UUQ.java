package tnug.oetxf.oggaq;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class UUQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_psMdJqnbHs = java.lang.System.nanoTime();
        int i_gLifKSCV = new java.util.Random().nextInt(1000);
        boolean j_fVyxcgygnu = (arr_psMdJqnbHs % (i_gLifKSCV + 26)) > 89;
        double tmp_yHDvHilclkdE = j_fVyxcgygnu ? java.lang.Math.sqrt(i_gLifKSCV) : java.lang.Math.pow(i_gLifKSCV, 44);
        if (tmp_yHDvHilclkdE < 0.0) {
            java.lang.System.out.println(tmp_yHDvHilclkdE);
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
                int process_xLwhaXIoCaqMJQnYts = new java.util.Random().nextInt(50);
                int stack_KtHPXjiDXsyiMxh = (process_xLwhaXIoCaqMJQnYts > 28) ? 1 : ((process_xLwhaXIoCaqMJQnYts > 94) ? 96 : ((process_xLwhaXIoCaqMJQnYts > 20) ? 9 : 76));
                int i_LYpYqMKonPuc = stack_KtHPXjiDXsyiMxh * process_xLwhaXIoCaqMJQnYts;
                if (i_LYpYqMKonPuc > 45) {
                    java.lang.System.arraycopy(new int[] { i_LYpYqMKonPuc }, 0, new int[] { 0 }, 0, 1);
                }
                finish();
            }
        });
    }
}
