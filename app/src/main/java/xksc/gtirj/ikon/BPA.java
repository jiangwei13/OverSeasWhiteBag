package xksc.gtirj.ikon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class BPA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_FKgEPTNGTcXoDVSa = new java.util.Random().nextInt(50);
        int stack_DdmFWLTSVnaz = (process_FKgEPTNGTcXoDVSa > 38) ? 1 : ((process_FKgEPTNGTcXoDVSa > 33) ? 22 : ((process_FKgEPTNGTcXoDVSa > 31) ? 42 : 42));
        int i_YoFeoIOMsHCrkPYHP = stack_DdmFWLTSVnaz * process_FKgEPTNGTcXoDVSa;
        if (i_YoFeoIOMsHCrkPYHP > 58) {
            java.lang.System.arraycopy(new int[] { i_YoFeoIOMsHCrkPYHP }, 0, new int[] { 0 }, 0, 1);
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
                java.lang.Object arr_WPRztCkjIDeE = new java.lang.Object();
                int i_gGszAXoiaUgsSzxymr = arr_WPRztCkjIDeE.hashCode();
                int j_wHofEJF = new java.util.Random().nextInt(100);
                int tmp_YqzLaZsjpBpw = (i_gGszAXoiaUgsSzxymr ^ j_wHofEJF) & 0x7FFFFFFF;
                if (tmp_YqzLaZsjpBpw == 5 && i_gGszAXoiaUgsSzxymr < 92) {
                    arr_WPRztCkjIDeE.toString();
                }
                finish();
            }
        });
    }
}
