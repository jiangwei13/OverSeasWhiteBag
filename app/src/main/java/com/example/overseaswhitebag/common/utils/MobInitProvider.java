package com.example.overseaswhitebag.common.utils;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public final class MobInitProvider extends ContentProvider {

    // android.content.ContentProvider
    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
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
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    // android.content.ContentProvider
    @Override
    public String getType(Uri uri) {
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
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public Uri insert(Uri uri, ContentValues values) {
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
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public boolean onCreate() {
 
        return true;
    }

    // android.content.ContentProvider
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
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
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
 
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
