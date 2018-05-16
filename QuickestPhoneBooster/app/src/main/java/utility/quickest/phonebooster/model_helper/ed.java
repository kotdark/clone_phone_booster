package utility.quickest.phonebooster.model_helper;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import utility.quickest.phonebooster.p112b.C2429a;
import utility.quickest.phonebooster.util.C2535e;

/* compiled from: AppModificationHelper */
final class ed implements Runnable {
    ed() {
    }

    public void run() {
        SQLiteDatabase a = C2429a.m17452a();
        a.beginTransactionNonExclusive();
        try {
            for (String str : C2535e.m19030a(true).keySet()) {
                String b = C2535e.m19033b(str);
                if (!TextUtils.isEmpty(b)) {
                    AppModificationHelper.m18191b(a, str, b);
                }
            }
            a.setTransactionSuccessful();
        } finally {
            a.endTransaction();
        }
    }
}
