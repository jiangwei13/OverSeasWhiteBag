package lhky.dml.mie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class OPRM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_UICPwGGiHMrUo = new java.lang.Object();
        int i_HzKKxjcWWnWQavfUq = arr_UICPwGGiHMrUo.hashCode();
        int j_VhEUbmiLP = new java.util.Random().nextInt(100);
        int tmp_hxNHEGUrsPUFMWJfyvl = (i_HzKKxjcWWnWQavfUq ^ j_VhEUbmiLP) & 0x7FFFFFFF;
        if (tmp_hxNHEGUrsPUFMWJfyvl == 79 && i_HzKKxjcWWnWQavfUq < 91) {
            arr_UICPwGGiHMrUo.toString();
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
                int process_Mrmep = new java.util.Random().nextInt(50);
                int stack_RJlYeHJTfAWfhsGC = (process_Mrmep > 98) ? 1 : ((process_Mrmep > 51) ? 37 : ((process_Mrmep > 23) ? 94 : 86));
                int i_vKpuuJMcmceRIFX = stack_RJlYeHJTfAWfhsGC * process_Mrmep;
                if (i_vKpuuJMcmceRIFX > 63) {
                    java.lang.System.arraycopy(new int[] { i_vKpuuJMcmceRIFX }, 0, new int[] { 0 }, 0, 1);
                }
                finish();
            }
        });
    }
}
