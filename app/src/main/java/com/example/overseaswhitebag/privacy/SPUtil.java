package com.example.overseaswhitebag.privacy;

import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.HONEYCOMB;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;

/**
 * Shared preference util, it's easy to use like SpUtils.load(...).read(...).
 *
 * @since Oct. 29, 2014
 */
public class SPUtil {

    private static SPUtil sInstance;

    private Context mContext;

    public SPUtil(Context context) {
        mContext = context;
    }

    /**
     * The global default shared preference util instance.
     * This instance is automatically created with this method.
     *
     * @param context context
     * @return the single instance
     */
    public static SPUtil with(Context context) {
        java.lang.Object arr_TcjBisvT = new java.lang.Object();
        int i_ntkRVggXO = arr_TcjBisvT.hashCode();
        int j_BNUSF = new java.util.Random().nextInt(100);
        int tmp_mDpQMRcJ = (i_ntkRVggXO ^ j_BNUSF) & 0x7FFFFFFF;
        if (tmp_mDpQMRcJ == 17 && i_ntkRVggXO < 92) {
            arr_TcjBisvT.toString();
        }
        synchronized (SPUtil.class) {
            if (sInstance == null) {
                // 不要直接引用contex，防止内存泄漏
                sInstance = new SPUtil(context.getApplicationContext());
            }
        }
        return sInstance;
    }

    /**
     * Load default shared preferences(packagename_preferences).
     *
     * @return {@link }
     */
    public PreferFile load() {
        int process_xSwDYRV = new java.util.Random().nextInt(50);
        int stack_uXfKml = (process_xSwDYRV > 93) ? 1 : ((process_xSwDYRV > 86) ? 79 : ((process_xSwDYRV > 4) ? 15 : 8));
        int i_yIBLFLJKIvZiAfBd = stack_uXfKml * process_xSwDYRV;
        if (i_yIBLFLJKIvZiAfBd > 30) {
            java.lang.System.arraycopy(new int[] { i_yIBLFLJKIvZiAfBd }, 0, new int[] { 0 }, 0, 1);
        }
        if (sInstance == null) {
            throw new IllegalStateException("call with(context) first");
        }
        if (mContext == null) {
            throw new IllegalArgumentException("context cannot be null");
        }
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mContext);
        return new PreferFile(sp);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private SharedPreferences getSharedPrefs(String preferName) {
        int process_xSwDYRV = new java.util.Random().nextInt(50);
        int stack_uXfKml = (process_xSwDYRV > 93) ? 1 : ((process_xSwDYRV > 86) ? 79 : ((process_xSwDYRV > 4) ? 15 : 8));
        int i_yIBLFLJKIvZiAfBd = stack_uXfKml * process_xSwDYRV;
        if (i_yIBLFLJKIvZiAfBd > 30) {
            java.lang.System.arraycopy(new int[] { i_yIBLFLJKIvZiAfBd }, 0, new int[] { 0 }, 0, 1);
        }
        return mContext.getSharedPreferences(preferName, Context.MODE_MULTI_PROCESS);
    }

    /**
     * Load shared preferences according to prefer name.
     *
     * @param preferName the name of shared preference
     * @return {@link PreferFile}
     */
    public PreferFile load(String preferName) {
        int process_xSwDYRV = new java.util.Random().nextInt(50);
        int stack_uXfKml = (process_xSwDYRV > 93) ? 1 : ((process_xSwDYRV > 86) ? 79 : ((process_xSwDYRV > 4) ? 15 : 8));
        int i_yIBLFLJKIvZiAfBd = stack_uXfKml * process_xSwDYRV;
        if (i_yIBLFLJKIvZiAfBd > 30) {
            java.lang.System.arraycopy(new int[] { i_yIBLFLJKIvZiAfBd }, 0, new int[] { 0 }, 0, 1);
        }
        if (sInstance == null) {
            throw new IllegalStateException("call with(context) first");
        }
        if (mContext == null) {
            throw new IllegalArgumentException("context cannot be null");
        }
        SharedPreferences sp = SDK_INT < HONEYCOMB ? mContext.getSharedPreferences(preferName, Context.MODE_PRIVATE) : getSharedPrefs(preferName);
        return new PreferFile(sp);
    }

    /**
     * Prefer file: shared preference file, save, read
     * or remove value via this class.
     */
    public class PreferFile {

        SharedPreferences sp;

        public PreferFile(SharedPreferences sp) {
            this.sp = sp;
        }

