package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.widget.ToggleButton;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;

/* compiled from: SettingFragment_ViewBinding */
class gu extends DebouncingOnClickListener {
    final /* synthetic */ SettingFragment f13798b;
    final /* synthetic */ SettingFragment_ViewBinding f13799c;

    gu(SettingFragment_ViewBinding settingFragment_ViewBinding, SettingFragment settingFragment) {
        this.f13799c = settingFragment_ViewBinding;
        this.f13798b = settingFragment;
    }

    public void doClick(View view) {
        this.f13798b.onNotiToolBarToggle((ToggleButton)  Utils.m2799a(view, "doClick", 0, "onNotiToolBarToggle", 0));
    }
}
