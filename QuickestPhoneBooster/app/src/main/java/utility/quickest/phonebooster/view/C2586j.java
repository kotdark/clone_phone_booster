package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AddToWhiteListPopupWindow_ViewBinding */
class C2586j extends DebouncingOnClickListener {
    final /* synthetic */ AddToWhiteListPopupWindow f15240b;
    final /* synthetic */ AddToWhiteListPopupWindow_ViewBinding f15241c;

    C2586j(AddToWhiteListPopupWindow_ViewBinding addToWhiteListPopupWindow_ViewBinding, AddToWhiteListPopupWindow addToWhiteListPopupWindow) {
        this.f15241c = addToWhiteListPopupWindow_ViewBinding;
        this.f15240b = addToWhiteListPopupWindow;
    }

    public void doClick(View view) {
        this.f15240b.addToWhiteList();
    }
}
