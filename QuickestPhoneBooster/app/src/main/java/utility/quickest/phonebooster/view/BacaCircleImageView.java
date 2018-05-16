package utility.quickest.phonebooster.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import utility.quickest.phonebooster.C2380R;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ViewUtil;
import com.mopub.volley.DefaultRetryPolicy;

public class BacaCircleImageView extends ImageView {
    private static final ScaleType f14753a = ScaleType.CENTER_CROP;
    private static final Config f14754b = Config.ARGB_8888;
    private static final int f14755c = ViewUtil.m18918a(0.0f);
    private ColorFilter f14756A;
    private boolean f14757B;
    private boolean f14758C;
    private final RectF f14759d;
    private final RectF f14760e;
    private final RectF f14761f;
    private final Path f14762g;
    private final Matrix f14763h;
    private final Paint f14764i;
    private final Paint f14765j;
    private final Paint f14766k;
    private final Paint f14767l;
    private int f14768m;
    private int f14769n;
    private int f14770o;
    private boolean f14771p;
    private int f14772q;
    private int f14773r;
    private float[] f14774s;
    private Drawable f14775t;
    private Bitmap f14776u;
    private BitmapShader f14777v;
    private int f14778w;
    private int f14779x;
    private float f14780y;
    private float f14781z;

    public BacaCircleImageView(Context context) {
        super(context);
        this.f14759d = new RectF();
        this.f14760e = new RectF();
        this.f14761f = new RectF();
        this.f14762g = new Path();
        this.f14763h = new Matrix();
        this.f14764i = new Paint();
        this.f14765j = new Paint();
        this.f14766k = new Paint();
        this.f14767l = new Paint();
        this.f14768m = -16777216;
        this.f14769n = 0;
        this.f14770o = 0;
        this.f14771p = false;
        this.f14772q = 1;
        this.f14773r = 0;
        this.f14774s = new float[]{(float) f14755c, (float) f14755c, (float) f14755c, (float) f14755c, (float) f14755c, (float) f14755c, (float) f14755c, (float) f14755c};
        m19124a();
    }

