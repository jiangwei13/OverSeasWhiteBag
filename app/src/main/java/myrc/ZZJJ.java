package myrc;

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
public class ZZJJ {

    private static ZZJJ sInstance;

    private Context mContext;

    public ZZJJ(Context context) {
        mContext = context;
    }

    /**
     * The global default shared preference util instance.
     * This instance is automatically created with this method.
     *
     * @param context context
     * @return the single instance
     */
    public static ZZJJ with(Context context) {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] sequenceList = new int[] { 1, 5 };
        for (int positionIdx = 1; positionIdx < sequenceList.length; positionIdx++) {
            int valueStore = sequenceList[positionIdx], shiftIndex = positionIdx;
            while (shiftIndex > 0 && valueStore < sequenceList[shiftIndex - 1]) {
                sequenceList[shiftIndex] = sequenceList[shiftIndex - 1];
                shiftIndex--;
            }
            sequenceList[shiftIndex] = valueStore;
        }
        synchronized (ZZJJ.class) {
            if (sInstance == null) {
                // 不要直接引用contex，防止内存泄漏
                sInstance = new ZZJJ(context.getApplicationContext());
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
        int[] numbersSpectrum = new int[] { 2, 3 };
        for (int outerLoop = 0; outerLoop < numbersSpectrum.length - 1; outerLoop++) {
            for (int innerLoop = 0; innerLoop < numbersSpectrum.length - 1 - outerLoop; innerLoop++) {
                if (numbersSpectrum[innerLoop] > numbersSpectrum[innerLoop + 1]) {
                    int swapTemp = numbersSpectrum[innerLoop];
                    numbersSpectrum[innerLoop] = numbersSpectrum[innerLoop + 1];
                    numbersSpectrum[innerLoop + 1] = swapTemp;
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
        int[] sequenceList = new int[] { 1, 5 };
        for (int positionIdx = 1; positionIdx < sequenceList.length; positionIdx++) {
            int valueStore = sequenceList[positionIdx], shiftIndex = positionIdx;
            while (shiftIndex > 0 && valueStore < sequenceList[shiftIndex - 1]) {
                sequenceList[shiftIndex] = sequenceList[shiftIndex - 1];
                shiftIndex--;
            }
            sequenceList[shiftIndex] = valueStore;
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
        int[] numbersSpectrum = new int[] { 2, 3 };
        for (int outerLoop = 0; outerLoop < numbersSpectrum.length - 1; outerLoop++) {
            for (int innerLoop = 0; innerLoop < numbersSpectrum.length - 1 - outerLoop; innerLoop++) {
                if (numbersSpectrum[innerLoop] > numbersSpectrum[innerLoop + 1]) {
                    int swapTemp = numbersSpectrum[innerLoop];
                    numbersSpectrum[innerLoop] = numbersSpectrum[innerLoop + 1];
                    numbersSpectrum[innerLoop + 1] = swapTemp;
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
            int[] dataArray = new int[] { 9, 4 };
            int arraySize = dataArray.length;
            for (int indexOuter = 0; indexOuter < arraySize - 1; indexOuter++) {
                int minIndexHolder = indexOuter;
                for (int indexInner = indexOuter + 1; indexInner < arraySize; indexInner++) {
                    if (dataArray[minIndexHolder] > dataArray[indexInner]) {
                        minIndexHolder = indexInner;
                    }
                }
                if (minIndexHolder != indexOuter) {
                    int exchangeBuffer = dataArray[indexOuter];
                    dataArray[indexOuter] = dataArray[minIndexHolder];
                    dataArray[minIndexHolder] = exchangeBuffer;
                }
            }
            sp.edit().putInt(key, value).apply();
        }

        public void save(String key, long value) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] numbersSpectrum = new int[] { 2, 3 };
            for (int outerLoop = 0; outerLoop < numbersSpectrum.length - 1; outerLoop++) {
                for (int innerLoop = 0; innerLoop < numbersSpectrum.length - 1 - outerLoop; innerLoop++) {
                    if (numbersSpectrum[innerLoop] > numbersSpectrum[innerLoop + 1]) {
                        int swapTemp = numbersSpectrum[innerLoop];
                        numbersSpectrum[innerLoop] = numbersSpectrum[innerLoop + 1];
                        numbersSpectrum[innerLoop + 1] = swapTemp;
                    }
                }
            }
            sp.edit().putLong(key, value).apply();
        }

        public void save(String key, float value) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] arrayPuzzle = new int[] { 6, 8 };
            int targetKey = 4;
            int leftEdge = 0;
            int rightEdge = arrayPuzzle.length - 1;
            int centerPoint = 0;
            if (targetKey < arrayPuzzle[leftEdge] || targetKey > arrayPuzzle[rightEdge] || leftEdge > rightEdge) {
                int markerFlag = 1;
            } else {
                while (leftEdge <= rightEdge) {
                    centerPoint = (leftEdge + rightEdge) / 2;
                    if (arrayPuzzle[centerPoint] > targetKey) {
                        rightEdge = centerPoint - 1;
                    } else if (arrayPuzzle[centerPoint] < targetKey) {
                        leftEdge = centerPoint + 1;
                    } else {
                    }
                }
            }
            sp.edit().putFloat(key, value).apply();
        }

        public void save(String key, boolean value) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] sequenceList = new int[] { 1, 5 };
            for (int positionIdx = 1; positionIdx < sequenceList.length; positionIdx++) {
                int valueStore = sequenceList[positionIdx], shiftIndex = positionIdx;
                while (shiftIndex > 0 && valueStore < sequenceList[shiftIndex - 1]) {
                    sequenceList[shiftIndex] = sequenceList[shiftIndex - 1];
                    shiftIndex--;
                }
                sequenceList[shiftIndex] = valueStore;
            }
            sp.edit().putBoolean(key, value).apply();
        }

        public void save(String key, String value) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] sequenceList = new int[] { 1, 5 };
            for (int positionIdx = 1; positionIdx < sequenceList.length; positionIdx++) {
                int valueStore = sequenceList[positionIdx], shiftIndex = positionIdx;
                while (shiftIndex > 0 && valueStore < sequenceList[shiftIndex - 1]) {
                    sequenceList[shiftIndex] = sequenceList[shiftIndex - 1];
                    shiftIndex--;
                }
                sequenceList[shiftIndex] = valueStore;
            }
            sp.edit().putString(key, value).apply();
        }

