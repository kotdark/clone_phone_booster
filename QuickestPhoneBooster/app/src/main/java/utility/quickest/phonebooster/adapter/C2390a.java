package utility.quickest.phonebooster.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import utility.quickest.phonebooster.adapter.AppVirusListAdapter.ViewHolder;
import utility.quickest.phonebooster.p114d. AppVirusInfo;
import utility.quickest.phonebooster.util.C2542m;

/* compiled from: AppVirusListAdapter */
class C2390a implements OnClickListener {
    final /* synthetic */ ViewHolder f12908a;
    final /* synthetic */ View f12909b;
    final /* synthetic */  AppVirusInfo f12910c;
    final /* synthetic */ AppVirusListAdapter f12911d;

    C2390a(AppVirusListAdapter appVirusListAdapter, ViewHolder viewHolder, View view,  AppVirusInfo c2448f) {
        this.f12911d = appVirusListAdapter;
        this.f12908a = viewHolder;
        this.f12909b = view;
        this.f12910c = c2448f;
    }

    public void onClick(View view) {
        C2542m.m19082a("app_virus_adapter", "ignore", null);
        this.f12908a.stateButton.setSelected(false);
        this.f12911d.m17330a(this.f12909b, this.f12910c);
        this.f12911d.f12860d.put(this.f12910c, Boolean.valueOf(true));
    }
}
