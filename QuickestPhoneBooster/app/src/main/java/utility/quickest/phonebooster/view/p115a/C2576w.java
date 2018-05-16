package utility.quickest.phonebooster.view.p115a;

/* compiled from: SpringForce */
public final class C2576w {
    double f15100a = Math.sqrt(1500.0d);
    double f15101b = 0.5d;
    private boolean f15102c = false;
    private double f15103d = 0.75d;
    private double f15104e = 46.875d;
    private double f15105f;
    private double f15106g;
    private double f15107h;
    private double f15108i = Double.MAX_VALUE;
    private final C2577x f15109j = new C2577x();

    public C2576w(float f) {
        this.f15108i = (double) f;
    }

    public C2576w m19324a(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant cannot be negative");
        }
        this.f15100a = Math.sqrt((double) f);
        this.f15102c = false;
        return this;
    }

    public C2576w m19328b(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f15101b = (double) f;
        this.f15102c = false;
        return this;
    }

    public C2576w m19329c(float f) {
        this.f15108i = (double) f;
        return this;
    }

    public float m19323a() {
        return (float) this.f15108i;
    }

    public boolean m19327a(float f, float f2) {
        if (((double) Math.abs(f2)) >= this.f15104e || ((double) Math.abs(f - m19323a())) >= this.f15103d) {
            return false;
        }
        return true;
    }

    private void m19322b() {
        if (!this.f15102c) {
            if (this.f15108i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            if (this.f15101b > 1.0d) {
                this.f15105f = ((-this.f15101b) * this.f15100a) + (this.f15100a * Math.sqrt((this.f15101b * this.f15101b) - 1.0d));
                this.f15106g = ((-this.f15101b) * this.f15100a) - (this.f15100a * Math.sqrt((this.f15101b * this.f15101b) - 1.0d));
            } else if (this.f15101b >= 0.0d && this.f15101b < 1.0d) {
                this.f15107h = this.f15100a * Math.sqrt(1.0d - (this.f15101b * this.f15101b));
            }
            this.f15102c = true;
        }
    }

    C2577x m19325a(double d, double d2, long j) {
        double pow;
        m19322b();
        double d3 = ((double) j) / 1000.0d;
        double d4 = d - this.f15108i;
        double d5;
        if (this.f15101b > 1.0d) {
            d5 = d4 - (((this.f15106g * d4) - d2) / (this.f15106g - this.f15105f));
            d4 = ((this.f15106g * d4) - d2) / (this.f15106g - this.f15105f);
            pow = (Math.pow(2.718281828459045d, this.f15106g * d3) * d5) + (Math.pow(2.718281828459045d, this.f15105f * d3) * d4);
            d3 = (Math.pow(2.718281828459045d, d3 * this.f15105f) * (d4 * this.f15105f)) + ((d5 * this.f15106g) * Math.pow(2.718281828459045d, this.f15106g * d3));
        } else if (this.f15101b == 1.0d) {
            d5 = d2 + (this.f15100a * d4);
            pow = ((d5 * d3) + d4) * Math.pow(2.718281828459045d, (-this.f15100a) * d3);
            d3 = (Math.pow(2.718281828459045d, d3 * (-this.f15100a)) * d5) + (((d4 + (d5 * d3)) * Math.pow(2.718281828459045d, (-this.f15100a) * d3)) * (-this.f15100a));
        } else {
            d5 = (((this.f15101b * this.f15100a) * d4) + d2) * (1.0d / this.f15107h);
            pow = Math.pow(2.718281828459045d, ((-this.f15101b) * this.f15100a) * d3) * ((Math.cos(this.f15107h * d3) * d4) + (Math.sin(this.f15107h * d3) * d5));
            d3 = (((Math.cos(d3 * this.f15107h) * (d5 * this.f15107h)) + ((d4 * (-this.f15107h)) * Math.sin(this.f15107h * d3))) * Math.pow(2.718281828459045d, ((-this.f15101b) * this.f15100a) * d3)) + (((-this.f15100a) * pow) * this.f15101b);
        }
        this.f15109j.f15110a = (float) (pow + this.f15108i);
        this.f15109j.f15111b = (float) d3;
        return this.f15109j;
    }

    void m19326a(double d) {
        this.f15103d = Math.abs(d);
        this.f15104e = this.f15103d * 62.5d;
    }
}
