package utility.quickest.phonebooster.view;

import android.view.animation.Interpolator;
import com.mopub.volley.DefaultRetryPolicy;

/* compiled from: CircleIndicator */
class C2597w implements Interpolator {
    final /* synthetic */ CircleIndicator f15255a;

    private C2597w(CircleIndicator circleIndicator) {
        this.f15255a = circleIndicator;
    }

    public float getInterpolation(float f) {
        return Math.abs(DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - f);
    }
}
