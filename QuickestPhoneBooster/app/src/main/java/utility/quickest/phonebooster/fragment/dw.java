package utility.quickest.phonebooster.fragment;

import android.support.v4.view.ViewPager.OnPageChangeListener;

/* compiled from: MainFragment */
class dw implements OnPageChangeListener {
    final /* synthetic */ MainFragment f13668a;

    dw(MainFragment mainFragment) {
        this.f13668a = mainFragment;
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
    }

    public void onPageScrollStateChanged(int i) {
        if (i == 1) {
            this.f13668a.f13369p = true;
        }
    }
}
