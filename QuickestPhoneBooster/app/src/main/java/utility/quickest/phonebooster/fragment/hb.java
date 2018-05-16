package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.R;

/* compiled from: StorageJunkCleanFragment */
class hb implements Runnable {
    final /* synthetic */ ha f13810a;

    hb(ha haVar) {
        this.f13810a = haVar;
    }

    public void run() {
        this.f13810a.f13809b.f13804a.f13486d.m18481d();
        this.f13810a.f13809b.f13804a.mApkJunk.setImageResource(R.drawable.ic_load_finished);
        this.f13810a.f13809b.f13804a.m17919b(this.f13810a.f13809b.f13804a.mApkJunk);
        this.f13810a.f13809b.f13804a.mMemoryJunk.setImageResource(R.drawable.ic_load_loading);
        this.f13810a.f13809b.f13804a.m17913a(this.f13810a.f13809b.f13804a.mMemoryJunk);
    }
}
