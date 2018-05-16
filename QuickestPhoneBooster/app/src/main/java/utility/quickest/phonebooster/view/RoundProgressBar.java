package utility.quickest.phonebooster.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.support.v4.internal.view.SupportMenu;
import android.util.AttributeSet;
import android.view.View;
import utility.quickest.phonebooster.C2380R;
import com.mopub.mobileads.resource.DrawableConstants.CtaButton;

public class RoundProgressBar extends View {
    private Paint f14976a;
    private int f14977b;
    private int f14978c;
    private int f14979d;
    private float f14980e;
    private float f14981f;
    private int f14982g;
    private int f14983h;
    private boolean f14984i;
    private int f14985j;

    public RoundProgressBar(Context context) {
        this(context, null);
    }

    public RoundProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2380R.styleable.RoundProgressBar, i, 0);
        this.f14977b = obtainStyledAttributes.getColor(0, SupportMenu.CATEGORY_MASK);
        this.f14978c = obtainStyledAttributes.getColor(1, -16711936);
        this.f14979d = obtainStyledAttributes.getColor(3, -16711936);
        this.f14980e = obtainStyledAttributes.getDimension(4, CtaButton.TEXT_SIZE_SP);
        this.f14981f = obtainStyledAttributes.getDimension(2, 5.0f);
        this.f14982g = obtainStyledAttributes.getInteger(5, 100);
        this.f14984i = obtainStyledAttributes.getBoolean(6, false);
        this.f14985j = obtainStyledAttributes.getInt(7, 0);
        obtainStyledAttributes.recycle();
        this.f14976a = new Paint();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m19231a(canvas);
        m19232b(canvas);
        m19233c(canvas);
    }

    private void m19231a(Canvas canvas) {
        m19230a();
        this.f14976a.setColor(this.f14977b);
        this.f14976a.setStyle(Style.STROKE);
        this.f14976a.setStrokeWidth(this.f14981f - 2.0f);
        int width = getWidth() / 2;
        canvas.drawCircle((float) width, (float) width, (float) (((int) (((float) width) - (this.f14981f / 2.0f))) - 2), this.f14976a);
    }

    private void m19232b(Canvas canvas) {
        m19230a();
        this.f14976a.setStrokeWidth(0.0f);
        this.f14976a.setColor(this.f14979d);
        this.f14976a.setTextSize(this.f14980e);
        this.f14976a.setTypeface(Typeface.DEFAULT_BOLD);
        int width = getWidth() / 2;
        int i = (int) ((((float) this.f14983h) / ((float) this.f14982g)) * 100.0f);
        float measureText = this.f14976a.measureText(i + "%");
        if (this.f14984i && this.f14985j == 0) {
            canvas.drawText(i + "%", ((float) width) - (measureText / 2.0f), ((float) width) + (this.f14980e / 2.0f), this.f14976a);
        }
    }

    private void m19233c(Canvas canvas) {
        m19230a();
        this.f14976a.setStrokeWidth(this.f14981f);
        this.f14976a.setColor(this.f14978c);
        int width = getWidth() / 2;
        int i = ((int) (((float) width) - (this.f14981f / 2.0f))) - 2;
        RectF rectF = new RectF((float) ((width - i) - 1), (float) ((width - i) - 1), (float) ((width + i) + 1), (float) ((width + i) + 1));
        switch (this.f14985j) {
            case 0:
                this.f14976a.setStyle(Style.STROKE);
                this.f14976a.setStrokeCap(Cap.ROUND);
                canvas.drawArc(rectF, 0.0f, (float) ((this.f14983h * 360) / this.f14982g), false, this.f14976a);
                return;
            case 1:
                this.f14976a.setStyle(Style.FILL_AND_STROKE);
                if (this.f14983h != 0) {
                    canvas.drawArc(rectF, 0.0f, (float) ((this.f14983h * 360) / this.f14982g), true, this.f14976a);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private void m19230a() {
        this.f14976a.reset();
        this.f14976a.setFlags(1);
        this.f14976a.setAntiAlias(true);
    }

    public synchronized int getMax() {
        return this.f14982g;
    }

    public synchronized void setMax(int i) {
        if (i >= 0) {
            this.f14982g = i;
        }
    }

    public synchronized int getProgress() {
        return this.f14983h;
    }

    public synchronized void setProgress(int i) {
        if (i >= 0) {
            if (i > this.f14982g) {
                i = this.f14982g;
            }
            if (i <= this.f14982g) {
                this.f14983h = i;
                postInvalidate();
            }
        }
    }

    public int getCricleColor() {
        return this.f14977b;
    }

    public void setCricleColor(int i) {
        this.f14977b = i;
    }

    public int getCricleProgressColor() {
        return this.f14978c;
    }

    public void setCricleProgressColor(int i) {
        this.f14978c = i;
    }

    public int getTextColor() {
        return this.f14979d;
    }

    public void setTextColor(int i) {
        this.f14979d = i;
    }

    public float getTextSize() {
        return this.f14980e;
    }

    public void setTextSize(float f) {
        this.f14980e = f;
    }

    public float getRoundWidth() {
        return this.f14981f;
    }

    public void setRoundWidth(float f) {
        this.f14981f = f;
    }
}
