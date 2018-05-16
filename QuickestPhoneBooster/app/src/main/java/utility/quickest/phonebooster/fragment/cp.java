package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LauncherFragmentNew_ViewBinding */
class cp extends DebouncingOnClickListener {
    final /* synthetic */ LauncherFragmentNew f13615b;
    final /* synthetic */ LauncherFragmentNew_ViewBinding f13616c;

    cp(LauncherFragmentNew_ViewBinding launcherFragmentNew_ViewBinding, LauncherFragmentNew launcherFragmentNew) {
        this.f13616c = launcherFragmentNew_ViewBinding;
        this.f13615b = launcherFragmentNew;
    }

    public void doClick(View view) {
        this.f13615b.doOpenMain(view);
    }
}
