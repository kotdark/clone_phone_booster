package utility.quickest.phonebooster.adapter;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: WhiteListAdapter */
class C2412w implements OnClickListener {
    final /* synthetic */ String f12971a;
    final /* synthetic */ WhiteListAdapter f12972b;

    C2412w(WhiteListAdapter whiteListAdapter, String str) {
        this.f12972b = whiteListAdapter;
        this.f12971a = str;
    }

    public void onClick(View view) {
        if (1 == this.f12972b.f12906c) {
            this.f12972b.f12907d.m18811c(this.f12971a);
        } else if (2 == this.f12972b.f12906c) {
            this.f12972b.f12907d.m18808b(this.f12971a);
        }
    }
}
