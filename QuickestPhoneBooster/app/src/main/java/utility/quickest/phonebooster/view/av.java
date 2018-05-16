package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockScreenSettingPopupWindowForSPAD_ViewBinding */
class av extends DebouncingOnClickListener {
    final /* synthetic */ LockScreenSettingPopupWindowForSPAD f15137b;
    final /* synthetic */ LockScreenSettingPopupWindowForSPAD_ViewBinding f15138c;

    av(LockScreenSettingPopupWindowForSPAD_ViewBinding lockScreenSettingPopupWindowForSPAD_ViewBinding, LockScreenSettingPopupWindowForSPAD lockScreenSettingPopupWindowForSPAD) {
        this.f15138c = lockScreenSettingPopupWindowForSPAD_ViewBinding;
        this.f15137b = lockScreenSettingPopupWindowForSPAD;
    }

    public void doClick(View view) {
        this.f15137b.closeLockScreen();
    }
}
