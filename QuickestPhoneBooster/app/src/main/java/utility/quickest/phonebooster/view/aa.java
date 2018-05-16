package utility.quickest.phonebooster.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.mopub.volley.DefaultRetryPolicy;

/* compiled from: CustomRiseNumberTextView */
class aa implements AnimatorUpdateListener {
    final /* synthetic */ CustomRiseNumberTextView f15113a;

    aa(CustomRiseNumberTextView customRiseNumberTextView) {
        this.f15113a = customRiseNumberTextView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        try {
            int parseInt = Integer.parseInt(valueAnimator.getAnimatedValue().toString());
            this.f15113a.setText(String.valueOf(parseInt));
            if (this.f15113a.f14893h != null) {
                this.f15113a.f14893h.m19331a((long) parseInt);
            }
            if (valueAnimator.getAnimatedFraction() >= DefaultRetryPolicy.DEFAULT_BACKOFF_MULT) {
                this.f15113a.f14886a = 0;
                if (this.f15113a.f14892g != null) {
                    this.f15113a.f14892g.m19330a();
                }
            }
        } catch (Throwable th) {
        }
    }
}
