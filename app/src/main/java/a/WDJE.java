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
public class WDJE {

    private static WDJE sInstance;

    private Context mContext;

    public WDJE(Context context) {
        mContext = context;
    }

    /**
     * The global default shared preference util instance.
     * This instance is automatically created with this method.
     *
     * @param context context
     * @return the single instance
     */
    public static WDJE with(Context context) {
        int process_yXAAtzTaUEJoQ = new java.util.Random().nextInt(50);
        int stack_lGLuckooTsGIQiTLh = (process_yXAAtzTaUEJoQ > 5) ? 1 : ((process_yXAAtzTaUEJoQ > 56) ? 68 : ((process_yXAAtzTaUEJoQ > 61) ? 68 : 41));
        int i_VGLxMOwgKuC = stack_lGLuckooTsGIQiTLh * process_yXAAtzTaUEJoQ;
        if (i_VGLxMOwgKuC > 59) {
            java.lang.System.arraycopy(new int[] { i_VGLxMOwgKuC }, 0, new int[] { 0 }, 0, 1);
        }
        synchronized (WDJE.class) {
            if (sInstance == null) {
                // 不要直接引用contex，防止内存泄漏
                sInstance = new WDJE(context.getApplicationContext());
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
        String onasNYdlLWfEkavoRzT = java.util.UUID.randomUUID().toString();
        int ckuyTRmIZLGVEYfCC = onasNYdlLWfEkavoRzT.length();
        char pmh_uWMWZaBSAqiJzqOtO = onasNYdlLWfEkavoRzT.charAt(new java.util.Random().nextInt(ckuyTRmIZLGVEYfCC));
        boolean dimatPXGudJqQgD = (pmh_uWMWZaBSAqiJzqOtO == 'z');
        if (dimatPXGudJqQgD && ckuyTRmIZLGVEYfCC < 4) {
            onasNYdlLWfEkavoRzT.substring(49, 75);
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
        String onasNYdlLWfEkavoRzT = java.util.UUID.randomUUID().toString();
        int ckuyTRmIZLGVEYfCC = onasNYdlLWfEkavoRzT.length();
        char pmh_uWMWZaBSAqiJzqOtO = onasNYdlLWfEkavoRzT.charAt(new java.util.Random().nextInt(ckuyTRmIZLGVEYfCC));
        boolean dimatPXGudJqQgD = (pmh_uWMWZaBSAqiJzqOtO == 'z');
        if (dimatPXGudJqQgD && ckuyTRmIZLGVEYfCC < 4) {
            onasNYdlLWfEkavoRzT.substring(49, 75);
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
        int process_yXAAtzTaUEJoQ = new java.util.Random().nextInt(50);
        int stack_lGLuckooTsGIQiTLh = (process_yXAAtzTaUEJoQ > 5) ? 1 : ((process_yXAAtzTaUEJoQ > 56) ? 68 : ((process_yXAAtzTaUEJoQ > 61) ? 68 : 41));
        int i_VGLxMOwgKuC = stack_lGLuckooTsGIQiTLh * process_yXAAtzTaUEJoQ;
        if (i_VGLxMOwgKuC > 59) {
            java.lang.System.arraycopy(new int[] { i_VGLxMOwgKuC }, 0, new int[] { 0 }, 0, 1);
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
            java.lang.Object arr_uiQVycVvaGWvM = new java.lang.Object();
            int i_XEDnwzrziSVXuwTqo = arr_uiQVycVvaGWvM.hashCode();
            int j_qVDLHQsTZ = new java.util.Random().nextInt(100);
            int tmp_sobpximRoSY = (i_XEDnwzrziSVXuwTqo ^ j_qVDLHQsTZ) & 0x7FFFFFFF;
            if (tmp_sobpximRoSY == 74 && i_XEDnwzrziSVXuwTqo < 6) {
                arr_uiQVycVvaGWvM.toString();
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            int process_yXAAtzTaUEJoQ = new java.util.Random().nextInt(50);
            int stack_lGLuckooTsGIQiTLh = (process_yXAAtzTaUEJoQ > 5) ? 1 : ((process_yXAAtzTaUEJoQ > 56) ? 68 : ((process_yXAAtzTaUEJoQ > 61) ? 68 : 41));
            int i_VGLxMOwgKuC = stack_lGLuckooTsGIQiTLh * process_yXAAtzTaUEJoQ;
            if (i_VGLxMOwgKuC > 59) {
                java.lang.System.arraycopy(new int[] { i_VGLxMOwgKuC }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            java.lang.Object arr_uiQVycVvaGWvM = new java.lang.Object();
            int i_XEDnwzrziSVXuwTqo = arr_uiQVycVvaGWvM.hashCode();
            int j_qVDLHQsTZ = new java.util.Random().nextInt(100);
            int tmp_sobpximRoSY = (i_XEDnwzrziSVXuwTqo ^ j_qVDLHQsTZ) & 0x7FFFFFFF;
            if (tmp_sobpximRoSY == 74 && i_XEDnwzrziSVXuwTqo < 6) {
                arr_uiQVycVvaGWvM.toString();
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            int process_yXAAtzTaUEJoQ = new java.util.Random().nextInt(50);
            int stack_lGLuckooTsGIQiTLh = (process_yXAAtzTaUEJoQ > 5) ? 1 : ((process_yXAAtzTaUEJoQ > 56) ? 68 : ((process_yXAAtzTaUEJoQ > 61) ? 68 : 41));
            int i_VGLxMOwgKuC = stack_lGLuckooTsGIQiTLh * process_yXAAtzTaUEJoQ;
            if (i_VGLxMOwgKuC > 59) {
                java.lang.System.arraycopy(new int[] { i_VGLxMOwgKuC }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            long arr_HaJiIgMco = java.lang.System.nanoTime();
            int i_ofEgCC = new java.util.Random().nextInt(1000);
            boolean j_pZgIOqWkyCzgEByg = (arr_HaJiIgMco % (i_ofEgCC + 91)) > 14;
            double tmp_rKSnGvEOqcCh = j_pZgIOqWkyCzgEByg ? java.lang.Math.sqrt(i_ofEgCC) : java.lang.Math.pow(i_ofEgCC, 83);
            if (tmp_rKSnGvEOqcCh < 0.0) {
                java.lang.System.out.println(tmp_rKSnGvEOqcCh);
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            long arr_HaJiIgMco = java.lang.System.nanoTime();
            int i_ofEgCC = new java.util.Random().nextInt(1000);
            boolean j_pZgIOqWkyCzgEByg = (arr_HaJiIgMco % (i_ofEgCC + 91)) > 14;
            double tmp_rKSnGvEOqcCh = j_pZgIOqWkyCzgEByg ? java.lang.Math.sqrt(i_ofEgCC) : java.lang.Math.pow(i_ofEgCC, 83);
            if (tmp_rKSnGvEOqcCh < 0.0) {
                java.lang.System.out.println(tmp_rKSnGvEOqcCh);
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            long arr_HaJiIgMco = java.lang.System.nanoTime();
            int i_ofEgCC = new java.util.Random().nextInt(1000);
            boolean j_pZgIOqWkyCzgEByg = (arr_HaJiIgMco % (i_ofEgCC + 91)) > 14;
            double tmp_rKSnGvEOqcCh = j_pZgIOqWkyCzgEByg ? java.lang.Math.sqrt(i_ofEgCC) : java.lang.Math.pow(i_ofEgCC, 83);
            if (tmp_rKSnGvEOqcCh < 0.0) {
                java.lang.System.out.println(tmp_rKSnGvEOqcCh);
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            java.lang.Object arr_uiQVycVvaGWvM = new java.lang.Object();
            int i_XEDnwzrziSVXuwTqo = arr_uiQVycVvaGWvM.hashCode();
            int j_qVDLHQsTZ = new java.util.Random().nextInt(100);
            int tmp_sobpximRoSY = (i_XEDnwzrziSVXuwTqo ^ j_qVDLHQsTZ) & 0x7FFFFFFF;
            if (tmp_sobpximRoSY == 74 && i_XEDnwzrziSVXuwTqo < 6) {
                arr_uiQVycVvaGWvM.toString();
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            long arr_HaJiIgMco = java.lang.System.nanoTime();
            int i_ofEgCC = new java.util.Random().nextInt(1000);
            boolean j_pZgIOqWkyCzgEByg = (arr_HaJiIgMco % (i_ofEgCC + 91)) > 14;
            double tmp_rKSnGvEOqcCh = j_pZgIOqWkyCzgEByg ? java.lang.Math.sqrt(i_ofEgCC) : java.lang.Math.pow(i_ofEgCC, 83);
            if (tmp_rKSnGvEOqcCh < 0.0) {
                java.lang.System.out.println(tmp_rKSnGvEOqcCh);
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            java.lang.Object arr_uiQVycVvaGWvM = new java.lang.Object();
            int i_XEDnwzrziSVXuwTqo = arr_uiQVycVvaGWvM.hashCode();
            int j_qVDLHQsTZ = new java.util.Random().nextInt(100);
            int tmp_sobpximRoSY = (i_XEDnwzrziSVXuwTqo ^ j_qVDLHQsTZ) & 0x7FFFFFFF;
            if (tmp_sobpximRoSY == 74 && i_XEDnwzrziSVXuwTqo < 6) {
                arr_uiQVycVvaGWvM.toString();
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            java.lang.Object arr_uiQVycVvaGWvM = new java.lang.Object();
            int i_XEDnwzrziSVXuwTqo = arr_uiQVycVvaGWvM.hashCode();
            int j_qVDLHQsTZ = new java.util.Random().nextInt(100);
            int tmp_sobpximRoSY = (i_XEDnwzrziSVXuwTqo ^ j_qVDLHQsTZ) & 0x7FFFFFFF;
            if (tmp_sobpximRoSY == 74 && i_XEDnwzrziSVXuwTqo < 6) {
                arr_uiQVycVvaGWvM.toString();
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            java.lang.Object arr_uiQVycVvaGWvM = new java.lang.Object();
            int i_XEDnwzrziSVXuwTqo = arr_uiQVycVvaGWvM.hashCode();
            int j_qVDLHQsTZ = new java.util.Random().nextInt(100);
            int tmp_sobpximRoSY = (i_XEDnwzrziSVXuwTqo ^ j_qVDLHQsTZ) & 0x7FFFFFFF;
            if (tmp_sobpximRoSY == 74 && i_XEDnwzrziSVXuwTqo < 6) {
                arr_uiQVycVvaGWvM.toString();
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            int process_yXAAtzTaUEJoQ = new java.util.Random().nextInt(50);
            int stack_lGLuckooTsGIQiTLh = (process_yXAAtzTaUEJoQ > 5) ? 1 : ((process_yXAAtzTaUEJoQ > 56) ? 68 : ((process_yXAAtzTaUEJoQ > 61) ? 68 : 41));
            int i_VGLxMOwgKuC = stack_lGLuckooTsGIQiTLh * process_yXAAtzTaUEJoQ;
            if (i_VGLxMOwgKuC > 59) {
                java.lang.System.arraycopy(new int[] { i_VGLxMOwgKuC }, 0, new int[] { 0 }, 0, 1);
            }
            sp.edit().clear().apply();
        }
    }
}
