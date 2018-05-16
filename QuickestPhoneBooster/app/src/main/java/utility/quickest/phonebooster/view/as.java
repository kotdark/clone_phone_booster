package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockScreenCloseChoiceDialogForSPAD_ViewBinding */
class as extends DebouncingOnClickListener {
    final /* synthetic */ LockScreenCloseChoiceDialogForSPAD f15133b;
    final /* synthetic */ LockScreenCloseChoiceDialogForSPAD_ViewBinding f15134c;

    as(LockScreenCloseChoiceDialogForSPAD_ViewBinding lockScreenCloseChoiceDialogForSPAD_ViewBinding, LockScreenCloseChoiceDialogForSPAD lockScreenCloseChoiceDialogForSPAD) {
        this.f15134c = lockScreenCloseChoiceDialogForSPAD_ViewBinding;
        this.f15133b = lockScreenCloseChoiceDialogForSPAD;
    }

    public void doClick(View view) {
        this.f15133b.onNo();
    }
}
