package utility.quickest.phonebooster.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Scroller;
import java.util.LinkedList;
import java.util.List;

public class SwipeBackLayout1 extends FrameLayout {
    private static final String f15001a = SwipeBackLayout1.class.getSimpleName();
    private View f15002b;
    private int f15003c;
    private int f15004d;
    private long f15005e;
    private int f15006f;
    private int f15007g;
    private Scroller f15008h;
    private int f15009i;
    private boolean f15010j;
    private boolean f15011k;
    private Drawable f15012l;
    private List<ViewPager> f15013m;
    private cp f15014n;

    public SwipeBackLayout1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeBackLayout1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15013m = new LinkedList();
        this.f15003c = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f15008h = new Scroller(context);
    }

    public void m19254a(View view, cp cpVar) {
        addView(view);
        this.f15002b = this;
        this.f15014n = cpVar;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewPager a = m19250a(this.f15013m, motionEvent);
        if (a != null && a.getCurrentItem() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        switch (motionEvent.getAction()) {
            case 0:
                int rawX = (int) motionEvent.getRawX();
                this.f15007g = rawX;
                this.f15004d = rawX;
                this.f15005e = SystemClock.elapsedRealtime();
                this.f15006f = (int) motionEvent.getRawY();
                break;
            case 2:
                if (((int) motionEvent.getRawX()) - this.f15004d > this.f15003c && Math.abs(((int) motionEvent.getRawY()) - this.f15006f) < Math.abs(((int) motionEvent.getRawX()) - this.f15004d)) {
                    return true;
                }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 1:
                this.f15010j = false;
                if (((int) motionEvent.getRawX()) - this.f15004d <= this.f15003c || Math.abs(((int) motionEvent.getRawY()) - this.f15006f) >= Math.abs(((int) motionEvent.getRawX()) - this.f15004d) || SystemClock.elapsedRealtime() - this.f15005e >= 500) {
                    if (this.f15002b.getScrollX() > (-this.f15009i) / 3) {
                        m19253b();
                        this.f15011k = false;
                        break;
                    }
                    this.f15011k = true;
                    m19251a();
                    break;
                }
                this.f15011k = true;
                m19251a();
                break;
                break;
            case 2:
                int rawX = (int) motionEvent.getRawX();
                int i = this.f15007g - rawX;
                this.f15007g = rawX;
                if (rawX - this.f15004d > this.f15003c && Math.abs(((int) motionEvent.getRawY()) - this.f15006f) < Math.abs(((int) motionEvent.getRawX()) - this.f15004d)) {
                    this.f15010j = true;
                }
                if (rawX - this.f15004d >= 0 && this.f15010j) {
                    this.f15002b.scrollBy(i, 0);
                    break;
                }
        }
        return true;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.f15009i = getWidth();
            m19252a(this.f15013m, (ViewGroup) this);
        }
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f15012l != null && this.f15002b != null) {
            int left = this.f15002b.getLeft() - this.f15012l.getIntrinsicWidth();
            int intrinsicWidth = this.f15012l.getIntrinsicWidth() + left;
            this.f15012l.setBounds(left, this.f15002b.getTop(), intrinsicWidth, this.f15002b.getBottom());
            this.f15012l.draw(canvas);
        }
    }

    public void computeScroll() {
        if (this.f15008h.computeScrollOffset()) {
            this.f15002b.scrollTo(this.f15008h.getCurrX(), this.f15008h.getCurrY());
            postInvalidate();
            if (this.f15008h.isFinished() && this.f15011k && this.f15014n != null) {
                this.f15014n.mo3158a();
            }
        }
    }

    private void m19252a(List<ViewPager> list, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewPager) {
                list.add((ViewPager) childAt);
            } else if (childAt instanceof ViewGroup) {
                m19252a((List) list, (ViewGroup) childAt);
            }
        }
    }

    private ViewPager m19250a(List<ViewPager> list, MotionEvent motionEvent) {
        if (list == null || list.size() == 0) {
            return null;
        }
        Rect rect = new Rect();
        for (ViewPager viewPager : list) {
            viewPager.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return viewPager;
            }
        }
        return null;
    }

    private void m19251a() {
        int scrollX = this.f15009i + this.f15002b.getScrollX();
        this.f15008h.startScroll(this.f15002b.getScrollX(), 0, (-scrollX) + 1, 0, Math.abs((scrollX * 2) / 3));
        postInvalidate();
    }

    private void m19253b() {
        int scrollX = this.f15002b.getScrollX();
        this.f15008h.startScroll(this.f15002b.getScrollX(), 0, -scrollX, 0, Math.abs(scrollX));
        postInvalidate();
    }
}
