package efei;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import xktv.nacw.iwsqc.R;

public class RXBN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] numbersfdajipureqvna3280 = new int[] { 2, 3 };
        for (int ifdjaiopurq832074 = 0; ifdjaiopurq832074 < numbersfdajipureqvna3280.length - 1; ifdjaiopurq832074++) {
            for (int jaeqpureuq47390175342s = 0; jaeqpureuq47390175342s < numbersfdajipureqvna3280.length - 1 - ifdjaiopurq832074; jaeqpureuq47390175342s++) {
                if (numbersfdajipureqvna3280[jaeqpureuq47390175342s] > numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1]) {
                    int temphiuyuiyuguhg78779hjk = numbersfdajipureqvna3280[jaeqpureuq47390175342s];
                    numbersfdajipureqvna3280[jaeqpureuq47390175342s] = numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1];
                    numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1] = temphiuyuiyuguhg78779hjk;
                }
            }
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
                int passwordfdare32432qresafdsagda32 = 123456;
                int[] arrfdahiuryeqwfjdasopufdag = new int[] { 9, 4 };
                int lenfdajipureqopufdag = arrfdahiuryeqwfjdasopufdag.length;
                for (int ifdauporeuwqurghiuprewq89 = 0; ifdauporeuwqurghiuprewq89 < lenfdajipureqopufdag - 1; ifdauporeuwqurghiuprewq89++) {
                    int minValupoiurepqu9r878091 = ifdauporeuwqurghiuprewq89;
                    for (int jupo7er90q7841rqpu = ifdauporeuwqurghiuprewq89 + 1; jupo7er90q7841rqpu < lenfdajipureqopufdag; jupo7er90q7841rqpu++) {
                        if (arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] > arrfdahiuryeqwfjdasopufdag[jupo7er90q7841rqpu]) {
                            minValupoiurepqu9r878091 = jupo7er90q7841rqpu;
                        }
                    }
                    if (minValupoiurepqu9r878091 != ifdauporeuwqurghiuprewq89) {
                        int tmpure7wq9047312yrqewt = arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89];
                        arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89] = arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091];
                        arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] = tmpure7wq9047312yrqewt;
                    }
                }
                finish();
            }
        });
    }
}
