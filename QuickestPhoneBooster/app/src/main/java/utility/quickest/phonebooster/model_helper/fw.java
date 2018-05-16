package utility.quickest.phonebooster.model_helper;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import utility.quickest.phonebooster.network.C2522c;
import utility.quickest.phonebooster.network.response_data.JunkDirServiceExpression;
import utility.quickest.phonebooster.p112b.C2429a;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.p114d.C2445c;
import utility.quickest.phonebooster.p114d.C2450h;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2541l;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: DeepJunkHelper */
public final class fw {
    private static boolean f14234a = false;
    private static final Handler f14235b = new Handler(Looper.getMainLooper());
    private static final Runnable f14236c = new fx();
    private static boolean f14237d = false;
    private static final String[] f14238j = new String[]{"j_junk_dir_set"};
    private static final String[] f14239k = new String[]{"da_package_name", "da_app_name"};
    private final gy f14240e;
    private gx f14241f = gx.ReadyToScan;
    private final Map<String, C2445c> f14242g = new HashMap();
    private final Map<String, C2450h> f14243h = new HashMap();
    private gw f14244i = null;

    public static void m18560a() {
        ThreadUtil.m19102b();
        f14235b.removeCallbacks(f14236c);
        f14236c.run();
    }

    public static void m18575b() {
        ThreadUtil.m19102b();
        if (!f14237d) {
            f14237d = true;
            ThreadUtil.m19101b(new gk());
        }
    }

    public fw(gy gyVar) {
        if (gyVar == null) {
            throw new IllegalArgumentException("target is null!");
        }
        this.f14240e = gyVar;
    }

    public void m18595a(gw gwVar) {
        ThreadUtil.m19102b();
        this.f14244i = gwVar;
    }

    public long m18598c() {
        ThreadUtil.m19102b();
        long j;
        switch (gj.f14276a[this.f14240e.ordinal()]) {
            case 1:
                j = 0;
                for (C2445c c : this.f14242g.values()) {
                    j = c.m17626c() + j;
                }
                return j;
            case 2:
                j = 0;
                for (C2450h d : this.f14243h.values()) {
                    j = d.m17673d() + j;
                }
                return j;
            default:
                return 0;
        }
    }

    public List<C2445c> m18599d() {
        ThreadUtil.m19102b();
        List<C2445c> arrayList = new ArrayList(this.f14242g.values());
        Collections.sort(arrayList, new gm(this));
        return arrayList;
    }

    public List<C2450h> m18600e() {
        ThreadUtil.m19102b();
        List<C2450h> arrayList = new ArrayList(this.f14243h.values());
        Collections.sort(arrayList, new gn(this));
        return arrayList;
    }

    public boolean m18596a(long j, long j2) {
        ThreadUtil.m19102b();
        if (gx.Scanning.equals(this.f14241f)) {
            return true;
        }
        if (gx.ReadyToScan.equals(this.f14241f) || gx.ReadyToScanAndDoAction.equals(this.f14241f)) {
            return m18580b(j, j2);
        }
        return false;
    }

    public boolean m18597a(List<?> list, long j, long j2) {
        ThreadUtil.m19102b();
        if (gx.ReadyToScanAndDoAction.equals(this.f14241f)) {
            return m18581b((List) list, j, j2);
        }
        return false;
    }

    private static void m18594i() {
        ThreadUtil.m19102b();
        if (!f14234a) {
            f14234a = true;
            ThreadUtil.m19103c(new go(C2490a.m18243a().m18244b()));
        }
    }

    private boolean m18580b(long j, long j2) {
        ThreadUtil.m19102b();
        switch (gj.f14276a[this.f14240e.ordinal()]) {
            case 1:
                m18584c(j, j2);
                return true;
            case 2:
                m18588d(j, j2);
                return true;
            default:
                return false;
        }
    }

    private void m18584c(long j, long j2) {
        ThreadUtil.m19102b();
        this.f14242g.clear();
        m18566a(gx.Scanning);
        ThreadUtil.m19097a("ScanInstalledAppJunk", new gq(this, j2, j));
    }

    private void m18588d(long j, long j2) {
        ThreadUtil.m19102b();
        this.f14243h.clear();
        m18566a(gx.Scanning);
        ThreadUtil.m19097a("ScanDeletedAppJunk", new gs(this, j2, j));
    }

    private void m18568a(String str, String str2, int i, long[] jArr) {
        m18569a(str, str2, C2541l.m19068a(str), i, jArr);
    }

