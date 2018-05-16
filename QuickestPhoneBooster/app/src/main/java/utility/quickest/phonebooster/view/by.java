package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: OpenLockScreenDialogFromMainPage_ViewBinding */
class by extends DebouncingOnClickListener {
    final /* synthetic */ OpenLockScreenDialogFromMainPage f15184b;
    final /* synthetic */ OpenLockScreenDialogFromMainPage_ViewBinding f15185c;

    by(OpenLockScreenDialogFromMainPage_ViewBinding openLockScreenDialogFromMainPage_ViewBinding, OpenLockScreenDialogFromMainPage openLockScreenDialogFromMainPage) {
        this.f15185c = openLockScreenDialogFromMainPage_ViewBinding;
        this.f15184b = openLockScreenDialogFromMainPage;
    }

    public void doClick(View view) {
        this.f15184b.doClose();
    }
}
