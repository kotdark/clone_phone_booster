package utility.quickest.phonebooster.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.model_helper.AlwaysNotiHelper;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.R;

public class EnableNotiToolBarFragment extends BaseFragment {
    @BindView
    protected ImageView mIllustration;

    @OnClick
    public void doClose() {
        C2542m.m19082a("enable_noti_toolbar_fragment", "no", null);
        if (ViewUtil.m18937a((Fragment) this)) {
            getActivity().finish();
            getActivity().overridePendingTransition(0, R.anim.activity_slide_out_to_bottom);
        }
    }

    @OnClick
    public void doOk() {
        C2542m.m19082a("enable_noti_toolbar_fragment", "yes", null);
        AlwaysNotiHelper.m18171a(true);
        if (ViewUtil.m18937a((Fragment) this)) {
            getActivity().finish();
            getActivity().overridePendingTransition(0, R.anim.activity_slide_out_to_bottom);
        }
    }

    public static EnableNotiToolBarFragment m17779a() {
        return new EnableNotiToolBarFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_enable_noti_toolbar, null);
        ButterKnife.m2793a(this, inflate);
        try {
            this.mIllustration.setLayoutParams(new LayoutParams(-1, (C2535e.f14679c * 275) / 360));
            this.mIllustration.setImageResource(R.drawable.im_illustration_8);
        } catch (Throwable th) {
        }
        C2542m.m19082a("enable_noti_toolbar_fragment", "show", null);
        return inflate;
    }
}
