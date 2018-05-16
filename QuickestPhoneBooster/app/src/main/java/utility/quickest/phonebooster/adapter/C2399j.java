package utility.quickest.phonebooster.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import utility.quickest.phonebooster.adapter.MemoryJunkListAdapter.ViewHolder;
import utility.quickest.phonebooster.util.C2539i;

/* compiled from: MemoryJunkListAdapter */
class C2399j implements OnClickListener {
    final /* synthetic */ ViewHolder f12933a;
    final /* synthetic */ C2401l f12934b;
    final /* synthetic */ int f12935c;
    final /* synthetic */ MemoryJunkListAdapter f12936d;

    C2399j(MemoryJunkListAdapter memoryJunkListAdapter, ViewHolder viewHolder, C2401l c2401l, int i) {
        this.f12936d = memoryJunkListAdapter;
        this.f12933a = viewHolder;
        this.f12934b = c2401l;
        this.f12935c = i;
    }

    public void onClick(View view) {
        boolean z = true;
        if (this.f12936d.f12869b) {
            this.f12933a.stateButton.setSelected(!this.f12934b.m17394b());
            C2401l c2401l = this.f12934b;
            if (this.f12934b.m17394b()) {
                z = false;
            }
            c2401l.m17393a(z);
            this.f12936d.f12868a.set(this.f12935c, this.f12934b);
            C2539i.EVENT_CHECK_JUNK_LIST_ITEM.m19064a(Integer.valueOf(this.f12935c));
            this.f12936d.notifyDataSetChanged();
        }
    }
}
