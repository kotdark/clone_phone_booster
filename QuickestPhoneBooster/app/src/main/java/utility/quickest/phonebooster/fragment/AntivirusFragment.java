package utility.quickest.phonebooster.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.activity.AntivirusFinishActivity;
import utility.quickest.phonebooster.adapter.AppVirusListAdapter;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.model_helper.dh;
import utility.quickest.phonebooster.model_helper.fl;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.ho;
import utility.quickest.phonebooster.model_helper.jm;
import utility.quickest.phonebooster.p114d. AppVirusInfo;
import utility.quickest.phonebooster.util.C2461k;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2539i;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.AntivirusWarningDialog;
import utility.quickest.phonebooster.view.co;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AntivirusFragment extends BaseFragment {
    private long f13176a;
    private dh f13177b = new dh();
    private C2492b f13178c = C2492b.m18285a();
    private jm f13179d = jm.m18760a();
    private AppVirusListAdapter f13180e;
    private AntivirusWarningDialog f13181f;
    private AntivirusWarningDialog f13182g;
    private RotateAnimation f13183h;
    private AlphaAnimation f13184i;
    private AlphaAnimation f13185j;
    private ScaleAnimation f13186k;
    private final Handler f13187l = new Handler(Looper.getMainLooper());
    private final Runnable f13188m = new C2488y(this);
    @BindView
    protected ViewGroup mActionBar;
    @BindView
    protected ViewGroup mActionBarBackIcon;
    @BindView
    protected ImageView mActionBarBackImg;
    @BindView
    protected TextView mActionBarTitle;
    @BindView
    protected ListView mAntivirusAppListView;
    @BindView
    protected ImageView mAntivirusBg;
    @BindView
    protected ViewGroup mAntivirusIgnore;
    @BindView
    protected ImageView mAntivirusMalwareBg;
    @BindView
    protected TextView mAntivirusNumber;
    @BindView
    protected TextView mAntivirusNumberUnit;
    @BindView
    protected ImageView mAntivirusThreatsBg;
    @BindView
    protected ViewGroup mAntivirusWaitContainer;
    @BindView
    protected ViewGroup mAntivirusWaitContainerBack;
    @BindView
    protected ViewGroup mAntivirusWaitDotContainer;
    @BindView
    protected View mDot;
    @BindView
    protected ProgressBar mScanProgress;
    @BindView
    protected TextView mScanningAppName;
    @BindView
    protected ViewGroup mTagContainer;
    private boolean f13189n = false;
    private List< AppVirusInfo> f13190o = new ArrayList();
    private List< AppVirusInfo> f13191p = new ArrayList();
    private final C2461k f13192q = new C2489z(this);

    @OnClick
    public void doBack() {
        C2542m.m19082a("antivirus_fragment", "back", null);
        getActivity().finish();
    }

    @OnClick
    public void doIgnore() {
        C2542m.m19082a("antivirus_fragment", "ignore", null);
        if (this.f13180e.m17334a().size() > 0) {
            m17725a(( AppVirusInfo) this.f13180e.m17334a().get(0));
        }
    }

    @OnClick
    public void doFix() {
        if (ViewUtil.m18937a((Fragment) this)) {
            C2542m.m19082a("antivirus_fragment", "fix", null);
            if (this.f13180e == null) {
                m17739i();
                return;
            }
            if (this.f13182g == null) {
                this.f13182g = new AntivirusWarningDialog(getActivity(), new aa(this), R.layout.dialog_antivirus_uninstall_warning);
            }
            this.f13182g.m19122a();
        }
    }

    public static AntivirusFragment m17723a() {
        return new AntivirusFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_antivirus, null);
        ButterKnife.bind(this, inflate);
        fl.m18526a().m18540b();
        hh.m18649n();
        this.mActionBarBackIcon.setVisibility(0);
        this.mActionBarTitle.setText(m17696a((int) R.string.antivirus));
        try {
            this.mAntivirusBg.setBackgroundResource(R.drawable.ic_antivirus_scanning);
        } catch (Throwable th) {
        }
        try {
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(C2535e.f14679c / 2, C2535e.f14679c / 2);
            layoutParams.addRule(13);
            this.mAntivirusBg.setLayoutParams(layoutParams);
            layoutParams = new RelativeLayout.LayoutParams(-1, C2535e.f14679c / 2);
            layoutParams.addRule(13);
            this.mAntivirusWaitDotContainer.setLayoutParams(layoutParams);
            this.mAntivirusWaitContainer.setTranslationY((float) ((-C2535e.f14680d) / 11));
            this.mTagContainer.setPadding(0, C2535e.f14680d / 10, 0, 0);
        } catch (Throwable th2) {
        }
        this.f13180e = new AppVirusListAdapter();
        this.mAntivirusAppListView.setAdapter(this.f13180e);
        this.f13176a = System.currentTimeMillis();
        this.f13178c.m18328b(db.ANTI_VIRUS);
        this.f13178c.m18328b(db.ANTI_VIRUS_INTER);
        this.mScanProgress.setProgress(0);
        this.mAntivirusNumber.setText(String.valueOf(0));
        this.mAntivirusNumberUnit.setText(C2542m.m19078a(m17696a((int) R.string.threat_found1), ""));
        this.f13177b.m18444a(new ab(this));
        this.f13177b.m18445a(100, 8000);
        m17732e();
        return inflate;
    }

    public void onStart() {
        super.onStart();
        C2539i.EVENT_IGNORE_APP_VIRUS.m19063a(this.f13192q);
    }

    public void onStop() {
        super.onStop();
        C2539i.EVENT_IGNORE_APP_VIRUS.m19066b(this.f13192q);
    }

    public void onDestroyView() {
        this.f13177b.m18444a(null);
        super.onDestroyView();
    }

    public void mo3084a(boolean z) {
        if (z && this.f13189n) {
            this.f13189n = false;
            m17739i();
            return;
        }
        super.mo3084a(z);
    }

    private void m17730d() {
        int i = 0;
        List h = m17737h();
        int size = h.size();
        if (size > 0) {
            if (size == 1) {
                this.mAntivirusNumber.setText(String.valueOf(size));
                this.mAntivirusNumberUnit.setText(C2542m.m19078a(m17696a((int) R.string.threat_found1), ""));
            } else {
                this.mAntivirusNumber.setText(String.valueOf(size));
                this.mAntivirusNumberUnit.setText(C2542m.m19078a(m17696a((int) R.string.threat_found), ""));
            }
            this.f13180e.m17335a(h);
            ViewGroup viewGroup = this.mAntivirusIgnore;
            if (size != 1) {
                i = 8;
            }
            viewGroup.setVisibility(i);
        }
    }

    private void m17732e() {
        this.mAntivirusWaitContainer.setVisibility(0);
        this.mAntivirusWaitContainerBack.setVisibility(0);
        this.mActionBarBackImg.setImageResource(R.drawable.ic_back_white1);
        this.mActionBarTitle.setTextColor(m17699c().getColor(R.color.white));
        this.mActionBar.setBackgroundColor(m17699c().getColor(R.color.blue));
        try {
            co.m19372a(getActivity(), m17699c().getColor(R.color.blue1));
        } catch (Throwable th) {
        }
        if (this.f13183h == null) {
            this.f13183h = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            this.f13183h.setDuration(2000);
            this.f13183h.setRepeatCount(-1);
        }
        this.mAntivirusBg.startAnimation(this.f13183h);
        this.f13187l.removeCallbacks(this.f13188m);
        this.f13187l.post(this.f13188m);
        if (this.f13184i == null) {
            this.f13184i = new AlphaAnimation(0.3f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
            this.f13184i.setDuration(1500);
            this.f13184i.setRepeatCount(-1);
            this.f13184i.setRepeatMode(2);
        }
        this.mAntivirusMalwareBg.startAnimation(this.f13184i);
        if (this.f13185j == null) {
            this.f13185j = new AlphaAnimation(0.3f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
            this.f13185j.setDuration(3000);
            this.f13185j.setRepeatCount(-1);
            this.f13185j.setRepeatMode(2);
        }
        this.mAntivirusThreatsBg.startAnimation(this.f13185j);
    }

    private void m17734f() {
        this.mAntivirusWaitContainer.setVisibility(8);
        this.mAntivirusWaitContainerBack.setVisibility(8);
        this.mActionBarBackImg.setImageResource(R.drawable.ic_back_gray_dark);
        this.mActionBarTitle.setTextColor(m17699c().getColor(R.color.gray3));
        this.mActionBar.setBackgroundColor(m17699c().getColor(R.color.white));
        try {
            co.m19372a(getActivity(), m17699c().getColor(R.color.gray_dark));
        } catch (Throwable th) {
        }
        if (this.f13183h != null) {
            this.f13183h.cancel();
        }
        this.mAntivirusBg.clearAnimation();
        this.f13187l.removeCallbacks(this.f13188m);
        if (this.f13184i != null) {
            this.f13184i.cancel();
        }
        this.mAntivirusMalwareBg.clearAnimation();
        if (this.f13185j != null) {
            this.f13185j.cancel();
        }
        this.mAntivirusThreatsBg.clearAnimation();
    }

    private void m17736g() {
        long currentTimeMillis = System.currentTimeMillis() - this.f13176a;
        if (currentTimeMillis <= 8000) {
            ThreadUtil.m19098a(new ac(this), 8000 - currentTimeMillis);
        } else if (m17737h().size() == 0) {
            m17739i();
        } else {
            m17734f();
            m17730d();
        }
    }

    private List< AppVirusInfo> m17737h() {
        List< AppVirusInfo> arrayList = new ArrayList();
        for ( AppVirusInfo c2448f : this.f13177b.m18446b()) {
            if (!this.f13179d.m18779a(c2448f)) {
                arrayList.add(c2448f);
            }
        }
        return arrayList;
    }

    private void m17739i() {
        hh.m18629a(ho.AntiVirus);
        m17741j();
    }

    private void m17741j() {
        if (ViewUtil.m18937a((Fragment) this)) {
            getActivity().finish();
            try {
                String name = C2479p.Safe.name();
                if (!this.f13191p.isEmpty()) {
                    name = C2479p.Ignore.name();
                } else if (!this.f13190o.isEmpty()) {
                    String name2 = C2479p.Finish.name();
                    Map a = C2535e.m19030a(false);
                    Set keySet = a.keySet();
                    for ( AppVirusInfo c2448f : this.f13190o) {
                        if (c2448f != null) {
                            String a2 = c2448f.m17659a();
                            if (a2 != null) {
                                a2 = a2.trim();
                            }
                            if (!TextUtils.isEmpty(a2) && keySet.contains(a2) && ((Integer) a.get(a2)).intValue() == c2448f.m17661c()) {
                                name = C2479p.HalfUninstall.name();
                                break;
                            }
                        }
                    }
                    name = name2;
                }
                AntivirusFinishActivity.m17260a(this, name);
            } catch (Throwable th) {
            }
        }
    }

    private void m17725a( AppVirusInfo c2448f) {
        if (!ViewUtil.m18937a((Fragment) this)) {
            return;
        }
        if (this.f13180e == null) {
            m17739i();
            return;
        }
        this.f13181f = new AntivirusWarningDialog(getActivity(), new ad(this, c2448f), R.layout.dialog_antivirus_ignore_warning);
        this.f13181f.m19122a();
    }
}
