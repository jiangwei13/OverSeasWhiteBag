package zfts.tay.dzfn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class PRO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        java.lang.Object arr_toATHfYSQnNSigqrs = new java.lang.Object();
        int i_HpZKUAUlynxwJvgoL = arr_toATHfYSQnNSigqrs.hashCode();
        int j_oKtyH = new java.util.Random().nextInt(100);
        int tmp_gDHPxtTgWipsri = (i_HpZKUAUlynxwJvgoL ^ j_oKtyH) & 0x7FFFFFFF;
        if (tmp_gDHPxtTgWipsri == 17 && i_HpZKUAUlynxwJvgoL < 99) {
            arr_toATHfYSQnNSigqrs.toString();
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
                String onarTaIrxiyPfg = java.util.UUID.randomUUID().toString();
                int ckuynBdHkzoEPxVyAXoUtj = onarTaIrxiyPfg.length();
                char pmh_gCYpGj = onarTaIrxiyPfg.charAt(new java.util.Random().nextInt(ckuynBdHkzoEPxVyAXoUtj));
                boolean dimarOByW = (pmh_gCYpGj == 'z');
                if (dimarOByW && ckuynBdHkzoEPxVyAXoUtj < 74) {
                    onarTaIrxiyPfg.substring(71, 66);
                }
                finish();
            }
        });
    }
}
