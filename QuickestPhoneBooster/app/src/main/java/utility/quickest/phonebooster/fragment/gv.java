package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: SettingFragment_ViewBinding */
class gv extends DebouncingOnClickListener {
    final /* synthetic */ SettingFragment f13800b;
    final /* synthetic */ SettingFragment_ViewBinding f13801c;

    gv(SettingFragment_ViewBinding settingFragment_ViewBinding, SettingFragment settingFragment) {
        this.f13801c = settingFragment_ViewBinding;
        this.f13800b = settingFragment;
    }

    public void doClick(View view) {
        this.f13800b.openPrivacyPolicyDoc();
    }
}
