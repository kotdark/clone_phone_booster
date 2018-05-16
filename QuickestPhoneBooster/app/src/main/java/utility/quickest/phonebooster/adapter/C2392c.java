package utility.quickest.phonebooster.adapter;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;

/* compiled from: AppVirusListAdapter */
class C2392c extends Animation {
    final /* synthetic */ View f12914a;
    final /* synthetic */ int f12915b;
    final /* synthetic */ AppVirusListAdapter f12916c;

    C2392c(AppVirusListAdapter appVirusListAdapter, View view, int i) {
        this.f12916c = appVirusListAdapter;
        this.f12914a = view;
        this.f12915b = i;
    }

    protected void applyTransformation(float f, Transformation transformation) {
        if (f == DefaultRetryPolicy.DEFAULT_BACKOFF_MULT) {
            this.f12914a.setVisibility(8);
            if (this.f12914a.findViewById(R.id.container) != null) {
                this.f12914a.findViewById(R.id.container).setVisibility(8);
                return;
            }
            return;
        }
        this.f12914a.setX(((float) (-this.f12915b)) * f);
    }

    public boolean willChangeBounds() {
        return true;
    }
}
