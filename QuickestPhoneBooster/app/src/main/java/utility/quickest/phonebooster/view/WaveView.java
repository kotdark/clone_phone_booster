package utility.quickest.phonebooster.view;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.support.annotation.Keep;
import android.view.View;
import com.mopub.volley.DefaultRetryPolicy;

public class WaveView extends View {
    public static final int f15042a = Color.parseColor("#4DFFFFFF");
    public static final int f15043b = Color.parseColor("#10FFFFFF");
    public static final cy f15044c = cy.SQUARE;
    private boolean f15045d;
    private BitmapShader f15046e;
    private Matrix f15047f;
    private Paint f15048g;
    private Paint f15049h;
    private float f15050i;
    private float f15051j;
    private float f15052k;
    private double f15053l;
    private float f15054m;
    private float f15055n;
    private float f15056o;
    private float f15057p;
    private int f15058q;
    private int f15059r;
    private int f15060s;
    private int f15061t;
    private cy f15062u;

    public float getWaveShiftRatio() {
        return this.f15057p;
    }

    @Keep
    public void setWaveShiftRatio(float f) {
        if (this.f15057p != f) {
            this.f15057p = f;
            invalidate();
        }
    }

    public float getWaterLevelRatio() {
        return this.f15056o;
    }

    public void setWaterLevelRatio(float f) {
        if (f > 0.0f && this.f15056o != f) {
            this.f15056o = f;
            invalidate();
        }
    }

    public void setWaterLevelRatioNoAnimation(float f) {
        if (f > 0.0f && this.f15056o != f) {
            this.f15056o = f;
            if (getWidth() > 0 && getHeight() > 0) {
                this.f15046e = null;
                m19262a();
            }
            invalidate();
        }
    }

    public float getAmplitudeRatio() {
        return this.f15054m;
    }

    public void setAmplitudeRatio(float f) {
        if (this.f15054m != f) {
            this.f15054m = f;
            invalidate();
        }
    }

    public float getWaveLengthRatio() {
        return this.f15055n;
    }

    public void setWaveLengthRatio(float f) {
        this.f15055n = f;
    }

    public void setShowWave(boolean z) {
        this.f15045d = z;
    }

    public void setShapeType(cy cyVar) {
        this.f15062u = cyVar;
        invalidate();
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m19262a();
    }

    private void m19262a() {
        int i;
        this.f15053l = 6.283185307179586d / ((double) getWidth());
        this.f15050i = ((float) getHeight()) * 0.05f;
        this.f15051j = ((float) getHeight()) * 0.5f;
        this.f15052k = (float) getWidth();
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setStrokeWidth(2.0f);
        paint.setAntiAlias(true);
        int width = getWidth() + 1;
        int height = getHeight() + 1;
        float[] fArr = new float[width];
        if (((double) this.f15056o) > 0.2d) {
            paint.setColor(this.f15058q);
        } else {
            paint.setColor(this.f15060s);
        }
        for (i = 0; i < width; i++) {
            double d = (double) this.f15051j;
            double d2 = (double) this.f15050i;
            float sin = (float) ((Math.sin(((double) i) * this.f15053l) * d2) + d);
            canvas.drawLine((float) i, sin, (float) i, (float) height, paint);
            fArr[i] = sin;
        }
        if (((double) this.f15056o) > 0.2d) {
            paint.setColor(this.f15059r);
        } else {
            paint.setColor(this.f15061t);
        }
        int i2 = (int) (this.f15052k / 4.0f);
        for (i = 0; i < width; i++) {
            canvas.drawLine((float) i, fArr[(i + i2) % width], (float) i, (float) height, paint);
        }
        this.f15046e = new BitmapShader(createBitmap, TileMode.REPEAT, TileMode.CLAMP);
        this.f15048g.setShader(this.f15046e);
    }

    protected void onDraw(Canvas canvas) {
        if (!this.f15045d || this.f15046e == null) {
            this.f15048g.setShader(null);
            return;
        }
        if (this.f15048g.getShader() == null) {
            this.f15048g.setShader(this.f15046e);
        }
        this.f15047f.setScale(this.f15055n / DefaultRetryPolicy.DEFAULT_BACKOFF_MULT, this.f15054m / 0.05f, 0.0f, this.f15051j);
        this.f15047f.postTranslate(this.f15057p * ((float) getWidth()), (0.5f - this.f15056o) * ((float) getHeight()));
        this.f15046e.setLocalMatrix(this.f15047f);
        float strokeWidth = this.f15049h == null ? 0.0f : this.f15049h.getStrokeWidth();
        switch (cx.f15226a[this.f15062u.ordinal()]) {
            case 1:
                if (strokeWidth > 0.0f) {
                    canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((((float) getWidth()) - strokeWidth) / 2.0f) - DefaultRetryPolicy.DEFAULT_BACKOFF_MULT, this.f15049h);
                }
                canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (((float) getWidth()) / 2.0f) - strokeWidth, this.f15048g);
                return;
            case 2:
                if (strokeWidth > 0.0f) {
                    canvas.drawRect(strokeWidth / 2.0f, strokeWidth / 2.0f, (((float) getWidth()) - (strokeWidth / 2.0f)) - 0.5f, (((float) getHeight()) - (strokeWidth / 2.0f)) - 0.5f, this.f15049h);
                }
                canvas.drawRect(strokeWidth, strokeWidth, ((float) getWidth()) - strokeWidth, ((float) getHeight()) - strokeWidth, this.f15048g);
                return;
            default:
                return;
        }
    }
}
