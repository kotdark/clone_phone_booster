package utility.quickest.phonebooster.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class LockedScreenView_ViewBinding<T extends LockedScreenView> implements Unbinder {
    protected T f14956b;
    private View f14957c;
    private View f14958d;
    private View f14959e;
    private View f14960f;
    private View f14961g;
    private View f14962h;
    private View f14963i;
    private View f14964j;

    public LockedScreenView_ViewBinding(T t, View view) {
        this.f14956b = t;
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
        this.f14957c = a;
        a.setOnClickListener(new bp(this, t));
        a =  Utils.findRequiredView(view, R.id.container_close_choice, "field 'mCloseChoiceContainer' and method 'closeChoiceDialog'");
        t.mCloseChoiceContainer = (ViewGroup)  Utils.castView(a, R.id.container_close_choice, "field 'mCloseChoiceContainer'", ViewGroup.class);
        this.f14958d = a;
        a.setOnClickListener(new bq(this, t));
        t.mLockScreenMemoryTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_memory_tag, "field 'mLockScreenMemoryTag'", TextView.class);
        t.mLockScreenJunkTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_junk_tag, "field 'mLockScreenJunkTag'", TextView.class);
        t.mPhoneBoostButton = (TextView)  Utils.findRequiredViewAsType(view, R.id.phone_boost_button, "field 'mPhoneBoostButton'", TextView.class);
        t.mJunkCleanButton = (TextView)  Utils.findRequiredViewAsType(view, R.id.junk_clean_button, "field 'mJunkCleanButton'", TextView.class);
        t.mLockScreenBatteryIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_battery_icon, "field 'mLockScreenBatteryIcon'", ImageView.class);
        View a2 =  Utils.findRequiredView(view, R.id.lock_screen_setting_close_lock_screen, "method 'closeLockScreen'");
        this.f14959e = a2;
        a2.setOnClickListener(new br(this, t));
        a2 =  Utils.findRequiredView(view, R.id.yes_confirm, "method 'onYes'");
        this.f14960f = a2;
        a2.setOnClickListener(new bs(this, t));
        a2 =  Utils.findRequiredView(view, R.id.no_confirm, "method 'onNo'");
        this.f14961g = a2;
        a2.setOnClickListener(new bt(this, t));
        a2 =  Utils.findRequiredView(view, R.id.lock_screen_setting, "method 'doSetting'");
        this.f14962h = a2;
        a2.setOnClickListener(new bu(this, t));
        a2 =  Utils.findRequiredView(view, R.id.lock_screen_memory_container, "method 'openMemoryClean'");
        this.f14963i = a2;
        a2.setOnClickListener(new bv(this, t));
        a2 =  Utils.findRequiredView(view, R.id.lock_screen_junk_container, "method 'openJunkClean'");
        this.f14964j = a2;
        a2.setOnClickListener(new bw(this, t));
    }
}
