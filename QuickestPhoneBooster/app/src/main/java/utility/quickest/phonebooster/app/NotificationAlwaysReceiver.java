package utility.quickest.phonebooster.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import utility.quickest.phonebooster.model_helper.SwitchModel;
import utility.quickest.phonebooster.p114d.C2455m;
import utility.quickest.phonebooster.util.C2542m;
import java.lang.reflect.Method;

public class NotificationAlwaysReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        SwitchModel a = SwitchModel.m18216a();
        if ("utility.quickest.phoneboosteraction_wifi".equals(intent.getAction())) {
            a.m18236a(intent.getBooleanExtra("key_wifi", true));
            C2542m.m19082a("noti_toolbar", "wifi", null);
        }
        if ("utility.quickest.phoneboosteraction_brightness".equals(intent.getAction())) {
            if (a.m18241e()) {
                a.m18233a(intent.getIntExtra("key_brightness", -1), true);
                C2542m.m19082a("noti_toolbar", "bright", null);
            } else {
                a.m18242f();
                m17412a(context);
                return;
            }
        }
        if (!"utility.quickest.phoneboosteraction_ring".equals(intent.getAction())) {
            return;
        }
        if (a.m18239c()) {
            a.m18234a(C2455m.m17694a(intent.getIntExtra("key_ring", C2455m.Normal.m17695a())), true);
            C2542m.m19082a("noti_toolbar", "ring", null);
            return;
        }
        a.m18240d();
        m17412a(context);
    }

    private void m17412a(Context context) {
        Object systemService = context.getSystemService("statusbar");
        if (systemService != null) {
            try {
                Method method;
                Class<?> cls = Class.forName("android.app.StatusBarManager");
                if (VERSION.SDK_INT <= 16) {
                    method = cls.getMethod("collapse");
                } else {
                    method = cls.getMethod("collapsePanels");
                }
                method.setAccessible(true);
                method.invoke(systemService);
            } catch (Exception e) {
            }
        }
    }
}
