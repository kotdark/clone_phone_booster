package utility.quickest.phonebooster.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class LockedScreenViewWithAd_ViewBinding<T extends LockedScreenViewWithAd> implements Unbinder {
    protected T f14948b;
    private View f14949c;
    private View f14950d;
    private View f14951e;
    private View f14952f;
    private View f14953g;
    private View f14954h;
    private View f14955i;

    public LockedScreenViewWithAd_ViewBinding(T t, View view) {
        this.f14948b = t;
        t.mLockScreenBg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_bg, "field 'mLockScreenBg'", ImageView.class);
        t.mLockScreenTime = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_time, "field 'mLockScreenTime'", TextView.class);
        t.mLockScreenDate = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_date, "field 'mLockScreenDate'", TextView.class);
        t.mLockScreenBattery = (BatteryViewVertical)  Utils.findRequiredViewAsType(view, R.id.lock_screen_battery, "field 'mLockScreenBattery'", BatteryViewVertical.class);
        t.mLockScreenMemorySize = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_memory_size, "field 'mLockScreenMemorySize'", TextView.class);
        t.mLockScreenAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.lock_screen_ad_container, "field 'mLockScreenAdContainer'", ViewGroup.class);
        t.mLockScreenUnlock = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_unlock, "field 'mLockScreenUnlock'", TextView.class);
        View a =  Utils.findRequiredView(view, R.id.container, "field 'mSettingPopupContainer' and method 'closeWindow'");
        t.mSettingPopupContainer = (ViewGroup)  Utils.castView(a, R.id.container, "field 'mSettingPopupContainer'", ViewGroup.class);
        this.f14949c = a;
        a.setOnClickListener(new bi(this, t));
        a =  Utils.findRequiredView(view, R.id.container_close_choice, "field 'mCloseChoiceContainer' and method 'closeChoiceDialog'");
        t.mCloseChoiceContainer = (ViewGroup)  Utils.castView(a, R.id.container_close_choice, "field 'mCloseChoiceContainer'", ViewGroup.class);
        this.f14950d = a;
        a.setOnClickListener(new bj(this, t));
        View a2 =  Utils.findRequiredView(view, R.id.lock_screen_setting_close_lock_screen, "method 'closeLockScreen'");
        this.f14951e = a2;
        a2.setOnClickListener(new bk(this, t));
        a2 =  Utils.findRequiredView(view, R.id.yes_confirm, "method 'onYes'");
        this.f14952f = a2;
        a2.setOnClickListener(new bl(this, t));
        a2 =  Utils.findRequiredView(view, R.id.no_confirm, "method 'onNo'");
        this.f14953g = a2;
        a2.setOnClickListener(new bm(this, t));
        a2 =  Utils.findRequiredView(view, R.id.lock_screen_setting, "method 'doSetting'");
        this.f14954h = a2;
        a2.setOnClickListener(new bn(this, t));
        a2 =  Utils.findRequiredView(view, R.id.lock_screen_memory_container, "method 'openMemoryClean'");
        this.f14955i = a2;
        a2.setOnClickListener(new bo(this, t));
    }
}
