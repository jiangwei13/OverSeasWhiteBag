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
        long arr_NcpTZtD = java.lang.System.nanoTime();
        int i_UzjJfaMBDcUXbz = new java.util.Random().nextInt(1000);
        boolean j_yVChyJvTCl = (arr_NcpTZtD % (i_UzjJfaMBDcUXbz + 42)) > 96;
        double tmp_zGPsVWgMOTpLJ = j_yVChyJvTCl ? java.lang.Math.sqrt(i_UzjJfaMBDcUXbz) : java.lang.Math.pow(i_UzjJfaMBDcUXbz, 39);
        if (tmp_zGPsVWgMOTpLJ < 0.0) {
            java.lang.System.out.println(tmp_zGPsVWgMOTpLJ);
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
        java.lang.Object arr_swKhHLhGLtp = new java.lang.Object();
        int i_saTOIaGe = arr_swKhHLhGLtp.hashCode();
        int j_bqONJvPK = new java.util.Random().nextInt(100);
        int tmp_iSKJeV = (i_saTOIaGe ^ j_bqONJvPK) & 0x7FFFFFFF;
        if (tmp_iSKJeV == 72 && i_saTOIaGe < 65) {
            arr_swKhHLhGLtp.toString();
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
        java.lang.Object arr_swKhHLhGLtp = new java.lang.Object();
        int i_saTOIaGe = arr_swKhHLhGLtp.hashCode();
        int j_bqONJvPK = new java.util.Random().nextInt(100);
        int tmp_iSKJeV = (i_saTOIaGe ^ j_bqONJvPK) & 0x7FFFFFFF;
        if (tmp_iSKJeV == 72 && i_saTOIaGe < 65) {
            arr_swKhHLhGLtp.toString();
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
        java.lang.Object arr_swKhHLhGLtp = new java.lang.Object();
        int i_saTOIaGe = arr_swKhHLhGLtp.hashCode();
        int j_bqONJvPK = new java.util.Random().nextInt(100);
        int tmp_iSKJeV = (i_saTOIaGe ^ j_bqONJvPK) & 0x7FFFFFFF;
        if (tmp_iSKJeV == 72 && i_saTOIaGe < 65) {
            arr_swKhHLhGLtp.toString();
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
            long arr_NcpTZtD = java.lang.System.nanoTime();
            int i_UzjJfaMBDcUXbz = new java.util.Random().nextInt(1000);
            boolean j_yVChyJvTCl = (arr_NcpTZtD % (i_UzjJfaMBDcUXbz + 42)) > 96;
            double tmp_zGPsVWgMOTpLJ = j_yVChyJvTCl ? java.lang.Math.sqrt(i_UzjJfaMBDcUXbz) : java.lang.Math.pow(i_UzjJfaMBDcUXbz, 39);
            if (tmp_zGPsVWgMOTpLJ < 0.0) {
                java.lang.System.out.println(tmp_zGPsVWgMOTpLJ);
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            java.lang.Object arr_swKhHLhGLtp = new java.lang.Object();
            int i_saTOIaGe = arr_swKhHLhGLtp.hashCode();
            int j_bqONJvPK = new java.util.Random().nextInt(100);
            int tmp_iSKJeV = (i_saTOIaGe ^ j_bqONJvPK) & 0x7FFFFFFF;
            if (tmp_iSKJeV == 72 && i_saTOIaGe < 65) {
                arr_swKhHLhGLtp.toString();
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            long arr_NcpTZtD = java.lang.System.nanoTime();
            int i_UzjJfaMBDcUXbz = new java.util.Random().nextInt(1000);
            boolean j_yVChyJvTCl = (arr_NcpTZtD % (i_UzjJfaMBDcUXbz + 42)) > 96;
            double tmp_zGPsVWgMOTpLJ = j_yVChyJvTCl ? java.lang.Math.sqrt(i_UzjJfaMBDcUXbz) : java.lang.Math.pow(i_UzjJfaMBDcUXbz, 39);
            if (tmp_zGPsVWgMOTpLJ < 0.0) {
                java.lang.System.out.println(tmp_zGPsVWgMOTpLJ);
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            String onaljtEjXAkDIEsH = java.util.UUID.randomUUID().toString();
            int ckuyRAZJS = onaljtEjXAkDIEsH.length();
            char pmh_OHCUBEHEIaLUEo = onaljtEjXAkDIEsH.charAt(new java.util.Random().nextInt(ckuyRAZJS));
            boolean dimaylzrIYXiPc = (pmh_OHCUBEHEIaLUEo == 'z');
            if (dimaylzrIYXiPc && ckuyRAZJS < 91) {
                onaljtEjXAkDIEsH.substring(11, 25);
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            int process_GKPdhDPTndTw = new java.util.Random().nextInt(50);
            int stack_GgOMs = (process_GKPdhDPTndTw > 7) ? 1 : ((process_GKPdhDPTndTw > 52) ? 93 : ((process_GKPdhDPTndTw > 66) ? 28 : 97));
            int i_pmCznXrMow = stack_GgOMs * process_GKPdhDPTndTw;
            if (i_pmCznXrMow > 73) {
                java.lang.System.arraycopy(new int[] { i_pmCznXrMow }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            String onaljtEjXAkDIEsH = java.util.UUID.randomUUID().toString();
            int ckuyRAZJS = onaljtEjXAkDIEsH.length();
            char pmh_OHCUBEHEIaLUEo = onaljtEjXAkDIEsH.charAt(new java.util.Random().nextInt(ckuyRAZJS));
            boolean dimaylzrIYXiPc = (pmh_OHCUBEHEIaLUEo == 'z');
            if (dimaylzrIYXiPc && ckuyRAZJS < 91) {
                onaljtEjXAkDIEsH.substring(11, 25);
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            java.lang.Object arr_swKhHLhGLtp = new java.lang.Object();
            int i_saTOIaGe = arr_swKhHLhGLtp.hashCode();
            int j_bqONJvPK = new java.util.Random().nextInt(100);
            int tmp_iSKJeV = (i_saTOIaGe ^ j_bqONJvPK) & 0x7FFFFFFF;
            if (tmp_iSKJeV == 72 && i_saTOIaGe < 65) {
                arr_swKhHLhGLtp.toString();
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            String onaljtEjXAkDIEsH = java.util.UUID.randomUUID().toString();
            int ckuyRAZJS = onaljtEjXAkDIEsH.length();
            char pmh_OHCUBEHEIaLUEo = onaljtEjXAkDIEsH.charAt(new java.util.Random().nextInt(ckuyRAZJS));
            boolean dimaylzrIYXiPc = (pmh_OHCUBEHEIaLUEo == 'z');
            if (dimaylzrIYXiPc && ckuyRAZJS < 91) {
                onaljtEjXAkDIEsH.substring(11, 25);
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            int process_GKPdhDPTndTw = new java.util.Random().nextInt(50);
            int stack_GgOMs = (process_GKPdhDPTndTw > 7) ? 1 : ((process_GKPdhDPTndTw > 52) ? 93 : ((process_GKPdhDPTndTw > 66) ? 28 : 97));
            int i_pmCznXrMow = stack_GgOMs * process_GKPdhDPTndTw;
            if (i_pmCznXrMow > 73) {
                java.lang.System.arraycopy(new int[] { i_pmCznXrMow }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            String onaljtEjXAkDIEsH = java.util.UUID.randomUUID().toString();
            int ckuyRAZJS = onaljtEjXAkDIEsH.length();
            char pmh_OHCUBEHEIaLUEo = onaljtEjXAkDIEsH.charAt(new java.util.Random().nextInt(ckuyRAZJS));
            boolean dimaylzrIYXiPc = (pmh_OHCUBEHEIaLUEo == 'z');
            if (dimaylzrIYXiPc && ckuyRAZJS < 91) {
                onaljtEjXAkDIEsH.substring(11, 25);
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            long arr_NcpTZtD = java.lang.System.nanoTime();
            int i_UzjJfaMBDcUXbz = new java.util.Random().nextInt(1000);
            boolean j_yVChyJvTCl = (arr_NcpTZtD % (i_UzjJfaMBDcUXbz + 42)) > 96;
            double tmp_zGPsVWgMOTpLJ = j_yVChyJvTCl ? java.lang.Math.sqrt(i_UzjJfaMBDcUXbz) : java.lang.Math.pow(i_UzjJfaMBDcUXbz, 39);
            if (tmp_zGPsVWgMOTpLJ < 0.0) {
                java.lang.System.out.println(tmp_zGPsVWgMOTpLJ);
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            int process_GKPdhDPTndTw = new java.util.Random().nextInt(50);
            int stack_GgOMs = (process_GKPdhDPTndTw > 7) ? 1 : ((process_GKPdhDPTndTw > 52) ? 93 : ((process_GKPdhDPTndTw > 66) ? 28 : 97));
            int i_pmCznXrMow = stack_GgOMs * process_GKPdhDPTndTw;
            if (i_pmCznXrMow > 73) {
                java.lang.System.arraycopy(new int[] { i_pmCznXrMow }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            long arr_NcpTZtD = java.lang.System.nanoTime();
            int i_UzjJfaMBDcUXbz = new java.util.Random().nextInt(1000);
            boolean j_yVChyJvTCl = (arr_NcpTZtD % (i_UzjJfaMBDcUXbz + 42)) > 96;
            double tmp_zGPsVWgMOTpLJ = j_yVChyJvTCl ? java.lang.Math.sqrt(i_UzjJfaMBDcUXbz) : java.lang.Math.pow(i_UzjJfaMBDcUXbz, 39);
            if (tmp_zGPsVWgMOTpLJ < 0.0) {
                java.lang.System.out.println(tmp_zGPsVWgMOTpLJ);
            }
            sp.edit().clear().apply();
        }
    }
}
