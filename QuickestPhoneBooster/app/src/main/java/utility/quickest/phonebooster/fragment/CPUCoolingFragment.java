package utility.quickest.phonebooster.fragment;

import android.animation.AnimatorSet;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.activity.CPUCoolingFinishActivity;
import utility.quickest.phonebooster.adapter.MemoryJunkListAdapter;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.model_helper.eh;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hm;
import utility.quickest.phonebooster.model_helper.ho;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.model_helper.il;
import utility.quickest.phonebooster.model_helper.jd;
import utility.quickest.phonebooster.model_helper.jj;
import utility.quickest.phonebooster.model_helper.jt;
import utility.quickest.phonebooster.model_helper.jz;
import utility.quickest.phonebooster.p114d.C2446d;
import utility.quickest.phonebooster.util.C2461k;
import utility.quickest.phonebooster.util.C2539i;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.AddToWhiteListPopupWindow;
import utility.quickest.phonebooster.view.co;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;

public class CPUCoolingFragment extends BaseFragment {
    private long f13217a;
    private boolean f13218b = false;
    private eh f13219c = new eh();
    private jd f13220d = jd.m18741a();
    private C2492b f13221e = C2492b.m18285a();
    private MemoryJunkListAdapter f13222f;
    private AddToWhiteListPopupWindow f13223g;
    private jt f13224h = jt.m18785a();
    private AnimatorSet f13225i;
    private final jj f13226j = new az(this);
    private final C2461k f13227k = new ba(this);
    private final jz f13228l = new bc(this);
    @BindView
    protected ViewGroup mActionBar;
    @BindView
    protected ViewGroup mActionBarBackIcon;
    @BindView
    protected ImageView mActionBarBackImg;
    @BindView
    protected TextView mActionBarTitle;
    @BindView
    protected ListView mMemoryJunkListView;
    @BindView
    protected TextView mTemperatureCleanButton;
    @BindView
    protected CardView mTemperatureCleanButtonBg;
    @BindView
    protected ViewGroup mTemperatureContainer;
    @BindView
    protected TextView mTemperatureNumber;
    @BindView
    protected TextView mTemperatureTag;
    @BindView
    protected TextView mTemperatureTip;
    @BindView
    protected TextView mTemperatureUnit;
    @BindView
    protected ToggleButton mTemperatureUnitToogleeButton;
    @BindView
    protected ViewGroup mTemperatureUnitToogleeButtonContainer;
    @BindView
    protected TextView mTemperatureUnitToogleeTextC;
    @BindView
    protected TextView mTemperatureUnitToogleeTextF;
    @BindView
    protected ImageView mTemperatureWait;
    @BindView
    protected ImageView mTemperatureWait1;
    @BindView
    protected ImageView mTemperatureWaitBg;
    @BindView
    protected ImageView mTemperatureWaitBg1;
    @BindView
    protected ViewGroup mTemperatureWaitContainer;
    @BindView
    protected ViewGroup mTemperatureWaitContainerBack;

    @OnClick
    public void doBack() {
        C2542m.m19082a("cpu_cooling_fragment", "back", null);
        getActivity().finish();
    }

    @OnClick
    public void doClean() {
        hh.m18648m();
        this.f13222f.m17346a(this.f13222f.m17345a(), false);
        this.f13219c.m18477a(this.f13222f.m17345a());
        C2542m.m19082a("cpu_cooling_fragment", "cpu_cooling", null);
        hh.m18629a(ho.Cpu);
    }

    @OnClick
    public void onTemUnitToggle(ToggleButton toggleButton) {
        boolean isChecked = toggleButton.isChecked();
        C2542m.m19082a("cpu_cooling_fragment", "unit_toggle", null);
        if (isChecked) {
            this.mTemperatureUnitToogleeTextC.setTextColor(m17699c().getColor(R.color.main_color));
            this.mTemperatureUnitToogleeTextF.setTextColor(m17699c().getColor(R.color.gray));
            ig.m18707a().m18710a(il.Celsius);
            this.mTemperatureNumber.setText(String.valueOf(this.f13220d.m18754b()));
            this.mTemperatureUnit.setText(m17696a((int) R.string.cpu_cooling_temperature_unit));
            return;
        }
        this.mTemperatureUnitToogleeTextC.setTextColor(m17699c().getColor(R.color.gray));
        this.mTemperatureUnitToogleeTextF.setTextColor(m17699c().getColor(R.color.main_color));
        ig.m18707a().m18710a(il.Fahrenheit);
        this.mTemperatureNumber.setText(String.valueOf(C2542m.m19073a(this.f13220d.m18754b())));
        this.mTemperatureUnit.setText(m17696a((int) R.string.cpu_cooling_temperature_unit1));
    }

