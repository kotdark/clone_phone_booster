package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockScreenSettingPopupWindowForSPAD_ViewBinding */
class au extends DebouncingOnClickListener {
    final /* synthetic */ LockScreenSettingPopupWindowForSPAD f15135b;
    final /* synthetic */ LockScreenSettingPopupWindowForSPAD_ViewBinding f15136c;

    au(LockScreenSettingPopupWindowForSPAD_ViewBinding lockScreenSettingPopupWindowForSPAD_ViewBinding, LockScreenSettingPopupWindowForSPAD lockScreenSettingPopupWindowForSPAD) {
        this.f15136c = lockScreenSettingPopupWindowForSPAD_ViewBinding;
        this.f15135b = lockScreenSettingPopupWindowForSPAD;
    }

    public void doClick(View view) {
        this.f15135b.closeWindow();
    }
}
