package utility.quickest.phonebooster.model_helper;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.System;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.util.NetworkUtil;

/* compiled from: SwitchModel */
class iz implements Runnable {
    final /* synthetic */ SwitchModel f14437a;

    iz(SwitchModel switchModel) {
        this.f14437a = switchModel;
    }

    public void run() {
        this.f14437a.f13882c.post(this.f14437a.f13883d);
        NetworkUtil.m18868a(new ja(this));
        try {
            ContentObserver jbVar = new jb(this, new Handler(Looper.getMainLooper()));
            ContentResolver contentResolver = MyApplicationLike.getApplication().getContentResolver();
            try {
                contentResolver.registerContentObserver(System.getUriFor("screen_brightness_mode"), true, jbVar);
            } catch (Throwable th) {
            }
            try {
                contentResolver.registerContentObserver(System.getUriFor("screen_brightness"), true, jbVar);
            } catch (Throwable th2) {
            }
        } catch (Throwable th3) {
        }
    }
}
