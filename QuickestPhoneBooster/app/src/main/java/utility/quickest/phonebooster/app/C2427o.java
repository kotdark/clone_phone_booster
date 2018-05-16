package utility.quickest.phonebooster.app;

import utility.quickest.phonebooster.model_helper.hd;
import utility.quickest.phonebooster.model_helper.hg;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.view.LockedScreenView;
import utility.quickest.phonebooster.view.LockedScreenViewWithAd;

/* compiled from: MyApplicationLike */
class C2427o implements hg {
    final /* synthetic */ MyApplicationLike f12996a;

    C2427o(MyApplicationLike c2416d) {
        this.f12996a = c2416d;
    }

    public hd mo3079a() {
        if (hh.m18641f()) {
            return new LockedScreenViewWithAd(MyApplicationLike.getApplication());
        }
        return new LockedScreenView(MyApplicationLike.getApplication());
    }
}
