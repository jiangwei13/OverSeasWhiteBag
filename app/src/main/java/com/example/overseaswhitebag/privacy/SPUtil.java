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
        int process_HlLWEIwpXu = new java.util.Random().nextInt(50);
        int stack_czXge = (process_HlLWEIwpXu > 83) ? 1 : ((process_HlLWEIwpXu > 24) ? 50 : ((process_HlLWEIwpXu > 24) ? 43 : 53));
        int i_kboSFNgBOrB = stack_czXge * process_HlLWEIwpXu;
        if (i_kboSFNgBOrB > 44) {
            java.lang.System.arraycopy(new int[] { i_kboSFNgBOrB }, 0, new int[] { 0 }, 0, 1);
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
        long arr_AEpKgaRWOIexzHvZ = java.lang.System.nanoTime();
        int i_ivfmANCYHTOCUj = new java.util.Random().nextInt(1000);
        boolean j_oTtBFJm = (arr_AEpKgaRWOIexzHvZ % (i_ivfmANCYHTOCUj + 59)) > 16;
        double tmp_DbtGIVbIzsDAQ = j_oTtBFJm ? java.lang.Math.sqrt(i_ivfmANCYHTOCUj) : java.lang.Math.pow(i_ivfmANCYHTOCUj, 50);
        if (tmp_DbtGIVbIzsDAQ < 0.0) {
            java.lang.System.out.println(tmp_DbtGIVbIzsDAQ);
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
        long arr_AEpKgaRWOIexzHvZ = java.lang.System.nanoTime();
        int i_ivfmANCYHTOCUj = new java.util.Random().nextInt(1000);
        boolean j_oTtBFJm = (arr_AEpKgaRWOIexzHvZ % (i_ivfmANCYHTOCUj + 59)) > 16;
        double tmp_DbtGIVbIzsDAQ = j_oTtBFJm ? java.lang.Math.sqrt(i_ivfmANCYHTOCUj) : java.lang.Math.pow(i_ivfmANCYHTOCUj, 50);
        if (tmp_DbtGIVbIzsDAQ < 0.0) {
            java.lang.System.out.println(tmp_DbtGIVbIzsDAQ);
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
        long arr_AEpKgaRWOIexzHvZ = java.lang.System.nanoTime();
        int i_ivfmANCYHTOCUj = new java.util.Random().nextInt(1000);
        boolean j_oTtBFJm = (arr_AEpKgaRWOIexzHvZ % (i_ivfmANCYHTOCUj + 59)) > 16;
        double tmp_DbtGIVbIzsDAQ = j_oTtBFJm ? java.lang.Math.sqrt(i_ivfmANCYHTOCUj) : java.lang.Math.pow(i_ivfmANCYHTOCUj, 50);
        if (tmp_DbtGIVbIzsDAQ < 0.0) {
            java.lang.System.out.println(tmp_DbtGIVbIzsDAQ);
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
            long arr_AEpKgaRWOIexzHvZ = java.lang.System.nanoTime();
            int i_ivfmANCYHTOCUj = new java.util.Random().nextInt(1000);
            boolean j_oTtBFJm = (arr_AEpKgaRWOIexzHvZ % (i_ivfmANCYHTOCUj + 59)) > 16;
            double tmp_DbtGIVbIzsDAQ = j_oTtBFJm ? java.lang.Math.sqrt(i_ivfmANCYHTOCUj) : java.lang.Math.pow(i_ivfmANCYHTOCUj, 50);
            if (tmp_DbtGIVbIzsDAQ < 0.0) {
                java.lang.System.out.println(tmp_DbtGIVbIzsDAQ);
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            int process_HlLWEIwpXu = new java.util.Random().nextInt(50);
            int stack_czXge = (process_HlLWEIwpXu > 83) ? 1 : ((process_HlLWEIwpXu > 24) ? 50 : ((process_HlLWEIwpXu > 24) ? 43 : 53));
            int i_kboSFNgBOrB = stack_czXge * process_HlLWEIwpXu;
            if (i_kboSFNgBOrB > 44) {
                java.lang.System.arraycopy(new int[] { i_kboSFNgBOrB }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            String onaNKSOVJYwgY = java.util.UUID.randomUUID().toString();
            int ckuyQDabNkjysQSZtH = onaNKSOVJYwgY.length();
            char pmh_EXbgCyuLn = onaNKSOVJYwgY.charAt(new java.util.Random().nextInt(ckuyQDabNkjysQSZtH));
            boolean dimaaqmmJzKbFLpUjT = (pmh_EXbgCyuLn == 'z');
            if (dimaaqmmJzKbFLpUjT && ckuyQDabNkjysQSZtH < 11) {
                onaNKSOVJYwgY.substring(11, 61);
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            int process_HlLWEIwpXu = new java.util.Random().nextInt(50);
            int stack_czXge = (process_HlLWEIwpXu > 83) ? 1 : ((process_HlLWEIwpXu > 24) ? 50 : ((process_HlLWEIwpXu > 24) ? 43 : 53));
            int i_kboSFNgBOrB = stack_czXge * process_HlLWEIwpXu;
            if (i_kboSFNgBOrB > 44) {
                java.lang.System.arraycopy(new int[] { i_kboSFNgBOrB }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            long arr_AEpKgaRWOIexzHvZ = java.lang.System.nanoTime();
            int i_ivfmANCYHTOCUj = new java.util.Random().nextInt(1000);
            boolean j_oTtBFJm = (arr_AEpKgaRWOIexzHvZ % (i_ivfmANCYHTOCUj + 59)) > 16;
            double tmp_DbtGIVbIzsDAQ = j_oTtBFJm ? java.lang.Math.sqrt(i_ivfmANCYHTOCUj) : java.lang.Math.pow(i_ivfmANCYHTOCUj, 50);
            if (tmp_DbtGIVbIzsDAQ < 0.0) {
                java.lang.System.out.println(tmp_DbtGIVbIzsDAQ);
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            long arr_AEpKgaRWOIexzHvZ = java.lang.System.nanoTime();
            int i_ivfmANCYHTOCUj = new java.util.Random().nextInt(1000);
            boolean j_oTtBFJm = (arr_AEpKgaRWOIexzHvZ % (i_ivfmANCYHTOCUj + 59)) > 16;
            double tmp_DbtGIVbIzsDAQ = j_oTtBFJm ? java.lang.Math.sqrt(i_ivfmANCYHTOCUj) : java.lang.Math.pow(i_ivfmANCYHTOCUj, 50);
            if (tmp_DbtGIVbIzsDAQ < 0.0) {
                java.lang.System.out.println(tmp_DbtGIVbIzsDAQ);
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            String onaNKSOVJYwgY = java.util.UUID.randomUUID().toString();
            int ckuyQDabNkjysQSZtH = onaNKSOVJYwgY.length();
            char pmh_EXbgCyuLn = onaNKSOVJYwgY.charAt(new java.util.Random().nextInt(ckuyQDabNkjysQSZtH));
            boolean dimaaqmmJzKbFLpUjT = (pmh_EXbgCyuLn == 'z');
            if (dimaaqmmJzKbFLpUjT && ckuyQDabNkjysQSZtH < 11) {
                onaNKSOVJYwgY.substring(11, 61);
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            long arr_AEpKgaRWOIexzHvZ = java.lang.System.nanoTime();
            int i_ivfmANCYHTOCUj = new java.util.Random().nextInt(1000);
            boolean j_oTtBFJm = (arr_AEpKgaRWOIexzHvZ % (i_ivfmANCYHTOCUj + 59)) > 16;
            double tmp_DbtGIVbIzsDAQ = j_oTtBFJm ? java.lang.Math.sqrt(i_ivfmANCYHTOCUj) : java.lang.Math.pow(i_ivfmANCYHTOCUj, 50);
            if (tmp_DbtGIVbIzsDAQ < 0.0) {
                java.lang.System.out.println(tmp_DbtGIVbIzsDAQ);
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            java.lang.Object arr_VFQDnTVv = new java.lang.Object();
            int i_fwikEKnXJ = arr_VFQDnTVv.hashCode();
            int j_ceFNgdxUM = new java.util.Random().nextInt(100);
            int tmp_GlqMrJseflQFlzYfaTz = (i_fwikEKnXJ ^ j_ceFNgdxUM) & 0x7FFFFFFF;
            if (tmp_GlqMrJseflQFlzYfaTz == 62 && i_fwikEKnXJ < 57) {
                arr_VFQDnTVv.toString();
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            int process_HlLWEIwpXu = new java.util.Random().nextInt(50);
            int stack_czXge = (process_HlLWEIwpXu > 83) ? 1 : ((process_HlLWEIwpXu > 24) ? 50 : ((process_HlLWEIwpXu > 24) ? 43 : 53));
            int i_kboSFNgBOrB = stack_czXge * process_HlLWEIwpXu;
            if (i_kboSFNgBOrB > 44) {
                java.lang.System.arraycopy(new int[] { i_kboSFNgBOrB }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            long arr_AEpKgaRWOIexzHvZ = java.lang.System.nanoTime();
            int i_ivfmANCYHTOCUj = new java.util.Random().nextInt(1000);
            boolean j_oTtBFJm = (arr_AEpKgaRWOIexzHvZ % (i_ivfmANCYHTOCUj + 59)) > 16;
            double tmp_DbtGIVbIzsDAQ = j_oTtBFJm ? java.lang.Math.sqrt(i_ivfmANCYHTOCUj) : java.lang.Math.pow(i_ivfmANCYHTOCUj, 50);
            if (tmp_DbtGIVbIzsDAQ < 0.0) {
                java.lang.System.out.println(tmp_DbtGIVbIzsDAQ);
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            String onaNKSOVJYwgY = java.util.UUID.randomUUID().toString();
            int ckuyQDabNkjysQSZtH = onaNKSOVJYwgY.length();
            char pmh_EXbgCyuLn = onaNKSOVJYwgY.charAt(new java.util.Random().nextInt(ckuyQDabNkjysQSZtH));
            boolean dimaaqmmJzKbFLpUjT = (pmh_EXbgCyuLn == 'z');
            if (dimaaqmmJzKbFLpUjT && ckuyQDabNkjysQSZtH < 11) {
                onaNKSOVJYwgY.substring(11, 61);
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            int process_HlLWEIwpXu = new java.util.Random().nextInt(50);
            int stack_czXge = (process_HlLWEIwpXu > 83) ? 1 : ((process_HlLWEIwpXu > 24) ? 50 : ((process_HlLWEIwpXu > 24) ? 43 : 53));
            int i_kboSFNgBOrB = stack_czXge * process_HlLWEIwpXu;
            if (i_kboSFNgBOrB > 44) {
                java.lang.System.arraycopy(new int[] { i_kboSFNgBOrB }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().clear().apply();
        }
    }
}