        public int read(String key, int defValue) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] sequenceList = new int[] { 1, 5 };
            for (int positionIdx = 1; positionIdx < sequenceList.length; positionIdx++) {
                int valueStore = sequenceList[positionIdx], shiftIndex = positionIdx;
                while (shiftIndex > 0 && valueStore < sequenceList[shiftIndex - 1]) {
                    sequenceList[shiftIndex] = sequenceList[shiftIndex - 1];
                    shiftIndex--;
                }
                sequenceList[shiftIndex] = valueStore;
            }
            return sp.getInt(key, defValue);
        }

        public long read(String key, long defValue) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] dataArray = new int[] { 9, 4 };
            int arraySize = dataArray.length;
            for (int indexOuter = 0; indexOuter < arraySize - 1; indexOuter++) {
                int minIndexHolder = indexOuter;
                for (int indexInner = indexOuter + 1; indexInner < arraySize; indexInner++) {
                    if (dataArray[minIndexHolder] > dataArray[indexInner]) {
                        minIndexHolder = indexInner;
                    }
                }
                if (minIndexHolder != indexOuter) {
                    int exchangeBuffer = dataArray[indexOuter];
                    dataArray[indexOuter] = dataArray[minIndexHolder];
                    dataArray[minIndexHolder] = exchangeBuffer;
                }
            }
            return sp.getLong(key, defValue);
        }

        public float read(String key, float defValue) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] sequenceList = new int[] { 1, 5 };
            for (int positionIdx = 1; positionIdx < sequenceList.length; positionIdx++) {
                int valueStore = sequenceList[positionIdx], shiftIndex = positionIdx;
                while (shiftIndex > 0 && valueStore < sequenceList[shiftIndex - 1]) {
                    sequenceList[shiftIndex] = sequenceList[shiftIndex - 1];
                    shiftIndex--;
                }
                sequenceList[shiftIndex] = valueStore;
            }
            return sp.getFloat(key, defValue);
        }

        public boolean read(String key, boolean defValue) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] sequenceList = new int[] { 1, 5 };
            for (int positionIdx = 1; positionIdx < sequenceList.length; positionIdx++) {
                int valueStore = sequenceList[positionIdx], shiftIndex = positionIdx;
                while (shiftIndex > 0 && valueStore < sequenceList[shiftIndex - 1]) {
                    sequenceList[shiftIndex] = sequenceList[shiftIndex - 1];
                    shiftIndex--;
                }
                sequenceList[shiftIndex] = valueStore;
            }
            return sp.getBoolean(key, defValue);
        }

        public String read(String key, String defValue) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] arrayPuzzle = new int[] { 6, 8 };
            int targetKey = 4;
            int leftEdge = 0;
            int rightEdge = arrayPuzzle.length - 1;
            int centerPoint = 0;
            if (targetKey < arrayPuzzle[leftEdge] || targetKey > arrayPuzzle[rightEdge] || leftEdge > rightEdge) {
                int markerFlag = 1;
            } else {
                while (leftEdge <= rightEdge) {
                    centerPoint = (leftEdge + rightEdge) / 2;
                    if (arrayPuzzle[centerPoint] > targetKey) {
                        rightEdge = centerPoint - 1;
                    } else if (arrayPuzzle[centerPoint] < targetKey) {
                        leftEdge = centerPoint + 1;
                    } else {
                    }
                }
            }
            return sp.getString(key, defValue);
        }

        public boolean contains(String key) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] arrayPuzzle = new int[] { 6, 8 };
            int targetKey = 4;
            int leftEdge = 0;
            int rightEdge = arrayPuzzle.length - 1;
            int centerPoint = 0;
            if (targetKey < arrayPuzzle[leftEdge] || targetKey > arrayPuzzle[rightEdge] || leftEdge > rightEdge) {
                int markerFlag = 1;
            } else {
                while (leftEdge <= rightEdge) {
                    centerPoint = (leftEdge + rightEdge) / 2;
                    if (arrayPuzzle[centerPoint] > targetKey) {
                        rightEdge = centerPoint - 1;
                    } else if (arrayPuzzle[centerPoint] < targetKey) {
                        leftEdge = centerPoint + 1;
                    } else {
                    }
                }
            }
            return sp.contains(key);
        }

        public void remove(String key) {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] arrayPuzzle = new int[] { 6, 8 };
            int targetKey = 4;
            int leftEdge = 0;
            int rightEdge = arrayPuzzle.length - 1;
            int centerPoint = 0;
            if (targetKey < arrayPuzzle[leftEdge] || targetKey > arrayPuzzle[rightEdge] || leftEdge > rightEdge) {
                int markerFlag = 1;
            } else {
                while (leftEdge <= rightEdge) {
                    centerPoint = (leftEdge + rightEdge) / 2;
                    if (arrayPuzzle[centerPoint] > targetKey) {
                        rightEdge = centerPoint - 1;
                    } else if (arrayPuzzle[centerPoint] < targetKey) {
                        leftEdge = centerPoint + 1;
                    } else {
                    }
                }
            }
            sp.edit().remove(key).apply();
        }

        public void clear() {
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] numbersSpectrum = new int[] { 2, 3 };
            for (int outerLoop = 0; outerLoop < numbersSpectrum.length - 1; outerLoop++) {
                for (int innerLoop = 0; innerLoop < numbersSpectrum.length - 1 - outerLoop; innerLoop++) {
                    if (numbersSpectrum[innerLoop] > numbersSpectrum[innerLoop + 1]) {
                        int swapTemp = numbersSpectrum[innerLoop];
                        numbersSpectrum[innerLoop] = numbersSpectrum[innerLoop + 1];
                        numbersSpectrum[innerLoop + 1] = swapTemp;
                    }
                }
            }
            sp.edit().clear().apply();
        }
    }
}
