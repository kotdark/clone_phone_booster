package utility.quickest.phonebooster.fragment;

import android.view.ViewGroup.LayoutParams;
import utility.quickest.phonebooster.view.ad;

/* compiled from: AntivirusFinishFragment */
class C2474k implements ad {
    final /* synthetic */ AntivirusFinishFragment f13837a;

    C2474k(AntivirusFinishFragment antivirusFinishFragment) {
        this.f13837a = antivirusFinishFragment;
    }

    public void mo3099a(int i, int i2) {
        int i3 = 0;
        if (this.f13837a.mScrollView.getScrollY() + this.f13837a.mScrollView.getHeight() < this.f13837a.mScrollView.getChildAt(0).getHeight()) {
            if (i > i2) {
                if (i >= this.f13837a.mFinishTagContainer.getHeight()) {
                    this.f13837a.mFinishTagContainerFloat.getLayoutParams().height = 0;
                    this.f13837a.mFinishTagContainerFloat.requestLayout();
                } else if (this.f13837a.mFinishTagContainerFloat.getHeight() > 0) {
                    int i4 = this.f13837a.mFinishTagContainerFloat.getLayoutParams().height;
                    LayoutParams layoutParams = this.f13837a.mFinishTagContainerFloat.getLayoutParams();
                    if (i4 - (i - i2) > 0) {
                        i3 = i4 - (i - i2);
                    }
                    layoutParams.height = i3;
                    this.f13837a.mFinishTagContainerFloat.requestLayout();
                }
            } else if (i > this.f13837a.mFinishTagContainer.getHeight()) {
            } else {
                if (i <= 0) {
                    this.f13837a.mFinishTagContainerFloat.getLayoutParams().height = this.f13837a.mFinishTagContainer.getLayoutParams().height;
                    this.f13837a.mFinishTagContainerFloat.requestLayout();
                } else if (this.f13837a.mFinishTagContainerFloat.getHeight() < this.f13837a.mFinishTagContainer.getHeight()) {
                    this.f13837a.mFinishTagContainerFloat.getLayoutParams().height += i2 - i;
                    this.f13837a.mFinishTagContainerFloat.requestLayout();
                }
            }
        }
    }
}
