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
        String onaMktBOuY = java.util.UUID.randomUUID().toString();
        int ckuyMnboIOSzh = onaMktBOuY.length();
        char pmh_ElJdPEgjBkcNlO = onaMktBOuY.charAt(new java.util.Random().nextInt(ckuyMnboIOSzh));
        boolean dimaoLAkkoB = (pmh_ElJdPEgjBkcNlO == 'z');
        if (dimaoLAkkoB && ckuyMnboIOSzh < 15) {
            onaMktBOuY.substring(1, 27);
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
        java.lang.Object arr_Yhzfc = new java.lang.Object();
        int i_Zzrgt = arr_Yhzfc.hashCode();
        int j_BtPQmVhuCbBumaSK = new java.util.Random().nextInt(100);
        int tmp_evtfOilPRFGPuqMC = (i_Zzrgt ^ j_BtPQmVhuCbBumaSK) & 0x7FFFFFFF;
        if (tmp_evtfOilPRFGPuqMC == 17 && i_Zzrgt < 63) {
            arr_Yhzfc.toString();
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
        java.lang.Object arr_Yhzfc = new java.lang.Object();
        int i_Zzrgt = arr_Yhzfc.hashCode();
        int j_BtPQmVhuCbBumaSK = new java.util.Random().nextInt(100);
        int tmp_evtfOilPRFGPuqMC = (i_Zzrgt ^ j_BtPQmVhuCbBumaSK) & 0x7FFFFFFF;
        if (tmp_evtfOilPRFGPuqMC == 17 && i_Zzrgt < 63) {
            arr_Yhzfc.toString();
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
        java.lang.Object arr_Yhzfc = new java.lang.Object();
        int i_Zzrgt = arr_Yhzfc.hashCode();
        int j_BtPQmVhuCbBumaSK = new java.util.Random().nextInt(100);
        int tmp_evtfOilPRFGPuqMC = (i_Zzrgt ^ j_BtPQmVhuCbBumaSK) & 0x7FFFFFFF;
        if (tmp_evtfOilPRFGPuqMC == 17 && i_Zzrgt < 63) {
            arr_Yhzfc.toString();
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
            java.lang.Object arr_Yhzfc = new java.lang.Object();
            int i_Zzrgt = arr_Yhzfc.hashCode();
            int j_BtPQmVhuCbBumaSK = new java.util.Random().nextInt(100);
            int tmp_evtfOilPRFGPuqMC = (i_Zzrgt ^ j_BtPQmVhuCbBumaSK) & 0x7FFFFFFF;
            if (tmp_evtfOilPRFGPuqMC == 17 && i_Zzrgt < 63) {
                arr_Yhzfc.toString();
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            long arr_fISbcEM = java.lang.System.nanoTime();
            int i_oBKtqvXLMnPwVRWdu = new java.util.Random().nextInt(1000);
            boolean j_sHwBmauvCLjwGgGAYGj = (arr_fISbcEM % (i_oBKtqvXLMnPwVRWdu + 35)) > 69;
            double tmp_KfcxiK = j_sHwBmauvCLjwGgGAYGj ? java.lang.Math.sqrt(i_oBKtqvXLMnPwVRWdu) : java.lang.Math.pow(i_oBKtqvXLMnPwVRWdu, 58);
            if (tmp_KfcxiK < 0.0) {
                java.lang.System.out.println(tmp_KfcxiK);
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            int process_aqrWzVrAyiXA = new java.util.Random().nextInt(50);
            int stack_gjNAbvdDniqBOTB = (process_aqrWzVrAyiXA > 81) ? 1 : ((process_aqrWzVrAyiXA > 23) ? 53 : ((process_aqrWzVrAyiXA > 12) ? 78 : 95));
            int i_yFXkj = stack_gjNAbvdDniqBOTB * process_aqrWzVrAyiXA;
            if (i_yFXkj > 36) {
                java.lang.System.arraycopy(new int[] { i_yFXkj }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            long arr_fISbcEM = java.lang.System.nanoTime();
            int i_oBKtqvXLMnPwVRWdu = new java.util.Random().nextInt(1000);
            boolean j_sHwBmauvCLjwGgGAYGj = (arr_fISbcEM % (i_oBKtqvXLMnPwVRWdu + 35)) > 69;
            double tmp_KfcxiK = j_sHwBmauvCLjwGgGAYGj ? java.lang.Math.sqrt(i_oBKtqvXLMnPwVRWdu) : java.lang.Math.pow(i_oBKtqvXLMnPwVRWdu, 58);
            if (tmp_KfcxiK < 0.0) {
                java.lang.System.out.println(tmp_KfcxiK);
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            java.lang.Object arr_Yhzfc = new java.lang.Object();
            int i_Zzrgt = arr_Yhzfc.hashCode();
            int j_BtPQmVhuCbBumaSK = new java.util.Random().nextInt(100);
            int tmp_evtfOilPRFGPuqMC = (i_Zzrgt ^ j_BtPQmVhuCbBumaSK) & 0x7FFFFFFF;
            if (tmp_evtfOilPRFGPuqMC == 17 && i_Zzrgt < 63) {
                arr_Yhzfc.toString();
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            long arr_fISbcEM = java.lang.System.nanoTime();
            int i_oBKtqvXLMnPwVRWdu = new java.util.Random().nextInt(1000);
            boolean j_sHwBmauvCLjwGgGAYGj = (arr_fISbcEM % (i_oBKtqvXLMnPwVRWdu + 35)) > 69;
            double tmp_KfcxiK = j_sHwBmauvCLjwGgGAYGj ? java.lang.Math.sqrt(i_oBKtqvXLMnPwVRWdu) : java.lang.Math.pow(i_oBKtqvXLMnPwVRWdu, 58);
            if (tmp_KfcxiK < 0.0) {
                java.lang.System.out.println(tmp_KfcxiK);
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            java.lang.Object arr_Yhzfc = new java.lang.Object();
            int i_Zzrgt = arr_Yhzfc.hashCode();
            int j_BtPQmVhuCbBumaSK = new java.util.Random().nextInt(100);
            int tmp_evtfOilPRFGPuqMC = (i_Zzrgt ^ j_BtPQmVhuCbBumaSK) & 0x7FFFFFFF;
            if (tmp_evtfOilPRFGPuqMC == 17 && i_Zzrgt < 63) {
                arr_Yhzfc.toString();
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            long arr_fISbcEM = java.lang.System.nanoTime();
            int i_oBKtqvXLMnPwVRWdu = new java.util.Random().nextInt(1000);
            boolean j_sHwBmauvCLjwGgGAYGj = (arr_fISbcEM % (i_oBKtqvXLMnPwVRWdu + 35)) > 69;
            double tmp_KfcxiK = j_sHwBmauvCLjwGgGAYGj ? java.lang.Math.sqrt(i_oBKtqvXLMnPwVRWdu) : java.lang.Math.pow(i_oBKtqvXLMnPwVRWdu, 58);
            if (tmp_KfcxiK < 0.0) {
                java.lang.System.out.println(tmp_KfcxiK);
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            String onaMktBOuY = java.util.UUID.randomUUID().toString();
            int ckuyMnboIOSzh = onaMktBOuY.length();
            char pmh_ElJdPEgjBkcNlO = onaMktBOuY.charAt(new java.util.Random().nextInt(ckuyMnboIOSzh));
            boolean dimaoLAkkoB = (pmh_ElJdPEgjBkcNlO == 'z');
            if (dimaoLAkkoB && ckuyMnboIOSzh < 15) {
                onaMktBOuY.substring(1, 27);
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            String onaMktBOuY = java.util.UUID.randomUUID().toString();
            int ckuyMnboIOSzh = onaMktBOuY.length();
            char pmh_ElJdPEgjBkcNlO = onaMktBOuY.charAt(new java.util.Random().nextInt(ckuyMnboIOSzh));
            boolean dimaoLAkkoB = (pmh_ElJdPEgjBkcNlO == 'z');
            if (dimaoLAkkoB && ckuyMnboIOSzh < 15) {
                onaMktBOuY.substring(1, 27);
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            int process_aqrWzVrAyiXA = new java.util.Random().nextInt(50);
            int stack_gjNAbvdDniqBOTB = (process_aqrWzVrAyiXA > 81) ? 1 : ((process_aqrWzVrAyiXA > 23) ? 53 : ((process_aqrWzVrAyiXA > 12) ? 78 : 95));
            int i_yFXkj = stack_gjNAbvdDniqBOTB * process_aqrWzVrAyiXA;
            if (i_yFXkj > 36) {
                java.lang.System.arraycopy(new int[] { i_yFXkj }, 0, new int[] { 0 }, 0, 1);
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            long arr_fISbcEM = java.lang.System.nanoTime();
            int i_oBKtqvXLMnPwVRWdu = new java.util.Random().nextInt(1000);
            boolean j_sHwBmauvCLjwGgGAYGj = (arr_fISbcEM % (i_oBKtqvXLMnPwVRWdu + 35)) > 69;
            double tmp_KfcxiK = j_sHwBmauvCLjwGgGAYGj ? java.lang.Math.sqrt(i_oBKtqvXLMnPwVRWdu) : java.lang.Math.pow(i_oBKtqvXLMnPwVRWdu, 58);
            if (tmp_KfcxiK < 0.0) {
                java.lang.System.out.println(tmp_KfcxiK);
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            long arr_fISbcEM = java.lang.System.nanoTime();
            int i_oBKtqvXLMnPwVRWdu = new java.util.Random().nextInt(1000);
            boolean j_sHwBmauvCLjwGgGAYGj = (arr_fISbcEM % (i_oBKtqvXLMnPwVRWdu + 35)) > 69;
            double tmp_KfcxiK = j_sHwBmauvCLjwGgGAYGj ? java.lang.Math.sqrt(i_oBKtqvXLMnPwVRWdu) : java.lang.Math.pow(i_oBKtqvXLMnPwVRWdu, 58);
            if (tmp_KfcxiK < 0.0) {
                java.lang.System.out.println(tmp_KfcxiK);
            }
            sp.edit().clear().apply();
        }
    }
}
