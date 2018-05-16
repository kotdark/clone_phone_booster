package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.view.CustomScrollView;
import utility.quickest.phonebooster.R;

public class AntivirusFinishFragment_ViewBinding<T extends AntivirusFinishFragment> implements Unbinder {
    protected T f13167b;
    private View f13168c;
    private View f13169d;
    private View f13170e;
    private View f13171f;
    private View f13172g;
    private View f13173h;
    private View f13174i;
    private View f13175j;

    public AntivirusFinishFragment_ViewBinding(T t, View view) {
        this.f13167b = t;
        t.mScrollView = (CustomScrollView)  Utils.findRequiredViewAsType(view, R.id.scroll_view, "field 'mScrollView'", CustomScrollView.class);
        View a =  Utils.findRequiredView(view, R.id.action_bar_back_icon, "field 'mActionBarBackIcon' and method 'doBack'");
        t.mActionBarBackIcon = (ViewGroup)  Utils.castView(a, R.id.action_bar_back_icon, "field 'mActionBarBackIcon'", ViewGroup.class);
        this.f13168c = a;
        a.setOnClickListener(new C2480q(this, t));
        t.mActionBarTitle = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title, "field 'mActionBarTitle'", TextView.class);
        t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_container, "field 'mAdContainer'", ViewGroup.class);
        t.mFinishTag1 = (ImageView)  Utils.findRequiredViewAsType(view, R.id.finish_tag1, "field 'mFinishTag1'", ImageView.class);
        t.mFinishTagFloat = (ImageView)  Utils.findRequiredViewAsType(view, R.id.finish_tag_float, "field 'mFinishTagFloat'", ImageView.class);
        a =  Utils.findRequiredView(view, R.id.junk_clean_container, "field 'mJunckCleanContainer' and method 'doCleanStorage'");
        t.mJunckCleanContainer = (ViewGroup)  Utils.castView(a, R.id.junk_clean_container, "field 'mJunckCleanContainer'", ViewGroup.class);
        this.f13169d = a;
        a.setOnClickListener(new C2481r(this, t));
        a =  Utils.findRequiredView(view, R.id.phone_boost_container, "field 'mPhoneBoostContainer' and method 'doCleanMemory'");
        t.mPhoneBoostContainer = (ViewGroup)  Utils.castView(a, R.id.phone_boost_container, "field 'mPhoneBoostContainer'", ViewGroup.class);
        this.f13170e = a;
        a.setOnClickListener(new C2482s(this, t));
        a =  Utils.findRequiredView(view, R.id.cpu_cooling_container, "field 'mCoolingContainer' and method 'doCPUCooling'");
        t.mCoolingContainer = (ViewGroup)  Utils.castView(a, R.id.cpu_cooling_container, "field 'mCoolingContainer'", ViewGroup.class);
        this.f13171f = a;
        a.setOnClickListener(new C2483t(this, t));
        a =  Utils.findRequiredView(view, R.id.power_saving_container, "field 'mPowerSavingContainer' and method 'doPowerSaving'");
        t.mPowerSavingContainer = (ViewGroup)  Utils.castView(a, R.id.power_saving_container, "field 'mPowerSavingContainer'", ViewGroup.class);
        this.f13172g = a;
        a.setOnClickListener(new C2484u(this, t));
        a =  Utils.findRequiredView(view, R.id.quick_boost_container, "field 'mQuickBoostContainer' and method 'doOpenQuickBoost'");
        t.mQuickBoostContainer = (ViewGroup)  Utils.castView(a, R.id.quick_boost_container, "field 'mQuickBoostContainer'", ViewGroup.class);
        this.f13173h = a;
        a.setOnClickListener(new C2485v(this, t));
        a =  Utils.findRequiredView(view, R.id.open_ls_container, "field 'mOpenLsContainer' and method 'doOpenLs'");
        t.mOpenLsContainer = (ViewGroup)  Utils.castView(a, R.id.open_ls_container, "field 'mOpenLsContainer'", ViewGroup.class);
        this.f13174i = a;
        a.setOnClickListener(new C2486w(this, t));
        a =  Utils.findRequiredView(view, R.id.open_noti_toolbar_container, "field 'mOpenNotiToolBarContainer' and method 'doOpenNT'");
        t.mOpenNotiToolBarContainer = (ViewGroup)  Utils.castView(a, R.id.open_noti_toolbar_container, "field 'mOpenNotiToolBarContainer'", ViewGroup.class);
        this.f13175j = a;
        a.setOnClickListener(new C2487x(this, t));
        t.mFinishTagContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.finish_tag_container, "field 'mFinishTagContainer'", ViewGroup.class);
        t.mFinishTagContainerFloat = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.finish_tag_container_float, "field 'mFinishTagContainerFloat'", ViewGroup.class);
        t.mFinishTagContainerJunkClean = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.finish_tag_container_junk_clean, "field 'mFinishTagContainerJunkClean'", ViewGroup.class);
        t.mFinishTagContainerJunkCleanFloat = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.finish_tag_container_junk_clean_float, "field 'mFinishTagContainerJunkCleanFloat'", ViewGroup.class);
        t.mFinishTagContainerCleanSuccess = (TextView)  Utils.findRequiredViewAsType(view, R.id.finish_tag_container_clean_success, "field 'mFinishTagContainerCleanSuccess'", TextView.class);
        t.mFinishTagContainerCleanSuccessFloat = (TextView)  Utils.findRequiredViewAsType(view, R.id.finish_tag_container_clean_success_float, "field 'mFinishTagContainerCleanSuccessFloat'", TextView.class);
    }

    @Override
    public void unbind() {

    }
}
