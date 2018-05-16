package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class LauncherFragmentNew_ViewBinding<T extends LauncherFragmentNew> implements Unbinder {
    protected T f13292b;
    private View f13293c;
    private View f13294d;
    private View f13295e;

    public LauncherFragmentNew_ViewBinding(T t, View view) {
        this.f13292b = t;
        t.mLauncherIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.launcher_icon, "field 'mLauncherIcon'", ImageView.class);
        View a =  Utils.findRequiredView(view, R.id.launcher_open_now, "field 'mLauncherOpenNow' and method 'doOpenMain'");
        t.mLauncherOpenNow = (TextView)  Utils.castView(a, R.id.launcher_open_now, "field 'mLauncherOpenNow'", TextView.class);
        this.f13293c = a;
        a.setOnClickListener(new cn(this, t));
        t.mLauncherTermPrivacy = (TextView)  Utils.findRequiredViewAsType(view, R.id.launcher_term_privacy, "field 'mLauncherTermPrivacy'", TextView.class);
        t.mLauncherTermPrivacy1 = (TextView)  Utils.findRequiredViewAsType(view, R.id.launcher_term_privacy1, "field 'mLauncherTermPrivacy1'", TextView.class);
        t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_container, "field 'mAdContainer'", ViewGroup.class);
        t.mAdContainerContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_container_container, "field 'mAdContainerContainer'", ViewGroup.class);
        t.mIconContainer = (LinearLayout)  Utils.findRequiredViewAsType(view, R.id.icon_container, "field 'mIconContainer'", LinearLayout.class);
        t.mSkipContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.skip_container, "field 'mSkipContainer'", ViewGroup.class);
        a =  Utils.findRequiredView(view, R.id.skip, "field 'mSkip' and method 'doOpenMain'");
        t.mSkip = (ImageView)  Utils.castView(a, R.id.skip, "field 'mSkip'", ImageView.class);
        this.f13294d = a;
        a.setOnClickListener(new co(this, t));
        a =  Utils.findRequiredView(view, R.id.skip1, "field 'mSkip1' and method 'doOpenMain'");
        t.mSkip1 = (TextView)  Utils.castView(a, R.id.skip1, "field 'mSkip1'", TextView.class);
        this.f13295e = a;
        a.setOnClickListener(new cp(this, t));
        t.mLauncherTermContaier = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.launcher_term_container, "field 'mLauncherTermContaier'", ViewGroup.class);
        t.mHalo = (ImageView)  Utils.findRequiredViewAsType(view, R.id.halo, "field 'mHalo'", ImageView.class);
        t.mLauncherOpenNowContaier = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.launcher_open_now_container, "field 'mLauncherOpenNowContaier'", ViewGroup.class);
    }
}
