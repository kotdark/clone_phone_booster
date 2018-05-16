package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.BatteryModel;
import utility.quickest.phonebooster.model_helper.er;
import utility.quickest.phonebooster.model_helper.es;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hm;

/* compiled from: PowerSavingFragmentNew */
class fw implements er {
    final /* synthetic */ PowerSavingFragmentNew f13756a;

    fw(PowerSavingFragmentNew powerSavingFragmentNew) {
        this.f13756a = powerSavingFragmentNew;
    }

    public void mo3094a(es esVar) {
        switch (gb.f13763a[esVar.ordinal()]) {
            case 1:
                hh.m18628a(hm.SAVE_POWER);
                this.f13756a.f13445b = true;
                this.f13756a.f13454k = true;
                this.f13756a.m17901g();
                return;
            case 3:
                if (this.f13756a.f13446c.m18479b() == 0) {
                    this.f13756a.f13452i = true;
                    this.f13756a.f13454k = true;
                    this.f13756a.m17900f();
                    return;
                }
                this.f13756a.f13450g = BatteryModel.m18196a().m18212a(this.f13756a.m17894d().size());
                this.f13756a.f13452i = true;
                this.f13756a.m17900f();
                this.f13756a.doClean();
                return;
            default:
                return;
        }
    }

    public void mo3095a(String str) {
    }

    public void mo3096b(String str) {
    }
}
