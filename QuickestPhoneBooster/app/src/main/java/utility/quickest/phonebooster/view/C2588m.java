package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AntivirusWarningDialog_ViewBinding */
class C2588m extends DebouncingOnClickListener {
    final /* synthetic */ AntivirusWarningDialog f15244b;
    final /* synthetic */ AntivirusWarningDialog_ViewBinding f15245c;

    C2588m(AntivirusWarningDialog_ViewBinding antivirusWarningDialog_ViewBinding, AntivirusWarningDialog antivirusWarningDialog) {
        this.f15245c = antivirusWarningDialog_ViewBinding;
        this.f15244b = antivirusWarningDialog;
    }

    public void doClick(View view) {
        this.f15244b.onYes();
    }
}
