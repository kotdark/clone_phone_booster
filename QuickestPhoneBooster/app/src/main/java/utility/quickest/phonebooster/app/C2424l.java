package utility.quickest.phonebooster.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.v4.app.NotificationCompat.Builder;
import android.text.TextUtils;
import android.widget.RemoteViews;
import utility.quickest.phonebooster.model_helper.fd;
import utility.quickest.phonebooster.p114d.C2447e;
import utility.quickest.phonebooster.R;

/* compiled from: MyApplicationLike */
class C2424l implements fd {
    final /* synthetic */ MyApplicationLike f12993a;

    C2424l(MyApplicationLike c2416d) {
        this.f12993a = c2416d;
    }

    public Notification mo3076a(C2447e c2447e, Intent intent) {
        CharSequence string;
        CharSequence string2;
        PendingIntent activity = PendingIntent.getActivity(MyApplicationLike.getApplication(), 0, intent, 134217728);
        if (TextUtils.isEmpty(c2447e.m17643e())) {
            string = MyApplicationLike.getApplication().getString(R.string.has_update_message);
        } else {
            string = c2447e.m17643e();
        }
        if (TextUtils.isEmpty(c2447e.m17644f())) {
            string2 = MyApplicationLike.getApplication().getString(R.string.update_now);
        } else {
            string2 = c2447e.m17644f();
        }
        RemoteViews remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item);
        remoteViews.setTextViewText(R.id.notice_content, string2);
        remoteViews.setTextViewText(R.id.notice_title, string);
        remoteViews.setImageViewResource(R.id.notice_icon, R.drawable.ic_launcher);
        Builder builder = new Builder(MyApplicationLike.getApplication());
        builder.setTicker(string).setWhen(System.currentTimeMillis()).setPriority(2).setAutoCancel(true).setDefaults(-1).setSmallIcon(VERSION.SDK_INT >= 21 ? R.drawable.ic_notification_small_white : R.drawable.ic_notification_small).setColor(13579832).setContentTitle(string).setContentText(string2).setContent(remoteViews).setContentIntent(activity);
        if (VERSION.SDK_INT >= 26) {
            builder.setChannelId("default_nc");
        }
        return builder.build();
    }
}
