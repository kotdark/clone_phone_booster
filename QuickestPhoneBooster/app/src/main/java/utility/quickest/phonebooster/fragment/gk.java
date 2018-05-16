package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: SettingFragment_ViewBinding */
class gk extends DebouncingOnClickListener {
    final /* synthetic */ SettingFragment f13778b;
    final /* synthetic */ SettingFragment_ViewBinding f13779c;

    gk(SettingFragment_ViewBinding settingFragment_ViewBinding, SettingFragment settingFragment) {
        this.f13779c = settingFragment_ViewBinding;
        this.f13778b = settingFragment;
    }

    public void doClick(View view) {
        this.f13778b.doBack();
    }
}
