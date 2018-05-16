package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: StorageJunkCleanFragment_ViewBinding */
class hm extends DebouncingOnClickListener {
    final /* synthetic */ StorageJunkCleanFragment f13823b;
    final /* synthetic */ StorageJunkCleanFragment_ViewBinding f13824c;

    hm(StorageJunkCleanFragment_ViewBinding storageJunkCleanFragment_ViewBinding, StorageJunkCleanFragment storageJunkCleanFragment) {
        this.f13824c = storageJunkCleanFragment_ViewBinding;
        this.f13823b = storageJunkCleanFragment;
    }

    public void doClick(View view) {
        this.f13823b.doBack();
    }
}
