package utility.quickest.phonebooster.fragment;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: PopupMemoryJunkCleanFragment */
class fg implements OnGlobalLayoutListener {
    final /* synthetic */ PopupMemoryJunkCleanFragment f13736a;

    fg(PopupMemoryJunkCleanFragment popupMemoryJunkCleanFragment) {
        this.f13736a = popupMemoryJunkCleanFragment;
    }

    public void onGlobalLayout() {
        this.f13736a.f13422d = this.f13736a.mBottomContainer.getMeasuredHeight();
        if (this.f13736a.f13422d > 0) {
            this.f13736a.mBottomContainer.setVisibility(8);
            this.f13736a.mWaitContainer.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
