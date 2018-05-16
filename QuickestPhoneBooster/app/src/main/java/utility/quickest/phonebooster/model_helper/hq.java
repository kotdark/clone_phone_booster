package utility.quickest.phonebooster.model_helper;

import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import com.google.firebase.messaging.C2268a;
import com.google.firebase.messaging.RemoteMessage;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.Map;

/* compiled from: PushModel */
public final class hq {
    private static volatile hq f14351a = null;

    public static hq m18670a() {
        if (f14351a == null) {
            synchronized (hq.class) {
                if (f14351a == null) {
                    f14351a = new hq();
                }
            }
        }
        return f14351a;
    }

    public void m18675a(String str, WakeLock wakeLock) {
        ThreadUtil.m19102b();
        try {
            C2268a.m16680a().m16681a("KeepTick");
        } catch (Throwable th) {
        }
        if (str != null) {
            str = str.trim();
        }
        if (!TextUtils.isEmpty(str)) {
             SharedPrefHelper a =  SharedPrefHelper.m17454a();
            if (!a.m17543r().equals(str)) {
                a.m17494c(str);
                is.m18737a("PushRegister", "GCM", System.currentTimeMillis(), str);
            }
        }
        if (wakeLock != null) {
            try {
                wakeLock.release();
            } catch (Throwable th2) {
            }
        }
    }

    public void m18674a(RemoteMessage remoteMessage, WakeLock wakeLock) {
        ThreadUtil.m19102b();
        if (remoteMessage != null) {
            try {
                Answers.getInstance().logCustom((CustomEvent) new CustomEvent("PushReceived-Updated").putCustomAttribute("From", String.valueOf(remoteMessage.m16678a())));
            } catch (Throwable th) {
            }
            m18672a(remoteMessage.m16679b(), wakeLock);
        } else if (wakeLock != null) {
            try {
                wakeLock.release();
            } catch (Throwable th2) {
            }
        }
    }

    private hq() {
        ThreadUtil.m19098a(new hr(this), 60000);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m18672a(java.util.Map<java.lang.String, java.lang.String> r6, android.os.PowerManager.WakeLock r7) {
        /*
        r5 = this;
        r1 = 1;
        r2 = 0;
        utility.quickest.phonebooster.util.ThreadUtil.m19102b();
        r0 = "type";
        r0 = r6.get(r0);	 Catch:{ Throwable -> 0x0064, all -> 0x0062 }
        r0 = (java.lang.String) r0;	 Catch:{ Throwable -> 0x0064, all -> 0x0062 }
        r0 = r0.trim();	 Catch:{ Throwable -> 0x0064, all -> 0x0062 }
        r3 = r0.toLowerCase();	 Catch:{ Throwable -> 0x0064, all -> 0x0062 }
        r0 = -1;
        r4 = r3.hashCode();	 Catch:{ Throwable -> 0x0064, all -> 0x0062 }
        switch(r4) {
            case -2002050389: goto L_0x0035;
            case 112217419: goto L_0x002a;
            default: goto L_0x001e;
        };
    L_0x001e:
        switch(r0) {
            case 0: goto L_0x0040;
            case 1: goto L_0x0050;
            default: goto L_0x0021;
        };
    L_0x0021:
        r2 = r1;
    L_0x0022:
        if (r2 == 0) goto L_0x0029;
    L_0x0024:
        if (r7 == 0) goto L_0x0029;
    L_0x0026:
        r7.release();	 Catch:{ Throwable -> 0x005e }
    L_0x0029:
        return;
    L_0x002a:
        r4 = "visit";
        r3 = r3.equals(r4);	 Catch:{ Throwable -> 0x0064, all -> 0x0062 }
        if (r3 == 0) goto L_0x001e;
    L_0x0033:
        r0 = r2;
        goto L_0x001e;
    L_0x0035:
        r4 = "splash2";
        r3 = r3.equals(r4);	 Catch:{ Throwable -> 0x0064, all -> 0x0062 }
        if (r3 == 0) goto L_0x001e;
    L_0x003e:
        r0 = r1;
        goto L_0x001e;
    L_0x0040:
        r5.m18673b(r6, r7);	 Catch:{ Throwable -> 0x0044, all -> 0x0054 }
        goto L_0x0022;
    L_0x0044:
        r0 = move-exception;
        r0 = r2;
    L_0x0046:
        if (r0 == 0) goto L_0x0029;
    L_0x0048:
        if (r7 == 0) goto L_0x0029;
    L_0x004a:
        r7.release();	 Catch:{ Throwable -> 0x004e }
        goto L_0x0029;
    L_0x004e:
        r0 = move-exception;
        goto L_0x0029;
    L_0x0050:
        r5.m18671a(r7);	 Catch:{ Throwable -> 0x0044, all -> 0x0054 }
        goto L_0x0022;
    L_0x0054:
        r0 = move-exception;
        r1 = r2;
    L_0x0056:
        if (r1 == 0) goto L_0x005d;
    L_0x0058:
        if (r7 == 0) goto L_0x005d;
    L_0x005a:
        r7.release();	 Catch:{ Throwable -> 0x0060 }
    L_0x005d:
        throw r0;
    L_0x005e:
        r0 = move-exception;
        goto L_0x0029;
    L_0x0060:
        r1 = move-exception;
        goto L_0x005d;
    L_0x0062:
        r0 = move-exception;
        goto L_0x0056;
    L_0x0064:
        r0 = move-exception;
        r0 = r1;
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: utility.quickest.phonebooster.model_helper.hq.a(java.util.Map, android.os.PowerManager$WakeLock):void");
    }

    private void m18673b(Map<String, String> map, WakeLock wakeLock) {
        ThreadUtil.m19102b();
        ThreadUtil.m19097a("Push-Visit", new hs(this, map, C2490a.m18243a().m18244b(), wakeLock));
    }

    private void m18671a(WakeLock wakeLock) {
        ThreadUtil.m19102b();
        C2492b.m18285a().m18325a(db.SPLASH2, new hv(this, wakeLock));
    }
}
