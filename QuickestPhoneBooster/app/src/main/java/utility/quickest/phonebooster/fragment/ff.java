package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: PopupAppDeletedFragment_ViewBinding */
class ff extends DebouncingOnClickListener {
    final /* synthetic */ PopupAppDeletedFragment f13734b;
    final /* synthetic */ PopupAppDeletedFragment_ViewBinding f13735c;

    ff(PopupAppDeletedFragment_ViewBinding popupAppDeletedFragment_ViewBinding, PopupAppDeletedFragment popupAppDeletedFragment) {
        this.f13735c = popupAppDeletedFragment_ViewBinding;
        this.f13734b = popupAppDeletedFragment;
    }

    public void doClick(View view) {
        this.f13734b.onYesConfirmClicked();
    }
}
