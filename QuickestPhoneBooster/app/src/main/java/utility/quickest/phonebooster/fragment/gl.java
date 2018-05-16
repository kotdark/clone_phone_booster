package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: SettingFragment_ViewBinding */
class gl extends DebouncingOnClickListener {
    final /* synthetic */ SettingFragment f13780b;
    final /* synthetic */ SettingFragment_ViewBinding f13781c;

    gl(SettingFragment_ViewBinding settingFragment_ViewBinding, SettingFragment settingFragment) {
        this.f13781c = settingFragment_ViewBinding;
        this.f13780b = settingFragment;
    }

    public void doClick(View view) {
        this.f13780b.doShare();
    }
}
