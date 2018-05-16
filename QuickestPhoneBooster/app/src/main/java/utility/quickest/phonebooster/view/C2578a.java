package utility.quickest.phonebooster.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: AddQuickCleanDialog */
class C2578a implements AnimatorUpdateListener {
    final /* synthetic */ AddQuickCleanDialog f15112a;

    C2578a(AddQuickCleanDialog addQuickCleanDialog) {
        this.f15112a = addQuickCleanDialog;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        try {
            this.f15112a.mAddQcDialogCreated.setAlpha(Float.parseFloat(valueAnimator.getAnimatedValue().toString()));
        } catch (Throwable th) {
        }
    }
}
