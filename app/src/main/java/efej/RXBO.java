package efej;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public final class RXBO extends ContentProvider {

    // android.content.ContentProvider
    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
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
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    // android.content.ContentProvider
    @Override
    public String getType(Uri uri) {
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
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public Uri insert(Uri uri, ContentValues values) {
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
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public boolean onCreate() {
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
        return true;
    }

    // android.content.ContentProvider
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
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
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
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
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
