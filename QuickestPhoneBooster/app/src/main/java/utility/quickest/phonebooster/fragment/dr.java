package utility.quickest.phonebooster.fragment;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: LockedScreenFramgentForSpecialAd */
class dr implements OnGlobalLayoutListener {
    final /* synthetic */ LockedScreenFramgentForSpecialAd f13661a;

    dr(LockedScreenFramgentForSpecialAd lockedScreenFramgentForSpecialAd) {
        this.f13661a = lockedScreenFramgentForSpecialAd;
    }

    public void onGlobalLayout() {
        this.f13661a.f13348f = this.f13661a.mLockScreenAdContainer.getHeight();
    }
}
