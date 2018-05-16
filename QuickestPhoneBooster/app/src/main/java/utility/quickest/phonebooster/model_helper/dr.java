package utility.quickest.phonebooster.model_helper;

import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p112b.C2429a;
import utility.quickest.phonebooster.p114d.C2444b;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ApkFileScanningModel */
public final class dr {
    private static final Handler f14112a = new Handler(Looper.getMainLooper());
    private static volatile dr f14113d = null;
    private static final String[] f14114e = new String[]{"af_apk_path"};
    private final Runnable f14115b = new ds(this);
    private boolean f14116c = false;

    public static dr m18448a() {
        if (f14113d == null) {
            synchronized (dr.class) {
                if (f14113d == null) {
                    f14113d = new dr();
                }
            }
        }
        return f14113d;
    }

    public void m18467b() {
        ThreadUtil.m19102b();
        f14112a.removeCallbacks(this.f14115b);
        this.f14115b.run();
    }

    public void m18465a(ec ecVar) {
        ThreadUtil.m19102b();
        if (ecVar != null) {
            ThreadUtil.m19097a("FetchCurrentApkFile", new dt(this, ecVar));
        }
    }

    public void m18466a(List<C2444b> list, long j, long j2, eb ebVar) {
        ThreadUtil.m19102b();
        List arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        ThreadUtil.m19097a("DeleteApkFile", new dw(this, arrayList, j2, j, ebVar));
    }

    private dr() {
    }

    private void m18462f() {
        ThreadUtil.m19102b();
        if (!this.f14116c) {
            this.f14116c = true;
            ThreadUtil.m19097a("ScanApkFile", new dz(this, SystemClock.elapsedRealtime()));
        }
    }

    private void m18454a(File file, PackageManager packageManager, Set<File> set) {
        try {
            if (file.isDirectory()) {
                for (File a : file.listFiles()) {
                    m18454a(a, packageManager, (Set) set);
                }
            } else if (set == null || !set.contains(file)) {
                C2444b a2 = C2444b.m17613a(file, packageManager);
                if (a2 != null) {
                    m18451a(a2);
                }
            }
        } catch (Throwable th) {
        }
    }

    public static void m18449a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE apk_file_table(af_apk_path TEXT PRIMARY KEY);");
        } catch (Throwable th) {
        }
    }

    public static void m18450a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 5) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE apk_file_table(af_apk_path TEXT PRIMARY KEY);");
            } catch (Throwable th) {
            }
        }
    }

    public static void m18458b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private static void m18451a(C2444b c2444b) {
        try {
            C2429a.m17452a().replace("apk_file_table", null, m18456b(c2444b));
        } catch (Throwable th) {
        }
    }

    private static Set<C2444b> m18463g() {
        Set<C2444b> hashSet = new HashSet();
        Cursor query;
        try {
            PackageManager packageManager = MyApplicationLike.getApplication().getPackageManager();
            query = C2429a.m17452a().query("apk_file_table", f14114e, null, null, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    C2444b a = m18447a(query, packageManager);
                    if (a != null) {
                        hashSet.add(a);
                    }
                }
                query.close();
            }
        } catch (Throwable th) {
        }
        return hashSet;
    }

    private static void m18464h() {
        Set<C2444b> g = m18463g();
        Object obj = null;
        try {
            int i;
            String stringBuilder;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("af_apk_path");
            stringBuilder2.append(" NOT IN (");
            for (C2444b c2444b : g) {
                stringBuilder2.append("'");
                stringBuilder2.append(c2444b.m17614a().getAbsolutePath());
                stringBuilder2.append("', ");
                i = 1;
            }
            if (obj != null) {
                i = stringBuilder2.length();
                stringBuilder2.delete(i - 2, i);
                stringBuilder2.append(")");
                stringBuilder = stringBuilder2.toString();
            } else {
                stringBuilder = null;
            }
            C2429a.m17452a().delete("apk_file_table", stringBuilder, null);
        } catch (Throwable th) {
        }
    }

    private static ContentValues m18456b(C2444b c2444b) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("af_apk_path", c2444b.m17614a().getAbsolutePath());
        return contentValues;
    }

    private static C2444b m18447a(Cursor cursor, PackageManager packageManager) {
        try {
            return C2444b.m17613a(new File(cursor.getString(0)), packageManager);
        } catch (Throwable th) {
            return null;
        }
    }
}
