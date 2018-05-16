package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AddQuickCleanDialogFromMainPage_ViewBinding */
class C2581d extends DebouncingOnClickListener {
    final /* synthetic */ AddQuickCleanDialogFromMainPage f15230b;
    final /* synthetic */ AddQuickCleanDialogFromMainPage_ViewBinding f15231c;

    C2581d(AddQuickCleanDialogFromMainPage_ViewBinding addQuickCleanDialogFromMainPage_ViewBinding, AddQuickCleanDialogFromMainPage addQuickCleanDialogFromMainPage) {
        this.f15231c = addQuickCleanDialogFromMainPage_ViewBinding;
        this.f15230b = addQuickCleanDialogFromMainPage;
    }

    public void doClick(View view) {
        this.f15230b.confirm();
    }
}
