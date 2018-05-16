package utility.quickest.phonebooster.p114d;

/* compiled from: BatteryInfo */
public final class C2449g {
    private final int f13098a;
    private final int f13099b;
    private final boolean f13100c;
    private final boolean f13101d;
    private final int f13102e;

    public static boolean m17662a(int i) {
        return i >= 1000 && i <= 9999;
    }

    public C2449g(int i, int i2, boolean z, boolean z2) {
        boolean z3 = false;
        if (!C2449g.m17662a(i)) {
            i = 2300;
        }
        this.f13098a = i;
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > 100) {
            i2 = 100;
        }
        this.f13099b = i2;
        if (this.f13099b < 100 && z) {
            z3 = true;
        }
        this.f13100c = z3;
        this.f13101d = z2;
        this.f13102e = (int) ((((long) this.f13098a) * ((long) this.f13099b)) / 100);
    }

    public int m17663a() {
        return this.f13099b;
    }

    public boolean m17664b() {
        return this.f13100c;
    }

    public boolean m17665c() {
        return this.f13101d;
    }

    public int m17666d() {
        return this.f13102e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2449g)) {
            return false;
        }
        boolean z = this.f13098a == ((C2449g) obj).f13098a && this.f13099b == ((C2449g) obj).f13099b && this.f13100c == ((C2449g) obj).f13100c && this.f13101d == ((C2449g) obj).f13101d;
        return z;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        int i3 = (((this.f13098a + 37) * 37) + this.f13099b) * 37;
        if (this.f13100c) {
            i = 0;
        } else {
            i = 1;
        }
        i = (i + i3) * 37;
        if (!this.f13101d) {
            i2 = 1;
        }
        return i + i2;
    }
}
