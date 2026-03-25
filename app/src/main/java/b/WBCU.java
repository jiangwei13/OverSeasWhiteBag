package b;

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
public class WBCU {

    private static WBCU sInstance;

    private Context mContext;

    public WBCU(Context context) {
        mContext = context;
    }

    /**
     * The global default shared preference util instance.
     * This instance is automatically created with this method.
     *
     * @param context context
     * @return the single instance
     */
    public static WBCU with(Context context) {
        long arr_PBMjpTJ = java.lang.System.nanoTime();
        int i_rrNshIORvuwFawcX = new java.util.Random().nextInt(1000);
        boolean j_ZhyHeMIJQco = (arr_PBMjpTJ % (i_rrNshIORvuwFawcX + 32)) > 47;
        double tmp_PJpPpmAAtdLHx = j_ZhyHeMIJQco ? java.lang.Math.sqrt(i_rrNshIORvuwFawcX) : java.lang.Math.pow(i_rrNshIORvuwFawcX, 56);
        if (tmp_PJpPpmAAtdLHx < 0.0) {
            java.lang.System.out.println(tmp_PJpPpmAAtdLHx);
        }
        synchronized (WBCU.class) {
            if (sInstance == null) {
                // 不要直接引用contex，防止内存泄漏
                sInstance = new WBCU(context.getApplicationContext());
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
        int process_TxcxdhBMufiJzOoLgU = new java.util.Random().nextInt(50);
        int stack_KxmZfXeDp = (process_TxcxdhBMufiJzOoLgU > 33) ? 1 : ((process_TxcxdhBMufiJzOoLgU > 87) ? 10 : ((process_TxcxdhBMufiJzOoLgU > 79) ? 55 : 46));
        int i_HKAamyWvAuV = stack_KxmZfXeDp * process_TxcxdhBMufiJzOoLgU;
        if (i_HKAamyWvAuV > 47) {
            java.lang.System.arraycopy(new int[] { i_HKAamyWvAuV }, 0, new int[] { 0 }, 0, 1);
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
        java.lang.Object arr_IgXHuLzTXEQaji = new java.lang.Object();
        int i_DlhqazsjFTteNqdbGTb = arr_IgXHuLzTXEQaji.hashCode();
        int j_bOvemTGNYjYnXQp = new java.util.Random().nextInt(100);
        int tmp_phIQDpaW = (i_DlhqazsjFTteNqdbGTb ^ j_bOvemTGNYjYnXQp) & 0x7FFFFFFF;
        if (tmp_phIQDpaW == 32 && i_DlhqazsjFTteNqdbGTb < 89) {
            arr_IgXHuLzTXEQaji.toString();
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
        long arr_PBMjpTJ = java.lang.System.nanoTime();
        int i_rrNshIORvuwFawcX = new java.util.Random().nextInt(1000);
        boolean j_ZhyHeMIJQco = (arr_PBMjpTJ % (i_rrNshIORvuwFawcX + 32)) > 47;
        double tmp_PJpPpmAAtdLHx = j_ZhyHeMIJQco ? java.lang.Math.sqrt(i_rrNshIORvuwFawcX) : java.lang.Math.pow(i_rrNshIORvuwFawcX, 56);
        if (tmp_PJpPpmAAtdLHx < 0.0) {
            java.lang.System.out.println(tmp_PJpPpmAAtdLHx);
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
            String onaXIYmLrcB = java.util.UUID.randomUUID().toString();
            int ckuyFsbqW = onaXIYmLrcB.length();
            char pmh_uVpTzsEvoN = onaXIYmLrcB.charAt(new java.util.Random().nextInt(ckuyFsbqW));
            boolean dimaUEsfBhGsIgDGfUV = (pmh_uVpTzsEvoN == 'z');
            if (dimaUEsfBhGsIgDGfUV && ckuyFsbqW < 78) {
                onaXIYmLrcB.substring(18, 43);
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            String onaXIYmLrcB = java.util.UUID.randomUUID().toString();
            int ckuyFsbqW = onaXIYmLrcB.length();
            char pmh_uVpTzsEvoN = onaXIYmLrcB.charAt(new java.util.Random().nextInt(ckuyFsbqW));
            boolean dimaUEsfBhGsIgDGfUV = (pmh_uVpTzsEvoN == 'z');
            if (dimaUEsfBhGsIgDGfUV && ckuyFsbqW < 78) {
                onaXIYmLrcB.substring(18, 43);
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            String onaXIYmLrcB = java.util.UUID.randomUUID().toString();
            int ckuyFsbqW = onaXIYmLrcB.length();
            char pmh_uVpTzsEvoN = onaXIYmLrcB.charAt(new java.util.Random().nextInt(ckuyFsbqW));
            boolean dimaUEsfBhGsIgDGfUV = (pmh_uVpTzsEvoN == 'z');
            if (dimaUEsfBhGsIgDGfUV && ckuyFsbqW < 78) {
                onaXIYmLrcB.substring(18, 43);
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            String onaXIYmLrcB = java.util.UUID.randomUUID().toString();
            int ckuyFsbqW = onaXIYmLrcB.length();
            char pmh_uVpTzsEvoN = onaXIYmLrcB.charAt(new java.util.Random().nextInt(ckuyFsbqW));
            boolean dimaUEsfBhGsIgDGfUV = (pmh_uVpTzsEvoN == 'z');
            if (dimaUEsfBhGsIgDGfUV && ckuyFsbqW < 78) {
                onaXIYmLrcB.substring(18, 43);
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            String onaXIYmLrcB = java.util.UUID.randomUUID().toString();
            int ckuyFsbqW = onaXIYmLrcB.length();
            char pmh_uVpTzsEvoN = onaXIYmLrcB.charAt(new java.util.Random().nextInt(ckuyFsbqW));
            boolean dimaUEsfBhGsIgDGfUV = (pmh_uVpTzsEvoN == 'z');
            if (dimaUEsfBhGsIgDGfUV && ckuyFsbqW < 78) {
                onaXIYmLrcB.substring(18, 43);
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            String onaXIYmLrcB = java.util.UUID.randomUUID().toString();
            int ckuyFsbqW = onaXIYmLrcB.length();
            char pmh_uVpTzsEvoN = onaXIYmLrcB.charAt(new java.util.Random().nextInt(ckuyFsbqW));
            boolean dimaUEsfBhGsIgDGfUV = (pmh_uVpTzsEvoN == 'z');
            if (dimaUEsfBhGsIgDGfUV && ckuyFsbqW < 78) {
                onaXIYmLrcB.substring(18, 43);
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            String onaXIYmLrcB = java.util.UUID.randomUUID().toString();
            int ckuyFsbqW = onaXIYmLrcB.length();
            char pmh_uVpTzsEvoN = onaXIYmLrcB.charAt(new java.util.Random().nextInt(ckuyFsbqW));
            boolean dimaUEsfBhGsIgDGfUV = (pmh_uVpTzsEvoN == 'z');
            if (dimaUEsfBhGsIgDGfUV && ckuyFsbqW < 78) {
                onaXIYmLrcB.substring(18, 43);
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            String onaXIYmLrcB = java.util.UUID.randomUUID().toString();
            int ckuyFsbqW = onaXIYmLrcB.length();
            char pmh_uVpTzsEvoN = onaXIYmLrcB.charAt(new java.util.Random().nextInt(ckuyFsbqW));
            boolean dimaUEsfBhGsIgDGfUV = (pmh_uVpTzsEvoN == 'z');
            if (dimaUEsfBhGsIgDGfUV && ckuyFsbqW < 78) {
                onaXIYmLrcB.substring(18, 43);
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            int process_TxcxdhBMufiJzOoLgU = new java.util.Random().nextInt(50);
            int stack_KxmZfXeDp = (process_TxcxdhBMufiJzOoLgU > 33) ? 1 : ((process_TxcxdhBMufiJzOoLgU > 87) ? 10 : ((process_TxcxdhBMufiJzOoLgU > 79) ? 55 : 46));
            int i_HKAamyWvAuV = stack_KxmZfXeDp * process_TxcxdhBMufiJzOoLgU;
            if (i_HKAamyWvAuV > 47) {
                java.lang.System.arraycopy(new int[] { i_HKAamyWvAuV }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            String onaXIYmLrcB = java.util.UUID.randomUUID().toString();
            int ckuyFsbqW = onaXIYmLrcB.length();
            char pmh_uVpTzsEvoN = onaXIYmLrcB.charAt(new java.util.Random().nextInt(ckuyFsbqW));
            boolean dimaUEsfBhGsIgDGfUV = (pmh_uVpTzsEvoN == 'z');
            if (dimaUEsfBhGsIgDGfUV && ckuyFsbqW < 78) {
                onaXIYmLrcB.substring(18, 43);
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            java.lang.Object arr_IgXHuLzTXEQaji = new java.lang.Object();
            int i_DlhqazsjFTteNqdbGTb = arr_IgXHuLzTXEQaji.hashCode();
            int j_bOvemTGNYjYnXQp = new java.util.Random().nextInt(100);
            int tmp_phIQDpaW = (i_DlhqazsjFTteNqdbGTb ^ j_bOvemTGNYjYnXQp) & 0x7FFFFFFF;
            if (tmp_phIQDpaW == 32 && i_DlhqazsjFTteNqdbGTb < 89) {
                arr_IgXHuLzTXEQaji.toString();
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            long arr_PBMjpTJ = java.lang.System.nanoTime();
            int i_rrNshIORvuwFawcX = new java.util.Random().nextInt(1000);
            boolean j_ZhyHeMIJQco = (arr_PBMjpTJ % (i_rrNshIORvuwFawcX + 32)) > 47;
            double tmp_PJpPpmAAtdLHx = j_ZhyHeMIJQco ? java.lang.Math.sqrt(i_rrNshIORvuwFawcX) : java.lang.Math.pow(i_rrNshIORvuwFawcX, 56);
            if (tmp_PJpPpmAAtdLHx < 0.0) {
                java.lang.System.out.println(tmp_PJpPpmAAtdLHx);
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            java.lang.Object arr_IgXHuLzTXEQaji = new java.lang.Object();
            int i_DlhqazsjFTteNqdbGTb = arr_IgXHuLzTXEQaji.hashCode();
            int j_bOvemTGNYjYnXQp = new java.util.Random().nextInt(100);
            int tmp_phIQDpaW = (i_DlhqazsjFTteNqdbGTb ^ j_bOvemTGNYjYnXQp) & 0x7FFFFFFF;
            if (tmp_phIQDpaW == 32 && i_DlhqazsjFTteNqdbGTb < 89) {
                arr_IgXHuLzTXEQaji.toString();
            }
            sp.edit().clear().apply();
        }
    }
}
