package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: StorageJunkCleanFragment_ViewBinding */
class hn extends DebouncingOnClickListener {
    final /* synthetic */ StorageJunkCleanFragment f13825b;
    final /* synthetic */ StorageJunkCleanFragment_ViewBinding f13826c;

    hn(StorageJunkCleanFragment_ViewBinding storageJunkCleanFragment_ViewBinding, StorageJunkCleanFragment storageJunkCleanFragment) {
        this.f13826c = storageJunkCleanFragment_ViewBinding;
        this.f13825b = storageJunkCleanFragment;
    }

    public void doClick(View view) {
        this.f13825b.doClean();
    }
}
