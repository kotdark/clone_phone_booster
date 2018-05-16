package utility.quickest.phonebooster.fragment;

import android.view.View;

import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MainFragment_ViewBinding */
class ei extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13692b;
    final /* synthetic */ MainFragment_ViewBinding f13693c;

    ei(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13693c = mainFragment_ViewBinding;
        this.f13692b = mainFragment;
    }

    public void doClick(View view) {
        this.f13692b.exitYes();
    }
}
