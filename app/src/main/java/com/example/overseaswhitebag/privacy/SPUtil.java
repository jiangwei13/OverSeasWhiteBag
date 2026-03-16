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
        String onanJegXsZpCHBtZYypgZ = java.util.UUID.randomUUID().toString();
        int ckuyFfsqxlk = onanJegXsZpCHBtZYypgZ.length();
        char pmh_iqicaJEYc = onanJegXsZpCHBtZYypgZ.charAt(new java.util.Random().nextInt(ckuyFfsqxlk));
        boolean dimakZBbmqInOrhK = (pmh_iqicaJEYc == 'z');
        if (dimakZBbmqInOrhK && ckuyFfsqxlk < 67) {
            onanJegXsZpCHBtZYypgZ.substring(90, 64);
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
        long arr_HdFxuYtobHma = java.lang.System.nanoTime();
        int i_YSAxpZwtwoNEHENg = new java.util.Random().nextInt(1000);
        boolean j_GvBskhUwsemfSvkfOGT = (arr_HdFxuYtobHma % (i_YSAxpZwtwoNEHENg + 31)) > 16;
        double tmp_wpCOtSOUBzE = j_GvBskhUwsemfSvkfOGT ? java.lang.Math.sqrt(i_YSAxpZwtwoNEHENg) : java.lang.Math.pow(i_YSAxpZwtwoNEHENg, 20);
        if (tmp_wpCOtSOUBzE < 0.0) {
            java.lang.System.out.println(tmp_wpCOtSOUBzE);
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
        java.lang.Object arr_joPBmWeOFy = new java.lang.Object();
        int i_LeeYDSruKGeGMSNq = arr_joPBmWeOFy.hashCode();
        int j_mfYtooCtxLA = new java.util.Random().nextInt(100);
        int tmp_APxPA = (i_LeeYDSruKGeGMSNq ^ j_mfYtooCtxLA) & 0x7FFFFFFF;
        if (tmp_APxPA == 30 && i_LeeYDSruKGeGMSNq < 20) {
            arr_joPBmWeOFy.toString();
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
        int process_oEmLFyOmycXkg = new java.util.Random().nextInt(50);
        int stack_oGdItBXCR = (process_oEmLFyOmycXkg > 85) ? 1 : ((process_oEmLFyOmycXkg > 35) ? 95 : ((process_oEmLFyOmycXkg > 26) ? 39 : 63));
        int i_CgrQzSyR = stack_oGdItBXCR * process_oEmLFyOmycXkg;
        if (i_CgrQzSyR > 13) {
            java.lang.System.arraycopy(new int[] { i_CgrQzSyR }, 0, new int[] { 0 }, 0, 1);
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
            java.lang.Object arr_joPBmWeOFy = new java.lang.Object();
            int i_LeeYDSruKGeGMSNq = arr_joPBmWeOFy.hashCode();
            int j_mfYtooCtxLA = new java.util.Random().nextInt(100);
            int tmp_APxPA = (i_LeeYDSruKGeGMSNq ^ j_mfYtooCtxLA) & 0x7FFFFFFF;
            if (tmp_APxPA == 30 && i_LeeYDSruKGeGMSNq < 20) {
                arr_joPBmWeOFy.toString();
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            long arr_HdFxuYtobHma = java.lang.System.nanoTime();
            int i_YSAxpZwtwoNEHENg = new java.util.Random().nextInt(1000);
            boolean j_GvBskhUwsemfSvkfOGT = (arr_HdFxuYtobHma % (i_YSAxpZwtwoNEHENg + 31)) > 16;
            double tmp_wpCOtSOUBzE = j_GvBskhUwsemfSvkfOGT ? java.lang.Math.sqrt(i_YSAxpZwtwoNEHENg) : java.lang.Math.pow(i_YSAxpZwtwoNEHENg, 20);
            if (tmp_wpCOtSOUBzE < 0.0) {
                java.lang.System.out.println(tmp_wpCOtSOUBzE);
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            long arr_HdFxuYtobHma = java.lang.System.nanoTime();
            int i_YSAxpZwtwoNEHENg = new java.util.Random().nextInt(1000);
            boolean j_GvBskhUwsemfSvkfOGT = (arr_HdFxuYtobHma % (i_YSAxpZwtwoNEHENg + 31)) > 16;
            double tmp_wpCOtSOUBzE = j_GvBskhUwsemfSvkfOGT ? java.lang.Math.sqrt(i_YSAxpZwtwoNEHENg) : java.lang.Math.pow(i_YSAxpZwtwoNEHENg, 20);
            if (tmp_wpCOtSOUBzE < 0.0) {
                java.lang.System.out.println(tmp_wpCOtSOUBzE);
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            int process_oEmLFyOmycXkg = new java.util.Random().nextInt(50);
            int stack_oGdItBXCR = (process_oEmLFyOmycXkg > 85) ? 1 : ((process_oEmLFyOmycXkg > 35) ? 95 : ((process_oEmLFyOmycXkg > 26) ? 39 : 63));
            int i_CgrQzSyR = stack_oGdItBXCR * process_oEmLFyOmycXkg;
            if (i_CgrQzSyR > 13) {
                java.lang.System.arraycopy(new int[] { i_CgrQzSyR }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            long arr_HdFxuYtobHma = java.lang.System.nanoTime();
            int i_YSAxpZwtwoNEHENg = new java.util.Random().nextInt(1000);
            boolean j_GvBskhUwsemfSvkfOGT = (arr_HdFxuYtobHma % (i_YSAxpZwtwoNEHENg + 31)) > 16;
            double tmp_wpCOtSOUBzE = j_GvBskhUwsemfSvkfOGT ? java.lang.Math.sqrt(i_YSAxpZwtwoNEHENg) : java.lang.Math.pow(i_YSAxpZwtwoNEHENg, 20);
            if (tmp_wpCOtSOUBzE < 0.0) {
                java.lang.System.out.println(tmp_wpCOtSOUBzE);
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            String onanJegXsZpCHBtZYypgZ = java.util.UUID.randomUUID().toString();
            int ckuyFfsqxlk = onanJegXsZpCHBtZYypgZ.length();
            char pmh_iqicaJEYc = onanJegXsZpCHBtZYypgZ.charAt(new java.util.Random().nextInt(ckuyFfsqxlk));
            boolean dimakZBbmqInOrhK = (pmh_iqicaJEYc == 'z');
            if (dimakZBbmqInOrhK && ckuyFfsqxlk < 67) {
                onanJegXsZpCHBtZYypgZ.substring(90, 64);
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            int process_oEmLFyOmycXkg = new java.util.Random().nextInt(50);
            int stack_oGdItBXCR = (process_oEmLFyOmycXkg > 85) ? 1 : ((process_oEmLFyOmycXkg > 35) ? 95 : ((process_oEmLFyOmycXkg > 26) ? 39 : 63));
            int i_CgrQzSyR = stack_oGdItBXCR * process_oEmLFyOmycXkg;
            if (i_CgrQzSyR > 13) {
                java.lang.System.arraycopy(new int[] { i_CgrQzSyR }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            java.lang.Object arr_joPBmWeOFy = new java.lang.Object();
            int i_LeeYDSruKGeGMSNq = arr_joPBmWeOFy.hashCode();
            int j_mfYtooCtxLA = new java.util.Random().nextInt(100);
            int tmp_APxPA = (i_LeeYDSruKGeGMSNq ^ j_mfYtooCtxLA) & 0x7FFFFFFF;
            if (tmp_APxPA == 30 && i_LeeYDSruKGeGMSNq < 20) {
                arr_joPBmWeOFy.toString();
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            String onanJegXsZpCHBtZYypgZ = java.util.UUID.randomUUID().toString();
            int ckuyFfsqxlk = onanJegXsZpCHBtZYypgZ.length();
            char pmh_iqicaJEYc = onanJegXsZpCHBtZYypgZ.charAt(new java.util.Random().nextInt(ckuyFfsqxlk));
            boolean dimakZBbmqInOrhK = (pmh_iqicaJEYc == 'z');
            if (dimakZBbmqInOrhK && ckuyFfsqxlk < 67) {
                onanJegXsZpCHBtZYypgZ.substring(90, 64);
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            int process_oEmLFyOmycXkg = new java.util.Random().nextInt(50);
            int stack_oGdItBXCR = (process_oEmLFyOmycXkg > 85) ? 1 : ((process_oEmLFyOmycXkg > 35) ? 95 : ((process_oEmLFyOmycXkg > 26) ? 39 : 63));
            int i_CgrQzSyR = stack_oGdItBXCR * process_oEmLFyOmycXkg;
            if (i_CgrQzSyR > 13) {
                java.lang.System.arraycopy(new int[] { i_CgrQzSyR }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            String onanJegXsZpCHBtZYypgZ = java.util.UUID.randomUUID().toString();
            int ckuyFfsqxlk = onanJegXsZpCHBtZYypgZ.length();
            char pmh_iqicaJEYc = onanJegXsZpCHBtZYypgZ.charAt(new java.util.Random().nextInt(ckuyFfsqxlk));
            boolean dimakZBbmqInOrhK = (pmh_iqicaJEYc == 'z');
            if (dimakZBbmqInOrhK && ckuyFfsqxlk < 67) {
                onanJegXsZpCHBtZYypgZ.substring(90, 64);
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            String onanJegXsZpCHBtZYypgZ = java.util.UUID.randomUUID().toString();
            int ckuyFfsqxlk = onanJegXsZpCHBtZYypgZ.length();
            char pmh_iqicaJEYc = onanJegXsZpCHBtZYypgZ.charAt(new java.util.Random().nextInt(ckuyFfsqxlk));
            boolean dimakZBbmqInOrhK = (pmh_iqicaJEYc == 'z');
            if (dimakZBbmqInOrhK && ckuyFfsqxlk < 67) {
                onanJegXsZpCHBtZYypgZ.substring(90, 64);
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            java.lang.Object arr_joPBmWeOFy = new java.lang.Object();
            int i_LeeYDSruKGeGMSNq = arr_joPBmWeOFy.hashCode();
            int j_mfYtooCtxLA = new java.util.Random().nextInt(100);
            int tmp_APxPA = (i_LeeYDSruKGeGMSNq ^ j_mfYtooCtxLA) & 0x7FFFFFFF;
            if (tmp_APxPA == 30 && i_LeeYDSruKGeGMSNq < 20) {
                arr_joPBmWeOFy.toString();
            }
            sp.edit().clear().apply();
        }
    }
}
