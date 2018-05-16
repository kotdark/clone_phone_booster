package utility.quickest.phonebooster.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.activity.PowerSavingFinishActivity;
import utility.quickest.phonebooster.adapter.AppGridAdapter;
import utility.quickest.phonebooster.model_helper.BatteryModel;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.model_helper.eh;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hm;
import utility.quickest.phonebooster.model_helper.ho;
import utility.quickest.phonebooster.model_helper.jt;
import utility.quickest.phonebooster.p114d.C2446d;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.co;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;

public class PowerSavingFragment extends BaseFragment {
    private long f13436a;
    private boolean f13437b = false;
    private eh f13438c = new eh();
    private jt f13439d = jt.m18785a();
    private C2492b f13440e = C2492b.m18285a();
    private AppGridAdapter f13441f;
    private long f13442g;
    private AlphaAnimation f13443h;
    @BindView
    protected ViewGroup mActionBar;
    @BindView
    protected ViewGroup mActionBar1;
    @BindView
    protected TextView mActionBarTitle;
    @BindView
    protected TextView mActionBarTitle1;
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
    protected ViewGroup mPowerSavingWaitContainer;
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
        C2542m.m19083a("power_saving_frament", "power_saving", null, String.valueOf(BatteryModel.m18196a().m18215b().m17663a()));
        this.f13441f.m17324a(m17876d());
        this.f13438c.m18477a(m17876d());
        hh.m18629a(ho.Power);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_power_saving, null);
        ButterKnife.m2793a(this, inflate);
        this.mActionBarTitle.setText(m17696a((int) R.string.power_saving));
        this.mActionBarTitle1.setText(m17696a((int) R.string.power_saving));
        try {
            this.mPowerSavingWaitView1.setImageResource(R.drawable.bg_power_battery);
            this.mPowerSavingWaitView2.setImageResource(R.drawable.bg_power_wait);
        } catch (OutOfMemoryError e) {
        }
        this.mPowerSavingButtonBg.setCardBackgroundColor(m17699c().getColor(R.color.gray_b));
        this.mPowerSavingButtonBg.setCardElevation((float) ViewUtil.m18918a(0.0f));
        this.mPowerSavingButton.setClickable(false);
        this.f13441f = new AppGridAdapter();
        this.mMemoryJunkGridView.setAdapter(this.f13441f);
        if (hh.m18637b(hm.SAVE_POWER)) {
            this.f13438c.m18476a(new ft(this));
            this.f13438c.m18481d();
            m17879e();
        } else {
            m17883h();
        }
        this.f13436a = System.currentTimeMillis();
        this.f13440e.m18328b(db.SAVE_POWER);
        C2542m.m19083a("power_saving_frament", "power_saving_enter", null, String.valueOf(BatteryModel.m18196a().m18215b().m17663a()));
        return inflate;
    }

    public void onDestroyView() {
        this.f13438c.m18476a(null);
        super.onDestroyView();
    }

    private void m17871a() {
        if (this.f13438c.m18480c().size() <= 6) {
            this.mPowerSavingDetail.setTextColor(m17699c().getColor(R.color.main_color));
            this.mPowerSavingDetail1.setTextColor(m17699c().getColor(R.color.main_color));
            this.mPowerSavingDetail.setText(m17870a(m17696a((int) R.string.power_saving_tip2)));
            this.mPowerSavingDetail1.setText(C2542m.m19078a(m17696a((int) R.string.power_saving_tip2), C2542m.m19093d(this.f13442g)));
        } else if (this.f13438c.m18480c().size() > 6) {
            this.mPowerSavingDetail.setTextColor(m17699c().getColor(R.color.red));
            this.mPowerSavingDetail1.setTextColor(m17699c().getColor(R.color.red));
            this.mPowerSavingDetail.setText(m17870a(m17696a((int) R.string.power_saving_tip1)));
            this.mPowerSavingDetail1.setText(C2542m.m19078a(m17696a((int) R.string.power_saving_tip1), C2542m.m19093d(this.f13442g)));
        }
        this.f13441f.m17324a(m17876d());
    }

    private List<C2446d> m17876d() {
        List<C2446d> arrayList = new ArrayList();
        for (C2446d c2446d : this.f13438c.m18480c()) {
            if (!this.f13439d.m18806a(c2446d.m17629a())) {
                arrayList.add(c2446d);
            }
        }
        return arrayList;
    }

    private void m17879e() {
        this.mPowerSavingWaitContainer.setVisibility(0);
        this.mActionBar.setBackgroundColor(m17699c().getColor(R.color.blue));
        this.mActionBar1.setBackgroundColor(m17699c().getColor(R.color.blue));
        this.mActionBarTitle.setTextColor(m17699c().getColor(R.color.white));
        try {
            co.m19372a(getActivity(), m17699c().getColor(R.color.blue1));
        } catch (Throwable th) {
        }
        if (this.f13443h == null) {
            this.f13443h = new AlphaAnimation(0.0f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
            this.f13443h.setDuration(2000);
            this.f13443h.setRepeatMode(2);
            this.f13443h.setRepeatCount(-1);
        }
        this.mPowerSavingWaitView2.startAnimation(this.f13443h);
    }

    private void m17880f() {
        this.mPowerSavingWaitContainer.setVisibility(8);
        this.mActionBar.setBackgroundColor(m17699c().getColor(R.color.white));
        this.mActionBar1.setBackgroundColor(m17699c().getColor(R.color.white));
        this.mActionBarTitle.setTextColor(m17699c().getColor(R.color.gray3));
        try {
            co.m19372a(getActivity(), m17699c().getColor(R.color.gray_dark));
        } catch (Throwable th) {
        }
        if (this.f13443h != null) {
            this.f13443h.cancel();
        }
        this.mPowerSavingWaitView2.clearAnimation();
    }

    private void m17882g() {
        this.f13442g = BatteryModel.m18196a().m18212a(m17876d().size());
        if (this.f13438c.m18479b() == 0) {
            m17883h();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f13436a;
        if (currentTimeMillis < 6000) {
            ThreadUtil.m19098a(new fu(this), 6000 - currentTimeMillis);
            return;
        }
        m17880f();
        m17871a();
    }

    private void m17883h() {
        m17884i();
    }

    private void m17884i() {
        if (ViewUtil.m18937a((Fragment) this)) {
            String str = "";
            if (this.f13437b) {
                str = C2542m.m19078a(m17696a((int) R.string.power_saving_finish_tip2), C2542m.m19093d(this.f13442g));
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

    private SpannableString m17870a(String str) {
        try {
            int i;
            int i2;
            int indexOf;
            int indexOf2;
            CharSequence replace;
            String a = C2542m.m19078a(str, C2542m.m19094e(this.f13442g));
            if (a.contains("start1") && a.contains("end1")) {
                int indexOf3 = a.indexOf("start1");
                int indexOf4 = a.indexOf("end1") - 6;
                a = a.replace("start1", "").replace("end1", "");
                i = indexOf4;
                i2 = indexOf3;
            } else {
                i = -1;
                i2 = -1;
            }
            if (a.contains("start2") && a.contains("end2")) {
                indexOf = a.indexOf("end2") - 6;
                indexOf2 = a.indexOf("start2");
                replace = a.replace("start2", "").replace("end2", "");
            } else {
                indexOf = -1;
                indexOf2 = -1;
                Object obj = a;
            }
            SpannableString spannableString = new SpannableString(replace);
            if (!(i2 == -1 || i == -1)) {
                spannableString.setSpan(new TextAppearanceSpan("sans-serif-medium", 0, m17699c().getDimensionPixelSize(R.dimen.text_size_big), null, null), i2, i, 33);
            }
            if (!(indexOf2 == -1 || indexOf == -1)) {
                spannableString.setSpan(new TextAppearanceSpan("sans-serif-medium", 0, m17699c().getDimensionPixelSize(R.dimen.text_size_big), null, null), indexOf2, indexOf, 33);
            }
            return spannableString;
        } catch (Throwable th) {
            return new SpannableString(C2542m.m19078a(str, C2542m.m19093d(this.f13442g)));
        }
    }
}
