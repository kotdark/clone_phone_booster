package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AddWhiteListFragment_ViewBinding */
class C2473j extends DebouncingOnClickListener {
    final /* synthetic */ AddWhiteListFragment f13835b;
    final /* synthetic */ AddWhiteListFragment_ViewBinding f13836c;

    C2473j(AddWhiteListFragment_ViewBinding addWhiteListFragment_ViewBinding, AddWhiteListFragment addWhiteListFragment) {
        this.f13836c = addWhiteListFragment_ViewBinding;
        this.f13835b = addWhiteListFragment;
    }

    public void doClick(View view) {
        this.f13835b.doBack();
    }
}
