package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.gw;
import utility.quickest.phonebooster.model_helper.gy;
import utility.quickest.phonebooster.R;

/* compiled from: StorageJunkCleanFragment */
class gx implements gw {
    final /* synthetic */ StorageJunkCleanFragment f13803a;

    gx(StorageJunkCleanFragment storageJunkCleanFragment) {
        this.f13803a = storageJunkCleanFragment;
    }

    public void mo3111a(gy gyVar, utility.quickest.phonebooster.model_helper.gx gxVar) {
        switch (hl.f13821a[gxVar.ordinal()]) {
            case 1:
                this.f13803a.f13484b.m18597a(this.f13803a.f13488f.m17369c(), 0, 0);
                return;
            case 3:
                this.f13803a.f13484b.m18596a(0, 0);
                this.f13803a.mCacheJunk.setImageResource(R.drawable.ic_load_finished);
                this.f13803a.m17919b(this.f13803a.mCacheJunk);
                this.f13803a.mFileJunk.setImageResource(R.drawable.ic_load_loading);
                this.f13803a.m17913a(this.f13803a.mFileJunk);
                return;
            case 4:
                this.f13803a.mStorageJunkSizeTotalContainer.setVisibility(8);
                return;
            default:
                return;
        }
    }

    public void mo3112a(gy gyVar, String str, int i) {
        this.f13803a.m17916a(str);
    }

    public void mo3113b(gy gyVar, String str, int i) {
    }
}
