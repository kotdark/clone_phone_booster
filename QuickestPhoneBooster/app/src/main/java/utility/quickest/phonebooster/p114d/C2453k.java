package utility.quickest.phonebooster.p114d;

import android.text.TextUtils;

/* compiled from: ProcessRunningInfo */
public final class C2453k {
    private final int f13121a;
    private final String f13122b;
    private final long f13123c;

    public static C2453k m17689a(int i, String str, long j) {
        try {
            return new C2453k(i, str, j);
        } catch (Exception e) {
            return null;
        }
    }

    private C2453k(int i, String str, long j) {
        if (i <= 0) {
            throw new IllegalArgumentException("pid is less or equal zero!");
        }
        this.f13121a = i;
        if (str != null) {
            str = str.trim();
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("name is empty!");
        }
        this.f13122b = str;
        if (j <= 0) {
            throw new IllegalArgumentException("memorySize is less or equal zero!");
        }
        this.f13123c = j;
    }

    public long m17690a() {
        return this.f13123c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2453k)) {
            return false;
        }
        if (this.f13121a != ((C2453k) obj).f13121a) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Integer.valueOf(this.f13121a).hashCode();
    }
}
