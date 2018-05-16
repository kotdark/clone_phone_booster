package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MemoryJunkCleanFragment_ViewBinding */
class fb extends DebouncingOnClickListener {
    final /* synthetic */ MemoryJunkCleanFragment f13727b;
    final /* synthetic */ MemoryJunkCleanFragment_ViewBinding f13728c;

    fb(MemoryJunkCleanFragment_ViewBinding memoryJunkCleanFragment_ViewBinding, MemoryJunkCleanFragment memoryJunkCleanFragment) {
        this.f13728c = memoryJunkCleanFragment_ViewBinding;
        this.f13727b = memoryJunkCleanFragment;
    }

    public void doClick(View view) {
        this.f13727b.doClean();
    }
}
