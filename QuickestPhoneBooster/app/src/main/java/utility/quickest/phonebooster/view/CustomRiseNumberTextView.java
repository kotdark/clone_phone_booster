package utility.quickest.phonebooster.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.TextView;
import utility.quickest.phonebooster.util.C2542m;
import java.text.DecimalFormat;

public class CustomRiseNumberTextView extends TextView {
    private int f14886a = 0;
    private int f14887b = 2;
    private float f14888c;
    private float f14889d;
    private long f14890e = 1500;
    private DecimalFormat f14891f = new DecimalFormat("##0.00");
    private ab f14892g = null;
    private ac f14893h = null;

    public CustomRiseNumberTextView(Context context) {
        super(context);
    }

    public CustomRiseNumberTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomRiseNumberTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void m19191a() {
        if (!m19186b()) {
            this.f14886a = 1;
            switch (this.f14887b) {
                case 1:
                    m19190e();
                    return;
                case 2:
                    m19188c();
                    return;
                case 3:
                    m19189d();
                    return;
                default:
                    return;
            }
        }
    }

    private boolean m19186b() {
        return this.f14886a == 1;
    }

    private void m19188c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f14889d, this.f14888c});
        ofFloat.setDuration(this.f14890e);
        ofFloat.addUpdateListener(new C2599y(this));
        ofFloat.start();
    }

    private void m19189d() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f14889d, this.f14888c});
        ofFloat.setDuration(this.f14890e);
        ofFloat.addUpdateListener(new C2600z(this));
        ofFloat.start();
    }

    private void m19190e() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{(int) this.f14889d, (int) this.f14888c});
        ofInt.setDuration(this.f14890e);
        ofInt.addUpdateListener(new aa(this));
        ofInt.start();
    }

    public void setTextNumber(float f) {
        this.f14888c = f;
        this.f14887b = 2;
    }

    public void setTextNumber(int i) {
        this.f14888c = (float) i;
        this.f14887b = 1;
    }

    public void setTextNumber(long j) {
        this.f14888c = (float) j;
        this.f14887b = 3;
    }

    public void setDuration(long j) {
        this.f14890e = j;
    }

    public void setOnRiseNumberFinishListener(ab abVar) {
        this.f14892g = abVar;
    }

    public void setOnRiseNumberUpdateListener(ac acVar) {
        this.f14893h = acVar;
    }

    private Pair<String, String> m19182a(float f) {
        double d = (double) f;
        if (d < 1024.0d) {
            return new Pair(C2542m.m19078a("%.0f", Double.valueOf(d)), "B");
        }
        d /= 1024.0d;
        if (d < 1024.0d) {
            return new Pair(C2542m.m19078a("%.0f", Double.valueOf(d)), "KB");
        }
        if (d / 1024.0d < 1024.0d) {
            return new Pair(C2542m.m19078a("%.2f", Double.valueOf(d / 1024.0d)), "MB");
        }
        return new Pair(C2542m.m19078a("%.2f", Double.valueOf((d / 1024.0d) / 1024.0d)), "GB");
    }
}
