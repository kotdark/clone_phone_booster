package utility.quickest.phonebooster.util;

import android.support.v4.app.Fragment;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.model_helper.cv;
import utility.quickest.phonebooster.R;

/* compiled from: ViewUtil */
class aq {
    cv f14615a;
    Fragment f14616b;
    boolean f14617c;
    int f14618d;

    private aq() {
        this.f14617c = false;
        this.f14618d = (int) ((((float) C2535e.f14679c) - (MyApplicationLike.getApplication().getResources().getDimension(R.dimen.gap_big) * 2.0f)) / Float.parseFloat(MyApplicationLike.getApplication().getResources().getString(R.string.ad_image_scale)));
    }
}
