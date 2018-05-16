package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: OpenLockScreenDialogFromMainPage_ViewBinding */
class bx extends DebouncingOnClickListener {
    final /* synthetic */ OpenLockScreenDialogFromMainPage f15182b;
    final /* synthetic */ OpenLockScreenDialogFromMainPage_ViewBinding f15183c;

    bx(OpenLockScreenDialogFromMainPage_ViewBinding openLockScreenDialogFromMainPage_ViewBinding, OpenLockScreenDialogFromMainPage openLockScreenDialogFromMainPage) {
        this.f15183c = openLockScreenDialogFromMainPage_ViewBinding;
        this.f15182b = openLockScreenDialogFromMainPage;
    }

    public void doClick(View view) {
        this.f15182b.confirm();
    }
}
