package utility.quickest.phonebooster.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import utility.quickest.phonebooster.adapter.StorageJunkListAdapter.ViewHolder;
import utility.quickest.phonebooster.util.C2539i;

/* compiled from: StorageJunkListAdapter */
class C2410u implements OnClickListener {
    final /* synthetic */ ViewHolder f12965a;
    final /* synthetic */ C2411v f12966b;
    final /* synthetic */ int f12967c;
    final /* synthetic */ StorageJunkListAdapter f12968d;

    C2410u(StorageJunkListAdapter storageJunkListAdapter, ViewHolder viewHolder, C2411v c2411v, int i) {
        this.f12968d = storageJunkListAdapter;
        this.f12965a = viewHolder;
        this.f12966b = c2411v;
        this.f12967c = i;
    }

    public void onClick(View view) {
        boolean z = true;
        if (this.f12968d.f12900b) {
            boolean z2;
            ImageView imageView = this.f12965a.stateButton;
            if (this.f12966b.m17411b()) {
                z2 = false;
            } else {
                z2 = true;
            }
            imageView.setSelected(z2);
            C2411v c2411v = this.f12966b;
            if (this.f12966b.m17411b()) {
                z = false;
            }
            c2411v.m17410a(z);
            this.f12968d.f12899a.set(this.f12967c, this.f12966b);
            C2539i.EVENT_CHECK_JUNK_LIST_ITEM.m19064a(Integer.valueOf(this.f12967c));
        }
    }
}
