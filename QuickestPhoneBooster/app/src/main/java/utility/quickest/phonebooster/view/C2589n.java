package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AntivirusWarningDialog_ViewBinding */
class C2589n extends DebouncingOnClickListener {
    final /* synthetic */ AntivirusWarningDialog f15246b;
    final /* synthetic */ AntivirusWarningDialog_ViewBinding f15247c;

    C2589n(AntivirusWarningDialog_ViewBinding antivirusWarningDialog_ViewBinding, AntivirusWarningDialog antivirusWarningDialog) {
        this.f15247c = antivirusWarningDialog_ViewBinding;
        this.f15246b = antivirusWarningDialog;
    }

    public void doClick(View view) {
        this.f15246b.onNo();
    }
}
