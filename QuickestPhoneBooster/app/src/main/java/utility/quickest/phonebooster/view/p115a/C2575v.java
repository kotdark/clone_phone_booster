package utility.quickest.phonebooster.view.p115a;

import android.support.v4.widget.AutoScrollHelper;
import android.view.View;

/* compiled from: SpringAnimation */
public final class C2575v extends C2560f<C2575v> {
    private C2576w f15097u = null;
    private float f15098v = AutoScrollHelper.NO_MAX;
    private boolean f15099w = false;

    public C2575v(View view, C2561u c2561u, float f) {
        super(view, c2561u);
        this.f15097u = new C2576w(f);
        m19316c();
    }

    public C2576w mo3156b() {
        return this.f15097u;
    }

    public void mo3154a() {
        m19317d();
        super.mo3154a();
    }

    private void m19316c() {
        if (this.q == e || this.q == f || this.q == g) {
            this.f15097u.m19326a(0.0020833333333333333d);
        } else if (this.q == j) {
            this.f15097u.m19326a(0.0029411764705882353d);
        } else if (this.q == c || this.q == d) {
            this.f15097u.m19326a(0.0015d);
        } else {
            this.f15097u.m19326a(0.75d);
        }
    }

    private void m19317d() {
        if (this.f15097u == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double a = (double) this.f15097u.m19323a();
        if (a > ((double) this.s)) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        } else if (a < ((double) this.t)) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    boolean mo3157b(long j) {
        if (this.f15099w) {
            if (this.f15098v != AutoScrollHelper.NO_MAX) {
                this.f15097u.m19329c(this.f15098v);
                this.f15098v = AutoScrollHelper.NO_MAX;
            }
            this.n = this.f15097u.m19323a();
            this.m = 0.0f;
            this.f15099w = false;
            return true;
        }
        C2577x a;
        if (this.f15098v != AutoScrollHelper.NO_MAX) {
            double a2 = (double) this.f15097u.m19323a();
            a = this.f15097u.m19325a((double) this.n, (double) this.m, j / 2);
            this.f15097u.m19329c(this.f15098v);
            this.f15098v = AutoScrollHelper.NO_MAX;
            a = this.f15097u.m19325a((double) a.f15110a, (double) a.f15111b, j / 2);
            this.n = a.f15110a;
            this.m = a.f15111b;
        } else {
            a = this.f15097u.m19325a((double) this.n, (double) this.m, j);
            this.n = a.f15110a;
            this.m = a.f15111b;
        }
        this.n = Math.max(this.n, this.t);
        this.n = Math.min(this.n, this.s);
        if (!mo3155a(this.n, this.m)) {
            return false;
        }
        this.n = this.f15097u.m19323a();
        this.m = 0.0f;
        return true;
    }

    boolean mo3155a(float f, float f2) {
        return this.f15097u.m19327a(f, f2);
    }
}
