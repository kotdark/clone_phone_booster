package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.view.BatteryView1;
import utility.quickest.phonebooster.R;

public class FakePopupLsFragment_ViewBinding<T extends FakePopupLsFragment> implements Unbinder {
    protected T f13254b;

    public FakePopupLsFragment_ViewBinding(T t, View view) {
        this.f13254b = t;
        t.mLockScreenBg01 =  Utils.findRequiredView(view, R.id.lock_screen_bg01, "field 'mLockScreenBg01'");
        t.mLockScreenBg02 =  Utils.findRequiredView(view, R.id.lock_screen_bg02, "field 'mLockScreenBg02'");
        t.mLockScreenBg03 =  Utils.findRequiredView(view, R.id.lock_screen_bg03, "field 'mLockScreenBg03'");
        t.mLockScreenAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.lock_screen_ad_container, "field 'mLockScreenAdContainer'", ViewGroup.class);
        t.mLockScreenBottomContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.lock_screen_bottom_container, "field 'mLockScreenBottomContainer'", ViewGroup.class);
        t.mLockScreenTime = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_time, "field 'mLockScreenTime'", TextView.class);
        t.mLockScreenDate = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_date, "field 'mLockScreenDate'", TextView.class);
        t.mLockScreenBattery = (BatteryView1)  Utils.findRequiredViewAsType(view, R.id.lock_screen_battery, "field 'mLockScreenBattery'", BatteryView1.class);
    }
}
