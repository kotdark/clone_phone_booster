package utility.quickest.phonebooster.app;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.v4.app.NotificationCompat.Builder;
import android.text.Html;
import android.text.TextUtils;
import android.widget.RemoteViews;
import utility.quickest.phonebooster.activity.MainActivity;
import utility.quickest.phonebooster.model_helper.fs;
import utility.quickest.phonebooster.model_helper.ft;
import utility.quickest.phonebooster.p114d.C2446d;
import utility.quickest.phonebooster.p114d.C2453k;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* compiled from: MyApplicationLike */
class C2423k implements fs {
    final /* synthetic */ MyApplicationLike f12992a;

    C2423k(MyApplicationLike c2416d) {
        this.f12992a = c2416d;
    }

    public Notification mo3075a(ft ftVar, long j, Set<String> set) {
        PendingIntent a;
        String a2;
        RemoteViews remoteViews;
        String str = "";
        int nextInt = new Random().nextInt(3);
        String string;
        switch (C2419g.f12987a[ftVar.ordinal()]) {
            case 1:
                a = MainActivity.m17285a(j, ftVar.m18550a());
                if (nextInt != 0) {
                    if (nextInt != 1) {
                        a2 = C2542m.m19078a(MyApplicationLike.getApplication().getString(R.string.notification_junk_with_size), C2542m.m19091c(j));
                        remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_junk_with_size);
                        remoteViews.setTextViewText(R.id.notice_title, Html.fromHtml(a2));
                        break;
                    }
                    a2 = MyApplicationLike.getApplication().getString(R.string.notification_junk_with_size2);
                    remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_junk_with_size2);
                    break;
                }
                a2 = MyApplicationLike.getApplication().getString(R.string.notification_junk_with_size1);
                remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_junk_with_size1);
                break;
            case 2:
                a = MainActivity.m17289b(j, ftVar.m18550a());
                if (nextInt != 0) {
                    if (nextInt != 1) {
                        a2 = MyApplicationLike.getApplication().getString(R.string.notification_junk_without_size);
                        remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_junk_without_size);
                        remoteViews.setTextViewText(R.id.notice_title, Html.fromHtml(a2));
                        break;
                    }
                    a2 = MyApplicationLike.getApplication().getString(R.string.notification_junk_without_size2);
                    remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_junk_without_size2);
                    break;
                }
                a2 = MyApplicationLike.getApplication().getString(R.string.notification_junk_without_size1);
                remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_junk_without_size1);
                break;
            case 3:
                PendingIntent c = MainActivity.m17290c(j, ftVar.m18550a());
                if (nextInt != 0) {
                    if (nextInt != 1) {
                        string = MyApplicationLike.getApplication().getString(R.string.notification_ram_with_size);
                        RemoteViews remoteViews2 = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_ram_without_size);
                        remoteViews2.setTextViewText(R.id.notice_title, Html.fromHtml(string));
                        remoteViews2.setTextViewText(R.id.notice_title1, Html.fromHtml(string));
                        remoteViews2.setViewVisibility(R.id.notice_title, 8);
                        remoteViews2.setViewVisibility(R.id.notice_title1, 0);
                        remoteViews2.setViewVisibility(R.id.notice_apps_container, 8);
                        List arrayList = new ArrayList();
                        for (String a22 : set) {
                            arrayList.add(a22);
                        }
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size && i <= 10) {
                            Bitmap a3 = C2542m.m19074a(C2535e.m19029a((String) arrayList.get(i)));
                            if (a3 != null) {
                                remoteViews2.setViewVisibility(R.id.notice_title, 0);
                                remoteViews2.setViewVisibility(R.id.notice_title1, 8);
                                remoteViews2.setViewVisibility(R.id.notice_apps_container, 0);
                                if (i == 0) {
                                    remoteViews2.setImageViewBitmap(R.id.notice_apps_01, a3);
                                }
                                if (i == 1) {
                                    remoteViews2.setImageViewBitmap(R.id.notice_apps_02, a3);
                                }
                                if (i == 2) {
                                    remoteViews2.setImageViewBitmap(R.id.notice_apps_03, a3);
                                }
                                if (i == 3) {
                                    remoteViews2.setImageViewBitmap(R.id.notice_apps_04, a3);
                                }
                                if (i == 4) {
                                    remoteViews2.setImageViewBitmap(R.id.notice_apps_05, a3);
                                }
                                if (i == 5) {
                                    remoteViews2.setImageViewBitmap(R.id.notice_apps_06, a3);
                                }
                                if (i == 6) {
                                    remoteViews2.setImageViewBitmap(R.id.notice_apps_07, a3);
                                }
                                if (i == 7) {
                                    remoteViews2.setImageViewBitmap(R.id.notice_apps_08, a3);
                                }
                                if (i == 8) {
                                    remoteViews2.setImageViewBitmap(R.id.notice_apps_09, a3);
                                }
                                if (i == 9) {
                                    remoteViews2.setImageViewBitmap(R.id.notice_apps_10, a3);
                                }
                                i++;
                            }
                        }
                        a22 = string;
                        remoteViews = remoteViews2;
                        a = c;
                        break;
                    }
                    a22 = MyApplicationLike.getApplication().getString(R.string.notification_ram_without_size2);
                    remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_ram_without_size2);
                    a = c;
                    break;
                }
                a22 = MyApplicationLike.getApplication().getString(R.string.notification_ram_without_size1);
                remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_ram_without_size1);
                a = c;
                break;
                break;
            case 4:
                a = MainActivity.m17292d(j, ftVar.m18550a());
                if (nextInt != 0) {
                    if (nextInt != 1) {
                        a22 = C2542m.m19078a(MyApplicationLike.getApplication().getString(R.string.notification_ram_without_size), j + "%");
                        remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_ram_with_size);
                        remoteViews.setTextViewText(R.id.notice_title, Html.fromHtml(a22));
                        break;
                    }
                    a22 = MyApplicationLike.getApplication().getString(R.string.notification_ram_with_size2);
                    remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_ram_with_size2);
                    break;
                }
                a22 = MyApplicationLike.getApplication().getString(R.string.notification_ram_with_size1);
                remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_ram_with_size1);
                break;
            case 5:
                a = MainActivity.m17293e(j, ftVar.m18550a());
                if (new Random().nextInt(2) != 0) {
                    a22 = MyApplicationLike.getApplication().getString(R.string.notification_fake_low_power);
                    remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_fake_low_power);
                    remoteViews.setTextViewText(R.id.notice_title, a22);
                    break;
                }
                a22 = MyApplicationLike.getApplication().getString(R.string.notification_fake_low_power1);
                remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_fake_low_power1);
                break;
            case 6:
                a = MainActivity.m17294f(j, ftVar.m18550a());
                if (new Random().nextInt(2) != 0) {
                    a22 = C2542m.m19078a(MyApplicationLike.getApplication().getString(R.string.notification_low_power), "35%");
                    remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_low_power);
                    remoteViews.setTextViewText(R.id.notice_title, a22);
                    break;
                }
                try {
                    List<RunningAppProcessInfo> o = C2535e.m19050o();
                    Set keySet = C2535e.m19030a(false).keySet();
                    Map hashMap = new HashMap();
                    for (RunningAppProcessInfo runningAppProcessInfo : o) {
                        if (runningAppProcessInfo.pkgList != null) {
                            for (String string2 : runningAppProcessInfo.pkgList) {
                                String trim;
                                if (string2 != null) {
                                    trim = string2.trim();
                                } else {
                                    trim = string2;
                                }
                                if (!(TextUtils.isEmpty(trim) || trim.equals("utility.quickest.phonebooster") || !keySet.contains(trim))) {
                                    C2453k a4 = C2453k.m17689a(runningAppProcessInfo.pid, runningAppProcessInfo.processName, C2535e.m19028a(runningAppProcessInfo.pid));
                                    C2446d c2446d = (C2446d) hashMap.get(trim);
                                    if (c2446d == null) {
                                        Collection arrayList2 = new ArrayList();
                                        arrayList2.add(a4);
                                        c2446d = C2446d.m17627a(trim, arrayList2);
                                    } else {
                                        c2446d = c2446d.m17628a(a4);
                                    }
                                    if (c2446d != null) {
                                        hashMap.put(c2446d.m17629a(), c2446d);
                                    }
                                }
                            }
                        }
                    }
                    int size2 = hashMap.keySet().size();
                    try {
                        a22 = C2542m.m19078a(MyApplicationLike.getApplication().getString(R.string.notification_low_power1), String.valueOf(size2));
                    } catch (Throwable th) {
                    }
                } catch (Throwable th2) {
                    a22 = str;
                }
                remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_low_power1);
                remoteViews.setTextViewText(R.id.notice_title, a22);
                break;
            case 7:
                a = MainActivity.m17295g(j, ftVar.m18550a());
                a22 = MyApplicationLike.getApplication().getString(R.string.notification_very_low_power);
                remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_very_low_power);
                remoteViews.setTextViewText(R.id.notice_title, Html.fromHtml(a22));
                break;
            case 8:
                a = MainActivity.m17296h(j, ftVar.m18550a());
                if (!new Random().nextBoolean()) {
                    a22 = MyApplicationLike.getApplication().getString(R.string.antivirus_notification_content1);
                    remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_antivirus1);
                    break;
                }
                a22 = C2542m.m19078a(MyApplicationLike.getApplication().getString(R.string.antivirus_notification_content), String.valueOf(j));
                remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_antivirus);
                remoteViews.setTextViewText(R.id.notice_title, a22);
                break;
            case 9:
                a = MainActivity.m17297i(j, ftVar.m18550a());
                a22 = MyApplicationLike.getApplication().getString(R.string.cpu_notification_content);
                remoteViews = new RemoteViews("utility.quickest.phonebooster", R.layout.notification_item_cpu_cooling);
                remoteViews.setTextViewText(R.id.notice_title, a22);
                remoteViews.setTextViewText(R.id.notice_action, MyApplicationLike.getApplication().getResources().getString(R.string.install_clean_apk_suc_dialog_yes));
                break;
            default:
                return null;
        }
        Builder builder = new Builder(MyApplicationLike.getApplication());
        builder.setTicker(Html.fromHtml(a22)).setWhen(System.currentTimeMillis()).setPriority(2).setAutoCancel(true).setDefaults(-1).setSmallIcon(VERSION.SDK_INT >= 21 ? R.drawable.ic_notification_small_white : R.drawable.ic_notification_small).setColor(13579832).setContentTitle(Html.fromHtml(a22)).setContentText("").setContent(remoteViews).setContentIntent(a);
        if (VERSION.SDK_INT >= 26) {
            builder.setChannelId("default_nc");
        }
        return builder.build();
    }
}
