package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AddQuickCleanDialog_ViewBinding */
class C2583f extends DebouncingOnClickListener {
    final /* synthetic */ AddQuickCleanDialog f15234b;
    final /* synthetic */ AddQuickCleanDialog_ViewBinding f15235c;

    C2583f(AddQuickCleanDialog_ViewBinding addQuickCleanDialog_ViewBinding, AddQuickCleanDialog addQuickCleanDialog) {
        this.f15235c = addQuickCleanDialog_ViewBinding;
        this.f15234b = addQuickCleanDialog;
    }

    public void doClick(View view) {
        this.f15234b.confirm();
    }
}
