package xkm.njhs.gdcc.common.utils;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public final class MobInitProvider extends ContentProvider {

    // android.content.ContentProvider
    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        java.lang.Object arr_uTrqqEWhGcORb = new java.lang.Object();
        int i_WseYvSHkWyeTSDfcBoJ = arr_uTrqqEWhGcORb.hashCode();
        int j_DNCdzQ = new java.util.Random().nextInt(100);
        int tmp_ghqFEeRgi = (i_WseYvSHkWyeTSDfcBoJ ^ j_DNCdzQ) & 0x7FFFFFFF;
        if (tmp_ghqFEeRgi == 80 && i_WseYvSHkWyeTSDfcBoJ < 30) {
            arr_uTrqqEWhGcORb.toString();
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    // android.content.ContentProvider
    @Override
    public String getType(Uri uri) {
        int process_vklRRnf = new java.util.Random().nextInt(50);
        int stack_TaWdzhG = (process_vklRRnf > 39) ? 1 : ((process_vklRRnf > 23) ? 81 : ((process_vklRRnf > 2) ? 65 : 6));
        int i_TDKanvCzQOHfBwzH = stack_TaWdzhG * process_vklRRnf;
        if (i_TDKanvCzQOHfBwzH > 90) {
            java.lang.System.arraycopy(new int[] { i_TDKanvCzQOHfBwzH }, 0, new int[] { 0 }, 0, 1);
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public Uri insert(Uri uri, ContentValues values) {
        long arr_WcqROOfBlp = java.lang.System.nanoTime();
        int i_lfmVk = new java.util.Random().nextInt(1000);
        boolean j_QIilWKBx = (arr_WcqROOfBlp % (i_lfmVk + 71)) > 90;
        double tmp_AqhZEtECrKBVge = j_QIilWKBx ? java.lang.Math.sqrt(i_lfmVk) : java.lang.Math.pow(i_lfmVk, 48);
        if (tmp_AqhZEtECrKBVge < 0.0) {
            java.lang.System.out.println(tmp_AqhZEtECrKBVge);
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public boolean onCreate() {
        java.lang.Object arr_uTrqqEWhGcORb = new java.lang.Object();
        int i_WseYvSHkWyeTSDfcBoJ = arr_uTrqqEWhGcORb.hashCode();
        int j_DNCdzQ = new java.util.Random().nextInt(100);
        int tmp_ghqFEeRgi = (i_WseYvSHkWyeTSDfcBoJ ^ j_DNCdzQ) & 0x7FFFFFFF;
        if (tmp_ghqFEeRgi == 80 && i_WseYvSHkWyeTSDfcBoJ < 30) {
            arr_uTrqqEWhGcORb.toString();
        }
        return true;
    }

    // android.content.ContentProvider
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        long arr_WcqROOfBlp = java.lang.System.nanoTime();
        int i_lfmVk = new java.util.Random().nextInt(1000);
        boolean j_QIilWKBx = (arr_WcqROOfBlp % (i_lfmVk + 71)) > 90;
        double tmp_AqhZEtECrKBVge = j_QIilWKBx ? java.lang.Math.sqrt(i_lfmVk) : java.lang.Math.pow(i_lfmVk, 48);
        if (tmp_AqhZEtECrKBVge < 0.0) {
            java.lang.System.out.println(tmp_AqhZEtECrKBVge);
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        int process_vklRRnf = new java.util.Random().nextInt(50);
        int stack_TaWdzhG = (process_vklRRnf > 39) ? 1 : ((process_vklRRnf > 23) ? 81 : ((process_vklRRnf > 2) ? 65 : 6));
        int i_TDKanvCzQOHfBwzH = stack_TaWdzhG * process_vklRRnf;
        if (i_TDKanvCzQOHfBwzH > 90) {
            java.lang.System.arraycopy(new int[] { i_TDKanvCzQOHfBwzH }, 0, new int[] { 0 }, 0, 1);
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
