package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.view.BatteryView;
import utility.quickest.phonebooster.R;

public class LockedScreenFramgentForSpecialAd_ViewBinding<T extends LockedScreenFramgentForSpecialAd> implements Unbinder {
    protected T f13351b;
    private View f13352c;
    private View f13353d;

    public LockedScreenFramgentForSpecialAd_ViewBinding(T t, View view) {
        this.f13351b = t;
        t.mLockScreenDate = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_date, "field 'mLockScreenDate'", TextView.class);
        t.mLockScreenTime = (TextView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_time, "field 'mLockScreenTime'", TextView.class);
        t.mLockScreenAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.lock_screen_ad_container, "field 'mLockScreenAdContainer'", ViewGroup.class);
        t.mLockScreenBattery = (BatteryView)  Utils.findRequiredViewAsType(view, R.id.lock_screen_battery, "field 'mLockScreenBattery'", BatteryView.class);
        View a =  Utils.findRequiredView(view, R.id.lock_screen_setting, "method 'doSetting'");
        this.f13352c = a;
        a.setOnClickListener(new ds(this, t));
        a =  Utils.findRequiredView(view, R.id.lock_screen_memory_container, "method 'openMemoryClean'");
        this.f13353d = a;
        a.setOnClickListener(new dt(this, t));
    }
}
