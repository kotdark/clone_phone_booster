package utility.quickest.phonebooster.app;

import android.content.res.Resources;
import com.google.android.gms.ads.C1851f;
import com.google.android.gms.ads.C1973m;
import utility.quickest.phonebooster.model_helper.cu;
import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.util.C2535e;
import com.mopub.mobileads.resource.DrawableConstants.CloseButton;
import utility.quickest.phonebooster.R;

/* compiled from: MyApplicationLike */
class C2425m implements cu {
    final /* synthetic */ MyApplicationLike f12994a;

    C2425m(MyApplicationLike c2416d) {
        this.f12994a = c2416d;
    }

    public C1973m mo3077a(db dbVar) {
        C1973m c1973m = new C1973m(MyApplicationLike.getApplication());
        Resources resources = MyApplicationLike.getApplication().getResources();
        if (dbVar.equals(db.JUNK1) || dbVar.equals(db.PROCESS1)) {
            c1973m.setAdSize(new C1851f(-1, resources.getInteger(R.integer.lock_screen_admob_height)));
            return c1973m;
        } else if (dbVar.equals(db.LOCKED_SCREEN)) {
            c1973m.setAdSize(new C1851f((int) ((((float) C2535e.f14679c) - (2.0f * resources.getDimension(R.dimen.ad_image_left_right_size))) / C2535e.f14678b), resources.getInteger(R.integer.lock_screen_admob_height)));
            return c1973m;
        } else if (!dbVar.equals(db.ONE_KEY_CLEAN)) {
            return null;
        } else {
            c1973m.setAdSize(new C1851f((int) ((((float) C2535e.f14679c) - (CloseButton.STROKE_WIDTH * resources.getDimension(R.dimen.ad_image_left_right_size))) / C2535e.f14678b), resources.getInteger(R.integer.lock_screen_admob_height)));
            return c1973m;
        }
    }
}
