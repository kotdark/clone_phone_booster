package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AddQuickCleanDialog_ViewBinding */
class C2584g extends DebouncingOnClickListener {
    final /* synthetic */ AddQuickCleanDialog f15236b;
    final /* synthetic */ AddQuickCleanDialog_ViewBinding f15237c;

    C2584g(AddQuickCleanDialog_ViewBinding addQuickCleanDialog_ViewBinding, AddQuickCleanDialog addQuickCleanDialog) {
        this.f15237c = addQuickCleanDialog_ViewBinding;
        this.f15236b = addQuickCleanDialog;
    }

    public void doClick(View view) {
        this.f15236b.doClose();
    }
}
