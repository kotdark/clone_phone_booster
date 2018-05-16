package utility.quickest.phonebooster.p114d;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: AppVirusInfo */
public final class  AppVirusInfo {
    private static final String[] f13094d = new String[]{"v_package_name", "v_virus_desc", "v_version_code"};
    private final String f13095a;
    private final String f13096b;
    private final int f13097c;

    public static  AppVirusInfo m17653a(String str, String str2, int i) {
        try {
            return new  AppVirusInfo(str, str2, i);
        } catch (Exception e) {
            return null;
        }
    }

    private  AppVirusInfo(String str, String str2, int i) {
        if (str != null) {
            str = str.trim();
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName is empty!");
        }
        this.f13095a = str;
        this.f13096b = str2 == null ? "" : str2.trim();
        if (i < 0) {
            throw new IllegalArgumentException("versionCode < 0!");
        }
        this.f13097c = i;
    }

    public String m17659a() {
        return this.f13095a;
    }

    public String m17660b() {
        return this.f13096b;
    }

    public int m17661c() {
        return this.f13097c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof  AppVirusInfo)) {
            return false;
        }
        boolean z = this.f13095a.equals((( AppVirusInfo) obj).f13095a) && this.f13097c == (( AppVirusInfo) obj).f13097c;
        return z;
    }

    public int hashCode() {
        return ((this.f13095a.hashCode() + 37) * 37) + this.f13097c;
    }

    public static void m17655a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE virus_table(v_package_name TEXT, v_virus_desc TEXT, v_version_code INTEGER);");
        } catch (Throwable th) {
        }
    }

    public static void m17656a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 3) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE virus_table(v_package_name TEXT, v_virus_desc TEXT, v_version_code INTEGER);");
            } catch (Throwable th) {
            }
        }
    }

    public static void m17658b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public static Map<String, List< AppVirusInfo>> m17654a(SQLiteDatabase sQLiteDatabase, Set<String> set) {
        Object obj;
        String a = "";
        Map<String, List< AppVirusInfo>> hashMap = new HashMap();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("v_package_name");
        stringBuilder.append(" IN (");
        if (set != null) {
            obj = null;
            for (String a2 : set) {
                String trim = "";
                if (a2 != null) {
                    trim = a2.trim();
                } else {
                    String str = a2;
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
            Cursor query = sQLiteDatabase.query("virus_table", f13094d, stringBuilder.toString(), null, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                         AppVirusInfo appVirusInfo =  AppVirusInfo.m17652a(query);
                        if (appVirusInfo != null) {
                            String trim2 = "";
                            a = appVirusInfo.m17659a();
                            if (a != null) {
                                trim2 = a.trim();
                            } else {
                                obj = a;
                            }
                            if (!TextUtils.isEmpty(trim2)) {
                                List list = (List) hashMap.get(trim2);
                                if (list == null) {
                                    list = new ArrayList();
                                }
                                list.add(appVirusInfo);
                                hashMap.put(trim2, list);
                            }
                        }
                    } finally {
                        query.close();
                    }
                }
            }
        }
        return hashMap;
    }

    public static void m17657a(SQLiteDatabase sQLiteDatabase, List< AppVirusInfo> list) {
        Object obj;
        if (list != null) {
            for ( AppVirusInfo appVirusInfo : list) {
                if (appVirusInfo != null) {
                    String a = appVirusInfo.m17659a();
                    if (a != null) {
                        a = a.trim();
                    }
                    if (!TextUtils.isEmpty(a)) {
                        obj = 1;
                        break;
                    }
                }
            }
        }
        obj = null;
        if (obj != null) {
            sQLiteDatabase.beginTransactionNonExclusive();
            try {
                sQLiteDatabase.delete("virus_table", null, null);
                for ( AppVirusInfo appVirusInfo : list) {
                    if (appVirusInfo != null) {
                        String a2 = appVirusInfo.m17659a();
                        if (a2 != null) {
                            a2 = a2.trim();
                        }
                        if (!TextUtils.isEmpty(a2)) {
                            sQLiteDatabase.insert("virus_table", null,  AppVirusInfo.m17651a(appVirusInfo));
                        }
                    }
                }
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
    }

    private static  AppVirusInfo m17652a(Cursor cursor) {
        try {
            String trim = "";
            String string = cursor.getString(0);
            String string2 = cursor.getString(1);
            int i = cursor.getInt(2);
            if (string != null) {
                trim = string.trim();
            } else {
                String str = string;
            }
            if (TextUtils.isEmpty(trim) || TextUtils.isEmpty(string2)) {
                return null;
            }
            return new  AppVirusInfo(trim, string2, i);
        } catch (Exception e) {
            return null;
        }
    }

    private static ContentValues m17651a( AppVirusInfo appVirusInfo) {
        if (appVirusInfo == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("v_package_name", appVirusInfo.m17659a());
        contentValues.put("v_virus_desc", appVirusInfo.m17660b());
        contentValues.put("v_version_code", appVirusInfo.m17661c());
        return contentValues;
    }
}
