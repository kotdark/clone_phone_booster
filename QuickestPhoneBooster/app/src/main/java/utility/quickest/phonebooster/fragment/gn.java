package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: SettingFragment_ViewBinding */
class gn extends DebouncingOnClickListener {
    final /* synthetic */ SettingFragment f13784b;
    final /* synthetic */ SettingFragment_ViewBinding f13785c;

    gn(SettingFragment_ViewBinding settingFragment_ViewBinding, SettingFragment settingFragment) {
        this.f13785c = settingFragment_ViewBinding;
        this.f13784b = settingFragment;
    }

    public void doClick(View view) {
        this.f13784b.setTemperatureUnit();
    }
}
