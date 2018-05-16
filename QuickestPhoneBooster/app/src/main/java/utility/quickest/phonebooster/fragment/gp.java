package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: SettingFragment_ViewBinding */
class gp extends DebouncingOnClickListener {
    final /* synthetic */ SettingFragment f13788b;
    final /* synthetic */ SettingFragment_ViewBinding f13789c;

    gp(SettingFragment_ViewBinding settingFragment_ViewBinding, SettingFragment settingFragment) {
        this.f13789c = settingFragment_ViewBinding;
        this.f13788b = settingFragment;
    }

    public void doClick(View view) {
        this.f13788b.onSpeedUpBallToggle();
    }
}
