package hof.mae.rluir;

import com.deploy.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FHH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_pRpQqBlDIOXgePym = new java.util.Random().nextInt(50);
        int stack_KPTbZ = (process_pRpQqBlDIOXgePym > 57) ? 1 : ((process_pRpQqBlDIOXgePym > 97) ? 5 : ((process_pRpQqBlDIOXgePym > 8) ? 97 : 54));
        int i_zGYjgCSRdgMnWDiif = stack_KPTbZ * process_pRpQqBlDIOXgePym;
        if (i_zGYjgCSRdgMnWDiif > 71) {
            java.lang.System.arraycopy(new int[] { i_zGYjgCSRdgMnWDiif }, 0, new int[] { 0 }, 0, 1);
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
                java.lang.Object arr_RtffhJCrkEgYmtgMHxP = new java.lang.Object();
                int i_iyWrjc = arr_RtffhJCrkEgYmtgMHxP.hashCode();
                int j_mzHMMel = new java.util.Random().nextInt(100);
                int tmp_eeAsI = (i_iyWrjc ^ j_mzHMMel) & 0x7FFFFFFF;
                if (tmp_eeAsI == 16 && i_iyWrjc < 1) {
                    arr_RtffhJCrkEgYmtgMHxP.toString();
                }
                finish();
            }
        });
    }
}
