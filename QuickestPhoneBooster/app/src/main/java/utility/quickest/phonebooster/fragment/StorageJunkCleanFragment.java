package utility.quickest.phonebooster.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.activity.JunkCleanFinishActivity;
import utility.quickest.phonebooster.adapter.StorageJunkExpandableListAdapter;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.model_helper.dr;
import utility.quickest.phonebooster.model_helper.eh;
import utility.quickest.phonebooster.model_helper.fw;
import utility.quickest.phonebooster.model_helper.gy;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hm;
import utility.quickest.phonebooster.model_helper.ho;
import utility.quickest.phonebooster.model_helper.hz;
import utility.quickest.phonebooster.model_helper.id;
import utility.quickest.phonebooster.p114d.C2444b;
import utility.quickest.phonebooster.p114d.C2445c;
import utility.quickest.phonebooster.p114d.C2446d;
import utility.quickest.phonebooster.p114d.C2450h;
import utility.quickest.phonebooster.util.C2461k;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2539i;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.CustomRiseNumberTextView;
import utility.quickest.phonebooster.view.NoScrollListView;
import utility.quickest.phonebooster.view.co;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;

public class StorageJunkCleanFragment extends BaseFragment {
    private fw f13483a = new fw(gy.f14305a);
    private fw f13484b = new fw(gy.f14306b);
    private dr f13485c = dr.m18448a();
    private eh f13486d = new eh();
    private C2492b f13487e = C2492b.m18285a();
    private StorageJunkExpandableListAdapter f13488f;
    private boolean f13489g = false;
    private List<C2445c> f13490h;
    private List<C2450h> f13491i;
    private List<C2444b> f13492j;
    private List<C2446d> f13493k;
    private List<C2444b> f13494l = new ArrayList();
    private TranslateAnimation f13495m;
    @BindView
    protected ViewGroup mActionBarBackIcon;
    @BindView
    protected TextView mActionBarTitle;
    @BindView
    protected ImageView mApkJunk;
    @BindView
    protected ImageView mCacheJunk;
    @BindView
    protected ImageView mFileJunk;
    @BindView
    protected ViewGroup mGroupContainer;
    @BindView
    protected TextView mJunkCleanButton;
    @BindView
    protected CardView mJunkCleanButtonBg;
    @BindView
    protected View mJunkFileProgress;
    @BindView
    protected ImageView mMemoryJunk;
    @BindView
    protected ScrollView mScrollView;
    @BindView
    protected NoScrollListView mStorageJunkListView;
    @BindView
    protected CustomRiseNumberTextView mStorageJunkSize;
    @BindView
    protected ViewGroup mStorageJunkSizeContainer;
    @BindView
    protected TextView mStorageJunkSizeSuggested;
    @BindView
    protected TextView mStorageJunkSizeTotal;
    @BindView
    protected ViewGroup mStorageJunkSizeTotalContainer;
    @BindView
    protected TextView mStorageJunkSizeTotalTag;
    @BindView
    protected TextView mStorageJunkSizeUnit;
    private final C2461k f13496n = new gw(this);

    @OnClick
    public void doBack() {
        C2542m.m19082a("junk_clean_fragment", "back", null);
        getActivity().finish();
    }

    @OnClick
    public void doClean() {
        Pair q = C2535e.m19052q();
        C2542m.m19083a("junk_clean_fragment", "junk_clean", null, String.valueOf((int) ((DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - (((float) ((Long) q.first).longValue()) / ((float) ((Long) q.second).longValue()))) * 100.0f)));
        this.f13490h = this.f13488f.m17368b();
        this.f13491i = this.f13488f.m17369c();
        this.f13492j = this.f13488f.m17370d();
        this.f13493k = this.f13488f.m17371e();
        this.f13488f.m17367a(this.f13490h, this.f13491i, this.f13492j, this.f13493k, false);
        this.mScrollView.scrollTo(0, 0);
        this.f13488f.m17372f();
        fw.m18575b();
        this.f13483a.m18597a(this.f13488f.m17368b(), 0, 0);
        hh.m18629a(ho.Junk);
        hh.m18626a(this.f13488f.m17364a());
    }

