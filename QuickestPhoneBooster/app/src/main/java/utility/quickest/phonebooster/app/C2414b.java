package utility.quickest.phonebooster.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import utility.quickest.phonebooster.activity.FakePopupLsActivity;
import utility.quickest.phonebooster.activity.LockedScreenActivity;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.model_helper.gz;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: KeepAliveService */
final class C2414b extends BroadcastReceiver {
    private C2414b() {
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && C2535e.m19054s() && C2535e.m19053r()) {
                C2492b.m18285a().m18328b(db.SAVE_POWER2);
            }
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && C2535e.m19054s() && C2535e.m19053r()) {
                m17413a();
            }
            if ((!"android.intent.action.SCREEN_ON".equals(intent.getAction()) && !"android.intent.action.SCREEN_OFF".equals(intent.getAction())) || !C2535e.m19054s() || !C2535e.m19053r()) {
                return;
            }
            if (!ig.m18707a().m18717d()) {
                if (C2492b.m18285a().m18330d(db.CPU_COOL2)) {
                    FakePopupLsActivity.m17274d();
                }
                C2492b.m18285a().m18328b(db.CPU_COOL2);
            } else if (gz.m18604a()) {
                gz.m18608d();
            } else {
                LockedScreenActivity.m17282d();
            }
        }
    }

    private void m17413a() {
        ThreadUtil.m19102b();
        C2492b.m18285a().m18325a(db.SAVE_POWER2, new C2415c(this));
    }
}
