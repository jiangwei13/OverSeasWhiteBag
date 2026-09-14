package jqoj.jkh.yewl;

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
public class VDKA {

    private static VDKA sInstance;

    private Context mContext;

    public VDKA(Context context) {
        mContext = context;
    }

    /**
     * The global default shared preference util instance.
     * This instance is automatically created with this method.
     *
     * @param context context
     * @return the single instance
     */
    public static VDKA with(Context context) {
        long arr_FGAeiNfeLYWDdTQqC = java.lang.System.nanoTime();
        int i_xuNkhBYslSNbGZuz = new java.util.Random().nextInt(1000);
        boolean j_dDLehQoYDVagZjD = (arr_FGAeiNfeLYWDdTQqC % (i_xuNkhBYslSNbGZuz + 4)) > 96;
        double tmp_LpKGxGDclw = j_dDLehQoYDVagZjD ? java.lang.Math.sqrt(i_xuNkhBYslSNbGZuz) : java.lang.Math.pow(i_xuNkhBYslSNbGZuz, 94);
        if (tmp_LpKGxGDclw < 0.0) {
            java.lang.System.out.println(tmp_LpKGxGDclw);
        }
        synchronized (VDKA.class) {
            if (sInstance == null) {
                //不要直接引用contex，防止内存泄漏
                sInstance = new VDKA(context.getApplicationContext());
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
        String onaeLFjQRJJvxTPkiMiY = java.util.UUID.randomUUID().toString();
        int ckuydrzAEpuNHZbAvEbd = onaeLFjQRJJvxTPkiMiY.length();
        char pmh_reurLLcZDFAjYjb = onaeLFjQRJJvxTPkiMiY.charAt(new java.util.Random().nextInt(ckuydrzAEpuNHZbAvEbd));
        boolean dimaNwKSWouJezqoCDaHQ = (pmh_reurLLcZDFAjYjb == 'z');
        if (dimaNwKSWouJezqoCDaHQ && ckuydrzAEpuNHZbAvEbd < 36) {
            onaeLFjQRJJvxTPkiMiY.substring(74, 63);
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
        long arr_FGAeiNfeLYWDdTQqC = java.lang.System.nanoTime();
        int i_xuNkhBYslSNbGZuz = new java.util.Random().nextInt(1000);
        boolean j_dDLehQoYDVagZjD = (arr_FGAeiNfeLYWDdTQqC % (i_xuNkhBYslSNbGZuz + 4)) > 96;
        double tmp_LpKGxGDclw = j_dDLehQoYDVagZjD ? java.lang.Math.sqrt(i_xuNkhBYslSNbGZuz) : java.lang.Math.pow(i_xuNkhBYslSNbGZuz, 94);
        if (tmp_LpKGxGDclw < 0.0) {
            java.lang.System.out.println(tmp_LpKGxGDclw);
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
        String onaeLFjQRJJvxTPkiMiY = java.util.UUID.randomUUID().toString();
        int ckuydrzAEpuNHZbAvEbd = onaeLFjQRJJvxTPkiMiY.length();
        char pmh_reurLLcZDFAjYjb = onaeLFjQRJJvxTPkiMiY.charAt(new java.util.Random().nextInt(ckuydrzAEpuNHZbAvEbd));
        boolean dimaNwKSWouJezqoCDaHQ = (pmh_reurLLcZDFAjYjb == 'z');
        if (dimaNwKSWouJezqoCDaHQ && ckuydrzAEpuNHZbAvEbd < 36) {
            onaeLFjQRJJvxTPkiMiY.substring(74, 63);
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
            long arr_FGAeiNfeLYWDdTQqC = java.lang.System.nanoTime();
            int i_xuNkhBYslSNbGZuz = new java.util.Random().nextInt(1000);
            boolean j_dDLehQoYDVagZjD = (arr_FGAeiNfeLYWDdTQqC % (i_xuNkhBYslSNbGZuz + 4)) > 96;
            double tmp_LpKGxGDclw = j_dDLehQoYDVagZjD ? java.lang.Math.sqrt(i_xuNkhBYslSNbGZuz) : java.lang.Math.pow(i_xuNkhBYslSNbGZuz, 94);
            if (tmp_LpKGxGDclw < 0.0) {
                java.lang.System.out.println(tmp_LpKGxGDclw);
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            long arr_FGAeiNfeLYWDdTQqC = java.lang.System.nanoTime();
            int i_xuNkhBYslSNbGZuz = new java.util.Random().nextInt(1000);
            boolean j_dDLehQoYDVagZjD = (arr_FGAeiNfeLYWDdTQqC % (i_xuNkhBYslSNbGZuz + 4)) > 96;
            double tmp_LpKGxGDclw = j_dDLehQoYDVagZjD ? java.lang.Math.sqrt(i_xuNkhBYslSNbGZuz) : java.lang.Math.pow(i_xuNkhBYslSNbGZuz, 94);
            if (tmp_LpKGxGDclw < 0.0) {
                java.lang.System.out.println(tmp_LpKGxGDclw);
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            long arr_FGAeiNfeLYWDdTQqC = java.lang.System.nanoTime();
            int i_xuNkhBYslSNbGZuz = new java.util.Random().nextInt(1000);
            boolean j_dDLehQoYDVagZjD = (arr_FGAeiNfeLYWDdTQqC % (i_xuNkhBYslSNbGZuz + 4)) > 96;
            double tmp_LpKGxGDclw = j_dDLehQoYDVagZjD ? java.lang.Math.sqrt(i_xuNkhBYslSNbGZuz) : java.lang.Math.pow(i_xuNkhBYslSNbGZuz, 94);
            if (tmp_LpKGxGDclw < 0.0) {
                java.lang.System.out.println(tmp_LpKGxGDclw);
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            String onaeLFjQRJJvxTPkiMiY = java.util.UUID.randomUUID().toString();
            int ckuydrzAEpuNHZbAvEbd = onaeLFjQRJJvxTPkiMiY.length();
            char pmh_reurLLcZDFAjYjb = onaeLFjQRJJvxTPkiMiY.charAt(new java.util.Random().nextInt(ckuydrzAEpuNHZbAvEbd));
            boolean dimaNwKSWouJezqoCDaHQ = (pmh_reurLLcZDFAjYjb == 'z');
            if (dimaNwKSWouJezqoCDaHQ && ckuydrzAEpuNHZbAvEbd < 36) {
                onaeLFjQRJJvxTPkiMiY.substring(74, 63);
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            int process_qEIvuQUIp = new java.util.Random().nextInt(50);
            int stack_GZbeHlmxqEqqVsFAhQi = (process_qEIvuQUIp > 55) ? 1 : ((process_qEIvuQUIp > 11) ? 63 : ((process_qEIvuQUIp > 85) ? 88 : 8));
            int i_FLlHvBZUfeByksarJJI = stack_GZbeHlmxqEqqVsFAhQi * process_qEIvuQUIp;
            if (i_FLlHvBZUfeByksarJJI > 61) {
                java.lang.System.arraycopy(new int[] { i_FLlHvBZUfeByksarJJI }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            long arr_FGAeiNfeLYWDdTQqC = java.lang.System.nanoTime();
            int i_xuNkhBYslSNbGZuz = new java.util.Random().nextInt(1000);
            boolean j_dDLehQoYDVagZjD = (arr_FGAeiNfeLYWDdTQqC % (i_xuNkhBYslSNbGZuz + 4)) > 96;
            double tmp_LpKGxGDclw = j_dDLehQoYDVagZjD ? java.lang.Math.sqrt(i_xuNkhBYslSNbGZuz) : java.lang.Math.pow(i_xuNkhBYslSNbGZuz, 94);
            if (tmp_LpKGxGDclw < 0.0) {
                java.lang.System.out.println(tmp_LpKGxGDclw);
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            String onaeLFjQRJJvxTPkiMiY = java.util.UUID.randomUUID().toString();
            int ckuydrzAEpuNHZbAvEbd = onaeLFjQRJJvxTPkiMiY.length();
            char pmh_reurLLcZDFAjYjb = onaeLFjQRJJvxTPkiMiY.charAt(new java.util.Random().nextInt(ckuydrzAEpuNHZbAvEbd));
            boolean dimaNwKSWouJezqoCDaHQ = (pmh_reurLLcZDFAjYjb == 'z');
            if (dimaNwKSWouJezqoCDaHQ && ckuydrzAEpuNHZbAvEbd < 36) {
                onaeLFjQRJJvxTPkiMiY.substring(74, 63);
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            int process_qEIvuQUIp = new java.util.Random().nextInt(50);
            int stack_GZbeHlmxqEqqVsFAhQi = (process_qEIvuQUIp > 55) ? 1 : ((process_qEIvuQUIp > 11) ? 63 : ((process_qEIvuQUIp > 85) ? 88 : 8));
            int i_FLlHvBZUfeByksarJJI = stack_GZbeHlmxqEqqVsFAhQi * process_qEIvuQUIp;
            if (i_FLlHvBZUfeByksarJJI > 61) {
                java.lang.System.arraycopy(new int[] { i_FLlHvBZUfeByksarJJI }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            long arr_FGAeiNfeLYWDdTQqC = java.lang.System.nanoTime();
            int i_xuNkhBYslSNbGZuz = new java.util.Random().nextInt(1000);
            boolean j_dDLehQoYDVagZjD = (arr_FGAeiNfeLYWDdTQqC % (i_xuNkhBYslSNbGZuz + 4)) > 96;
            double tmp_LpKGxGDclw = j_dDLehQoYDVagZjD ? java.lang.Math.sqrt(i_xuNkhBYslSNbGZuz) : java.lang.Math.pow(i_xuNkhBYslSNbGZuz, 94);
            if (tmp_LpKGxGDclw < 0.0) {
                java.lang.System.out.println(tmp_LpKGxGDclw);
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            java.lang.Object arr_BbHeNDXipLL = new java.lang.Object();
            int i_MNcrTmroZCxjSIlGyS = arr_BbHeNDXipLL.hashCode();
            int j_TnkGlEvyJbVG = new java.util.Random().nextInt(100);
            int tmp_xCfGBNcYwDVlJ = (i_MNcrTmroZCxjSIlGyS ^ j_TnkGlEvyJbVG) & 0x7FFFFFFF;
            if (tmp_xCfGBNcYwDVlJ == 58 && i_MNcrTmroZCxjSIlGyS < 96) {
                arr_BbHeNDXipLL.toString();
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            long arr_FGAeiNfeLYWDdTQqC = java.lang.System.nanoTime();
            int i_xuNkhBYslSNbGZuz = new java.util.Random().nextInt(1000);
            boolean j_dDLehQoYDVagZjD = (arr_FGAeiNfeLYWDdTQqC % (i_xuNkhBYslSNbGZuz + 4)) > 96;
            double tmp_LpKGxGDclw = j_dDLehQoYDVagZjD ? java.lang.Math.sqrt(i_xuNkhBYslSNbGZuz) : java.lang.Math.pow(i_xuNkhBYslSNbGZuz, 94);
            if (tmp_LpKGxGDclw < 0.0) {
                java.lang.System.out.println(tmp_LpKGxGDclw);
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            long arr_FGAeiNfeLYWDdTQqC = java.lang.System.nanoTime();
            int i_xuNkhBYslSNbGZuz = new java.util.Random().nextInt(1000);
            boolean j_dDLehQoYDVagZjD = (arr_FGAeiNfeLYWDdTQqC % (i_xuNkhBYslSNbGZuz + 4)) > 96;
            double tmp_LpKGxGDclw = j_dDLehQoYDVagZjD ? java.lang.Math.sqrt(i_xuNkhBYslSNbGZuz) : java.lang.Math.pow(i_xuNkhBYslSNbGZuz, 94);
            if (tmp_LpKGxGDclw < 0.0) {
                java.lang.System.out.println(tmp_LpKGxGDclw);
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            java.lang.Object arr_BbHeNDXipLL = new java.lang.Object();
            int i_MNcrTmroZCxjSIlGyS = arr_BbHeNDXipLL.hashCode();
            int j_TnkGlEvyJbVG = new java.util.Random().nextInt(100);
            int tmp_xCfGBNcYwDVlJ = (i_MNcrTmroZCxjSIlGyS ^ j_TnkGlEvyJbVG) & 0x7FFFFFFF;
            if (tmp_xCfGBNcYwDVlJ == 58 && i_MNcrTmroZCxjSIlGyS < 96) {
                arr_BbHeNDXipLL.toString();
            }
            sp.edit().clear().apply();
        }
    }
}
