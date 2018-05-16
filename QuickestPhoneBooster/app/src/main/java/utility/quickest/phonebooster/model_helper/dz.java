package utility.quickest.phonebooster.model_helper;

import android.os.Environment;
import android.support.v4.content.ContextCompat;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ApkFileScanningModel */
class dz implements Runnable {
    final /* synthetic */ long f14132a;
    final /* synthetic */ dr f14133b;

    dz(dr drVar, long j) {
        this.f14133b = drVar;
        this.f14132a = j;
    }

    public void run() {
        boolean z;
        File externalStorageDirectory;
        Throwable th;
        boolean z2 = true;
        try {
            if (ContextCompat.checkSelfPermission(MyApplicationLike.getApplication(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z2 = false;
            }
            z = z2;
        } catch (Throwable th2) {
            z = false;
        }
        try {
            externalStorageDirectory = Environment.getExternalStorageDirectory();
        } catch (Throwable th3) {
            externalStorageDirectory = null;
        }
        try {
            Set hashSet = new HashSet();
            for (String c : C2535e.m19030a(true).keySet()) {
                File c2 = C2535e.m19034c(c);
                if (c2 != null) {
                    hashSet.add(c2);
                }
            }
            this.f14133b.m18454a(externalStorageDirectory, MyApplicationLike.getApplication().getPackageManager(), hashSet);
            dr.m18464h();
            th = null;
        } catch (Throwable th4) {
            th = th4;
        }
        ThreadUtil.m19099a(false, new ea(this, z));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
