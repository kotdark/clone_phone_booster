package utility.quickest.phonebooster.adapter;

import android.view.View;
import android.view.View.OnLongClickListener;
import utility.quickest.phonebooster.p114d.C2446d;
import utility.quickest.phonebooster.util.C2539i;

/* compiled from: CPUCoolingJunkListAdapter */
class C2396g implements OnLongClickListener {
    final /* synthetic */ C2446d f12926a;
    final /* synthetic */ CPUCoolingJunkListAdapter f12927b;

    C2396g(CPUCoolingJunkListAdapter cPUCoolingJunkListAdapter, C2446d c2446d) {
        this.f12927b = cPUCoolingJunkListAdapter;
        this.f12926a = c2446d;
    }

    public boolean onLongClick(View view) {
        C2539i.EVENT_ADD_TO_WHITE_LIST.m19064a(this.f12926a.m17629a());
        return true;
    }
}
