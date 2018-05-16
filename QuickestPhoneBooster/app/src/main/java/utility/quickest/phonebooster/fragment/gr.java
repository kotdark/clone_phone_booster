package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: SettingFragment_ViewBinding */
class gr extends DebouncingOnClickListener {
    final /* synthetic */ SettingFragment f13792b;
    final /* synthetic */ SettingFragment_ViewBinding f13793c;

    gr(SettingFragment_ViewBinding settingFragment_ViewBinding, SettingFragment settingFragment) {
        this.f13793c = settingFragment_ViewBinding;
        this.f13792b = settingFragment;
    }

    public void doClick(View view) {
        this.f13792b.openAbout();
    }
}
