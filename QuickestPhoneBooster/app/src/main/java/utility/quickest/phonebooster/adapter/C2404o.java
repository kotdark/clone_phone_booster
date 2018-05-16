package utility.quickest.phonebooster.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import utility.quickest.phonebooster.util.C2539i;

/* compiled from: StorageJunkExpandableListAdapter */
class C2404o implements OnClickListener {
    final /* synthetic */ C2409t f12944a;
    final /* synthetic */ StorageJunkExpandableListAdapter f12945b;

    C2404o(StorageJunkExpandableListAdapter storageJunkExpandableListAdapter, C2409t c2409t) {
        this.f12945b = storageJunkExpandableListAdapter;
        this.f12944a = c2409t;
    }

    public void onClick(View view) {
        this.f12945b.m17357a(this.f12944a, !this.f12945b.m17360a(this.f12944a));
        this.f12945b.notifyDataSetChanged();
        C2539i.EVENT_CHECK_JUNK_LIST_ITEM.m19064a((Object) "");
    }
}
