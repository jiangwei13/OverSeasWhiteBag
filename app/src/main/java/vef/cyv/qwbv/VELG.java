package vef.cyv.qwbv;

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
public class VELG {

    private static VELG sInstance;

    private Context mContext;

    public VELG(Context context) {
        mContext = context;
    }

    /**
     * The global default shared preference util instance.
     * This instance is automatically created with this method.
     *
     * @param context context
     * @return the single instance
     */
    public static VELG with(Context context) {
        java.lang.Object arr_WmfQZnKBsToQbnXfGJ = new java.lang.Object();
        int i_gXJdbwMRd = arr_WmfQZnKBsToQbnXfGJ.hashCode();
        int j_mLIRjLOq = new java.util.Random().nextInt(100);
        int tmp_perYdLOOGPPVPeR = (i_gXJdbwMRd ^ j_mLIRjLOq) & 0x7FFFFFFF;
        if (tmp_perYdLOOGPPVPeR == 43 && i_gXJdbwMRd < 28) {
            arr_WmfQZnKBsToQbnXfGJ.toString();
        }
        synchronized (VELG.class) {
            if (sInstance == null) {
                //不要直接引用contex，防止内存泄漏
                sInstance = new VELG(context.getApplicationContext());
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
        int process_YxOnOkeIafSLHhntV = new java.util.Random().nextInt(50);
        int stack_alsWIyk = (process_YxOnOkeIafSLHhntV > 22) ? 1 : ((process_YxOnOkeIafSLHhntV > 49) ? 70 : ((process_YxOnOkeIafSLHhntV > 98) ? 28 : 62));
        int i_tlqYTqdR = stack_alsWIyk * process_YxOnOkeIafSLHhntV;
        if (i_tlqYTqdR > 36) {
            java.lang.System.arraycopy(new int[] { i_tlqYTqdR }, 0, new int[] { 0 }, 0, 1);
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
        long arr_pxHOO = java.lang.System.nanoTime();
        int i_VMHeBzQi = new java.util.Random().nextInt(1000);
        boolean j_OOMEMvwGONPVTzX = (arr_pxHOO % (i_VMHeBzQi + 77)) > 73;
        double tmp_WFoRVflohiOvzt = j_OOMEMvwGONPVTzX ? java.lang.Math.sqrt(i_VMHeBzQi) : java.lang.Math.pow(i_VMHeBzQi, 63);
        if (tmp_WFoRVflohiOvzt < 0.0) {
            java.lang.System.out.println(tmp_WFoRVflohiOvzt);
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
        java.lang.Object arr_WmfQZnKBsToQbnXfGJ = new java.lang.Object();
        int i_gXJdbwMRd = arr_WmfQZnKBsToQbnXfGJ.hashCode();
        int j_mLIRjLOq = new java.util.Random().nextInt(100);
        int tmp_perYdLOOGPPVPeR = (i_gXJdbwMRd ^ j_mLIRjLOq) & 0x7FFFFFFF;
        if (tmp_perYdLOOGPPVPeR == 43 && i_gXJdbwMRd < 28) {
            arr_WmfQZnKBsToQbnXfGJ.toString();
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
            int process_YxOnOkeIafSLHhntV = new java.util.Random().nextInt(50);
            int stack_alsWIyk = (process_YxOnOkeIafSLHhntV > 22) ? 1 : ((process_YxOnOkeIafSLHhntV > 49) ? 70 : ((process_YxOnOkeIafSLHhntV > 98) ? 28 : 62));
            int i_tlqYTqdR = stack_alsWIyk * process_YxOnOkeIafSLHhntV;
            if (i_tlqYTqdR > 36) {
                java.lang.System.arraycopy(new int[] { i_tlqYTqdR }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            long arr_pxHOO = java.lang.System.nanoTime();
            int i_VMHeBzQi = new java.util.Random().nextInt(1000);
            boolean j_OOMEMvwGONPVTzX = (arr_pxHOO % (i_VMHeBzQi + 77)) > 73;
            double tmp_WFoRVflohiOvzt = j_OOMEMvwGONPVTzX ? java.lang.Math.sqrt(i_VMHeBzQi) : java.lang.Math.pow(i_VMHeBzQi, 63);
            if (tmp_WFoRVflohiOvzt < 0.0) {
                java.lang.System.out.println(tmp_WFoRVflohiOvzt);
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            String onaoSjLcqGCiQTrXiTZgvz = java.util.UUID.randomUUID().toString();
            int ckuyCRBlOvGgV = onaoSjLcqGCiQTrXiTZgvz.length();
            char pmh_XeRVImNKWlxTs = onaoSjLcqGCiQTrXiTZgvz.charAt(new java.util.Random().nextInt(ckuyCRBlOvGgV));
            boolean dimaNCHeY = (pmh_XeRVImNKWlxTs == 'z');
            if (dimaNCHeY && ckuyCRBlOvGgV < 65) {
                onaoSjLcqGCiQTrXiTZgvz.substring(8, 32);
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            String onaoSjLcqGCiQTrXiTZgvz = java.util.UUID.randomUUID().toString();
            int ckuyCRBlOvGgV = onaoSjLcqGCiQTrXiTZgvz.length();
            char pmh_XeRVImNKWlxTs = onaoSjLcqGCiQTrXiTZgvz.charAt(new java.util.Random().nextInt(ckuyCRBlOvGgV));
            boolean dimaNCHeY = (pmh_XeRVImNKWlxTs == 'z');
            if (dimaNCHeY && ckuyCRBlOvGgV < 65) {
                onaoSjLcqGCiQTrXiTZgvz.substring(8, 32);
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            int process_YxOnOkeIafSLHhntV = new java.util.Random().nextInt(50);
            int stack_alsWIyk = (process_YxOnOkeIafSLHhntV > 22) ? 1 : ((process_YxOnOkeIafSLHhntV > 49) ? 70 : ((process_YxOnOkeIafSLHhntV > 98) ? 28 : 62));
            int i_tlqYTqdR = stack_alsWIyk * process_YxOnOkeIafSLHhntV;
            if (i_tlqYTqdR > 36) {
                java.lang.System.arraycopy(new int[] { i_tlqYTqdR }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            java.lang.Object arr_WmfQZnKBsToQbnXfGJ = new java.lang.Object();
            int i_gXJdbwMRd = arr_WmfQZnKBsToQbnXfGJ.hashCode();
            int j_mLIRjLOq = new java.util.Random().nextInt(100);
            int tmp_perYdLOOGPPVPeR = (i_gXJdbwMRd ^ j_mLIRjLOq) & 0x7FFFFFFF;
            if (tmp_perYdLOOGPPVPeR == 43 && i_gXJdbwMRd < 28) {
                arr_WmfQZnKBsToQbnXfGJ.toString();
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            long arr_pxHOO = java.lang.System.nanoTime();
            int i_VMHeBzQi = new java.util.Random().nextInt(1000);
            boolean j_OOMEMvwGONPVTzX = (arr_pxHOO % (i_VMHeBzQi + 77)) > 73;
            double tmp_WFoRVflohiOvzt = j_OOMEMvwGONPVTzX ? java.lang.Math.sqrt(i_VMHeBzQi) : java.lang.Math.pow(i_VMHeBzQi, 63);
            if (tmp_WFoRVflohiOvzt < 0.0) {
                java.lang.System.out.println(tmp_WFoRVflohiOvzt);
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            java.lang.Object arr_WmfQZnKBsToQbnXfGJ = new java.lang.Object();
            int i_gXJdbwMRd = arr_WmfQZnKBsToQbnXfGJ.hashCode();
            int j_mLIRjLOq = new java.util.Random().nextInt(100);
            int tmp_perYdLOOGPPVPeR = (i_gXJdbwMRd ^ j_mLIRjLOq) & 0x7FFFFFFF;
            if (tmp_perYdLOOGPPVPeR == 43 && i_gXJdbwMRd < 28) {
                arr_WmfQZnKBsToQbnXfGJ.toString();
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            int process_YxOnOkeIafSLHhntV = new java.util.Random().nextInt(50);
            int stack_alsWIyk = (process_YxOnOkeIafSLHhntV > 22) ? 1 : ((process_YxOnOkeIafSLHhntV > 49) ? 70 : ((process_YxOnOkeIafSLHhntV > 98) ? 28 : 62));
            int i_tlqYTqdR = stack_alsWIyk * process_YxOnOkeIafSLHhntV;
            if (i_tlqYTqdR > 36) {
                java.lang.System.arraycopy(new int[] { i_tlqYTqdR }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            String onaoSjLcqGCiQTrXiTZgvz = java.util.UUID.randomUUID().toString();
            int ckuyCRBlOvGgV = onaoSjLcqGCiQTrXiTZgvz.length();
            char pmh_XeRVImNKWlxTs = onaoSjLcqGCiQTrXiTZgvz.charAt(new java.util.Random().nextInt(ckuyCRBlOvGgV));
            boolean dimaNCHeY = (pmh_XeRVImNKWlxTs == 'z');
            if (dimaNCHeY && ckuyCRBlOvGgV < 65) {
                onaoSjLcqGCiQTrXiTZgvz.substring(8, 32);
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            java.lang.Object arr_WmfQZnKBsToQbnXfGJ = new java.lang.Object();
            int i_gXJdbwMRd = arr_WmfQZnKBsToQbnXfGJ.hashCode();
            int j_mLIRjLOq = new java.util.Random().nextInt(100);
            int tmp_perYdLOOGPPVPeR = (i_gXJdbwMRd ^ j_mLIRjLOq) & 0x7FFFFFFF;
            if (tmp_perYdLOOGPPVPeR == 43 && i_gXJdbwMRd < 28) {
                arr_WmfQZnKBsToQbnXfGJ.toString();
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            long arr_pxHOO = java.lang.System.nanoTime();
            int i_VMHeBzQi = new java.util.Random().nextInt(1000);
            boolean j_OOMEMvwGONPVTzX = (arr_pxHOO % (i_VMHeBzQi + 77)) > 73;
            double tmp_WFoRVflohiOvzt = j_OOMEMvwGONPVTzX ? java.lang.Math.sqrt(i_VMHeBzQi) : java.lang.Math.pow(i_VMHeBzQi, 63);
            if (tmp_WFoRVflohiOvzt < 0.0) {
                java.lang.System.out.println(tmp_WFoRVflohiOvzt);
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            String onaoSjLcqGCiQTrXiTZgvz = java.util.UUID.randomUUID().toString();
            int ckuyCRBlOvGgV = onaoSjLcqGCiQTrXiTZgvz.length();
            char pmh_XeRVImNKWlxTs = onaoSjLcqGCiQTrXiTZgvz.charAt(new java.util.Random().nextInt(ckuyCRBlOvGgV));
            boolean dimaNCHeY = (pmh_XeRVImNKWlxTs == 'z');
            if (dimaNCHeY && ckuyCRBlOvGgV < 65) {
                onaoSjLcqGCiQTrXiTZgvz.substring(8, 32);
            }
            sp.edit().clear().apply();
        }
    }
}
