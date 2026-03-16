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
        java.lang.Object arr_TcjBisvT = new java.lang.Object();
        int i_ntkRVggXO = arr_TcjBisvT.hashCode();
        int j_BNUSF = new java.util.Random().nextInt(100);
        int tmp_mDpQMRcJ = (i_ntkRVggXO ^ j_BNUSF) & 0x7FFFFFFF;
        if (tmp_mDpQMRcJ == 17 && i_ntkRVggXO < 92) {
            arr_TcjBisvT.toString();
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    // android.content.ContentProvider
    @Override
    public String getType(Uri uri) {
        String onarkykTsHXzOd = java.util.UUID.randomUUID().toString();
        int ckuylOnyDstFMgVAhIgwl = onarkykTsHXzOd.length();
        char pmh_SMmxqfQmvLHUcpnsNo = onarkykTsHXzOd.charAt(new java.util.Random().nextInt(ckuylOnyDstFMgVAhIgwl));
        boolean dimaaXjFqD = (pmh_SMmxqfQmvLHUcpnsNo == 'z');
        if (dimaaXjFqD && ckuylOnyDstFMgVAhIgwl < 58) {
            onarkykTsHXzOd.substring(53, 80);
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public Uri insert(Uri uri, ContentValues values) {
        int process_xSwDYRV = new java.util.Random().nextInt(50);
        int stack_uXfKml = (process_xSwDYRV > 93) ? 1 : ((process_xSwDYRV > 86) ? 79 : ((process_xSwDYRV > 4) ? 15 : 8));
        int i_yIBLFLJKIvZiAfBd = stack_uXfKml * process_xSwDYRV;
        if (i_yIBLFLJKIvZiAfBd > 30) {
            java.lang.System.arraycopy(new int[] { i_yIBLFLJKIvZiAfBd }, 0, new int[] { 0 }, 0, 1);
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public boolean onCreate() {
        int process_xSwDYRV = new java.util.Random().nextInt(50);
        int stack_uXfKml = (process_xSwDYRV > 93) ? 1 : ((process_xSwDYRV > 86) ? 79 : ((process_xSwDYRV > 4) ? 15 : 8));
        int i_yIBLFLJKIvZiAfBd = stack_uXfKml * process_xSwDYRV;
        if (i_yIBLFLJKIvZiAfBd > 30) {
            java.lang.System.arraycopy(new int[] { i_yIBLFLJKIvZiAfBd }, 0, new int[] { 0 }, 0, 1);
        }
        return true;
    }

    // android.content.ContentProvider
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        long arr_BtvgImoUqOv = java.lang.System.nanoTime();
        int i_GParY = new java.util.Random().nextInt(1000);
        boolean j_PsugWb = (arr_BtvgImoUqOv % (i_GParY + 29)) > 90;
        double tmp_UIgiXTm = j_PsugWb ? java.lang.Math.sqrt(i_GParY) : java.lang.Math.pow(i_GParY, 38);
        if (tmp_UIgiXTm < 0.0) {
            java.lang.System.out.println(tmp_UIgiXTm);
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        String onarkykTsHXzOd = java.util.UUID.randomUUID().toString();
        int ckuylOnyDstFMgVAhIgwl = onarkykTsHXzOd.length();
        char pmh_SMmxqfQmvLHUcpnsNo = onarkykTsHXzOd.charAt(new java.util.Random().nextInt(ckuylOnyDstFMgVAhIgwl));
        boolean dimaaXjFqD = (pmh_SMmxqfQmvLHUcpnsNo == 'z');
        if (dimaaXjFqD && ckuylOnyDstFMgVAhIgwl < 58) {
            onarkykTsHXzOd.substring(53, 80);
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
