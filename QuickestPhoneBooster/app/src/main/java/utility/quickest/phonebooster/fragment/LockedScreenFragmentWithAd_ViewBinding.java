package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.view.BatteryViewVertical;
import utility.quickest.phonebooster.R;

public class LockedScreenFragmentWithAd_ViewBinding<T extends LockedScreenFragmentWithAd> implements Unbinder {
    protected T f13325b;
    private View f13326c;
    private View f13327d;
    private View f13328e;
    private View f13329f;
    private View f13330g;
    private View f13331h;
    private View f13332i;

    public LockedScreenFragmentWithAd_ViewBinding(T t, View view) {
        this.f13325b = t;
        t.mLockScreenBg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_bg, "field 'mLockScreenBg'", ImageView.class);
        t.mLockScreenTime = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_time, "field 'mLockScreenTime'", TextView.class);
        t.mLockScreenDate = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_date, "field 'mLockScreenDate'", TextView.class);
        t.mLockScreenBattery = (BatteryViewVertical)  Utils.findRequiredViewAsType(view, R.id.lock_screen_battery, "field 'mLockScreenBattery'", BatteryViewVertical.class);
        t.mLockScreenMemorySize = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_memory_size, "field 'mLockScreenMemorySize'", TextView.class);
        t.mLockScreenAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.lock_screen_ad_container, "field 'mLockScreenAdContainer'", ViewGroup.class);
        t.mLockScreenUnlock = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_unlock, "field 'mLockScreenUnlock'", TextView.class);
        View a =  Utils.findRequiredView(view, R.id.container, "field 'mSettingPopupContainer' and method 'closeWindow'");
        t.mSettingPopupContainer = (ViewGroup)  Utils.castView(a, R.id.container, "field 'mSettingPopupContainer'", ViewGroup.class);
        this.f13326c = a;
        a.setOnClickListener(new cz(this, t));
        a =  Utils.findRequiredView(view, R.id.container_close_choice, "field 'mCloseChoiceContainer' and method 'closeChoiceDialog'");
        t.mCloseChoiceContainer = (ViewGroup)  Utils.castView(a, R.id.container_close_choice, "field 'mCloseChoiceContainer'", ViewGroup.class);
        this.f13327d = a;
        a.setOnClickListener(new da(this, t));
        View a2 =  Utils.findRequiredView(view, R.id.lock_screen_setting_close_lock_screen, "method 'closeLockScreen'");
        this.f13328e = a2;
        a2.setOnClickListener(new db(this, t));
        a2 =  Utils.findRequiredView(view, R.id.yes_confirm, "method 'onYes'");
        this.f13329f = a2;
        a2.setOnClickListener(new dc(this, t));
        a2 =  Utils.findRequiredView(view, R.id.no_confirm, "method 'onNo'");
        this.f13330g = a2;
        a2.setOnClickListener(new dd(this, t));
        a2 =  Utils.findRequiredView(view, R.id.lock_screen_setting, "method 'doSetting'");
        this.f13331h = a2;
        a2.setOnClickListener(new de(this, t));
        a2 =  Utils.findRequiredView(view, R.id.lock_screen_memory_container, "method 'openMemoryClean'");
        this.f13332i = a2;
        a2.setOnClickListener(new df(this, t));
    }
}
