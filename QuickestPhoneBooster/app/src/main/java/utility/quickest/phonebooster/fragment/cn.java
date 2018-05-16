package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LauncherFragmentNew_ViewBinding */
class cn extends DebouncingOnClickListener {
    final /* synthetic */ LauncherFragmentNew f13611b;
    final /* synthetic */ LauncherFragmentNew_ViewBinding f13612c;

    cn(LauncherFragmentNew_ViewBinding launcherFragmentNew_ViewBinding, LauncherFragmentNew launcherFragmentNew) {
        this.f13612c = launcherFragmentNew_ViewBinding;
        this.f13611b = launcherFragmentNew;
    }

    public void doClick(View view) {
        this.f13611b.doOpenMain(view);
    }
}
