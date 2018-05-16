package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.er;
import utility.quickest.phonebooster.model_helper.es;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hm;
import utility.quickest.phonebooster.util.ViewUtil;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;

/* compiled from: PowerSavingFragment */
class ft implements er {
    final /* synthetic */ PowerSavingFragment f13753a;

    ft(PowerSavingFragment powerSavingFragment) {
        this.f13753a = powerSavingFragment;
    }

    public void mo3094a(es esVar) {
        switch (fv.f13755a[esVar.ordinal()]) {
            case 1:
                hh.m18628a(hm.SAVE_POWER);
                this.f13753a.f13437b = true;
                this.f13753a.m17883h();
                return;
            case 3:
                this.f13753a.mPowerSavingButtonBg.setCardBackgroundColor(this.f13753a.m17699c().getColor(R.color.main_color));
                this.f13753a.mPowerSavingButtonBg.setCardElevation((float) ViewUtil.m18918a((float) DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
                this.f13753a.mPowerSavingButton.setClickable(true);
                this.f13753a.m17882g();
                return;
            default:
                return;
        }
    }

    public void mo3095a(String str) {
        this.f13753a.m17871a();
    }

    public void mo3096b(String str) {
        this.f13753a.f13441f.m17324a(this.f13753a.m17876d());
    }
}