    private void m18569a(String str, String str2, File file, int i, long[] jArr) {
        String trim;
        if (str != null) {
            trim = str.trim();
        } else {
            trim = str;
        }
        if (!TextUtils.isEmpty(trim) && file != null) {
            File[] listFiles;
            long a = C2541l.m19067a(file);
            if (a > 0) {
                ThreadUtil.m19099a(false, new gu(this, file, a, trim, str2));
            }
            m18567a(file.getAbsolutePath(), i, jArr);
            File[] fileArr = null;
            try {
                listFiles = file.listFiles();
            } catch (Throwable th) {
                listFiles = fileArr;
            }
            if (listFiles != null) {
                for (File a2 : listFiles) {
                    m18569a(trim, str2, a2, i, jArr);
                }
            }
        }
    }

    private void m18579b(String str, String str2, int i, long[] jArr) {
        String trim;
        if (str != null) {
            trim = str.trim();
        } else {
            trim = str;
        }
        if (!TextUtils.isEmpty(trim)) {
            File externalStorageDirectory;
            File file = null;
            try {
                externalStorageDirectory = Environment.getExternalStorageDirectory();
            } catch (Throwable th) {
                externalStorageDirectory = file;
            }
            if (externalStorageDirectory != null) {
                for (String file2 : m18559a(C2429a.m17452a(), trim)) {
                    try {
                        File file3 = new File(externalStorageDirectory, file2);
                        long a = C2541l.m19067a(file3);
                        if (a > 0) {
                            ThreadUtil.m19099a(false, new gv(this, file3, a, trim, str2));
                        }
                        m18567a(file3.getAbsolutePath(), i, jArr);
                    } catch (Throwable th2) {
                    }
                }
            }
        }
    }

