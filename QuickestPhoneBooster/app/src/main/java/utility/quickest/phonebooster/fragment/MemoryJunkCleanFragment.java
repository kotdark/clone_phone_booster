package utility.quickest.phonebooster.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.activity.JunkCleanFinishActivity;
import utility.quickest.phonebooster.adapter.MemoryJunkListAdapter;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.model_helper.eh;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hm;
import utility.quickest.phonebooster.model_helper.ho;
import utility.quickest.phonebooster.model_helper.jt;
import utility.quickest.phonebooster.model_helper.jz;
import utility.quickest.phonebooster.p114d.C2446d;
import utility.quickest.phonebooster.util.C2461k;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2539i;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.AddToWhiteListPopupWindow;
import utility.quickest.phonebooster.view.CustomRiseNumberTextView;
import utility.quickest.phonebooster.view.co;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;
import java.util.List;

public class MemoryJunkCleanFragment extends BaseFragment {
    private eh f13393a = new eh();
    private C2492b f13394b = C2492b.m18285a();
    private MemoryJunkListAdapter f13395c;
    private AddToWhiteListPopupWindow f13396d;
    private jt f13397e = jt.m18785a();
    private boolean f13398f = false;
    private List<C2446d> f13399g;
    private final C2461k f13400h = new eu(this);
    private final C2461k f13401i = new ew(this);
    private final jz f13402j = new ex(this);
    @BindView
    protected ViewGroup mActionBarBackIcon;
    @BindView
    protected TextView mActionBarTitle;
    @BindView
    protected View mJunkFileProgress;
    @BindView
    protected TextView mMemoryJunkCleanButton;
    @BindView
    protected CardView mMemoryJunkCleanButtonBg;
    @BindView
    protected ListView mMemoryJunkListView;
    @BindView
    protected CustomRiseNumberTextView mMemoryJunkSize;
    @BindView
    protected ViewGroup mMemoryJunkSizeContainer;
    @BindView
    protected TextView mMemoryJunkSizeSuggested;
    @BindView
    protected TextView mMemoryJunkSizeTotal;
    @BindView
    protected ViewGroup mMemoryJunkSizeTotalContainer;
    @BindView
    protected TextView mMemoryJunkSizeTotalTag;
    @BindView
    protected TextView mMemoryJunkSizeUnit;

    @OnClick
    public void doBack() {
        C2542m.m19082a("phone_boost_framgent", "back", null);
        getActivity().finish();
    }

    @OnClick
    public void doClean() {
        Pair p = C2535e.m19051p();
        C2542m.m19083a("phone_boost_framgent", "phone_boost", null, String.valueOf((int) ((DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - (((float) ((Long) p.first).longValue()) / ((float) ((Long) p.second).longValue()))) * 100.0f)));
        this.f13399g = this.f13395c.m17345a();
        this.f13395c.m17346a(this.f13399g, false);
        this.f13393a.m18477a(this.f13395c.m17345a());
        hh.m18629a(ho.Memory);
    }

    public static MemoryJunkCleanFragment m17832a() {
        return new MemoryJunkCleanFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_memory_junk_clean, null);
        ButterKnife.m2793a(this, inflate);
        this.mActionBarBackIcon.setVisibility(0);
        this.mActionBarTitle.setText(m17696a((int) R.string.phone_boost));
        if (getActivity() != null) {
            co.m19372a(getActivity(), m17699c().getColor(R.color.gray_dark));
        }
        this.mMemoryJunkCleanButtonBg.setCardBackgroundColor(m17699c().getColor(R.color.gray_b));
        this.mMemoryJunkCleanButtonBg.setCardElevation((float) ViewUtil.m18918a(0.0f));
        this.mMemoryJunkCleanButton.setClickable(false);
        this.f13395c = new MemoryJunkListAdapter();
        this.mMemoryJunkListView.setAdapter(this.f13395c);
        if (hh.m18637b(hm.MEMORY)) {
            this.f13393a.m18476a(new ey(this));
            this.f13393a.m18481d();
        } else {
            m17843e();
        }
        this.mMemoryJunkSizeTotalContainer.setVisibility(4);
        this.f13394b.m18328b(db.PROCESS1);
        this.f13394b.m18328b(db.PROCESS_INTER);
        Pair p = C2535e.m19051p();
        C2542m.m19083a("phone_boost_framgent", "phone_boost_enter", null, String.valueOf((int) ((DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - (((float) ((Long) p.first).longValue()) / ((float) ((Long) p.second).longValue()))) * 100.0f)));
        return inflate;
    }

    public void onStart() {
        super.onStart();
        C2539i.EVENT_ADD_TO_WHITE_LIST.m19063a(this.f13400h);
        C2539i.EVENT_CHECK_JUNK_LIST_ITEM.m19063a(this.f13401i);
        this.f13397e.m18805a(this.f13402j);
    }

    public void onStop() {
        super.onStop();
        C2539i.EVENT_ADD_TO_WHITE_LIST.m19066b(this.f13400h);
        C2539i.EVENT_CHECK_JUNK_LIST_ITEM.m19066b(this.f13401i);
        this.f13397e.m18807b(this.f13402j);
    }

    public void onDestroyView() {
        this.f13393a.m18476a(null);
        super.onDestroyView();
    }

    private void m17836a(String str) {
        List c = this.f13393a.m18480c();
        if (this.f13399g != null) {
            c.retainAll(this.f13399g);
        }
        this.f13395c.m17346a(c, false);
        Pair a = C2542m.m19075a(m17840d());
        this.mMemoryJunkSize.setText((CharSequence) a.first);
        this.mMemoryJunkSizeUnit.setText((CharSequence) a.second);
        if (this.f13393a.m18479b() <= 104857600) {
            this.mMemoryJunkSize.setTextColor(m17699c().getColor(R.color.main_color));
            this.mMemoryJunkSizeSuggested.setTextColor(m17699c().getColor(R.color.main_color));
            this.mMemoryJunkSizeUnit.setTextColor(m17699c().getColor(R.color.main_color));
            this.mMemoryJunkSizeTotal.setTextColor(m17699c().getColor(R.color.main_color));
            this.mMemoryJunkSizeTotalTag.setTextColor(m17699c().getColor(R.color.main_color));
        } else if (this.f13393a.m18479b() > 104857600) {
            this.mMemoryJunkSize.setTextColor(m17699c().getColor(R.color.red));
            this.mMemoryJunkSizeSuggested.setTextColor(m17699c().getColor(R.color.red));
            this.mMemoryJunkSizeUnit.setTextColor(m17699c().getColor(R.color.red));
            this.mMemoryJunkSizeTotal.setTextColor(m17699c().getColor(R.color.red));
            this.mMemoryJunkSizeTotalTag.setTextColor(m17699c().getColor(R.color.red));
        }
    }

    public boolean mo3085b() {
        if (this.f13396d == null || !this.f13396d.isShowing()) {
            return false;
        }
        this.f13396d.dismiss();
        return true;
    }

    private long m17840d() {
        long j = 0;
        for (C2446d b : this.f13395c.m17345a()) {
            j = b.m17630b() + j;
        }
        return j;
    }

    private void m17843e() {
        m17844f();
    }

    private void m17844f() {
        if (ViewUtil.m18937a((Fragment) this)) {
            getActivity().finish();
            try {
                JunkCleanFinishActivity.m17279a((Fragment) this, 1, 0, this.f13398f);
            } catch (Throwable th) {
            }
        }
    }
}
