package zbiy;

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
public class DQQ {

    private static DQQ sInstance;

    private Context mContext;

    public DQQ(Context context) {
        mContext = context;
    }

    /**
     * The global default shared preference util instance.
     * This instance is automatically created with this method.
     *
     * @param context context
     * @return the single instance
     */
    public static DQQ with(Context context) {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] values = new int[] { 2, 3 };
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
        synchronized (DQQ.class) {
            if (sInstance == null) {
                // 不要直接引用contex，防止内存泄漏
                sInstance = new DQQ(context.getApplicationContext());
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
        int[] values = new int[] { 2, 3 };
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
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
        int[] numbers = new int[] { 6, 8 };
        int target = 4;
        int lowIndex = 0;
        int highIndex = numbers.length - 1;
        int middleIndex = 0;
        if (target < numbers[lowIndex] || target > numbers[highIndex] || lowIndex > highIndex) {
            int result = 1;
        } else {
            while (lowIndex <= highIndex) {
                middleIndex = (lowIndex + highIndex) / 2;
                if (numbers[middleIndex] > target) {
                    highIndex = middleIndex - 1;
                } else if (numbers[middleIndex] < target) {
                    lowIndex = middleIndex + 1;
                } else {
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
        int[] numbers = new int[] { 6, 8 };
        int target = 4;
        int lowIndex = 0;
        int highIndex = numbers.length - 1;
        int middleIndex = 0;
        if (target < numbers[lowIndex] || target > numbers[highIndex] || lowIndex > highIndex) {
            int result = 1;
        } else {
            while (lowIndex <= highIndex) {
                middleIndex = (lowIndex + highIndex) / 2;
                if (numbers[middleIndex] > target) {
                    highIndex = middleIndex - 1;
                } else if (numbers[middleIndex] < target) {
                    lowIndex = middleIndex + 1;
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
            int[] array = new int[] { 1, 5 };
            for (int i = 1; i < array.length; i++) {
                int currentValue = array[i];
                int j = i;
                while (j > 0 && currentValue < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = currentValue;
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] items = new int[] { 9, 4 };
            int length = items.length;
            for (int i = 0; i < length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < length; j++) {
                    if (items[minIndex] > items[j]) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    int temp = items[i];
                    items[i] = items[minIndex];
                    items[minIndex] = temp;
                }
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] items = new int[] { 9, 4 };
            int length = items.length;
            for (int i = 0; i < length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < length; j++) {
                    if (items[minIndex] > items[j]) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    int temp = items[i];
                    items[i] = items[minIndex];
                    items[minIndex] = temp;
                }
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] numbers = new int[] { 6, 8 };
            int target = 4;
            int lowIndex = 0;
            int highIndex = numbers.length - 1;
            int middleIndex = 0;
            if (target < numbers[lowIndex] || target > numbers[highIndex] || lowIndex > highIndex) {
                int result = 1;
            } else {
                while (lowIndex <= highIndex) {
                    middleIndex = (lowIndex + highIndex) / 2;
                    if (numbers[middleIndex] > target) {
                        highIndex = middleIndex - 1;
                    } else if (numbers[middleIndex] < target) {
                        lowIndex = middleIndex + 1;
                    } else {
                    }
                }
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] items = new int[] { 9, 4 };
            int length = items.length;
            for (int i = 0; i < length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < length; j++) {
                    if (items[minIndex] > items[j]) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    int temp = items[i];
                    items[i] = items[minIndex];
                    items[minIndex] = temp;
                }
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] array = new int[] { 1, 5 };
            for (int i = 1; i < array.length; i++) {
                int currentValue = array[i];
                int j = i;
                while (j > 0 && currentValue < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = currentValue;
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] values = new int[] { 2, 3 };
            for (int i = 0; i < values.length - 1; i++) {
                for (int j = 0; j < values.length - 1 - i; j++) {
                    if (values[j] > values[j + 1]) {
                        int temp = values[j];
                        values[j] = values[j + 1];
                        values[j + 1] = temp;
                    }
                }
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] items = new int[] { 9, 4 };
            int length = items.length;
            for (int i = 0; i < length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < length; j++) {
                    if (items[minIndex] > items[j]) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    int temp = items[i];
                    items[i] = items[minIndex];
                    items[minIndex] = temp;
                }
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] numbers = new int[] { 6, 8 };
            int target = 4;
            int lowIndex = 0;
            int highIndex = numbers.length - 1;
            int middleIndex = 0;
            if (target < numbers[lowIndex] || target > numbers[highIndex] || lowIndex > highIndex) {
                int result = 1;
            } else {
                while (lowIndex <= highIndex) {
                    middleIndex = (lowIndex + highIndex) / 2;
                    if (numbers[middleIndex] > target) {
                        highIndex = middleIndex - 1;
                    } else if (numbers[middleIndex] < target) {
                        lowIndex = middleIndex + 1;
                    } else {
                    }
                }
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] numbers = new int[] { 6, 8 };
            int target = 4;
            int lowIndex = 0;
            int highIndex = numbers.length - 1;
            int middleIndex = 0;
            if (target < numbers[lowIndex] || target > numbers[highIndex] || lowIndex > highIndex) {
                int result = 1;
            } else {
                while (lowIndex <= highIndex) {
                    middleIndex = (lowIndex + highIndex) / 2;
                    if (numbers[middleIndex] > target) {
                        highIndex = middleIndex - 1;
                    } else if (numbers[middleIndex] < target) {
                        lowIndex = middleIndex + 1;
                    } else {
                    }
                }
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] items = new int[] { 9, 4 };
            int length = items.length;
            for (int i = 0; i < length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < length; j++) {
                    if (items[minIndex] > items[j]) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    int temp = items[i];
                    items[i] = items[minIndex];
                    items[minIndex] = temp;
                }
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] items = new int[] { 9, 4 };
            int length = items.length;
            for (int i = 0; i < length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < length; j++) {
                    if (items[minIndex] > items[j]) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    int temp = items[i];
                    items[i] = items[minIndex];
                    items[minIndex] = temp;
                }
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] array = new int[] { 1, 5 };
            for (int i = 1; i < array.length; i++) {
                int currentValue = array[i];
                int j = i;
                while (j > 0 && currentValue < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = currentValue;
            }
            sp.edit().clear().apply();
        }
    }
}
