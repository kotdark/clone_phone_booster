package utility.quickest.phonebooster.util;

import android.support.annotation.NonNull;

/* compiled from: ThreadUtil */
final class C2552x implements Comparable<C2552x>, Runnable {
    private final Runnable f14729a;
    private final long f14730b;


    @Override
    public int compareTo(@NonNull C2552x o) {
        return m19111a((C2552x) o);
    }

    private C2552x(Runnable runnable, long j) {
        if (runnable == null) {
            throw new IllegalArgumentException("runnable is null!");
        }
        this.f14729a = runnable;
        this.f14730b = j;
    }

    public void run() {
        try {
            this.f14729a.run();
        } catch (Throwable th) {
            ThreadUtil.m19099a(false, new C2553y(this, new RuntimeException("Sub-Thread throws exception!", th)));
        }
    }

    public int m19111a(C2552x c2552x) {
        if (this.f14730b < c2552x.f14730b) {
            return 1;
        }
        if (this.f14730b > c2552x.f14730b) {
            return -1;
        }
        return 0;
    }
}
