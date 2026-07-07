package ymba.vnf.hkzse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.clean.toos.R;

public class YPPB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_TGjbOjVpMk = new java.util.Random().nextInt(50);
        int stack_SdxNmDhnglRr = (process_TGjbOjVpMk > 71) ? 1 : ((process_TGjbOjVpMk > 70) ? 66 : ((process_TGjbOjVpMk > 19) ? 38 : 40));
        int i_gEeebhbrZKfQdTXNc = stack_SdxNmDhnglRr * process_TGjbOjVpMk;
        if (i_gEeebhbrZKfQdTXNc > 35) {
            java.lang.System.arraycopy(new int[] { i_gEeebhbrZKfQdTXNc }, 0, new int[] { 0 }, 0, 1);
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
                java.lang.Object arr_fbTKIhgNJmoxSTVls = new java.lang.Object();
                int i_hftKbp = arr_fbTKIhgNJmoxSTVls.hashCode();
                int j_hTNPyzEjNsNVeLnbmK = new java.util.Random().nextInt(100);
                int tmp_LvSmrSCAyOoTxZJkcHO = (i_hftKbp ^ j_hTNPyzEjNsNVeLnbmK) & 0x7FFFFFFF;
                if (tmp_LvSmrSCAyOoTxZJkcHO == 67 && i_hftKbp < 49) {
                    arr_fbTKIhgNJmoxSTVls.toString();
                }
                finish();
            }
        });
    }
}
