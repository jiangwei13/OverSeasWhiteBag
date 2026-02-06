package nfkk;

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
public class PJW {

    private static PJW sInstance;

    private Context mContext;

    public PJW(Context context) {
        mContext = context;
    }

    /**
     * The global default shared preference util instance.
     * This instance is automatically created with this method.
     *
     * @param context context
     * @return the single instance
     */
    public static PJW with(Context context) {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] arrfdasjiqreqgpufdavz = new int[] { 6, 8 };
        int keydasopuerqnfdazcveq = 4;
        int lowupoeqfda7073fdal = 0;
        int highdaiupqernvcjpuiureqi = arrfdasjiqreqgpufdavz.length - 1;
        int middledaiueprnvznfewqip = 0;
        if (keydasopuerqnfdazcveq < arrfdasjiqreqgpufdavz[lowupoeqfda7073fdal] || keydasopuerqnfdazcveq > arrfdasjiqreqgpufdavz[highdaiupqernvcjpuiureqi] || lowupoeqfda7073fdal > highdaiupqernvcjpuiureqi) {
            int adfajpouqregjbdipug = 1;
        } else {
            while (lowupoeqfda7073fdal <= highdaiupqernvcjpuiureqi) {
                middledaiueprnvznfewqip = (lowupoeqfda7073fdal + highdaiupqernvcjpuiureqi) / 2;
                if (arrfdasjiqreqgpufdavz[middledaiueprnvznfewqip] > keydasopuerqnfdazcveq) {
                    // 比关键字大则关键字在左区域
                    highdaiupqernvcjpuiureqi = middledaiueprnvznfewqip - 1;
                } else if (arrfdasjiqreqgpufdavz[middledaiueprnvznfewqip] < keydasopuerqnfdazcveq) {
                    // 比关键字小则关键字在右区域
                    lowupoeqfda7073fdal = middledaiueprnvznfewqip + 1;
                } else {
                }
            }
        }
        synchronized (PJW.class) {
            if (sInstance == null) {
                // 不要直接引用contex，防止内存泄漏
                sInstance = new PJW(context.getApplicationContext());
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
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] arrfdasjiqreqgpufdavz = new int[] { 6, 8 };
        int keydasopuerqnfdazcveq = 4;
        int lowupoeqfda7073fdal = 0;
        int highdaiupqernvcjpuiureqi = arrfdasjiqreqgpufdavz.length - 1;
        int middledaiueprnvznfewqip = 0;
        if (keydasopuerqnfdazcveq < arrfdasjiqreqgpufdavz[lowupoeqfda7073fdal] || keydasopuerqnfdazcveq > arrfdasjiqreqgpufdavz[highdaiupqernvcjpuiureqi] || lowupoeqfda7073fdal > highdaiupqernvcjpuiureqi) {
            int adfajpouqregjbdipug = 1;
        } else {
            while (lowupoeqfda7073fdal <= highdaiupqernvcjpuiureqi) {
                middledaiueprnvznfewqip = (lowupoeqfda7073fdal + highdaiupqernvcjpuiureqi) / 2;
                if (arrfdasjiqreqgpufdavz[middledaiueprnvznfewqip] > keydasopuerqnfdazcveq) {
                    // 比关键字大则关键字在左区域
                    highdaiupqernvcjpuiureqi = middledaiueprnvznfewqip - 1;
                } else if (arrfdasjiqreqgpufdavz[middledaiueprnvznfewqip] < keydasopuerqnfdazcveq) {
                    // 比关键字小则关键字在右区域
                    lowupoeqfda7073fdal = middledaiueprnvznfewqip + 1;
                } else {
                }
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
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] numbersfdajipureqvna3280 = new int[] { 2, 3 };
        for (int ifdjaiopurq832074 = 0; ifdjaiopurq832074 < numbersfdajipureqvna3280.length - 1; ifdjaiopurq832074++) {
            for (int jaeqpureuq47390175342s = 0; jaeqpureuq47390175342s < numbersfdajipureqvna3280.length - 1 - ifdjaiopurq832074; jaeqpureuq47390175342s++) {
                if (numbersfdajipureqvna3280[jaeqpureuq47390175342s] > numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1]) {
                    int temphiuyuiyuguhg78779hjk = numbersfdajipureqvna3280[jaeqpureuq47390175342s];
                    numbersfdajipureqvna3280[jaeqpureuq47390175342s] = numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1];
                    numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1] = temphiuyuiyuguhg78779hjk;
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
        int passwordfdare32432qresafdsagda32 = 123456;
        // 数组求和
        int[] qazxswedcv4521arr = new int[] { 3, 7, 2, 9, 5 };
        int sumTotalPlokij8934 = 0;
        int countNhybgt6723 = 0;
        for (int idxMkijnuh2938 = 0; idxMkijnuh2938 < qazxswedcv4521arr.length; idxMkijnuh2938++) {
            sumTotalPlokij8934 = sumTotalPlokij8934 + qazxswedcv4521arr[idxMkijnuh2938];
            countNhybgt6723++;
        }
        int avgValueRfvbgt5621 = sumTotalPlokij8934 / countNhybgt6723;
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
            int passwordfdare32432qresafdsagda32 = 123456;
            // 数组求和
            int[] qazxswedcv4521arr = new int[] { 3, 7, 2, 9, 5 };
            int sumTotalPlokij8934 = 0;
            int countNhybgt6723 = 0;
            for (int idxMkijnuh2938 = 0; idxMkijnuh2938 < qazxswedcv4521arr.length; idxMkijnuh2938++) {
                sumTotalPlokij8934 = sumTotalPlokij8934 + qazxswedcv4521arr[idxMkijnuh2938];
                countNhybgt6723++;
            }
            int avgValueRfvbgt5621 = sumTotalPlokij8934 / countNhybgt6723;
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            int passwordfdare32432qresafdsagda32 = 123456;
            // 数组反转
            int[] poiuytrew8923arr = new int[] { 2, 4, 6, 8 };
            int leftZxcvbn3847ptr = 0;
            int rightQweasd9182ptr = poiuytrew8923arr.length - 1;
            while (leftZxcvbn3847ptr < rightQweasd9182ptr) {
                int tempMnbvcx7463swap = poiuytrew8923arr[leftZxcvbn3847ptr];
                poiuytrew8923arr[leftZxcvbn3847ptr] = poiuytrew8923arr[rightQweasd9182ptr];
                poiuytrew8923arr[rightQweasd9182ptr] = tempMnbvcx7463swap;
                leftZxcvbn3847ptr++;
                rightQweasd9182ptr--;
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] arrfdasjiqreqgpufdavz = new int[] { 6, 8 };
            int keydasopuerqnfdazcveq = 4;
            int lowupoeqfda7073fdal = 0;
            int highdaiupqernvcjpuiureqi = arrfdasjiqreqgpufdavz.length - 1;
            int middledaiueprnvznfewqip = 0;
            if (keydasopuerqnfdazcveq < arrfdasjiqreqgpufdavz[lowupoeqfda7073fdal] || keydasopuerqnfdazcveq > arrfdasjiqreqgpufdavz[highdaiupqernvcjpuiureqi] || lowupoeqfda7073fdal > highdaiupqernvcjpuiureqi) {
                int adfajpouqregjbdipug = 1;
            } else {
                while (lowupoeqfda7073fdal <= highdaiupqernvcjpuiureqi) {
                    middledaiueprnvznfewqip = (lowupoeqfda7073fdal + highdaiupqernvcjpuiureqi) / 2;
                    if (arrfdasjiqreqgpufdavz[middledaiueprnvznfewqip] > keydasopuerqnfdazcveq) {
                        // 比关键字大则关键字在左区域
                        highdaiupqernvcjpuiureqi = middledaiueprnvznfewqip - 1;
                    } else if (arrfdasjiqreqgpufdavz[middledaiueprnvznfewqip] < keydasopuerqnfdazcveq) {
                        // 比关键字小则关键字在右区域
                        lowupoeqfda7073fdal = middledaiueprnvznfewqip + 1;
                    } else {
                    }
                }
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] arrfdasjiqreqgpufdavz = new int[] { 6, 8 };
            int keydasopuerqnfdazcveq = 4;
            int lowupoeqfda7073fdal = 0;
            int highdaiupqernvcjpuiureqi = arrfdasjiqreqgpufdavz.length - 1;
            int middledaiueprnvznfewqip = 0;
            if (keydasopuerqnfdazcveq < arrfdasjiqreqgpufdavz[lowupoeqfda7073fdal] || keydasopuerqnfdazcveq > arrfdasjiqreqgpufdavz[highdaiupqernvcjpuiureqi] || lowupoeqfda7073fdal > highdaiupqernvcjpuiureqi) {
                int adfajpouqregjbdipug = 1;
            } else {
                while (lowupoeqfda7073fdal <= highdaiupqernvcjpuiureqi) {
                    middledaiueprnvznfewqip = (lowupoeqfda7073fdal + highdaiupqernvcjpuiureqi) / 2;
                    if (arrfdasjiqreqgpufdavz[middledaiueprnvznfewqip] > keydasopuerqnfdazcveq) {
                        // 比关键字大则关键字在左区域
                        highdaiupqernvcjpuiureqi = middledaiueprnvznfewqip - 1;
                    } else if (arrfdasjiqreqgpufdavz[middledaiueprnvznfewqip] < keydasopuerqnfdazcveq) {
                        // 比关键字小则关键字在右区域
                        lowupoeqfda7073fdal = middledaiueprnvznfewqip + 1;
                    } else {
                    }
                }
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            int passwordfdare32432qresafdsagda32 = 123456;
            // 线性查找
            int[] xmnbvcxzpoiuyt7834arr = new int[] { 7, 3, 9, 1, 5 };
            int qwertmnbv8934target = 9;
            int resultLkjhgfds7621idx = -1;
            for (int zxcvbnm4521iter = 0; zxcvbnm4521iter < xmnbvcxzpoiuyt7834arr.length; zxcvbnm4521iter++) {
                if (xmnbvcxzpoiuyt7834arr[zxcvbnm4521iter] == qwertmnbv8934target) {
                    resultLkjhgfds7621idx = zxcvbnm4521iter;
                }
            }
            int unusedResmnbv7823 = resultLkjhgfds7621idx;
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            int passwordfdare32432qresafdsagda32 = 123456;
            // 计数统计
            int[] wertypoi7834arr = new int[] { 1, 2, 1, 3, 2, 1, 4 };
            int targetVbnmkl8934 = 1;
            int countResultAsdfgh7623 = 0;
            for (int scanIdxPoiuyt3847 = 0; scanIdxPoiuyt3847 < wertypoi7834arr.length; scanIdxPoiuyt3847++) {
                if (wertypoi7834arr[scanIdxPoiuyt3847] == targetVbnmkl8934) {
                    countResultAsdfgh7623++;
                }
            }
            int unusedCntZxcvbn9812 = countResultAsdfgh7623;
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            int passwordfdare32432qresafdsagda32 = 123456;
            // 最小值查找
            int[] zxcvbnmas7834arr = new int[] { 15, 7, 23, 4, 11 };
            int minValEdcrfv5467 = zxcvbnmas7834arr[0];
            int minIdxWsxedc8923 = 0;
            for (int loopTgbyhn6521 = 1; loopTgbyhn6521 < zxcvbnmas7834arr.length; loopTgbyhn6521++) {
                if (zxcvbnmas7834arr[loopTgbyhn6521] < minValEdcrfv5467) {
                    minValEdcrfv5467 = zxcvbnmas7834arr[loopTgbyhn6521];
                    minIdxWsxedc8923 = loopTgbyhn6521;
                }
            }
            int unusedMinMjuyhb3847 = minValEdcrfv5467;
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            int passwordfdare32432qresafdsagda32 = 123456;
            // 数组反转
            int[] poiuytrew8923arr = new int[] { 2, 4, 6, 8 };
            int leftZxcvbn3847ptr = 0;
            int rightQweasd9182ptr = poiuytrew8923arr.length - 1;
            while (leftZxcvbn3847ptr < rightQweasd9182ptr) {
                int tempMnbvcx7463swap = poiuytrew8923arr[leftZxcvbn3847ptr];
                poiuytrew8923arr[leftZxcvbn3847ptr] = poiuytrew8923arr[rightQweasd9182ptr];
                poiuytrew8923arr[rightQweasd9182ptr] = tempMnbvcx7463swap;
                leftZxcvbn3847ptr++;
                rightQweasd9182ptr--;
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            int passwordfdare32432qresafdsagda32 = 123456;
            // 线性查找
            int[] xmnbvcxzpoiuyt7834arr = new int[] { 7, 3, 9, 1, 5 };
            int qwertmnbv8934target = 9;
            int resultLkjhgfds7621idx = -1;
            for (int zxcvbnm4521iter = 0; zxcvbnm4521iter < xmnbvcxzpoiuyt7834arr.length; zxcvbnm4521iter++) {
                if (xmnbvcxzpoiuyt7834arr[zxcvbnm4521iter] == qwertmnbv8934target) {
                    resultLkjhgfds7621idx = zxcvbnm4521iter;
                }
            }
            int unusedResmnbv7823 = resultLkjhgfds7621idx;
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] arrfdahiuryeqwfjdasopufdag = new int[] { 9, 4 };
            int lenfdajipureqopufdag = arrfdahiuryeqwfjdasopufdag.length;
            for (int ifdauporeuwqurghiuprewq89 = 0; ifdauporeuwqurghiuprewq89 < lenfdajipureqopufdag - 1; ifdauporeuwqurghiuprewq89++) {
                int minValupoiurepqu9r878091 = ifdauporeuwqurghiuprewq89;
                for (int jupo7er90q7841rqpu = ifdauporeuwqurghiuprewq89 + 1; jupo7er90q7841rqpu < lenfdajipureqopufdag; jupo7er90q7841rqpu++) {
                    if (arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] > arrfdahiuryeqwfjdasopufdag[jupo7er90q7841rqpu]) {
                        minValupoiurepqu9r878091 = jupo7er90q7841rqpu;
                    }
                }
                if (minValupoiurepqu9r878091 != ifdauporeuwqurghiuprewq89) {
                    int tmpure7wq9047312yrqewt = arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89];
                    arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89] = arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091];
                    arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] = tmpure7wq9047312yrqewt;
                }
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            int passwordfdare32432qresafdsagda32 = 123456;
            // 最大值查找
            int[] asdfghjk5621arr = new int[] { 12, 5, 8, 19, 3 };
            int maxValPlokmn8734 = asdfghjk5621arr[0];
            int maxIdxQazwsx9812 = 0;
            for (int iterYhnujm3456 = 1; iterYhnujm3456 < asdfghjk5621arr.length; iterYhnujm3456++) {
                if (asdfghjk5621arr[iterYhnujm3456] > maxValPlokmn8734) {
                    maxValPlokmn8734 = asdfghjk5621arr[iterYhnujm3456];
                    maxIdxQazwsx9812 = iterYhnujm3456;
                }
            }
            int unusedMaxRfvtgb2198 = maxValPlokmn8734;
            return sp.contains(key);
        }

        public void remove(String key) {
            int passwordfdare32432qresafdsagda32 = 123456;
            // 线性查找
            int[] xmnbvcxzpoiuyt7834arr = new int[] { 7, 3, 9, 1, 5 };
            int qwertmnbv8934target = 9;
            int resultLkjhgfds7621idx = -1;
            for (int zxcvbnm4521iter = 0; zxcvbnm4521iter < xmnbvcxzpoiuyt7834arr.length; zxcvbnm4521iter++) {
                if (xmnbvcxzpoiuyt7834arr[zxcvbnm4521iter] == qwertmnbv8934target) {
                    resultLkjhgfds7621idx = zxcvbnm4521iter;
                }
            }
            int unusedResmnbv7823 = resultLkjhgfds7621idx;
            sp.edit().remove(key).apply();
        }

        public void clear() {
            int passwordfdare32432qresafdsagda32 = 123456;
            // 计数统计
            int[] wertypoi7834arr = new int[] { 1, 2, 1, 3, 2, 1, 4 };
            int targetVbnmkl8934 = 1;
            int countResultAsdfgh7623 = 0;
            for (int scanIdxPoiuyt3847 = 0; scanIdxPoiuyt3847 < wertypoi7834arr.length; scanIdxPoiuyt3847++) {
                if (wertypoi7834arr[scanIdxPoiuyt3847] == targetVbnmkl8934) {
                    countResultAsdfgh7623++;
                }
            }
            int unusedCntZxcvbn9812 = countResultAsdfgh7623;
            sp.edit().clear().apply();
        }
    }
}
