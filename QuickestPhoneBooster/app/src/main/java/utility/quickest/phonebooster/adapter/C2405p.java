package utility.quickest.phonebooster.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import utility.quickest.phonebooster.util.C2539i;

/* compiled from: StorageJunkExpandableListAdapter */
class C2405p implements OnClickListener {
    final /* synthetic */ C2408s f12946a;
    final /* synthetic */ int f12947b;
    final /* synthetic */ int f12948c;
    final /* synthetic */ StorageJunkExpandableListAdapter f12949d;

    C2405p(StorageJunkExpandableListAdapter storageJunkExpandableListAdapter, C2408s c2408s, int i, int i2) {
        this.f12949d = storageJunkExpandableListAdapter;
        this.f12946a = c2408s;
        this.f12947b = i;
        this.f12948c = i2;
    }

    public void onClick(View view) {
        if (this.f12949d.f12892e) {
            this.f12946a.m17397a(!this.f12946a.m17398a());
            try {
                ((C2409t) this.f12949d.f12889b.get(this.f12947b)).m17407b().set(this.f12948c, this.f12946a);
            } catch (Throwable th) {
            }
            C2539i.EVENT_CHECK_JUNK_LIST_ITEM.m19064a((Object) "");
            this.f12949d.notifyDataSetChanged();
        }
    }
}
