package utility.quickest.phonebooster.view;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import utility.quickest.phonebooster.C2380R;
import utility.quickest.phonebooster.R;

public class CircleIndicator extends LinearLayout implements OnPageChangeListener {
    private ViewPager f14857a;
    private int f14858b = -1;
    private int f14859c = -1;
    private int f14860d = -1;
    private int f14861e = R.animator.scale_with_alpha;
    private int f14862f = 0;
    private int f14863g = R.drawable.radius_unselected;
    private int f14864h = R.drawable.radius_unselected;
    private int f14865i = 0;
    private Animator f14866j;
    private Animator f14867k;

    public CircleIndicator(Context context) {
        super(context);
        m19172a(context, null);
    }

    public CircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m19172a(context, attributeSet);
    }

    private void m19172a(Context context, AttributeSet attributeSet) {
        setOrientation(0);
        setGravity(17);
        m19174b(context, attributeSet);
        m19171a(context);
    }

    private void m19174b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2380R.styleable.CircleIndicator);
            this.f14859c = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f14860d = obtainStyledAttributes.getDimensionPixelSize(1, -1);
            this.f14858b = obtainStyledAttributes.getDimensionPixelSize(2, -1);
            this.f14861e = obtainStyledAttributes.getResourceId(3, R.animator.scale_with_alpha);
            this.f14862f = obtainStyledAttributes.getResourceId(4, 0);
            this.f14863g = obtainStyledAttributes.getResourceId(5, R.drawable.radius_unselected);
            this.f14864h = obtainStyledAttributes.getResourceId(6, this.f14863g);
            obtainStyledAttributes.recycle();
        }
    }

    private void m19171a(Context context) {
        this.f14859c = this.f14859c < 0 ? m19175a(5.0f) : this.f14859c;
        this.f14860d = this.f14860d < 0 ? m19175a(5.0f) : this.f14860d;
        this.f14858b = this.f14858b < 0 ? m19175a(5.0f) : this.f14858b;
        this.f14861e = this.f14861e == 0 ? R.animator.scale_with_alpha : this.f14861e;
        this.f14866j = AnimatorInflater.loadAnimator(context, this.f14861e);
        if (this.f14862f == 0) {
            this.f14867k = AnimatorInflater.loadAnimator(context, this.f14861e);
            this.f14867k.setInterpolator(new C2597w());
        } else {
            this.f14867k = AnimatorInflater.loadAnimator(context, this.f14862f);
        }
        this.f14863g = this.f14863g == 0 ? R.drawable.radius_unselected : this.f14863g;
        this.f14864h = this.f14864h == 0 ? this.f14863g : this.f14864h;
    }

    public void setViewPager(ViewPager viewPager) {
        this.f14857a = viewPager;
        this.f14865i = this.f14857a.getCurrentItem();
        m19173a(viewPager);
        this.f14857a.removeOnPageChangeListener(this);
        this.f14857a.addOnPageChangeListener(this);
        onPageSelected(this.f14865i);
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        if (this.f14857a == null) {
            throw new NullPointerException("can not find Viewpager , setViewPager first");
        }
        this.f14857a.removeOnPageChangeListener(onPageChangeListener);
        this.f14857a.addOnPageChangeListener(onPageChangeListener);
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        if (this.f14857a.getAdapter() != null && this.f14857a.getAdapter().getCount() > 0) {
            if (this.f14867k.isRunning()) {
                this.f14867k.end();
            }
            if (this.f14866j.isRunning()) {
                this.f14866j.end();
            }
            try {
                View childAt = getChildAt(this.f14865i);
                childAt.setBackgroundResource(this.f14864h);
                this.f14867k.setTarget(childAt);
                this.f14867k.start();
                childAt = getChildAt(i);
                childAt.setBackgroundResource(this.f14863g);
                this.f14866j.setTarget(childAt);
                this.f14866j.start();
                this.f14865i = i;
            } catch (Throwable th) {
            }
        }
    }

    public void onPageScrollStateChanged(int i) {
    }

    private void m19173a(ViewPager viewPager) {
        removeAllViews();
        if (viewPager.getAdapter() != null) {
            int count = viewPager.getAdapter().getCount();
            if (count > 0) {
                m19170a(this.f14863g, this.f14866j);
                for (int i = 1; i < count; i++) {
                    m19170a(this.f14864h, this.f14867k);
                }
            }
        }
    }

    private void m19170a(int i, Animator animator) {
        if (animator.isRunning()) {
            animator.end();
        }
        View view = new View(getContext());
        view.setBackgroundResource(i);
        addView(view, this.f14859c, this.f14860d);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.leftMargin = this.f14858b;
        layoutParams.rightMargin = this.f14858b;
        view.setLayoutParams(layoutParams);
        animator.setTarget(view);
        animator.start();
    }

    public int m19175a(float f) {
        return (int) ((getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    public void setIndicatorBackgroundResId(int i) {
        this.f14863g = i;
    }

    public void setIndicatorUnselectedBackgroundResId(int i) {
        this.f14864h = i;
    }
}
