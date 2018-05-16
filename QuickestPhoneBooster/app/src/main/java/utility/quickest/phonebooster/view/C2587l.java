package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AntivirusWarningDialog_ViewBinding */
class C2587l extends DebouncingOnClickListener {
    final /* synthetic */ AntivirusWarningDialog f15242b;
    final /* synthetic */ AntivirusWarningDialog_ViewBinding f15243c;

    C2587l(AntivirusWarningDialog_ViewBinding antivirusWarningDialog_ViewBinding, AntivirusWarningDialog antivirusWarningDialog) {
        this.f15243c = antivirusWarningDialog_ViewBinding;
        this.f15242b = antivirusWarningDialog;
    }

    public void doClick(View view) {
        this.f15242b.closeWindow();
    }
}
