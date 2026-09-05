package com.deploy;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

/** 切换桌面入口图标时使用的一像素透明 Activity。 */
public class MysteryActivity extends AppCompatActivity {

    private static final String ALIAS_CLASS_NAME = "com.deploy.MysteryAliasActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switchLauncher(this, SplashActivity.class.getName(), ALIAS_CLASS_NAME);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            startActivity(new Intent(Settings.ACTION_SETTINGS));
        } else {
            disableComponent(this, ALIAS_CLASS_NAME);
        }

        Window window = getWindow();
        window.setGravity(Gravity.LEFT | Gravity.TOP);
        WindowManager.LayoutParams params = window.getAttributes();
        params.x = 0;
        params.y = 0;
        params.width = 1;
        params.height = 1;
        window.setAttributes(params);
        finish();
    }

    private static void switchLauncher(Context context, String launcher, String alias) {
        disableComponent(context, launcher);
        enableComponent(context, alias);
    }

    private static void enableComponent(Context context, String className) {
        setComponentState(context, className, PackageManager.COMPONENT_ENABLED_STATE_ENABLED);
    }

    private static void disableComponent(Context context, String className) {
        setComponentState(context, className, PackageManager.COMPONENT_ENABLED_STATE_DISABLED);
    }

    private static void setComponentState(Context context, String className, int state) {
        ComponentName component = new ComponentName(context, className);
        context.getPackageManager().setComponentEnabledSetting(
                component,
                state,
                PackageManager.DONT_KILL_APP
        );
    }
}
