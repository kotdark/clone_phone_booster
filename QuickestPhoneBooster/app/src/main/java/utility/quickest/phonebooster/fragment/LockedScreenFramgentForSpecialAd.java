package utility.quickest.phonebooster.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.activity.MainActivity;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.model_helper.BatteryModel;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.cz;
import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.model_helper.fj;
import utility.quickest.phonebooster.model_helper.fk;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.BatteryView;
import utility.quickest.phonebooster.view.LockScreenSettingPopupWindowForSPAD;
import utility.quickest.phonebooster.R;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LockedScreenFramgentForSpecialAd extends BaseFragment {
    private BatteryModel f13343a;
    private C2492b f13344b;
    private SimpleDateFormat f13345c;
    private SimpleDateFormat f13346d;
    private LayoutInflater f13347e;
    private int f13348f;
    private final fj f13349g;
    private final cz f13350h;
    @BindView
    protected ViewGroup mLockScreenAdContainer;
    @BindView
    protected BatteryView mLockScreenBattery;
    @BindView
    protected TextView mLockScreenDate;
    @BindView
    protected TextView mLockScreenTime;

    public class ViewHolderSpecialAd {
        @BindView
        protected ViewGroup mAdContainer;
        @BindView
        protected ImageView mAdImage;
    }

    public class ViewHolderSpecialAd_ViewBinding<T extends ViewHolderSpecialAd> implements Unbinder {
        protected T f13342b;

        public ViewHolderSpecialAd_ViewBinding(T t, View view) {
            this.f13342b = t;
            t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mAdContainer'", ViewGroup.class);
            t.mAdImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.ad_image, "field 'mAdImage'", ImageView.class);
        }
    }

    @OnClick
    public void doSetting() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("ls_fragment_special_ad", "setting", null);
        if (ViewUtil.m18937a((Fragment) this)) {
            new LockScreenSettingPopupWindowForSPAD(new C2465do(this)).m19205a(this.mLockScreenAdContainer.getRootView());
        }
    }

    @OnClick
    public void openMemoryClean() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("ls_fragment_special_ad", "phone_boost", null);
        MainActivity.m17287a("locked_screen_phone_boost");
        Activity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MyApplicationLike.m17418b().m17431b("FromLockedScreen");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_locked_screen_for_special_ad, null);
        ButterKnife.m2793a(this, inflate);
        this.f13347e = layoutInflater;
        this.mLockScreenAdContainer.getViewTreeObserver().addOnGlobalLayoutListener(new dr(this));
        this.f13344b.m18325a(db.LOCKED_SCREEN, this.f13350h);
        return inflate;
    }

    public void onStart() {
        super.onStart();
        this.f13343a.m18214a(this.f13349g, fk.VERY_FAST);
        this.mLockScreenDate.setText(this.f13345c.format(new Date()));
        this.mLockScreenTime.setText(this.f13346d.format(new Date()));
        this.mLockScreenBattery.setmCurrentEnegryPercent(this.f13343a.m18215b().m17663a());
        this.mLockScreenBattery.setmIsCharging(this.f13343a.m18215b().m17664b());
    }

    public void onStop() {
        super.onStop();
        this.f13343a.m18213a(this.f13349g);
    }
}
