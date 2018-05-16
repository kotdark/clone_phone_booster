package utility.quickest.phonebooster.util;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import android.util.Pair;
import android.widget.Toast;
import com.appsflyer.AppsFlyerLib;
import com.google.firebase.analytics.FirebaseAnalytics;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.model_helper.C2490a;
import utility.quickest.phonebooster.model_helper.hz;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.R;
import io.fabric.sdk.android.services.p056c.C0879b;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;

/* compiled from: MiscUtil */
public final class C2542m {
    public static String m19076a(String str) {
        String str2 = null;
        if (str != null) {
            try {
                str2 = URLEncoder.encode(str, "UTF-8");
            } catch (Exception e) {
            }
        }
        return str2;
    }

    public static String m19079a(Collection<String> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            for (String str : collection) {
                if (str != null) {
                    jSONArray.put(str);
                }
            }
        }
        return jSONArray.toString();
    }

    public static Set<String> m19089b(String str) {
        Set<String> hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String string = jSONArray.getString(i);
                    if (string != null) {
                        hashSet.add(string);
                    }
                } catch (Exception e) {
                }
            }
        } catch (Exception e2) {
        }
        return hashSet;
    }

    public static List<String> m19092c(String str) {
        List<String> arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String string = jSONArray.getString(i);
                    if (string != null) {
                        arrayList.add(string);
                    }
                } catch (Exception e) {
                }
            }
        } catch (Exception e2) {
        }
        return arrayList;
    }

    public static String m19077a(String str, boolean z) {
        BufferedReader bufferedReader;
        String stringBuilder;
        Throwable th;
        try {
            InputStream gZIPInputStream;
            byte[] decode = Base64.decode(str, 0);
            if (z) {
                gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(decode));
            } else {
                gZIPInputStream = new ByteArrayInputStream(decode);
            }
            bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream));
            try {
                StringBuilder stringBuilder2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuilder2.append(readLine).append('\n');
                }
                stringBuilder = stringBuilder2.toString();
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                    }
                }
            } catch (Exception e2) {
                try {
                    stringBuilder = "";
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                        }
                    }
                    return stringBuilder;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Exception e5) {
            bufferedReader = null;
            stringBuilder = "";
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            return stringBuilder;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            bufferedReader = null;
            th = th4;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
        return stringBuilder;
    }

    public static Pair<String, String> m19075a(long j) {
        double d = (double) j;
        if (d < 1024.0d) {
            return new Pair(C2542m.m19080a(Locale.ENGLISH, "%.0f", Double.valueOf(d)), "B");
        }
        d /= 1024.0d;
        if (d < 1024.0d) {
            return new Pair(C2542m.m19080a(Locale.ENGLISH, "%.0f", Double.valueOf(d)), "KB");
        }
        d /= 1024.0d;
        if (d < 1024.0d) {
            return new Pair(C2542m.m19080a(Locale.ENGLISH, "%.2f", Double.valueOf(d)), "MB");
        }
        d /= 1024.0d;
        return new Pair(C2542m.m19080a(Locale.ENGLISH, "%.2f", Double.valueOf(d)), "GB");
    }

    public static String m19088b(long j) {
        double d = (double) j;
        if (d < 1024.0d) {
            return C2542m.m19080a(Locale.ENGLISH, "%.0f B", Double.valueOf(d));
        }
        d /= 1024.0d;
        if (d < 1024.0d) {
            return C2542m.m19080a(Locale.ENGLISH, "%.0f KB", Double.valueOf(d));
        }
        d /= 1024.0d;
        if (d < 1024.0d) {
            return C2542m.m19080a(Locale.ENGLISH, "%.2f MB", Double.valueOf(d));
        }
        d /= 1024.0d;
        return C2542m.m19080a(Locale.ENGLISH, "%.2f GB", Double.valueOf(d));
    }

    public static String m19091c(long j) {
        if (j < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return C2542m.m19080a(Locale.ENGLISH, "%d B", Long.valueOf(j));
        }
        long j2 = j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (j2 < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return C2542m.m19080a(Locale.ENGLISH, "%d KB", Long.valueOf(j2));
        }
        j2 /= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (j2 < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return C2542m.m19080a(Locale.ENGLISH, "%d MB", Long.valueOf(j2));
        }
        j2 /= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        return C2542m.m19080a(Locale.ENGLISH, "%d GB", Long.valueOf(j2));
    }

    public static void m19081a(Notification notification) {
        if (notification != null) {
            int c = C2554z.m19116c(System.currentTimeMillis());
            if (c < 7 || c >= 23) {
                notification.defaults &= -3;
                notification.vibrate = null;
                notification.defaults &= -2;
                notification.sound = null;
            }
        }
    }

    public static Bitmap m19074a(Drawable drawable) {
        try {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Config.ARGB_8888 : Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            return null;
        }
    }

    public static String m19093d(long j) {
        String str = "";
        if (j <= 0) {
            return str;
        }
        if (j / 60 > 0) {
            str = str + (j / 60) + " " + MyApplicationLike.getApplication().getResources().getString(R.string.hour_unit);
        }
        if (j % 60 > 0) {
            return str + " " + (j % 60) + " " + MyApplicationLike.getApplication().getResources().getString(R.string.minute_unit);
        }
        return str;
    }

    public static String m19094e(long j) {
        String str = "";
        if (j <= 0) {
            return str;
        }
        if (j / 60 > 0) {
            str = str + "start1" + (j / 60) + "end1 " + MyApplicationLike.getApplication().getResources().getString(R.string.hour_unit);
        }
        if (j % 60 > 0) {
            return str + " start2" + (j % 60) + "end2 " + MyApplicationLike.getApplication().getResources().getString(R.string.minute_unit);
        }
        return str;
    }

    public static int m19073a(int i) {
        return Math.round(((((float) i) * 9.0f) / 5.0f) + 32.0f);
    }

    public static void m19082a(String str, String str2, String str3) {
        C2542m.m19083a(str, str2, str3, null);
    }

    public static void m19083a(String str, String str2, String str3, String str4) {
        C2542m.m19084a(str, str2, str3, str4, null);
    }

    public static void m19084a(String str, String str2, String str3, String str4, Boolean bool) {
        C2542m.m19086a(str, str2, str3, str4, bool, null, null);
    }

    public static void m19085a(String str, String str2, String str3, String str4, Boolean bool, String str5) {
        C2542m.m19086a(str, str2, str3, str4, bool, str5, null);
    }

    public static void m19086a(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
        ThreadUtil.m19102b();
        Set<Entry> entrySet = hz.m18683a().m18694b().entrySet();
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionId", (String) MyApplicationLike.m17418b().m17434e().first);
            bundle.putString("SessionInitFrom", (String) MyApplicationLike.m17418b().m17434e().second);
            bundle.putLong("ActionTime", System.currentTimeMillis());
            bundle.putString("ActionScreen", str);
            bundle.putString("ActionName", str2);
            bundle.putString("UserId", C2490a.m18243a().m18244b().m17612b());
            bundle.putString("Gaid", C2535e.m19046k());
            if (str3 != null) {
                bundle.putString("AdUnit", str3);
            }
            if (str4 != null) {
                bundle.putString("Percent", str4);
            }
            if (bool != null) {
                bundle.putString("EnableState", String.valueOf(bool.booleanValue()));
            }
            if (str5 != null) {
                bundle.putString("LsFunc", str5);
            }
            if (str6 != null) {
                bundle.putString("AdCustomId", str6);
            }
            for (Entry entry : entrySet) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            FirebaseAnalytics.getInstance(MyApplicationLike.getApplication()).logEvent(str + C0879b.ROLL_OVER_FILE_NAME_SEPARATOR + str2, bundle);
            if ("ad".equals(str2)) {
                FirebaseAnalytics.getInstance(MyApplicationLike.getApplication()).logEvent("ad_click_conversion", bundle);
            } else if ("ad_show".equals(str2)) {
                FirebaseAnalytics.getInstance(MyApplicationLike.getApplication()).logEvent("ad_show_conversion", bundle);
            }
        } catch (Throwable th) {
        }
        try {
            Map hashMap = new HashMap();
            hashMap.put("SessionId", MyApplicationLike.m17418b().m17434e().first);
            hashMap.put("SessionInitFrom", MyApplicationLike.m17418b().m17434e().second);
            hashMap.put("ActionTime", Long.valueOf(System.currentTimeMillis()));
            hashMap.put("ActionScreen", str);
            hashMap.put("ActionName", str2);
            hashMap.put("UserId", C2490a.m18243a().m18244b().m17612b());
            hashMap.put("Gaid", C2535e.m19046k());
            if (str3 != null) {
                hashMap.put("AdUnit", str3);
            }
            if (str4 != null) {
                hashMap.put("Percent", str4);
            }
            if (bool != null) {
                hashMap.put("EnableState", String.valueOf(bool.booleanValue()));
            }
            if (str5 != null) {
                hashMap.put("LsFunc", str5);
            }
            if (str6 != null) {
                hashMap.put("AdCustomId", str6);
            }
            for (Entry entry2 : entrySet) {
                hashMap.put(entry2.getKey(), entry2.getValue());
            }
            AppsFlyerLib.getInstance().trackEvent(MyApplicationLike.getApplication(), "TrackingEvent", hashMap);
        } catch (Throwable th2) {
        }
    }

    public static String m19078a(String str, Object... objArr) {
        String str2 = null;
        try {
            str2 = String.format(str, objArr);
        } catch (Throwable th) {
        }
        return str2 == null ? "" : str2;
    }

    public static String m19080a(Locale locale, String str, Object... objArr) {
        String str2 = null;
        try {
            str2 = String.format(locale, str, objArr);
        } catch (Throwable th) {
        }
        return str2 == null ? "" : str2;
    }

    public static boolean m19087a() {
        ThreadUtil.m19102b();
         SharedPrefHelper a =  SharedPrefHelper.m17454a();
        if (a.m17472R()) {
            a.m17525j(false);
            Toast.makeText(MyApplicationLike.getApplication(), "Exit [Test Mode]", 0).show();
            return false;
        }
        a.m17525j(true);
        Toast.makeText(MyApplicationLike.getApplication(), "Enter [Test Mode]", 0).show();
        return true;
    }

    public static boolean m19090b() {
        ThreadUtil.m19102b();
        return  SharedPrefHelper.m17454a().m17472R();
    }
}
