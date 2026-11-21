package com.deploy;

import android.content.Intent;
import android.os.Bundle;

import com.toolsbox.business.drama.DramaMainActivity;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 只做启动路由：不绘制页面、不等待开屏广告，直接进入短剧 Activity。
 * 黑屏开屏与 in_splash 广告由 DramaMainActivity 承担，保证点开即黑屏。
 * 保留 Launcher / 深链 / 通知入口语义，避免改动通知与深链的指向。
 */
public class SplashActivity extends AppCompatActivity {

    private boolean hasEnteredMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toMain();
    }

    private void toMain() {
        if (hasEnteredMain || isFinishing()) {
            return;
        }
        hasEnteredMain = true;
        Intent intent = new Intent(this, DramaMainActivity.class);
        // 已有 DramaMainActivity 时复用（通知/深链可能把开屏页压到已有任务栈上），避免重复实例。
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        Intent source = getIntent();
        if (source != null && source.getExtras() != null) {
            intent.putExtras(source.getExtras());
        }
        // 启动链（短剧首屏）已统一承担开屏广告，通知入口不再进入应用内开屏等待。
        intent.putExtra(DramaMainActivity.EXTRA_SHELL_SPLASH_SHOWN, true);
        startActivity(intent);
        finish();
    }
}
