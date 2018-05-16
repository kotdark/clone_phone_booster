package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AddToWhiteListPopupWindow_ViewBinding */
class C2585i extends DebouncingOnClickListener {
    final /* synthetic */ AddToWhiteListPopupWindow f15238b;
    final /* synthetic */ AddToWhiteListPopupWindow_ViewBinding f15239c;

    C2585i(AddToWhiteListPopupWindow_ViewBinding addToWhiteListPopupWindow_ViewBinding, AddToWhiteListPopupWindow addToWhiteListPopupWindow) {
        this.f15239c = addToWhiteListPopupWindow_ViewBinding;
        this.f15238b = addToWhiteListPopupWindow;
    }

    public void doClick(View view) {
        this.f15238b.closeWindow();
    }
}
