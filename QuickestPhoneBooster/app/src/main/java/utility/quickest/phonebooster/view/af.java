package utility.quickest.phonebooster.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: EnableLockedScreenTipView */
class af extends BroadcastReceiver {
    final String f15115a = "reason";
    final String f15116b = "homekey";
    final /* synthetic */ EnableLockedScreenTipView f15117c;

    af(EnableLockedScreenTipView enableLockedScreenTipView) {
        this.f15117c = enableLockedScreenTipView;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("reason");
            if (stringExtra != null && stringExtra.equals("homekey")) {
                this.f15117c.m19203a();
            }
        }
    }
}
