package utility.quickest.phonebooster.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
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

public class SwipeBackLayout extends FrameLayout {
    private static final String f15015a = SwipeBackLayout.class.getSimpleName();
    private View f15016b;
    private int f15017c;
    private int f15018d;
    private long f15019e;
    private int f15020f;
    private int f15021g;
    private Scroller f15022h;
    private int f15023i;
    private boolean f15024j;
    private boolean f15025k;
    private Drawable f15026l;
    private Activity f15027m;
    private List<ViewPager> f15028n;

    public SwipeBackLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15028n = new LinkedList();
        this.f15017c = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f15022h = new Scroller(context);
    }

    public void m19259a(Activity activity) {
        this.f15027m = activity;
        TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{16842836});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(0);
        viewGroup2.setBackgroundResource(resourceId);
        viewGroup.removeView(viewGroup2);
        addView(viewGroup2);
        setContentView(viewGroup2);
        viewGroup.addView(this);
    }

    private void setContentView(View view) {
        this.f15016b = (View) view.getParent();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewPager a = m19255a(this.f15028n, motionEvent);
        if (a != null && a.getCurrentItem() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        switch (motionEvent.getAction()) {
            case 0:
                int rawX = (int) motionEvent.getRawX();
                this.f15021g = rawX;
                this.f15018d = rawX;
                this.f15019e = SystemClock.elapsedRealtime();
                this.f15020f = (int) motionEvent.getRawY();
                break;
            case 2:
                if (((int) motionEvent.getRawX()) - this.f15018d > this.f15017c && Math.abs(((int) motionEvent.getRawY()) - this.f15020f) < Math.abs(((int) motionEvent.getRawX()) - this.f15018d)) {
                    return true;
                }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 1:
                this.f15024j = false;
                if (((int) motionEvent.getRawX()) - this.f15018d <= this.f15017c || Math.abs(((int) motionEvent.getRawY()) - this.f15020f) >= Math.abs(((int) motionEvent.getRawX()) - this.f15018d) || SystemClock.elapsedRealtime() - this.f15019e >= 500) {
                    if (this.f15016b.getScrollX() > (-this.f15023i) / 3) {
                        m19258b();
                        this.f15025k = false;
                        break;
                    }
                    this.f15025k = true;
                    m19256a();
                    break;
                }
                this.f15025k = true;
                m19256a();
                break;
                break;
            case 2:
                int rawX = (int) motionEvent.getRawX();
                int i = this.f15021g - rawX;
                this.f15021g = rawX;
                if (rawX - this.f15018d > this.f15017c && Math.abs(((int) motionEvent.getRawY()) - this.f15020f) < Math.abs(((int) motionEvent.getRawX()) - this.f15018d)) {
                    this.f15024j = true;
                }
                if (rawX - this.f15018d >= 0 && this.f15024j) {
                    this.f15016b.scrollBy(i, 0);
                    break;
                }
        }
        return true;
    }

    private void m19257a(List<ViewPager> list, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewPager) {
                list.add((ViewPager) childAt);
            } else if (childAt instanceof ViewGroup) {
                m19257a((List) list, (ViewGroup) childAt);
            }
        }
    }

    private ViewPager m19255a(List<ViewPager> list, MotionEvent motionEvent) {
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

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.f15023i = getWidth();
            m19257a(this.f15028n, (ViewGroup) this);
        }
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f15026l != null && this.f15016b != null) {
            int left = this.f15016b.getLeft() - this.f15026l.getIntrinsicWidth();
            int intrinsicWidth = this.f15026l.getIntrinsicWidth() + left;
            this.f15026l.setBounds(left, this.f15016b.getTop(), intrinsicWidth, this.f15016b.getBottom());
            this.f15026l.draw(canvas);
        }
    }

    private void m19256a() {
        int scrollX = this.f15023i + this.f15016b.getScrollX();
        this.f15022h.startScroll(this.f15016b.getScrollX(), 0, (-scrollX) + 1, 0, Math.abs((scrollX * 2) / 3));
        postInvalidate();
    }

    private void m19258b() {
        int scrollX = this.f15016b.getScrollX();
        this.f15022h.startScroll(this.f15016b.getScrollX(), 0, -scrollX, 0, Math.abs(scrollX));
        postInvalidate();
    }

    public void computeScroll() {
        if (this.f15022h.computeScrollOffset()) {
            this.f15016b.scrollTo(this.f15022h.getCurrX(), this.f15022h.getCurrY());
            postInvalidate();
            if (this.f15022h.isFinished() && this.f15025k) {
                this.f15027m.finish();
            }
        }
    }
}
