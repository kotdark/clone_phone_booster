package utility.quickest.phonebooster.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.View;
import com.mopub.mobileads.resource.DrawableConstants.CloseButton;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;

public class CustomCircularProgress1 extends View implements AnimatorUpdateListener {
    private Context f14868a;
    private Paint f14869b;
    private Path f14870c;
    private Path f14871d;
    private Path f14872e;
    private Path f14873f;
    private Path f14874g;
    private Path f14875h;
    private PathMeasure f14876i;
    private ValueAnimator f14877j;
    private ValueAnimator f14878k;
    private ValueAnimator f14879l;
    private ValueAnimator f14880m;
    private float f14881n;
    private float f14882o;
    private float f14883p;
    private float f14884q;
    private int f14885r;

    public CustomCircularProgress1(Context context) {
        super(context);
        this.f14868a = context;
        m19177b();
    }

    public CustomCircularProgress1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14868a = context;
        m19177b();
    }

    public CustomCircularProgress1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14868a = context;
        m19177b();
    }

    private void m19177b() {
        setLayerType(1, null);
        this.f14885r = m19176a(2);
        this.f14869b = new Paint();
        this.f14869b.setAntiAlias(true);
        this.f14869b.setStrokeWidth((float) this.f14885r);
        this.f14869b.setStyle(Style.STROKE);
        this.f14869b.setColor(-1);
        m19178c();
    }

    private void m19178c() {
        this.f14870c = new Path();
        this.f14871d = new Path();
        this.f14872e = new Path();
        this.f14873f = new Path();
        this.f14874g = new Path();
        this.f14875h = new Path();
        this.f14876i = new PathMeasure();
        this.f14877j = ValueAnimator.ofFloat(new float[]{0.0f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT});
        this.f14877j.setDuration(700);
        this.f14877j.addUpdateListener(this);
        this.f14878k = ValueAnimator.ofFloat(new float[]{DefaultRetryPolicy.DEFAULT_BACKOFF_MULT, 0.0f});
        this.f14878k.setDuration(600);
        this.f14878k.addUpdateListener(this);
        this.f14879l = ValueAnimator.ofFloat(new float[]{0.0f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT});
        this.f14879l.setDuration(300);
        this.f14879l.addUpdateListener(this);
        this.f14880m = ValueAnimator.ofFloat(new float[]{0.0f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT});
        this.f14880m.setDuration(400);
        this.f14880m.addUpdateListener(this);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m19179d();
        this.f14869b.setColor(-1);
        this.f14869b.setStyle(Style.FILL);
        canvas.drawCircle((float) (getWidth() / 2), (float) (getWidth() / 2), (this.f14881n * ((float) getWidth())) / 2.0f, this.f14869b);
        if (this.f14881n < DefaultRetryPolicy.DEFAULT_BACKOFF_MULT) {
            m19179d();
            this.f14869b.setStyle(Style.FILL);
            try {
                this.f14869b.setColor(this.f14868a.getResources().getColor(R.color.blue));
            } catch (Throwable th) {
            }
            canvas.drawCircle((float) (getWidth() / 2), (float) (getWidth() / 2), ((this.f14881n * ((float) getWidth())) / 2.0f) - CloseButton.TEXT_SIZE_SP, this.f14869b);
        }
        if (this.f14881n == DefaultRetryPolicy.DEFAULT_BACKOFF_MULT) {
            m19179d();
            this.f14869b.setStyle(Style.FILL);
            try {
                this.f14869b.setColor(this.f14868a.getResources().getColor(R.color.blue));
            } catch (Throwable th2) {
            }
            canvas.drawCircle((float) (getWidth() / 2), (float) (getWidth() / 2), ((this.f14882o * ((float) getWidth())) / 2.0f) - CloseButton.TEXT_SIZE_SP, this.f14869b);
        }
        m19179d();
        try {
            this.f14869b.setColor(this.f14868a.getResources().getColor(R.color.blue));
        } catch (Throwable th3) {
        }
        this.f14869b.setStyle(Style.STROKE);
        this.f14869b.setStrokeWidth(45.0f);
        this.f14869b.setStrokeCap(Cap.ROUND);
        if (this.f14881n == DefaultRetryPolicy.DEFAULT_BACKOFF_MULT && this.f14882o == 0.0f) {
            this.f14872e.moveTo((float) ((getWidth() * 25) / 100), (float) ((getWidth() * 50) / 100));
            this.f14872e.lineTo((float) ((getWidth() * 45) / 100), (float) ((getWidth() * 66) / 100));
            this.f14876i.nextContour();
            this.f14876i.setPath(this.f14872e, false);
            this.f14876i.getSegment(0.0f, this.f14883p * this.f14876i.getLength(), this.f14873f, true);
            canvas.drawPath(this.f14873f, this.f14869b);
        }
        if (this.f14881n == DefaultRetryPolicy.DEFAULT_BACKOFF_MULT && this.f14882o == 0.0f && this.f14883p == DefaultRetryPolicy.DEFAULT_BACKOFF_MULT) {
            this.f14874g.moveTo((float) ((getWidth() * 45) / 100), (float) ((getWidth() * 66) / 100));
            this.f14874g.lineTo((float) ((getWidth() * 81) / 100), (float) ((getWidth() * 36) / 100));
            this.f14876i.nextContour();
            this.f14876i.setPath(this.f14874g, false);
            this.f14876i.getSegment(0.0f, this.f14884q * this.f14876i.getLength(), this.f14875h, true);
            canvas.drawPath(this.f14875h, this.f14869b);
        }
    }

    private int m19176a(int i) {
        return (int) ((this.f14868a.getResources().getDisplayMetrics().density * ((float) i)) + 0.5f);
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator.equals(this.f14877j)) {
            this.f14881n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
            if (this.f14881n == DefaultRetryPolicy.DEFAULT_BACKOFF_MULT) {
                this.f14878k.start();
            }
        } else if (valueAnimator.equals(this.f14878k)) {
            this.f14882o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
            if (this.f14882o == 0.0f) {
                this.f14879l.start();
            }
        } else if (valueAnimator.equals(this.f14879l)) {
            this.f14883p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
            if (this.f14883p == DefaultRetryPolicy.DEFAULT_BACKOFF_MULT) {
                this.f14880m.start();
            }
        } else if (valueAnimator.equals(this.f14880m)) {
            this.f14884q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }
    }

    private void m19179d() {
        this.f14869b.reset();
        this.f14869b.setFlags(1);
    }

    public void m19180a() {
        try {
            this.f14877j.start();
        } catch (Throwable th) {
        }
    }
}
