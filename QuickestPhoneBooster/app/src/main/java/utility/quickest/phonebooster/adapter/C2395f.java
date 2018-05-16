package utility.quickest.phonebooster.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import utility.quickest.phonebooster.adapter.CPUCoolingJunkListAdapter.ViewHolder;
import utility.quickest.phonebooster.util.C2539i;

/* compiled from: CPUCoolingJunkListAdapter */
class C2395f implements OnClickListener {
    final /* synthetic */ ViewHolder f12922a;
    final /* synthetic */ C2397h f12923b;
    final /* synthetic */ int f12924c;
    final /* synthetic */ CPUCoolingJunkListAdapter f12925d;

    C2395f(CPUCoolingJunkListAdapter cPUCoolingJunkListAdapter, ViewHolder viewHolder, C2397h c2397h, int i) {
        this.f12925d = cPUCoolingJunkListAdapter;
        this.f12922a = viewHolder;
        this.f12923b = c2397h;
        this.f12924c = i;
    }

    public void onClick(View view) {
        boolean z = true;
        if (this.f12925d.f12864b) {
            this.f12922a.stateButton.setSelected(!this.f12923b.m17390b());
            C2397h c2397h = this.f12923b;
            if (this.f12923b.m17390b()) {
                z = false;
            }
            c2397h.m17389a(z);
            this.f12925d.f12863a.set(this.f12924c, this.f12923b);
            C2539i.EVENT_CHECK_JUNK_LIST_ITEM.m19064a(Integer.valueOf(this.f12924c));
            this.f12925d.notifyDataSetChanged();
        }
    }
}
