package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: PopupMemoryJunkCleanFragment_ViewBinding */
class fo extends DebouncingOnClickListener {
    final /* synthetic */ PopupMemoryJunkCleanFragment f13745b;
    final /* synthetic */ PopupMemoryJunkCleanFragment_ViewBinding f13746c;

    fo(PopupMemoryJunkCleanFragment_ViewBinding popupMemoryJunkCleanFragment_ViewBinding, PopupMemoryJunkCleanFragment popupMemoryJunkCleanFragment) {
        this.f13746c = popupMemoryJunkCleanFragment_ViewBinding;
        this.f13745b = popupMemoryJunkCleanFragment;
    }

    public void doClick(View view) {
        this.f13745b.onYesConfirmClicked();
    }
}