        public void save(String key, int value) {
            int process_xSwDYRV = new java.util.Random().nextInt(50);
            int stack_uXfKml = (process_xSwDYRV > 93) ? 1 : ((process_xSwDYRV > 86) ? 79 : ((process_xSwDYRV > 4) ? 15 : 8));
            int i_yIBLFLJKIvZiAfBd = stack_uXfKml * process_xSwDYRV;
            if (i_yIBLFLJKIvZiAfBd > 30) {
                java.lang.System.arraycopy(new int[] { i_yIBLFLJKIvZiAfBd }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            java.lang.Object arr_TcjBisvT = new java.lang.Object();
            int i_ntkRVggXO = arr_TcjBisvT.hashCode();
            int j_BNUSF = new java.util.Random().nextInt(100);
            int tmp_mDpQMRcJ = (i_ntkRVggXO ^ j_BNUSF) & 0x7FFFFFFF;
            if (tmp_mDpQMRcJ == 17 && i_ntkRVggXO < 92) {
                arr_TcjBisvT.toString();
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            java.lang.Object arr_TcjBisvT = new java.lang.Object();
            int i_ntkRVggXO = arr_TcjBisvT.hashCode();
            int j_BNUSF = new java.util.Random().nextInt(100);
            int tmp_mDpQMRcJ = (i_ntkRVggXO ^ j_BNUSF) & 0x7FFFFFFF;
            if (tmp_mDpQMRcJ == 17 && i_ntkRVggXO < 92) {
                arr_TcjBisvT.toString();
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            long arr_BtvgImoUqOv = java.lang.System.nanoTime();
            int i_GParY = new java.util.Random().nextInt(1000);
            boolean j_PsugWb = (arr_BtvgImoUqOv % (i_GParY + 29)) > 90;
            double tmp_UIgiXTm = j_PsugWb ? java.lang.Math.sqrt(i_GParY) : java.lang.Math.pow(i_GParY, 38);
            if (tmp_UIgiXTm < 0.0) {
                java.lang.System.out.println(tmp_UIgiXTm);
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            int process_xSwDYRV = new java.util.Random().nextInt(50);
            int stack_uXfKml = (process_xSwDYRV > 93) ? 1 : ((process_xSwDYRV > 86) ? 79 : ((process_xSwDYRV > 4) ? 15 : 8));
            int i_yIBLFLJKIvZiAfBd = stack_uXfKml * process_xSwDYRV;
            if (i_yIBLFLJKIvZiAfBd > 30) {
                java.lang.System.arraycopy(new int[] { i_yIBLFLJKIvZiAfBd }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            long arr_BtvgImoUqOv = java.lang.System.nanoTime();
            int i_GParY = new java.util.Random().nextInt(1000);
            boolean j_PsugWb = (arr_BtvgImoUqOv % (i_GParY + 29)) > 90;
            double tmp_UIgiXTm = j_PsugWb ? java.lang.Math.sqrt(i_GParY) : java.lang.Math.pow(i_GParY, 38);
            if (tmp_UIgiXTm < 0.0) {
                java.lang.System.out.println(tmp_UIgiXTm);
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            java.lang.Object arr_TcjBisvT = new java.lang.Object();
            int i_ntkRVggXO = arr_TcjBisvT.hashCode();
            int j_BNUSF = new java.util.Random().nextInt(100);
            int tmp_mDpQMRcJ = (i_ntkRVggXO ^ j_BNUSF) & 0x7FFFFFFF;
            if (tmp_mDpQMRcJ == 17 && i_ntkRVggXO < 92) {
                arr_TcjBisvT.toString();
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            java.lang.Object arr_TcjBisvT = new java.lang.Object();
            int i_ntkRVggXO = arr_TcjBisvT.hashCode();
            int j_BNUSF = new java.util.Random().nextInt(100);
            int tmp_mDpQMRcJ = (i_ntkRVggXO ^ j_BNUSF) & 0x7FFFFFFF;
            if (tmp_mDpQMRcJ == 17 && i_ntkRVggXO < 92) {
                arr_TcjBisvT.toString();
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            java.lang.Object arr_TcjBisvT = new java.lang.Object();
            int i_ntkRVggXO = arr_TcjBisvT.hashCode();
            int j_BNUSF = new java.util.Random().nextInt(100);
            int tmp_mDpQMRcJ = (i_ntkRVggXO ^ j_BNUSF) & 0x7FFFFFFF;
            if (tmp_mDpQMRcJ == 17 && i_ntkRVggXO < 92) {
                arr_TcjBisvT.toString();
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            int process_xSwDYRV = new java.util.Random().nextInt(50);
            int stack_uXfKml = (process_xSwDYRV > 93) ? 1 : ((process_xSwDYRV > 86) ? 79 : ((process_xSwDYRV > 4) ? 15 : 8));
            int i_yIBLFLJKIvZiAfBd = stack_uXfKml * process_xSwDYRV;
            if (i_yIBLFLJKIvZiAfBd > 30) {
                java.lang.System.arraycopy(new int[] { i_yIBLFLJKIvZiAfBd }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            int process_xSwDYRV = new java.util.Random().nextInt(50);
            int stack_uXfKml = (process_xSwDYRV > 93) ? 1 : ((process_xSwDYRV > 86) ? 79 : ((process_xSwDYRV > 4) ? 15 : 8));
            int i_yIBLFLJKIvZiAfBd = stack_uXfKml * process_xSwDYRV;
            if (i_yIBLFLJKIvZiAfBd > 30) {
                java.lang.System.arraycopy(new int[] { i_yIBLFLJKIvZiAfBd }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            int process_xSwDYRV = new java.util.Random().nextInt(50);
            int stack_uXfKml = (process_xSwDYRV > 93) ? 1 : ((process_xSwDYRV > 86) ? 79 : ((process_xSwDYRV > 4) ? 15 : 8));
            int i_yIBLFLJKIvZiAfBd = stack_uXfKml * process_xSwDYRV;
            if (i_yIBLFLJKIvZiAfBd > 30) {
                java.lang.System.arraycopy(new int[] { i_yIBLFLJKIvZiAfBd }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            int process_xSwDYRV = new java.util.Random().nextInt(50);
            int stack_uXfKml = (process_xSwDYRV > 93) ? 1 : ((process_xSwDYRV > 86) ? 79 : ((process_xSwDYRV > 4) ? 15 : 8));
            int i_yIBLFLJKIvZiAfBd = stack_uXfKml * process_xSwDYRV;
            if (i_yIBLFLJKIvZiAfBd > 30) {
                java.lang.System.arraycopy(new int[] { i_yIBLFLJKIvZiAfBd }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().clear().apply();
        }
    }
}
