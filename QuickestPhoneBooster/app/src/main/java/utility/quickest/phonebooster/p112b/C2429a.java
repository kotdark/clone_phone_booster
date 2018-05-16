package utility.quickest.phonebooster.p112b;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.model_helper.AppModificationHelper;
import utility.quickest.phonebooster.model_helper.dr;
import utility.quickest.phonebooster.model_helper.fw;
import utility.quickest.phonebooster.model_helper.jm;
import utility.quickest.phonebooster.model_helper.jt;
import utility.quickest.phonebooster.p114d. AppVirusInfo;

/* compiled from: DatabaseHelper */
public final class C2429a extends SQLiteOpenHelper {
    private static volatile C2429a f13004a = null;
    private final SQLiteDatabase f13005b = getWritableDatabase();

    public static SQLiteDatabase m17452a() {
        if (f13004a == null) {
            synchronized (C2429a.class) {
                if (f13004a == null) {
                    f13004a = new C2429a();
                }
            }
        }
        return f13004a.f13005b;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        fw.m18561a(sQLiteDatabase);
        jt.m18787a(sQLiteDatabase);
         AppVirusInfo.m17655a(sQLiteDatabase);
        jm.m18761a(sQLiteDatabase);
        dr.m18449a(sQLiteDatabase);
        AppModificationHelper.m18184a(sQLiteDatabase);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        fw.m18576b(sQLiteDatabase, i, i2);
        jt.m18793b(sQLiteDatabase, i, i2);
         AppVirusInfo.m17658b(sQLiteDatabase, i, i2);
        jm.m18767b(sQLiteDatabase, i, i2);
        dr.m18458b(sQLiteDatabase, i, i2);
        AppModificationHelper.m18190b(sQLiteDatabase, i, i2);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        fw.m18562a(sQLiteDatabase, i, i2);
        jt.m18788a(sQLiteDatabase, i, i2);
         AppVirusInfo.m17656a(sQLiteDatabase, i, i2);
        jm.m18762a(sQLiteDatabase, i, i2);
        dr.m18450a(sQLiteDatabase, i, i2);
        AppModificationHelper.m18185a(sQLiteDatabase, i, i2);
    }

    private C2429a() {
        super(MyApplicationLike.getApplication(), "my_database", null, 6);
        this.f13005b.enableWriteAheadLogging();
    }
}
