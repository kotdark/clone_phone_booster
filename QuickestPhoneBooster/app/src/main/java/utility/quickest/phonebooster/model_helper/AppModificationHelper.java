package utility.quickest.phonebooster.model_helper;

import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.HashSet;
import java.util.Set;

public final class AppModificationHelper {
    private static final Handler f13869a = new Handler(Looper.getMainLooper());
    private static final Receiver f13870b = new Receiver();
    private static final Set<String> f13871c = new HashSet();
    private static long f13872d = 0;
    private static final String[] f13873e = new String[]{"an_app_name"};

    public final class Receiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    String schemeSpecificPart = data.getSchemeSpecificPart();
                    if (schemeSpecificPart != null) {
                        schemeSpecificPart = schemeSpecificPart.trim();
                    }
                    if (!TextUtils.isEmpty(schemeSpecificPart)) {
                        if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) || "android.intent.action.PACKAGE_REPLACED".equals(intent.getAction())) {
                            AppModificationHelper.m18193c(schemeSpecificPart);
                        } else if ("android.intent.action.PACKAGE_FULLY_REMOVED".equals(intent.getAction())) {
                            AppModificationHelper.m18194d(schemeSpecificPart);
                        }
                    }
                }
            }
        }
    }

    public static void m18183a() {
        ThreadUtil.m19102b();
        try {
            Context a = MyApplicationLike.getApplication();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            a.registerReceiver(f13870b, intentFilter);
            intentFilter = new IntentFilter("android.intent.action.PACKAGE_REPLACED");
            intentFilter.addDataScheme("package");
            a.registerReceiver(f13870b, intentFilter);
            intentFilter = new IntentFilter("android.intent.action.PACKAGE_FULLY_REMOVED");
            intentFilter.addDataScheme("package");
            a.registerReceiver(f13870b, intentFilter);
        } catch (Throwable th) {
        }
        ThreadUtil.m19101b(new ed());
    }

    private static void m18193c(String str) {
        ThreadUtil.m19102b();
        ThreadUtil.m19101b(new ee(str));
    }

    private static void m18194d(String str) {
        ThreadUtil.m19102b();
        if (str != null &&  SharedPrefHelper.m17454a().m17526j() && !f13871c.contains(str)) {
            f13871c.add(str);
            if (Math.abs(SystemClock.elapsedRealtime() - f13872d) >= 10000) {
                f13872d = SystemClock.elapsedRealtime();
                ThreadUtil.m19101b(new ef(str));
            }
        }
    }

    public static void m18184a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE app_name_table(an_package_name TEXT PRIMARY KEY, an_app_name TEXT);");
        } catch (Throwable th) {
        }
    }

    public static void m18185a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 6) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE app_name_table(an_package_name TEXT PRIMARY KEY, an_app_name TEXT);");
            } catch (Throwable th) {
            }
        }
    }

    public static void m18190b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private static void m18191b(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        try {
            sQLiteDatabase.replace("app_name_table", null, m18180a(str, str2));
        } catch (Throwable th) {
        }
    }

    private static String m18189b(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query;
        String a;
        String str2 = null;
        try {
            String[] strArr = f13873e;
            String str3 = "an_package_name='" + str + "'";
            query = sQLiteDatabase.query("app_name_table", strArr, str3, null, null, null, null);
            if (query != null) {
                if (query.moveToNext()) {
                    a = m18181a(query);
                } else {
                    a = null;
                }
                try {
                    query.close();
                } catch (Throwable th) {
                    str2 = a;
                    a = str2;
                    if (a == null) {
                        return "";
                    }
                    return a.trim();
                }
            }
            a = null;
        } catch (Throwable th2) {
            a = str2;
            if (a == null) {
                return a.trim();
            }
            return "";
        }
        if (a == null) {
            return "";
        }
        return a.trim();
    }

    private static ContentValues m18180a(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        String str3 = "an_package_name";
        if (str == null) {
            str = "";
        }
        contentValues.put(str3, str);
        str3 = "an_app_name";
        if (str2 == null) {
            str2 = "";
        }
        contentValues.put(str3, str2);
        return contentValues;
    }

    private static String m18181a(Cursor cursor) {
        String str = null;
        try {
            str = cursor.getString(0);
        } catch (Throwable th) {
        }
        return str == null ? "" : str;
    }
}
