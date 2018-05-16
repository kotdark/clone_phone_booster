package utility.quickest.phonebooster.fragment;

import android.view.ViewGroup.LayoutParams;
import utility.quickest.phonebooster.view.ad;

/* compiled from: JunkCleanFinishFragment */
class bv implements ad {
    final /* synthetic */ JunkCleanFinishFragment f13582a;

    bv(JunkCleanFinishFragment junkCleanFinishFragment) {
        this.f13582a = junkCleanFinishFragment;
    }

    public void mo3099a(int i, int i2) {
        int i3 = 0;
        if (this.f13582a.mScrollView.getScrollY() + this.f13582a.mScrollView.getHeight() < this.f13582a.mScrollView.getChildAt(0).getHeight()) {
            if (i > i2) {
                if (i >= this.f13582a.mFinishTagContainer.getHeight()) {
                    this.f13582a.mFinishTagContainerFloat.getLayoutParams().height = 0;
                    this.f13582a.mFinishTagContainerFloat.requestLayout();
                } else if (this.f13582a.mFinishTagContainerFloat.getHeight() > 0) {
                    int i4 = this.f13582a.mFinishTagContainerFloat.getLayoutParams().height;
                    LayoutParams layoutParams = this.f13582a.mFinishTagContainerFloat.getLayoutParams();
                    if (i4 - (i - i2) > 0) {
                        i3 = i4 - (i - i2);
                    }
                    layoutParams.height = i3;
                    this.f13582a.mFinishTagContainerFloat.requestLayout();
                }
            } else if (i > this.f13582a.mFinishTagContainer.getHeight()) {
            } else {
                if (i <= 0) {
                    this.f13582a.mFinishTagContainerFloat.getLayoutParams().height = this.f13582a.mFinishTagContainer.getLayoutParams().height;
                    this.f13582a.mFinishTagContainerFloat.requestLayout();
                } else if (this.f13582a.mFinishTagContainerFloat.getHeight() < this.f13582a.mFinishTagContainer.getHeight()) {
                    this.f13582a.mFinishTagContainerFloat.getLayoutParams().height += i2 - i;
                    this.f13582a.mFinishTagContainerFloat.requestLayout();
                }
            }
        }
    }
}
