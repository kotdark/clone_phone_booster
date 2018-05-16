package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.er;
import utility.quickest.phonebooster.model_helper.es;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hm;
import utility.quickest.phonebooster.util.ViewUtil;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;

/* compiled from: CPUCoolingFragment */
class bd implements er {
    final /* synthetic */ CPUCoolingFragment f13552a;

    bd(CPUCoolingFragment cPUCoolingFragment) {
        this.f13552a = cPUCoolingFragment;
    }

    public void mo3094a(es esVar) {
        switch (bg.f13555a[esVar.ordinal()]) {
            case 1:
                hh.m18628a(hm.CPU);
                this.f13552a.f13218b = true;
                this.f13552a.m17771i();
                return;
            case 2:
                this.f13552a.mTemperatureCleanButtonBg.setCardBackgroundColor(this.f13552a.m17699c().getColor(R.color.main_color));
                this.f13552a.mTemperatureCleanButtonBg.setCardElevation((float) ViewUtil.m18918a((float) DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
                this.f13552a.mTemperatureCleanButton.setClickable(true);
                this.f13552a.m17767g();
                return;
            default:
                return;
        }
    }

    public void mo3095a(String str) {
        this.f13552a.m17762d();
    }

    public void mo3096b(String str) {
        this.f13552a.m17762d();
    }
}
