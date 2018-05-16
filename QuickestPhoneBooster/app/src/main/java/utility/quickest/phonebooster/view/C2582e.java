package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AddQuickCleanDialogFromMainPage_ViewBinding */
class C2582e extends DebouncingOnClickListener {
    final /* synthetic */ AddQuickCleanDialogFromMainPage f15232b;
    final /* synthetic */ AddQuickCleanDialogFromMainPage_ViewBinding f15233c;

    C2582e(AddQuickCleanDialogFromMainPage_ViewBinding addQuickCleanDialogFromMainPage_ViewBinding, AddQuickCleanDialogFromMainPage addQuickCleanDialogFromMainPage) {
        this.f15233c = addQuickCleanDialogFromMainPage_ViewBinding;
        this.f15232b = addQuickCleanDialogFromMainPage;
    }

    public void doClick(View view) {
        this.f15232b.doClose();
    }
}
