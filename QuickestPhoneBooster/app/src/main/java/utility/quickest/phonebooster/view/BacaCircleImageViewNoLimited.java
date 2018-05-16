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
import utility.quickest.phonebooster.util.ViewUtil;
import com.mopub.volley.DefaultRetryPolicy;

public class BacaCircleImageViewNoLimited extends ImageView {
    private static final ScaleType f14782a = ScaleType.CENTER_CROP;
    private static final Config f14783b = Config.ARGB_8888;
    private static final int f14784c = ViewUtil.m18918a(0.0f);
    private ColorFilter f14785A;
    private boolean f14786B;
    private boolean f14787C;
    private final RectF f14788d;
    private final RectF f14789e;
    private final RectF f14790f;
    private final Path f14791g;
    private final Matrix f14792h;
    private final Paint f14793i;
    private final Paint f14794j;
    private final Paint f14795k;
    private final Paint f14796l;
    private int f14797m;
    private int f14798n;
    private int f14799o;
    private boolean f14800p;
    private int f14801q;
    private int f14802r;
    private float[] f14803s;
    private Drawable f14804t;
    private Bitmap f14805u;
    private BitmapShader f14806v;
    private int f14807w;
    private int f14808x;
    private float f14809y;
    private float f14810z;

    public BacaCircleImageViewNoLimited(Context context) {
        super(context);
        this.f14788d = new RectF();
        this.f14789e = new RectF();
        this.f14790f = new RectF();
        this.f14791g = new Path();
        this.f14792h = new Matrix();
        this.f14793i = new Paint();
        this.f14794j = new Paint();
        this.f14795k = new Paint();
        this.f14796l = new Paint();
        this.f14797m = -16777216;
        this.f14798n = 0;
        this.f14799o = 0;
        this.f14800p = false;
        this.f14801q = 1;
        this.f14802r = 0;
        this.f14803s = new float[]{(float) f14784c, (float) f14784c, (float) f14784c, (float) f14784c, (float) f14784c, (float) f14784c, (float) f14784c, (float) f14784c};
        m19128a();
    }

