package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.view.BatteryViewVertical;
import utility.quickest.phonebooster.R;

public class LockedScreenFragment_ViewBinding<T extends LockedScreenFragment> implements Unbinder {
    protected T f13333b;
    private View f13334c;
    private View f13335d;
    private View f13336e;
    private View f13337f;
    private View f13338g;
    private View f13339h;
    private View f13340i;
    private View f13341j;

    public LockedScreenFragment_ViewBinding(T t, View view) {
        this.f13333b = t;
        t.mLockScreenTime = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_time, "field 'mLockScreenTime'", TextView.class);
        t.mLockScreenDate = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_date, "field 'mLockScreenDate'", TextView.class);
        t.mLockScreenBattery = (BatteryViewVertical)  Utils.findRequiredViewAsType(view, R.id.lock_screen_battery, "field 'mLockScreenBattery'", BatteryViewVertical.class);
        t.mLockScreenMemorySize = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_memory_size, "field 'mLockScreenMemorySize'", TextView.class);
        t.mLockScreenJunkSize = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_junk_size, "field 'mLockScreenJunkSize'", TextView.class);
        t.mLockScreenMemoryProgress = (ProgressBar)  Utils.findRequiredViewAsType(view, R.id.lock_screen_memory_progress, "field 'mLockScreenMemoryProgress'", ProgressBar.class);
        t.mLockScreenJunkProgress = (ProgressBar)  Utils.findRequiredViewAsType(view, R.id.lock_screen_junk_progress, "field 'mLockScreenJunkProgress'", ProgressBar.class);
        t.mLockScreenUnlock = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_unlock, "field 'mLockScreenUnlock'", TextView.class);
        View a =  Utils.findRequiredView(view, R.id.container, "field 'mSettingPopupContainer' and method 'closeWindow'");
        t.mSettingPopupContainer = (ViewGroup)  Utils.castView(a, R.id.container, "field 'mSettingPopupContainer'", ViewGroup.class);
        this.f13334c = a;
        a.setOnClickListener(new dg(this, t));
        a =  Utils.findRequiredView(view, R.id.container_close_choice, "field 'mCloseChoiceContainer' and method 'closeChoiceDialog'");
        t.mCloseChoiceContainer = (ViewGroup)  Utils.castView(a, R.id.container_close_choice, "field 'mCloseChoiceContainer'", ViewGroup.class);
        this.f13335d = a;
        a.setOnClickListener(new dh(this, t));
        t.mLockScreenMemoryTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_memory_tag, "field 'mLockScreenMemoryTag'", TextView.class);
        t.mLockScreenJunkTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_junk_tag, "field 'mLockScreenJunkTag'", TextView.class);
        t.mPhoneBoostButton = (TextView)  Utils.findRequiredViewAsType(view, R.id.phone_boost_button, "field 'mPhoneBoostButton'", TextView.class);
        t.mJunkCleanButton = (TextView)  Utils.findRequiredViewAsType(view, R.id.junk_clean_button, "field 'mJunkCleanButton'", TextView.class);
        t.mLockScreenBatteryIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_battery_icon, "field 'mLockScreenBatteryIcon'", ImageView.class);
        View a2 =  Utils.findRequiredView(view, R.id.lock_screen_setting_close_lock_screen, "method 'closeLockScreen'");
        this.f13336e = a2;
        a2.setOnClickListener(new di(this, t));
        a2 =  Utils.findRequiredView(view, R.id.yes_confirm, "method 'onYes'");
        this.f13337f = a2;
        a2.setOnClickListener(new dj(this, t));
        a2 =  Utils.findRequiredView(view, R.id.no_confirm, "method 'onNo'");
        this.f13338g = a2;
        a2.setOnClickListener(new dk(this, t));
        a2 =  Utils.findRequiredView(view, R.id.lock_screen_setting, "method 'doSetting'");
        this.f13339h = a2;
        a2.setOnClickListener(new dl(this, t));
        a2 =  Utils.findRequiredView(view, R.id.lock_screen_memory_container, "method 'openMemoryClean'");
        this.f13340i = a2;
        a2.setOnClickListener(new dm(this, t));
        a2 =  Utils.findRequiredView(view, R.id.lock_screen_junk_container, "method 'openJunkClean'");
        this.f13341j = a2;
        a2.setOnClickListener(new dn(this, t));
    }
}
