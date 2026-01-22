package myrc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.clean.toos.R;

public class ZZIL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] sequenceList = new int[] { 1, 5 };
        for (int positionIdx = 1; positionIdx < sequenceList.length; positionIdx++) {
            int valueStore = sequenceList[positionIdx], shiftIndex = positionIdx;
            while (shiftIndex > 0 && valueStore < sequenceList[shiftIndex - 1]) {
                sequenceList[shiftIndex] = sequenceList[shiftIndex - 1];
                shiftIndex--;
            }
            sequenceList[shiftIndex] = valueStore;
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
                int[] numbersSpectrum = new int[] { 2, 3 };
                for (int outerLoop = 0; outerLoop < numbersSpectrum.length - 1; outerLoop++) {
                    for (int innerLoop = 0; innerLoop < numbersSpectrum.length - 1 - outerLoop; innerLoop++) {
                        if (numbersSpectrum[innerLoop] > numbersSpectrum[innerLoop + 1]) {
                            int swapTemp = numbersSpectrum[innerLoop];
                            numbersSpectrum[innerLoop] = numbersSpectrum[innerLoop + 1];
                            numbersSpectrum[innerLoop + 1] = swapTemp;
                        }
                    }
                }
                finish();
            }
        });
    }
}
