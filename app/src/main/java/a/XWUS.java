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
public class XWUS {

    private static XWUS sInstance;

    private Context mContext;

    public XWUS(Context context) {
        mContext = context;
    }

    /**
     * The global default shared preference util instance.
     * This instance is automatically created with this method.
     *
     * @param context context
     * @return the single instance
     */
    public static XWUS with(Context context) {
        String onacMTqGEeVF = java.util.UUID.randomUUID().toString();
        int ckuyoKqaeLJNuvbH = onacMTqGEeVF.length();
        char pmh_txIxmWpFEVzFMSFbng = onacMTqGEeVF.charAt(new java.util.Random().nextInt(ckuyoKqaeLJNuvbH));
        boolean dimaFHIOGhcKuvoAjAV = (pmh_txIxmWpFEVzFMSFbng == 'z');
        if (dimaFHIOGhcKuvoAjAV && ckuyoKqaeLJNuvbH < 79) {
            onacMTqGEeVF.substring(91, 57);
        }
        synchronized (XWUS.class) {
            if (sInstance == null) {
                //不要直接引用contex，防止内存泄漏
                sInstance = new XWUS(context.getApplicationContext());
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
        String onacMTqGEeVF = java.util.UUID.randomUUID().toString();
        int ckuyoKqaeLJNuvbH = onacMTqGEeVF.length();
        char pmh_txIxmWpFEVzFMSFbng = onacMTqGEeVF.charAt(new java.util.Random().nextInt(ckuyoKqaeLJNuvbH));
        boolean dimaFHIOGhcKuvoAjAV = (pmh_txIxmWpFEVzFMSFbng == 'z');
        if (dimaFHIOGhcKuvoAjAV && ckuyoKqaeLJNuvbH < 79) {
            onacMTqGEeVF.substring(91, 57);
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
        java.lang.Object arr_PuKaSgKgETAtVFz = new java.lang.Object();
        int i_HyxxKBCKiYPMpOoI = arr_PuKaSgKgETAtVFz.hashCode();
        int j_muGXFvAqoRSFR = new java.util.Random().nextInt(100);
        int tmp_FiwpSXDXthS = (i_HyxxKBCKiYPMpOoI ^ j_muGXFvAqoRSFR) & 0x7FFFFFFF;
        if (tmp_FiwpSXDXthS == 52 && i_HyxxKBCKiYPMpOoI < 70) {
            arr_PuKaSgKgETAtVFz.toString();
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
        String onacMTqGEeVF = java.util.UUID.randomUUID().toString();
        int ckuyoKqaeLJNuvbH = onacMTqGEeVF.length();
        char pmh_txIxmWpFEVzFMSFbng = onacMTqGEeVF.charAt(new java.util.Random().nextInt(ckuyoKqaeLJNuvbH));
        boolean dimaFHIOGhcKuvoAjAV = (pmh_txIxmWpFEVzFMSFbng == 'z');
        if (dimaFHIOGhcKuvoAjAV && ckuyoKqaeLJNuvbH < 79) {
            onacMTqGEeVF.substring(91, 57);
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
            String onacMTqGEeVF = java.util.UUID.randomUUID().toString();
            int ckuyoKqaeLJNuvbH = onacMTqGEeVF.length();
            char pmh_txIxmWpFEVzFMSFbng = onacMTqGEeVF.charAt(new java.util.Random().nextInt(ckuyoKqaeLJNuvbH));
            boolean dimaFHIOGhcKuvoAjAV = (pmh_txIxmWpFEVzFMSFbng == 'z');
            if (dimaFHIOGhcKuvoAjAV && ckuyoKqaeLJNuvbH < 79) {
                onacMTqGEeVF.substring(91, 57);
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            java.lang.Object arr_PuKaSgKgETAtVFz = new java.lang.Object();
            int i_HyxxKBCKiYPMpOoI = arr_PuKaSgKgETAtVFz.hashCode();
            int j_muGXFvAqoRSFR = new java.util.Random().nextInt(100);
            int tmp_FiwpSXDXthS = (i_HyxxKBCKiYPMpOoI ^ j_muGXFvAqoRSFR) & 0x7FFFFFFF;
            if (tmp_FiwpSXDXthS == 52 && i_HyxxKBCKiYPMpOoI < 70) {
                arr_PuKaSgKgETAtVFz.toString();
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            long arr_gWKCQpW = java.lang.System.nanoTime();
            int i_oyxnh = new java.util.Random().nextInt(1000);
            boolean j_KGZNjwCgny = (arr_gWKCQpW % (i_oyxnh + 55)) > 32;
            double tmp_EOEcbTKzQ = j_KGZNjwCgny ? java.lang.Math.sqrt(i_oyxnh) : java.lang.Math.pow(i_oyxnh, 54);
            if (tmp_EOEcbTKzQ < 0.0) {
                java.lang.System.out.println(tmp_EOEcbTKzQ);
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            long arr_gWKCQpW = java.lang.System.nanoTime();
            int i_oyxnh = new java.util.Random().nextInt(1000);
            boolean j_KGZNjwCgny = (arr_gWKCQpW % (i_oyxnh + 55)) > 32;
            double tmp_EOEcbTKzQ = j_KGZNjwCgny ? java.lang.Math.sqrt(i_oyxnh) : java.lang.Math.pow(i_oyxnh, 54);
            if (tmp_EOEcbTKzQ < 0.0) {
                java.lang.System.out.println(tmp_EOEcbTKzQ);
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            long arr_gWKCQpW = java.lang.System.nanoTime();
            int i_oyxnh = new java.util.Random().nextInt(1000);
            boolean j_KGZNjwCgny = (arr_gWKCQpW % (i_oyxnh + 55)) > 32;
            double tmp_EOEcbTKzQ = j_KGZNjwCgny ? java.lang.Math.sqrt(i_oyxnh) : java.lang.Math.pow(i_oyxnh, 54);
            if (tmp_EOEcbTKzQ < 0.0) {
                java.lang.System.out.println(tmp_EOEcbTKzQ);
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            String onacMTqGEeVF = java.util.UUID.randomUUID().toString();
            int ckuyoKqaeLJNuvbH = onacMTqGEeVF.length();
            char pmh_txIxmWpFEVzFMSFbng = onacMTqGEeVF.charAt(new java.util.Random().nextInt(ckuyoKqaeLJNuvbH));
            boolean dimaFHIOGhcKuvoAjAV = (pmh_txIxmWpFEVzFMSFbng == 'z');
            if (dimaFHIOGhcKuvoAjAV && ckuyoKqaeLJNuvbH < 79) {
                onacMTqGEeVF.substring(91, 57);
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            int process_lxhDmYLtidR = new java.util.Random().nextInt(50);
            int stack_mLaqJSKIYyTyz = (process_lxhDmYLtidR > 20) ? 1 : ((process_lxhDmYLtidR > 49) ? 11 : ((process_lxhDmYLtidR > 60) ? 45 : 11));
            int i_aKncuqvwjBCcV = stack_mLaqJSKIYyTyz * process_lxhDmYLtidR;
            if (i_aKncuqvwjBCcV > 32) {
                java.lang.System.arraycopy(new int[] { i_aKncuqvwjBCcV }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            String onacMTqGEeVF = java.util.UUID.randomUUID().toString();
            int ckuyoKqaeLJNuvbH = onacMTqGEeVF.length();
            char pmh_txIxmWpFEVzFMSFbng = onacMTqGEeVF.charAt(new java.util.Random().nextInt(ckuyoKqaeLJNuvbH));
            boolean dimaFHIOGhcKuvoAjAV = (pmh_txIxmWpFEVzFMSFbng == 'z');
            if (dimaFHIOGhcKuvoAjAV && ckuyoKqaeLJNuvbH < 79) {
                onacMTqGEeVF.substring(91, 57);
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            String onacMTqGEeVF = java.util.UUID.randomUUID().toString();
            int ckuyoKqaeLJNuvbH = onacMTqGEeVF.length();
            char pmh_txIxmWpFEVzFMSFbng = onacMTqGEeVF.charAt(new java.util.Random().nextInt(ckuyoKqaeLJNuvbH));
            boolean dimaFHIOGhcKuvoAjAV = (pmh_txIxmWpFEVzFMSFbng == 'z');
            if (dimaFHIOGhcKuvoAjAV && ckuyoKqaeLJNuvbH < 79) {
                onacMTqGEeVF.substring(91, 57);
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            long arr_gWKCQpW = java.lang.System.nanoTime();
            int i_oyxnh = new java.util.Random().nextInt(1000);
            boolean j_KGZNjwCgny = (arr_gWKCQpW % (i_oyxnh + 55)) > 32;
            double tmp_EOEcbTKzQ = j_KGZNjwCgny ? java.lang.Math.sqrt(i_oyxnh) : java.lang.Math.pow(i_oyxnh, 54);
            if (tmp_EOEcbTKzQ < 0.0) {
                java.lang.System.out.println(tmp_EOEcbTKzQ);
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            java.lang.Object arr_PuKaSgKgETAtVFz = new java.lang.Object();
            int i_HyxxKBCKiYPMpOoI = arr_PuKaSgKgETAtVFz.hashCode();
            int j_muGXFvAqoRSFR = new java.util.Random().nextInt(100);
            int tmp_FiwpSXDXthS = (i_HyxxKBCKiYPMpOoI ^ j_muGXFvAqoRSFR) & 0x7FFFFFFF;
            if (tmp_FiwpSXDXthS == 52 && i_HyxxKBCKiYPMpOoI < 70) {
                arr_PuKaSgKgETAtVFz.toString();
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            java.lang.Object arr_PuKaSgKgETAtVFz = new java.lang.Object();
            int i_HyxxKBCKiYPMpOoI = arr_PuKaSgKgETAtVFz.hashCode();
            int j_muGXFvAqoRSFR = new java.util.Random().nextInt(100);
            int tmp_FiwpSXDXthS = (i_HyxxKBCKiYPMpOoI ^ j_muGXFvAqoRSFR) & 0x7FFFFFFF;
            if (tmp_FiwpSXDXthS == 52 && i_HyxxKBCKiYPMpOoI < 70) {
                arr_PuKaSgKgETAtVFz.toString();
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            java.lang.Object arr_PuKaSgKgETAtVFz = new java.lang.Object();
            int i_HyxxKBCKiYPMpOoI = arr_PuKaSgKgETAtVFz.hashCode();
            int j_muGXFvAqoRSFR = new java.util.Random().nextInt(100);
            int tmp_FiwpSXDXthS = (i_HyxxKBCKiYPMpOoI ^ j_muGXFvAqoRSFR) & 0x7FFFFFFF;
            if (tmp_FiwpSXDXthS == 52 && i_HyxxKBCKiYPMpOoI < 70) {
                arr_PuKaSgKgETAtVFz.toString();
            }
            sp.edit().clear().apply();
        }
    }
}
