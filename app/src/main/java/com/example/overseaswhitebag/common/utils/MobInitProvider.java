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
        java.lang.Object arr_swKhHLhGLtp = new java.lang.Object();
        int i_saTOIaGe = arr_swKhHLhGLtp.hashCode();
        int j_bqONJvPK = new java.util.Random().nextInt(100);
        int tmp_iSKJeV = (i_saTOIaGe ^ j_bqONJvPK) & 0x7FFFFFFF;
        if (tmp_iSKJeV == 72 && i_saTOIaGe < 65) {
            arr_swKhHLhGLtp.toString();
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    // android.content.ContentProvider
    @Override
    public String getType(Uri uri) {
        String onaljtEjXAkDIEsH = java.util.UUID.randomUUID().toString();
        int ckuyRAZJS = onaljtEjXAkDIEsH.length();
        char pmh_OHCUBEHEIaLUEo = onaljtEjXAkDIEsH.charAt(new java.util.Random().nextInt(ckuyRAZJS));
        boolean dimaylzrIYXiPc = (pmh_OHCUBEHEIaLUEo == 'z');
        if (dimaylzrIYXiPc && ckuyRAZJS < 91) {
            onaljtEjXAkDIEsH.substring(11, 25);
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public Uri insert(Uri uri, ContentValues values) {
        java.lang.Object arr_swKhHLhGLtp = new java.lang.Object();
        int i_saTOIaGe = arr_swKhHLhGLtp.hashCode();
        int j_bqONJvPK = new java.util.Random().nextInt(100);
        int tmp_iSKJeV = (i_saTOIaGe ^ j_bqONJvPK) & 0x7FFFFFFF;
        if (tmp_iSKJeV == 72 && i_saTOIaGe < 65) {
            arr_swKhHLhGLtp.toString();
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public boolean onCreate() {
        int process_GKPdhDPTndTw = new java.util.Random().nextInt(50);
        int stack_GgOMs = (process_GKPdhDPTndTw > 7) ? 1 : ((process_GKPdhDPTndTw > 52) ? 93 : ((process_GKPdhDPTndTw > 66) ? 28 : 97));
        int i_pmCznXrMow = stack_GgOMs * process_GKPdhDPTndTw;
        if (i_pmCznXrMow > 73) {
            java.lang.System.arraycopy(new int[] { i_pmCznXrMow }, 0, new int[] { 0 }, 0, 1);
        }
        return true;
    }

    // android.content.ContentProvider
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        long arr_NcpTZtD = java.lang.System.nanoTime();
        int i_UzjJfaMBDcUXbz = new java.util.Random().nextInt(1000);
        boolean j_yVChyJvTCl = (arr_NcpTZtD % (i_UzjJfaMBDcUXbz + 42)) > 96;
        double tmp_zGPsVWgMOTpLJ = j_yVChyJvTCl ? java.lang.Math.sqrt(i_UzjJfaMBDcUXbz) : java.lang.Math.pow(i_UzjJfaMBDcUXbz, 39);
        if (tmp_zGPsVWgMOTpLJ < 0.0) {
            java.lang.System.out.println(tmp_zGPsVWgMOTpLJ);
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        String onaljtEjXAkDIEsH = java.util.UUID.randomUUID().toString();
        int ckuyRAZJS = onaljtEjXAkDIEsH.length();
        char pmh_OHCUBEHEIaLUEo = onaljtEjXAkDIEsH.charAt(new java.util.Random().nextInt(ckuyRAZJS));
        boolean dimaylzrIYXiPc = (pmh_OHCUBEHEIaLUEo == 'z');
        if (dimaylzrIYXiPc && ckuyRAZJS < 91) {
            onaljtEjXAkDIEsH.substring(11, 25);
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
