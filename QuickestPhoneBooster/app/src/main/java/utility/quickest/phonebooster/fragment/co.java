package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LauncherFragmentNew_ViewBinding */
class co extends DebouncingOnClickListener {
    final /* synthetic */ LauncherFragmentNew f13613b;
    final /* synthetic */ LauncherFragmentNew_ViewBinding f13614c;

    co(LauncherFragmentNew_ViewBinding launcherFragmentNew_ViewBinding, LauncherFragmentNew launcherFragmentNew) {
        this.f13614c = launcherFragmentNew_ViewBinding;
        this.f13613b = launcherFragmentNew;
    }

    public void doClick(View view) {
        this.f13613b.doOpenMain(view);
    }
}
