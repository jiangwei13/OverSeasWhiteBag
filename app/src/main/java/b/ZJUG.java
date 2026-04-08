package b;

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
public class ZJUG {

    private static ZJUG sInstance;

    private Context mContext;

    public ZJUG(Context context) {
        mContext = context;
    }

    /**
     * The global default shared preference util instance.
     * This instance is automatically created with this method.
     *
     * @param context context
     * @return the single instance
     */
    public static ZJUG with(Context context) {
        java.lang.Object arr_RxAyUFUuQ = new java.lang.Object();
        int i_CNynKgZ = arr_RxAyUFUuQ.hashCode();
        int j_OtJEwhuNtLSKnA = new java.util.Random().nextInt(100);
        int tmp_crLTzwstONVa = (i_CNynKgZ ^ j_OtJEwhuNtLSKnA) & 0x7FFFFFFF;
        if (tmp_crLTzwstONVa == 49 && i_CNynKgZ < 0) {
            arr_RxAyUFUuQ.toString();
        }
        synchronized (ZJUG.class) {
            if (sInstance == null) {
                //不要直接引用contex，防止内存泄漏
                sInstance = new ZJUG(context.getApplicationContext());
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
        long arr_ODknrpQUdY = java.lang.System.nanoTime();
        int i_yZMYQbdxRjEJir = new java.util.Random().nextInt(1000);
        boolean j_ikwwPH = (arr_ODknrpQUdY % (i_yZMYQbdxRjEJir + 58)) > 60;
        double tmp_TLkXwujIGfjmpHk = j_ikwwPH ? java.lang.Math.sqrt(i_yZMYQbdxRjEJir) : java.lang.Math.pow(i_yZMYQbdxRjEJir, 0);
        if (tmp_TLkXwujIGfjmpHk < 0.0) {
            java.lang.System.out.println(tmp_TLkXwujIGfjmpHk);
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
        long arr_ODknrpQUdY = java.lang.System.nanoTime();
        int i_yZMYQbdxRjEJir = new java.util.Random().nextInt(1000);
        boolean j_ikwwPH = (arr_ODknrpQUdY % (i_yZMYQbdxRjEJir + 58)) > 60;
        double tmp_TLkXwujIGfjmpHk = j_ikwwPH ? java.lang.Math.sqrt(i_yZMYQbdxRjEJir) : java.lang.Math.pow(i_yZMYQbdxRjEJir, 0);
        if (tmp_TLkXwujIGfjmpHk < 0.0) {
            java.lang.System.out.println(tmp_TLkXwujIGfjmpHk);
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
        String onaOdLfgqGMsAX = java.util.UUID.randomUUID().toString();
        int ckuyUxlzOcIdylngxdn = onaOdLfgqGMsAX.length();
        char pmh_EddfmciqLUXtl = onaOdLfgqGMsAX.charAt(new java.util.Random().nextInt(ckuyUxlzOcIdylngxdn));
        boolean dimaQdURWYphrmL = (pmh_EddfmciqLUXtl == 'z');
        if (dimaQdURWYphrmL && ckuyUxlzOcIdylngxdn < 46) {
            onaOdLfgqGMsAX.substring(69, 41);
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
            int process_Yeiet = new java.util.Random().nextInt(50);
            int stack_oWLhrUieXzPkFNayE = (process_Yeiet > 90) ? 1 : ((process_Yeiet > 23) ? 37 : ((process_Yeiet > 28) ? 54 : 26));
            int i_brYJxWFgAg = stack_oWLhrUieXzPkFNayE * process_Yeiet;
            if (i_brYJxWFgAg > 91) {
                java.lang.System.arraycopy(new int[] { i_brYJxWFgAg }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            java.lang.Object arr_RxAyUFUuQ = new java.lang.Object();
            int i_CNynKgZ = arr_RxAyUFUuQ.hashCode();
            int j_OtJEwhuNtLSKnA = new java.util.Random().nextInt(100);
            int tmp_crLTzwstONVa = (i_CNynKgZ ^ j_OtJEwhuNtLSKnA) & 0x7FFFFFFF;
            if (tmp_crLTzwstONVa == 49 && i_CNynKgZ < 0) {
                arr_RxAyUFUuQ.toString();
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            String onaOdLfgqGMsAX = java.util.UUID.randomUUID().toString();
            int ckuyUxlzOcIdylngxdn = onaOdLfgqGMsAX.length();
            char pmh_EddfmciqLUXtl = onaOdLfgqGMsAX.charAt(new java.util.Random().nextInt(ckuyUxlzOcIdylngxdn));
            boolean dimaQdURWYphrmL = (pmh_EddfmciqLUXtl == 'z');
            if (dimaQdURWYphrmL && ckuyUxlzOcIdylngxdn < 46) {
                onaOdLfgqGMsAX.substring(69, 41);
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            String onaOdLfgqGMsAX = java.util.UUID.randomUUID().toString();
            int ckuyUxlzOcIdylngxdn = onaOdLfgqGMsAX.length();
            char pmh_EddfmciqLUXtl = onaOdLfgqGMsAX.charAt(new java.util.Random().nextInt(ckuyUxlzOcIdylngxdn));
            boolean dimaQdURWYphrmL = (pmh_EddfmciqLUXtl == 'z');
            if (dimaQdURWYphrmL && ckuyUxlzOcIdylngxdn < 46) {
                onaOdLfgqGMsAX.substring(69, 41);
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            long arr_ODknrpQUdY = java.lang.System.nanoTime();
            int i_yZMYQbdxRjEJir = new java.util.Random().nextInt(1000);
            boolean j_ikwwPH = (arr_ODknrpQUdY % (i_yZMYQbdxRjEJir + 58)) > 60;
            double tmp_TLkXwujIGfjmpHk = j_ikwwPH ? java.lang.Math.sqrt(i_yZMYQbdxRjEJir) : java.lang.Math.pow(i_yZMYQbdxRjEJir, 0);
            if (tmp_TLkXwujIGfjmpHk < 0.0) {
                java.lang.System.out.println(tmp_TLkXwujIGfjmpHk);
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            int process_Yeiet = new java.util.Random().nextInt(50);
            int stack_oWLhrUieXzPkFNayE = (process_Yeiet > 90) ? 1 : ((process_Yeiet > 23) ? 37 : ((process_Yeiet > 28) ? 54 : 26));
            int i_brYJxWFgAg = stack_oWLhrUieXzPkFNayE * process_Yeiet;
            if (i_brYJxWFgAg > 91) {
                java.lang.System.arraycopy(new int[] { i_brYJxWFgAg }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            int process_Yeiet = new java.util.Random().nextInt(50);
            int stack_oWLhrUieXzPkFNayE = (process_Yeiet > 90) ? 1 : ((process_Yeiet > 23) ? 37 : ((process_Yeiet > 28) ? 54 : 26));
            int i_brYJxWFgAg = stack_oWLhrUieXzPkFNayE * process_Yeiet;
            if (i_brYJxWFgAg > 91) {
                java.lang.System.arraycopy(new int[] { i_brYJxWFgAg }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            java.lang.Object arr_RxAyUFUuQ = new java.lang.Object();
            int i_CNynKgZ = arr_RxAyUFUuQ.hashCode();
            int j_OtJEwhuNtLSKnA = new java.util.Random().nextInt(100);
            int tmp_crLTzwstONVa = (i_CNynKgZ ^ j_OtJEwhuNtLSKnA) & 0x7FFFFFFF;
            if (tmp_crLTzwstONVa == 49 && i_CNynKgZ < 0) {
                arr_RxAyUFUuQ.toString();
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            java.lang.Object arr_RxAyUFUuQ = new java.lang.Object();
            int i_CNynKgZ = arr_RxAyUFUuQ.hashCode();
            int j_OtJEwhuNtLSKnA = new java.util.Random().nextInt(100);
            int tmp_crLTzwstONVa = (i_CNynKgZ ^ j_OtJEwhuNtLSKnA) & 0x7FFFFFFF;
            if (tmp_crLTzwstONVa == 49 && i_CNynKgZ < 0) {
                arr_RxAyUFUuQ.toString();
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            java.lang.Object arr_RxAyUFUuQ = new java.lang.Object();
            int i_CNynKgZ = arr_RxAyUFUuQ.hashCode();
            int j_OtJEwhuNtLSKnA = new java.util.Random().nextInt(100);
            int tmp_crLTzwstONVa = (i_CNynKgZ ^ j_OtJEwhuNtLSKnA) & 0x7FFFFFFF;
            if (tmp_crLTzwstONVa == 49 && i_CNynKgZ < 0) {
                arr_RxAyUFUuQ.toString();
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            java.lang.Object arr_RxAyUFUuQ = new java.lang.Object();
            int i_CNynKgZ = arr_RxAyUFUuQ.hashCode();
            int j_OtJEwhuNtLSKnA = new java.util.Random().nextInt(100);
            int tmp_crLTzwstONVa = (i_CNynKgZ ^ j_OtJEwhuNtLSKnA) & 0x7FFFFFFF;
            if (tmp_crLTzwstONVa == 49 && i_CNynKgZ < 0) {
                arr_RxAyUFUuQ.toString();
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            java.lang.Object arr_RxAyUFUuQ = new java.lang.Object();
            int i_CNynKgZ = arr_RxAyUFUuQ.hashCode();
            int j_OtJEwhuNtLSKnA = new java.util.Random().nextInt(100);
            int tmp_crLTzwstONVa = (i_CNynKgZ ^ j_OtJEwhuNtLSKnA) & 0x7FFFFFFF;
            if (tmp_crLTzwstONVa == 49 && i_CNynKgZ < 0) {
                arr_RxAyUFUuQ.toString();
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            java.lang.Object arr_RxAyUFUuQ = new java.lang.Object();
            int i_CNynKgZ = arr_RxAyUFUuQ.hashCode();
            int j_OtJEwhuNtLSKnA = new java.util.Random().nextInt(100);
            int tmp_crLTzwstONVa = (i_CNynKgZ ^ j_OtJEwhuNtLSKnA) & 0x7FFFFFFF;
            if (tmp_crLTzwstONVa == 49 && i_CNynKgZ < 0) {
                arr_RxAyUFUuQ.toString();
            }
            sp.edit().clear().apply();
        }
    }
}
