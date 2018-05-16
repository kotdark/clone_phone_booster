package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: PopupMemoryJunkCleanFragment_ViewBinding */
class fn extends DebouncingOnClickListener {
    final /* synthetic */ PopupMemoryJunkCleanFragment f13743b;
    final /* synthetic */ PopupMemoryJunkCleanFragment_ViewBinding f13744c;

    fn(PopupMemoryJunkCleanFragment_ViewBinding popupMemoryJunkCleanFragment_ViewBinding, PopupMemoryJunkCleanFragment popupMemoryJunkCleanFragment) {
        this.f13744c = popupMemoryJunkCleanFragment_ViewBinding;
        this.f13743b = popupMemoryJunkCleanFragment;
    }

    public void doClick(View view) {
        this.f13743b.onNoConfirmClicked();
    }
}
