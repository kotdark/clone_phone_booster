package utility.quickest.phonebooster.fragment;

import android.util.Pair;
import utility.quickest.phonebooster.util.C2461k;
import utility.quickest.phonebooster.util.C2542m;

/* compiled from: StorageJunkCleanFragment */
class gw implements C2461k {
    final /* synthetic */ StorageJunkCleanFragment f13802a;

    gw(StorageJunkCleanFragment storageJunkCleanFragment) {
        this.f13802a = storageJunkCleanFragment;
    }

    public void mo3091a(Object obj) {
        Pair a = C2542m.m19075a(this.f13802a.f13488f.m17364a());
        this.f13802a.mStorageJunkSize.setText((CharSequence) a.first);
        this.f13802a.mStorageJunkSizeUnit.setText((CharSequence) a.second);
    }
}
