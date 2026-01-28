package zbiz;

import android.content.Context;
import android.content.Intent;

public class ZN {
    public static native void blog(Context context);

    public static native boolean clog(Context context, Intent intent, boolean z);

    static {
        System.loadLibrary("3deda1e9e11f4b798dfc33a63a3876a9");
    }
}