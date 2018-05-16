package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.widget.ToggleButton;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;

/* compiled from: SettingFragment_ViewBinding */
class gt extends DebouncingOnClickListener {
    final /* synthetic */ SettingFragment f13796b;
    final /* synthetic */ SettingFragment_ViewBinding f13797c;

    gt(SettingFragment_ViewBinding settingFragment_ViewBinding, SettingFragment settingFragment) {
        this.f13797c = settingFragment_ViewBinding;
        this.f13796b = settingFragment;
    }

    public void doClick(View view) {
        this.f13796b.onLockScreenToggle((ToggleButton)  Utils.m2799a(view, "doClick", 0, "onLockScreenToggle", 0));
    }
}
