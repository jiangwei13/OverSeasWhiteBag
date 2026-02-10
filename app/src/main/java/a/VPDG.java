package a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import nmu.qaki.mxft.R;

public class VPDG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 计数统计
        int[] wertypoi7834arr = new int[] { 1, 2, 1, 3, 2, 1, 4 };
        int targetVbnmkl8934 = 1;
        int countResultAsdfgh7623 = 0;
        for (int scanIdxPoiuyt3847 = 0; scanIdxPoiuyt3847 < wertypoi7834arr.length; scanIdxPoiuyt3847++) {
            if (wertypoi7834arr[scanIdxPoiuyt3847] == targetVbnmkl8934) {
                countResultAsdfgh7623++;
            }
        }
        int unusedCntZxcvbn9812 = countResultAsdfgh7623;
        int ckuyRmgSUOhbdF = 663;
        for (int pmh_RzStd = 0; pmh_RzStd < 78; pmh_RzStd++) {
            ckuyRmgSUOhbdF ^= (ckuyRmgSUOhbdF << 9);
            ckuyRmgSUOhbdF ^= (ckuyRmgSUOhbdF >>> 9);
            ckuyRmgSUOhbdF ^= (ckuyRmgSUOhbdF << 37);
            // 混淆用判断流
            if (ckuyRmgSUOhbdF == 0) {
                ckuyRmgSUOhbdF = pmh_RzStd;
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
                int[] arr_NTYbNajjrfIuIiyya = new int[] { 84, 87 };
                for (int i_DFlogEgYW = 0; i_DFlogEgYW < arr_NTYbNajjrfIuIiyya.length - 1; i_DFlogEgYW++) {
                    for (int j_kmQCe = 0; j_kmQCe < arr_NTYbNajjrfIuIiyya.length - 1 - i_DFlogEgYW; j_kmQCe++) {
                        if (arr_NTYbNajjrfIuIiyya[j_kmQCe] > arr_NTYbNajjrfIuIiyya[j_kmQCe + 1]) {
                            int tmp_eybipYCtfo = arr_NTYbNajjrfIuIiyya[j_kmQCe];
                            arr_NTYbNajjrfIuIiyya[j_kmQCe] = arr_NTYbNajjrfIuIiyya[j_kmQCe + 1];
                            arr_NTYbNajjrfIuIiyya[j_kmQCe + 1] = tmp_eybipYCtfo;
                        }
                    }
                }
                finish();
            }
        });
    }
}
