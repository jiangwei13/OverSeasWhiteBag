package myrd;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public final class ZZIM extends ContentProvider {

    // android.content.ContentProvider
    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
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
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    // android.content.ContentProvider
    @Override
    public String getType(Uri uri) {
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
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public Uri insert(Uri uri, ContentValues values) {
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
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public boolean onCreate() {
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
        return true;
    }

    // android.content.ContentProvider
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
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
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
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
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
