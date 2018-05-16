package utility.quickest.phonebooster.util;

import java.util.TimeZone;
import org.joda.time.C3287q;
import org.joda.time.C3288r;
import org.joda.time.p149d.C3260z;

/* compiled from: TimeUtil */
public final class C2554z {
    private static String f14733a = null;

    public static synchronized String m19113a() {
        String str;
        synchronized (C2554z.class) {
            if (f14733a == null) {
                try {
                    f14733a = TimeZone.getDefault().getDisplayName(false, 0).trim();
                } catch (Throwable th) {
                }
            }
            str = f14733a == null ? "" : f14733a;
        }
        return str;
    }

    public static String m19114a(long j) {
        String str = null;
        try {
            str = C3260z.m23709b().m23529a(j).trim();
        } catch (Throwable th) {
        }
        return str == null ? "" : str;
    }

    public static long m19115b(long j) {
        long a;
        try {
            a = new C3287q(j).m23905d().mo3480a();
        } catch (Throwable th) {
            a = 0;
        }
        if (a < 0) {
            return 0;
        }
        return a;
    }

    public static int m19116c(long j) {
        int d;
        try {
            d = new C3288r(j).m23914d();
        } catch (Throwable th) {
            d = 0;
        }
        return (d < 0 || d > 23) ? 0 : d;
    }

    public static int m19112a(long j, long j2) {
        int i = (int) ((j2 - j) / 43200000);
        return i < 0 ? 0 : i;
    }
}
