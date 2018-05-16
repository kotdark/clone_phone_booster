package utility.quickest.phonebooster.adapter;

import android.view.View;
import android.view.View.OnLongClickListener;
import utility.quickest.phonebooster.p114d.C2446d;
import utility.quickest.phonebooster.util.C2539i;

/* compiled from: MemoryJunkListAdapter */
class C2400k implements OnLongClickListener {
    final /* synthetic */ C2446d f12937a;
    final /* synthetic */ MemoryJunkListAdapter f12938b;

    C2400k(MemoryJunkListAdapter memoryJunkListAdapter, C2446d c2446d) {
        this.f12938b = memoryJunkListAdapter;
        this.f12937a = c2446d;
    }

    public boolean onLongClick(View view) {
        C2539i.EVENT_ADD_TO_WHITE_LIST.m19064a(this.f12937a.m17629a());
        return true;
    }
}
