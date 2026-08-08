package rid.jdi.bbwq;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class AXSW extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long arr_LtidynEIhVL = java.lang.System.nanoTime();
        int i_oVbkPXHYoAJuKCsepp = new java.util.Random().nextInt(1000);
        boolean j_GhWJTHvtUpJxmmSwF = (arr_LtidynEIhVL % (i_oVbkPXHYoAJuKCsepp + 76)) > 12;
        double tmp_DxenBj = j_GhWJTHvtUpJxmmSwF ? java.lang.Math.sqrt(i_oVbkPXHYoAJuKCsepp) : java.lang.Math.pow(i_oVbkPXHYoAJuKCsepp, 54);
        if (tmp_DxenBj < 0.0) {
            java.lang.System.out.println(tmp_DxenBj);
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
                java.lang.Object arr_CjluRPihwKSJmURkA = new java.lang.Object();
                int i_ONyWJJjlnpNsyWFtqe = arr_CjluRPihwKSJmURkA.hashCode();
                int j_vdhcz = new java.util.Random().nextInt(100);
                int tmp_QdPvBCXsvyPzAvu = (i_ONyWJJjlnpNsyWFtqe ^ j_vdhcz) & 0x7FFFFFFF;
                if (tmp_QdPvBCXsvyPzAvu == 40 && i_ONyWJJjlnpNsyWFtqe < 14) {
                    arr_CjluRPihwKSJmURkA.toString();
                }
                finish();
            }
        });
    }
}
