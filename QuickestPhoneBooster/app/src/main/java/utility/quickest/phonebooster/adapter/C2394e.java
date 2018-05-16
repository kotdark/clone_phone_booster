package utility.quickest.phonebooster.adapter;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import utility.quickest.phonebooster.adapter.AppVirusListAdapter.ViewHolder;
import utility.quickest.phonebooster.adapter.AppVirusListAdapter.ViewHolder_ViewBinding;

/* compiled from: AppVirusListAdapter$ViewHolder_ViewBinding */
class C2394e extends DebouncingOnClickListener {
    final /* synthetic */ ViewHolder f12920b;
    final /* synthetic */ ViewHolder_ViewBinding f12921c;

    C2394e(ViewHolder_ViewBinding viewHolder_ViewBinding, ViewHolder viewHolder) {
        this.f12921c = viewHolder_ViewBinding;
        this.f12920b = viewHolder;
    }

    public void doClick(View view) {
        this.f12920b.expandMalwareContainer();
    }
}
