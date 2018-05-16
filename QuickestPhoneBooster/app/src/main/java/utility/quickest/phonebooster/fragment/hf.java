package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.gw;
import utility.quickest.phonebooster.model_helper.gx;
import utility.quickest.phonebooster.model_helper.gy;
import utility.quickest.phonebooster.R;

/* compiled from: StorageJunkCleanFragment */
class hf implements gw {
    final /* synthetic */ StorageJunkCleanFragment f13814a;

    hf(StorageJunkCleanFragment storageJunkCleanFragment) {
        this.f13814a = storageJunkCleanFragment;
    }

    public void mo3111a(gy gyVar, gx gxVar) {
        switch (hl.f13821a[gxVar.ordinal()]) {
            case 1:
                this.f13814a.f13485c.m18466a(this.f13814a.f13488f.m17370d(), 0, 0, new hg(this));
                this.f13814a.f13486d.m18478a(this.f13814a.f13488f.m17371e(), 0);
                return;
            case 3:
                this.f13814a.mFileJunk.setImageResource(R.drawable.ic_load_finished);
                this.f13814a.m17919b(this.f13814a.mFileJunk);
                this.f13814a.mApkJunk.setImageResource(R.drawable.ic_load_loading);
                this.f13814a.m17913a(this.f13814a.mApkJunk);
                this.f13814a.f13485c.m18465a(new hh(this, System.currentTimeMillis()));
                return;
            case 4:
                this.f13814a.mStorageJunkSizeTotalContainer.setVisibility(8);
                return;
            default:
                return;
        }
    }

    public void mo3112a(gy gyVar, String str, int i) {
        this.f13814a.m17916a(str);
    }

    public void mo3113b(gy gyVar, String str, int i) {
    }
}
