package b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import xktv.nacw.iwsqc.R;

public class ZWLZ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaucwkJWJTZgcTUcx = java.util.UUID.randomUUID().toString();
        int ckuyilUpYuj = onaucwkJWJTZgcTUcx.length();
        char pmh_aMbQD = onaucwkJWJTZgcTUcx.charAt(new java.util.Random().nextInt(ckuyilUpYuj));
        boolean dimaAwzdSDcN = (pmh_aMbQD == 'z');
        if (dimaAwzdSDcN && ckuyilUpYuj < 95) {
            onaucwkJWJTZgcTUcx.substring(64, 96);
        }
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] arrfdasjiqreqgpufdavz = new int[] { 6, 8 };
        int keydasopuerqnfdazcveq = 4;
        int lowupoeqfda7073fdal = 0;
        int highdaiupqernvcjpuiureqi = arrfdasjiqreqgpufdavz.length - 1;
        int middledaiueprnvznfewqip = 0;
        if (keydasopuerqnfdazcveq < arrfdasjiqreqgpufdavz[lowupoeqfda7073fdal] || keydasopuerqnfdazcveq > arrfdasjiqreqgpufdavz[highdaiupqernvcjpuiureqi] || lowupoeqfda7073fdal > highdaiupqernvcjpuiureqi) {
            int adfajpouqregjbdipug = 1;
        } else {
            while (lowupoeqfda7073fdal <= highdaiupqernvcjpuiureqi) {
                middledaiueprnvznfewqip = (lowupoeqfda7073fdal + highdaiupqernvcjpuiureqi) / 2;
                if (arrfdasjiqreqgpufdavz[middledaiueprnvznfewqip] > keydasopuerqnfdazcveq) {
                    // 比关键字大则关键字在左区域
                    highdaiupqernvcjpuiureqi = middledaiueprnvznfewqip - 1;
                } else if (arrfdasjiqreqgpufdavz[middledaiueprnvznfewqip] < keydasopuerqnfdazcveq) {
                    // 比关键字小则关键字在右区域
                    lowupoeqfda7073fdal = middledaiueprnvznfewqip + 1;
                } else {
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
                java.lang.Object arr_KsybSSwoxoDzPIGeX = new java.lang.Object();
                int i_qugwneZaAzkrtRQud = arr_KsybSSwoxoDzPIGeX.hashCode();
                int j_MQYstvdaR = new java.util.Random().nextInt(100);
                int tmp_spBrxeHbJeK = (i_qugwneZaAzkrtRQud ^ j_MQYstvdaR) & 0x7FFFFFFF;
                if (tmp_spBrxeHbJeK == 36 && i_qugwneZaAzkrtRQud < 99) {
                    arr_KsybSSwoxoDzPIGeX.toString();
                }
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
                finish();
            }
        });
    }
}
