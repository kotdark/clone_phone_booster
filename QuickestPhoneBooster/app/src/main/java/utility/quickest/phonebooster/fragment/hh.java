package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.ec;
import utility.quickest.phonebooster.p114d.C2444b;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StorageJunkCleanFragment */
class hh implements ec {
    final /* synthetic */ long f13816a;
    final /* synthetic */ hf f13817b;

    hh(hf hfVar, long j) {
        this.f13817b = hfVar;
        this.f13816a = j;
    }

    public void mo3116a(List<C2444b> list) {
        long currentTimeMillis = System.currentTimeMillis() - this.f13816a;
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        this.f13817b.f13814a.f13494l = new ArrayList(list);
        if (currentTimeMillis > 5000) {
            this.f13817b.f13814a.f13483a.m18596a(0, 0);
            this.f13817b.f13814a.mApkJunk.setImageResource(R.drawable.ic_load_finished);
            this.f13817b.f13814a.m17919b(this.f13817b.f13814a.mApkJunk);
            this.f13817b.f13814a.mMemoryJunk.setImageResource(R.drawable.ic_load_loading);
            this.f13817b.f13814a.m17913a(this.f13817b.f13814a.mMemoryJunk);
            return;
        }
        ThreadUtil.m19098a(new hi(this), 5000 - currentTimeMillis);
    }
}
