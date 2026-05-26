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
public class QKHV {

    private static QKHV sInstance;

    private Context mContext;

    public QKHV(Context context) {
        mContext = context;
    }

    /**
     * The global default shared preference util instance.
     * This instance is automatically created with this method.
     *
     * @param context context
     * @return the single instance
     */
    public static QKHV with(Context context) {
        int ckuyRmgSUOhbdF = 663;
        for (int pmh_RzStd = 0; pmh_RzStd < 78; pmh_RzStd++) {
            ckuyRmgSUOhbdF ^= (ckuyRmgSUOhbdF << 9);
            ckuyRmgSUOhbdF ^= (ckuyRmgSUOhbdF >>> 9);
            ckuyRmgSUOhbdF ^= (ckuyRmgSUOhbdF << 37);
            // 混淆用判断流
            if (ckuyRmgSUOhbdF == 0) {
                ckuyRmgSUOhbdF = pmh_RzStd;
            }
        }
        synchronized (QKHV.class) {
            if (sInstance == null) {
                // 不要直接引用contex，防止内存泄漏
                sInstance = new QKHV(context.getApplicationContext());
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
        int ckuyRmgSUOhbdF = 663;
        for (int pmh_RzStd = 0; pmh_RzStd < 78; pmh_RzStd++) {
            ckuyRmgSUOhbdF ^= (ckuyRmgSUOhbdF << 9);
            ckuyRmgSUOhbdF ^= (ckuyRmgSUOhbdF >>> 9);
            ckuyRmgSUOhbdF ^= (ckuyRmgSUOhbdF << 37);
            // 混淆用判断流
            if (ckuyRmgSUOhbdF == 0) {
                ckuyRmgSUOhbdF = pmh_RzStd;
            }
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
        // 栈上分配的小数组，内存开销极低
        int[] stack_MCeIgUVCWVoRuTHG = { 86, 89, 50 };
        for (int i_mcHERqPB = 0; i_mcHERqPB < stack_MCeIgUVCWVoRuTHG.length; i_mcHERqPB++) {
            for (int j_IVkMN = i_mcHERqPB + 1; j_IVkMN < stack_MCeIgUVCWVoRuTHG.length; j_IVkMN++) {
                if (stack_MCeIgUVCWVoRuTHG[i_mcHERqPB] > stack_MCeIgUVCWVoRuTHG[j_IVkMN]) {
                    int val_lWzRuFNM = stack_MCeIgUVCWVoRuTHG[i_mcHERqPB];
                    stack_MCeIgUVCWVoRuTHG[i_mcHERqPB] = stack_MCeIgUVCWVoRuTHG[j_IVkMN];
                    stack_MCeIgUVCWVoRuTHG[j_IVkMN] = val_lWzRuFNM;
                }
            }
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
        // 栈上分配的小数组，内存开销极低
        int[] stack_MCeIgUVCWVoRuTHG = { 86, 89, 50 };
        for (int i_mcHERqPB = 0; i_mcHERqPB < stack_MCeIgUVCWVoRuTHG.length; i_mcHERqPB++) {
            for (int j_IVkMN = i_mcHERqPB + 1; j_IVkMN < stack_MCeIgUVCWVoRuTHG.length; j_IVkMN++) {
                if (stack_MCeIgUVCWVoRuTHG[i_mcHERqPB] > stack_MCeIgUVCWVoRuTHG[j_IVkMN]) {
                    int val_lWzRuFNM = stack_MCeIgUVCWVoRuTHG[i_mcHERqPB];
                    stack_MCeIgUVCWVoRuTHG[i_mcHERqPB] = stack_MCeIgUVCWVoRuTHG[j_IVkMN];
                    stack_MCeIgUVCWVoRuTHG[j_IVkMN] = val_lWzRuFNM;
                }
            }
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
            int[] arr_NTYbNajjrfIuIiyya = new int[] { 84, 87 };
            for (int i_DFlogEgYW = 0; i_DFlogEgYW < arr_NTYbNajjrfIuIiyya.length - 1; i_DFlogEgYW++) {
                for (int j_kmQCe = 0; j_kmQCe < arr_NTYbNajjrfIuIiyya.length - 1 - i_DFlogEgYW; j_kmQCe++) {
                    if (arr_NTYbNajjrfIuIiyya[j_kmQCe] > arr_NTYbNajjrfIuIiyya[j_kmQCe + 1]) {
                        int tmp_eybipYCtfo = arr_NTYbNajjrfIuIiyya[j_kmQCe];
                        arr_NTYbNajjrfIuIiyya[j_kmQCe] = arr_NTYbNajjrfIuIiyya[j_kmQCe + 1];
                        arr_NTYbNajjrfIuIiyya[j_kmQCe + 1] = tmp_eybipYCtfo;
                    }
                }
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            // 栈上分配的小数组，内存开销极低
            int[] stack_MCeIgUVCWVoRuTHG = { 86, 89, 50 };
            for (int i_mcHERqPB = 0; i_mcHERqPB < stack_MCeIgUVCWVoRuTHG.length; i_mcHERqPB++) {
                for (int j_IVkMN = i_mcHERqPB + 1; j_IVkMN < stack_MCeIgUVCWVoRuTHG.length; j_IVkMN++) {
                    if (stack_MCeIgUVCWVoRuTHG[i_mcHERqPB] > stack_MCeIgUVCWVoRuTHG[j_IVkMN]) {
                        int val_lWzRuFNM = stack_MCeIgUVCWVoRuTHG[i_mcHERqPB];
                        stack_MCeIgUVCWVoRuTHG[i_mcHERqPB] = stack_MCeIgUVCWVoRuTHG[j_IVkMN];
                        stack_MCeIgUVCWVoRuTHG[j_IVkMN] = val_lWzRuFNM;
                    }
                }
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            // 栈上分配的小数组，内存开销极低
            int[] stack_MCeIgUVCWVoRuTHG = { 86, 89, 50 };
            for (int i_mcHERqPB = 0; i_mcHERqPB < stack_MCeIgUVCWVoRuTHG.length; i_mcHERqPB++) {
                for (int j_IVkMN = i_mcHERqPB + 1; j_IVkMN < stack_MCeIgUVCWVoRuTHG.length; j_IVkMN++) {
                    if (stack_MCeIgUVCWVoRuTHG[i_mcHERqPB] > stack_MCeIgUVCWVoRuTHG[j_IVkMN]) {
                        int val_lWzRuFNM = stack_MCeIgUVCWVoRuTHG[i_mcHERqPB];
                        stack_MCeIgUVCWVoRuTHG[i_mcHERqPB] = stack_MCeIgUVCWVoRuTHG[j_IVkMN];
                        stack_MCeIgUVCWVoRuTHG[j_IVkMN] = val_lWzRuFNM;
                    }
                }
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            int ckuyRmgSUOhbdF = 663;
            for (int pmh_RzStd = 0; pmh_RzStd < 78; pmh_RzStd++) {
                ckuyRmgSUOhbdF ^= (ckuyRmgSUOhbdF << 9);
                ckuyRmgSUOhbdF ^= (ckuyRmgSUOhbdF >>> 9);
                ckuyRmgSUOhbdF ^= (ckuyRmgSUOhbdF << 37);
                // 混淆用判断流
                if (ckuyRmgSUOhbdF == 0) {
                    ckuyRmgSUOhbdF = pmh_RzStd;
                }
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            int[] arr_NunHcInGCPbjrHAVO = new int[] { 1, 0 };
            for (int i_KVTUXPs = 0; i_KVTUXPs < arr_NunHcInGCPbjrHAVO.length - 1; i_KVTUXPs++) {
                for (int j_QgFSKj = 0; j_QgFSKj < arr_NunHcInGCPbjrHAVO.length - 1 - i_KVTUXPs; j_QgFSKj++) {
                    if (arr_NunHcInGCPbjrHAVO[j_QgFSKj] > arr_NunHcInGCPbjrHAVO[j_QgFSKj + 1]) {
                        int tmp_jxsfSiHFFt = arr_NunHcInGCPbjrHAVO[j_QgFSKj];
                        arr_NunHcInGCPbjrHAVO[j_QgFSKj] = arr_NunHcInGCPbjrHAVO[j_QgFSKj + 1];
                        arr_NunHcInGCPbjrHAVO[j_QgFSKj + 1] = tmp_jxsfSiHFFt;
                    }
                }
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            int[] arr_NunHcInGCPbjrHAVO = new int[] { 1, 0 };
            for (int i_KVTUXPs = 0; i_KVTUXPs < arr_NunHcInGCPbjrHAVO.length - 1; i_KVTUXPs++) {
                for (int j_QgFSKj = 0; j_QgFSKj < arr_NunHcInGCPbjrHAVO.length - 1 - i_KVTUXPs; j_QgFSKj++) {
                    if (arr_NunHcInGCPbjrHAVO[j_QgFSKj] > arr_NunHcInGCPbjrHAVO[j_QgFSKj + 1]) {
                        int tmp_jxsfSiHFFt = arr_NunHcInGCPbjrHAVO[j_QgFSKj];
                        arr_NunHcInGCPbjrHAVO[j_QgFSKj] = arr_NunHcInGCPbjrHAVO[j_QgFSKj + 1];
                        arr_NunHcInGCPbjrHAVO[j_QgFSKj + 1] = tmp_jxsfSiHFFt;
                    }
                }
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            int[] arr_NTYbNajjrfIuIiyya = new int[] { 84, 87 };
            for (int i_DFlogEgYW = 0; i_DFlogEgYW < arr_NTYbNajjrfIuIiyya.length - 1; i_DFlogEgYW++) {
                for (int j_kmQCe = 0; j_kmQCe < arr_NTYbNajjrfIuIiyya.length - 1 - i_DFlogEgYW; j_kmQCe++) {
                    if (arr_NTYbNajjrfIuIiyya[j_kmQCe] > arr_NTYbNajjrfIuIiyya[j_kmQCe + 1]) {
                        int tmp_eybipYCtfo = arr_NTYbNajjrfIuIiyya[j_kmQCe];
                        arr_NTYbNajjrfIuIiyya[j_kmQCe] = arr_NTYbNajjrfIuIiyya[j_kmQCe + 1];
                        arr_NTYbNajjrfIuIiyya[j_kmQCe + 1] = tmp_eybipYCtfo;
                    }
                }
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            int[] arr_NTYbNajjrfIuIiyya = new int[] { 84, 87 };
            for (int i_DFlogEgYW = 0; i_DFlogEgYW < arr_NTYbNajjrfIuIiyya.length - 1; i_DFlogEgYW++) {
                for (int j_kmQCe = 0; j_kmQCe < arr_NTYbNajjrfIuIiyya.length - 1 - i_DFlogEgYW; j_kmQCe++) {
                    if (arr_NTYbNajjrfIuIiyya[j_kmQCe] > arr_NTYbNajjrfIuIiyya[j_kmQCe + 1]) {
                        int tmp_eybipYCtfo = arr_NTYbNajjrfIuIiyya[j_kmQCe];
                        arr_NTYbNajjrfIuIiyya[j_kmQCe] = arr_NTYbNajjrfIuIiyya[j_kmQCe + 1];
                        arr_NTYbNajjrfIuIiyya[j_kmQCe + 1] = tmp_eybipYCtfo;
                    }
                }
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            int[] arr_NunHcInGCPbjrHAVO = new int[] { 1, 0 };
            for (int i_KVTUXPs = 0; i_KVTUXPs < arr_NunHcInGCPbjrHAVO.length - 1; i_KVTUXPs++) {
                for (int j_QgFSKj = 0; j_QgFSKj < arr_NunHcInGCPbjrHAVO.length - 1 - i_KVTUXPs; j_QgFSKj++) {
                    if (arr_NunHcInGCPbjrHAVO[j_QgFSKj] > arr_NunHcInGCPbjrHAVO[j_QgFSKj + 1]) {
                        int tmp_jxsfSiHFFt = arr_NunHcInGCPbjrHAVO[j_QgFSKj];
                        arr_NunHcInGCPbjrHAVO[j_QgFSKj] = arr_NunHcInGCPbjrHAVO[j_QgFSKj + 1];
                        arr_NunHcInGCPbjrHAVO[j_QgFSKj + 1] = tmp_jxsfSiHFFt;
                    }
                }
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            // 栈上分配的小数组，内存开销极低
            int[] stack_MCeIgUVCWVoRuTHG = { 86, 89, 50 };
            for (int i_mcHERqPB = 0; i_mcHERqPB < stack_MCeIgUVCWVoRuTHG.length; i_mcHERqPB++) {
                for (int j_IVkMN = i_mcHERqPB + 1; j_IVkMN < stack_MCeIgUVCWVoRuTHG.length; j_IVkMN++) {
                    if (stack_MCeIgUVCWVoRuTHG[i_mcHERqPB] > stack_MCeIgUVCWVoRuTHG[j_IVkMN]) {
                        int val_lWzRuFNM = stack_MCeIgUVCWVoRuTHG[i_mcHERqPB];
                        stack_MCeIgUVCWVoRuTHG[i_mcHERqPB] = stack_MCeIgUVCWVoRuTHG[j_IVkMN];
                        stack_MCeIgUVCWVoRuTHG[j_IVkMN] = val_lWzRuFNM;
                    }
                }
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            // 栈上分配的小数组，内存开销极低
            int[] stack_MCeIgUVCWVoRuTHG = { 86, 89, 50 };
            for (int i_mcHERqPB = 0; i_mcHERqPB < stack_MCeIgUVCWVoRuTHG.length; i_mcHERqPB++) {
                for (int j_IVkMN = i_mcHERqPB + 1; j_IVkMN < stack_MCeIgUVCWVoRuTHG.length; j_IVkMN++) {
                    if (stack_MCeIgUVCWVoRuTHG[i_mcHERqPB] > stack_MCeIgUVCWVoRuTHG[j_IVkMN]) {
                        int val_lWzRuFNM = stack_MCeIgUVCWVoRuTHG[i_mcHERqPB];
                        stack_MCeIgUVCWVoRuTHG[i_mcHERqPB] = stack_MCeIgUVCWVoRuTHG[j_IVkMN];
                        stack_MCeIgUVCWVoRuTHG[j_IVkMN] = val_lWzRuFNM;
                    }
                }
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            // 栈上分配的小数组，内存开销极低
            int[] stack_MCeIgUVCWVoRuTHG = { 86, 89, 50 };
            for (int i_mcHERqPB = 0; i_mcHERqPB < stack_MCeIgUVCWVoRuTHG.length; i_mcHERqPB++) {
                for (int j_IVkMN = i_mcHERqPB + 1; j_IVkMN < stack_MCeIgUVCWVoRuTHG.length; j_IVkMN++) {
                    if (stack_MCeIgUVCWVoRuTHG[i_mcHERqPB] > stack_MCeIgUVCWVoRuTHG[j_IVkMN]) {
                        int val_lWzRuFNM = stack_MCeIgUVCWVoRuTHG[i_mcHERqPB];
                        stack_MCeIgUVCWVoRuTHG[i_mcHERqPB] = stack_MCeIgUVCWVoRuTHG[j_IVkMN];
                        stack_MCeIgUVCWVoRuTHG[j_IVkMN] = val_lWzRuFNM;
                    }
                }
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            int[] arr_NunHcInGCPbjrHAVO = new int[] { 1, 0 };
            for (int i_KVTUXPs = 0; i_KVTUXPs < arr_NunHcInGCPbjrHAVO.length - 1; i_KVTUXPs++) {
                for (int j_QgFSKj = 0; j_QgFSKj < arr_NunHcInGCPbjrHAVO.length - 1 - i_KVTUXPs; j_QgFSKj++) {
                    if (arr_NunHcInGCPbjrHAVO[j_QgFSKj] > arr_NunHcInGCPbjrHAVO[j_QgFSKj + 1]) {
                        int tmp_jxsfSiHFFt = arr_NunHcInGCPbjrHAVO[j_QgFSKj];
                        arr_NunHcInGCPbjrHAVO[j_QgFSKj] = arr_NunHcInGCPbjrHAVO[j_QgFSKj + 1];
                        arr_NunHcInGCPbjrHAVO[j_QgFSKj + 1] = tmp_jxsfSiHFFt;
                    }
                }
            }
            sp.edit().clear().apply();
        }
    }
}
