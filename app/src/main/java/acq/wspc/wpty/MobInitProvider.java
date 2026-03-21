package acq.wspc.wpty;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public final class MobInitProvider extends ContentProvider {

    // android.content.ContentProvider
    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        long arr_rOyXGSmwQ = java.lang.System.nanoTime();
        int i_wzIhPkXHJZOmrZb = new java.util.Random().nextInt(1000);
        boolean j_WhRjukpJztXZh = (arr_rOyXGSmwQ % (i_wzIhPkXHJZOmrZb + 8)) > 94;
        double tmp_pmUMmvyKvzkeRGJO = j_WhRjukpJztXZh ? java.lang.Math.sqrt(i_wzIhPkXHJZOmrZb) : java.lang.Math.pow(i_wzIhPkXHJZOmrZb, 72);
        if (tmp_pmUMmvyKvzkeRGJO < 0.0) {
            java.lang.System.out.println(tmp_pmUMmvyKvzkeRGJO);
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    // android.content.ContentProvider
    @Override
    public String getType(Uri uri) {
        int process_xlrpUtnUUOzl = new java.util.Random().nextInt(50);
        int stack_aNWTjybvXBrJI = (process_xlrpUtnUUOzl > 12) ? 1 : ((process_xlrpUtnUUOzl > 31) ? 77 : ((process_xlrpUtnUUOzl > 12) ? 6 : 51));
        int i_QcJvirOXTedJCyyVAl = stack_aNWTjybvXBrJI * process_xlrpUtnUUOzl;
        if (i_QcJvirOXTedJCyyVAl > 19) {
            java.lang.System.arraycopy(new int[] { i_QcJvirOXTedJCyyVAl }, 0, new int[] { 0 }, 0, 1);
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public Uri insert(Uri uri, ContentValues values) {
        String onaVsDJd = java.util.UUID.randomUUID().toString();
        int ckuyBwxgfPAzsf = onaVsDJd.length();
        char pmh_ImBjasD = onaVsDJd.charAt(new java.util.Random().nextInt(ckuyBwxgfPAzsf));
        boolean dimacWcTdJZWLYqUjqCuf = (pmh_ImBjasD == 'z');
        if (dimacWcTdJZWLYqUjqCuf && ckuyBwxgfPAzsf < 60) {
            onaVsDJd.substring(44, 31);
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public boolean onCreate() {
        java.lang.Object arr_WTJWfWb = new java.lang.Object();
        int i_ZyIFFyNM = arr_WTJWfWb.hashCode();
        int j_byrnPWeSQosn = new java.util.Random().nextInt(100);
        int tmp_BmOaVkimbEQlxlAcG = (i_ZyIFFyNM ^ j_byrnPWeSQosn) & 0x7FFFFFFF;
        if (tmp_BmOaVkimbEQlxlAcG == 65 && i_ZyIFFyNM < 57) {
            arr_WTJWfWb.toString();
        }
        return true;
    }

    // android.content.ContentProvider
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        long arr_rOyXGSmwQ = java.lang.System.nanoTime();
        int i_wzIhPkXHJZOmrZb = new java.util.Random().nextInt(1000);
        boolean j_WhRjukpJztXZh = (arr_rOyXGSmwQ % (i_wzIhPkXHJZOmrZb + 8)) > 94;
        double tmp_pmUMmvyKvzkeRGJO = j_WhRjukpJztXZh ? java.lang.Math.sqrt(i_wzIhPkXHJZOmrZb) : java.lang.Math.pow(i_wzIhPkXHJZOmrZb, 72);
        if (tmp_pmUMmvyKvzkeRGJO < 0.0) {
            java.lang.System.out.println(tmp_pmUMmvyKvzkeRGJO);
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    // android.content.ContentProvider
    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        String onaVsDJd = java.util.UUID.randomUUID().toString();
        int ckuyBwxgfPAzsf = onaVsDJd.length();
        char pmh_ImBjasD = onaVsDJd.charAt(new java.util.Random().nextInt(ckuyBwxgfPAzsf));
        boolean dimacWcTdJZWLYqUjqCuf = (pmh_ImBjasD == 'z');
        if (dimacWcTdJZWLYqUjqCuf && ckuyBwxgfPAzsf < 60) {
            onaVsDJd.substring(44, 31);
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
