package utility.quickest.phonebooster.model_helper;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import utility.quickest.phonebooster.p112b.C2429a;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: WhiteListModel */
public final class jt {
    private static volatile jt f14468a;
    private static final String[] f14469g = new String[]{"wl_package_name"};
    private final LinkedHashSet<String> f14470b = new LinkedHashSet();
    private final LinkedHashSet<String> f14471c = new LinkedHashSet();
    private boolean f14472d = false;
    private final Set<jy> f14473e = new LinkedHashSet();
    private final Set<jz> f14474f = new LinkedHashSet();

    public static jt m18785a() {
        if (f14468a == null) {
            synchronized (jt.class) {
                if (f14468a == null) {
                    f14468a = new jt();
                }
            }
        }
        return f14468a;
    }

    public void m18805a(jz jzVar) {
        ThreadUtil.m19102b();
        if (jzVar != null) {
            this.f14474f.add(jzVar);
        }
    }

    public void m18807b(jz jzVar) {
        ThreadUtil.m19102b();
        if (jzVar != null) {
            this.f14474f.remove(jzVar);
        }
    }

    public boolean m18809b() {
        ThreadUtil.m19102b();
        return this.f14472d;
    }

    public List<String> m18810c() {
        ThreadUtil.m19102b();
        List<String> arrayList = new ArrayList(this.f14471c);
        Collections.reverse(arrayList);
        return arrayList;
    }

    public boolean m18806a(String str) {
        ThreadUtil.m19102b();
        if (str != null) {
            str = str.trim();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (m18809b()) {
            return this.f14471c.contains(str);
        }
        return this.f14470b.contains(str);
    }

    public void m18808b(String str) {
        ThreadUtil.m19102b();
        if (str != null) {
            str = str.trim();
        }
        if (!TextUtils.isEmpty(str)) {
            if (m18809b()) {
                this.f14471c.add(str);
                m18800f();
                m18803h();
                return;
            }
            this.f14470b.add(str);
        }
    }

    public void m18811c(String str) {
        ThreadUtil.m19102b();
        if (str != null) {
            str = str.trim();
        }
        if (!TextUtils.isEmpty(str)) {
            if (m18809b()) {
                this.f14471c.remove(str);
                m18800f();
                m18803h();
                return;
            }
            this.f14470b.remove(str);
        }
    }

    private jt() {
        ThreadUtil.m19099a(false, new ju(this));
    }

    private void m18798e() {
        ThreadUtil.m19102b();
        if (!m18809b()) {
            ThreadUtil.m19101b(new jv(this));
        }
    }

    private void m18800f() {
        ThreadUtil.m19102b();
        ThreadUtil.m19101b(new jx(this, new ArrayList(this.f14471c)));
    }

    private void m18802g() {
        ThreadUtil.m19102b();
        if (!this.f14473e.isEmpty()) {
            for (jy a : new ArrayList(this.f14473e)) {
                a.m18812a();
            }
        }
    }

    private void m18803h() {
        ThreadUtil.m19102b();
        if (!this.f14474f.isEmpty()) {
            for (jz a : new ArrayList(this.f14474f)) {
                a.mo3093a();
            }
        }
    }

    public static void m18787a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE white_list_table(wl_package_name TEXT, wl_order INTEGER);");
        } catch (Throwable th) {
        }
    }

    public static void m18788a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE white_list_table(wl_package_name TEXT, wl_order INTEGER);");
            } catch (Throwable th) {
            }
        }
    }

    public static void m18793b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private static List<String> m18804i() {
        List<String> arrayList = new ArrayList();
        Cursor query = C2429a.m17452a().query("white_list_table", f14469g, null, null, null, null, "wl_order ASC");
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    CharSequence a = m18786a(query);
                    if (a != null) {
                        a = a.trim();
                    }
                    if (!TextUtils.isEmpty(a)) {
                        arrayList.add(a);
                    }
                } finally {
                    query.close();
                }
            }
        }
        return arrayList;
    }

    private static void m18794b(List<String> list) {
        SQLiteDatabase a = C2429a.m17452a();
        a.beginTransactionNonExclusive();
        try {
            a.delete("white_list_table", null, null);
            if (list != null) {
                int i = 0;
                for (String str : list) {
                    String trim;
                    int i2;
                    if (str != null) {
                        trim = str.trim();
                    } else {
                        trim = str;
                    }
                    if (TextUtils.isEmpty(trim)) {
                        i2 = i;
                    } else {
                        try {
                            i2 = i + 1;
                            try {
                                a.insert("white_list_table", null, m18784a(trim, i));
                            } catch (SQLiteException e) {
                            }
                        } catch (SQLiteException e2) {
                            i2 = i;
                        }
                    }
                    i = i2;
                }
            }
            a.setTransactionSuccessful();
        } finally {
            a.endTransaction();
        }
    }

    private static String m18786a(Cursor cursor) {
        try {
            return cursor.getString(0);
        } catch (Exception e) {
            return null;
        }
    }

    private static ContentValues m18784a(String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("wl_package_name", str);
        contentValues.put("wl_order", Integer.valueOf(i));
        return contentValues;
    }
}
