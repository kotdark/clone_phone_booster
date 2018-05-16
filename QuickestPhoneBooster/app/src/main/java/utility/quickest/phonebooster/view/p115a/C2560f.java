package utility.quickest.phonebooster.view.p115a;

import android.os.Looper;
import android.support.v4.widget.AutoScrollHelper;
import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;

/* compiled from: DynamicAnimation */
public abstract class C2560f<T extends C2560f<T>> implements C2557c {
    public static final C2561u f15073a = new C2562g("translationX");
    public static final C2561u f15074b = new C2566k("translationY");
    public static final C2561u f15075c = new C2567l("scaleX");
    public static final C2561u f15076d = new C2568m("scaleY");
    public static final C2561u f15077e = new C2569n("rotation");
    public static final C2561u f15078f = new C2570o("rotationX");
    public static final C2561u f15079g = new C2571p("rotationY");
    public static final C2561u f15080h = new C2572q("x");
    public static final C2561u f15081i = new C2573r("y");
    public static final C2561u f15082j = new C2563h("alpha");
    public static final C2561u f15083k = new C2564i("scrollX");
    public static final C2561u f15084l = new C2565j("scrollY");
    float f15085m = 0.0f;
    float f15086n = AutoScrollHelper.NO_MAX;
    boolean f15087o = false;
    final View f15088p;
    final C2561u f15089q;
    boolean f15090r = false;
    float f15091s = AutoScrollHelper.NO_MAX;
    float f15092t = (-this.f15091s);
    private long f15093u = 0;
    private final ArrayList<C2468s> f15094v = new ArrayList();
    private final ArrayList<C2574t> f15095w = new ArrayList();

    abstract boolean mo3155a(float f, float f2);

    abstract boolean mo3157b(long j);

    C2560f(View view, C2561u c2561u) {
        this.f15088p = view;
        this.f15089q = c2561u;
    }

    public T m19282a(float f) {
        this.f15086n = f;
        this.f15087o = true;
        return this;
    }

    public T m19283a(C2468s c2468s) {
        if (!this.f15094v.contains(c2468s)) {
            this.f15094v.add(c2468s);
        }
        return this;
    }

    private static <T> void m19278a(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public void mo3154a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.f15090r) {
            mo3156b();
        }
    }

    private void mo3156b() {
        if (!this.f15090r) {
            this.f15090r = true;
            if (!this.f15087o) {
                this.f15086n = m19281c();
            }
            if (this.f15086n > this.f15091s || this.f15086n < this.f15092t) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            C2555a.m19265a().m19274a((C2557c) this, 0);
        }
    }

    public boolean mo3151a(long j) {
        if (this.f15093u == 0) {
            this.f15093u = j;
            m19287b(this.f15086n);
            return false;
        }
        long j2 = j - this.f15093u;
        this.f15093u = j;
        boolean b = mo3157b(j2);
        this.f15086n = Math.min(this.f15086n, this.f15091s);
        this.f15086n = Math.max(this.f15086n, this.f15092t);
        m19287b(this.f15086n);
        if (b) {
            m19279a(false);
        }
        return b;
    }

    private void m19279a(boolean z) {
        this.f15090r = false;
        C2555a.m19265a().m19273a((C2557c) this);
        this.f15093u = 0;
        this.f15087o = false;
        for (int i = 0; i < this.f15094v.size(); i++) {
            if (this.f15094v.get(i) != null) {
                ((C2468s) this.f15094v.get(i)).mo3109a(this, z, this.f15086n, this.f15085m);
            }
        }
        C2560f.m19278a(this.f15094v);
    }

    void m19287b(float f) {
        this.f15089q.mo3153a(this.f15088p, f);
        for (int i = 0; i < this.f15095w.size(); i++) {
            if (this.f15095w.get(i) != null) {
                ((C2574t) this.f15095w.get(i)).m19315a(this, this.f15086n, this.f15085m);
            }
        }
        C2560f.m19278a(this.f15095w);
    }

    private float m19281c() {
        return this.f15089q.mo3152a(this.f15088p);
    }
}
