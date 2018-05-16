package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.er;
import utility.quickest.phonebooster.model_helper.es;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;

/* compiled from: PopupMemoryJunkCleanFragment */
class fh implements er {
    final /* synthetic */ PopupMemoryJunkCleanFragment f13737a;

    fh(PopupMemoryJunkCleanFragment popupMemoryJunkCleanFragment) {
        this.f13737a = popupMemoryJunkCleanFragment;
    }

    public void mo3094a(es esVar) {
        switch (fm.f13742a[esVar.ordinal()]) {
            case 3:
                if (!this.f13737a.f13420b) {
                    this.f13737a.mFinishTag.setText(C2542m.m19078a(this.f13737a.m17696a((int) R.string.boosted), C2542m.m19088b(this.f13737a.f13419a.m18479b())));
                }
                this.f13737a.f13419a.m18477a(this.f13737a.f13419a.m18480c());
                return;
            default:
                return;
        }
    }

    public void mo3095a(String str) {
        if (!this.f13737a.f13420b) {
            this.f13737a.mFinishTag.setText(C2542m.m19078a(this.f13737a.m17696a((int) R.string.boosted), C2542m.m19088b(this.f13737a.f13419a.m18479b())));
        }
    }

    public void mo3096b(String str) {
    }
}
