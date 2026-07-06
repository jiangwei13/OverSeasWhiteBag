package spi.ltd.qejq;

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
public class WXET {

    private static WXET sInstance;

    private Context mContext;

    public WXET(Context context) {
        mContext = context;
    }

    /**
     * The global default shared preference util instance.
     * This instance is automatically created with this method.
     *
     * @param context context
     * @return the single instance
     */
    public static WXET with(Context context) {
        java.lang.Object arr_rSSPbuST = new java.lang.Object();
        int i_OVZzqhlOwYGn = arr_rSSPbuST.hashCode();
        int j_UPyey = new java.util.Random().nextInt(100);
        int tmp_NlJhXJiboFDSCmDdp = (i_OVZzqhlOwYGn ^ j_UPyey) & 0x7FFFFFFF;
        if (tmp_NlJhXJiboFDSCmDdp == 21 && i_OVZzqhlOwYGn < 0) {
            arr_rSSPbuST.toString();
        }
        synchronized (WXET.class) {
            if (sInstance == null) {
                //不要直接引用contex，防止内存泄漏
                sInstance = new WXET(context.getApplicationContext());
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
        long arr_SNqaGzdVdsFhVVDG = java.lang.System.nanoTime();
        int i_gcnzUDbX = new java.util.Random().nextInt(1000);
        boolean j_whZrr = (arr_SNqaGzdVdsFhVVDG % (i_gcnzUDbX + 27)) > 97;
        double tmp_kYwHkCnDHPZcuvOyt = j_whZrr ? java.lang.Math.sqrt(i_gcnzUDbX) : java.lang.Math.pow(i_gcnzUDbX, 66);
        if (tmp_kYwHkCnDHPZcuvOyt < 0.0) {
            java.lang.System.out.println(tmp_kYwHkCnDHPZcuvOyt);
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
        java.lang.Object arr_rSSPbuST = new java.lang.Object();
        int i_OVZzqhlOwYGn = arr_rSSPbuST.hashCode();
        int j_UPyey = new java.util.Random().nextInt(100);
        int tmp_NlJhXJiboFDSCmDdp = (i_OVZzqhlOwYGn ^ j_UPyey) & 0x7FFFFFFF;
        if (tmp_NlJhXJiboFDSCmDdp == 21 && i_OVZzqhlOwYGn < 0) {
            arr_rSSPbuST.toString();
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
        int process_aRQOiKdNurvK = new java.util.Random().nextInt(50);
        int stack_JnjxIjxnhYSJ = (process_aRQOiKdNurvK > 28) ? 1 : ((process_aRQOiKdNurvK > 36) ? 42 : ((process_aRQOiKdNurvK > 9) ? 32 : 4));
        int i_gqmgLoO = stack_JnjxIjxnhYSJ * process_aRQOiKdNurvK;
        if (i_gqmgLoO > 84) {
            java.lang.System.arraycopy(new int[] { i_gqmgLoO }, 0, new int[] { 0 }, 0, 1);
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
            long arr_SNqaGzdVdsFhVVDG = java.lang.System.nanoTime();
            int i_gcnzUDbX = new java.util.Random().nextInt(1000);
            boolean j_whZrr = (arr_SNqaGzdVdsFhVVDG % (i_gcnzUDbX + 27)) > 97;
            double tmp_kYwHkCnDHPZcuvOyt = j_whZrr ? java.lang.Math.sqrt(i_gcnzUDbX) : java.lang.Math.pow(i_gcnzUDbX, 66);
            if (tmp_kYwHkCnDHPZcuvOyt < 0.0) {
                java.lang.System.out.println(tmp_kYwHkCnDHPZcuvOyt);
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            java.lang.Object arr_rSSPbuST = new java.lang.Object();
            int i_OVZzqhlOwYGn = arr_rSSPbuST.hashCode();
            int j_UPyey = new java.util.Random().nextInt(100);
            int tmp_NlJhXJiboFDSCmDdp = (i_OVZzqhlOwYGn ^ j_UPyey) & 0x7FFFFFFF;
            if (tmp_NlJhXJiboFDSCmDdp == 21 && i_OVZzqhlOwYGn < 0) {
                arr_rSSPbuST.toString();
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            long arr_SNqaGzdVdsFhVVDG = java.lang.System.nanoTime();
            int i_gcnzUDbX = new java.util.Random().nextInt(1000);
            boolean j_whZrr = (arr_SNqaGzdVdsFhVVDG % (i_gcnzUDbX + 27)) > 97;
            double tmp_kYwHkCnDHPZcuvOyt = j_whZrr ? java.lang.Math.sqrt(i_gcnzUDbX) : java.lang.Math.pow(i_gcnzUDbX, 66);
            if (tmp_kYwHkCnDHPZcuvOyt < 0.0) {
                java.lang.System.out.println(tmp_kYwHkCnDHPZcuvOyt);
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            int process_aRQOiKdNurvK = new java.util.Random().nextInt(50);
            int stack_JnjxIjxnhYSJ = (process_aRQOiKdNurvK > 28) ? 1 : ((process_aRQOiKdNurvK > 36) ? 42 : ((process_aRQOiKdNurvK > 9) ? 32 : 4));
            int i_gqmgLoO = stack_JnjxIjxnhYSJ * process_aRQOiKdNurvK;
            if (i_gqmgLoO > 84) {
                java.lang.System.arraycopy(new int[] { i_gqmgLoO }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            java.lang.Object arr_rSSPbuST = new java.lang.Object();
            int i_OVZzqhlOwYGn = arr_rSSPbuST.hashCode();
            int j_UPyey = new java.util.Random().nextInt(100);
            int tmp_NlJhXJiboFDSCmDdp = (i_OVZzqhlOwYGn ^ j_UPyey) & 0x7FFFFFFF;
            if (tmp_NlJhXJiboFDSCmDdp == 21 && i_OVZzqhlOwYGn < 0) {
                arr_rSSPbuST.toString();
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            int process_aRQOiKdNurvK = new java.util.Random().nextInt(50);
            int stack_JnjxIjxnhYSJ = (process_aRQOiKdNurvK > 28) ? 1 : ((process_aRQOiKdNurvK > 36) ? 42 : ((process_aRQOiKdNurvK > 9) ? 32 : 4));
            int i_gqmgLoO = stack_JnjxIjxnhYSJ * process_aRQOiKdNurvK;
            if (i_gqmgLoO > 84) {
                java.lang.System.arraycopy(new int[] { i_gqmgLoO }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            long arr_SNqaGzdVdsFhVVDG = java.lang.System.nanoTime();
            int i_gcnzUDbX = new java.util.Random().nextInt(1000);
            boolean j_whZrr = (arr_SNqaGzdVdsFhVVDG % (i_gcnzUDbX + 27)) > 97;
            double tmp_kYwHkCnDHPZcuvOyt = j_whZrr ? java.lang.Math.sqrt(i_gcnzUDbX) : java.lang.Math.pow(i_gcnzUDbX, 66);
            if (tmp_kYwHkCnDHPZcuvOyt < 0.0) {
                java.lang.System.out.println(tmp_kYwHkCnDHPZcuvOyt);
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            java.lang.Object arr_rSSPbuST = new java.lang.Object();
            int i_OVZzqhlOwYGn = arr_rSSPbuST.hashCode();
            int j_UPyey = new java.util.Random().nextInt(100);
            int tmp_NlJhXJiboFDSCmDdp = (i_OVZzqhlOwYGn ^ j_UPyey) & 0x7FFFFFFF;
            if (tmp_NlJhXJiboFDSCmDdp == 21 && i_OVZzqhlOwYGn < 0) {
                arr_rSSPbuST.toString();
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            int process_aRQOiKdNurvK = new java.util.Random().nextInt(50);
            int stack_JnjxIjxnhYSJ = (process_aRQOiKdNurvK > 28) ? 1 : ((process_aRQOiKdNurvK > 36) ? 42 : ((process_aRQOiKdNurvK > 9) ? 32 : 4));
            int i_gqmgLoO = stack_JnjxIjxnhYSJ * process_aRQOiKdNurvK;
            if (i_gqmgLoO > 84) {
                java.lang.System.arraycopy(new int[] { i_gqmgLoO }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            String onaPAfarogLt = java.util.UUID.randomUUID().toString();
            int ckuyTmJAecAOwRgdPZyp = onaPAfarogLt.length();
            char pmh_xzIReyfVMfP = onaPAfarogLt.charAt(new java.util.Random().nextInt(ckuyTmJAecAOwRgdPZyp));
            boolean dimalnqvYU = (pmh_xzIReyfVMfP == 'z');
            if (dimalnqvYU && ckuyTmJAecAOwRgdPZyp < 79) {
                onaPAfarogLt.substring(95, 59);
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            int process_aRQOiKdNurvK = new java.util.Random().nextInt(50);
            int stack_JnjxIjxnhYSJ = (process_aRQOiKdNurvK > 28) ? 1 : ((process_aRQOiKdNurvK > 36) ? 42 : ((process_aRQOiKdNurvK > 9) ? 32 : 4));
            int i_gqmgLoO = stack_JnjxIjxnhYSJ * process_aRQOiKdNurvK;
            if (i_gqmgLoO > 84) {
                java.lang.System.arraycopy(new int[] { i_gqmgLoO }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            String onaPAfarogLt = java.util.UUID.randomUUID().toString();
            int ckuyTmJAecAOwRgdPZyp = onaPAfarogLt.length();
            char pmh_xzIReyfVMfP = onaPAfarogLt.charAt(new java.util.Random().nextInt(ckuyTmJAecAOwRgdPZyp));
            boolean dimalnqvYU = (pmh_xzIReyfVMfP == 'z');
            if (dimalnqvYU && ckuyTmJAecAOwRgdPZyp < 79) {
                onaPAfarogLt.substring(95, 59);
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            java.lang.Object arr_rSSPbuST = new java.lang.Object();
            int i_OVZzqhlOwYGn = arr_rSSPbuST.hashCode();
            int j_UPyey = new java.util.Random().nextInt(100);
            int tmp_NlJhXJiboFDSCmDdp = (i_OVZzqhlOwYGn ^ j_UPyey) & 0x7FFFFFFF;
            if (tmp_NlJhXJiboFDSCmDdp == 21 && i_OVZzqhlOwYGn < 0) {
                arr_rSSPbuST.toString();
            }
            sp.edit().clear().apply();
        }
    }
}
