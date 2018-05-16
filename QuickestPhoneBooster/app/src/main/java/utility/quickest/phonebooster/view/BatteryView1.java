package utility.quickest.phonebooster.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import utility.quickest.phonebooster.C2380R;
import utility.quickest.phonebooster.util.ViewUtil;
import com.mopub.volley.DefaultRetryPolicy;

public class BatteryView1 extends View {
    private Paint f14811a;
    private int f14812b;
    private int f14813c;
    private int f14814d;
    private int f14815e;
    private ValueAnimator f14816f;
    private float f14817g;
    private int f14818h;
    private int f14819i;
    private float f14820j;
    private boolean f14821k;

    public BatteryView1(Context context) {
        this(context, null, 0);
    }

    public BatteryView1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BatteryView1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14812b = 5;
        this.f14813c = 10;
        this.f14814d = 0;
        this.f14815e = 5;
        this.f14818h = -1;
        this.f14819i = 0;
        this.f14821k = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2380R.styleable.BatteryView, i, 0);
        this.f14812b = obtainStyledAttributes.getDimensionPixelSize(0, 5);
        this.f14813c = obtainStyledAttributes.getDimensionPixelSize(2, 10);
        this.f14814d = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.f14815e = obtainStyledAttributes.getDimensionPixelSize(4, ViewUtil.m18918a(5.0f));
        this.f14818h = obtainStyledAttributes.getColor(1, -1);
        this.f14819i = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        obtainStyledAttributes.recycle();
        m19132a();
    }

    private void m19132a() {
        this.f14811a = new Paint();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m19135b(canvas);
        m19137c(canvas);
        if (this.f14821k) {
            m19139d(canvas);
        }
        m19133a(canvas);
    }

    private void m19133a(Canvas canvas) {
        m19134b();
        this.f14811a.setStyle(Style.STROKE);
        this.f14811a.setStrokeWidth((float) this.f14812b);
        this.f14811a.setColor(this.f14818h);
        canvas.drawRoundRect(new RectF((float) this.f14812b, (float) this.f14812b, (float) ((getWidth() - this.f14813c) - this.f14812b), (float) (getHeight() - this.f14812b)), (float) this.f14815e, (float) this.f14815e, this.f14811a);
    }

    private void m19135b(Canvas canvas) {
        m19134b();
        this.f14811a.setStyle(Style.FILL);
        this.f14811a.setColor(this.f14818h);
        int width = (getWidth() - this.f14813c) - this.f14812b;
        int height = (getHeight() * 25) / 100;
        int width2 = getWidth();
        int height2 = (getHeight() * 75) / 100;
        if (this.f14814d > 0) {
            height = (getHeight() - this.f14814d) / 2;
            height2 = (getHeight() + this.f14814d) / 2;
        }
        canvas.drawRoundRect(new RectF((float) width, (float) height, (float) width2, (float) height2), 0.0f, 0.0f, this.f14811a);
    }

    private void m19137c(Canvas canvas) {
        m19134b();
        this.f14811a.setStyle(Style.FILL);
        this.f14811a.setColor(-1);
        if (!this.f14821k && ((double) this.f14820j) < 0.2d) {
            this.f14811a.setColor(-1);
        }
        int i = this.f14812b + this.f14819i;
        canvas.drawRoundRect(new RectF((float) i, (float) (this.f14812b + this.f14819i), (float) (Math.round(((float) (((getWidth() - (this.f14812b * 2)) - this.f14813c) - (this.f14819i * 2))) * this.f14820j) + i), (float) ((getHeight() - this.f14812b) - this.f14819i)), (float) this.f14815e, (float) this.f14815e, this.f14811a);
    }

    private void m19139d(Canvas canvas) {
        m19134b();
        this.f14811a.setStyle(Style.FILL);
        this.f14811a.setColor(-1);
        int width = ((getWidth() - (this.f14812b * 2)) - this.f14813c) - (this.f14819i * 2);
        int round = ((this.f14812b + this.f14819i) + Math.round(((float) width) * this.f14820j)) - (this.f14815e * 2);
        if (round < this.f14812b + this.f14819i) {
            round = this.f14812b + this.f14819i;
        }
        canvas.drawRoundRect(new RectF((float) round, (float) (this.f14812b + this.f14819i), (float) ((Math.round(((float) width) * this.f14817g) + round) + (this.f14815e * 2)), (float) ((getHeight() - this.f14812b) - this.f14819i)), (float) this.f14815e, (float) this.f14815e, this.f14811a);
    }

    private void m19134b() {
        this.f14811a.reset();
        this.f14811a.setFlags(1);
    }

    public void setmCurrentEnegryPercent(int i) {
        this.f14820j = ((float) i) / 100.0f;
        invalidate();
    }

    public void setmIsCharging(boolean z) {
        this.f14821k = z;
        if (this.f14821k) {
            m19136c();
        } else {
            m19138d();
        }
    }

    private void m19136c() {
        this.f14816f = ValueAnimator.ofFloat(new float[]{0.0f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - this.f14820j});
        this.f14816f.setDuration(2000);
        this.f14816f.setRepeatCount(-1);
        this.f14816f.addUpdateListener(new C2591p(this));
        this.f14816f.start();
    }

    private void m19138d() {
        if (this.f14816f != null) {
            this.f14816f.end();
        }
        setmCurrentEnegryPercent((int) (this.f14820j * 100.0f));
        this.f14817g = 0.0f;
    }
}
