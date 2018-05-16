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

public class BatteryViewVertical extends View {
    private Paint f14846a;
    private int f14847b;
    private int f14848c;
    private int f14849d;
    private int f14850e;
    private ValueAnimator f14851f;
    private float f14852g;
    private int f14853h;
    private int f14854i;
    private float f14855j;
    private boolean f14856k;

    public BatteryViewVertical(Context context) {
        this(context, null, 0);
    }

    public BatteryViewVertical(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BatteryViewVertical(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14847b = 5;
        this.f14848c = 10;
        this.f14849d = 0;
        this.f14850e = 5;
        this.f14853h = -1;
        this.f14854i = 0;
        this.f14856k = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2380R.styleable.BatteryView, i, 0);
        this.f14847b = obtainStyledAttributes.getDimensionPixelSize(0, 5);
        this.f14848c = obtainStyledAttributes.getDimensionPixelSize(2, 10);
        this.f14849d = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.f14850e = obtainStyledAttributes.getDimensionPixelSize(4, ViewUtil.m18918a(5.0f));
        this.f14853h = obtainStyledAttributes.getColor(1, -1);
        this.f14854i = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        obtainStyledAttributes.recycle();
        m19162a();
    }

    private void m19162a() {
        this.f14846a = new Paint();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m19165b(canvas);
        m19167c(canvas);
        if (this.f14856k) {
            m19169d(canvas);
        }
        m19163a(canvas);
    }

    private void m19163a(Canvas canvas) {
        m19164b();
        this.f14846a.setStyle(Style.STROKE);
        this.f14846a.setStrokeWidth((float) this.f14847b);
        this.f14846a.setColor(this.f14853h);
        canvas.drawRoundRect(new RectF((float) ((this.f14847b * 2) + this.f14848c), (float) this.f14847b, (float) (getWidth() - this.f14847b), (float) (getHeight() - this.f14847b)), (float) this.f14850e, (float) this.f14850e, this.f14846a);
    }

    private void m19165b(Canvas canvas) {
        m19164b();
        this.f14846a.setStyle(Style.FILL);
        this.f14846a.setColor(this.f14853h);
        int height = (getHeight() * 25) / 100;
        int i = this.f14847b + this.f14848c;
        int height2 = (getHeight() * 75) / 100;
        if (this.f14849d > 0) {
            height = (getHeight() - this.f14849d) / 2;
            height2 = (getHeight() + this.f14849d) / 2;
        }
        canvas.drawRoundRect(new RectF((float) 0, (float) height, (float) i, (float) height2), 6.0f, 6.0f, this.f14846a);
    }

    private void m19167c(Canvas canvas) {
        m19164b();
        this.f14846a.setStyle(Style.FILL);
        this.f14846a.setColor(-1);
        if (!this.f14856k && ((double) this.f14855j) < 0.2d) {
            this.f14846a.setColor(-1);
        }
        int width = (getWidth() - this.f14847b) - this.f14854i;
        int round = width - Math.round(((float) (((getWidth() - (this.f14847b * 2)) - this.f14848c) - (this.f14854i * 2))) * this.f14855j);
        if (round < ((this.f14847b * 2) + this.f14854i) + this.f14848c) {
            round = ((this.f14847b * 2) + this.f14854i) + this.f14848c;
        }
        canvas.drawRoundRect(new RectF((float) round, (float) (this.f14847b + this.f14854i), (float) width, (float) ((getHeight() - this.f14847b) - this.f14854i)), (float) this.f14850e, (float) this.f14850e, this.f14846a);
    }

    private void m19169d(Canvas canvas) {
        m19164b();
        this.f14846a.setStyle(Style.FILL);
        this.f14846a.setColor(-1);
        int width = ((getWidth() - (this.f14847b * 2)) - this.f14848c) - (this.f14854i * 2);
        int width2 = (((getWidth() - this.f14847b) - this.f14854i) - Math.round(((float) width) * this.f14855j)) + (this.f14850e * 2);
        width = width2 - Math.round(((float) width) * this.f14852g);
        if (width < ((this.f14847b * 2) + this.f14854i) + this.f14848c) {
            width = ((this.f14847b * 2) + this.f14854i) + this.f14848c;
        }
        canvas.drawRoundRect(new RectF((float) width, (float) (this.f14847b + this.f14854i), (float) width2, (float) ((getHeight() - this.f14847b) - this.f14854i)), (float) this.f14850e, (float) this.f14850e, this.f14846a);
    }

    private void m19164b() {
        this.f14846a.reset();
        this.f14846a.setFlags(1);
    }

    public void setmCurrentEnegryPercent(int i) {
        this.f14855j = ((float) i) / 100.0f;
        invalidate();
    }

    public void setmIsCharging(boolean z) {
        this.f14856k = z;
        if (this.f14856k) {
            m19166c();
        } else {
            m19168d();
        }
    }

    private void m19166c() {
        this.f14851f = ValueAnimator.ofFloat(new float[]{0.0f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - this.f14855j});
        this.f14851f.setDuration(2000);
        this.f14851f.setRepeatCount(-1);
        this.f14851f.addUpdateListener(new C2592q(this));
        this.f14851f.start();
    }

    private void m19168d() {
        if (this.f14851f != null) {
            this.f14851f.end();
        }
        setmCurrentEnegryPercent((int) (this.f14855j * 100.0f));
        this.f14852g = 0.0f;
    }
}
