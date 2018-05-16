package utility.quickest.phonebooster.p111a;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build.VERSION;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: NotificationIdConfig */
public final class C2381a {
    public static void m17248a() {
        ThreadUtil.m19102b();
        try {
            if (VERSION.SDK_INT >= 26) {
                Context a = MyApplicationLike.getApplication();
                List arrayList = new ArrayList();
                arrayList.add(new NotificationChannel("default_nc", a.getString(R.string.setting_junk_clean_notice), 3));
                NotificationChannel notificationChannel = new NotificationChannel("always_nc", a.getString(R.string.setting_notification_toolbar), 3);
                notificationChannel.enableLights(false);
                notificationChannel.enableVibration(false);
                notificationChannel.setSound(null, null);
                arrayList.add(notificationChannel);
                ((NotificationManager) a.getSystemService("notification")).createNotificationChannels(arrayList);
            }
        } catch (Throwable th) {
        }
    }
}
