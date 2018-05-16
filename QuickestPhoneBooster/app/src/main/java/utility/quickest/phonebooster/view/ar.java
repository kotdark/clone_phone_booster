package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockScreenCloseChoiceDialogForSPAD_ViewBinding */
class ar extends DebouncingOnClickListener {
    final /* synthetic */ LockScreenCloseChoiceDialogForSPAD f15131b;
    final /* synthetic */ LockScreenCloseChoiceDialogForSPAD_ViewBinding f15132c;

    ar(LockScreenCloseChoiceDialogForSPAD_ViewBinding lockScreenCloseChoiceDialogForSPAD_ViewBinding, LockScreenCloseChoiceDialogForSPAD lockScreenCloseChoiceDialogForSPAD) {
        this.f15132c = lockScreenCloseChoiceDialogForSPAD_ViewBinding;
        this.f15131b = lockScreenCloseChoiceDialogForSPAD;
    }

    public void doClick(View view) {
        this.f15131b.onYes();
    }
}
