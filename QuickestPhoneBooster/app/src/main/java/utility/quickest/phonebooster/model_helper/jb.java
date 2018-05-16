package utility.quickest.phonebooster.model_helper;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: SwitchModel */
class jb extends ContentObserver {
    final /* synthetic */ iz f14441a;

    jb(iz izVar, Handler handler) {
        this.f14441a = izVar;
        super(handler);
    }

    public boolean deliverSelfNotifications() {
        return true;
    }

    public void onChange(boolean z) {
        this.f14441a.f14437a.m18228j();
    }
}
