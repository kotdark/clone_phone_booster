package utility.quickest.phonebooster.fragment;

import android.util.Pair;
import utility.quickest.phonebooster.model_helper.er;
import utility.quickest.phonebooster.model_helper.es;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hm;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ViewUtil;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;

/* compiled from: MemoryJunkCleanFragment */
class ey implements er {
    final /* synthetic */ MemoryJunkCleanFragment f13721a;

    ey(MemoryJunkCleanFragment memoryJunkCleanFragment) {
        this.f13721a = memoryJunkCleanFragment;
    }

    public void mo3094a(es esVar) {
        switch (ez.f13722a[esVar.ordinal()]) {
            case 1:
                this.f13721a.mMemoryJunkSizeTotalContainer.setVisibility(8);
                hh.m18628a(hm.MEMORY);
                this.f13721a.f13398f = true;
                this.f13721a.m17843e();
                return;
            case 2:
                this.f13721a.mMemoryJunkSizeTotalContainer.setVisibility(8);
                return;
            case 3:
                this.f13721a.mMemoryJunkCleanButtonBg.setCardBackgroundColor(this.f13721a.m17699c().getColor(R.color.main_color));
                this.f13721a.mMemoryJunkCleanButtonBg.setCardElevation((float) ViewUtil.m18918a((float) DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
                this.f13721a.mMemoryJunkCleanButton.setClickable(true);
                if (this.f13721a.f13393a.m18479b() == 0) {
                    this.f13721a.m17843e();
                    return;
                }
                this.f13721a.f13395c.m17346a(this.f13721a.f13393a.m18480c(), true);
                Pair a = C2542m.m19075a(this.f13721a.m17840d());
                this.f13721a.mMemoryJunkSize.setText((CharSequence) a.first);
                this.f13721a.mMemoryJunkSizeUnit.setText((CharSequence) a.second);
                this.f13721a.mMemoryJunkSizeTotalContainer.setVisibility(0);
                this.f13721a.mMemoryJunkSizeTotal.setText(" " + C2542m.m19088b(this.f13721a.f13393a.m18479b()) + " ");
                return;
            case 4:
                this.f13721a.mMemoryJunkSizeTotalContainer.setVisibility(8);
                return;
            default:
                return;
        }
    }

    public void mo3095a(String str) {
        this.f13721a.m17836a(str);
    }

    public void mo3096b(String str) {
        this.f13721a.m17836a(str);
    }
}
