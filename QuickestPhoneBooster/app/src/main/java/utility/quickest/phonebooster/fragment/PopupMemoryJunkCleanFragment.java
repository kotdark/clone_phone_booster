package utility.quickest.phonebooster.fragment;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.activity.MainActivity;
import utility.quickest.phonebooster.model_helper.eh;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.p115a.C2468s;
import utility.quickest.phonebooster.view.p115a.C2575v;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;

public class PopupMemoryJunkCleanFragment extends BaseFragment {
    private eh f13419a = new eh();
    private boolean f13420b = false;
    private ValueAnimator f13421c;
    private int f13422d;
    @BindView
    protected ViewGroup mBottomContainer;
    @BindView
    protected TextView mFinishTag;
    @BindView
    protected View mPlaceHolder;
    @BindView
    protected ImageView mWait1;
    @BindView
    protected ImageView mWait2;
    @BindView
    protected ImageView mWait3;
    @BindView
    protected ImageView mWait4;
    @BindView
    protected ImageView mWait5;
    @BindView
    protected ViewGroup mWaitContainer;

    @OnClick
    public void onNoConfirmClicked() {
        if (ViewUtil.m18937a((Fragment) this)) {
            C2542m.m19082a("pop_mem_junk_clean", "no", null);
            getActivity().finish();
        }
    }

    @OnClick
    public void onYesConfirmClicked() {
        if (ViewUtil.m18937a((Fragment) this)) {
            C2542m.m19082a("pop_mem_junk_clean", "yes", null);
            MainActivity.m17287a("notification_junk_always1");
            getActivity().finish();
        }
    }

    public static PopupMemoryJunkCleanFragment m17854a() {
        return new PopupMemoryJunkCleanFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_popup_memory_junk_clean, null);
        ButterKnife.m2793a(this, inflate);
        this.mPlaceHolder.setLayoutParams(new LayoutParams(C2535e.f14679c / 3, C2535e.f14679c / 3));
        try {
            this.mWait1.setImageResource(R.drawable.ic_pop_memory_wait1);
            this.mWait2.setImageResource(R.drawable.ic_pop_memory_wait2);
            this.mWait3.setImageResource(R.drawable.ic_pop_memory_wait3);
            this.mWait4.setImageResource(R.drawable.ic_pop_memory_wait4);
            this.mWait5.setImageResource(R.drawable.ic_pop_memory_wait5);
        } catch (Throwable th) {
        }
        this.mWait4.setVisibility(8);
        this.mWait5.setVisibility(8);
        this.mWaitContainer.getViewTreeObserver().addOnGlobalLayoutListener(new fg(this));
        this.f13419a.m18476a(new fh(this));
        this.f13419a.m18481d();
        m17860d();
        return inflate;
    }

    public boolean mo3085b() {
        C2542m.m19082a("pop_mem_junk_clean", "no", null);
        return super.mo3085b();
    }

    private void m17860d() {
        this.mWait1.setVisibility(0);
        this.mWait2.setVisibility(8);
        this.mWait4.setVisibility(8);
        this.mWait3.setVisibility(8);
        this.mWait5.setVisibility(8);
        m17855a(this.mWait1, 0.5f, new fi(this));
    }

    private void m17863e() {
        if (this.f13420b) {
            if (this.f13421c != null) {
                this.f13421c.cancel();
            }
            this.mWait1.setVisibility(8);
            this.mWait2.clearAnimation();
            this.mWait2.setVisibility(8);
            this.mWait4.setVisibility(8);
            this.mWait3.setVisibility(0);
            this.mWait5.setVisibility(0);
            Animation scaleAnimation = new ScaleAnimation(0.0f, 0.0f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
            scaleAnimation.setDuration(1000);
            this.mWait5.clearAnimation();
            this.mWait5.startAnimation(scaleAnimation);
            int i = this.f13422d / 4;
            if (i <= 0) {
                i = (C2535e.f14679c * 2) / 11;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mBottomContainer, "translationY", new float[]{(float) (C2535e.f14680d / 4), 0.0f});
            ofFloat.setDuration(1000);
            ofFloat.start();
            ofFloat = ObjectAnimator.ofFloat(this.mWait3, "translationY", new float[]{0.0f, (float) (-i)});
            ofFloat.setDuration(1000);
            ofFloat.start();
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.mWait5, "translationY", new float[]{0.0f, (float) (-i)});
            ofFloat2.setDuration(1000);
            ofFloat2.start();
            this.mBottomContainer.setVisibility(0);
        }
    }

    private void m17855a(View view, float f, C2468s c2468s) {
        C2575v c2575v = new C2575v(view, C2575v.c, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        C2575v c2575v2 = new C2575v(view, C2575v.d, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        c2575v.mo3156b().m19324a(50.0f);
        c2575v.mo3156b().m19328b(f);
        c2575v.m19282a(0.0f);
        c2575v2.mo3156b().m19324a(50.0f);
        c2575v2.mo3156b().m19328b(f);
        c2575v2.m19282a(0.0f);
        if (c2468s != null) {
            c2575v2.m19283a(c2468s);
        }
        c2575v.mo3154a();
        c2575v2.mo3154a();
    }
}
