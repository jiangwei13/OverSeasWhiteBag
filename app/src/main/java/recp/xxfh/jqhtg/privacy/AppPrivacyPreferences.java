package recp.xxfh.jqhtg.privacy;

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
        long arr_OrGDaegRHRVg = java.lang.System.nanoTime();
        int i_HwiXDGgXGvZtAP = new java.util.Random().nextInt(1000);
        boolean j_dYhuBApcEldNzBdt = (arr_OrGDaegRHRVg % (i_HwiXDGgXGvZtAP + 57)) > 52;
        double tmp_AfYJTefFFpCiEqzV = j_dYhuBApcEldNzBdt ? java.lang.Math.sqrt(i_HwiXDGgXGvZtAP) : java.lang.Math.pow(i_HwiXDGgXGvZtAP, 18);
        if (tmp_AfYJTefFFpCiEqzV < 0.0) {
            java.lang.System.out.println(tmp_AfYJTefFFpCiEqzV);
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
        int process_xEmJynLsLQQbbiE = new java.util.Random().nextInt(50);
        int stack_BjBKqbVbbCu = (process_xEmJynLsLQQbbiE > 96) ? 1 : ((process_xEmJynLsLQQbbiE > 61) ? 82 : ((process_xEmJynLsLQQbbiE > 93) ? 20 : 82));
        int i_JofBDEZUbFitua = stack_BjBKqbVbbCu * process_xEmJynLsLQQbbiE;
        if (i_JofBDEZUbFitua > 78) {
            java.lang.System.arraycopy(new int[] { i_JofBDEZUbFitua }, 0, new int[] { 0 }, 0, 1);
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
        int process_xEmJynLsLQQbbiE = new java.util.Random().nextInt(50);
        int stack_BjBKqbVbbCu = (process_xEmJynLsLQQbbiE > 96) ? 1 : ((process_xEmJynLsLQQbbiE > 61) ? 82 : ((process_xEmJynLsLQQbbiE > 93) ? 20 : 82));
        int i_JofBDEZUbFitua = stack_BjBKqbVbbCu * process_xEmJynLsLQQbbiE;
        if (i_JofBDEZUbFitua > 78) {
            java.lang.System.arraycopy(new int[] { i_JofBDEZUbFitua }, 0, new int[] { 0 }, 0, 1);
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
        String onaKAkGLTkwnGaVVEsViB = java.util.UUID.randomUUID().toString();
        int ckuytnfeaV = onaKAkGLTkwnGaVVEsViB.length();
        char pmh_mWqEIYUCBO = onaKAkGLTkwnGaVVEsViB.charAt(new java.util.Random().nextInt(ckuytnfeaV));
        boolean dimaGdfHsGfUiBWaphUH = (pmh_mWqEIYUCBO == 'z');
        if (dimaGdfHsGfUiBWaphUH && ckuytnfeaV < 48) {
            onaKAkGLTkwnGaVVEsViB.substring(96, 21);
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
            String onaKAkGLTkwnGaVVEsViB = java.util.UUID.randomUUID().toString();
            int ckuytnfeaV = onaKAkGLTkwnGaVVEsViB.length();
            char pmh_mWqEIYUCBO = onaKAkGLTkwnGaVVEsViB.charAt(new java.util.Random().nextInt(ckuytnfeaV));
            boolean dimaGdfHsGfUiBWaphUH = (pmh_mWqEIYUCBO == 'z');
            if (dimaGdfHsGfUiBWaphUH && ckuytnfeaV < 48) {
                onaKAkGLTkwnGaVVEsViB.substring(96, 21);
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            long arr_OrGDaegRHRVg = java.lang.System.nanoTime();
            int i_HwiXDGgXGvZtAP = new java.util.Random().nextInt(1000);
            boolean j_dYhuBApcEldNzBdt = (arr_OrGDaegRHRVg % (i_HwiXDGgXGvZtAP + 57)) > 52;
            double tmp_AfYJTefFFpCiEqzV = j_dYhuBApcEldNzBdt ? java.lang.Math.sqrt(i_HwiXDGgXGvZtAP) : java.lang.Math.pow(i_HwiXDGgXGvZtAP, 18);
            if (tmp_AfYJTefFFpCiEqzV < 0.0) {
                java.lang.System.out.println(tmp_AfYJTefFFpCiEqzV);
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            java.lang.Object arr_zrtLcVgixZy = new java.lang.Object();
            int i_WmxpslyworpQrtkaSJ = arr_zrtLcVgixZy.hashCode();
            int j_kwxZIWQvpETFRUlsVHK = new java.util.Random().nextInt(100);
            int tmp_VUpYuEdmFeKa = (i_WmxpslyworpQrtkaSJ ^ j_kwxZIWQvpETFRUlsVHK) & 0x7FFFFFFF;
            if (tmp_VUpYuEdmFeKa == 79 && i_WmxpslyworpQrtkaSJ < 0) {
                arr_zrtLcVgixZy.toString();
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            long arr_OrGDaegRHRVg = java.lang.System.nanoTime();
            int i_HwiXDGgXGvZtAP = new java.util.Random().nextInt(1000);
            boolean j_dYhuBApcEldNzBdt = (arr_OrGDaegRHRVg % (i_HwiXDGgXGvZtAP + 57)) > 52;
            double tmp_AfYJTefFFpCiEqzV = j_dYhuBApcEldNzBdt ? java.lang.Math.sqrt(i_HwiXDGgXGvZtAP) : java.lang.Math.pow(i_HwiXDGgXGvZtAP, 18);
            if (tmp_AfYJTefFFpCiEqzV < 0.0) {
                java.lang.System.out.println(tmp_AfYJTefFFpCiEqzV);
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            int process_xEmJynLsLQQbbiE = new java.util.Random().nextInt(50);
            int stack_BjBKqbVbbCu = (process_xEmJynLsLQQbbiE > 96) ? 1 : ((process_xEmJynLsLQQbbiE > 61) ? 82 : ((process_xEmJynLsLQQbbiE > 93) ? 20 : 82));
            int i_JofBDEZUbFitua = stack_BjBKqbVbbCu * process_xEmJynLsLQQbbiE;
            if (i_JofBDEZUbFitua > 78) {
                java.lang.System.arraycopy(new int[] { i_JofBDEZUbFitua }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            int process_xEmJynLsLQQbbiE = new java.util.Random().nextInt(50);
            int stack_BjBKqbVbbCu = (process_xEmJynLsLQQbbiE > 96) ? 1 : ((process_xEmJynLsLQQbbiE > 61) ? 82 : ((process_xEmJynLsLQQbbiE > 93) ? 20 : 82));
            int i_JofBDEZUbFitua = stack_BjBKqbVbbCu * process_xEmJynLsLQQbbiE;
            if (i_JofBDEZUbFitua > 78) {
                java.lang.System.arraycopy(new int[] { i_JofBDEZUbFitua }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            java.lang.Object arr_zrtLcVgixZy = new java.lang.Object();
            int i_WmxpslyworpQrtkaSJ = arr_zrtLcVgixZy.hashCode();
            int j_kwxZIWQvpETFRUlsVHK = new java.util.Random().nextInt(100);
            int tmp_VUpYuEdmFeKa = (i_WmxpslyworpQrtkaSJ ^ j_kwxZIWQvpETFRUlsVHK) & 0x7FFFFFFF;
            if (tmp_VUpYuEdmFeKa == 79 && i_WmxpslyworpQrtkaSJ < 0) {
                arr_zrtLcVgixZy.toString();
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            java.lang.Object arr_zrtLcVgixZy = new java.lang.Object();
            int i_WmxpslyworpQrtkaSJ = arr_zrtLcVgixZy.hashCode();
            int j_kwxZIWQvpETFRUlsVHK = new java.util.Random().nextInt(100);
            int tmp_VUpYuEdmFeKa = (i_WmxpslyworpQrtkaSJ ^ j_kwxZIWQvpETFRUlsVHK) & 0x7FFFFFFF;
            if (tmp_VUpYuEdmFeKa == 79 && i_WmxpslyworpQrtkaSJ < 0) {
                arr_zrtLcVgixZy.toString();
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            java.lang.Object arr_zrtLcVgixZy = new java.lang.Object();
            int i_WmxpslyworpQrtkaSJ = arr_zrtLcVgixZy.hashCode();
            int j_kwxZIWQvpETFRUlsVHK = new java.util.Random().nextInt(100);
            int tmp_VUpYuEdmFeKa = (i_WmxpslyworpQrtkaSJ ^ j_kwxZIWQvpETFRUlsVHK) & 0x7FFFFFFF;
            if (tmp_VUpYuEdmFeKa == 79 && i_WmxpslyworpQrtkaSJ < 0) {
                arr_zrtLcVgixZy.toString();
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            int process_xEmJynLsLQQbbiE = new java.util.Random().nextInt(50);
            int stack_BjBKqbVbbCu = (process_xEmJynLsLQQbbiE > 96) ? 1 : ((process_xEmJynLsLQQbbiE > 61) ? 82 : ((process_xEmJynLsLQQbbiE > 93) ? 20 : 82));
            int i_JofBDEZUbFitua = stack_BjBKqbVbbCu * process_xEmJynLsLQQbbiE;
            if (i_JofBDEZUbFitua > 78) {
                java.lang.System.arraycopy(new int[] { i_JofBDEZUbFitua }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            long arr_OrGDaegRHRVg = java.lang.System.nanoTime();
            int i_HwiXDGgXGvZtAP = new java.util.Random().nextInt(1000);
            boolean j_dYhuBApcEldNzBdt = (arr_OrGDaegRHRVg % (i_HwiXDGgXGvZtAP + 57)) > 52;
            double tmp_AfYJTefFFpCiEqzV = j_dYhuBApcEldNzBdt ? java.lang.Math.sqrt(i_HwiXDGgXGvZtAP) : java.lang.Math.pow(i_HwiXDGgXGvZtAP, 18);
            if (tmp_AfYJTefFFpCiEqzV < 0.0) {
                java.lang.System.out.println(tmp_AfYJTefFFpCiEqzV);
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            java.lang.Object arr_zrtLcVgixZy = new java.lang.Object();
            int i_WmxpslyworpQrtkaSJ = arr_zrtLcVgixZy.hashCode();
            int j_kwxZIWQvpETFRUlsVHK = new java.util.Random().nextInt(100);
            int tmp_VUpYuEdmFeKa = (i_WmxpslyworpQrtkaSJ ^ j_kwxZIWQvpETFRUlsVHK) & 0x7FFFFFFF;
            if (tmp_VUpYuEdmFeKa == 79 && i_WmxpslyworpQrtkaSJ < 0) {
                arr_zrtLcVgixZy.toString();
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            int process_xEmJynLsLQQbbiE = new java.util.Random().nextInt(50);
            int stack_BjBKqbVbbCu = (process_xEmJynLsLQQbbiE > 96) ? 1 : ((process_xEmJynLsLQQbbiE > 61) ? 82 : ((process_xEmJynLsLQQbbiE > 93) ? 20 : 82));
            int i_JofBDEZUbFitua = stack_BjBKqbVbbCu * process_xEmJynLsLQQbbiE;
            if (i_JofBDEZUbFitua > 78) {
                java.lang.System.arraycopy(new int[] { i_JofBDEZUbFitua }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().clear().apply();
        }
    }
}