    public BacaCircleImageViewNoLimited(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BacaCircleImageViewNoLimited(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14788d = new RectF();
        this.f14789e = new RectF();
        this.f14790f = new RectF();
        this.f14791g = new Path();
        this.f14792h = new Matrix();
        this.f14793i = new Paint();
        this.f14794j = new Paint();
        this.f14795k = new Paint();
        this.f14796l = new Paint();
        this.f14797m = -16777216;
        this.f14798n = 0;
        this.f14799o = 0;
        this.f14800p = false;
        this.f14801q = 1;
        this.f14802r = 0;
        this.f14803s = new float[]{(float) f14784c, (float) f14784c, (float) f14784c, (float) f14784c, (float) f14784c, (float) f14784c, (float) f14784c, (float) f14784c};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2380R.styleable.CircleImageView, i, 0);
        this.f14798n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f14797m = obtainStyledAttributes.getColor(1, -16777216);
        this.f14800p = obtainStyledAttributes.getBoolean(2, false);
        this.f14799o = obtainStyledAttributes.getColor(3, 0);
        this.f14801q = obtainStyledAttributes.getInt(4, 1);
        float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(7, f14784c);
        float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(8, f14784c);
        float dimensionPixelSize3 = (float) obtainStyledAttributes.getDimensionPixelSize(5, f14784c);
        float dimensionPixelSize4 = (float) obtainStyledAttributes.getDimensionPixelSize(6, f14784c);
        this.f14803s = new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize4};
        this.f14802r = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        obtainStyledAttributes.recycle();
        m19128a();
    }

    private void m19128a() {
        super.setScaleType(f14782a);
        this.f14786B = true;
        if (this.f14787C) {
            m19129b();
            this.f14787C = false;
        }
    }

    public ScaleType getScaleType() {
        return f14782a;
    }

    protected void onDraw(Canvas canvas) {
        if (this.f14801q == 0) {
            this.f14791g.addRoundRect(this.f14790f, this.f14803s, Direction.CW);
            canvas.clipPath(this.f14791g);
            super.onDraw(canvas);
            return;
        }
        if (this.f14799o != 0) {
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f14809y, this.f14795k);
        }
        if (this.f14802r > 0) {
            canvas.drawCircle(((float) getWidth()) / 2.0f, (((float) getHeight()) / 2.0f) + ((float) this.f14802r), this.f14809y, this.f14796l);
        }
        canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f14809y, this.f14793i);
        if (this.f14798n != 0) {
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f14810z, this.f14794j);
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m19129b();
    }

    public int getBorderColor() {
        return this.f14797m;
    }

    public void setBorderColor(int i) {
        if (i != this.f14797m) {
            this.f14797m = i;
            this.f14794j.setColor(this.f14797m);
            invalidate();
        }
    }

    public void setBorderColorResource(int i) {
        setBorderColor(getContext().getResources().getColor(i));
    }

    public int getFillColor() {
        return this.f14799o;
    }

    public void setFillColor(int i) {
        if (i != this.f14799o) {
            this.f14799o = i;
            this.f14795k.setColor(i);
            invalidate();
        }
    }

    public void setFillColorResource(int i) {
        setFillColor(getContext().getResources().getColor(i));
    }

    public int getBorderWidth() {
        return this.f14798n;
    }

    public void setBorderWidth(int i) {
        if (i != this.f14798n) {
            this.f14798n = i;
            m19129b();
        }
    }

    public void setBorderOverlay(boolean z) {
        if (z != this.f14800p) {
            this.f14800p = z;
            m19129b();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f14805u = bitmap;
        m19129b();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f14804t = drawable;
        this.f14805u = m19127a(drawable);
        m19129b();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        this.f14805u = m19127a(getDrawable());
        m19129b();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.f14805u = uri != null ? m19127a(getDrawable()) : null;
        m19129b();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != this.f14785A) {
            this.f14785A = colorFilter;
            this.f14793i.setColorFilter(this.f14785A);
            invalidate();
        }
    }

    private Bitmap m19127a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap;
        try {
            if (drawable instanceof ColorDrawable) {
                createBitmap = Bitmap.createBitmap(2, 2, f14783b);
            } else {
                createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f14783b);
            }
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        } catch (Throwable th) {
            createBitmap = null;
        }
        return createBitmap;
    }

    private void m19129b() {
        if (!this.f14786B) {
            this.f14787C = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            if (this.f14805u == null) {
                invalidate();
                return;
            }
            Shader radialGradient;
            this.f14806v = new BitmapShader(this.f14805u, TileMode.CLAMP, TileMode.CLAMP);
            this.f14793i.setAntiAlias(true);
            this.f14793i.setShader(this.f14806v);
            this.f14794j.setStyle(Style.STROKE);
            this.f14794j.setAntiAlias(true);
            this.f14794j.setColor(this.f14797m);
            this.f14794j.setStrokeWidth((float) this.f14798n);
            this.f14796l.setStyle(Style.FILL);
            this.f14796l.setAntiAlias(true);
            if (getWidth() <= 0) {
                radialGradient = new RadialGradient(0.0f, 0.0f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT, new int[]{-1934685184, 1823411200, 1286540288, 1018104832, 481233920}, null, TileMode.CLAMP);
            } else {
                radialGradient = new RadialGradient(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((float) getWidth()) / 2.0f, new int[]{-1934685184, 1823411200, 1286540288, 1018104832, 481233920}, null, TileMode.CLAMP);
            }
            this.f14796l.setShader(radialGradient);
            this.f14795k.setStyle(Style.FILL);
            this.f14795k.setAntiAlias(true);
            this.f14795k.setColor(this.f14799o);
            this.f14808x = this.f14805u.getHeight();
            this.f14807w = this.f14805u.getWidth();
            this.f14789e.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f14810z = Math.min(((this.f14789e.height() - ((float) this.f14798n)) - ((float) this.f14802r)) / 2.0f, ((this.f14789e.width() - ((float) this.f14798n)) - ((float) this.f14802r)) / 2.0f);
            this.f14788d.set(this.f14789e);
            if (!this.f14800p) {
                this.f14788d.inset((float) (this.f14798n + this.f14802r), (float) (this.f14798n + this.f14802r));
            }
            this.f14809y = Math.min(this.f14788d.height() / 2.0f, this.f14788d.width() / 2.0f);
            this.f14790f.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            m19130c();
            invalidate();
        }
    }

    private void m19130c() {
        float height;
        float width;
        float f = 0.0f;
        this.f14792h.set(null);
        if (((float) this.f14807w) * this.f14788d.height() > this.f14788d.width() * ((float) this.f14808x)) {
            height = this.f14788d.height() / ((float) this.f14808x);
            width = (this.f14788d.width() - (((float) this.f14807w) * height)) * 0.5f;
        } else {
            height = this.f14788d.width() / ((float) this.f14807w);
            width = 0.0f;
            f = (this.f14788d.height() - (((float) this.f14808x) * height)) * 0.5f;
        }
        this.f14792h.setScale(height, height);
        this.f14792h.postTranslate(((float) ((int) (width + 0.5f))) + this.f14788d.left, ((float) ((int) (f + 0.5f))) + this.f14788d.top);
        this.f14806v.setLocalMatrix(this.f14792h);
    }
}
