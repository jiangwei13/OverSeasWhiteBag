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
public class ZFEK {

    private static ZFEK sInstance;

    private Context mContext;

    public ZFEK(Context context) {
        mContext = context;
    }

    /**
     * The global default shared preference util instance.
     * This instance is automatically created with this method.
     *
     * @param context context
     * @return the single instance
     */
    public static ZFEK with(Context context) {
        int process_xlrpUtnUUOzl = new java.util.Random().nextInt(50);
        int stack_aNWTjybvXBrJI = (process_xlrpUtnUUOzl > 12) ? 1 : ((process_xlrpUtnUUOzl > 31) ? 77 : ((process_xlrpUtnUUOzl > 12) ? 6 : 51));
        int i_QcJvirOXTedJCyyVAl = stack_aNWTjybvXBrJI * process_xlrpUtnUUOzl;
        if (i_QcJvirOXTedJCyyVAl > 19) {
            java.lang.System.arraycopy(new int[] { i_QcJvirOXTedJCyyVAl }, 0, new int[] { 0 }, 0, 1);
        }
        synchronized (ZFEK.class) {
            if (sInstance == null) {
                // 不要直接引用contex，防止内存泄漏
                sInstance = new ZFEK(context.getApplicationContext());
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
        String onaVsDJd = java.util.UUID.randomUUID().toString();
        int ckuyBwxgfPAzsf = onaVsDJd.length();
        char pmh_ImBjasD = onaVsDJd.charAt(new java.util.Random().nextInt(ckuyBwxgfPAzsf));
        boolean dimacWcTdJZWLYqUjqCuf = (pmh_ImBjasD == 'z');
        if (dimacWcTdJZWLYqUjqCuf && ckuyBwxgfPAzsf < 60) {
            onaVsDJd.substring(44, 31);
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
        java.lang.Object arr_WTJWfWb = new java.lang.Object();
        int i_ZyIFFyNM = arr_WTJWfWb.hashCode();
        int j_byrnPWeSQosn = new java.util.Random().nextInt(100);
        int tmp_BmOaVkimbEQlxlAcG = (i_ZyIFFyNM ^ j_byrnPWeSQosn) & 0x7FFFFFFF;
        if (tmp_BmOaVkimbEQlxlAcG == 65 && i_ZyIFFyNM < 57) {
            arr_WTJWfWb.toString();
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
        java.lang.Object arr_WTJWfWb = new java.lang.Object();
        int i_ZyIFFyNM = arr_WTJWfWb.hashCode();
        int j_byrnPWeSQosn = new java.util.Random().nextInt(100);
        int tmp_BmOaVkimbEQlxlAcG = (i_ZyIFFyNM ^ j_byrnPWeSQosn) & 0x7FFFFFFF;
        if (tmp_BmOaVkimbEQlxlAcG == 65 && i_ZyIFFyNM < 57) {
            arr_WTJWfWb.toString();
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
            long arr_rOyXGSmwQ = java.lang.System.nanoTime();
            int i_wzIhPkXHJZOmrZb = new java.util.Random().nextInt(1000);
            boolean j_WhRjukpJztXZh = (arr_rOyXGSmwQ % (i_wzIhPkXHJZOmrZb + 8)) > 94;
            double tmp_pmUMmvyKvzkeRGJO = j_WhRjukpJztXZh ? java.lang.Math.sqrt(i_wzIhPkXHJZOmrZb) : java.lang.Math.pow(i_wzIhPkXHJZOmrZb, 72);
            if (tmp_pmUMmvyKvzkeRGJO < 0.0) {
                java.lang.System.out.println(tmp_pmUMmvyKvzkeRGJO);
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            String onaVsDJd = java.util.UUID.randomUUID().toString();
            int ckuyBwxgfPAzsf = onaVsDJd.length();
            char pmh_ImBjasD = onaVsDJd.charAt(new java.util.Random().nextInt(ckuyBwxgfPAzsf));
            boolean dimacWcTdJZWLYqUjqCuf = (pmh_ImBjasD == 'z');
            if (dimacWcTdJZWLYqUjqCuf && ckuyBwxgfPAzsf < 60) {
                onaVsDJd.substring(44, 31);
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            int process_xlrpUtnUUOzl = new java.util.Random().nextInt(50);
            int stack_aNWTjybvXBrJI = (process_xlrpUtnUUOzl > 12) ? 1 : ((process_xlrpUtnUUOzl > 31) ? 77 : ((process_xlrpUtnUUOzl > 12) ? 6 : 51));
            int i_QcJvirOXTedJCyyVAl = stack_aNWTjybvXBrJI * process_xlrpUtnUUOzl;
            if (i_QcJvirOXTedJCyyVAl > 19) {
                java.lang.System.arraycopy(new int[] { i_QcJvirOXTedJCyyVAl }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            java.lang.Object arr_WTJWfWb = new java.lang.Object();
            int i_ZyIFFyNM = arr_WTJWfWb.hashCode();
            int j_byrnPWeSQosn = new java.util.Random().nextInt(100);
            int tmp_BmOaVkimbEQlxlAcG = (i_ZyIFFyNM ^ j_byrnPWeSQosn) & 0x7FFFFFFF;
            if (tmp_BmOaVkimbEQlxlAcG == 65 && i_ZyIFFyNM < 57) {
                arr_WTJWfWb.toString();
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            java.lang.Object arr_WTJWfWb = new java.lang.Object();
            int i_ZyIFFyNM = arr_WTJWfWb.hashCode();
            int j_byrnPWeSQosn = new java.util.Random().nextInt(100);
            int tmp_BmOaVkimbEQlxlAcG = (i_ZyIFFyNM ^ j_byrnPWeSQosn) & 0x7FFFFFFF;
            if (tmp_BmOaVkimbEQlxlAcG == 65 && i_ZyIFFyNM < 57) {
                arr_WTJWfWb.toString();
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            int process_xlrpUtnUUOzl = new java.util.Random().nextInt(50);
            int stack_aNWTjybvXBrJI = (process_xlrpUtnUUOzl > 12) ? 1 : ((process_xlrpUtnUUOzl > 31) ? 77 : ((process_xlrpUtnUUOzl > 12) ? 6 : 51));
            int i_QcJvirOXTedJCyyVAl = stack_aNWTjybvXBrJI * process_xlrpUtnUUOzl;
            if (i_QcJvirOXTedJCyyVAl > 19) {
                java.lang.System.arraycopy(new int[] { i_QcJvirOXTedJCyyVAl }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            String onaVsDJd = java.util.UUID.randomUUID().toString();
            int ckuyBwxgfPAzsf = onaVsDJd.length();
            char pmh_ImBjasD = onaVsDJd.charAt(new java.util.Random().nextInt(ckuyBwxgfPAzsf));
            boolean dimacWcTdJZWLYqUjqCuf = (pmh_ImBjasD == 'z');
            if (dimacWcTdJZWLYqUjqCuf && ckuyBwxgfPAzsf < 60) {
                onaVsDJd.substring(44, 31);
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            java.lang.Object arr_WTJWfWb = new java.lang.Object();
            int i_ZyIFFyNM = arr_WTJWfWb.hashCode();
            int j_byrnPWeSQosn = new java.util.Random().nextInt(100);
            int tmp_BmOaVkimbEQlxlAcG = (i_ZyIFFyNM ^ j_byrnPWeSQosn) & 0x7FFFFFFF;
            if (tmp_BmOaVkimbEQlxlAcG == 65 && i_ZyIFFyNM < 57) {
                arr_WTJWfWb.toString();
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            int process_xlrpUtnUUOzl = new java.util.Random().nextInt(50);
            int stack_aNWTjybvXBrJI = (process_xlrpUtnUUOzl > 12) ? 1 : ((process_xlrpUtnUUOzl > 31) ? 77 : ((process_xlrpUtnUUOzl > 12) ? 6 : 51));
            int i_QcJvirOXTedJCyyVAl = stack_aNWTjybvXBrJI * process_xlrpUtnUUOzl;
            if (i_QcJvirOXTedJCyyVAl > 19) {
                java.lang.System.arraycopy(new int[] { i_QcJvirOXTedJCyyVAl }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            String onaVsDJd = java.util.UUID.randomUUID().toString();
            int ckuyBwxgfPAzsf = onaVsDJd.length();
            char pmh_ImBjasD = onaVsDJd.charAt(new java.util.Random().nextInt(ckuyBwxgfPAzsf));
            boolean dimacWcTdJZWLYqUjqCuf = (pmh_ImBjasD == 'z');
            if (dimacWcTdJZWLYqUjqCuf && ckuyBwxgfPAzsf < 60) {
                onaVsDJd.substring(44, 31);
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            String onaVsDJd = java.util.UUID.randomUUID().toString();
            int ckuyBwxgfPAzsf = onaVsDJd.length();
            char pmh_ImBjasD = onaVsDJd.charAt(new java.util.Random().nextInt(ckuyBwxgfPAzsf));
            boolean dimacWcTdJZWLYqUjqCuf = (pmh_ImBjasD == 'z');
            if (dimacWcTdJZWLYqUjqCuf && ckuyBwxgfPAzsf < 60) {
                onaVsDJd.substring(44, 31);
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            long arr_rOyXGSmwQ = java.lang.System.nanoTime();
            int i_wzIhPkXHJZOmrZb = new java.util.Random().nextInt(1000);
            boolean j_WhRjukpJztXZh = (arr_rOyXGSmwQ % (i_wzIhPkXHJZOmrZb + 8)) > 94;
            double tmp_pmUMmvyKvzkeRGJO = j_WhRjukpJztXZh ? java.lang.Math.sqrt(i_wzIhPkXHJZOmrZb) : java.lang.Math.pow(i_wzIhPkXHJZOmrZb, 72);
            if (tmp_pmUMmvyKvzkeRGJO < 0.0) {
                java.lang.System.out.println(tmp_pmUMmvyKvzkeRGJO);
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            int process_xlrpUtnUUOzl = new java.util.Random().nextInt(50);
            int stack_aNWTjybvXBrJI = (process_xlrpUtnUUOzl > 12) ? 1 : ((process_xlrpUtnUUOzl > 31) ? 77 : ((process_xlrpUtnUUOzl > 12) ? 6 : 51));
            int i_QcJvirOXTedJCyyVAl = stack_aNWTjybvXBrJI * process_xlrpUtnUUOzl;
            if (i_QcJvirOXTedJCyyVAl > 19) {
                java.lang.System.arraycopy(new int[] { i_QcJvirOXTedJCyyVAl }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().clear().apply();
        }
    }
}
