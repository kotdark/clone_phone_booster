package utility.quickest.phonebooster.model_helper;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v4.app.NotificationCompat.Builder;
import android.widget.RemoteViews;
import utility.quickest.phonebooster.activity.MainActivity;
import utility.quickest.phonebooster.activity.PopupMemoryJunkCleanActivity;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p114d.C2454l;
import utility.quickest.phonebooster.p114d.C2455m;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;

/* compiled from: ViewHelper */
public final class jk {
    public static Notification m18757a(int i, int i2, C2454l c2454l) {
        int i3 = 10;
        if (c2454l == null) {
            return null;
        }
        CharSequence charSequence;
        boolean z;
        RemoteViews remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_always);
        Resources resources = MyApplicationLike.getApplication().getResources();
        remoteViews.setTextViewText(R.id.boost_detail, i + "%");
        remoteViews.setTextViewText(R.id.boost_txt, resources.getString(R.string.notification_toolbar_boost));
        if (i >= 70) {
            remoteViews.setImageViewResource(R.id.boost_img, R.drawable.ic_noti_boost1);
            remoteViews.setTextColor(R.id.boost_detail, resources.getColor(R.color.red2));
        } else {
            remoteViews.setImageViewResource(R.id.boost_img, R.drawable.ic_noti_boost);
            remoteViews.setTextColor(R.id.boost_detail, resources.getColor(R.color.blue_real));
        }
        String str = "";
        if (il.Celsius.equals(ig.m18707a().m18720g())) {
            charSequence = i2 + resources.getString(R.string.cpu_cooling_temperature_unit);
        } else {
            charSequence = C2542m.m19073a(i2) + resources.getString(R.string.cpu_cooling_temperature_unit1);
        }
        remoteViews.setTextViewText(R.id.cpu_cooling_detail, charSequence);
        remoteViews.setTextViewText(R.id.cpu_cooling_txt, resources.getString(R.string.notification_toolbar_cpu));
        if (i2 >= 36) {
            remoteViews.setImageViewResource(R.id.cpu_cooling_img, R.drawable.ic_noti_cpu1);
            remoteViews.setTextColor(R.id.cpu_cooling_detail, resources.getColor(R.color.red2));
        } else {
            remoteViews.setImageViewResource(R.id.cpu_cooling_img, R.drawable.ic_noti_cpu);
            remoteViews.setTextColor(R.id.cpu_cooling_detail, resources.getColor(R.color.blue_real));
        }
        remoteViews.setTextViewText(R.id.wifi_txt, resources.getString(R.string.notification_toolbar_wifi));
        if (c2454l.m17691a()) {
            remoteViews.setImageViewResource(R.id.wifi_img, R.drawable.ic_noti_wifi_on);
        } else {
            remoteViews.setImageViewResource(R.id.wifi_img, R.drawable.ic_noti_wifi_off);
        }
        int a = C2455m.Normal.m17695a();
        switch (jl.f14454a[c2454l.m17692b().ordinal()]) {
            case 1:
                remoteViews.setImageViewResource(R.id.ring_img, R.drawable.ic_noti_ring_sound);
                remoteViews.setTextViewText(R.id.ring_txt, resources.getString(R.string.notification_toolbar_sound));
                a = C2455m.Vibrate.m17695a();
                break;
            case 2:
                remoteViews.setImageViewResource(R.id.ring_img, R.drawable.ic_noti_ring_mute);
                remoteViews.setTextViewText(R.id.ring_txt, resources.getString(R.string.notification_toolbar_mu));
                a = C2455m.Normal.m17695a();
                break;
            case 3:
                remoteViews.setImageViewResource(R.id.ring_img, R.drawable.ic_noti_ring_vibration);
                remoteViews.setTextViewText(R.id.ring_txt, resources.getString(R.string.notification_toolbar_vi));
                a = C2455m.Silent.m17695a();
                break;
            default:
                remoteViews.setImageViewResource(R.id.ring_img, R.drawable.ic_noti_ring_sound);
                remoteViews.setTextViewText(R.id.ring_txt, resources.getString(R.string.notification_toolbar_sound));
                break;
        }
        remoteViews.setTextViewText(R.id.brightness_txt, resources.getString(R.string.notification_toolbar_bright));
        int c = c2454l.m17693c();
        if (c >= 0 && c <= 10) {
            remoteViews.setImageViewResource(R.id.brightness_img, R.drawable.ic_noti_brightness_10);
            i3 = 50;
        } else if (c > 10 && c <= 60) {
            remoteViews.setImageViewResource(R.id.brightness_img, R.drawable.ic_noti_brightness_50);
            i3 = 100;
        } else if (c <= 60 || c > 100) {
            remoteViews.setImageViewResource(R.id.brightness_img, R.drawable.ic_noti_brightness_auto);
        } else {
            remoteViews.setImageViewResource(R.id.brightness_img, R.drawable.ic_noti_brightness_100);
            i3 = -1;
        }
        remoteViews.setTextViewText(R.id.clean_txt, resources.getString(R.string.notification_toolbar_clean));
        PendingIntent d = PopupMemoryJunkCleanActivity.m17308d();
        PendingIntent a2 = MainActivity.m17284a((long) i2);
        Intent action = new Intent().setAction("utility.quickest.phoneboosteraction_wifi");
        String str2 = "key_wifi";
        if (c2454l.m17691a()) {
            z = false;
        } else {
            z = true;
        }
        action.putExtra(str2, z);
        PendingIntent broadcast = PendingIntent.getBroadcast(MyApplicationLike.getApplication(), 0, action, 134217728);
        action = new Intent().setAction("utility.quickest.phoneboosteraction_brightness");
        action.putExtra("key_brightness", i3);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(MyApplicationLike.getApplication(), 0, action, 134217728);
        action = new Intent().setAction("utility.quickest.phoneboosteraction_ring");
        action.putExtra("key_ring", a);
        PendingIntent broadcast3 = PendingIntent.getBroadcast(MyApplicationLike.getApplication(), 0, action, 134217728);
        PendingIntent b = MainActivity.m17288b((long) i);
        remoteViews.setOnClickPendingIntent(R.id.boost, d);
        remoteViews.setOnClickPendingIntent(R.id.cpu_cooling, a2);
        remoteViews.setOnClickPendingIntent(R.id.wifi, broadcast);
        remoteViews.setOnClickPendingIntent(R.id.brightness, broadcast2);
        remoteViews.setOnClickPendingIntent(R.id.ring, broadcast3);
        remoteViews.setOnClickPendingIntent(R.id.clean, b);
        Builder builder = new Builder(MyApplicationLike.getApplication());
        builder.setTicker("").setWhen(System.currentTimeMillis()).setPriority(2).setOngoing(true).setSmallIcon(VERSION.SDK_INT >= 21 ? R.drawable.ic_notification_small_white : R.drawable.ic_notification_small).setColor(13579832).setContentTitle("").setContentText("").setContent(remoteViews).setContentIntent(MainActivity.m17291d());
        if (VERSION.SDK_INT >= 26) {
            builder.setChannelId("always_nc");
        }
        return builder.build();
    }
}
