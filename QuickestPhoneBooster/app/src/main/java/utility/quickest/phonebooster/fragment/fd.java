package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: PopupAdFragment_ViewBinding */
class fd extends DebouncingOnClickListener {
    final /* synthetic */ PopupAdFragment f13730b;
    final /* synthetic */ PopupAdFragment_ViewBinding f13731c;

    fd(PopupAdFragment_ViewBinding popupAdFragment_ViewBinding, PopupAdFragment popupAdFragment) {
        this.f13731c = popupAdFragment_ViewBinding;
        this.f13730b = popupAdFragment;
    }

    public void doClick(View view) {
        this.f13730b.doClose();
    }
}
