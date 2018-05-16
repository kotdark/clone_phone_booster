package utility.quickest.phonebooster.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import utility.quickest.phonebooster.C2380R;
import utility.quickest.phonebooster.util.ViewUtil;
import com.mopub.volley.DefaultRetryPolicy;

public class BatteryViewVertical1 extends View {
    private final int f14831a;
    private final int f14832b;
    private Paint f14833c;
    private int f14834d;
    private int f14835e;
    private int f14836f;
    private int f14837g;
    private ValueAnimator f14838h;
    private ValueAnimator f14839i;
    private float f14840j;
    private float f14841k;
    private int f14842l;
    private int f14843m;
    private float f14844n;
    private boolean f14845o;

    public BatteryViewVertical1(Context context) {
        this(context, null, 0);
    }

    public BatteryViewVertical1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BatteryViewVertical1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14831a = Color.parseColor("#99FFFFFF");
        this.f14832b = Color.parseColor("#FF30EA90");
        this.f14834d = 5;
        this.f14835e = 10;
        this.f14836f = 0;
        this.f14837g = 5;
        this.f14842l = -1;
        this.f14843m = 0;
        this.f14845o = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2380R.styleable.BatteryView, i, 0);
        this.f14834d = obtainStyledAttributes.getDimensionPixelSize(0, 5);
        this.f14835e = obtainStyledAttributes.getDimensionPixelSize(2, 10);
        this.f14836f = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.f14837g = obtainStyledAttributes.getDimensionPixelSize(4, ViewUtil.m18918a(5.0f));
        this.f14842l = obtainStyledAttributes.getColor(1, -1);
        this.f14843m = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        obtainStyledAttributes.recycle();
        m19150a();
    }

    private void m19150a() {
        this.f14833c = new Paint();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m19154b(canvas);
        m19156c(canvas);
        if (this.f14845o) {
            m19158d(canvas);
        }
        m19159e(canvas);
        m19151a(canvas);
    }

    private void m19151a(Canvas canvas) {
        m19153b();
        this.f14833c.setStyle(Style.STROKE);
        this.f14833c.setStrokeWidth((float) this.f14834d);
        this.f14833c.setColor(this.f14831a);
        canvas.drawRoundRect(new RectF((float) this.f14834d, (float) ((this.f14834d * 2) + this.f14835e), (float) (getWidth() - this.f14834d), (float) (getHeight() - this.f14834d)), (float) this.f14837g, (float) this.f14837g, this.f14833c);
    }

    private void m19154b(Canvas canvas) {
        m19153b();
        this.f14833c.setStyle(Style.FILL);
        this.f14833c.setColor(this.f14831a);
        int height = (getHeight() * 25) / 100;
        int height2 = (getHeight() * 75) / 100;
        int i = this.f14835e + this.f14834d;
        if (this.f14836f > 0) {
            height = (getWidth() - this.f14836f) / 2;
            height2 = (getWidth() + this.f14836f) / 2;
        }
        canvas.drawRoundRect(new RectF((float) height, (float) 0, (float) height2, (float) i), 6.0f, 6.0f, this.f14833c);
    }

    private void m19156c(Canvas canvas) {
        m19153b();
        this.f14833c.setStyle(Style.FILL);
        this.f14833c.setColor(this.f14831a);
        if (!this.f14845o && ((double) this.f14844n) < 0.2d) {
            this.f14833c.setColor(this.f14831a);
        }
        int width = (getWidth() - this.f14834d) - this.f14843m;
        int i = this.f14834d + this.f14843m;
        int height = (getHeight() - this.f14834d) - this.f14843m;
        int round = height - Math.round(((float) (((getHeight() - (this.f14834d * 2)) - this.f14835e) - (this.f14843m * 2))) * this.f14844n);
        if (round < ((this.f14834d * 2) + this.f14843m) + this.f14835e) {
            round = ((this.f14834d * 2) + this.f14843m) + this.f14835e;
        }
        canvas.drawRoundRect(new RectF((float) i, (float) round, (float) width, (float) height), 0.0f, 0.0f, this.f14833c);
    }

    private void m19158d(Canvas canvas) {
        m19153b();
        this.f14833c.setStyle(Style.FILL);
        this.f14833c.setColor(this.f14831a);
        int width = (getWidth() - this.f14834d) - this.f14843m;
        int i = this.f14834d + this.f14843m;
        int height = (getHeight() - this.f14834d) - this.f14843m;
        int round = height - Math.round(((float) (((getHeight() - (this.f14834d * 2)) - this.f14835e) - (this.f14843m * 2))) * this.f14840j);
        if (round < ((this.f14834d * 2) + this.f14843m) + this.f14835e) {
            round = ((this.f14834d * 2) + this.f14843m) + this.f14835e;
        }
        canvas.drawRoundRect(new RectF((float) i, (float) round, (float) width, (float) height), 0.0f, 0.0f, this.f14833c);
    }

    private void m19159e(Canvas canvas) {
        m19153b();
        this.f14833c.setStyle(Style.FILL);
        this.f14833c.setColor(this.f14832b);
        int width = (getWidth() - this.f14834d) - this.f14843m;
        int i = this.f14834d + this.f14843m;
        int height = (getHeight() - this.f14834d) - this.f14843m;
        int round = height - Math.round(((float) (((getHeight() - (this.f14834d * 2)) - this.f14835e) - (this.f14843m * 2))) * this.f14841k);
        if (round < ((this.f14834d * 2) + this.f14843m) + this.f14835e) {
            round = ((this.f14834d * 2) + this.f14843m) + this.f14835e;
        }
        canvas.drawRoundRect(new RectF((float) i, (float) round, (float) width, (float) height), 0.0f, 0.0f, this.f14833c);
    }

    private void m19153b() {
        this.f14833c.reset();
        this.f14833c.setFlags(1);
    }

    public void setmCurrentEnegryPercent(int i) {
        this.f14844n = ((float) i) / 100.0f;
        invalidate();
    }

    public void setmIsCharging(boolean z) {
        this.f14845o = z;
        if (this.f14845o) {
            m19155c();
        } else {
            m19157d();
        }
    }

    private void m19155c() {
        this.f14838h = ValueAnimator.ofFloat(new float[]{0.0f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - this.f14844n});
        this.f14838h.setDuration(2000);
        this.f14838h.setRepeatCount(-1);
        this.f14838h.addUpdateListener(new C2593r(this));
        this.f14838h.start();
    }

    private void m19157d() {
        if (this.f14838h != null) {
            this.f14838h.end();
        }
        setmCurrentEnegryPercent((int) (this.f14844n * 100.0f));
        this.f14840j = 0.0f;
    }

    public void m19160a(float f, C2470u c2470u) {
        this.f14839i = ValueAnimator.ofFloat(new float[]{0.0f, f});
        this.f14839i.setDuration(2000);
        this.f14839i.setRepeatCount(0);
        this.f14839i.addUpdateListener(new C2594s(this));
        this.f14839i.addListener(new C2595t(this, c2470u));
        this.f14839i.start();
    }
}
