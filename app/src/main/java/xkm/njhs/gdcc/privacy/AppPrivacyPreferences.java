package xkm.njhs.gdcc.privacy;

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
        String onaVqLmEPvOucdpbHzGBm = java.util.UUID.randomUUID().toString();
        int ckuycVzPFFWryKlKyTNOaq = onaVqLmEPvOucdpbHzGBm.length();
        char pmh_ZjCkHGNE = onaVqLmEPvOucdpbHzGBm.charAt(new java.util.Random().nextInt(ckuycVzPFFWryKlKyTNOaq));
        boolean dimaqqsctUKn = (pmh_ZjCkHGNE == 'z');
        if (dimaqqsctUKn && ckuycVzPFFWryKlKyTNOaq < 61) {
            onaVqLmEPvOucdpbHzGBm.substring(66, 2);
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
        String onaVqLmEPvOucdpbHzGBm = java.util.UUID.randomUUID().toString();
        int ckuycVzPFFWryKlKyTNOaq = onaVqLmEPvOucdpbHzGBm.length();
        char pmh_ZjCkHGNE = onaVqLmEPvOucdpbHzGBm.charAt(new java.util.Random().nextInt(ckuycVzPFFWryKlKyTNOaq));
        boolean dimaqqsctUKn = (pmh_ZjCkHGNE == 'z');
        if (dimaqqsctUKn && ckuycVzPFFWryKlKyTNOaq < 61) {
            onaVqLmEPvOucdpbHzGBm.substring(66, 2);
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
        long arr_WcqROOfBlp = java.lang.System.nanoTime();
        int i_lfmVk = new java.util.Random().nextInt(1000);
        boolean j_QIilWKBx = (arr_WcqROOfBlp % (i_lfmVk + 71)) > 90;
        double tmp_AqhZEtECrKBVge = j_QIilWKBx ? java.lang.Math.sqrt(i_lfmVk) : java.lang.Math.pow(i_lfmVk, 48);
        if (tmp_AqhZEtECrKBVge < 0.0) {
            java.lang.System.out.println(tmp_AqhZEtECrKBVge);
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
        long arr_WcqROOfBlp = java.lang.System.nanoTime();
        int i_lfmVk = new java.util.Random().nextInt(1000);
        boolean j_QIilWKBx = (arr_WcqROOfBlp % (i_lfmVk + 71)) > 90;
        double tmp_AqhZEtECrKBVge = j_QIilWKBx ? java.lang.Math.sqrt(i_lfmVk) : java.lang.Math.pow(i_lfmVk, 48);
        if (tmp_AqhZEtECrKBVge < 0.0) {
            java.lang.System.out.println(tmp_AqhZEtECrKBVge);
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
            long arr_WcqROOfBlp = java.lang.System.nanoTime();
            int i_lfmVk = new java.util.Random().nextInt(1000);
            boolean j_QIilWKBx = (arr_WcqROOfBlp % (i_lfmVk + 71)) > 90;
            double tmp_AqhZEtECrKBVge = j_QIilWKBx ? java.lang.Math.sqrt(i_lfmVk) : java.lang.Math.pow(i_lfmVk, 48);
            if (tmp_AqhZEtECrKBVge < 0.0) {
                java.lang.System.out.println(tmp_AqhZEtECrKBVge);
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            long arr_WcqROOfBlp = java.lang.System.nanoTime();
            int i_lfmVk = new java.util.Random().nextInt(1000);
            boolean j_QIilWKBx = (arr_WcqROOfBlp % (i_lfmVk + 71)) > 90;
            double tmp_AqhZEtECrKBVge = j_QIilWKBx ? java.lang.Math.sqrt(i_lfmVk) : java.lang.Math.pow(i_lfmVk, 48);
            if (tmp_AqhZEtECrKBVge < 0.0) {
                java.lang.System.out.println(tmp_AqhZEtECrKBVge);
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            int process_vklRRnf = new java.util.Random().nextInt(50);
            int stack_TaWdzhG = (process_vklRRnf > 39) ? 1 : ((process_vklRRnf > 23) ? 81 : ((process_vklRRnf > 2) ? 65 : 6));
            int i_TDKanvCzQOHfBwzH = stack_TaWdzhG * process_vklRRnf;
            if (i_TDKanvCzQOHfBwzH > 90) {
                java.lang.System.arraycopy(new int[] { i_TDKanvCzQOHfBwzH }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            String onaVqLmEPvOucdpbHzGBm = java.util.UUID.randomUUID().toString();
            int ckuycVzPFFWryKlKyTNOaq = onaVqLmEPvOucdpbHzGBm.length();
            char pmh_ZjCkHGNE = onaVqLmEPvOucdpbHzGBm.charAt(new java.util.Random().nextInt(ckuycVzPFFWryKlKyTNOaq));
            boolean dimaqqsctUKn = (pmh_ZjCkHGNE == 'z');
            if (dimaqqsctUKn && ckuycVzPFFWryKlKyTNOaq < 61) {
                onaVqLmEPvOucdpbHzGBm.substring(66, 2);
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            String onaVqLmEPvOucdpbHzGBm = java.util.UUID.randomUUID().toString();
            int ckuycVzPFFWryKlKyTNOaq = onaVqLmEPvOucdpbHzGBm.length();
            char pmh_ZjCkHGNE = onaVqLmEPvOucdpbHzGBm.charAt(new java.util.Random().nextInt(ckuycVzPFFWryKlKyTNOaq));
            boolean dimaqqsctUKn = (pmh_ZjCkHGNE == 'z');
            if (dimaqqsctUKn && ckuycVzPFFWryKlKyTNOaq < 61) {
                onaVqLmEPvOucdpbHzGBm.substring(66, 2);
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            java.lang.Object arr_uTrqqEWhGcORb = new java.lang.Object();
            int i_WseYvSHkWyeTSDfcBoJ = arr_uTrqqEWhGcORb.hashCode();
            int j_DNCdzQ = new java.util.Random().nextInt(100);
            int tmp_ghqFEeRgi = (i_WseYvSHkWyeTSDfcBoJ ^ j_DNCdzQ) & 0x7FFFFFFF;
            if (tmp_ghqFEeRgi == 80 && i_WseYvSHkWyeTSDfcBoJ < 30) {
                arr_uTrqqEWhGcORb.toString();
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            java.lang.Object arr_uTrqqEWhGcORb = new java.lang.Object();
            int i_WseYvSHkWyeTSDfcBoJ = arr_uTrqqEWhGcORb.hashCode();
            int j_DNCdzQ = new java.util.Random().nextInt(100);
            int tmp_ghqFEeRgi = (i_WseYvSHkWyeTSDfcBoJ ^ j_DNCdzQ) & 0x7FFFFFFF;
            if (tmp_ghqFEeRgi == 80 && i_WseYvSHkWyeTSDfcBoJ < 30) {
                arr_uTrqqEWhGcORb.toString();
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            long arr_WcqROOfBlp = java.lang.System.nanoTime();
            int i_lfmVk = new java.util.Random().nextInt(1000);
            boolean j_QIilWKBx = (arr_WcqROOfBlp % (i_lfmVk + 71)) > 90;
            double tmp_AqhZEtECrKBVge = j_QIilWKBx ? java.lang.Math.sqrt(i_lfmVk) : java.lang.Math.pow(i_lfmVk, 48);
            if (tmp_AqhZEtECrKBVge < 0.0) {
                java.lang.System.out.println(tmp_AqhZEtECrKBVge);
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            java.lang.Object arr_uTrqqEWhGcORb = new java.lang.Object();
            int i_WseYvSHkWyeTSDfcBoJ = arr_uTrqqEWhGcORb.hashCode();
            int j_DNCdzQ = new java.util.Random().nextInt(100);
            int tmp_ghqFEeRgi = (i_WseYvSHkWyeTSDfcBoJ ^ j_DNCdzQ) & 0x7FFFFFFF;
            if (tmp_ghqFEeRgi == 80 && i_WseYvSHkWyeTSDfcBoJ < 30) {
                arr_uTrqqEWhGcORb.toString();
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            java.lang.Object arr_uTrqqEWhGcORb = new java.lang.Object();
            int i_WseYvSHkWyeTSDfcBoJ = arr_uTrqqEWhGcORb.hashCode();
            int j_DNCdzQ = new java.util.Random().nextInt(100);
            int tmp_ghqFEeRgi = (i_WseYvSHkWyeTSDfcBoJ ^ j_DNCdzQ) & 0x7FFFFFFF;
            if (tmp_ghqFEeRgi == 80 && i_WseYvSHkWyeTSDfcBoJ < 30) {
                arr_uTrqqEWhGcORb.toString();
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            int process_vklRRnf = new java.util.Random().nextInt(50);
            int stack_TaWdzhG = (process_vklRRnf > 39) ? 1 : ((process_vklRRnf > 23) ? 81 : ((process_vklRRnf > 2) ? 65 : 6));
            int i_TDKanvCzQOHfBwzH = stack_TaWdzhG * process_vklRRnf;
            if (i_TDKanvCzQOHfBwzH > 90) {
                java.lang.System.arraycopy(new int[] { i_TDKanvCzQOHfBwzH }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            java.lang.Object arr_uTrqqEWhGcORb = new java.lang.Object();
            int i_WseYvSHkWyeTSDfcBoJ = arr_uTrqqEWhGcORb.hashCode();
            int j_DNCdzQ = new java.util.Random().nextInt(100);
            int tmp_ghqFEeRgi = (i_WseYvSHkWyeTSDfcBoJ ^ j_DNCdzQ) & 0x7FFFFFFF;
            if (tmp_ghqFEeRgi == 80 && i_WseYvSHkWyeTSDfcBoJ < 30) {
                arr_uTrqqEWhGcORb.toString();
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            java.lang.Object arr_uTrqqEWhGcORb = new java.lang.Object();
            int i_WseYvSHkWyeTSDfcBoJ = arr_uTrqqEWhGcORb.hashCode();
            int j_DNCdzQ = new java.util.Random().nextInt(100);
            int tmp_ghqFEeRgi = (i_WseYvSHkWyeTSDfcBoJ ^ j_DNCdzQ) & 0x7FFFFFFF;
            if (tmp_ghqFEeRgi == 80 && i_WseYvSHkWyeTSDfcBoJ < 30) {
                arr_uTrqqEWhGcORb.toString();
            }
            sp.edit().clear().apply();
        }
    }
}
