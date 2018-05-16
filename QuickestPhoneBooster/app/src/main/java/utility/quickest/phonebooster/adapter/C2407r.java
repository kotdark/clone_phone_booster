package utility.quickest.phonebooster.adapter;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;

/* compiled from: StorageJunkExpandableListAdapter */
class C2407r extends Animation {
    final /* synthetic */ View f12951a;
    final /* synthetic */ int f12952b;
    final /* synthetic */ StorageJunkExpandableListAdapter f12953c;

    C2407r(StorageJunkExpandableListAdapter storageJunkExpandableListAdapter, View view, int i) {
        this.f12953c = storageJunkExpandableListAdapter;
        this.f12951a = view;
        this.f12952b = i;
    }

    protected void applyTransformation(float f, Transformation transformation) {
        if (f == DefaultRetryPolicy.DEFAULT_BACKOFF_MULT) {
            this.f12951a.setVisibility(8);
            if (this.f12951a.findViewById(R.id.container) != null) {
                this.f12951a.findViewById(R.id.container).setVisibility(8);
                return;
            }
            return;
        }
        this.f12951a.setX(((float) (-this.f12952b)) * f);
    }

    public boolean willChangeBounds() {
        return true;
    }
}