    public static CPUCoolingFragment m17755a() {
        return new CPUCoolingFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_cpu_cooling, null);
        ButterKnife.m2793a(this, inflate);
        this.mActionBarBackIcon.setVisibility(0);
        this.mActionBarTitle.setText(m17696a((int) R.string.cpu_cooling));
        this.mTemperatureCleanButtonBg.setCardBackgroundColor(m17699c().getColor(R.color.gray_b));
        this.mTemperatureCleanButtonBg.setCardElevation(0.0f);
        this.mTemperatureCleanButton.setClickable(false);
        this.f13222f = new MemoryJunkListAdapter();
        this.mMemoryJunkListView.setAdapter(this.f13222f);
        this.f13217a = System.currentTimeMillis();
        this.f13221e.m18328b(db.CPU_COOL);
        this.f13221e.m18328b(db.PROCESS_INTER);
        try {
            this.mTemperatureWait.setBackgroundResource(R.drawable.bg_temperature_wait_scanning);
            this.mTemperatureWait1.setBackgroundResource(R.drawable.bg_temperature_wait_scanning1);
            this.mTemperatureWaitBg.setImageResource(R.drawable.bg_temperature_wait);
            this.mTemperatureWaitBg1.setImageResource(R.drawable.bg_temperature_wait1);
        } catch (OutOfMemoryError e) {
        }
        if (hh.m18637b(hm.CPU)) {
            this.f13219c.m18476a(new bd(this));
            this.f13219c.m18481d();
            m17764e();
        } else {
            m17771i();
        }
        return inflate;
    }

    public void onStart() {
        super.onStart();
        C2539i.EVENT_ADD_TO_WHITE_LIST.m19063a(this.f13227k);
        this.f13220d.m18755b(this.f13226j);
        this.f13224h.m18805a(this.f13228l);
        m17775k();
    }

    public void onStop() {
        super.onStop();
        C2539i.EVENT_ADD_TO_WHITE_LIST.m19066b(this.f13227k);
        this.f13220d.m18756c(this.f13226j);
        this.f13224h.m18807b(this.f13228l);
    }

    public void onDestroyView() {
        this.f13219c.m18476a(null);
        super.onDestroyView();
    }

    public boolean mo3085b() {
        if (this.f13223g == null || !this.f13223g.isShowing()) {
            return false;
        }
        this.f13223g.dismiss();
        return true;
    }

    private void m17762d() {
        this.f13222f.m17346a(m17769h(), false);
    }

    private void m17764e() {
        this.mTemperatureWaitContainer.setVisibility(0);
        this.mTemperatureWaitContainerBack.setVisibility(0);
        this.mTemperatureUnitToogleeButtonContainer.setVisibility(8);
        this.mActionBarBackImg.setImageResource(R.drawable.ic_back_white1);
        this.mActionBarTitle.setTextColor(m17699c().getColor(R.color.white));
        this.mActionBar.setBackgroundColor(m17699c().getColor(R.color.blue));
        try {
            co.m19372a(getActivity(), m17699c().getColor(R.color.blue1));
        } catch (Throwable th) {
        }
        this.mTemperatureWaitContainer.post(new be(this));
    }

    private void m17766f() {
        this.mTemperatureWaitContainer.setVisibility(8);
        this.mTemperatureWaitContainerBack.setVisibility(8);
        this.mTemperatureUnitToogleeButtonContainer.setVisibility(0);
        this.mActionBarBackImg.setImageResource(R.drawable.ic_back_gray_dark);
        this.mActionBarTitle.setTextColor(m17699c().getColor(R.color.gray3));
        this.mActionBar.setBackgroundColor(m17699c().getColor(R.color.white));
        try {
            co.m19372a(getActivity(), m17699c().getColor(R.color.gray_dark));
        } catch (Throwable th) {
        }
        if (this.f13225i != null) {
            this.f13225i.cancel();
        }
    }

    private void m17767g() {
        if (this.f13219c.m18479b() == 0) {
            m17771i();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f13217a;
        if (currentTimeMillis < 5000) {
            ThreadUtil.m19098a(new bf(this), 5000 - currentTimeMillis);
            return;
        }
        m17766f();
        m17762d();
    }

    private List<C2446d> m17769h() {
        List<C2446d> arrayList = new ArrayList();
        for (C2446d c2446d : this.f13219c.m18480c()) {
            if (!this.f13224h.m18806a(c2446d.m17629a())) {
                arrayList.add(c2446d);
            }
        }
        return arrayList;
    }

    private void m17771i() {
        m17774j();
    }

    private void m17774j() {
        if (ViewUtil.m18937a((Fragment) this)) {
            getActivity().finish();
            try {
                CPUCoolingFinishActivity.m17266a((Fragment) this, this.f13218b ? m17696a((int) R.string.cpu_cooling_clean_done) : m17696a((int) R.string.cpu_cooling_tag1));
            } catch (Throwable th) {
            }
        }
    }

    private void m17775k() {
        if (il.Celsius.equals(ig.m18707a().m18720g())) {
            this.mTemperatureNumber.setText(String.valueOf(this.f13220d.m18754b()));
            this.mTemperatureUnit.setText(m17696a((int) R.string.cpu_cooling_temperature_unit));
            this.mTemperatureUnitToogleeButton.setChecked(true);
            return;
        }
        this.mTemperatureNumber.setText(String.valueOf(C2542m.m19073a(this.f13220d.m18754b())));
        this.mTemperatureUnit.setText(m17696a((int) R.string.cpu_cooling_temperature_unit1));
        this.mTemperatureUnitToogleeButton.setChecked(false);
    }
}
