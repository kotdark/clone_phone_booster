package utility.quickest.phonebooster.view.p115a;

import android.os.SystemClock;
import android.support.v4.util.SimpleArrayMap;
import android.view.Choreographer.FrameCallback;
import java.util.ArrayList;

/* compiled from: AnimationHandler */
class C2555a {
    public static final ThreadLocal<C2555a> f15063a = new ThreadLocal();
    private final SimpleArrayMap<C2557c, Long> f15064b = new SimpleArrayMap();
    private final ArrayList<C2557c> f15065c = new ArrayList();
    private C2558d f15066d;
    private long f15067e = 0;
    private final FrameCallback f15068f = new C2556b(this);
    private boolean f15069g = false;

    C2555a() {
    }

    public static C2555a m19265a() {
        if (f15063a.get() == null) {
            f15063a.set(new C2555a());
        }
        return (C2555a) f15063a.get();
    }

    private C2558d m19267b() {
        if (this.f15066d == null) {
            this.f15066d = new C2559e();
        }
        return this.f15066d;
    }

    public void m19274a(C2557c c2557c, long j) {
        if (this.f15065c.size() == 0) {
            m19267b().mo3150a(this.f15068f);
        }
        if (!this.f15065c.contains(c2557c)) {
            this.f15065c.add(c2557c);
        }
        if (j > 0) {
            this.f15064b.put(c2557c, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    public void m19273a(C2557c c2557c) {
        this.f15064b.remove(c2557c);
        int indexOf = this.f15065c.indexOf(c2557c);
        if (indexOf >= 0) {
            this.f15065c.set(indexOf, null);
            this.f15069g = true;
        }
    }

    private void m19266a(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f15065c.size(); i++) {
            C2557c c2557c = (C2557c) this.f15065c.get(i);
            if (c2557c != null && m19270b(c2557c, uptimeMillis)) {
                c2557c.mo3151a(j);
            }
        }
        m19272c();
    }

    private boolean m19270b(C2557c c2557c, long j) {
        Long l = (Long) this.f15064b.get(c2557c);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.f15064b.remove(c2557c);
        return true;
    }

    private void m19272c() {
        if (this.f15069g) {
            for (int size = this.f15065c.size() - 1; size >= 0; size--) {
                if (this.f15065c.get(size) == null) {
                    this.f15065c.remove(size);
                }
            }
            this.f15069g = false;
        }
    }
}
