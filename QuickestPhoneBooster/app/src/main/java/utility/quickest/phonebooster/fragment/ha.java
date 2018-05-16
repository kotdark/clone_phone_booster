package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.ec;
import utility.quickest.phonebooster.p114d.C2444b;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StorageJunkCleanFragment */
class ha implements ec {
    final /* synthetic */ long f13808a;
    final /* synthetic */ gy f13809b;

    ha(gy gyVar, long j) {
        this.f13809b = gyVar;
        this.f13808a = j;
    }

    public void mo3116a(List<C2444b> list) {
        long j = 0;
        long currentTimeMillis = System.currentTimeMillis() - this.f13808a;
        if (currentTimeMillis >= 0) {
            j = currentTimeMillis;
        }
        this.f13809b.f13804a.f13494l = new ArrayList(list);
        if (j > 5000) {
            this.f13809b.f13804a.f13486d.m18481d();
            this.f13809b.f13804a.mApkJunk.setImageResource(R.drawable.ic_load_finished);
            this.f13809b.f13804a.m17919b(this.f13809b.f13804a.mApkJunk);
            this.f13809b.f13804a.mMemoryJunk.setImageResource(R.drawable.ic_load_loading);
            this.f13809b.f13804a.m17913a(this.f13809b.f13804a.mMemoryJunk);
            return;
        }
        ThreadUtil.m19098a(new hb(this), 5000 - j);
    }
}
