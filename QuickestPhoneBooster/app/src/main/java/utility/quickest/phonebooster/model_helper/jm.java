package utility.quickest.phonebooster.model_helper;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import utility.quickest.phonebooster.p112b.C2429a;
import utility.quickest.phonebooster.p114d. AppVirusInfo;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: VirusWhiteListModel */
public final class jm {
    private static volatile jm f14455a;
    private static final String[] f14456g = new String[]{"vwl_package_name", "vwl_version_code"};
    private final LinkedHashSet< AppVirusInfo> f14457b = new LinkedHashSet();
    private final LinkedHashSet< AppVirusInfo> f14458c = new LinkedHashSet();
    private boolean f14459d = false;
    private final Set<jr> f14460e = new LinkedHashSet();
    private final Set<js> f14461f = new LinkedHashSet();

    public static jm m18760a() {
        if (f14455a == null) {
            synchronized (jm.class) {
                if (f14455a == null) {
                    f14455a = new jm();
                }
            }
        }
        return f14455a;
    }

    public boolean m18781b() {
        ThreadUtil.m19102b();
        return this.f14459d;
    }

    public boolean m18779a( AppVirusInfo c2448f) {
        ThreadUtil.m19102b();
        if (c2448f == null) {
            return false;
        }
        CharSequence a = c2448f.m17659a();
        if (a != null) {
            a = a.trim();
        }
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        if (m18781b()) {
            return this.f14458c.contains(c2448f);
        }
        return this.f14457b.contains(c2448f);
    }

    public void m18780b( AppVirusInfo c2448f) {
        ThreadUtil.m19102b();
        if (c2448f != null) {
            CharSequence a = c2448f.m17659a();
            if (a != null) {
                a = a.trim();
            }
            if (!TextUtils.isEmpty(a)) {
                if (m18781b()) {
                    this.f14458c.add(c2448f);
                    m18773e();
                    m18777g();
                    return;
                }
                this.f14457b.add(c2448f);
            }
        }
    }

    private jm() {
        ThreadUtil.m19099a(false, new jn(this));
    }

    private void m18771d() {
        ThreadUtil.m19102b();
        if (!m18781b()) {
            ThreadUtil.m19101b(new jo(this));
        }
    }

    private void m18773e() {
        ThreadUtil.m19102b();
        ThreadUtil.m19101b(new jq(this, new ArrayList(this.f14458c)));
    }

    private void m18775f() {
        ThreadUtil.m19102b();
        if (!this.f14460e.isEmpty()) {
            for (jr a : new ArrayList(this.f14460e)) {
                a.m18782a();
            }
        }
    }

    private void m18777g() {
        ThreadUtil.m19102b();
        if (!this.f14461f.isEmpty()) {
            for (js a : new ArrayList(this.f14461f)) {
                a.m18783a();
            }
        }
    }

    public static void m18761a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE virus_white_list_table(vwl_package_name TEXT, vwl_version_code INTEGER);");
        } catch (Throwable th) {
        }
    }

    public static void m18762a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 3) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE virus_white_list_table(vwl_package_name TEXT, vwl_version_code INTEGER);");
            } catch (Throwable th) {
            }
        }
    }

    public static void m18767b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private static List< AppVirusInfo> m18778h() {
        List< AppVirusInfo> arrayList = new ArrayList();
        Cursor query = C2429a.m17452a().query("virus_white_list_table", f14456g, null, null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                     AppVirusInfo a = m18759a(query);
                    if (a != null) {
                        CharSequence a2 = a.m17659a();
                        if (a2 != null) {
                            a2 = a2.trim();
                        }
                        if (!TextUtils.isEmpty(a2)) {
                            arrayList.add(a);
                        }
                    }
                } finally {
                    query.close();
                }
            }
        }
        return arrayList;
    }

    private static void m18768b(List< AppVirusInfo> list) {
        SQLiteDatabase a = C2429a.m17452a();
        a.beginTransactionNonExclusive();
        try {
            a.delete("virus_white_list_table", null, null);
            if (list != null) {
                int i = 0;
                for ( AppVirusInfo c2448f : list) {
                    if (c2448f != null) {
                        int i2;
                        String a2 = c2448f.m17659a();
                        if (a2 != null) {
                            a2 = a2.trim();
                        }
                        if (TextUtils.isEmpty(a2)) {
                            i2 = i;
                        } else {
                            try {
                                String str = "virus_white_list_table";
                                int c = c2448f.m17661c();
                                i2 = i + 1;
                                try {
                                    a.insert(str, null, m18758a(a2, c, i));
                                } catch (SQLiteException e) {
                                }
                            } catch (SQLiteException e2) {
                                i2 = i;
                            }
                        }
                        i = i2;
                    }
                }
            }
            a.setTransactionSuccessful();
        } finally {
            a.endTransaction();
        }
    }

    private static  AppVirusInfo m18759a(Cursor cursor) {
         AppVirusInfo c2448f = null;
        try {
            String string = cursor.getString(0);
            int i = cursor.getInt(1);
            if (string != null) {
                string = string.trim();
            }
            if (!TextUtils.isEmpty(string)) {
                c2448f =  AppVirusInfo.m17653a(string, "", i);
            }
        } catch (Exception e) {
        }
        return c2448f;
    }

    private static ContentValues m18758a(String str, int i, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("vwl_package_name", str);
        contentValues.put("vwl_version_code", Integer.valueOf(i));
        return contentValues;
    }
}
