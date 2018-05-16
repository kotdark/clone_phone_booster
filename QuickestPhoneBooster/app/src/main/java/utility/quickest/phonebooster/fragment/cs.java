package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.util.ViewUtil;

/* compiled from: LockedScreenFragment */
class cs implements Runnable {
    final /* synthetic */ LockedScreenFragment f13619a;

    cs(LockedScreenFragment lockedScreenFragment) {
        this.f13619a = lockedScreenFragment;
    }

    public void run() {
        if (ViewUtil.m18937a(this.f13619a)) {
            this.f13619a.getActivity().finish();
        }
    }
}
