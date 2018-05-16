package utility.quickest.phonebooster.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.facebook.ads.ad;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAdView;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.cv;
import utility.quickest.phonebooster.model_helper.im;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ViewUtil;
import com.mopub.nativeads.NativeAd;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LauncherFragmentNew extends BaseFragment {
    private im f13286a;
    private C2492b f13287b = C2492b.m18285a();
    private List<NativeAd> f13288c = new ArrayList();
    private List<ad> f13289d = new ArrayList();
    private List<View> f13290e = new ArrayList();
    private List<Object> f13291f = new ArrayList();
    @BindView
    protected ViewGroup mAdContainer;
    @BindView
    protected ViewGroup mAdContainerContainer;
    @BindView
    protected ImageView mHalo;
    @BindView
    protected LinearLayout mIconContainer;
    @BindView
    protected ImageView mLauncherIcon;
    @BindView
    protected TextView mLauncherOpenNow;
    @BindView
    protected ViewGroup mLauncherOpenNowContaier;
    @BindView
    protected ViewGroup mLauncherTermContaier;
    @BindView
    protected TextView mLauncherTermPrivacy;
    @BindView
    protected TextView mLauncherTermPrivacy1;
    @BindView
    protected ImageView mSkip;
    @BindView
    protected TextView mSkip1;
    @BindView
    protected ViewGroup mSkipContainer;

    @OnClick
    public void doOpenMain(View view) {
        if (view.getId() == R.id.launcher_open_now) {
            C2542m.m19082a("launcher_fragment", "open_now", null);
        } else if (view.getId() == R.id.skip) {
            C2542m.m19082a("launcher_fragment", "skip", null);
        } else if (view.getId() == R.id.skip1) {
            C2542m.m19082a("launcher_fragment", "skip", null);
        }
        this.f13286a.m18734a();
    }

    public static LauncherFragmentNew m17795a() {
        return new LauncherFragmentNew();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MyApplicationLike.m17418b().m17431b("FromHome");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_launcher_new, null);
        ButterKnife.m2793a(this, inflate);
        try {
            this.mLauncherIcon.setImageResource(R.drawable.ic_launcher_white_big);
        } catch (OutOfMemoryError e) {
        }
        try {
            int indexOf;
            int indexOf2;
            int indexOf3;
            int indexOf4;
            int indexOf5;
            int indexOf6;
            String a = m17696a((int) R.string.launcher_check_string);
            if (Locale.getDefault().getLanguage().equals("ar")) {
                indexOf = a.indexOf("end2");
                indexOf2 = a.indexOf("start2") - 4;
                indexOf3 = a.indexOf("end1") - 10;
                indexOf4 = a.indexOf("start1") - 14;
                indexOf5 = a.indexOf("end0") - 20;
                indexOf6 = a.indexOf("start0") - 24;
            } else {
                indexOf = a.indexOf("start0");
                indexOf2 = a.indexOf("end0") - 6;
                indexOf3 = a.indexOf("start1") - 10;
                indexOf4 = a.indexOf("end1") - 16;
                indexOf5 = a.indexOf("start2") - 20;
                indexOf6 = a.indexOf("end2") - 26;
            }
            CharSequence spannableString = new SpannableString(a.replace("start0", "").replace("end0", "").replace("start1", "").replace("end1", "").replace("start2", "").replace("end2", ""));
            spannableString.setSpan(new ForegroundColorSpan(this, -1) {
                final /* synthetic */ LauncherFragmentNew f13285a;

                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(-1);
                    textPaint.setFakeBoldText(true);
                    textPaint.setUnderlineText(false);
                    textPaint.setTextSize((float) ViewUtil.m18918a(13.0f));
                }
            }, indexOf, indexOf2, 33);
            spannableString.setSpan(new ck(this), indexOf3, indexOf4, 33);
            spannableString.setSpan(new cl(this), indexOf5, indexOf6, 33);
            this.mLauncherTermPrivacy.setText(spannableString);
            this.mLauncherTermPrivacy.setHighlightColor(-7829368);
            this.mLauncherTermPrivacy.setMovementMethod(LinkMovementMethod.getInstance());
        } catch (Throwable th) {
            this.mLauncherTermPrivacy.setText("");
        }
        this.mAdContainerContainer.setVisibility(8);
        this.f13286a = new im(new cm(this));
        return inflate;
    }

    public void onDestroyView() {
        for (Object next : this.f13291f) {
            if (next instanceof NativeAppInstallAd) {
                try {
                    ((NativeAppInstallAd) next).mo2545k();
                } catch (Throwable th) {
                }
            }
            if (next instanceof NativeContentAd) {
                try {
                    ((NativeContentAd) next).mo2553i();
                } catch (Throwable th2) {
                }
            }
        }
        for (View view : this.f13290e) {
            if (view instanceof NativeAppInstallAdView) {
                try {
                    ((NativeAppInstallAdView) view).setMediaView(null);
                    ((NativeAppInstallAdView) view).m8864a();
                } catch (Throwable th3) {
                }
            }
            if (view instanceof NativeContentAdView) {
                try {
                    ((NativeContentAdView) view).m8864a();
                } catch (Throwable th4) {
                }
            }
        }
        for (NativeAd destroy : this.f13288c) {
            try {
                destroy.destroy();
            } catch (Throwable th5) {
            }
        }
        this.f13288c.clear();
        for (ad c : this.f13289d) {
            try {
                c.m4085c();
            } catch (Throwable th6) {
            }
        }
        this.f13289d.clear();
        super.onDestroyView();
    }

    private void m17798a(cv cvVar) {
        if (cvVar != null) {
            View a = ViewUtil.m18922a((Fragment) this, cvVar, -1, (int) (((float) C2535e.f14679c) / Float.parseFloat(m17696a((int) R.string.ad_image_scale))), true, this.f13286a);
            if (a != null) {
                if (a.getTag() instanceof NativeAd) {
                    View createAdView;
                    NativeAd nativeAd = (NativeAd) a.getTag();
                    a.setTag(null);
                    this.f13288c.add(nativeAd);
                    try {
                        createAdView = nativeAd.createAdView(getActivity(), this.mAdContainer);
                    } catch (Throwable th) {
                        createAdView = null;
                    }
                    if (createAdView != null) {
                        cvVar.m18403a(createAdView, null, null, this.f13286a);
                        a = createAdView;
                    } else {
                        return;
                    }
                }
                if (a.getTag() instanceof ad) {
                    this.mSkip.setVisibility(0);
                    this.mSkip1.setVisibility(8);
                } else {
                    this.mSkip.setVisibility(8);
                    this.mSkip1.setVisibility(0);
                }
                if (a.getTag() instanceof ad) {
                    ad adVar = (ad) a.getTag();
                    a.setTag(null);
                    this.f13289d.add(adVar);
                }
                if ((a instanceof NativeAppInstallAdView) || (a instanceof NativeContentAdView)) {
                    this.f13290e.add(a);
                    this.f13291f.add(a.getTag());
                }
                this.mAdContainer.removeAllViews();
                this.mAdContainer.addView(a);
            }
        }
    }
}
