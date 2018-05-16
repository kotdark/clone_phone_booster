package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.widget.ToggleButton;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;

/* compiled from: SettingFragment_ViewBinding */
class gq extends DebouncingOnClickListener {
    final /* synthetic */ SettingFragment f13790b;
    final /* synthetic */ SettingFragment_ViewBinding f13791c;

    gq(SettingFragment_ViewBinding settingFragment_ViewBinding, SettingFragment settingFragment) {
        this.f13791c = settingFragment_ViewBinding;
        this.f13790b = settingFragment;
    }

    public void doClick(View view) {
        this.f13790b.onUEImproveToggle((ToggleButton)  Utils.m2799a(view, "doClick", 0, "onUEImproveToggle", 0));
    }
}
