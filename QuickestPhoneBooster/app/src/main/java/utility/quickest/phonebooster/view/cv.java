package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: UpdateDialog_ViewBinding */
class cv extends DebouncingOnClickListener {
    final /* synthetic */ UpdateDialog f15223b;
    final /* synthetic */ UpdateDialog_ViewBinding f15224c;

    cv(UpdateDialog_ViewBinding updateDialog_ViewBinding, UpdateDialog updateDialog) {
        this.f15224c = updateDialog_ViewBinding;
        this.f15223b = updateDialog;
    }

    public void doClick(View view) {
        this.f15223b.close();
    }
}
