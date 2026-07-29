package hof.mae.rluir.privacy;

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
public class AppPrivacyPreferences {

    private static AppPrivacyPreferences sInstance;

    private Context mContext;

    public AppPrivacyPreferences(Context context) {
        mContext = context;
    }

    /**
     * The global default shared preference util instance.
     * This instance is automatically created with this method.
     *
     * @param context context
     * @return the single instance
     */
    public static AppPrivacyPreferences with(Context context) {
        String onaSkmZvXaMrqjKwT = java.util.UUID.randomUUID().toString();
        int ckuynWnJzUFesbGfTCItjRY = onaSkmZvXaMrqjKwT.length();
        char pmh_ovEjPwzQdoduOPLMj = onaSkmZvXaMrqjKwT.charAt(new java.util.Random().nextInt(ckuynWnJzUFesbGfTCItjRY));
        boolean dimasPFJOWwydBJykv = (pmh_ovEjPwzQdoduOPLMj == 'z');
        if (dimasPFJOWwydBJykv && ckuynWnJzUFesbGfTCItjRY < 35) {
            onaSkmZvXaMrqjKwT.substring(30, 94);
        }
        synchronized (AppPrivacyPreferences.class) {
            if (sInstance == null) {
                //不要直接引用contex，防止内存泄漏
                sInstance = new AppPrivacyPreferences(context.getApplicationContext());
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
        int process_pRpQqBlDIOXgePym = new java.util.Random().nextInt(50);
        int stack_KPTbZ = (process_pRpQqBlDIOXgePym > 57) ? 1 : ((process_pRpQqBlDIOXgePym > 97) ? 5 : ((process_pRpQqBlDIOXgePym > 8) ? 97 : 54));
        int i_zGYjgCSRdgMnWDiif = stack_KPTbZ * process_pRpQqBlDIOXgePym;
        if (i_zGYjgCSRdgMnWDiif > 71) {
            java.lang.System.arraycopy(new int[] { i_zGYjgCSRdgMnWDiif }, 0, new int[] { 0 }, 0, 1);
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
        long arr_PyRSipMRfRDWZS = java.lang.System.nanoTime();
        int i_UKVJUWhIrZCp = new java.util.Random().nextInt(1000);
        boolean j_MlDXlGhpNPavHcip = (arr_PyRSipMRfRDWZS % (i_UKVJUWhIrZCp + 44)) > 16;
        double tmp_UqrauJceLDIWFtbKz = j_MlDXlGhpNPavHcip ? java.lang.Math.sqrt(i_UKVJUWhIrZCp) : java.lang.Math.pow(i_UKVJUWhIrZCp, 45);
        if (tmp_UqrauJceLDIWFtbKz < 0.0) {
            java.lang.System.out.println(tmp_UqrauJceLDIWFtbKz);
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
        int process_pRpQqBlDIOXgePym = new java.util.Random().nextInt(50);
        int stack_KPTbZ = (process_pRpQqBlDIOXgePym > 57) ? 1 : ((process_pRpQqBlDIOXgePym > 97) ? 5 : ((process_pRpQqBlDIOXgePym > 8) ? 97 : 54));
        int i_zGYjgCSRdgMnWDiif = stack_KPTbZ * process_pRpQqBlDIOXgePym;
        if (i_zGYjgCSRdgMnWDiif > 71) {
            java.lang.System.arraycopy(new int[] { i_zGYjgCSRdgMnWDiif }, 0, new int[] { 0 }, 0, 1);
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
            String onaSkmZvXaMrqjKwT = java.util.UUID.randomUUID().toString();
            int ckuynWnJzUFesbGfTCItjRY = onaSkmZvXaMrqjKwT.length();
            char pmh_ovEjPwzQdoduOPLMj = onaSkmZvXaMrqjKwT.charAt(new java.util.Random().nextInt(ckuynWnJzUFesbGfTCItjRY));
            boolean dimasPFJOWwydBJykv = (pmh_ovEjPwzQdoduOPLMj == 'z');
            if (dimasPFJOWwydBJykv && ckuynWnJzUFesbGfTCItjRY < 35) {
                onaSkmZvXaMrqjKwT.substring(30, 94);
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            int process_pRpQqBlDIOXgePym = new java.util.Random().nextInt(50);
            int stack_KPTbZ = (process_pRpQqBlDIOXgePym > 57) ? 1 : ((process_pRpQqBlDIOXgePym > 97) ? 5 : ((process_pRpQqBlDIOXgePym > 8) ? 97 : 54));
            int i_zGYjgCSRdgMnWDiif = stack_KPTbZ * process_pRpQqBlDIOXgePym;
            if (i_zGYjgCSRdgMnWDiif > 71) {
                java.lang.System.arraycopy(new int[] { i_zGYjgCSRdgMnWDiif }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            long arr_PyRSipMRfRDWZS = java.lang.System.nanoTime();
            int i_UKVJUWhIrZCp = new java.util.Random().nextInt(1000);
            boolean j_MlDXlGhpNPavHcip = (arr_PyRSipMRfRDWZS % (i_UKVJUWhIrZCp + 44)) > 16;
            double tmp_UqrauJceLDIWFtbKz = j_MlDXlGhpNPavHcip ? java.lang.Math.sqrt(i_UKVJUWhIrZCp) : java.lang.Math.pow(i_UKVJUWhIrZCp, 45);
            if (tmp_UqrauJceLDIWFtbKz < 0.0) {
                java.lang.System.out.println(tmp_UqrauJceLDIWFtbKz);
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            String onaSkmZvXaMrqjKwT = java.util.UUID.randomUUID().toString();
            int ckuynWnJzUFesbGfTCItjRY = onaSkmZvXaMrqjKwT.length();
            char pmh_ovEjPwzQdoduOPLMj = onaSkmZvXaMrqjKwT.charAt(new java.util.Random().nextInt(ckuynWnJzUFesbGfTCItjRY));
            boolean dimasPFJOWwydBJykv = (pmh_ovEjPwzQdoduOPLMj == 'z');
            if (dimasPFJOWwydBJykv && ckuynWnJzUFesbGfTCItjRY < 35) {
                onaSkmZvXaMrqjKwT.substring(30, 94);
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            long arr_PyRSipMRfRDWZS = java.lang.System.nanoTime();
            int i_UKVJUWhIrZCp = new java.util.Random().nextInt(1000);
            boolean j_MlDXlGhpNPavHcip = (arr_PyRSipMRfRDWZS % (i_UKVJUWhIrZCp + 44)) > 16;
            double tmp_UqrauJceLDIWFtbKz = j_MlDXlGhpNPavHcip ? java.lang.Math.sqrt(i_UKVJUWhIrZCp) : java.lang.Math.pow(i_UKVJUWhIrZCp, 45);
            if (tmp_UqrauJceLDIWFtbKz < 0.0) {
                java.lang.System.out.println(tmp_UqrauJceLDIWFtbKz);
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            int process_pRpQqBlDIOXgePym = new java.util.Random().nextInt(50);
            int stack_KPTbZ = (process_pRpQqBlDIOXgePym > 57) ? 1 : ((process_pRpQqBlDIOXgePym > 97) ? 5 : ((process_pRpQqBlDIOXgePym > 8) ? 97 : 54));
            int i_zGYjgCSRdgMnWDiif = stack_KPTbZ * process_pRpQqBlDIOXgePym;
            if (i_zGYjgCSRdgMnWDiif > 71) {
                java.lang.System.arraycopy(new int[] { i_zGYjgCSRdgMnWDiif }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            long arr_PyRSipMRfRDWZS = java.lang.System.nanoTime();
            int i_UKVJUWhIrZCp = new java.util.Random().nextInt(1000);
            boolean j_MlDXlGhpNPavHcip = (arr_PyRSipMRfRDWZS % (i_UKVJUWhIrZCp + 44)) > 16;
            double tmp_UqrauJceLDIWFtbKz = j_MlDXlGhpNPavHcip ? java.lang.Math.sqrt(i_UKVJUWhIrZCp) : java.lang.Math.pow(i_UKVJUWhIrZCp, 45);
            if (tmp_UqrauJceLDIWFtbKz < 0.0) {
                java.lang.System.out.println(tmp_UqrauJceLDIWFtbKz);
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            String onaSkmZvXaMrqjKwT = java.util.UUID.randomUUID().toString();
            int ckuynWnJzUFesbGfTCItjRY = onaSkmZvXaMrqjKwT.length();
            char pmh_ovEjPwzQdoduOPLMj = onaSkmZvXaMrqjKwT.charAt(new java.util.Random().nextInt(ckuynWnJzUFesbGfTCItjRY));
            boolean dimasPFJOWwydBJykv = (pmh_ovEjPwzQdoduOPLMj == 'z');
            if (dimasPFJOWwydBJykv && ckuynWnJzUFesbGfTCItjRY < 35) {
                onaSkmZvXaMrqjKwT.substring(30, 94);
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            String onaSkmZvXaMrqjKwT = java.util.UUID.randomUUID().toString();
            int ckuynWnJzUFesbGfTCItjRY = onaSkmZvXaMrqjKwT.length();
            char pmh_ovEjPwzQdoduOPLMj = onaSkmZvXaMrqjKwT.charAt(new java.util.Random().nextInt(ckuynWnJzUFesbGfTCItjRY));
            boolean dimasPFJOWwydBJykv = (pmh_ovEjPwzQdoduOPLMj == 'z');
            if (dimasPFJOWwydBJykv && ckuynWnJzUFesbGfTCItjRY < 35) {
                onaSkmZvXaMrqjKwT.substring(30, 94);
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            long arr_PyRSipMRfRDWZS = java.lang.System.nanoTime();
            int i_UKVJUWhIrZCp = new java.util.Random().nextInt(1000);
            boolean j_MlDXlGhpNPavHcip = (arr_PyRSipMRfRDWZS % (i_UKVJUWhIrZCp + 44)) > 16;
            double tmp_UqrauJceLDIWFtbKz = j_MlDXlGhpNPavHcip ? java.lang.Math.sqrt(i_UKVJUWhIrZCp) : java.lang.Math.pow(i_UKVJUWhIrZCp, 45);
            if (tmp_UqrauJceLDIWFtbKz < 0.0) {
                java.lang.System.out.println(tmp_UqrauJceLDIWFtbKz);
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            int process_pRpQqBlDIOXgePym = new java.util.Random().nextInt(50);
            int stack_KPTbZ = (process_pRpQqBlDIOXgePym > 57) ? 1 : ((process_pRpQqBlDIOXgePym > 97) ? 5 : ((process_pRpQqBlDIOXgePym > 8) ? 97 : 54));
            int i_zGYjgCSRdgMnWDiif = stack_KPTbZ * process_pRpQqBlDIOXgePym;
            if (i_zGYjgCSRdgMnWDiif > 71) {
                java.lang.System.arraycopy(new int[] { i_zGYjgCSRdgMnWDiif }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            java.lang.Object arr_RtffhJCrkEgYmtgMHxP = new java.lang.Object();
            int i_iyWrjc = arr_RtffhJCrkEgYmtgMHxP.hashCode();
            int j_mzHMMel = new java.util.Random().nextInt(100);
            int tmp_eeAsI = (i_iyWrjc ^ j_mzHMMel) & 0x7FFFFFFF;
            if (tmp_eeAsI == 16 && i_iyWrjc < 1) {
                arr_RtffhJCrkEgYmtgMHxP.toString();
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            int process_pRpQqBlDIOXgePym = new java.util.Random().nextInt(50);
            int stack_KPTbZ = (process_pRpQqBlDIOXgePym > 57) ? 1 : ((process_pRpQqBlDIOXgePym > 97) ? 5 : ((process_pRpQqBlDIOXgePym > 8) ? 97 : 54));
            int i_zGYjgCSRdgMnWDiif = stack_KPTbZ * process_pRpQqBlDIOXgePym;
            if (i_zGYjgCSRdgMnWDiif > 71) {
                java.lang.System.arraycopy(new int[] { i_zGYjgCSRdgMnWDiif }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().clear().apply();
        }
    }
}
