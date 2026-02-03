package zbiy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.clean.toos.R;

public class DPH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] items = new int[] { 9, 4 };
        int length = items.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (items[minIndex] > items[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = items[i];
                items[i] = items[minIndex];
                items[minIndex] = temp;
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
                int[] numbers = new int[] { 6, 8 };
                int target = 4;
                int lowIndex = 0;
                int highIndex = numbers.length - 1;
                int middleIndex = 0;
                if (target < numbers[lowIndex] || target > numbers[highIndex] || lowIndex > highIndex) {
                    int result = 1;
                } else {
                    while (lowIndex <= highIndex) {
                        middleIndex = (lowIndex + highIndex) / 2;
                        if (numbers[middleIndex] > target) {
                            highIndex = middleIndex - 1;
                        } else if (numbers[middleIndex] < target) {
                            lowIndex = middleIndex + 1;
                        } else {
                        }
                    }
                }
                finish();
            }
        });
    }
}
