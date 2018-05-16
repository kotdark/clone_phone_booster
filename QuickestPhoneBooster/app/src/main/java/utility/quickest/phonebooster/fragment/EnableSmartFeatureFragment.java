package utility.quickest.phonebooster.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.R;

public class EnableSmartFeatureFragment extends BaseFragment {
    @BindView
    protected ImageView mIllustration;
    @BindView
    protected TextView mIncludAdTip;

    @OnClick
    public void doClose() {
        C2542m.m19082a("enable_smart_feature_fragment", "no", null);
        if (ViewUtil.m18937a((Fragment) this)) {
            getActivity().finish();
            getActivity().overridePendingTransition(0, R.anim.activity_slide_out_to_bottom);
        }
    }

    @OnClick
    public void doOk() {
        C2542m.m19082a("enable_smart_feature_fragment", "yes", null);
        ig.m18707a().m18718e();
        ig.m18707a().m18715c(true);
        if (ViewUtil.m18937a((Fragment) this)) {
            getActivity().finish();
            getActivity().overridePendingTransition(0, R.anim.activity_slide_out_to_bottom);
        }
    }

    public static EnableSmartFeatureFragment m17780a() {
        return new EnableSmartFeatureFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_enable_smart_feature, null);
        ButterKnife.m2793a(this, inflate);
        try {
            this.mIllustration.setLayoutParams(new LayoutParams((C2535e.f14679c / 3) * 2, (C2535e.f14679c / 3) * 2));
            this.mIllustration.setImageResource(R.drawable.im_illustration);
        } catch (Throwable th) {
        }
        if (hh.m18641f()) {
            this.mIncludAdTip.setVisibility(0);
        } else {
            this.mIncludAdTip.setVisibility(4);
        }
        C2542m.m19082a("enable_smart_feature_fragment", "show", null);
        return inflate;
    }

    public boolean mo3085b() {
        C2542m.m19082a("enable_smart_feature_fragment", "no", null);
        return super.mo3085b();
    }
}
