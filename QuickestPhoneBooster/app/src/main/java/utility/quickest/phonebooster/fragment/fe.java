package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: PopupAppDeletedFragment_ViewBinding */
class fe extends DebouncingOnClickListener {
    final /* synthetic */ PopupAppDeletedFragment f13732b;
    final /* synthetic */ PopupAppDeletedFragment_ViewBinding f13733c;

    fe(PopupAppDeletedFragment_ViewBinding popupAppDeletedFragment_ViewBinding, PopupAppDeletedFragment popupAppDeletedFragment) {
        this.f13733c = popupAppDeletedFragment_ViewBinding;
        this.f13732b = popupAppDeletedFragment;
    }

    public void doClick(View view) {
        this.f13732b.onNoConfirmClicked();
    }
}
