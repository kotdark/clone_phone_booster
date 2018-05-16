package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.gw;
import utility.quickest.phonebooster.model_helper.gx;
import utility.quickest.phonebooster.R;

/* compiled from: StorageJunkCleanFragment */
class gy implements gw {
    final /* synthetic */ StorageJunkCleanFragment f13804a;

    gy(StorageJunkCleanFragment storageJunkCleanFragment) {
        this.f13804a = storageJunkCleanFragment;
    }

    public void mo3111a(utility.quickest.phonebooster.model_helper.gy gyVar, gx gxVar) {
        switch (hl.f13821a[gxVar.ordinal()]) {
            case 1:
                this.f13804a.f13485c.m18466a(this.f13804a.f13488f.m17370d(), 0, 0, new gz(this));
                this.f13804a.f13486d.m18478a(this.f13804a.f13488f.m17371e(), 0);
                return;
            case 3:
                this.f13804a.mFileJunk.setImageResource(R.drawable.ic_load_finished);
                this.f13804a.m17919b(this.f13804a.mFileJunk);
                this.f13804a.mApkJunk.setImageResource(R.drawable.ic_load_loading);
                this.f13804a.m17913a(this.f13804a.mApkJunk);
                this.f13804a.f13485c.m18465a(new ha(this, System.currentTimeMillis()));
                return;
            case 4:
                this.f13804a.mStorageJunkSizeTotalContainer.setVisibility(8);
                return;
            default:
                return;
        }
    }

    public void mo3112a(utility.quickest.phonebooster.model_helper.gy gyVar, String str, int i) {
        this.f13804a.m17916a(str);
    }

    public void mo3113b(utility.quickest.phonebooster.model_helper.gy gyVar, String str, int i) {
    }
}
