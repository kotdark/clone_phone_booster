package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: SettingFragment_ViewBinding */
class gm extends DebouncingOnClickListener {
    final /* synthetic */ SettingFragment f13782b;
    final /* synthetic */ SettingFragment_ViewBinding f13783c;

    gm(SettingFragment_ViewBinding settingFragment_ViewBinding, SettingFragment settingFragment) {
        this.f13783c = settingFragment_ViewBinding;
        this.f13782b = settingFragment;
    }

    public void doClick(View view) {
        this.f13782b.checkUpdate();
    }
}