    public BacaCircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BacaCircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14759d = new RectF();
        this.f14760e = new RectF();
        this.f14761f = new RectF();
        this.f14762g = new Path();
        this.f14763h = new Matrix();
        this.f14764i = new Paint();
        this.f14765j = new Paint();
        this.f14766k = new Paint();
        this.f14767l = new Paint();
        this.f14768m = -16777216;
        this.f14769n = 0;
        this.f14770o = 0;
        this.f14771p = false;
        this.f14772q = 1;
        this.f14773r = 0;
        this.f14774s = new float[]{(float) f14755c, (float) f14755c, (float) f14755c, (float) f14755c, (float) f14755c, (float) f14755c, (float) f14755c, (float) f14755c};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2380R.styleable.CircleImageView, i, 0);
        this.f14769n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f14768m = obtainStyledAttributes.getColor(1, -16777216);
        this.f14771p = obtainStyledAttributes.getBoolean(2, false);
        this.f14770o = obtainStyledAttributes.getColor(3, 0);
        this.f14772q = obtainStyledAttributes.getInt(4, 1);
        float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(7, f14755c);
        float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(8, f14755c);
        float dimensionPixelSize3 = (float) obtainStyledAttributes.getDimensionPixelSize(5, f14755c);
        float dimensionPixelSize4 = (float) obtainStyledAttributes.getDimensionPixelSize(6, f14755c);
        this.f14774s = new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize4};
        this.f14773r = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        obtainStyledAttributes.recycle();
        m19124a();
    }

    private void m19124a() {
        super.setScaleType(f14753a);
        this.f14757B = true;
        if (this.f14758C) {
            m19125b();
            this.f14758C = false;
        }
    }

    public ScaleType getScaleType() {
        return f14753a;
    }

    public void setScaleType(ScaleType scaleType) {
        if (scaleType != f14753a) {
            throw new IllegalArgumentException(C2542m.m19078a("ScaleType %s not supported.", scaleType));
        }
    }

    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    protected void onDraw(Canvas canvas) {
        if (this.f14772q == 0) {
            this.f14762g.addRoundRect(this.f14761f, this.f14774s, Direction.CW);
            canvas.clipPath(this.f14762g);
            super.onDraw(canvas);
            return;
        }
        if (this.f14770o != 0) {
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f14780y, this.f14766k);
        }
        if (this.f14773r > 0) {
            canvas.drawCircle(((float) getWidth()) / 2.0f, (((float) getHeight()) / 2.0f) + ((float) this.f14773r), this.f14780y, this.f14767l);
        }
        canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f14780y, this.f14764i);
        if (this.f14769n != 0) {
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f14781z, this.f14765j);
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m19125b();
    }

    public int getBorderColor() {
        return this.f14768m;
    }

    public void setBorderColor(int i) {
        if (i != this.f14768m) {
            this.f14768m = i;
            this.f14765j.setColor(this.f14768m);
            invalidate();
        }
    }

    public void setBorderColorResource(int i) {
        setBorderColor(getContext().getResources().getColor(i));
    }

    public int getFillColor() {
        return this.f14770o;
    }

    public void setFillColor(int i) {
        if (i != this.f14770o) {
            this.f14770o = i;
            this.f14766k.setColor(i);
            invalidate();
        }
    }

    public void setFillColorResource(int i) {
        setFillColor(getContext().getResources().getColor(i));
    }

    public int getBorderWidth() {
        return this.f14769n;
    }

    public void setBorderWidth(int i) {
        if (i != this.f14769n) {
            this.f14769n = i;
            m19125b();
        }
    }

    public void setBorderOverlay(boolean z) {
        if (z != this.f14771p) {
            this.f14771p = z;
            m19125b();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f14776u = bitmap;
        m19125b();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f14775t = drawable;
        this.f14776u = m19123a(drawable);
        m19125b();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        this.f14776u = m19123a(getDrawable());
        m19125b();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.f14776u = uri != null ? m19123a(getDrawable()) : null;
        m19125b();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != this.f14756A) {
            this.f14756A = colorFilter;
            this.f14764i.setColorFilter(this.f14756A);
            invalidate();
        }
    }

    private Bitmap m19123a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap;
        try {
            if (drawable instanceof ColorDrawable) {
                createBitmap = Bitmap.createBitmap(2, 2, f14754b);
            } else {
                createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f14754b);
            }
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        } catch (Throwable th) {
            createBitmap = null;
        }
        return createBitmap;
    }

    private void m19125b() {
        if (!this.f14757B) {
            this.f14758C = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            if (this.f14776u == null) {
                invalidate();
                return;
            }
            Shader radialGradient;
            this.f14777v = new BitmapShader(this.f14776u, TileMode.CLAMP, TileMode.CLAMP);
            this.f14764i.setAntiAlias(true);
            this.f14764i.setShader(this.f14777v);
            this.f14765j.setStyle(Style.STROKE);
            this.f14765j.setAntiAlias(true);
            this.f14765j.setColor(this.f14768m);
            this.f14765j.setStrokeWidth((float) this.f14769n);
            this.f14767l.setStyle(Style.FILL);
            this.f14767l.setAntiAlias(true);
            if (getWidth() <= 0) {
                radialGradient = new RadialGradient(0.0f, 0.0f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT, new int[]{-1934685184, 1823411200, 1286540288, 1018104832, 481233920}, null, TileMode.CLAMP);
            } else {
                radialGradient = new RadialGradient(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((float) getWidth()) / 2.0f, new int[]{-1934685184, 1823411200, 1286540288, 1018104832, 481233920}, null, TileMode.CLAMP);
            }
            this.f14767l.setShader(radialGradient);
            this.f14766k.setStyle(Style.FILL);
            this.f14766k.setAntiAlias(true);
            this.f14766k.setColor(this.f14770o);
            this.f14779x = this.f14776u.getHeight();
            this.f14778w = this.f14776u.getWidth();
            this.f14760e.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f14781z = Math.min(((this.f14760e.height() - ((float) this.f14769n)) - ((float) this.f14773r)) / 2.0f, ((this.f14760e.width() - ((float) this.f14769n)) - ((float) this.f14773r)) / 2.0f);
            this.f14759d.set(this.f14760e);
            if (!this.f14771p) {
                this.f14759d.inset((float) (this.f14769n + this.f14773r), (float) (this.f14769n + this.f14773r));
            }
            this.f14780y = Math.min(this.f14759d.height() / 2.0f, this.f14759d.width() / 2.0f);
            this.f14761f.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            m19126c();
            invalidate();
        }
    }

    private void m19126c() {
        float height;
        float width;
        float f = 0.0f;
        this.f14763h.set(null);
        if (((float) this.f14778w) * this.f14759d.height() > this.f14759d.width() * ((float) this.f14779x)) {
            height = this.f14759d.height() / ((float) this.f14779x);
            width = (this.f14759d.width() - (((float) this.f14778w) * height)) * 0.5f;
        } else {
            height = this.f14759d.width() / ((float) this.f14778w);
            width = 0.0f;
            f = (this.f14759d.height() - (((float) this.f14779x) * height)) * 0.5f;
        }
        this.f14763h.setScale(height, height);
        this.f14763h.postTranslate(((float) ((int) (width + 0.5f))) + this.f14759d.left, ((float) ((int) (f + 0.5f))) + this.f14759d.top);
        this.f14777v.setLocalMatrix(this.f14763h);
    }
}
