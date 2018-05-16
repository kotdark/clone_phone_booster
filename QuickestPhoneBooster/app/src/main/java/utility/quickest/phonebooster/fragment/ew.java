package utility.quickest.phonebooster.fragment;

import android.util.Pair;
import utility.quickest.phonebooster.util.C2461k;
import utility.quickest.phonebooster.util.C2542m;

/* compiled from: MemoryJunkCleanFragment */
class ew implements C2461k {
    final /* synthetic */ MemoryJunkCleanFragment f13719a;

    ew(MemoryJunkCleanFragment memoryJunkCleanFragment) {
        this.f13719a = memoryJunkCleanFragment;
    }

    public void mo3091a(Object obj) {
        Pair a = C2542m.m19075a(this.f13719a.m17840d());
        this.f13719a.mMemoryJunkSize.setText((CharSequence) a.first);
        this.f13719a.mMemoryJunkSizeUnit.setText((CharSequence) a.second);
    }
}
