package utility.quickest.phonebooster.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.widget.Scroller;
import java.lang.reflect.Field;

/* compiled from: ViewPagerScroller */
public class cw extends Scroller {
    private int f15225a = 2000;

    public void m19379a(int i) {
        this.f15225a = i;
    }

    public cw(Context context) {
        super(context);
    }

    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.f15225a);
    }

    public void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.f15225a);
    }

    public void m19380a(ViewPager viewPager) {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(viewPager, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
