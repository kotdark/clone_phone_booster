package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MemoryJunkCleanFragment_ViewBinding */
class fa extends DebouncingOnClickListener {
    final /* synthetic */ MemoryJunkCleanFragment f13725b;
    final /* synthetic */ MemoryJunkCleanFragment_ViewBinding f13726c;

    fa(MemoryJunkCleanFragment_ViewBinding memoryJunkCleanFragment_ViewBinding, MemoryJunkCleanFragment memoryJunkCleanFragment) {
        this.f13726c = memoryJunkCleanFragment_ViewBinding;
        this.f13725b = memoryJunkCleanFragment;
    }

    public void doClick(View view) {
        this.f13725b.doBack();
    }
}
