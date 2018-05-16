package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.R;

/* compiled from: StorageJunkCleanFragment */
class hi implements Runnable {
    final /* synthetic */ hh f13818a;

    hi(hh hhVar) {
        this.f13818a = hhVar;
    }

    public void run() {
        this.f13818a.f13817b.f13814a.f13483a.m18596a(0, 0);
        this.f13818a.f13817b.f13814a.mApkJunk.setImageResource(R.drawable.ic_load_finished);
        this.f13818a.f13817b.f13814a.m17919b(this.f13818a.f13817b.f13814a.mApkJunk);
        this.f13818a.f13817b.f13814a.mMemoryJunk.setImageResource(R.drawable.ic_load_loading);
        this.f13818a.f13817b.f13814a.m17913a(this.f13818a.f13817b.f13814a.mMemoryJunk);
    }
}
