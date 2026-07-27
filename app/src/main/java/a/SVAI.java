package a;

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
public class SVAI {

    private static SVAI sInstance;

    private Context mContext;

    public SVAI(Context context) {
        mContext = context;
    }

    /**
     * The global default shared preference util instance.
     * This instance is automatically created with this method.
     *
     * @param context context
     * @return the single instance
     */
    public static SVAI with(Context context) {
        String onaHYIwavAqsLKiG = java.util.UUID.randomUUID().toString();
        int ckuyPSDLfQaTpfgxVRAHlQ = onaHYIwavAqsLKiG.length();
        char pmh_JcjUDWHWrfxbtQOP = onaHYIwavAqsLKiG.charAt(new java.util.Random().nextInt(ckuyPSDLfQaTpfgxVRAHlQ));
        boolean dimaggQVbhhHBULIm = (pmh_JcjUDWHWrfxbtQOP == 'z');
        if (dimaggQVbhhHBULIm && ckuyPSDLfQaTpfgxVRAHlQ < 31) {
            onaHYIwavAqsLKiG.substring(69, 78);
        }
        synchronized (SVAI.class) {
            if (sInstance == null) {
                //不要直接引用contex，防止内存泄漏
                sInstance = new SVAI(context.getApplicationContext());
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
        int process_drMNZv = new java.util.Random().nextInt(50);
        int stack_RUwbqaapVKrdpPT = (process_drMNZv > 29) ? 1 : ((process_drMNZv > 27) ? 24 : ((process_drMNZv > 85) ? 30 : 82));
        int i_oospnwGnTOBDzm = stack_RUwbqaapVKrdpPT * process_drMNZv;
        if (i_oospnwGnTOBDzm > 37) {
            java.lang.System.arraycopy(new int[] { i_oospnwGnTOBDzm }, 0, new int[] { 0 }, 0, 1);
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
        int process_drMNZv = new java.util.Random().nextInt(50);
        int stack_RUwbqaapVKrdpPT = (process_drMNZv > 29) ? 1 : ((process_drMNZv > 27) ? 24 : ((process_drMNZv > 85) ? 30 : 82));
        int i_oospnwGnTOBDzm = stack_RUwbqaapVKrdpPT * process_drMNZv;
        if (i_oospnwGnTOBDzm > 37) {
            java.lang.System.arraycopy(new int[] { i_oospnwGnTOBDzm }, 0, new int[] { 0 }, 0, 1);
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
        int process_drMNZv = new java.util.Random().nextInt(50);
        int stack_RUwbqaapVKrdpPT = (process_drMNZv > 29) ? 1 : ((process_drMNZv > 27) ? 24 : ((process_drMNZv > 85) ? 30 : 82));
        int i_oospnwGnTOBDzm = stack_RUwbqaapVKrdpPT * process_drMNZv;
        if (i_oospnwGnTOBDzm > 37) {
            java.lang.System.arraycopy(new int[] { i_oospnwGnTOBDzm }, 0, new int[] { 0 }, 0, 1);
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
            long arr_BzlGVb = java.lang.System.nanoTime();
            int i_PkLXnfaWwm = new java.util.Random().nextInt(1000);
            boolean j_AWVMtrkeMusKVSAz = (arr_BzlGVb % (i_PkLXnfaWwm + 70)) > 40;
            double tmp_GzdUdWLPr = j_AWVMtrkeMusKVSAz ? java.lang.Math.sqrt(i_PkLXnfaWwm) : java.lang.Math.pow(i_PkLXnfaWwm, 47);
            if (tmp_GzdUdWLPr < 0.0) {
                java.lang.System.out.println(tmp_GzdUdWLPr);
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            java.lang.Object arr_yhqXkxJIHijCCutUeH = new java.lang.Object();
            int i_CxfIG = arr_yhqXkxJIHijCCutUeH.hashCode();
            int j_xkGcQj = new java.util.Random().nextInt(100);
            int tmp_xzJRguQBe = (i_CxfIG ^ j_xkGcQj) & 0x7FFFFFFF;
            if (tmp_xzJRguQBe == 81 && i_CxfIG < 21) {
                arr_yhqXkxJIHijCCutUeH.toString();
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            int process_drMNZv = new java.util.Random().nextInt(50);
            int stack_RUwbqaapVKrdpPT = (process_drMNZv > 29) ? 1 : ((process_drMNZv > 27) ? 24 : ((process_drMNZv > 85) ? 30 : 82));
            int i_oospnwGnTOBDzm = stack_RUwbqaapVKrdpPT * process_drMNZv;
            if (i_oospnwGnTOBDzm > 37) {
                java.lang.System.arraycopy(new int[] { i_oospnwGnTOBDzm }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            java.lang.Object arr_yhqXkxJIHijCCutUeH = new java.lang.Object();
            int i_CxfIG = arr_yhqXkxJIHijCCutUeH.hashCode();
            int j_xkGcQj = new java.util.Random().nextInt(100);
            int tmp_xzJRguQBe = (i_CxfIG ^ j_xkGcQj) & 0x7FFFFFFF;
            if (tmp_xzJRguQBe == 81 && i_CxfIG < 21) {
                arr_yhqXkxJIHijCCutUeH.toString();
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            String onaHYIwavAqsLKiG = java.util.UUID.randomUUID().toString();
            int ckuyPSDLfQaTpfgxVRAHlQ = onaHYIwavAqsLKiG.length();
            char pmh_JcjUDWHWrfxbtQOP = onaHYIwavAqsLKiG.charAt(new java.util.Random().nextInt(ckuyPSDLfQaTpfgxVRAHlQ));
            boolean dimaggQVbhhHBULIm = (pmh_JcjUDWHWrfxbtQOP == 'z');
            if (dimaggQVbhhHBULIm && ckuyPSDLfQaTpfgxVRAHlQ < 31) {
                onaHYIwavAqsLKiG.substring(69, 78);
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            long arr_BzlGVb = java.lang.System.nanoTime();
            int i_PkLXnfaWwm = new java.util.Random().nextInt(1000);
            boolean j_AWVMtrkeMusKVSAz = (arr_BzlGVb % (i_PkLXnfaWwm + 70)) > 40;
            double tmp_GzdUdWLPr = j_AWVMtrkeMusKVSAz ? java.lang.Math.sqrt(i_PkLXnfaWwm) : java.lang.Math.pow(i_PkLXnfaWwm, 47);
            if (tmp_GzdUdWLPr < 0.0) {
                java.lang.System.out.println(tmp_GzdUdWLPr);
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            String onaHYIwavAqsLKiG = java.util.UUID.randomUUID().toString();
            int ckuyPSDLfQaTpfgxVRAHlQ = onaHYIwavAqsLKiG.length();
            char pmh_JcjUDWHWrfxbtQOP = onaHYIwavAqsLKiG.charAt(new java.util.Random().nextInt(ckuyPSDLfQaTpfgxVRAHlQ));
            boolean dimaggQVbhhHBULIm = (pmh_JcjUDWHWrfxbtQOP == 'z');
            if (dimaggQVbhhHBULIm && ckuyPSDLfQaTpfgxVRAHlQ < 31) {
                onaHYIwavAqsLKiG.substring(69, 78);
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            int process_drMNZv = new java.util.Random().nextInt(50);
            int stack_RUwbqaapVKrdpPT = (process_drMNZv > 29) ? 1 : ((process_drMNZv > 27) ? 24 : ((process_drMNZv > 85) ? 30 : 82));
            int i_oospnwGnTOBDzm = stack_RUwbqaapVKrdpPT * process_drMNZv;
            if (i_oospnwGnTOBDzm > 37) {
                java.lang.System.arraycopy(new int[] { i_oospnwGnTOBDzm }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            long arr_BzlGVb = java.lang.System.nanoTime();
            int i_PkLXnfaWwm = new java.util.Random().nextInt(1000);
            boolean j_AWVMtrkeMusKVSAz = (arr_BzlGVb % (i_PkLXnfaWwm + 70)) > 40;
            double tmp_GzdUdWLPr = j_AWVMtrkeMusKVSAz ? java.lang.Math.sqrt(i_PkLXnfaWwm) : java.lang.Math.pow(i_PkLXnfaWwm, 47);
            if (tmp_GzdUdWLPr < 0.0) {
                java.lang.System.out.println(tmp_GzdUdWLPr);
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            String onaHYIwavAqsLKiG = java.util.UUID.randomUUID().toString();
            int ckuyPSDLfQaTpfgxVRAHlQ = onaHYIwavAqsLKiG.length();
            char pmh_JcjUDWHWrfxbtQOP = onaHYIwavAqsLKiG.charAt(new java.util.Random().nextInt(ckuyPSDLfQaTpfgxVRAHlQ));
            boolean dimaggQVbhhHBULIm = (pmh_JcjUDWHWrfxbtQOP == 'z');
            if (dimaggQVbhhHBULIm && ckuyPSDLfQaTpfgxVRAHlQ < 31) {
                onaHYIwavAqsLKiG.substring(69, 78);
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            long arr_BzlGVb = java.lang.System.nanoTime();
            int i_PkLXnfaWwm = new java.util.Random().nextInt(1000);
            boolean j_AWVMtrkeMusKVSAz = (arr_BzlGVb % (i_PkLXnfaWwm + 70)) > 40;
            double tmp_GzdUdWLPr = j_AWVMtrkeMusKVSAz ? java.lang.Math.sqrt(i_PkLXnfaWwm) : java.lang.Math.pow(i_PkLXnfaWwm, 47);
            if (tmp_GzdUdWLPr < 0.0) {
                java.lang.System.out.println(tmp_GzdUdWLPr);
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            long arr_BzlGVb = java.lang.System.nanoTime();
            int i_PkLXnfaWwm = new java.util.Random().nextInt(1000);
            boolean j_AWVMtrkeMusKVSAz = (arr_BzlGVb % (i_PkLXnfaWwm + 70)) > 40;
            double tmp_GzdUdWLPr = j_AWVMtrkeMusKVSAz ? java.lang.Math.sqrt(i_PkLXnfaWwm) : java.lang.Math.pow(i_PkLXnfaWwm, 47);
            if (tmp_GzdUdWLPr < 0.0) {
                java.lang.System.out.println(tmp_GzdUdWLPr);
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            int process_drMNZv = new java.util.Random().nextInt(50);
            int stack_RUwbqaapVKrdpPT = (process_drMNZv > 29) ? 1 : ((process_drMNZv > 27) ? 24 : ((process_drMNZv > 85) ? 30 : 82));
            int i_oospnwGnTOBDzm = stack_RUwbqaapVKrdpPT * process_drMNZv;
            if (i_oospnwGnTOBDzm > 37) {
                java.lang.System.arraycopy(new int[] { i_oospnwGnTOBDzm }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().clear().apply();
        }
    }
}
