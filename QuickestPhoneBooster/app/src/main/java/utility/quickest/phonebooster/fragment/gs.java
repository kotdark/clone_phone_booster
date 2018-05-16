package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.widget.ToggleButton;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;

/* compiled from: SettingFragment_ViewBinding */
class gs extends DebouncingOnClickListener {
    final /* synthetic */ SettingFragment f13794b;
    final /* synthetic */ SettingFragment_ViewBinding f13795c;

    gs(SettingFragment_ViewBinding settingFragment_ViewBinding, SettingFragment settingFragment) {
        this.f13795c = settingFragment_ViewBinding;
        this.f13794b = settingFragment;
    }

    public void doClick(View view) {
        this.f13794b.onCleanNoticeToggle((ToggleButton)  Utils.m2799a(view, "doClick", 0, "onCleanNoticeToggle", 0));
    }
}
