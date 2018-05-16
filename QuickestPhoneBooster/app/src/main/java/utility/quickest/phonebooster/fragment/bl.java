package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: DocFragment_ViewBinding */
class bl extends DebouncingOnClickListener {
    final /* synthetic */ DocFragment f13563b;
    final /* synthetic */ DocFragment_ViewBinding f13564c;

    bl(DocFragment_ViewBinding docFragment_ViewBinding, DocFragment docFragment) {
        this.f13564c = docFragment_ViewBinding;
        this.f13563b = docFragment;
    }

    public void doClick(View view) {
        this.f13563b.doBack();
    }
}
