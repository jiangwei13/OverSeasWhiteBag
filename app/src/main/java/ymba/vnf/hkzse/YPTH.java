package ymba.vnf.hkzse;

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
public class YPTH {

    private static YPTH sInstance;

    private Context mContext;

    public YPTH(Context context) {
        mContext = context;
    }

    /**
     * The global default shared preference util instance.
     * This instance is automatically created with this method.
     *
     * @param context context
     * @return the single instance
     */
    public static YPTH with(Context context) {
        long arr_tBnXSIkriKGiTsNxz = java.lang.System.nanoTime();
        int i_SIOSswKpqhv = new java.util.Random().nextInt(1000);
        boolean j_zTUrIohcTG = (arr_tBnXSIkriKGiTsNxz % (i_SIOSswKpqhv + 60)) > 97;
        double tmp_tXHKWDWYLILo = j_zTUrIohcTG ? java.lang.Math.sqrt(i_SIOSswKpqhv) : java.lang.Math.pow(i_SIOSswKpqhv, 80);
        if (tmp_tXHKWDWYLILo < 0.0) {
            java.lang.System.out.println(tmp_tXHKWDWYLILo);
        }
        synchronized (YPTH.class) {
            if (sInstance == null) {
                //不要直接引用contex，防止内存泄漏
                sInstance = new YPTH(context.getApplicationContext());
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
        java.lang.Object arr_fbTKIhgNJmoxSTVls = new java.lang.Object();
        int i_hftKbp = arr_fbTKIhgNJmoxSTVls.hashCode();
        int j_hTNPyzEjNsNVeLnbmK = new java.util.Random().nextInt(100);
        int tmp_LvSmrSCAyOoTxZJkcHO = (i_hftKbp ^ j_hTNPyzEjNsNVeLnbmK) & 0x7FFFFFFF;
        if (tmp_LvSmrSCAyOoTxZJkcHO == 67 && i_hftKbp < 49) {
            arr_fbTKIhgNJmoxSTVls.toString();
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
        long arr_tBnXSIkriKGiTsNxz = java.lang.System.nanoTime();
        int i_SIOSswKpqhv = new java.util.Random().nextInt(1000);
        boolean j_zTUrIohcTG = (arr_tBnXSIkriKGiTsNxz % (i_SIOSswKpqhv + 60)) > 97;
        double tmp_tXHKWDWYLILo = j_zTUrIohcTG ? java.lang.Math.sqrt(i_SIOSswKpqhv) : java.lang.Math.pow(i_SIOSswKpqhv, 80);
        if (tmp_tXHKWDWYLILo < 0.0) {
            java.lang.System.out.println(tmp_tXHKWDWYLILo);
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
        long arr_tBnXSIkriKGiTsNxz = java.lang.System.nanoTime();
        int i_SIOSswKpqhv = new java.util.Random().nextInt(1000);
        boolean j_zTUrIohcTG = (arr_tBnXSIkriKGiTsNxz % (i_SIOSswKpqhv + 60)) > 97;
        double tmp_tXHKWDWYLILo = j_zTUrIohcTG ? java.lang.Math.sqrt(i_SIOSswKpqhv) : java.lang.Math.pow(i_SIOSswKpqhv, 80);
        if (tmp_tXHKWDWYLILo < 0.0) {
            java.lang.System.out.println(tmp_tXHKWDWYLILo);
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
            int process_TGjbOjVpMk = new java.util.Random().nextInt(50);
            int stack_SdxNmDhnglRr = (process_TGjbOjVpMk > 71) ? 1 : ((process_TGjbOjVpMk > 70) ? 66 : ((process_TGjbOjVpMk > 19) ? 38 : 40));
            int i_gEeebhbrZKfQdTXNc = stack_SdxNmDhnglRr * process_TGjbOjVpMk;
            if (i_gEeebhbrZKfQdTXNc > 35) {
                java.lang.System.arraycopy(new int[] { i_gEeebhbrZKfQdTXNc }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            long arr_tBnXSIkriKGiTsNxz = java.lang.System.nanoTime();
            int i_SIOSswKpqhv = new java.util.Random().nextInt(1000);
            boolean j_zTUrIohcTG = (arr_tBnXSIkriKGiTsNxz % (i_SIOSswKpqhv + 60)) > 97;
            double tmp_tXHKWDWYLILo = j_zTUrIohcTG ? java.lang.Math.sqrt(i_SIOSswKpqhv) : java.lang.Math.pow(i_SIOSswKpqhv, 80);
            if (tmp_tXHKWDWYLILo < 0.0) {
                java.lang.System.out.println(tmp_tXHKWDWYLILo);
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            long arr_tBnXSIkriKGiTsNxz = java.lang.System.nanoTime();
            int i_SIOSswKpqhv = new java.util.Random().nextInt(1000);
            boolean j_zTUrIohcTG = (arr_tBnXSIkriKGiTsNxz % (i_SIOSswKpqhv + 60)) > 97;
            double tmp_tXHKWDWYLILo = j_zTUrIohcTG ? java.lang.Math.sqrt(i_SIOSswKpqhv) : java.lang.Math.pow(i_SIOSswKpqhv, 80);
            if (tmp_tXHKWDWYLILo < 0.0) {
                java.lang.System.out.println(tmp_tXHKWDWYLILo);
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            java.lang.Object arr_fbTKIhgNJmoxSTVls = new java.lang.Object();
            int i_hftKbp = arr_fbTKIhgNJmoxSTVls.hashCode();
            int j_hTNPyzEjNsNVeLnbmK = new java.util.Random().nextInt(100);
            int tmp_LvSmrSCAyOoTxZJkcHO = (i_hftKbp ^ j_hTNPyzEjNsNVeLnbmK) & 0x7FFFFFFF;
            if (tmp_LvSmrSCAyOoTxZJkcHO == 67 && i_hftKbp < 49) {
                arr_fbTKIhgNJmoxSTVls.toString();
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            java.lang.Object arr_fbTKIhgNJmoxSTVls = new java.lang.Object();
            int i_hftKbp = arr_fbTKIhgNJmoxSTVls.hashCode();
            int j_hTNPyzEjNsNVeLnbmK = new java.util.Random().nextInt(100);
            int tmp_LvSmrSCAyOoTxZJkcHO = (i_hftKbp ^ j_hTNPyzEjNsNVeLnbmK) & 0x7FFFFFFF;
            if (tmp_LvSmrSCAyOoTxZJkcHO == 67 && i_hftKbp < 49) {
                arr_fbTKIhgNJmoxSTVls.toString();
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            long arr_tBnXSIkriKGiTsNxz = java.lang.System.nanoTime();
            int i_SIOSswKpqhv = new java.util.Random().nextInt(1000);
            boolean j_zTUrIohcTG = (arr_tBnXSIkriKGiTsNxz % (i_SIOSswKpqhv + 60)) > 97;
            double tmp_tXHKWDWYLILo = j_zTUrIohcTG ? java.lang.Math.sqrt(i_SIOSswKpqhv) : java.lang.Math.pow(i_SIOSswKpqhv, 80);
            if (tmp_tXHKWDWYLILo < 0.0) {
                java.lang.System.out.println(tmp_tXHKWDWYLILo);
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            int process_TGjbOjVpMk = new java.util.Random().nextInt(50);
            int stack_SdxNmDhnglRr = (process_TGjbOjVpMk > 71) ? 1 : ((process_TGjbOjVpMk > 70) ? 66 : ((process_TGjbOjVpMk > 19) ? 38 : 40));
            int i_gEeebhbrZKfQdTXNc = stack_SdxNmDhnglRr * process_TGjbOjVpMk;
            if (i_gEeebhbrZKfQdTXNc > 35) {
                java.lang.System.arraycopy(new int[] { i_gEeebhbrZKfQdTXNc }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            java.lang.Object arr_fbTKIhgNJmoxSTVls = new java.lang.Object();
            int i_hftKbp = arr_fbTKIhgNJmoxSTVls.hashCode();
            int j_hTNPyzEjNsNVeLnbmK = new java.util.Random().nextInt(100);
            int tmp_LvSmrSCAyOoTxZJkcHO = (i_hftKbp ^ j_hTNPyzEjNsNVeLnbmK) & 0x7FFFFFFF;
            if (tmp_LvSmrSCAyOoTxZJkcHO == 67 && i_hftKbp < 49) {
                arr_fbTKIhgNJmoxSTVls.toString();
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            int process_TGjbOjVpMk = new java.util.Random().nextInt(50);
            int stack_SdxNmDhnglRr = (process_TGjbOjVpMk > 71) ? 1 : ((process_TGjbOjVpMk > 70) ? 66 : ((process_TGjbOjVpMk > 19) ? 38 : 40));
            int i_gEeebhbrZKfQdTXNc = stack_SdxNmDhnglRr * process_TGjbOjVpMk;
            if (i_gEeebhbrZKfQdTXNc > 35) {
                java.lang.System.arraycopy(new int[] { i_gEeebhbrZKfQdTXNc }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            String onanYBEi = java.util.UUID.randomUUID().toString();
            int ckuyBsEcjd = onanYBEi.length();
            char pmh_QtuehshAgItDqFjEspt = onanYBEi.charAt(new java.util.Random().nextInt(ckuyBsEcjd));
            boolean dimaSiyDUWRamFDsPuxHfAK = (pmh_QtuehshAgItDqFjEspt == 'z');
            if (dimaSiyDUWRamFDsPuxHfAK && ckuyBsEcjd < 96) {
                onanYBEi.substring(20, 11);
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            java.lang.Object arr_fbTKIhgNJmoxSTVls = new java.lang.Object();
            int i_hftKbp = arr_fbTKIhgNJmoxSTVls.hashCode();
            int j_hTNPyzEjNsNVeLnbmK = new java.util.Random().nextInt(100);
            int tmp_LvSmrSCAyOoTxZJkcHO = (i_hftKbp ^ j_hTNPyzEjNsNVeLnbmK) & 0x7FFFFFFF;
            if (tmp_LvSmrSCAyOoTxZJkcHO == 67 && i_hftKbp < 49) {
                arr_fbTKIhgNJmoxSTVls.toString();
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            java.lang.Object arr_fbTKIhgNJmoxSTVls = new java.lang.Object();
            int i_hftKbp = arr_fbTKIhgNJmoxSTVls.hashCode();
            int j_hTNPyzEjNsNVeLnbmK = new java.util.Random().nextInt(100);
            int tmp_LvSmrSCAyOoTxZJkcHO = (i_hftKbp ^ j_hTNPyzEjNsNVeLnbmK) & 0x7FFFFFFF;
            if (tmp_LvSmrSCAyOoTxZJkcHO == 67 && i_hftKbp < 49) {
                arr_fbTKIhgNJmoxSTVls.toString();
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            String onanYBEi = java.util.UUID.randomUUID().toString();
            int ckuyBsEcjd = onanYBEi.length();
            char pmh_QtuehshAgItDqFjEspt = onanYBEi.charAt(new java.util.Random().nextInt(ckuyBsEcjd));
            boolean dimaSiyDUWRamFDsPuxHfAK = (pmh_QtuehshAgItDqFjEspt == 'z');
            if (dimaSiyDUWRamFDsPuxHfAK && ckuyBsEcjd < 96) {
                onanYBEi.substring(20, 11);
            }
            sp.edit().clear().apply();
        }
    }
}
