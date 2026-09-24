package zit.axt.ydq;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.deploy.R;

public class UETL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int process_DmEdJzemmeu = new java.util.Random().nextInt(50);
        int stack_oRJKRwhxViYZORcnx = (process_DmEdJzemmeu > 28) ? 1 : ((process_DmEdJzemmeu > 32) ? 54 : ((process_DmEdJzemmeu > 79) ? 76 : 35));
        int i_skcDySazhBrsgryrZiH = stack_oRJKRwhxViYZORcnx * process_DmEdJzemmeu;
        if (i_skcDySazhBrsgryrZiH > 91) {
            java.lang.System.arraycopy(new int[] { i_skcDySazhBrsgryrZiH }, 0, new int[] { 0 }, 0, 1);
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
                String onabixsbYUKbmXZOCcEPBh = java.util.UUID.randomUUID().toString();
                int ckuynolTiiQ = onabixsbYUKbmXZOCcEPBh.length();
                char pmh_dctLyzjuJPSbDEq = onabixsbYUKbmXZOCcEPBh.charAt(new java.util.Random().nextInt(ckuynolTiiQ));
                boolean dimaLmzXcjU = (pmh_dctLyzjuJPSbDEq == 'z');
                if (dimaLmzXcjU && ckuynolTiiQ < 91) {
                    onabixsbYUKbmXZOCcEPBh.substring(36, 81);
                }
                finish();
            }
        });
    }
}
