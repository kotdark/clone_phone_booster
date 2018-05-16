package utility.quickest.phonebooster.p114d;

/* compiled from: SwitchInfo */
public final class C2454l {
    private final boolean f13124a;
    private final C2455m f13125b;
    private final int f13126c;

    public C2454l(boolean z, C2455m c2455m, int i) {
        this.f13124a = z;
        if (c2455m == null) {
            c2455m = C2455m.Normal;
        }
        this.f13125b = c2455m;
        if (i < -1) {
            i = -1;
        } else if (i > 100) {
            i = 100;
        }
        this.f13126c = i;
    }

    public boolean m17691a() {
        return this.f13124a;
    }

    public C2455m m17692b() {
        return this.f13125b;
    }

    public int m17693c() {
        return this.f13126c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2454l)) {
            return false;
        }
        boolean z;
        if (this.f13124a == ((C2454l) obj).f13124a && this.f13125b.equals(((C2454l) obj).f13125b) && this.f13126c == ((C2454l) obj).f13126c) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((((this.f13124a ? 1 : 0) + 37) * 37) + this.f13125b.m17695a()) * 37) + this.f13126c;
    }
}
