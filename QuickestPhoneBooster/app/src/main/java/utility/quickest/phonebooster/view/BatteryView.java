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
import com.mopub.volley.DefaultRetryPolicy;

public class BatteryView extends View {
    private Paint f14822a;
    private int f14823b;
    private int f14824c;
    private int f14825d;
    private int f14826e;
    private ValueAnimator f14827f;
    private float f14828g;
    private float f14829h;
    private boolean f14830i;

    public BatteryView(Context context) {
        this(context, null, 0);
    }

    public BatteryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BatteryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14823b = 5;
        this.f14824c = 10;
        this.f14825d = 0;
        this.f14826e = 5;
        this.f14830i = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2380R.styleable.BatteryView, i, 0);
        this.f14823b = obtainStyledAttributes.getDimensionPixelSize(0, 5);
        this.f14824c = obtainStyledAttributes.getDimensionPixelSize(2, 10);
        this.f14825d = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.f14826e = obtainStyledAttributes.getDimensionPixelSize(4, 5);
        obtainStyledAttributes.recycle();
        m19141a();
    }

    private void m19141a() {
        this.f14822a = new Paint();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m19144b(canvas);
        m19146c(canvas);
        if (this.f14830i) {
            m19148d(canvas);
        }
        m19142a(canvas);
    }

    private void m19142a(Canvas canvas) {
        m19143b();
        this.f14822a.setStyle(Style.STROKE);
        this.f14822a.setStrokeWidth((float) this.f14823b);
        this.f14822a.setColor(-1);
        canvas.drawRoundRect(new RectF((float) this.f14823b, (float) this.f14823b, (float) ((getWidth() - this.f14824c) - this.f14823b), (float) (getHeight() - this.f14823b)), (float) this.f14826e, (float) this.f14826e, this.f14822a);
    }

    private void m19144b(Canvas canvas) {
        m19143b();
        this.f14822a.setStyle(Style.FILL);
        this.f14822a.setColor(-1);
        int width = (getWidth() - this.f14824c) - this.f14823b;
        int height = (getHeight() * 25) / 100;
        int width2 = getWidth();
        int height2 = (getHeight() * 75) / 100;
        if (this.f14825d > 0) {
            height = (getHeight() - this.f14825d) / 2;
            height2 = (getHeight() + this.f14825d) / 2;
        }
        canvas.drawRoundRect(new RectF((float) width, (float) height, (float) width2, (float) height2), 0.0f, 0.0f, this.f14822a);
    }

    private void m19146c(Canvas canvas) {
        m19143b();
        this.f14822a.setStyle(Style.FILL);
        this.f14822a.setColor(-1);
        if (!this.f14830i && ((double) this.f14829h) < 0.2d) {
            this.f14822a.setColor(-1);
        }
        canvas.drawRoundRect(new RectF((float) this.f14823b, (float) this.f14823b, (float) ((((int) (((float) getWidth()) * this.f14829h)) - this.f14823b) - this.f14824c), (float) (getHeight() - this.f14823b)), (float) this.f14826e, (float) this.f14826e, this.f14822a);
    }

    private void m19148d(Canvas canvas) {
        m19143b();
        this.f14822a.setStyle(Style.FILL);
        this.f14822a.setColor(-1);
        int width = (int) ((((float) getWidth()) * this.f14829h) - ((float) ((this.f14824c + this.f14823b) + (this.f14826e * 2))));
        if (width <= this.f14823b) {
            width = this.f14823b;
        }
        canvas.drawRoundRect(new RectF((float) width, (float) this.f14823b, (float) ((((int) (((float) getWidth()) * this.f14828g)) - this.f14823b) - this.f14824c), (float) (getHeight() - this.f14823b)), (float) this.f14826e, (float) this.f14826e, this.f14822a);
    }

    private void m19143b() {
        this.f14822a.reset();
        this.f14822a.setFlags(1);
    }

    public void setmCurrentEnegryPercent(int i) {
        this.f14829h = ((float) i) / 100.0f;
        invalidate();
    }

    public void setmIsCharging(boolean z) {
        this.f14830i = z;
        if (this.f14830i) {
            m19145c();
        } else {
            m19147d();
        }
    }

    private void m19145c() {
        this.f14827f = ValueAnimator.ofFloat(new float[]{this.f14829h, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT});
        this.f14827f.setDuration(2000);
        this.f14827f.setRepeatCount(-1);
        this.f14827f.addUpdateListener(new C2590o(this));
        this.f14827f.start();
    }

    private void m19147d() {
        if (this.f14827f != null) {
            this.f14827f.end();
        }
        setmCurrentEnegryPercent((int) (this.f14829h * 100.0f));
        this.f14828g = 0.0f;
    }
}
