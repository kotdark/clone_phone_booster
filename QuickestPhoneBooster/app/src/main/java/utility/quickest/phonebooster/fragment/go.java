package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: SettingFragment_ViewBinding */
class go extends DebouncingOnClickListener {
    final /* synthetic */ SettingFragment f13786b;
    final /* synthetic */ SettingFragment_ViewBinding f13787c;

    go(SettingFragment_ViewBinding settingFragment_ViewBinding, SettingFragment settingFragment) {
        this.f13787c = settingFragment_ViewBinding;
        this.f13786b = settingFragment;
    }

    public void doClick(View view) {
        this.f13786b.openWhiteListPage();
    }
}
