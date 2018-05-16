package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: UpdateDialog_ViewBinding */
class cu extends DebouncingOnClickListener {
    final /* synthetic */ UpdateDialog f15221b;
    final /* synthetic */ UpdateDialog_ViewBinding f15222c;

    cu(UpdateDialog_ViewBinding updateDialog_ViewBinding, UpdateDialog updateDialog) {
        this.f15222c = updateDialog_ViewBinding;
        this.f15221b = updateDialog;
    }

    public void doClick(View view) {
        this.f15221b.confirm();
    }
}
