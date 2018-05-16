package utility.quickest.phonebooster.fragment;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.activity.PowerSavingFinishActivity;
import utility.quickest.phonebooster.adapter.AppGridAdapterNew;
import utility.quickest.phonebooster.model_helper.BatteryModel;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.model_helper.eh;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hm;
import utility.quickest.phonebooster.model_helper.ho;
import utility.quickest.phonebooster.model_helper.jt;
import utility.quickest.phonebooster.p114d.C2446d;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.BatteryViewVertical1;
import utility.quickest.phonebooster.view.co;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;

public class PowerSavingFragmentNew extends BaseFragment {
    private long f13444a;
    private boolean f13445b = false;
    private eh f13446c = new eh();
    private jt f13447d = jt.m18785a();
    private C2492b f13448e = C2492b.m18285a();
    private AppGridAdapterNew f13449f;
    private long f13450g;
    private AnimatorSet f13451h;
    private boolean f13452i = false;
    private boolean f13453j = false;
    private boolean f13454k = false;
    private boolean f13455l = false;
    @BindView
    protected ViewGroup mActionBar;
    @BindView
    protected ViewGroup mActionBar1;
    @BindView
    protected TextView mActionBarTitle;
    @BindView
    protected TextView mActionBarTitle1;
    @BindView
    protected BatteryViewVertical1 mBattery;
    @BindView
    protected ViewGroup mDeletingContainer;
    @BindView
    protected ImageView mDeletingIcon;
    @BindView
    protected ImageView mDeletingIcon2;
    @BindView
    protected ImageView mDeletingIcon3;
    @BindView
    protected GridView mMemoryJunkGridView;
    @BindView
    protected TextView mPowerSavingButton;
    @BindView
    protected CardView mPowerSavingButtonBg;
    @BindView
    protected TextView mPowerSavingDetail;
    @BindView
    protected TextView mPowerSavingDetail1;
    @BindView
    protected ViewGroup mPowerSavingDetailContainer;
    @BindView
    protected ImageView mPowerSavingWaitBg;
    @BindView
    protected ImageView mPowerSavingWaitBg1;
    @BindView
    protected ViewGroup mPowerSavingWaitContainer;
    @BindView
    protected ViewGroup mPowerSavingWaitContainerinner;
    @BindView
    protected TextView mPowerSavingWaitTip;
    @BindView
    protected ImageView mPowerSavingWaitView1;
    @BindView
    protected ImageView mPowerSavingWaitView2;

    @OnClick
    public void doBack() {
        if (ViewUtil.m18937a((Fragment) this)) {
            C2542m.m19082a("power_saving_frament", "back", null);
            getActivity().finish();
        }
    }

    @OnClick
    public void doClean() {
        C2542m.m19082a("power_saving_frament", "power_saving", null);
        this.f13446c.m18477a(m17894d());
        hh.m18629a(ho.Power);
    }

    public static PowerSavingFragmentNew m17887a() {
        return new PowerSavingFragmentNew();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_power_saving_new, null);
        ButterKnife.m2793a(this, inflate);
        this.mActionBarTitle.setText(m17696a((int) R.string.power_saving));
        this.mActionBarTitle1.setText(m17696a((int) R.string.power_saving));
        try {
            this.mPowerSavingWaitBg.setImageResource(R.drawable.bg_power_battery1);
            this.mPowerSavingWaitBg1.setImageResource(R.drawable.bg_power_battery2);
            this.mPowerSavingWaitView1.setImageResource(R.drawable.bg_power_wait_scanning);
            this.mPowerSavingWaitView2.setImageResource(R.drawable.bg_power_wait_scanning1);
        } catch (OutOfMemoryError e) {
        }
        LayoutParams layoutParams = new RelativeLayout.LayoutParams((C2535e.f14679c * 235) / 360, (C2535e.f14679c * 235) / 360);
        layoutParams.addRule(13);
        this.mPowerSavingWaitContainerinner.setLayoutParams(layoutParams);
        layoutParams = new RelativeLayout.LayoutParams((C2535e.f14679c * 95) / 360, (C2535e.f14679c * 153) / 360);
        layoutParams.addRule(13);
        this.mBattery.setLayoutParams(layoutParams);
        this.mPowerSavingButtonBg.setCardBackgroundColor(m17699c().getColor(R.color.gray_b));
        this.mPowerSavingButtonBg.setCardElevation((float) ViewUtil.m18918a(0.0f));
        this.mPowerSavingButton.setClickable(false);
        this.f13449f = new AppGridAdapterNew();
        this.mMemoryJunkGridView.setAdapter(this.f13449f);
        if (hh.m18637b(hm.SAVE_POWER)) {
            this.f13446c.m18476a(new fw(this));
            this.f13446c.m18481d();
            m17898e();
        } else {
            m17902h();
        }
        this.f13444a = System.currentTimeMillis();
        this.f13448e.m18328b(db.SAVE_POWER);
        C2542m.m19083a("power_saving_frament", "power_saving_enter", null, String.valueOf(BatteryModel.m18196a().m18215b().m17663a()));
        return inflate;
    }

    public void onDestroyView() {
        this.f13446c.m18476a(null);
        super.onDestroyView();
    }

    private List<C2446d> m17894d() {
        List<C2446d> arrayList = new ArrayList();
        for (C2446d c2446d : this.f13446c.m18480c()) {
            if (!this.f13447d.m18806a(c2446d.m17629a())) {
                arrayList.add(c2446d);
            }
        }
        return arrayList;
    }

    private void m17898e() {
        this.mPowerSavingWaitContainer.setVisibility(0);
        this.mDeletingContainer.setVisibility(8);
        this.mActionBar.setBackgroundColor(m17699c().getColor(R.color.blue));
        this.mActionBar1.setBackgroundColor(m17699c().getColor(R.color.blue));
        this.mActionBarTitle.setTextColor(m17699c().getColor(R.color.white));
        try {
            co.m19372a(getActivity(), m17699c().getColor(R.color.blue1));
        } catch (Throwable th) {
        }
        this.mPowerSavingWaitTip.setText(m17696a((int) R.string.power_saving_wait_tip));
        this.mPowerSavingWaitContainer.post(new fx(this));
    }

    private void m17900f() {
        if (this.f13452i && this.f13453j) {
            this.mPowerSavingWaitTip.setText(m17696a((int) R.string.power_saving_wait_tip1));
            this.mDeletingContainer.setVisibility(0);
            this.mBattery.setmCurrentEnegryPercent(100);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mBattery, "alpha", new float[]{0.0f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT});
            ofFloat.setRepeatCount(0);
            ofFloat.setDuration(1000);
            ofFloat.start();
            ThreadUtil.m19098a(new fz(this), 1100);
        }
    }

    private void m17901g() {
        if (this.f13454k && this.f13455l) {
            m17902h();
        }
    }

    private void m17902h() {
        m17903i();
    }

    private void m17903i() {
        if (ViewUtil.m18937a((Fragment) this)) {
            String str = "";
            if (this.f13445b) {
                str = C2542m.m19078a(m17696a((int) R.string.power_saving_finish_tip2), C2542m.m19093d(this.f13450g));
            } else if (hh.m18637b(hm.SAVE_POWER)) {
                str = m17696a((int) R.string.power_saving_finish_tip1);
            } else {
                str = m17696a((int) R.string.power_saving_finish_tip3);
            }
            getActivity().finish();
            try {
                PowerSavingFinishActivity.m17314a((Fragment) this, str);
            } catch (Throwable th) {
            }
        }
    }
}
