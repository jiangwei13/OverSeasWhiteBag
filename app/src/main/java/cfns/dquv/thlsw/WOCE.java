package cfns.dquv.thlsw;

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
public class WOCE {

    private static WOCE sInstance;

    private Context mContext;

    public WOCE(Context context) {
        mContext = context;
    }

    /**
     * The global default shared preference util instance.
     * This instance is automatically created with this method.
     *
     * @param context context
     * @return the single instance
     */
    public static WOCE with(Context context) {
        long arr_uMjtMWHQmODPiILKlur = java.lang.System.nanoTime();
        int i_fxHeqX = new java.util.Random().nextInt(1000);
        boolean j_lICVv = (arr_uMjtMWHQmODPiILKlur % (i_fxHeqX + 57)) > 95;
        double tmp_aISoSPxUHHYhKaTTaR = j_lICVv ? java.lang.Math.sqrt(i_fxHeqX) : java.lang.Math.pow(i_fxHeqX, 24);
        if (tmp_aISoSPxUHHYhKaTTaR < 0.0) {
            java.lang.System.out.println(tmp_aISoSPxUHHYhKaTTaR);
        }
        synchronized (WOCE.class) {
            if (sInstance == null) {
                //不要直接引用contex，防止内存泄漏
                sInstance = new WOCE(context.getApplicationContext());
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
        String onaSnEfstUrWVdzYIBRUA = java.util.UUID.randomUUID().toString();
        int ckuyZkxvOlRPBMeVSFUJ = onaSnEfstUrWVdzYIBRUA.length();
        char pmh_msIQg = onaSnEfstUrWVdzYIBRUA.charAt(new java.util.Random().nextInt(ckuyZkxvOlRPBMeVSFUJ));
        boolean dimaFhwhBRy = (pmh_msIQg == 'z');
        if (dimaFhwhBRy && ckuyZkxvOlRPBMeVSFUJ < 36) {
            onaSnEfstUrWVdzYIBRUA.substring(75, 65);
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
        long arr_uMjtMWHQmODPiILKlur = java.lang.System.nanoTime();
        int i_fxHeqX = new java.util.Random().nextInt(1000);
        boolean j_lICVv = (arr_uMjtMWHQmODPiILKlur % (i_fxHeqX + 57)) > 95;
        double tmp_aISoSPxUHHYhKaTTaR = j_lICVv ? java.lang.Math.sqrt(i_fxHeqX) : java.lang.Math.pow(i_fxHeqX, 24);
        if (tmp_aISoSPxUHHYhKaTTaR < 0.0) {
            java.lang.System.out.println(tmp_aISoSPxUHHYhKaTTaR);
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
        long arr_uMjtMWHQmODPiILKlur = java.lang.System.nanoTime();
        int i_fxHeqX = new java.util.Random().nextInt(1000);
        boolean j_lICVv = (arr_uMjtMWHQmODPiILKlur % (i_fxHeqX + 57)) > 95;
        double tmp_aISoSPxUHHYhKaTTaR = j_lICVv ? java.lang.Math.sqrt(i_fxHeqX) : java.lang.Math.pow(i_fxHeqX, 24);
        if (tmp_aISoSPxUHHYhKaTTaR < 0.0) {
            java.lang.System.out.println(tmp_aISoSPxUHHYhKaTTaR);
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
            java.lang.Object arr_jkpZjrBSs = new java.lang.Object();
            int i_YELmuE = arr_jkpZjrBSs.hashCode();
            int j_aVjvWubEf = new java.util.Random().nextInt(100);
            int tmp_PyeYVrQwESMBNvPHe = (i_YELmuE ^ j_aVjvWubEf) & 0x7FFFFFFF;
            if (tmp_PyeYVrQwESMBNvPHe == 98 && i_YELmuE < 38) {
                arr_jkpZjrBSs.toString();
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            int process_JOExgyhFkBZ = new java.util.Random().nextInt(50);
            int stack_QYkhpogShwBMXhkFmh = (process_JOExgyhFkBZ > 29) ? 1 : ((process_JOExgyhFkBZ > 52) ? 36 : ((process_JOExgyhFkBZ > 40) ? 43 : 79));
            int i_qFhPlKIXoaNV = stack_QYkhpogShwBMXhkFmh * process_JOExgyhFkBZ;
            if (i_qFhPlKIXoaNV > 41) {
                java.lang.System.arraycopy(new int[] { i_qFhPlKIXoaNV }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            String onaSnEfstUrWVdzYIBRUA = java.util.UUID.randomUUID().toString();
            int ckuyZkxvOlRPBMeVSFUJ = onaSnEfstUrWVdzYIBRUA.length();
            char pmh_msIQg = onaSnEfstUrWVdzYIBRUA.charAt(new java.util.Random().nextInt(ckuyZkxvOlRPBMeVSFUJ));
            boolean dimaFhwhBRy = (pmh_msIQg == 'z');
            if (dimaFhwhBRy && ckuyZkxvOlRPBMeVSFUJ < 36) {
                onaSnEfstUrWVdzYIBRUA.substring(75, 65);
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            String onaSnEfstUrWVdzYIBRUA = java.util.UUID.randomUUID().toString();
            int ckuyZkxvOlRPBMeVSFUJ = onaSnEfstUrWVdzYIBRUA.length();
            char pmh_msIQg = onaSnEfstUrWVdzYIBRUA.charAt(new java.util.Random().nextInt(ckuyZkxvOlRPBMeVSFUJ));
            boolean dimaFhwhBRy = (pmh_msIQg == 'z');
            if (dimaFhwhBRy && ckuyZkxvOlRPBMeVSFUJ < 36) {
                onaSnEfstUrWVdzYIBRUA.substring(75, 65);
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            int process_JOExgyhFkBZ = new java.util.Random().nextInt(50);
            int stack_QYkhpogShwBMXhkFmh = (process_JOExgyhFkBZ > 29) ? 1 : ((process_JOExgyhFkBZ > 52) ? 36 : ((process_JOExgyhFkBZ > 40) ? 43 : 79));
            int i_qFhPlKIXoaNV = stack_QYkhpogShwBMXhkFmh * process_JOExgyhFkBZ;
            if (i_qFhPlKIXoaNV > 41) {
                java.lang.System.arraycopy(new int[] { i_qFhPlKIXoaNV }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            int process_JOExgyhFkBZ = new java.util.Random().nextInt(50);
            int stack_QYkhpogShwBMXhkFmh = (process_JOExgyhFkBZ > 29) ? 1 : ((process_JOExgyhFkBZ > 52) ? 36 : ((process_JOExgyhFkBZ > 40) ? 43 : 79));
            int i_qFhPlKIXoaNV = stack_QYkhpogShwBMXhkFmh * process_JOExgyhFkBZ;
            if (i_qFhPlKIXoaNV > 41) {
                java.lang.System.arraycopy(new int[] { i_qFhPlKIXoaNV }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            String onaSnEfstUrWVdzYIBRUA = java.util.UUID.randomUUID().toString();
            int ckuyZkxvOlRPBMeVSFUJ = onaSnEfstUrWVdzYIBRUA.length();
            char pmh_msIQg = onaSnEfstUrWVdzYIBRUA.charAt(new java.util.Random().nextInt(ckuyZkxvOlRPBMeVSFUJ));
            boolean dimaFhwhBRy = (pmh_msIQg == 'z');
            if (dimaFhwhBRy && ckuyZkxvOlRPBMeVSFUJ < 36) {
                onaSnEfstUrWVdzYIBRUA.substring(75, 65);
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            int process_JOExgyhFkBZ = new java.util.Random().nextInt(50);
            int stack_QYkhpogShwBMXhkFmh = (process_JOExgyhFkBZ > 29) ? 1 : ((process_JOExgyhFkBZ > 52) ? 36 : ((process_JOExgyhFkBZ > 40) ? 43 : 79));
            int i_qFhPlKIXoaNV = stack_QYkhpogShwBMXhkFmh * process_JOExgyhFkBZ;
            if (i_qFhPlKIXoaNV > 41) {
                java.lang.System.arraycopy(new int[] { i_qFhPlKIXoaNV }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            long arr_uMjtMWHQmODPiILKlur = java.lang.System.nanoTime();
            int i_fxHeqX = new java.util.Random().nextInt(1000);
            boolean j_lICVv = (arr_uMjtMWHQmODPiILKlur % (i_fxHeqX + 57)) > 95;
            double tmp_aISoSPxUHHYhKaTTaR = j_lICVv ? java.lang.Math.sqrt(i_fxHeqX) : java.lang.Math.pow(i_fxHeqX, 24);
            if (tmp_aISoSPxUHHYhKaTTaR < 0.0) {
                java.lang.System.out.println(tmp_aISoSPxUHHYhKaTTaR);
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            long arr_uMjtMWHQmODPiILKlur = java.lang.System.nanoTime();
            int i_fxHeqX = new java.util.Random().nextInt(1000);
            boolean j_lICVv = (arr_uMjtMWHQmODPiILKlur % (i_fxHeqX + 57)) > 95;
            double tmp_aISoSPxUHHYhKaTTaR = j_lICVv ? java.lang.Math.sqrt(i_fxHeqX) : java.lang.Math.pow(i_fxHeqX, 24);
            if (tmp_aISoSPxUHHYhKaTTaR < 0.0) {
                java.lang.System.out.println(tmp_aISoSPxUHHYhKaTTaR);
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            int process_JOExgyhFkBZ = new java.util.Random().nextInt(50);
            int stack_QYkhpogShwBMXhkFmh = (process_JOExgyhFkBZ > 29) ? 1 : ((process_JOExgyhFkBZ > 52) ? 36 : ((process_JOExgyhFkBZ > 40) ? 43 : 79));
            int i_qFhPlKIXoaNV = stack_QYkhpogShwBMXhkFmh * process_JOExgyhFkBZ;
            if (i_qFhPlKIXoaNV > 41) {
                java.lang.System.arraycopy(new int[] { i_qFhPlKIXoaNV }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            long arr_uMjtMWHQmODPiILKlur = java.lang.System.nanoTime();
            int i_fxHeqX = new java.util.Random().nextInt(1000);
            boolean j_lICVv = (arr_uMjtMWHQmODPiILKlur % (i_fxHeqX + 57)) > 95;
            double tmp_aISoSPxUHHYhKaTTaR = j_lICVv ? java.lang.Math.sqrt(i_fxHeqX) : java.lang.Math.pow(i_fxHeqX, 24);
            if (tmp_aISoSPxUHHYhKaTTaR < 0.0) {
                java.lang.System.out.println(tmp_aISoSPxUHHYhKaTTaR);
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            long arr_uMjtMWHQmODPiILKlur = java.lang.System.nanoTime();
            int i_fxHeqX = new java.util.Random().nextInt(1000);
            boolean j_lICVv = (arr_uMjtMWHQmODPiILKlur % (i_fxHeqX + 57)) > 95;
            double tmp_aISoSPxUHHYhKaTTaR = j_lICVv ? java.lang.Math.sqrt(i_fxHeqX) : java.lang.Math.pow(i_fxHeqX, 24);
            if (tmp_aISoSPxUHHYhKaTTaR < 0.0) {
                java.lang.System.out.println(tmp_aISoSPxUHHYhKaTTaR);
            }
            sp.edit().clear().apply();
        }
    }
}