    public static StorageJunkCleanFragment m17911a() {
        return new StorageJunkCleanFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_storage_junk_clean, null);
        ButterKnife.m2793a(this, inflate);
        this.mActionBarBackIcon.setVisibility(0);
        this.mActionBarTitle.setText(m17696a((int) R.string.junk_clean));
        this.mStorageJunkSizeTotalContainer.setVisibility(4);
        if (getActivity() != null) {
            co.m19372a(getActivity(), m17699c().getColor(R.color.gray_dark));
        }
        this.f13488f = new StorageJunkExpandableListAdapter(this.mStorageJunkListView, this);
        this.mStorageJunkListView.setAdapter(this.f13488f);
        this.mStorageJunkListView.setGroupIndicator(null);
        this.mJunkCleanButtonBg.setCardBackgroundColor(m17699c().getColor(R.color.gray_b));
        this.mJunkCleanButtonBg.setCardElevation(0.0f);
        this.mJunkCleanButton.setClickable(false);
        this.mGroupContainer.setVisibility(0);
        this.mStorageJunkListView.setVisibility(8);
        this.mCacheJunk.setImageResource(R.drawable.ic_load_unload);
        this.mFileJunk.setImageResource(R.drawable.ic_load_unload);
        this.mApkJunk.setImageResource(R.drawable.ic_load_unload);
        this.mMemoryJunk.setImageResource(R.drawable.ic_load_unload);
        if (hh.m18637b(hm.JUNK)) {
            if (hz.m18683a().m18693a(id.JunkScanQuick)) {
                m17934k();
            } else {
                m17933j();
            }
            m17928g();
        } else {
            m17923e();
        }
        this.f13487e.m18328b(db.JUNK1);
        this.f13487e.m18328b(db.JUNK_INTER);
        Pair q = C2535e.m19052q();
        C2542m.m19083a("junk_clean_fragment", "junk_clean_enter", null, String.valueOf((int) ((DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - (((float) ((Long) q.first).longValue()) / ((float) ((Long) q.second).longValue()))) * 100.0f)));
        return inflate;
    }

    public void onStart() {
        super.onStart();
        C2539i.EVENT_CHECK_JUNK_LIST_ITEM.m19063a(this.f13496n);
    }

    public void onStop() {
        super.onStop();
        C2539i.EVENT_CHECK_JUNK_LIST_ITEM.m19066b(this.f13496n);
    }

    public void onDestroyView() {
        this.f13483a.m18595a(null);
        this.f13484b.m18595a(null);
        this.f13486d.m18476a(null);
        super.onDestroyView();
    }

    private void m17916a(String str) {
        List d = this.f13483a.m18599d();
        if (this.f13492j != null) {
            d.retainAll(this.f13492j);
        }
        List e = this.f13484b.m18600e();
        if (this.f13491i != null) {
            e.retainAll(this.f13491i);
        }
        List list = this.f13494l;
        if (this.f13492j != null) {
            list.retainAll(this.f13492j);
        }
        List c = this.f13486d.m18480c();
        if (this.f13493k != null) {
            c.retainAll(this.f13493k);
        }
        this.f13488f.m17367a(d, e, list, c, false);
        Pair a = C2542m.m19075a(this.f13488f.m17364a());
        this.mStorageJunkSize.setText((CharSequence) a.first);
        this.mStorageJunkSizeUnit.setText((CharSequence) a.second);
        long c2 = ((this.f13483a.m18598c() + this.f13484b.m18598c()) + m17931i()) + this.f13486d.m18479b();
        if (c2 <= 104857600) {
            this.mStorageJunkSize.setTextColor(m17699c().getColor(R.color.main_color));
            this.mStorageJunkSizeSuggested.setTextColor(m17699c().getColor(R.color.main_color));
            this.mStorageJunkSizeUnit.setTextColor(m17699c().getColor(R.color.main_color));
            this.mStorageJunkSizeTotal.setTextColor(m17699c().getColor(R.color.main_color));
            this.mStorageJunkSizeTotalTag.setTextColor(m17699c().getColor(R.color.main_color));
        } else if (c2 > 104857600) {
            this.mStorageJunkSize.setTextColor(m17699c().getColor(R.color.red));
            this.mStorageJunkSizeSuggested.setTextColor(m17699c().getColor(R.color.red));
            this.mStorageJunkSizeUnit.setTextColor(m17699c().getColor(R.color.red));
            this.mStorageJunkSizeTotal.setTextColor(m17699c().getColor(R.color.red));
            this.mStorageJunkSizeTotalTag.setTextColor(m17699c().getColor(R.color.red));
        }
    }

    public void m17935d() {
        if (this.f13489g) {
            m17923e();
        }
    }

    private void m17923e() {
        m17925f();
    }

    private void m17925f() {
        if (ViewUtil.m18937a((Fragment) this)) {
            getActivity().finish();
            try {
                JunkCleanFinishActivity.m17279a((Fragment) this, 0, 0, this.f13489g);
            } catch (Throwable th) {
            }
        }
    }

    private void m17928g() {
        this.mJunkFileProgress.setVisibility(0);
        if (this.f13495m == null) {
            this.f13495m = new TranslateAnimation(0.0f, (float) C2535e.f14679c, 0.0f, 0.0f);
            this.f13495m.setDuration(1500);
            this.f13495m.setRepeatCount(-1);
            this.f13495m.setInterpolator(new AccelerateDecelerateInterpolator());
        }
        this.mJunkFileProgress.startAnimation(this.f13495m);
    }

    private void m17930h() {
        this.mJunkFileProgress.setVisibility(8);
        if (this.f13495m != null) {
            this.f13495m.cancel();
        }
        this.mJunkFileProgress.clearAnimation();
    }

    private void m17913a(View view) {
        Animation rotateAnimation = new RotateAnimation(3.0f, 720.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(700);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setFillEnabled(true);
        rotateAnimation.setFillAfter(true);
        view.startAnimation(rotateAnimation);
    }

    private void m17919b(View view) {
        view.clearAnimation();
    }

    private long m17931i() {
        long j = 0;
        for (C2444b b : this.f13494l) {
            j = b.m17615b() + j;
        }
        return j;
    }

    private void m17933j() {
        this.f13483a.m18595a(new gx(this));
        this.f13484b.m18595a(new gy(this));
        this.f13486d.m18476a(new hc(this));
        this.f13483a.m18596a(0, 0);
        this.mCacheJunk.setImageResource(R.drawable.ic_load_loading);
        m17913a(this.mCacheJunk);
    }

    private void m17934k() {
        this.f13486d.m18476a(new he(this));
        this.f13484b.m18595a(new hf(this));
        this.f13483a.m18595a(new hj(this));
        this.f13486d.m18481d();
        this.mCacheJunk.setImageResource(R.drawable.ic_load_loading);
        m17913a(this.mCacheJunk);
    }
}
