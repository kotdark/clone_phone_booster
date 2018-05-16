package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockScreenCloseChoiceDialogForSPAD_ViewBinding */
class aq extends DebouncingOnClickListener {
    final /* synthetic */ LockScreenCloseChoiceDialogForSPAD f15129b;
    final /* synthetic */ LockScreenCloseChoiceDialogForSPAD_ViewBinding f15130c;

    aq(LockScreenCloseChoiceDialogForSPAD_ViewBinding lockScreenCloseChoiceDialogForSPAD_ViewBinding, LockScreenCloseChoiceDialogForSPAD lockScreenCloseChoiceDialogForSPAD) {
        this.f15130c = lockScreenCloseChoiceDialogForSPAD_ViewBinding;
        this.f15129b = lockScreenCloseChoiceDialogForSPAD;
    }

    public void doClick(View view) {
        this.f15129b.closeWindow();
    }
}
