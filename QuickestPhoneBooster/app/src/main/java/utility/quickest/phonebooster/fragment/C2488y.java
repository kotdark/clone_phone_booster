package utility.quickest.phonebooster.fragment;

import android.view.ViewGroup.LayoutParams;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.ViewUtil;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;
import java.util.Random;

/* compiled from: AntivirusFragment */
class C2488y implements Runnable {
    final /* synthetic */ AntivirusFragment f13863a;

    C2488y(AntivirusFragment antivirusFragment) {
        this.f13863a = antivirusFragment;
    }

    public void run() {
        if (ViewUtil.m18937a(this.f13863a)) {
            int nextInt = new Random().nextInt(9) + 6;
            int nextInt2 = (new Random().nextInt(100) * C2535e.f14679c) / 100;
            int nextInt3 = (new Random().nextInt(100) * this.f13863a.mAntivirusWaitDotContainer.getMeasuredHeight()) / 100;
            if (nextInt2 > (C2535e.f14679c * 4) / 5) {
                nextInt2 = (C2535e.f14679c * 4) / 5;
            }
            if (nextInt2 < C2535e.f14679c / 5) {
                nextInt2 = C2535e.f14679c / 5;
            }
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewUtil.m18918a((float) nextInt), ViewUtil.m18918a((float) nextInt));
            layoutParams.setMargins(nextInt2, nextInt3, 0, 0);
            this.f13863a.mDot.setLayoutParams(layoutParams);
            this.f13863a.mDot.setBackgroundResource(R.drawable.bg_white_circle);
            if (this.f13863a.f13186k == null) {
                this.f13863a.f13186k = new ScaleAnimation(0.0f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT, 0.0f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT, 1, 0.5f, 1, 0.5f);
                this.f13863a.f13186k.setDuration(500);
                this.f13863a.f13186k.setRepeatCount(1);
                this.f13863a.f13186k.setRepeatMode(2);
                this.f13863a.f13186k.setFillEnabled(true);
                this.f13863a.f13186k.setFillAfter(true);
            }
            this.f13863a.mDot.startAnimation(this.f13863a.f13186k);
            this.f13863a.f13187l.postDelayed(this.f13863a.f13188m, 1500);
        }
    }
}
