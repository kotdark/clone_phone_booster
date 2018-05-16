package utility.quickest.phonebooster.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.mopub.volley.DefaultRetryPolicy;

/* compiled from: CustomRiseNumberTextView */
class C2599y implements AnimatorUpdateListener {
    final /* synthetic */ CustomRiseNumberTextView f15256a;

    C2599y(CustomRiseNumberTextView customRiseNumberTextView) {
        this.f15256a = customRiseNumberTextView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        try {
            this.f15256a.setText(this.f15256a.f14891f.format((double) Float.parseFloat(valueAnimator.getAnimatedValue().toString())));
            if (valueAnimator.getAnimatedFraction() >= DefaultRetryPolicy.DEFAULT_BACKOFF_MULT) {
                this.f15256a.f14886a = 0;
                if (this.f15256a.f14892g != null) {
                    this.f15256a.f14892g.m19330a();
                }
            }
        } catch (NumberFormatException e) {
        }
    }
}
