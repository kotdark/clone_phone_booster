package utility.quickest.phonebooster.fragment;

import android.app.Activity;

/* compiled from: LockedScreenFramgentForSpecialAd */
class dq implements Runnable {
    final /* synthetic */ dp f13660a;

    dq(dp dpVar) {
        this.f13660a = dpVar;
    }

    public void run() {
        Activity activity = this.f13660a.f13659a.f13658a.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