    private void m18567a(String str, int i, long[] jArr) {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - jArr[0]) >= 100) {
                jArr[0] = elapsedRealtime;
                ThreadUtil.m19099a(false, new fy(this, str, i));
            }
        } catch (Throwable th) {
        }
    }

    private boolean m18581b(List<?> list, long j, long j2) {
        ThreadUtil.m19102b();
        switch (gj.f14276a[this.f14240e.ordinal()]) {
            case 1:
                m18586c(list, j, j2);
                return true;
            case 2:
                m18590d(list, j, j2);
                return true;
            default:
                return false;
        }
    }

    private void m18586c(List<?> list, long j, long j2) {
        ThreadUtil.m19102b();
        m18566a(gx.DoingAction);
        List arrayList = new ArrayList();
        if (list != null) {
            for (Object next : list) {
                if (next instanceof C2445c) {
                    C2445c c2445c = (C2445c) this.f14242g.get(((C2445c) next).m17623a());
                    if (c2445c != null) {
                        arrayList.add(c2445c);
                    }
                }
            }
        }
        ThreadUtil.m19097a("ClearInstalledAppJunk", new fz(this, arrayList, j2, j));
    }

    private void m18590d(List<?> list, long j, long j2) {
        ThreadUtil.m19102b();
        m18566a(gx.DoingAction);
        List arrayList = new ArrayList();
        if (list != null) {
            for (Object next : list) {
                if (next instanceof C2450h) {
                    C2450h c2450h = (C2450h) this.f14243h.get(((C2450h) next).m17669a());
                    if (c2450h != null) {
                        arrayList.add(c2450h);
                    }
                }
            }
        }
        ThreadUtil.m19097a("ClearDeletedAppJunk", new ge(this, arrayList, j2, j));
    }

    private void m18566a(gx gxVar) {
        ThreadUtil.m19102b();
        if (gxVar != null && !gxVar.equals(this.f14241f)) {
            this.f14241f = gxVar;
            if (this.f14244i != null) {
                this.f14244i.mo3111a(this.f14240e, this.f14241f);
            }
        }
    }

    private static List<JunkDirServiceExpression> m18573b(C2443a c2443a) {
        try {
             SharedPrefHelper.m17454a().m17550u(System.currentTimeMillis());
            return (List) C2522c.m18847a().m18844a(C2542m.m19076a(c2443a.m17612b()), C2535e.m19030a(true)).mo1131a().m2659b();
        } catch (IOException e) {
            return null;
        }
    }

    public static void m18561a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE junk_table(j_package_name TEXT, j_junk_dir_set TEXT);");
        } catch (Throwable th) {
        }
        try {
            sQLiteDatabase.execSQL("CREATE TABLE deleted_app_table(da_package_name TEXT, da_app_name TEXT);");
        } catch (Throwable th2) {
        }
    }

    public static void m18562a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 4) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE deleted_app_table(da_package_name TEXT, da_app_name TEXT);");
            } catch (Throwable th) {
            }
        }
    }

    public static void m18576b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private static Set<String> m18559a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query;
        if (str != null) {
            try {
                str = str.trim();
            } catch (Throwable th) {
            }
        }
        if (!TextUtils.isEmpty(str)) {
            String[] strArr = f14238j;
            String str2 = "j_package_name='" + str + "'";
            query = sQLiteDatabase.query("junk_table", strArr, str2, null, null, null, null);
            if (query != null) {
                if (query.moveToNext()) {
                    Set<String> a = m18558a(query);
                    query.close();
                    return a;
                }
                query.close();
            }
        }
        return new HashSet();
    }

    private static void m18585c(SQLiteDatabase sQLiteDatabase, Map<String, Set<String>> map) {
        Object obj;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("j_package_name");
        stringBuilder.append(" IN (");
        if (map != null) {
            obj = null;
            for (String str : map.keySet()) {
                Object trim;
                if (str != null) {
                    trim = str.trim();
                } else {
                    String str2 = str;
                }
                if (!TextUtils.isEmpty(trim)) {
                    stringBuilder.append("'");
                    stringBuilder.append(trim);
                    stringBuilder.append("', ");
                    obj = 1;
                }
            }
        } else {
            obj = null;
        }
        if (obj != null) {
            int length = stringBuilder.length();
            stringBuilder.delete(length - 2, length);
            stringBuilder.append(")");
            sQLiteDatabase.beginTransactionNonExclusive();
            try {
                sQLiteDatabase.delete("junk_table", stringBuilder.toString(), null);
                for (Entry entry : map.entrySet()) {
                    String str3 = (String) entry.getKey();
                    Set set = (Set) entry.getValue();
                    if (str3 != null) {
                        str3 = str3.trim();
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        sQLiteDatabase.insert("junk_table", null, m18554a(str3, set));
                    }
                }
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
    }

    private static Set<String> m18558a(Cursor cursor) {
        try {
            return C2542m.m19089b(cursor.getString(0));
        } catch (Throwable th) {
            return new HashSet();
        }
    }

    private static ContentValues m18554a(String str, Set<String> set) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("j_package_name", str);
        contentValues.put("j_junk_dir_set", C2542m.m19079a((Collection) set));
        return contentValues;
    }

    private static List<Pair<String, String>> m18572b(SQLiteDatabase sQLiteDatabase, Set<String> set) {
        Cursor query;
        String str = null;
        List<Pair<String, String>> arrayList = new ArrayList();
        Object obj = null;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("da_package_name");
            stringBuilder.append(" NOT IN (");
            if (set != null) {
                Object obj2 = null;
                for (Object obj3 : set) {
                    if (obj3 != null) {
                        obj3 = obj3.trim();
                    }
                    if (!TextUtils.isEmpty(obj3)) {
                        obj2 = 1;
                        stringBuilder.append("'");
                        stringBuilder.append(obj3);
                        stringBuilder.append("', ");
                    }
                }
                obj3 = obj2;
            }
            if (obj3 != null) {
                int length = stringBuilder.length();
                stringBuilder.delete(length - 2, length);
                stringBuilder.append(")");
                str = stringBuilder.toString();
            }
            query = sQLiteDatabase.query("deleted_app_table", f14239k, str, null, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        Pair b = m18571b(query);
                        if (b != null) {
                            arrayList.add(b);
                        }
                    } catch (Throwable th) {
                    }
                }
                query.close();
            }
        } catch (Throwable th2) {
        }
        return arrayList;
    }

    private static void m18589d(SQLiteDatabase sQLiteDatabase, Map<String, String> map) {
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            sQLiteDatabase.delete("deleted_app_table", null, null);
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    if (entry != null) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        if (str != null) {
                            str = str.trim();
                        }
                        if (str2 != null) {
                            str2 = str2.trim();
                        }
                        if (!(TextUtils.isEmpty(str) || TextUtils.isEmpty(str2))) {
                            sQLiteDatabase.insert("deleted_app_table", null, m18553a(str, str2));
                        }
                    }
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    private static Pair<String, String> m18571b(Cursor cursor) {
        String string = cursor.getString(0);
        CharSequence string2 = cursor.getString(1);
        if (string != null) {
            CharSequence trim = string.trim();
        } else {
            Object obj = string;
        }
        if (string2 != null) {
            string2 = string2.trim();
        }
        if (TextUtils.isEmpty(trim) || TextUtils.isEmpty(string2)) {
            return null;
        }
        return new Pair(trim, string2);
    }

    private static ContentValues m18553a(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("da_package_name", str);
        contentValues.put("da_app_name", str2);
        return contentValues;
    }
}
