package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.er;
import utility.quickest.phonebooster.model_helper.es;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hm;
import utility.quickest.phonebooster.R;

/* compiled from: StorageJunkCleanFragment */
class he implements er {
    final /* synthetic */ StorageJunkCleanFragment f13813a;

    he(StorageJunkCleanFragment storageJunkCleanFragment) {
        this.f13813a = storageJunkCleanFragment;
    }

    public void mo3094a(es esVar) {
        switch (hl.f13822b[esVar.ordinal()]) {
            case 1:
                hh.m18628a(hm.JUNK);
                this.f13813a.f13489g = true;
                if (this.f13813a.f13488f.m17373g()) {
                    this.f13813a.m17923e();
                    return;
                }
                return;
            case 3:
                this.f13813a.f13484b.m18596a(0, 0);
                this.f13813a.mCacheJunk.setImageResource(R.drawable.ic_load_finished);
                this.f13813a.m17919b(this.f13813a.mCacheJunk);
                this.f13813a.mFileJunk.setImageResource(R.drawable.ic_load_loading);
                this.f13813a.m17913a(this.f13813a.mFileJunk);
                return;
            case 4:
                this.f13813a.mStorageJunkSizeTotalContainer.setVisibility(8);
                return;
            default:
                return;
        }
    }

    public void mo3095a(String str) {
        this.f13813a.m17916a(str);
    }

    public void mo3096b(String str) {
    }
}
