package utility.quickest.phonebooster.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.mopub.volley.DefaultRetryPolicy;

/* compiled from: CustomRiseNumberTextView */
class C2600z implements AnimatorUpdateListener {
    final /* synthetic */ CustomRiseNumberTextView f15257a;

    C2600z(CustomRiseNumberTextView customRiseNumberTextView) {
        this.f15257a = customRiseNumberTextView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        try {
            float parseFloat = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
            this.f15257a.setText((CharSequence) this.f15257a.m19182a(parseFloat).first);
            if (this.f15257a.f14893h != null) {
                this.f15257a.f14893h.m19331a((long) parseFloat);
            }
            if (valueAnimator.getAnimatedFraction() >= DefaultRetryPolicy.DEFAULT_BACKOFF_MULT) {
                this.f15257a.f14886a = 0;
                if (this.f15257a.f14892g != null) {
                    this.f15257a.f14892g.m19330a();
                }
            }
        } catch (NumberFormatException e) {
        }
    }
}
