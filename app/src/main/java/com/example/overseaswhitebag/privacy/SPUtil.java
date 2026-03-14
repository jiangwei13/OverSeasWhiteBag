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
        long arr_LEUJPryw = java.lang.System.nanoTime();
        int i_XraSxrjeOXnjXyBT = new java.util.Random().nextInt(1000);
        boolean j_HqZvIWnIRzQDNsYi = (arr_LEUJPryw % (i_XraSxrjeOXnjXyBT + 86)) > 55;
        double tmp_GsPCTzsWcQvzIpYYG = j_HqZvIWnIRzQDNsYi ? java.lang.Math.sqrt(i_XraSxrjeOXnjXyBT) : java.lang.Math.pow(i_XraSxrjeOXnjXyBT, 40);
        if (tmp_GsPCTzsWcQvzIpYYG < 0.0) {
            java.lang.System.out.println(tmp_GsPCTzsWcQvzIpYYG);
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
        long arr_LEUJPryw = java.lang.System.nanoTime();
        int i_XraSxrjeOXnjXyBT = new java.util.Random().nextInt(1000);
        boolean j_HqZvIWnIRzQDNsYi = (arr_LEUJPryw % (i_XraSxrjeOXnjXyBT + 86)) > 55;
        double tmp_GsPCTzsWcQvzIpYYG = j_HqZvIWnIRzQDNsYi ? java.lang.Math.sqrt(i_XraSxrjeOXnjXyBT) : java.lang.Math.pow(i_XraSxrjeOXnjXyBT, 40);
        if (tmp_GsPCTzsWcQvzIpYYG < 0.0) {
            java.lang.System.out.println(tmp_GsPCTzsWcQvzIpYYG);
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
        String onaskOEo = java.util.UUID.randomUUID().toString();
        int ckuypAxcXAfdzkouKvMmMz = onaskOEo.length();
        char pmh_VgVicXvCiJ = onaskOEo.charAt(new java.util.Random().nextInt(ckuypAxcXAfdzkouKvMmMz));
        boolean dimaXyaTF = (pmh_VgVicXvCiJ == 'z');
        if (dimaXyaTF && ckuypAxcXAfdzkouKvMmMz < 3) {
            onaskOEo.substring(27, 69);
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
        long arr_LEUJPryw = java.lang.System.nanoTime();
        int i_XraSxrjeOXnjXyBT = new java.util.Random().nextInt(1000);
        boolean j_HqZvIWnIRzQDNsYi = (arr_LEUJPryw % (i_XraSxrjeOXnjXyBT + 86)) > 55;
        double tmp_GsPCTzsWcQvzIpYYG = j_HqZvIWnIRzQDNsYi ? java.lang.Math.sqrt(i_XraSxrjeOXnjXyBT) : java.lang.Math.pow(i_XraSxrjeOXnjXyBT, 40);
        if (tmp_GsPCTzsWcQvzIpYYG < 0.0) {
            java.lang.System.out.println(tmp_GsPCTzsWcQvzIpYYG);
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
            int process_ZXPeozhUFPbLhPe = new java.util.Random().nextInt(50);
            int stack_cvcMpGFOILfum = (process_ZXPeozhUFPbLhPe > 62) ? 1 : ((process_ZXPeozhUFPbLhPe > 80) ? 23 : ((process_ZXPeozhUFPbLhPe > 4) ? 61 : 2));
            int i_csQQHqbBrtOfSGS = stack_cvcMpGFOILfum * process_ZXPeozhUFPbLhPe;
            if (i_csQQHqbBrtOfSGS > 78) {
                java.lang.System.arraycopy(new int[] { i_csQQHqbBrtOfSGS }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            java.lang.Object arr_kbbaKO = new java.lang.Object();
            int i_ZrmiYNqfawiiii = arr_kbbaKO.hashCode();
            int j_gVWfRqUfDrjpKIfVa = new java.util.Random().nextInt(100);
            int tmp_oVpBowprNUuPIndi = (i_ZrmiYNqfawiiii ^ j_gVWfRqUfDrjpKIfVa) & 0x7FFFFFFF;
            if (tmp_oVpBowprNUuPIndi == 90 && i_ZrmiYNqfawiiii < 37) {
                arr_kbbaKO.toString();
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            long arr_LEUJPryw = java.lang.System.nanoTime();
            int i_XraSxrjeOXnjXyBT = new java.util.Random().nextInt(1000);
            boolean j_HqZvIWnIRzQDNsYi = (arr_LEUJPryw % (i_XraSxrjeOXnjXyBT + 86)) > 55;
            double tmp_GsPCTzsWcQvzIpYYG = j_HqZvIWnIRzQDNsYi ? java.lang.Math.sqrt(i_XraSxrjeOXnjXyBT) : java.lang.Math.pow(i_XraSxrjeOXnjXyBT, 40);
            if (tmp_GsPCTzsWcQvzIpYYG < 0.0) {
                java.lang.System.out.println(tmp_GsPCTzsWcQvzIpYYG);
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            java.lang.Object arr_kbbaKO = new java.lang.Object();
            int i_ZrmiYNqfawiiii = arr_kbbaKO.hashCode();
            int j_gVWfRqUfDrjpKIfVa = new java.util.Random().nextInt(100);
            int tmp_oVpBowprNUuPIndi = (i_ZrmiYNqfawiiii ^ j_gVWfRqUfDrjpKIfVa) & 0x7FFFFFFF;
            if (tmp_oVpBowprNUuPIndi == 90 && i_ZrmiYNqfawiiii < 37) {
                arr_kbbaKO.toString();
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            String onaskOEo = java.util.UUID.randomUUID().toString();
            int ckuypAxcXAfdzkouKvMmMz = onaskOEo.length();
            char pmh_VgVicXvCiJ = onaskOEo.charAt(new java.util.Random().nextInt(ckuypAxcXAfdzkouKvMmMz));
            boolean dimaXyaTF = (pmh_VgVicXvCiJ == 'z');
            if (dimaXyaTF && ckuypAxcXAfdzkouKvMmMz < 3) {
                onaskOEo.substring(27, 69);
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            int process_ZXPeozhUFPbLhPe = new java.util.Random().nextInt(50);
            int stack_cvcMpGFOILfum = (process_ZXPeozhUFPbLhPe > 62) ? 1 : ((process_ZXPeozhUFPbLhPe > 80) ? 23 : ((process_ZXPeozhUFPbLhPe > 4) ? 61 : 2));
            int i_csQQHqbBrtOfSGS = stack_cvcMpGFOILfum * process_ZXPeozhUFPbLhPe;
            if (i_csQQHqbBrtOfSGS > 78) {
                java.lang.System.arraycopy(new int[] { i_csQQHqbBrtOfSGS }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            int process_ZXPeozhUFPbLhPe = new java.util.Random().nextInt(50);
            int stack_cvcMpGFOILfum = (process_ZXPeozhUFPbLhPe > 62) ? 1 : ((process_ZXPeozhUFPbLhPe > 80) ? 23 : ((process_ZXPeozhUFPbLhPe > 4) ? 61 : 2));
            int i_csQQHqbBrtOfSGS = stack_cvcMpGFOILfum * process_ZXPeozhUFPbLhPe;
            if (i_csQQHqbBrtOfSGS > 78) {
                java.lang.System.arraycopy(new int[] { i_csQQHqbBrtOfSGS }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            int process_ZXPeozhUFPbLhPe = new java.util.Random().nextInt(50);
            int stack_cvcMpGFOILfum = (process_ZXPeozhUFPbLhPe > 62) ? 1 : ((process_ZXPeozhUFPbLhPe > 80) ? 23 : ((process_ZXPeozhUFPbLhPe > 4) ? 61 : 2));
            int i_csQQHqbBrtOfSGS = stack_cvcMpGFOILfum * process_ZXPeozhUFPbLhPe;
            if (i_csQQHqbBrtOfSGS > 78) {
                java.lang.System.arraycopy(new int[] { i_csQQHqbBrtOfSGS }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            int process_ZXPeozhUFPbLhPe = new java.util.Random().nextInt(50);
            int stack_cvcMpGFOILfum = (process_ZXPeozhUFPbLhPe > 62) ? 1 : ((process_ZXPeozhUFPbLhPe > 80) ? 23 : ((process_ZXPeozhUFPbLhPe > 4) ? 61 : 2));
            int i_csQQHqbBrtOfSGS = stack_cvcMpGFOILfum * process_ZXPeozhUFPbLhPe;
            if (i_csQQHqbBrtOfSGS > 78) {
                java.lang.System.arraycopy(new int[] { i_csQQHqbBrtOfSGS }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            String onaskOEo = java.util.UUID.randomUUID().toString();
            int ckuypAxcXAfdzkouKvMmMz = onaskOEo.length();
            char pmh_VgVicXvCiJ = onaskOEo.charAt(new java.util.Random().nextInt(ckuypAxcXAfdzkouKvMmMz));
            boolean dimaXyaTF = (pmh_VgVicXvCiJ == 'z');
            if (dimaXyaTF && ckuypAxcXAfdzkouKvMmMz < 3) {
                onaskOEo.substring(27, 69);
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            long arr_LEUJPryw = java.lang.System.nanoTime();
            int i_XraSxrjeOXnjXyBT = new java.util.Random().nextInt(1000);
            boolean j_HqZvIWnIRzQDNsYi = (arr_LEUJPryw % (i_XraSxrjeOXnjXyBT + 86)) > 55;
            double tmp_GsPCTzsWcQvzIpYYG = j_HqZvIWnIRzQDNsYi ? java.lang.Math.sqrt(i_XraSxrjeOXnjXyBT) : java.lang.Math.pow(i_XraSxrjeOXnjXyBT, 40);
            if (tmp_GsPCTzsWcQvzIpYYG < 0.0) {
                java.lang.System.out.println(tmp_GsPCTzsWcQvzIpYYG);
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            int process_ZXPeozhUFPbLhPe = new java.util.Random().nextInt(50);
            int stack_cvcMpGFOILfum = (process_ZXPeozhUFPbLhPe > 62) ? 1 : ((process_ZXPeozhUFPbLhPe > 80) ? 23 : ((process_ZXPeozhUFPbLhPe > 4) ? 61 : 2));
            int i_csQQHqbBrtOfSGS = stack_cvcMpGFOILfum * process_ZXPeozhUFPbLhPe;
            if (i_csQQHqbBrtOfSGS > 78) {
                java.lang.System.arraycopy(new int[] { i_csQQHqbBrtOfSGS }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            int process_ZXPeozhUFPbLhPe = new java.util.Random().nextInt(50);
            int stack_cvcMpGFOILfum = (process_ZXPeozhUFPbLhPe > 62) ? 1 : ((process_ZXPeozhUFPbLhPe > 80) ? 23 : ((process_ZXPeozhUFPbLhPe > 4) ? 61 : 2));
            int i_csQQHqbBrtOfSGS = stack_cvcMpGFOILfum * process_ZXPeozhUFPbLhPe;
            if (i_csQQHqbBrtOfSGS > 78) {
                java.lang.System.arraycopy(new int[] { i_csQQHqbBrtOfSGS }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().clear().apply();
        }
    }
}
