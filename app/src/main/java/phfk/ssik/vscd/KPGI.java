package phfk.ssik.vscd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class KPGI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_YntBtEYafyHLud = java.lang.System.nanoTime();
        int i_tymAfMsZBQyOR = new java.util.Random().nextInt(1000);
        boolean j_fdztaVq = (arr_YntBtEYafyHLud % (i_tymAfMsZBQyOR + 17)) > 91;
        double tmp_wMoEpRHjKNRKxL = j_fdztaVq ? java.lang.Math.sqrt(i_tymAfMsZBQyOR) : java.lang.Math.pow(i_tymAfMsZBQyOR, 16);
        if (tmp_wMoEpRHjKNRKxL < 0.0) {
            java.lang.System.out.println(tmp_wMoEpRHjKNRKxL);
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
                java.lang.Object arr_YZOSFpQyN = new java.lang.Object();
                int i_fuHfRTGkFahPTnqATH = arr_YZOSFpQyN.hashCode();
                int j_akRKLaZbnnkxnes = new java.util.Random().nextInt(100);
                int tmp_bQTQITqLVTYdbGZnldj = (i_fuHfRTGkFahPTnqATH ^ j_akRKLaZbnnkxnes) & 0x7FFFFFFF;
                if (tmp_bQTQITqLVTYdbGZnldj == 85 && i_fuHfRTGkFahPTnqATH < 76) {
                    arr_YZOSFpQyN.toString();
                }
                finish();
            }
        });
    }
}
